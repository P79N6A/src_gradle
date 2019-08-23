package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.d.f;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.poi.a;
import com.ss.android.ugc.aweme.utils.permission.a;
import org.json.JSONObject;

public class GetLocationMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44446a;

    public final Context a() {
        if (PatchProxy.isSupport(new Object[0], this, f44446a, false, 39749, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], this, f44446a, false, 39749, new Class[0], Context.class);
        } else if (this.f3123e != null) {
            return (Context) this.f3123e.get();
        } else {
            return null;
        }
    }

    public final void a(BaseCommonJavaMethod.a aVar, a aVar2) throws Exception {
        BaseCommonJavaMethod.a aVar3 = aVar;
        a aVar4 = aVar2;
        if (PatchProxy.isSupport(new Object[]{aVar3, aVar4}, this, f44446a, false, 39751, new Class[]{BaseCommonJavaMethod.a.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar3, aVar4}, this, f44446a, false, 39751, new Class[]{BaseCommonJavaMethod.a.class, a.class}, Void.TYPE);
        } else if (aVar3 != null) {
            if (aVar4 == null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 0);
                jSONObject.put("latitude", 0);
                jSONObject.put("longitude", 0);
                aVar3.a((Object) jSONObject);
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            jSONObject2.put("latitude", aVar4.latitude);
            jSONObject2.put("longitude", aVar4.longitude);
            aVar3.a((Object) jSONObject2);
        }
    }

    public final void a(JSONObject jSONObject, final BaseCommonJavaMethod.a aVar) {
        if (PatchProxy.isSupport(new Object[]{jSONObject, aVar}, this, f44446a, false, 39750, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, aVar}, this, f44446a, false, 39750, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
        } else if (com.ss.android.g.a.a()) {
            aVar.a(-1, "");
        } else {
            try {
                if (a() == null || !(a() instanceof Activity)) {
                    a f2 = af.a((Context) k.a()).f();
                    af.a(d.a()).d();
                    a(aVar, f2);
                } else if (!com.ss.android.ugc.aweme.utils.permission.a.a((Context) (Activity) a(), af.f2626c)) {
                    com.ss.android.ugc.aweme.utils.permission.a.a((Activity) a(), 65282, af.f2626c, (a.C0792a) new a.C0792a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f44447a;

                        public final void b() {
                            if (PatchProxy.isSupport(new Object[0], this, f44447a, false, 39753, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f44447a, false, 39753, new Class[0], Void.TYPE);
                                return;
                            }
                            try {
                                GetLocationMethod.this.a(aVar, (com.ss.android.ugc.aweme.poi.a) null);
                            } catch (Exception unused) {
                            }
                        }

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f44447a, false, 39752, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f44447a, false, 39752, new Class[0], Void.TYPE);
                                return;
                            }
                            com.ss.android.ugc.aweme.poi.a a2 = af.a(GetLocationMethod.this.a()).a((f) null);
                            af.a(GetLocationMethod.this.a()).d();
                            if (a2 != null) {
                                try {
                                    GetLocationMethod.this.a(aVar, a2);
                                } catch (Exception unused) {
                                }
                                return;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", 2);
                            jSONObject.put("latitude", 0);
                            jSONObject.put("longitude", 0);
                            aVar.a((Object) jSONObject);
                        }
                    });
                } else {
                    com.ss.android.ugc.aweme.poi.a a2 = af.a(a()).a((f) null);
                    af.a(a()).d();
                    a(aVar, a2);
                }
            } catch (Exception unused) {
            }
        }
    }
}
