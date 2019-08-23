package com.bytedance.android.livesdk.utils;

import com.bytedance.android.livesdk.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17587a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f17588b = new b();

    private b() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f17587a, false, 13610, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17587a, false, 13610, new Class[0], Void.TYPE);
            return;
        }
        a.a("android.permission.WRITE_EXTERNAL_STORAGE", al.b.SHOW, (String) null, (String) null);
    }
}
