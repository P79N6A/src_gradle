package com.ss.android.ugc.aweme.net;

import android.os.Message;
import com.bytedance.frameworks.baselib.network.dispatcher.IRequest;
import com.bytedance.frameworks.baselib.network.dispatcher.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public class a extends c {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f56815b;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f56816c;

    public void handleMsg(Message message) {
    }

    public void run() {
        if (PatchProxy.isSupport(new Object[0], this, f56815b, false, 60656, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56815b, false, 60656, new Class[0], Void.TYPE);
            return;
        }
        super.run();
        if (this.f56816c != null && !isCanceled()) {
            this.f56816c.run();
        }
    }

    public void cancelEnDownloadQueueExpireMsg() {
        if (PatchProxy.isSupport(new Object[0], this, f56815b, false, 60660, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56815b, false, 60660, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, b.f56914a, true, 60664, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, b.f56914a, true, 60664, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (!AbTestManager.a().r()) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(".cancelEnDownloadQueueExpireMsg()");
        }
    }

    public void cancelEnQueueExpireMsg() {
        if (PatchProxy.isSupport(new Object[0], this, f56815b, false, 60658, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56815b, false, 60658, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, b.f56914a, true, 60662, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, b.f56914a, true, 60662, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (!AbTestManager.a().r()) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(".cancelEnQueueExpireMsg()");
        }
    }

    public void sendEnDownloadQueueExpireMsg() {
        if (PatchProxy.isSupport(new Object[0], this, f56815b, false, 60659, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56815b, false, 60659, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, b.f56914a, true, 60663, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, b.f56914a, true, 60663, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (!AbTestManager.a().r()) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(".sendEnDownloadQueueExpireMsg()");
        }
    }

    public void sendEnQueueExpireMsg() {
        if (PatchProxy.isSupport(new Object[0], this, f56815b, false, 60657, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56815b, false, 60657, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, b.f56914a, true, 60661, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, b.f56914a, true, 60661, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (!AbTestManager.a().r()) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(".sendEnQueueExpireMsg()");
        }
    }

    public a(String str, IRequest.Priority priority, int i, Runnable runnable) {
        super(str, priority, i);
        this.f56816c = runnable;
    }
}
