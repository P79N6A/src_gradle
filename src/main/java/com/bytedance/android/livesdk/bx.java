package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bx implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9663a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f9664b = new bx();

    private bx() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f9663a, false, 2947, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9663a, false, 2947, new Class[0], Void.TYPE);
            return;
        }
        StartLiveFragmentDefault.a("android.permission.ACCESS_FINE_LOCATION", al.b.CLICK, null, "confirm");
    }
}