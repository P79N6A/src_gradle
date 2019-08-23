package com.ss.android.ugc.aweme.splash;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.i;
import com.ss.android.g.a;
import com.ss.android.newmedia.e;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.util.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71616a;

    public static boolean a(Context context, String str, String str2, long j, String str3, m mVar) {
        boolean z;
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        long j2 = j;
        String str6 = str3;
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{context2, str4, str5, new Long(j2), str6, mVar2}, null, f71616a, true, 81950, new Class[]{Context.class, String.class, String.class, Long.TYPE, String.class, m.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str4, str5, new Long(j2), str6, mVar2}, null, f71616a, true, 81950, new Class[]{Context.class, String.class, String.class, Long.TYPE, String.class, m.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null || TextUtils.isEmpty(str)) {
            return false;
        } else {
            c.a("openSplashScheme: url = " + str4);
            if (e.a(str)) {
                if (PatchProxy.isSupport(new Object[]{context2, new Long(j2), str6}, null, g.f39316a, true, 31759, new Class[]{Context.class, Long.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context2, new Long(j2), str6}, null, g.f39316a, true, 31759, new Class[]{Context.class, Long.TYPE, String.class}, Void.TYPE);
                    z = true;
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        g.a(context2, jSONObject, str6);
                    } catch (JSONException unused) {
                    }
                    z = true;
                    g.a(context, "splash_ad", "open_url_h5", jSONObject, String.valueOf(j), 0);
                }
                Intent intent = new Intent(context2, CrossPlatformActivity.class);
                intent.setData(Uri.parse(str));
                intent.setFlags(268435456);
                if (a.a()) {
                    if (TextUtils.isEmpty(str2)) {
                        intent.putExtra(PushConstants.TITLE, " ");
                    } else {
                        intent.putExtra(PushConstants.TITLE, str5);
                    }
                } else if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra(PushConstants.TITLE, str5);
                }
                intent.putExtra("bundle_forbidden_jump", z);
                try {
                    context2.startActivity(intent);
                    return z;
                } catch (Exception e2) {
                    Exception exc = e2;
                    c.a("openSplashScheme: url = " + str4 + " e = " + exc.toString());
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
                    return false;
                }
            } else if (com.ss.android.ugc.aweme.ug.a.a.a(context, str)) {
                return true;
            } else {
                String scheme = Uri.parse(str).getScheme();
                if (!com.ss.android.ugc.aweme.app.e.f34152b.equalsIgnoreCase(scheme) && !com.ss.android.ugc.aweme.app.e.f34154d.equalsIgnoreCase(scheme)) {
                    Object[] objArr = {context2, new Long(j2), str6};
                    if (PatchProxy.isSupport(objArr, null, g.f39316a, true, 31760, new Class[]{Context.class, Long.TYPE, String.class}, Void.TYPE)) {
                        Object[] objArr2 = {context2, new Long(j2), str6};
                        Object[] objArr3 = objArr2;
                        PatchProxy.accessDispatch(objArr3, null, g.f39316a, true, 31760, new Class[]{Context.class, Long.TYPE, String.class}, Void.TYPE);
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            g.a(context2, jSONObject2, str6);
                        } catch (JSONException unused2) {
                        }
                        g.a(context, "splash_ad", "open_url_app", jSONObject2, String.valueOf(j), 0);
                    }
                }
                i iVar = new i(str4);
                if (com.ss.android.ugc.aweme.app.e.f34155e.a(str4)) {
                    iVar.a(PushConstants.WEB_URL, str4);
                }
                if (str4.startsWith("sslocal://user/profile/")) {
                    iVar.a("enter_from", "open_screen_ad");
                }
                if (((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).isAppBrandSchema(str4)) {
                    iVar.a("schema_from", "splash");
                }
                mVar2.a(context2, iVar.a());
                return true;
            }
        }
    }
}
