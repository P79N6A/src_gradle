package com.bytedance.android.livesdk.gift.d;

import com.bytedance.android.live.uikit.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract /* synthetic */ class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14773a;

    public static f a() {
        if (PatchProxy.isSupport(new Object[0], null, f14773a, true, 10131, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f14773a, true, 10131, new Class[0], f.class);
        }
        if (a.a()) {
            return new a();
        }
        if (a.b()) {
            return new a();
        }
        if (a.c()) {
            return new a();
        }
        if (a.j()) {
            return new a();
        }
        return new c();
    }
}
