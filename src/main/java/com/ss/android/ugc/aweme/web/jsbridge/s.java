package com.ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.d.f;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.poi.a;
import com.ss.android.ugc.aweme.utils.permission.a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class s implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76830a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakReference<Context> f76831b;

    public final Context a() {
        if (PatchProxy.isSupport(new Object[0], this, f76830a, false, 89979, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], this, f76830a, false, 89979, new Class[0], Context.class);
        } else if (this.f76831b != null) {
            return (Context) this.f76831b.get();
        } else {
            return null;
        }
    }

    public s(WeakReference<Context> weakReference) {
        this.f76831b = weakReference;
    }

    public final void a(JSONObject jSONObject, a aVar) throws Exception {
        JSONObject jSONObject2 = jSONObject;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, aVar2}, this, f76830a, false, 89981, new Class[]{JSONObject.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, aVar2}, this, f76830a, false, 89981, new Class[]{JSONObject.class, a.class}, Void.TYPE);
        } else if (aVar2 == null) {
            jSONObject2.put("code", 0);
            jSONObject2.put("latitude", 0.0d);
            jSONObject2.put("longitude", 0.0d);
        } else {
            jSONObject2.put("code", 1);
            jSONObject2.put("latitude", aVar2.latitude);
            jSONObject2.put("longitude", aVar2.longitude);
        }
    }

    public final void call(h hVar, final JSONObject jSONObject) throws Exception {
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76830a, false, 89980, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76830a, false, 89980, new Class[]{h.class, JSONObject.class}, Void.TYPE);
        } else if (com.ss.android.g.a.a()) {
            a(jSONObject, null);
        } else if (a() == null || !(a() instanceof Activity)) {
            a f2 = af.a((Context) k.a()).f();
            af.a(com.ss.android.ugc.aweme.base.utils.d.a()).d();
            a(jSONObject, f2);
        } else if (!com.ss.android.ugc.aweme.utils.permission.a.a((Context) (Activity) a(), af.f2626c)) {
            com.ss.android.ugc.aweme.utils.permission.a.a((Activity) a(), 65282, af.f2626c, (a.C0792a) new a.C0792a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76832a;

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f76832a, false, 89983, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f76832a, false, 89983, new Class[0], Void.TYPE);
                        return;
                    }
                    try {
                        s.this.a(jSONObject, null);
                    } catch (Exception unused) {
                    }
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f76832a, false, 89982, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f76832a, false, 89982, new Class[0], Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.poi.a a2 = af.a(s.this.a()).a((f) null);
                    af.a(s.this.a()).d();
                    if (a2 != null) {
                        try {
                            s.this.a(jSONObject, a2);
                        } catch (Exception unused) {
                        }
                        return;
                    }
                    jSONObject.put("code", 2);
                    jSONObject.put("latitude", 0);
                    jSONObject.put("longitude", 0);
                }
            });
        } else {
            com.ss.android.ugc.aweme.poi.a a2 = af.a(a()).a((f) null);
            af.a(a()).d();
            a(jSONObject, a2);
        }
    }
}
