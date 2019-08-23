package okhttp3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.RealCall;
import okhttp3.internal.Util;

public final class Dispatcher {
    @Nullable
    private ExecutorService executorService;
    @Nullable
    private Runnable idleCallback;
    private int maxRequests = 64;
    private int maxRequestsPerHost = 5;
    private final Deque<RealCall.AsyncCall> readyAsyncCalls = new ArrayDeque();
    private final Deque<RealCall.AsyncCall> runningAsyncCalls = new ArrayDeque();
    private final Deque<RealCall> runningSyncCalls = new ArrayDeque();

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    public Dispatcher() {
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized ExecutorService executorService() {
        if (this.executorService == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Dispatcher", false));
            this.executorService = threadPoolExecutor;
        }
        return this.executorService;
    }

    public final synchronized List<Call> queuedCalls() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (RealCall.AsyncCall asyncCall : this.readyAsyncCalls) {
            arrayList.add(asyncCall.get());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final synchronized List<Call> runningCalls() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.runningSyncCalls);
        for (RealCall.AsyncCall asyncCall : this.runningAsyncCalls) {
            arrayList.add(asyncCall.get());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private void promoteCalls() {
        if (this.runningAsyncCalls.size() < this.maxRequests && !this.readyAsyncCalls.isEmpty()) {
            Iterator<RealCall.AsyncCall> it2 = this.readyAsyncCalls.iterator();
            while (it2.hasNext()) {
                RealCall.AsyncCall next = it2.next();
                if (runningCallsForHost(next) < this.maxRequestsPerHost) {
                    it2.remove();
                    this.runningAsyncCalls.add(next);
                    executorService().execute(next);
                }
                if (this.runningAsyncCalls.size() >= this.maxRequests) {
                    return;
                }
            }
        }
    }

    public final synchronized void cancelAll() {
        for (RealCall.AsyncCall asyncCall : this.readyAsyncCalls) {
            asyncCall.get().cancel();
        }
        for (RealCall.AsyncCall asyncCall2 : this.runningAsyncCalls) {
            asyncCall2.get().cancel();
        }
        for (RealCall cancel : this.runningSyncCalls) {
            cancel.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public final void finished(RealCall.AsyncCall asyncCall) {
        finished(this.runningAsyncCalls, asyncCall, true);
    }

    public final synchronized void setIdleCallback(@Nullable Runnable runnable) {
        this.idleCallback = runnable;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void executed(RealCall realCall) {
        this.runningSyncCalls.add(realCall);
    }

    /* access modifiers changed from: package-private */
    public final void finished(RealCall realCall) {
        finished(this.runningSyncCalls, realCall, false);
    }

    public Dispatcher(ExecutorService executorService2) {
        this.executorService = executorService2;
    }

    private int runningCallsForHost(RealCall.AsyncCall asyncCall) {
        int i = 0;
        for (RealCall.AsyncCall next : this.runningAsyncCalls) {
            if (!next.get().forWebSocket && next.host().equals(asyncCall.host())) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void enqueue(RealCall.AsyncCall asyncCall) {
        if (this.runningAsyncCalls.size() >= this.maxRequests || runningCallsForHost(asyncCall) >= this.maxRequestsPerHost) {
            this.readyAsyncCalls.add(asyncCall);
            return;
        }
        this.runningAsyncCalls.add(asyncCall);
        executorService().execute(asyncCall);
    }

    public final synchronized void setMaxRequests(int i) {
        if (i > 0) {
            this.maxRequests = i;
            promoteCalls();
        } else {
            throw new IllegalArgumentException("max < 1: " + i);
        }
    }

    public final synchronized void setMaxRequestsPerHost(int i) {
        if (i > 0) {
            this.maxRequestsPerHost = i;
            promoteCalls();
        } else {
            throw new IllegalArgumentException("max < 1: " + i);
        }
    }

    private <T> void finished(Deque<T> deque, T t, boolean z) {
        int runningCallsCount;
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                if (z) {
                    promoteCalls();
                }
                runningCallsCount = runningCallsCount();
                runnable = this.idleCallback;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (runningCallsCount == 0 && runnable != null) {
            runnable.run();
        }
    }
}
