package com.bytedance.android.livesdk.app.dataholder;

import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class d extends a<Boolean> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f9050d;
    private static d k;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9051e;

    /* renamed from: f  reason: collision with root package name */
    public int f9052f;
    @IgnoreStyleCheck
    public String g;
    @IgnoreStyleCheck
    public int h;
    @IgnoreStyleCheck
    public int i;
    @IgnoreStyleCheck
    public f j = new f();

    private d() {
        this.f9041c = Boolean.FALSE;
    }

    public static d a() {
        if (PatchProxy.isSupport(new Object[0], null, f9050d, true, 3165, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f9050d, true, 3165, new Class[0], d.class);
        }
        if (k == null) {
            k = new d();
        }
        return k;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f9050d, false, 3167, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9050d, false, 3167, new Class[0], Void.TYPE);
            return;
        }
        this.f9041c = Boolean.FALSE;
        this.f9051e = false;
        this.g = null;
        this.h = 0;
        this.i = 0;
    }

    public final void a(Boolean bool) {
        if (PatchProxy.isSupport(new Object[]{bool}, this, f9050d, false, 3166, new Class[]{Boolean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bool}, this, f9050d, false, 3166, new Class[]{Boolean.class}, Void.TYPE);
            return;
        }
        super.a(bool);
        if (bool != null && bool.booleanValue()) {
            this.f9051e = true;
        }
    }
}
