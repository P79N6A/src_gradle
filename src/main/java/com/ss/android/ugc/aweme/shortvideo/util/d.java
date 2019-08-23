package com.ss.android.ugc.aweme.shortvideo.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71127a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f71128b = new d();

    private d() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f71127a, false, 80848, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71127a, false, 80848, new Class[0], Void.TYPE);
            return;
        }
        a.f61121d.f();
    }
}
