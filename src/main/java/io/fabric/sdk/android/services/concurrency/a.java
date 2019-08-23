package io.fabric.sdk.android.services.concurrency;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a<Params, Progress, Result> {

    /* renamed from: a  reason: collision with root package name */
    private static final int f83233a;

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f83234b;

    /* renamed from: c  reason: collision with root package name */
    public static final Executor f83235c = new c((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private static final int f83236f;
    private static final int g = ((f83233a * 2) + 1);
    private static final ThreadFactory h = new ThreadFactory() {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f83239a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AsyncTask #" + this.f83239a.getAndIncrement());
        }
    };
    private static final BlockingQueue<Runnable> i = new LinkedBlockingQueue(SearchJediMixFeedAdapter.f42517f);
    private static final b j = new b();
    private static volatile Executor k = f83235c;

    /* renamed from: d  reason: collision with root package name */
    public volatile d f83237d = d.PENDING;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f83238e = new AtomicBoolean();
    private final e<Params, Result> l = new e<Params, Result>() {
        public final Result call() throws Exception {
            a.this.f83238e.set(true);
            Process.setThreadPriority(10);
            return a.this.d(a.this.a((Params[]) this.f83252b));
        }
    };
    private final FutureTask<Result> m = new FutureTask<Result>(this.l) {
        /* access modifiers changed from: protected */
        public final void done() {
            try {
                a.this.c(get());
            } catch (InterruptedException unused) {
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occured while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused2) {
                a.this.c(null);
            }
        }
    };
    private final AtomicBoolean n = new AtomicBoolean();

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$a  reason: collision with other inner class name */
    static class C0882a<Data> {

        /* renamed from: a  reason: collision with root package name */
        final a f83243a;

        /* renamed from: b  reason: collision with root package name */
        final Data[] f83244b;

        C0882a(a aVar, Data... dataArr) {
            this.f83243a = aVar;
            this.f83244b = dataArr;
        }
    }

    static class b extends Handler {
        public b() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            C0882a aVar = (C0882a) message.obj;
            if (message.what == 1) {
                aVar.f83243a.e(aVar.f83244b[0]);
            }
        }
    }

    static class c implements Executor {

        /* renamed from: a  reason: collision with root package name */
        final LinkedList<Runnable> f83246a;

        /* renamed from: b  reason: collision with root package name */
        Runnable f83247b;

        private c() {
            this.f83246a = new LinkedList<>();
        }

        /* access modifiers changed from: protected */
        public final synchronized void a() {
            Runnable poll = this.f83246a.poll();
            this.f83247b = poll;
            if (poll != null) {
                a.f83234b.execute(this.f83247b);
            }
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        public final synchronized void execute(final Runnable runnable) {
            this.f83246a.offer(new Runnable() {
                public final void run() {
                    try {
                        runnable.run();
                    } finally {
                        c.this.a();
                    }
                }
            });
            if (this.f83247b == null) {
                a();
            }
        }
    }

    public enum d {
        PENDING,
        RUNNING,
        FINISHED
    }

    static abstract class e<Params, Result> implements Callable<Result> {

        /* renamed from: b  reason: collision with root package name */
        Params[] f83252b;

        private e() {
        }

        /* synthetic */ e(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public abstract Result a(Params... paramsArr);

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: protected */
    public void a(Result result) {
    }

    /* access modifiers changed from: protected */
    public void b(Result result) {
    }

    public final boolean b() {
        return this.n.get();
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f83233a = availableProcessors;
        f83236f = availableProcessors + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f83236f, g, 1, TimeUnit.SECONDS, i, h);
        f83234b = threadPoolExecutor;
    }

    public final void c(Result result) {
        if (!this.f83238e.get()) {
            d(result);
        }
    }

    public final boolean a(boolean z) {
        this.n.set(true);
        return this.m.cancel(true);
    }

    public final Result d(Result result) {
        j.obtainMessage(1, new C0882a(this, result)).sendToTarget();
        return result;
    }

    public final void e(Result result) {
        if (b()) {
            b(result);
        } else {
            a(result);
        }
        this.f83237d = d.FINISHED;
    }

    public final a<Params, Progress, Result> a(Executor executor, Params... paramsArr) {
        if (this.f83237d != d.PENDING) {
            switch (this.f83237d) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f83237d = d.RUNNING;
        a();
        this.l.f83252b = paramsArr;
        executor.execute(this.m);
        return this;
    }
}
