package android.support.v4.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.support.annotation.RestrictTo;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
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
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ModernAsyncTask<Params, Progress, Result> {
    public static final Executor THREAD_POOL_EXECUTOR;
    private static volatile Executor sDefaultExecutor;
    private static InternalHandler sHandler;
    private static final BlockingQueue<Runnable> sPoolWorkQueue = new LinkedBlockingQueue(10);
    private static final ThreadFactory sThreadFactory = new ThreadFactory() {
        private final AtomicInteger mCount = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.mCount.getAndIncrement());
        }
    };
    final AtomicBoolean mCancelled = new AtomicBoolean();
    private final FutureTask<Result> mFuture = new FutureTask<Result>(this.mWorker) {
        /* access modifiers changed from: protected */
        public void done() {
            try {
                ModernAsyncTask.this.postResultIfNotInvoked(get());
            } catch (InterruptedException unused) {
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused2) {
                ModernAsyncTask.this.postResultIfNotInvoked(null);
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    };
    private volatile Status mStatus = Status.PENDING;
    final AtomicBoolean mTaskInvoked = new AtomicBoolean();
    private final WorkerRunnable<Params, Result> mWorker = new WorkerRunnable<Params, Result>() {
        public Result call() throws Exception {
            ModernAsyncTask.this.mTaskInvoked.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                Result doInBackground = ModernAsyncTask.this.doInBackground(this.mParams);
                try {
                    Binder.flushPendingCommands();
                    ModernAsyncTask.this.postResult(doInBackground);
                    return doInBackground;
                } catch (Throwable th) {
                    th = th;
                    result = doInBackground;
                    ModernAsyncTask.this.postResult(result);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                ModernAsyncTask.this.mCancelled.set(true);
                throw th;
            }
        }
    };

    static class AsyncTaskResult<Data> {
        final Data[] mData;
        final ModernAsyncTask mTask;

        AsyncTaskResult(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.mTask = modernAsyncTask;
            this.mData = dataArr;
        }
    }

    static class InternalHandler extends Handler {
        InternalHandler() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            AsyncTaskResult asyncTaskResult = (AsyncTaskResult) message.obj;
            switch (message.what) {
                case 1:
                    asyncTaskResult.mTask.finish(asyncTaskResult.mData[0]);
                    return;
                case 2:
                    asyncTaskResult.mTask.onProgressUpdate(asyncTaskResult.mData);
                    break;
            }
        }
    }

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    static abstract class WorkerRunnable<Params, Result> implements Callable<Result> {
        Params[] mParams;

        WorkerRunnable() {
        }
    }

    /* access modifiers changed from: protected */
    public abstract Result doInBackground(Params... paramsArr);

    /* access modifiers changed from: protected */
    public void onCancelled() {
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(Result result) {
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
    }

    /* access modifiers changed from: protected */
    public void onProgressUpdate(Progress... progressArr) {
    }

    public final Status getStatus() {
        return this.mStatus;
    }

    public final Result get() throws InterruptedException, ExecutionException {
        return this.mFuture.get();
    }

    public final boolean isCancelled() {
        return this.mCancelled.get();
    }

    private static Handler getHandler() {
        InternalHandler internalHandler;
        synchronized (ModernAsyncTask.class) {
            if (sHandler == null) {
                sHandler = new InternalHandler();
            }
            internalHandler = sHandler;
        }
        return internalHandler;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, SearchJediMixFeedAdapter.f42517f, 1, TimeUnit.SECONDS, sPoolWorkQueue, sThreadFactory);
        THREAD_POOL_EXECUTOR = threadPoolExecutor;
        sDefaultExecutor = threadPoolExecutor;
    }

    ModernAsyncTask() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void setDefaultExecutor(Executor executor) {
        sDefaultExecutor = executor;
    }

    public static void execute(Runnable runnable) {
        sDefaultExecutor.execute(runnable);
    }

    /* access modifiers changed from: protected */
    public void onCancelled(Result result) {
        onCancelled();
    }

    public final boolean cancel(boolean z) {
        this.mCancelled.set(true);
        return this.mFuture.cancel(z);
    }

    public final ModernAsyncTask<Params, Progress, Result> execute(Params... paramsArr) {
        return executeOnExecutor(sDefaultExecutor, paramsArr);
    }

    /* access modifiers changed from: package-private */
    public void postResultIfNotInvoked(Result result) {
        if (!this.mTaskInvoked.get()) {
            postResult(result);
        }
    }

    /* access modifiers changed from: package-private */
    public void finish(Result result) {
        if (isCancelled()) {
            onCancelled(result);
        } else {
            onPostExecute(result);
        }
        this.mStatus = Status.FINISHED;
    }

    /* access modifiers changed from: package-private */
    public Result postResult(Result result) {
        getHandler().obtainMessage(1, new AsyncTaskResult(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: protected */
    public final void publishProgress(Progress... progressArr) {
        if (!isCancelled()) {
            getHandler().obtainMessage(2, new AsyncTaskResult(this, progressArr)).sendToTarget();
        }
    }

    public final Result get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.mFuture.get(j, timeUnit);
    }

    public final ModernAsyncTask<Params, Progress, Result> executeOnExecutor(Executor executor, Params... paramsArr) {
        if (this.mStatus != Status.PENDING) {
            switch (this.mStatus) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                default:
                    throw new IllegalStateException("We should never reach this state");
            }
        } else {
            this.mStatus = Status.RUNNING;
            onPreExecute();
            this.mWorker.mParams = paramsArr;
            executor.execute(this.mFuture);
            return this;
        }
    }
}