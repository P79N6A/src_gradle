package com.ss.android.ugc.aweme.miniapp.b;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.b.a.c;
import com.ss.android.ugc.aweme.miniapp.b.a.k;
import com.ss.android.ugc.aweme.miniapp.b.a.n;
import com.ss.android.ugc.aweme.miniapp.q;
import com.ss.android.ugc.aweme.miniapp.y;
import com.ss.android.ugc.aweme.miniapp_api.b.a;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.permission.IPermissionsResultAction;
import com.tt.option.ext.ApiHandlerCallback;
import org.json.JSONException;
import org.json.JSONObject;

public final class d extends ApiHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55583a;

    /* renamed from: b  reason: collision with root package name */
    public String f55584b;

    /* renamed from: c  reason: collision with root package name */
    public String f55585c;

    /* renamed from: d  reason: collision with root package name */
    public double f55586d;

    /* renamed from: e  reason: collision with root package name */
    public double f55587e;

    /* renamed from: f  reason: collision with root package name */
    private int f55588f;

    public final String getActionName() {
        return "DMTopenLocation";
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f55583a, false, 59251, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f55583a, false, 59251, new Class[0], String.class);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errMsg", buildErrorMsg("openLocation", "ok"));
            return jSONObject.toString();
        } catch (JSONException unused) {
            return y.a();
        }
    }

    public final void act() {
        if (PatchProxy.isSupport(new Object[0], this, f55583a, false, 59250, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55583a, false, 59250, new Class[0], Void.TYPE);
            return;
        }
        final Activity currentActivity = AppbrandContext.getInst().getCurrentActivity();
        if (currentActivity != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.mArgs);
                this.f55584b = jSONObject.optString("name", "");
                this.f55585c = jSONObject.optString("address", "");
                this.f55586d = jSONObject.optDouble("latitude", 0.0d);
                this.f55587e = jSONObject.optDouble("longitude", 0.0d);
                this.f55588f = jSONObject.optInt("scale", 18);
            } catch (JSONException unused) {
            }
            c.a(currentActivity, c.a.LOCATION, new IPermissionsResultAction() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f55589a;

                public final void onGranted() {
                    if (PatchProxy.isSupport(new Object[0], this, f55589a, false, 59252, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f55589a, false, 59252, new Class[0], Void.TYPE);
                        return;
                    }
                    k.a().a(currentActivity, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, (n) new n() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f55592a;

                        public final void a() {
                            a aVar;
                            if (PatchProxy.isSupport(new Object[0], this, f55592a, false, 59254, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f55592a, false, 59254, new Class[0], Void.TYPE);
                                return;
                            }
                            try {
                                d.this.mApiHandlerCallback.callback(d.this.mCallBackId, d.this.a());
                                a.b bVar = new a.b();
                                bVar.f55988b = d.this.f55584b;
                                bVar.f55989c = d.this.f55585c;
                                bVar.f55992f = d.this.f55586d;
                                bVar.f55991e = d.this.f55587e;
                                if (PatchProxy.isSupport(new Object[0], bVar, a.b.f55987a, false, 59645, new Class[0], a.class)) {
                                    aVar = (a) PatchProxy.accessDispatch(new Object[0], bVar, a.b.f55987a, false, 59645, new Class[0], a.class);
                                } else {
                                    a aVar2 = new a();
                                    aVar2.f55982a = bVar.f55988b;
                                    aVar2.f55984c = bVar.f55990d;
                                    aVar2.f55985d = bVar.f55991e;
                                    aVar2.f55986e = bVar.f55992f;
                                    aVar2.f55983b = bVar.f55989c;
                                    aVar = aVar2;
                                }
                                q.a().h.a(currentActivity, aVar);
                            } catch (Exception e2) {
                                AppBrandLogger.e("tma_ApiOpenLocationCtrl", "", e2);
                            }
                        }

                        public final void a(String str) {
                            if (PatchProxy.isSupport(new Object[]{str}, this, f55592a, false, 59255, new Class[]{String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str}, this, f55592a, false, 59255, new Class[]{String.class}, Void.TYPE);
                                return;
                            }
                            d.this.mApiHandlerCallback.callback(d.this.mCallBackId, c.a(str));
                        }
                    });
                }

                public final void onDenied(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f55589a, false, 59253, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f55589a, false, 59253, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    d.this.mApiHandlerCallback.callback(d.this.mCallBackId, c.a(str));
                }
            });
        }
    }

    public d(String str, int i, ApiHandlerCallback apiHandlerCallback) {
        super(str, i, apiHandlerCallback);
    }
}
