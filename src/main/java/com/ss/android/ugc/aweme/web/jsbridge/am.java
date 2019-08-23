package com.ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.base.b.a.e;
import com.ss.android.ugc.aweme.base.e.c;
import com.ss.android.ugc.aweme.crossplatform.business.k;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.cw;
import com.ss.android.ugc.aweme.verify.api.ZhimaVerifyApi;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONException;
import org.json.JSONObject;

public class am implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4312a;

    /* renamed from: b  reason: collision with root package name */
    WeakReference<Context> f4313b;

    /* renamed from: c  reason: collision with root package name */
    a f4314c;

    @Subscribe
    public void onVerifyEvent(com.ss.android.ugc.aweme.verify.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f4312a, false, 90046, new Class[]{com.ss.android.ugc.aweme.verify.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f4312a, false, 90046, new Class[]{com.ss.android.ugc.aweme.verify.a.class}, Void.TYPE);
            return;
        }
        new cw(new e<String>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76721a;

            public final /* synthetic */ Object a() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f76721a, false, 90051, new Class[0], String.class)) {
                    return ZhimaVerifyApi.a();
                }
                return (String) PatchProxy.accessDispatch(new Object[0], this, f76721a, false, 90051, new Class[0], String.class);
            }
        }, new c<String>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76723a;

            public final void a(Exception exc) {
                if (PatchProxy.isSupport(new Object[]{exc}, this, f76723a, false, 90053, new Class[]{Exception.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{exc}, this, f76723a, false, 90053, new Class[]{Exception.class}, Void.TYPE);
                    return;
                }
                am.this.a(am.this.a(0, ""));
            }

            public final /* synthetic */ void a(Object obj) {
                String str = (String) obj;
                if (PatchProxy.isSupport(new Object[]{str}, this, f76723a, false, 90052, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f76723a, false, 90052, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                am.this.a(am.this.a(1, str));
            }
        }).a();
        bg.d(this);
    }

    public final void a(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f4312a, false, 90048, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f4312a, false, 90048, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", "zmCert");
            jSONObject2.put("args", jSONObject);
        } catch (JSONException unused) {
        }
        if (this.f4314c != null) {
            this.f4314c.b("H5_nativeEvent", jSONObject2);
        }
    }

    public am(WeakReference<Context> weakReference, a aVar) {
        this.f4313b = weakReference;
        this.f4314c = aVar;
    }

    public final JSONObject a(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f4312a, false, 90047, new Class[]{Integer.TYPE, String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f4312a, false, 90047, new Class[]{Integer.TYPE, String.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("_raw", str2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void call(h hVar, JSONObject jSONObject) throws Exception {
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f4312a, false, 90045, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f4312a, false, 90045, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        final Context context = (Context) this.f4313b.get();
        if (context != null) {
            final String optString = hVar.f20623d.optString(PushConstants.WEB_URL);
            if (TextUtils.isEmpty(optString)) {
                a(a(0, ""));
                return;
            }
            com.ss.android.b.a.a.a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76714a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f76714a, false, 90049, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f76714a, false, 90049, new Class[0], Void.TYPE);
                        return;
                    }
                    final boolean a2 = com.ss.android.ugc.aweme.zhima.a.a((Context) am.this.f4313b.get());
                    com.ss.android.b.a.a.a.b(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f76718a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f76718a, false, 90050, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f76718a, false, 90050, new Class[0], Void.TYPE);
                            } else if (a2) {
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse("alipays://platformapi/startapp?appId=20000067&url=" + URLEncoder.encode(optString)));
                                context.startActivity(intent);
                                bg.c(am.this);
                                Activity e2 = p.a().e();
                                if (e2 instanceof k) {
                                    ((k) e2).a().a(true);
                                }
                            } else {
                                com.bytedance.ies.dmt.ui.d.a.c(context, context.getString(C0906R.string.bn9)).a();
                            }
                        }
                    });
                }
            });
        }
    }
}
