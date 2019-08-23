package com.bytedance.android.livesdk.m;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16384a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f16385b = new k();

    private k() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f16384a, false, 12633, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16384a, false, 12633, new Class[0], Void.TYPE);
        }
    }
}
