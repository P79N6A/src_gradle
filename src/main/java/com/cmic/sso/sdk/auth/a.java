package com.cmic.sso.sdk.auth;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.b.b.b;
import com.cmic.sso.sdk.d.c;
import com.cmic.sso.sdk.d.f;
import com.cmic.sso.sdk.d.k;
import com.cmic.sso.sdk.d.n;
import com.cmic.sso.sdk.d.o;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import java.util.UUID;
import org.json.JSONObject;

public class a {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: c  reason: collision with root package name */
    private static a f22982c;

    /* renamed from: a  reason: collision with root package name */
    private com.cmic.sso.sdk.b.b.a f22983a = com.cmic.sso.sdk.b.b.a.a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Context f22984b;

    private a(Context context) {
        this.f22984b = context.getApplicationContext();
    }

    public static a a(Context context) {
        if (f22982c == null) {
            synchronized (a.class) {
                if (f22982c == null) {
                    f22982c = new a(context);
                }
            }
        }
        return f22982c;
    }

    private void b(final Bundle bundle, final b bVar) {
        f.b("AuthnBusiness", "getPrePhonescrip start");
        String packageName = this.f22984b.getPackageName();
        String a2 = c.a(o.a(this.f22984b, packageName));
        bundle.putString("apppackage", packageName);
        bundle.putString("appsign", a2);
        bundle.putString(a.C0245a.f22942a, UUID.randomUUID().toString().substring(0, 16));
        bundle.putString("authtype", "3");
        this.f22983a.a(this.f22984b, bundle, (b) new b() {
            /* JADX WARNING: Removed duplicated region for block: B:41:0x00e6  */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x00fd  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void a(java.lang.String r7, java.lang.String r8, org.json.JSONObject r9) {
                /*
                    r6 = this;
                    java.lang.String r0 = "103119"
                    boolean r0 = r0.equals(r7)
                    if (r0 != 0) goto L_0x010f
                    java.lang.String r0 = "103101"
                    boolean r0 = r0.equals(r7)
                    if (r0 != 0) goto L_0x010f
                    java.lang.String r0 = "105302"
                    boolean r0 = r0.equals(r7)
                    if (r0 != 0) goto L_0x010f
                    java.lang.String r0 = "105019"
                    boolean r0 = r0.equals(r7)
                    if (r0 == 0) goto L_0x0022
                    goto L_0x010f
                L_0x0022:
                    java.lang.String r0 = "103000"
                    boolean r0 = r0.equals(r7)
                    if (r0 == 0) goto L_0x0107
                    java.lang.String r7 = "resultdata"
                    java.lang.String r7 = r9.optString(r7)
                    boolean r8 = android.text.TextUtils.isEmpty(r7)
                    if (r8 == 0) goto L_0x003b
                    java.lang.String r7 = r9.toString()
                    goto L_0x0047
                L_0x003b:
                    android.os.Bundle r8 = r4
                    java.lang.String r9 = com.cmic.sso.sdk.a.C0245a.f22942a
                    java.lang.String r8 = r8.getString(r9)
                    java.lang.String r7 = com.cmic.sso.sdk.d.a.b((java.lang.String) r8, (java.lang.String) r7)
                L_0x0047:
                    r8 = 0
                    org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00bb }
                    r9.<init>(r7)     // Catch:{ JSONException -> 0x00bb }
                    java.lang.String r7 = "phonescrip"
                    java.lang.String r7 = r9.optString(r7)     // Catch:{ JSONException -> 0x00bb }
                    com.cmic.sso.sdk.auth.a r0 = com.cmic.sso.sdk.auth.a.this     // Catch:{ JSONException -> 0x00b9 }
                    android.content.Context r0 = r0.f22984b     // Catch:{ JSONException -> 0x00b9 }
                    java.lang.String r1 = "phonescripED"
                    long r1 = r9.optLong(r1)     // Catch:{ JSONException -> 0x00b9 }
                    android.os.Bundle r3 = r4     // Catch:{ JSONException -> 0x00b9 }
                    java.lang.String r4 = "imsi"
                    java.lang.String r5 = ""
                    java.lang.String r3 = r3.getString(r4, r5)     // Catch:{ JSONException -> 0x00b9 }
                    com.cmic.sso.sdk.d.k.a(r0, r7, r1, r3)     // Catch:{ JSONException -> 0x00b9 }
                    java.lang.String r0 = "securityphone"
                    java.lang.String r0 = r9.optString(r0)     // Catch:{ JSONException -> 0x00b9 }
                    com.cmic.sso.sdk.auth.a r1 = com.cmic.sso.sdk.auth.a.this     // Catch:{ JSONException -> 0x00b7 }
                    android.content.Context r1 = r1.f22984b     // Catch:{ JSONException -> 0x00b7 }
                    java.lang.String r2 = "securityphone"
                    com.cmic.sso.sdk.d.n.a((android.content.Context) r1, (java.lang.String) r2, (java.lang.String) r0)     // Catch:{ JSONException -> 0x00b7 }
                    java.lang.String r1 = "openId"
                    java.lang.String r1 = r9.optString(r1)     // Catch:{ JSONException -> 0x00b7 }
                    boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00b5 }
                    if (r2 == 0) goto L_0x0090
                    java.lang.String r2 = "pcid"
                    java.lang.String r2 = r9.optString(r2)     // Catch:{ JSONException -> 0x00b5 }
                    r1 = r2
                L_0x0090:
                    java.lang.String r2 = "sourceid"
                    java.lang.String r2 = r9.optString(r2)     // Catch:{ JSONException -> 0x00b5 }
                    com.cmic.sso.sdk.auth.a r8 = com.cmic.sso.sdk.auth.a.this     // Catch:{ JSONException -> 0x00bf }
                    android.content.Context r8 = r8.f22984b     // Catch:{ JSONException -> 0x00bf }
                    java.lang.String r3 = "sourceid"
                    com.cmic.sso.sdk.d.n.a((android.content.Context) r8, (java.lang.String) r3, (java.lang.String) r2)     // Catch:{ JSONException -> 0x00bf }
                    java.lang.String r8 = "capaids"
                    java.lang.String r3 = "acd"
                    java.lang.String r8 = r9.optString(r8, r3)     // Catch:{ JSONException -> 0x00bf }
                    com.cmic.sso.sdk.auth.a r9 = com.cmic.sso.sdk.auth.a.this     // Catch:{ JSONException -> 0x00bf }
                    android.content.Context r9 = r9.f22984b     // Catch:{ JSONException -> 0x00bf }
                    java.lang.String r3 = "allcapaids"
                    com.cmic.sso.sdk.d.n.a((android.content.Context) r9, (java.lang.String) r3, (java.lang.String) r8)     // Catch:{ JSONException -> 0x00bf }
                    goto L_0x00bf
                L_0x00b5:
                    r2 = r8
                    goto L_0x00bf
                L_0x00b7:
                    r1 = r8
                    goto L_0x00be
                L_0x00b9:
                    r0 = r8
                    goto L_0x00bd
                L_0x00bb:
                    r7 = r8
                    r0 = r7
                L_0x00bd:
                    r1 = r0
                L_0x00be:
                    r2 = r1
                L_0x00bf:
                    android.os.Bundle r8 = r4
                    java.lang.String r9 = "openId"
                    r8.putString(r9, r1)
                    android.os.Bundle r8 = r4
                    java.lang.String r9 = "phonescrip"
                    r8.putString(r9, r7)
                    android.os.Bundle r7 = r4
                    java.lang.String r8 = "securityphone"
                    r7.putString(r8, r0)
                    android.os.Bundle r7 = r4
                    java.lang.String r8 = "sourceid"
                    r7.putString(r8, r2)
                    android.os.Bundle r7 = r4
                    java.lang.String r8 = "logintype"
                    int r7 = r7.getInt(r8)
                    r8 = 3
                    if (r7 != r8) goto L_0x00fd
                    java.lang.String r7 = "AuthnBusiness"
                    java.lang.String r8 = "预取号==>"
                    com.cmic.sso.sdk.d.f.a(r7, r8)
                    org.json.JSONObject r7 = com.cmic.sso.sdk.auth.c.a(r0)
                    com.cmic.sso.sdk.auth.b r8 = r5
                    java.lang.String r9 = "103000"
                    java.lang.String r0 = "true"
                    android.os.Bundle r1 = r4
                    r8.a(r9, r0, r1, r7)
                    goto L_0x010e
                L_0x00fd:
                    com.cmic.sso.sdk.auth.a r7 = com.cmic.sso.sdk.auth.a.this
                    android.os.Bundle r8 = r4
                    com.cmic.sso.sdk.auth.b r9 = r5
                    r7.c(r8, r9)
                    return
                L_0x0107:
                    com.cmic.sso.sdk.auth.b r0 = r5
                    android.os.Bundle r1 = r4
                    r0.a(r7, r8, r1, r9)
                L_0x010e:
                    return
                L_0x010f:
                    com.cmic.sso.sdk.auth.b r0 = r5
                    android.os.Bundle r1 = r4
                    r0.a(r7, r8, r1, r9)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.cmic.sso.sdk.auth.a.AnonymousClass1.a(java.lang.String, java.lang.String, org.json.JSONObject):void");
            }
        });
    }

    /* access modifiers changed from: private */
    public void c(final Bundle bundle, final b bVar) {
        n.a(this.f22984b, "tokentimes", System.currentTimeMillis());
        f.c("AuthnBusiness", "获取平台token》》》》");
        k.a(this.f22984b, true);
        if (bundle.getInt("logintype") == 1) {
            bundle.putString("userCapaid", BasicPushStatus.SUCCESS_CODE);
        } else if (bundle.getInt("logintype") == 0) {
            bundle.putString("userCapaid", "50");
        }
        this.f22983a.b(this.f22984b, bundle, new b() {
            public void a(String str, String str2, JSONObject jSONObject) {
                f.c("AuthnBusiness", "获取平台token 》》》》" + jSONObject.toString());
                if (str.equals("103000")) {
                    long optLong = jSONObject.optLong("phonescripED");
                    k.a(a.this.f22984b, jSONObject.optString("phonescrip"), optLong, bundle.getString("imsi", ""));
                    bundle.putString("openId", jSONObject.optString("openId"));
                }
                n.a(a.this.f22984b, "tokenbetweentimes", System.currentTimeMillis() - n.b(a.this.f22984b, "tokentimes", 0));
                bVar.a(str, str2, bundle, jSONObject);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void a(Bundle bundle, b bVar) {
        f.b("AuthnBusiness", "LoginCheck method start");
        int i = bundle.getInt("logintype", 0);
        if (!bundle.getBoolean("isCacheScrip", false)) {
            b(bundle, bVar);
        } else if (i == 3) {
            bVar.a("103000", "true", bundle, c.a(n.b(this.f22984b, "securityphone", "")));
        } else {
            String a2 = k.a(this.f22984b);
            bundle.putString("sourceid", n.b(this.f22984b, "sourceid", ""));
            bundle.putString("phonescrip", a2);
            c(bundle, bVar);
        }
    }
}
