package com.bytedance.android.livesdk.utils;

import com.bytedance.android.livesdk.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17595a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f17596b = new d();

    private d() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f17595a, false, 13612, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17595a, false, 13612, new Class[0], Void.TYPE);
            return;
        }
        a.a("android.permission.CAMERA", al.b.SHOW, (String) null, (String) null);
    }
}
