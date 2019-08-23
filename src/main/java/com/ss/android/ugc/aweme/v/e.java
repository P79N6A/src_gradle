package com.ss.android.ugc.aweme.v;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75994a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f75995b = new e();

    private e() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f75994a, false, 59766, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75994a, false, 59766, new Class[0], Void.TYPE);
            return;
        }
        d.f75990c = true;
    }
}
