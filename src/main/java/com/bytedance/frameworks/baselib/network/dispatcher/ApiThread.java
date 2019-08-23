package com.bytedance.frameworks.baselib.network.dispatcher;

import android.os.Looper;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.baselib.network.dispatcher.IRequest;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ApiThread implements WeakHandler.IHandler, IRequest, Comparable<IRequest>, Runnable {
    protected static RequestQueue sRequestQueue = RequestQueue.getDefaultRequestQueue();
    protected final AtomicBoolean mCanceled = new AtomicBoolean(false);
    private WeakHandler mHandler = new WeakHandler(Looper.getMainLooper(), this);
    private final String mName;
    protected final IRequest.Priority mPriority;
    private int mSequence;
    protected final AtomicBoolean mStarted = new AtomicBoolean(false);

    public boolean isDownload() {
        return false;
    }

    public boolean needTryLocal() {
        return false;
    }

    public void run() {
    }

    public boolean run4Local() {
        return false;
    }

    public WeakHandler getInternalHandler() {
        return this.mHandler;
    }

    public String getName() {
        return this.mName;
    }

    public IRequest.Priority getPriority() {
        return this.mPriority;
    }

    public int getSequence() {
        return this.mSequence;
    }

    public void cancel() {
        this.mCanceled.compareAndSet(false, true);
    }

    public void cancelEnDownloadQueueExpireMsg() {
        this.mHandler.removeMessages(1);
    }

    public void cancelEnQueueExpireMsg() {
        this.mHandler.removeMessages(0);
    }

    public boolean isCanceled() {
        return this.mCanceled.get();
    }

    public void sendEnDownloadQueueExpireMsg() {
        cancelEnDownloadQueueExpireMsg();
        this.mHandler.sendEmptyMessageDelayed(1, 1000);
    }

    public void sendEnQueueExpireMsg() {
        cancelEnQueueExpireMsg();
        this.mHandler.sendEmptyMessageDelayed(0, 1000);
    }

    public final void start() {
        if (this.mStarted.compareAndSet(false, true)) {
            if (sRequestQueue == null) {
                sRequestQueue = RequestQueue.getDefaultRequestQueue();
            }
            if (isDownload()) {
                sRequestQueue.addDownload(this);
                return;
            }
            sRequestQueue.add(this);
        }
    }

    public static void setRequestQueue(RequestQueue requestQueue) {
        sRequestQueue = requestQueue;
    }

    public final ApiThread setSequence(int i) {
        this.mSequence = i;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r1) {
        /*
            r0 = this;
            if (r1 != 0) goto L_0x0003
            return
        L_0x0003:
            int r1 = r1.what     // Catch:{ Throwable -> 0x0016 }
            switch(r1) {
                case 0: goto L_0x000f;
                case 1: goto L_0x0009;
                default: goto L_0x0008;
            }     // Catch:{ Throwable -> 0x0016 }
        L_0x0008:
            goto L_0x0015
        L_0x0009:
            com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue r1 = sRequestQueue     // Catch:{ Throwable -> 0x0016 }
            r1.handleExpandDownloadRequestQueueSize()     // Catch:{ Throwable -> 0x0016 }
            goto L_0x0015
        L_0x000f:
            com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue r1 = sRequestQueue     // Catch:{ Throwable -> 0x0016 }
            r1.handleExpandRequestQueueSize()     // Catch:{ Throwable -> 0x0016 }
            goto L_0x0016
        L_0x0015:
            return
        L_0x0016:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.dispatcher.ApiThread.handleMsg(android.os.Message):void");
    }

    public int compareTo(IRequest iRequest) {
        IRequest.Priority priority = getPriority();
        IRequest.Priority priority2 = iRequest.getPriority();
        if (priority == null) {
            priority = IRequest.Priority.NORMAL;
        }
        if (priority2 == null) {
            priority2 = IRequest.Priority.NORMAL;
        }
        if (priority == priority2) {
            return getSequence() - iRequest.getSequence();
        }
        return priority2.ordinal() - priority.ordinal();
    }

    protected ApiThread(String str, IRequest.Priority priority) {
        this.mPriority = priority;
        this.mName = StringUtils.isEmpty(str) ? getClass().getSimpleName() : str;
    }
}
