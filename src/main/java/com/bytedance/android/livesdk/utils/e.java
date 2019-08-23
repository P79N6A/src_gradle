package com.bytedance.android.livesdk.utils;

import com.bytedance.android.livesdk.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17597a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f17598b = new e();

    private e() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f17597a, false, 13613, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17597a, false, 13613, new Class[0], Void.TYPE);
            return;
        }
        a.a("android.permission.CAMERA", al.b.CLICK, (String) null, "confirm");
    }
}
