package com.bytedance.android.livesdk.effect;

import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13706a;
    private static float[] h = {0.0f, 0.3f, 0.43f, 0.57f, 0.7f, 0.8f};

    /* renamed from: b  reason: collision with root package name */
    public float f13707b;

    /* renamed from: c  reason: collision with root package name */
    public float f13708c;

    /* renamed from: d  reason: collision with root package name */
    public float f13709d;

    /* renamed from: e  reason: collision with root package name */
    public float f13710e;

    /* renamed from: f  reason: collision with root package name */
    public float f13711f;
    public int g;

    /* access modifiers changed from: package-private */
    public abstract void e(float f2);

    /* access modifiers changed from: package-private */
    public abstract void f(float f2);

    /* access modifiers changed from: package-private */
    public abstract void g(float f2);

    public abstract void h(float f2);

    public abstract void i(float f2);

    public a() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, f13706a, false, 8104, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13706a, false, 8104, new Class[0], Void.TYPE);
            return;
        }
        a();
        this.f13711f = ((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13833e.f13834a * ((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13833e.f13835b;
        this.f13710e = ((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13829a.f13834a * ((Float) b.F.a()).floatValue();
        this.f13707b = ((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13830b.f13834a * ((Float) b.G.a()).floatValue();
        this.f13708c = ((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13831c.f13834a * ((Float) b.H.a()).floatValue();
        this.f13709d = ((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13832d.f13834a * ((Float) b.I.a()).floatValue();
        this.g = ((Integer) b.J.a()).intValue();
        if (com.bytedance.android.live.uikit.a.a.a()) {
            float f3 = 0.0f;
            if (((Integer) b.E.a()).intValue() == 0) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            this.f13710e = f2;
            this.f13711f = this.f13707b != 0.0f ? 0.05f : f3;
        }
    }

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f13706a, true, 8105, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f13706a, true, 8105, new Class[0], Void.TYPE);
            return;
        }
        if (((Float) b.F.a()).floatValue() < 0.0f) {
            b.F.a(Float.valueOf(((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13829a.f13835b));
        }
        if (((Float) b.G.a()).floatValue() < 0.0f) {
            b.G.a(Float.valueOf(((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13830b.f13835b));
        }
        if (((Float) b.H.a()).floatValue() < 0.0f) {
            b.H.a(Float.valueOf(((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13831c.f13835b));
        }
        if (((Float) b.I.a()).floatValue() < 0.0f) {
            b.I.a(Float.valueOf(((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13832d.f13835b));
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f13706a, false, 8107, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f13706a, false, 8107, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (((Float) b.G.a()).floatValue() != f2) {
            b.G.a(Float.valueOf(f2));
            this.f13707b = ((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13830b.f13834a * f2;
        }
        e(this.f13707b);
        if (com.bytedance.android.live.uikit.a.a.a()) {
            d(this.f13710e);
        }
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f13706a, false, 8108, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f13706a, false, 8108, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (((Float) b.H.a()).floatValue() != f2) {
            b.H.a(Float.valueOf(f2));
            this.f13708c = ((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13831c.f13834a * f2;
        }
        f(this.f13708c);
    }

    public final void c(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f13706a, false, 8109, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f13706a, false, 8109, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (((Float) b.I.a()).floatValue() != f2) {
            b.I.a(Float.valueOf(f2));
            this.f13709d = ((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13832d.f13834a * f2;
        }
        g(this.f13709d);
    }

    public final void d(float f2) {
        float f3;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f13706a, false, 8110, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f13706a, false, 8110, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (((Float) b.F.a()).floatValue() != f2) {
            b.F.a(Float.valueOf(f2));
            this.f13710e = ((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13829a.f13834a * f2;
        }
        if (com.bytedance.android.live.uikit.a.a.a()) {
            float f4 = 0.0f;
            if (((Integer) b.E.a()).intValue() == 0) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            this.f13710e = f3;
            if (this.f13707b != 0.0f) {
                f4 = 0.05f;
            }
            this.f13711f = f4;
        }
        i(this.f13710e);
        h(this.f13711f);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f13706a, false, 8111, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f13706a, false, 8111, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (((Integer) b.J.a()).intValue() != i) {
            b.J.a(Integer.valueOf(i));
            this.g = i;
        }
        e(h[i]);
        i(h[1]);
        h(this.f13711f);
    }
}
