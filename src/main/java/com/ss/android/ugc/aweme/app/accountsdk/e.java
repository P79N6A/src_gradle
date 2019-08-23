package com.ss.android.ugc.aweme.app.accountsdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.videoview.a;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33724a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f33725b = new e();

    private e() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f33724a, false, 22992, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33724a, false, 22992, new Class[0], Void.TYPE);
        } else if (!o.v()) {
            o.b().h();
        } else {
            a.a().T();
        }
    }
}
