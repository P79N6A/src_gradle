package com.bytedance.frameworks.baselib.network.dispatcher;

import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.frameworks.baselib.network.dispatcher.IRequest;
import com.ss.android.ugc.aweme.net.ag;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.lang.Thread;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class RequestQueue {
    private static volatile boolean sDynamicAdjustThreadPoolSizeOpen = true;
    private static volatile RequestQueue sRequestQueue;
    private static AtomicInteger sSequenceGenerator = new AtomicInteger();
    private a[] mDelayDispatchers;
    private d[] mDelayDownloadDispatchers;
    private final PriorityBlockingQueue<IRequest> mDelayDownloadQueue;
    private final PriorityBlockingQueue<IRequest> mDelayQueue;
    private a[] mDispatchers;
    private d[] mDownloadDispatchers;
    private final PriorityBlockingQueue<IRequest> mDownloadQueue;
    private int mInitDownloadThreadPoolSize;
    private int mInitThreadPoolSize;
    private volatile long mLastExpandDelayDownloadRequestQueueTime;
    private volatile long mLastExpandDelayRequestQueueTime;
    private volatile long mLastExpandDownloadRequestQueueTime;
    private volatile long mLastExpandRequestQueueTime;
    private volatile long mLastShrinkDelayDownloadRequestQueueTime;
    private volatile long mLastShrinkDelayRequestQueueTime;
    private volatile long mLastShrinkDownloadRequestQueueTime;
    private volatile long mLastShrinkRequestQueueTime;
    private b mLocalDispatcher;
    private final PriorityBlockingQueue<IRequest> mLocalQueue;
    private final PriorityBlockingQueue<IRequest> mQueue;
    private volatile boolean mStarted;

    public RequestQueue() {
        this(4, 4);
    }

    public static int getSequenceNumber() {
        return sSequenceGenerator.incrementAndGet();
    }

    public static RequestQueue getDefaultRequestQueue() {
        if (AbTestManager.a().r()) {
            return getDefaultRequestQueue$___twin___();
        }
        return ag.a();
    }

    public static RequestQueue getDefaultRequestQueue$___twin___() {
        if (sRequestQueue == null) {
            synchronized (RequestQueue.class) {
                if (sRequestQueue == null) {
                    sRequestQueue = new RequestQueue();
                }
            }
        }
        return sRequestQueue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void handleExpandDelayDownloadRequestQueueSize() {
        /*
            r9 = this;
            monitor-enter(r9)
            long r1 = r9.mLastExpandDelayDownloadRequestQueueTime     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            com.bytedance.frameworks.baselib.network.dispatcher.d[] r3 = r9.mDelayDownloadDispatchers     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            java.util.concurrent.PriorityBlockingQueue<com.bytedance.frameworks.baselib.network.dispatcher.IRequest> r4 = r9.mDelayDownloadQueue     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            java.lang.String r5 = "DelayDownloadDispatcher-Thread"
            java.lang.String r6 = "DelayDownloadDispatcher"
            int r7 = r9.mInitDownloadThreadPoolSize     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            r8 = 0
            r0 = r9
            long r0 = r0.handleExpandSizeBase(r1, r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            r9.mLastExpandDelayDownloadRequestQueueTime = r0     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            monitor-exit(r9)
            return
        L_0x0017:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x001a:
            monitor-exit(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue.handleExpandDelayDownloadRequestQueueSize():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void handleExpandDelayRequestQueueSize() {
        /*
            r9 = this;
            monitor-enter(r9)
            long r1 = r9.mLastExpandDelayRequestQueueTime     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            com.bytedance.frameworks.baselib.network.dispatcher.a[] r3 = r9.mDelayDispatchers     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            java.util.concurrent.PriorityBlockingQueue<com.bytedance.frameworks.baselib.network.dispatcher.IRequest> r4 = r9.mDelayQueue     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            java.lang.String r5 = "DelayApiDispatcher-Thread"
            java.lang.String r6 = "DelayApiDispatcher"
            int r7 = r9.mInitThreadPoolSize     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            r8 = 0
            r0 = r9
            long r0 = r0.handleExpandSizeBase(r1, r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            r9.mLastExpandDelayRequestQueueTime = r0     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            monitor-exit(r9)
            return
        L_0x0017:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x001a:
            monitor-exit(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue.handleExpandDelayRequestQueueSize():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void handleExpandDownloadRequestQueueSize() {
        /*
            r9 = this;
            monitor-enter(r9)
            long r1 = r9.mLastExpandDownloadRequestQueueTime     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            com.bytedance.frameworks.baselib.network.dispatcher.d[] r3 = r9.mDownloadDispatchers     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            java.util.concurrent.PriorityBlockingQueue<com.bytedance.frameworks.baselib.network.dispatcher.IRequest> r4 = r9.mDownloadQueue     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            java.lang.String r5 = "DownloadDispatcher-Thread"
            java.lang.String r6 = "DownloadDispatcher"
            int r7 = r9.mInitDownloadThreadPoolSize     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            r8 = 1
            r0 = r9
            long r0 = r0.handleExpandSizeBase(r1, r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            r9.mLastExpandDownloadRequestQueueTime = r0     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            monitor-exit(r9)
            return
        L_0x0017:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x001a:
            monitor-exit(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue.handleExpandDownloadRequestQueueSize():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void handleExpandRequestQueueSize() {
        /*
            r9 = this;
            monitor-enter(r9)
            long r1 = r9.mLastExpandRequestQueueTime     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            com.bytedance.frameworks.baselib.network.dispatcher.a[] r3 = r9.mDispatchers     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            java.util.concurrent.PriorityBlockingQueue<com.bytedance.frameworks.baselib.network.dispatcher.IRequest> r4 = r9.mQueue     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            java.lang.String r5 = "ApiDispatcher-Thread"
            java.lang.String r6 = "ApiDispatcher"
            int r7 = r9.mInitThreadPoolSize     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            r8 = 1
            r0 = r9
            long r0 = r0.handleExpandSizeBase(r1, r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            r9.mLastExpandRequestQueueTime = r0     // Catch:{ Throwable -> 0x001a, all -> 0x0017 }
            monitor-exit(r9)
            return
        L_0x0017:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x001a:
            monitor-exit(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue.handleExpandRequestQueueSize():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void handleShrinkDelayDownloadRequestQueueSize() {
        /*
            r6 = this;
            monitor-enter(r6)
            long r1 = r6.mLastShrinkDelayDownloadRequestQueueTime     // Catch:{ Throwable -> 0x0013, all -> 0x0010 }
            com.bytedance.frameworks.baselib.network.dispatcher.d[] r3 = r6.mDelayDownloadDispatchers     // Catch:{ Throwable -> 0x0013, all -> 0x0010 }
            r4 = 0
            r5 = 0
            r0 = r6
            long r0 = r0.handleShrinkSizeBase(r1, r3, r4, r5)     // Catch:{ Throwable -> 0x0013, all -> 0x0010 }
            r6.mLastShrinkDelayDownloadRequestQueueTime = r0     // Catch:{ Throwable -> 0x0013, all -> 0x0010 }
            monitor-exit(r6)
            return
        L_0x0010:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0013:
            monitor-exit(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue.handleShrinkDelayDownloadRequestQueueSize():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void handleShrinkDelayRequestQueueSize() {
        /*
            r6 = this;
            monitor-enter(r6)
            long r1 = r6.mLastShrinkDelayRequestQueueTime     // Catch:{ Throwable -> 0x0013, all -> 0x0010 }
            com.bytedance.frameworks.baselib.network.dispatcher.a[] r3 = r6.mDelayDispatchers     // Catch:{ Throwable -> 0x0013, all -> 0x0010 }
            r4 = 0
            r5 = 0
            r0 = r6
            long r0 = r0.handleShrinkSizeBase(r1, r3, r4, r5)     // Catch:{ Throwable -> 0x0013, all -> 0x0010 }
            r6.mLastShrinkDelayRequestQueueTime = r0     // Catch:{ Throwable -> 0x0013, all -> 0x0010 }
            monitor-exit(r6)
            return
        L_0x0010:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0013:
            monitor-exit(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue.handleShrinkDelayRequestQueueSize():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void handleShrinkDownloadRequestQueueSize() {
        /*
            r6 = this;
            monitor-enter(r6)
            long r1 = r6.mLastShrinkDownloadRequestQueueTime     // Catch:{ Throwable -> 0x0014, all -> 0x0011 }
            com.bytedance.frameworks.baselib.network.dispatcher.d[] r3 = r6.mDownloadDispatchers     // Catch:{ Throwable -> 0x0014, all -> 0x0011 }
            int r4 = r6.mInitDownloadThreadPoolSize     // Catch:{ Throwable -> 0x0014, all -> 0x0011 }
            r5 = 1
            r0 = r6
            long r0 = r0.handleShrinkSizeBase(r1, r3, r4, r5)     // Catch:{ Throwable -> 0x0014, all -> 0x0011 }
            r6.mLastShrinkDownloadRequestQueueTime = r0     // Catch:{ Throwable -> 0x0014, all -> 0x0011 }
            monitor-exit(r6)
            return
        L_0x0011:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0014:
            monitor-exit(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue.handleShrinkDownloadRequestQueueSize():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void handleShrinkRequestQueueSize() {
        /*
            r6 = this;
            monitor-enter(r6)
            long r1 = r6.mLastShrinkRequestQueueTime     // Catch:{ Throwable -> 0x0014, all -> 0x0011 }
            com.bytedance.frameworks.baselib.network.dispatcher.a[] r3 = r6.mDispatchers     // Catch:{ Throwable -> 0x0014, all -> 0x0011 }
            int r4 = r6.mInitThreadPoolSize     // Catch:{ Throwable -> 0x0014, all -> 0x0011 }
            r5 = 1
            r0 = r6
            long r0 = r0.handleShrinkSizeBase(r1, r3, r4, r5)     // Catch:{ Throwable -> 0x0014, all -> 0x0011 }
            r6.mLastShrinkRequestQueueTime = r0     // Catch:{ Throwable -> 0x0014, all -> 0x0011 }
            monitor-exit(r6)
            return
        L_0x0011:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0014:
            monitor-exit(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue.handleShrinkRequestQueueSize():void");
    }

    public synchronized void start() {
        stop();
        this.mLocalDispatcher = new b(this.mLocalQueue, this.mQueue);
        this.mLocalDispatcher.start();
        for (int i = 0; i < this.mInitThreadPoolSize; i++) {
            a aVar = new a(this.mQueue, "ApiDispatcher-Thread", "ApiDispatcher");
            this.mDispatchers[i] = aVar;
            aVar.start();
        }
        for (int i2 = 0; i2 < this.mInitDownloadThreadPoolSize; i2++) {
            d dVar = new d(this.mDownloadQueue, "DownloadDispatcher-Thread", "DownloadDispatcher");
            this.mDownloadDispatchers[i2] = dVar;
            dVar.start();
        }
        this.mStarted = true;
    }

    public synchronized void stop() {
        this.mStarted = false;
        if (this.mLocalDispatcher != null) {
            b bVar = this.mLocalDispatcher;
            bVar.f19726a = true;
            bVar.interrupt();
        }
        for (int i = 0; i < this.mDispatchers.length; i++) {
            if (this.mDispatchers[i] != null) {
                this.mDispatchers[i].a();
                this.mDispatchers[i] = null;
            }
        }
        for (int i2 = 0; i2 < this.mDownloadDispatchers.length; i2++) {
            if (this.mDownloadDispatchers[i2] != null) {
                this.mDownloadDispatchers[i2].a();
                this.mDownloadDispatchers[i2] = null;
            }
        }
        for (int i3 = 0; i3 < this.mDelayDispatchers.length; i3++) {
            if (this.mDelayDispatchers[i3] != null) {
                this.mDelayDispatchers[i3].a();
                this.mDelayDispatchers[i3] = null;
            }
        }
        for (int i4 = 0; i4 < this.mDelayDownloadDispatchers.length; i4++) {
            if (this.mDelayDownloadDispatchers[i4] != null) {
                this.mDelayDownloadDispatchers[i4].a();
                this.mDelayDownloadDispatchers[i4] = null;
            }
        }
    }

    public static void setDynamicAdjustThreadPoolSizeOpen(boolean z) {
        sDynamicAdjustThreadPoolSizeOpen = z;
    }

    public synchronized void addDownload(ApiThread apiThread) {
        if (apiThread != null) {
            apiThread.setSequence(getSequenceNumber());
            if (!this.mStarted) {
                start();
            }
            if (apiThread.getPriority() == IRequest.Priority.IMMEDIATE) {
                ThreadPlus.submitRunnable(apiThread);
                return;
            }
            apiThread.sendEnDownloadQueueExpireMsg();
            if (apiThread instanceof c) {
                this.mDelayDownloadQueue.add(apiThread);
            } else {
                this.mDownloadQueue.add(apiThread);
            }
        }
    }

    public synchronized void add(ApiThread apiThread) {
        if (apiThread != null) {
            apiThread.setSequence(getSequenceNumber());
            if (!this.mStarted) {
                start();
            }
            if (apiThread.needTryLocal()) {
                this.mLocalQueue.add(apiThread);
            } else if (apiThread.getPriority() == IRequest.Priority.IMMEDIATE) {
                ThreadPlus.submitRunnable(apiThread);
            } else {
                apiThread.sendEnQueueExpireMsg();
                if (apiThread instanceof c) {
                    this.mDelayQueue.add(apiThread);
                } else {
                    this.mQueue.add(apiThread);
                }
            }
        }
    }

    public RequestQueue(int i, int i2) {
        this.mLocalQueue = new PriorityBlockingQueue<>();
        this.mQueue = new PriorityBlockingQueue<>();
        this.mDownloadQueue = new PriorityBlockingQueue<>();
        this.mDelayQueue = new PriorityBlockingQueue<>();
        this.mDelayDownloadQueue = new PriorityBlockingQueue<>();
        this.mLastExpandRequestQueueTime = 0;
        this.mLastExpandDownloadRequestQueueTime = 0;
        this.mLastExpandDelayRequestQueueTime = 0;
        this.mLastExpandDelayDownloadRequestQueueTime = 0;
        this.mLastShrinkRequestQueueTime = 0;
        this.mLastShrinkDownloadRequestQueueTime = 0;
        this.mLastShrinkDelayRequestQueueTime = 0;
        this.mLastShrinkDelayDownloadRequestQueueTime = 0;
        this.mInitThreadPoolSize = i;
        this.mInitDownloadThreadPoolSize = i2;
        int i3 = i * 4;
        this.mDispatchers = new a[i3];
        int i4 = i2 * 4;
        this.mDownloadDispatchers = new d[i4];
        this.mDelayDispatchers = new a[i3];
        this.mDelayDownloadDispatchers = new d[i4];
    }

    private long handleShrinkSizeBase(long j, a[] aVarArr, int i, boolean z) {
        if (z && !sDynamicAdjustThreadPoolSizeOpen) {
            return j;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (j > currentTimeMillis) {
            j = currentTimeMillis;
        }
        if (currentTimeMillis - j <= 2000) {
            return j;
        }
        boolean z2 = true;
        boolean z3 = true;
        for (int length = aVarArr.length - 1; length >= i; length--) {
            a aVar = aVarArr[length];
            if (aVar != null && aVar.b()) {
                z2 = false;
            }
            if (aVar != null) {
                z3 = false;
            }
        }
        if (!z2 || z3) {
            return currentTimeMillis;
        }
        for (int length2 = aVarArr.length - 1; length2 >= i; length2--) {
            try {
                a aVar2 = aVarArr[length2];
                if (!(aVar2 == null || aVar2.getState() == Thread.State.RUNNABLE || aVar2.b())) {
                    aVar2.a();
                    aVarArr[length2] = null;
                }
            } catch (Throwable unused) {
            }
        }
        return currentTimeMillis;
    }

    private long handleExpandSizeBase(long j, a[] aVarArr, PriorityBlockingQueue<IRequest> priorityBlockingQueue, String str, String str2, int i, boolean z) {
        a aVar;
        if (z && !sDynamicAdjustThreadPoolSizeOpen) {
            return j;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (j > currentTimeMillis) {
            j = currentTimeMillis;
        }
        if (currentTimeMillis - j <= 1000) {
            return j;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            if (aVarArr[i3] == null) {
                i2++;
                if (i2 > i) {
                    break;
                }
                if (aVarArr instanceof d[]) {
                    aVar = new d(priorityBlockingQueue, str, str2);
                } else if (!(aVarArr instanceof a[])) {
                    return currentTimeMillis;
                } else {
                    aVar = new a(priorityBlockingQueue, str, str2);
                }
                aVarArr[i3] = aVar;
                aVar.start();
            }
        }
        return currentTimeMillis;
    }
}
