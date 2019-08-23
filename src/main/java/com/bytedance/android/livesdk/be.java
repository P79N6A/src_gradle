package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.j.g;
import com.bytedance.android.livesdk.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class be implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9134a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f9135b = new be();

    private be() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f9134a, false, 2853, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9134a, false, 2853, new Class[0], Void.TYPE);
            return;
        }
        g.a("android.permission.ACCESS_FINE_LOCATION", al.b.CLICK, null, "confirm");
    }
}
