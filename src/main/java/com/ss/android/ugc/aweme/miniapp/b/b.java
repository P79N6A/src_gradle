package com.ss.android.ugc.aweme.miniapp.b;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.b.a.c;
import com.ss.android.ugc.aweme.miniapp.b.a.k;
import com.ss.android.ugc.aweme.miniapp.b.a.n;
import com.ss.android.ugc.aweme.miniapp.q;
import com.ss.android.ugc.aweme.miniapp_api.b.a;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.permission.IPermissionsResultAction;
import com.tt.option.ext.ApiHandlerCallback;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends ApiHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55567a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f55568b;

    /* renamed from: c  reason: collision with root package name */
    public int f55569c;

    public final String getActionName() {
        return "getLocation";
    }

    public final void act() {
        if (PatchProxy.isSupport(new Object[0], this, f55567a, false, 59240, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55567a, false, 59240, new Class[0], Void.TYPE);
            return;
        }
        final String str = null;
        try {
            str = new JSONObject(this.mArgs).optString("type");
        } catch (JSONException unused) {
        }
        final Activity currentActivity = AppbrandContext.getInst().getCurrentActivity();
        c.a(currentActivity, c.a.LOCATION, new IPermissionsResultAction() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55570a;

            public final void onGranted() {
                if (PatchProxy.isSupport(new Object[0], this, f55570a, false, 59242, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f55570a, false, 59242, new Class[0], Void.TYPE);
                    return;
                }
                k.a().a(currentActivity, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, (n) new n() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f55574a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f55574a, false, 59244, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f55574a, false, 59244, new Class[0], Void.TYPE);
                            return;
                        }
                        if (AppBrandLogger.debug()) {
                            AppBrandLogger.d("ApiGetLocationCtrl", "onGranted");
                        }
                        final com.ss.android.ugc.aweme.miniapp_api.a.c cVar = q.a().h;
                        if (TextUtils.isEmpty(str) || !TextUtils.equals(str.toLowerCase(), "gcj02")) {
                            final Timer timer = new Timer();
                            timer.schedule(new TimerTask() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f55576a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f55576a, false, 59246, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f55576a, false, 59246, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    b.this.f55569c++;
                                    JSONObject b2 = cVar.b(currentActivity);
                                    if (b2 == null) {
                                        b2 = cVar.c(currentActivity);
                                    } else {
                                        cVar.a(b2, currentActivity, a.C0643a.GPS);
                                    }
                                    if (b2 != null && !b.this.f55568b) {
                                        b.this.mApiHandlerCallback.callback(b.this.mCallBackId, b.this.a(b2));
                                        b.this.f55568b = true;
                                    }
                                    if (b.this.f55568b) {
                                        timer.cancel();
                                        return;
                                    }
                                    if (b.this.f55569c > 10) {
                                        b.this.mApiHandlerCallback.callback(b.this.mCallBackId, b.this.a(b2));
                                        timer.cancel();
                                    }
                                }
                            }, 0, 200);
                            return;
                        }
                        JSONObject b2 = cVar.b(currentActivity);
                        if (b2 == null) {
                            b2 = cVar.c(currentActivity);
                            if (b2 != null) {
                                cVar.a(b2, currentActivity, a.C0643a.BAIDU);
                            }
                        }
                        b.this.mApiHandlerCallback.callback(b.this.mCallBackId, b.this.a(b2));
                    }

                    public final void a(String str) {
                        if (PatchProxy.isSupport(new Object[]{str}, this, f55574a, false, 59245, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, this, f55574a, false, 59245, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        if (AppBrandLogger.debug()) {
                            AppBrandLogger.d("ApiGetLocationCtrl", "onDenied");
                        }
                        b.this.mApiHandlerCallback.callback(b.this.mCallBackId, b.this.a(null));
                    }
                });
            }

            public final void onDenied(String str) {
                if (PatchProxy.isSupport(new Object[]{str}, this, f55570a, false, 59243, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f55570a, false, 59243, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                if (AppBrandLogger.debug()) {
                    AppBrandLogger.d("ApiGetLocationCtrl", "onDenied");
                }
                b.this.mApiHandlerCallback.callback(b.this.mCallBackId, b.this.a(null));
            }
        });
    }

    public final String a(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f55567a, false, 59241, new Class[]{JSONObject.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f55567a, false, 59241, new Class[]{JSONObject.class}, String.class);
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            String str = "";
            if (jSONObject != null) {
                str = jSONObject.toString();
            }
            if (TextUtils.isEmpty(str)) {
                jSONObject2.put("errMsg", buildErrorMsg("getLocation", "fail"));
            } else {
                jSONObject2.put("errMsg", buildErrorMsg("getLocation", "ok"));
                JSONObject jSONObject3 = new JSONObject(str);
                Double valueOf = Double.valueOf(jSONObject3.optDouble("longitude"));
                Double valueOf2 = Double.valueOf(jSONObject3.optDouble("latitude"));
                jSONObject2.put("longitude", valueOf);
                jSONObject2.put("latitude", valueOf2);
            }
            return jSONObject2.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public b(String str, int i, ApiHandlerCallback apiHandlerCallback) {
        super(str, i, apiHandlerCallback);
    }
}
