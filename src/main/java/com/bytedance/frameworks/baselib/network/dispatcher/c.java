package com.bytedance.frameworks.baselib.network.dispatcher;

import com.bytedance.frameworks.baselib.network.dispatcher.IRequest;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public class c extends ApiThread {

    /* renamed from: a  reason: collision with root package name */
    public int f19729a;

    public void cancelEnDownloadQueueExpireMsg() {
        if (AbTestManager.a().r()) {
            getInternalHandler().removeMessages(3);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(".cancelEnDownloadQueueExpireMsg()");
    }

    public void cancelEnQueueExpireMsg() {
        if (AbTestManager.a().r()) {
            getInternalHandler().removeMessages(2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(".cancelEnQueueExpireMsg()");
    }

    public void sendEnDownloadQueueExpireMsg() {
        if (AbTestManager.a().r()) {
            cancelEnDownloadQueueExpireMsg();
            getInternalHandler().sendEmptyMessageDelayed(3, 1000);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(".sendEnDownloadQueueExpireMsg()");
    }

    public void sendEnQueueExpireMsg() {
        if (AbTestManager.a().r()) {
            cancelEnQueueExpireMsg();
            getInternalHandler().sendEmptyMessageDelayed(2, 1000);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(".sendEnQueueExpireMsg()");
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
                case 2: goto L_0x000f;
                case 3: goto L_0x0009;
                default: goto L_0x0008;
            }     // Catch:{ Throwable -> 0x0016 }
        L_0x0008:
            goto L_0x0015
        L_0x0009:
            com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue r1 = sRequestQueue     // Catch:{ Throwable -> 0x0016 }
            r1.handleExpandDelayDownloadRequestQueueSize()     // Catch:{ Throwable -> 0x0016 }
            goto L_0x0015
        L_0x000f:
            com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue r1 = sRequestQueue     // Catch:{ Throwable -> 0x0016 }
            r1.handleExpandDelayRequestQueueSize()     // Catch:{ Throwable -> 0x0016 }
            goto L_0x0016
        L_0x0015:
            return
        L_0x0016:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.dispatcher.c.handleMsg(android.os.Message):void");
    }

    public c(String str, IRequest.Priority priority, int i) {
        super(str, priority);
        this.f19729a = i;
    }
}
