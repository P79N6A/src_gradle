package com.ss.android.ugc.aweme.zhima;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.model.AwemeSettings;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76955a;

    /* renamed from: b  reason: collision with root package name */
    private static c f76956b;

    /* renamed from: c  reason: collision with root package name */
    private int f76957c;

    /* renamed from: d  reason: collision with root package name */
    private int f76958d;

    private c() {
    }

    public final boolean b() {
        if (this.f76957c == 1) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f76958d == 1) {
            return true;
        }
        return false;
    }

    public static c a() {
        if (PatchProxy.isSupport(new Object[0], null, f76955a, true, 90167, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f76955a, true, 90167, new Class[0], c.class);
        }
        if (f76956b == null) {
            synchronized (c.class) {
                if (f76956b == null) {
                    f76956b = new c();
                }
            }
        }
        return f76956b;
    }

    public final void a(AwemeSettings awemeSettings) {
        this.f76957c = awemeSettings.liveUserZhima;
        this.f76958d = awemeSettings.commerceUserZhima;
    }
}
