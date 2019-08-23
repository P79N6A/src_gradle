package com.ss.android.ugc.aweme.miniapp;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.miniapp.a.g;
import com.ss.android.ugc.aweme.miniapp.c.a.c;
import org.json.JSONObject;

public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55404a;

    /* renamed from: b  reason: collision with root package name */
    private String f55405b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f55406c;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bf A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f55404a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r9] = r0
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 58985(0xe669, float:8.2656E-41)
            r2 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x0039
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f55404a
            r4 = 0
            r5 = 58985(0xe669, float:8.2656E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r9] = r0
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0039:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x0040
            return r9
        L_0x0040:
            android.net.Uri r0 = android.net.Uri.parse(r11)
            r10.f55406c = r0
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r11, r0)     // Catch:{ Exception -> 0x00a3 }
            boolean r0 = com.ss.android.ugc.aweme.miniapp.l.k.d(r1)     // Catch:{ Exception -> 0x00a1 }
            if (r0 == 0) goto L_0x0075
            android.net.Uri r0 = r10.f55406c     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = "start_page"
            java.lang.String r0 = r0.getQueryParameter(r2)     // Catch:{ Exception -> 0x00a1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r3 = "start_page://"
            r2.<init>(r3)     // Catch:{ Exception -> 0x00a1 }
            r2.append(r0)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00a1 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = "ad_params"
            java.lang.String r0 = r0.getQueryParameter(r2)     // Catch:{ Exception -> 0x00a1 }
            r10.f55405b = r0     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00b6
        L_0x0075:
            boolean r0 = com.ss.android.ugc.aweme.miniapp.l.k.b(r1)     // Catch:{ Exception -> 0x00a1 }
            if (r0 == 0) goto L_0x00b6
            android.net.Uri r0 = r10.f55406c     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = "query"
            java.lang.String r0 = r0.getQueryParameter(r2)     // Catch:{ Exception -> 0x00a1 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00a1 }
            if (r2 != 0) goto L_0x00b6
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x00a1 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r0 = "ad_params"
            java.lang.String r0 = r2.optString(r0)     // Catch:{ Exception -> 0x00a1 }
            r10.f55405b = r0     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r0 = r10.f55405b     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r2)     // Catch:{ Exception -> 0x00a1 }
            r10.f55405b = r0     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00b6
        L_0x00a1:
            r0 = move-exception
            goto L_0x00a5
        L_0x00a3:
            r0 = move-exception
            r1 = r11
        L_0x00a5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "the schema is"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.String) r1, (java.lang.Exception) r0)
        L_0x00b6:
            java.lang.String r0 = r10.f55405b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00bf
            return r8
        L_0x00bf:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.miniapp.a.a(java.lang.String):boolean");
    }

    public final boolean a(@NonNull Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, f55404a, false, 58986, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f55404a, false, 58986, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f55405b);
            String optString = jSONObject.optString("web_url");
            String optString2 = jSONObject.optString("cid");
            String optString3 = jSONObject.optString("log_extra");
            String optString4 = jSONObject.optString("web_title");
            String queryParameter = this.f55406c.getQueryParameter("from");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("log_extra", optString3);
            jSONObject2.put("is_ad_event", 1);
            long parseLong = Long.parseLong(optString2);
            if (!TextUtils.isEmpty(optString3) && !TextUtils.isEmpty(optString)) {
                if (TextUtils.equals(queryParameter, f.f34168b)) {
                    c.a("umeng", "embeded_ad", "open_url_microapp_h5", parseLong, 0, jSONObject2);
                } else {
                    c.a("umeng", "embeded_ad", "micro_app_h5", parseLong, 0, jSONObject2);
                }
                g.a(context2, optString + "&launch_mode=standard", optString4);
                return true;
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("the schema is" + str2, e2);
        }
        return false;
    }
}
