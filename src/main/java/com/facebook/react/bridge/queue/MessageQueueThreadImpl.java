package com.facebook.react.bridge.queue;

import android.os.Looper;
import android.os.Process;
import com.facebook.common.logging.FLog;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.futures.SimpleSettableFuture;
import com.lynx.base.JavaHandlerThread;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@DoNotStrip
public class MessageQueueThreadImpl implements MessageQueueThread {
    private final String mAssertionErrorMessage = ("Expected to be called from the '" + getName() + "' thread!");
    private final MessageQueueThreadHandler mHandler;
    private volatile boolean mIsFinished;
    private final Looper mLooper;
    private final String mName;

    public Looper getLooper() {
        return this.mLooper;
    }

    public String getName() {
        return this.mName;
    }

    @DoNotStrip
    public void assertIsOnThread() {
        SoftAssertions.assertCondition(isOnThread(), this.mAssertionErrorMessage);
    }

    @DoNotStrip
    public boolean isOnThread() {
        if (this.mLooper.getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    @DoNotStrip
    public void quitSynchronous() {
        this.mIsFinished = true;
        this.mLooper.quit();
        if (this.mLooper.getThread() != Thread.currentThread()) {
            try {
                this.mLooper.getThread().join();
            } catch (InterruptedException unused) {
                throw new RuntimeException("Got interrupted waiting to join thread " + this.mName);
            }
        }
    }

    @DoNotStrip
    public <T> Future<T> callOnQueue(final Callable<T> callable) {
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        runOnQueue(new Runnable() {
            public void run() {
                try {
                    simpleSettableFuture.set(callable.call());
                } catch (Exception e2) {
                    simpleSettableFuture.setException(e2);
                }
            }
        });
        return simpleSettableFuture;
    }

    @DoNotStrip
    public void assertIsOnThread(String str) {
        boolean isOnThread = isOnThread();
        SoftAssertions.assertCondition(isOnThread, this.mAssertionErrorMessage + " " + str);
    }

    @DoNotStrip
    public void runOnQueue(Runnable runnable) {
        if (this.mIsFinished) {
            FLog.w("ReactNative", "Tried to enqueue runnable on already finished thread: '" + getName() + "... dropping Runnable.");
        }
        this.mHandler.post(runnable);
    }

    private static MessageQueueThreadImpl createForMainThread(String str, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        MessageQueueThreadImpl messageQueueThreadImpl = new MessageQueueThreadImpl(str, Looper.getMainLooper(), queueThreadExceptionHandler);
        if (UiThreadUtil.isOnUiThread()) {
            Process.setThreadPriority(-4);
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() {
                public final void run() {
                    Process.setThreadPriority(-4);
                }
            });
        }
        return messageQueueThreadImpl;
    }

    public static MessageQueueThreadImpl create(MessageQueueThreadSpec messageQueueThreadSpec, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        switch (messageQueueThreadSpec.getThreadType()) {
            case MAIN_UI:
                return createForMainThread(messageQueueThreadSpec.getName(), queueThreadExceptionHandler);
            case NEW_BACKGROUND:
                return startNewBackgroundThread(messageQueueThreadSpec.getName(), messageQueueThreadSpec.getStackSize(), queueThreadExceptionHandler);
            case LAYOUT:
                return startLayoutThread(messageQueueThreadSpec.getName(), messageQueueThreadSpec.getStackSize(), queueThreadExceptionHandler);
            default:
                throw new RuntimeException("Unknown thread type: " + messageQueueThreadSpec.getThreadType());
        }
    }

    private static MessageQueueThreadImpl startLayoutThread(String str, long j, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        JavaHandlerThread create = JavaHandlerThread.create("mqt_" + str);
        create.maybeStart();
        return new MessageQueueThreadImpl(str, create.getLooper(), queueThreadExceptionHandler);
    }

    private MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        this.mName = str;
        this.mLooper = looper;
        this.mHandler = new MessageQueueThreadHandler(looper, queueThreadExceptionHandler);
    }

    private static MessageQueueThreadImpl startNewBackgroundThread(String str, long j, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        AnonymousClass3 r3 = new Runnable() {
            public final void run() {
                Process.setThreadPriority(-4);
                Looper.prepare();
                simpleSettableFuture.set(Looper.myLooper());
                Looper.loop();
            }
        };
        Thread thread = new Thread(null, r3, "mqt_" + str, j);
        thread.start();
        return new MessageQueueThreadImpl(str, (Looper) simpleSettableFuture.getOrThrow(), queueThreadExceptionHandler);
    }
}
