package com.ss.android.ugc.aweme.shortvideo.upload;

import android.os.Handler;
import android.os.HandlerThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71021a;

    /* renamed from: b  reason: collision with root package name */
    public HandlerThread f71022b = new HandlerThread("PublishCommandExecutor");

    /* renamed from: c  reason: collision with root package name */
    private Handler f71023c;

    public l() {
        this.f71022b.start();
        this.f71023c = new Handler(this.f71022b.getLooper());
    }

    public final void a(i iVar) throws InterruptedException {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f71021a, false, 80785, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, f71021a, false, 80785, new Class[]{i.class}, Void.TYPE);
        } else if (this.f71022b.isAlive()) {
            this.f71023c.post(new m(iVar));
        } else {
            throw new InterruptedException("PublishCommandExecutor has quit");
        }
    }
}
