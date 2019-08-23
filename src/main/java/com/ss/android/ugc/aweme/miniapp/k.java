package com.ss.android.ugc.aweme.miniapp;

import android.app.Application;
import com.bytedance.common.utility.reflect.Reflect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55808a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f55809b = "k";

    static void a(Application application) {
        if (PatchProxy.isSupport(new Object[]{application}, null, f55808a, true, 59029, new Class[]{Application.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application}, null, f55808a, true, 59029, new Class[]{Application.class}, Void.TYPE);
            return;
        }
        try {
            Class<?> cls = Class.forName("com.bytedance.leakdetector.LeakDetectorInstaller");
            Reflect.on(Reflect.on(cls).get("INSTANCE", cls)).call("install", new Class[]{Application.class}, application);
        } catch (Throwable unused) {
        }
    }
}
