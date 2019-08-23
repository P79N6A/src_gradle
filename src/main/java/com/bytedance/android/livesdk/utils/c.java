package com.bytedance.android.livesdk.utils;

import com.bytedance.android.livesdk.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17593a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f17594b = new c();

    private c() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f17593a, false, 13611, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17593a, false, 13611, new Class[0], Void.TYPE);
            return;
        }
        a.a("android.permission.WRITE_EXTERNAL_STORAGE", al.b.CLICK, (String) null, "confirm");
    }
}
