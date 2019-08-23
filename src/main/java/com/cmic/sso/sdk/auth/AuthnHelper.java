package com.cmic.sso.sdk.auth;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.cmic.sso.sdk.a.b;
import com.cmic.sso.sdk.d.e;
import com.cmic.sso.sdk.d.f;
import com.cmic.sso.sdk.d.h;
import com.cmic.sso.sdk.d.j;
import com.cmic.sso.sdk.d.k;
import com.cmic.sso.sdk.d.m;
import com.cmic.sso.sdk.d.n;
import com.cmic.sso.sdk.d.r;
import com.cmic.sso.sdk.d.s;
import com.cmic.sso.sdk.d.t;
import com.cmic.sso.sdk.d.u;
import com.cmic.sso.sdk.d.w;
import com.cmic.sso.sdk.d.x;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class AuthnHelper {
    @SuppressLint({"StaticFieldLeak"})
    private static AuthnHelper mInstance;
    private a authnBusiness;
    public Context mContext;
    public Handler mHandler;
    private long overTime = 8000;

    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private Bundle f22981b;

        public void run() {
            JSONObject jSONObject;
            if (x.a(AuthnHelper.this.mContext).a() || !this.f22981b.getBoolean("doNetworkSwitch", false)) {
                jSONObject = c.a("200023", "登录超时");
            } else {
                jSONObject = c.a("102508", "数据网络切换失败");
            }
            JSONObject jSONObject2 = jSONObject;
            AuthnHelper.this.callBackResult(jSONObject2.optString("resultCode", "200023"), jSONObject2.optString("resultString", "登录超时"), this.f22981b, jSONObject2, null);
        }

        a(Bundle bundle) {
            this.f22981b = bundle;
        }
    }

    public void delScrip() {
        try {
            k.a(this.mContext, true);
        } catch (Exception unused) {
        }
    }

    public static void setDebugMode(boolean z) {
        f.a(z);
    }

    public void setOverTime(long j) {
        this.overTime = j;
    }

    public static AuthnHelper getInstance(Context context) {
        if (mInstance == null) {
            synchronized (AuthnHelper.class) {
                if (mInstance == null) {
                    mInstance = new AuthnHelper(context);
                }
            }
        }
        return mInstance;
    }

    public void startGetPrePhonescript(Bundle bundle) {
        final a aVar = new a(bundle);
        this.mHandler.postDelayed(aVar, this.overTime);
        this.authnBusiness.a(bundle, new b() {
            public void a(String str, String str2, Bundle bundle, JSONObject jSONObject) {
                AuthnHelper.this.mHandler.removeCallbacks(aVar);
                AuthnHelper.this.callBackResult(str, str2, bundle, jSONObject, null);
            }
        });
    }

    private AuthnHelper(Context context) {
        this.mHandler = new Handler(context.getMainLooper());
        this.mContext = context.getApplicationContext();
        this.authnBusiness = a.a(this.mContext);
        s.a(new s.a() {
            public void a() {
                if (e.a(AuthnHelper.this.mContext)) {
                    f.b("AuthnHelper", "生成androidkeystore成功");
                } else {
                    f.b("AuthnHelper", "生成androidkeystore失败");
                }
            }
        });
    }

    public JSONObject getNetworkType(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!j.a(context, "android.permission.READ_PHONE_STATE")) {
                f.a("AuthnHelper", "用户未授权READ_PHONE_STATE");
                jSONObject.put("errorDes", "用户未授权READ_PHONE_STATE");
                return jSONObject;
            }
            b.a().b(context);
            String a2 = m.a(this.mContext).a(m.a(this.mContext).b());
            int a3 = r.a(context);
            jSONObject.put("operatortype", a2);
            jSONObject.put("networktype", a3);
            f.b("AuthnHelper", "网络类型: " + a3);
            f.b("AuthnHelper", "运营商类型: " + a2);
            return jSONObject;
        } catch (JSONException unused) {
            return jSONObject;
        }
    }

    public void getPhoneInfo(String str, String str2, TokenListener tokenListener) {
        final Bundle bundle = new Bundle();
        final String str3 = str;
        final String str4 = str2;
        final TokenListener tokenListener2 = tokenListener;
        AnonymousClass4 r0 = new s.a(this.mContext, bundle) {
            public void a() {
                if (AuthnHelper.this.commonInit(bundle, str3, str4, "preGetMobile", 3, tokenListener2)) {
                    AuthnHelper.this.startGetPrePhonescript(bundle);
                }
            }
        };
        s.a(r0);
    }

    public void loginAuth(String str, String str2, TokenListener tokenListener) {
        final Bundle bundle = new Bundle();
        final String str3 = str;
        final String str4 = str2;
        final TokenListener tokenListener2 = tokenListener;
        AnonymousClass2 r0 = new s.a(this.mContext, bundle) {
            public void a() {
                if (AuthnHelper.this.commonInit(bundle, str3, str4, "loginAuth", 1, tokenListener2)) {
                    AuthnHelper.this.startGetPrePhonescript(bundle);
                }
            }
        };
        s.a(r0);
    }

    public void mobileAuth(String str, String str2, TokenListener tokenListener) {
        final Bundle bundle = new Bundle();
        final String str3 = str;
        final String str4 = str2;
        final TokenListener tokenListener2 = tokenListener;
        AnonymousClass3 r0 = new s.a(this.mContext, bundle) {
            public void a() {
                if (AuthnHelper.this.commonInit(bundle, str3, str4, "mobileAuth", 0, tokenListener2)) {
                    if (u.d(AuthnHelper.this.mContext)) {
                        AuthnHelper.this.callBackResult("200082", "服务器繁忙，请稍后重试", bundle, null, null);
                        return;
                    }
                    AuthnHelper.this.startGetPrePhonescript(bundle);
                }
            }
        };
        s.a(r0);
    }

    private void sendLog(Context context, String str, Bundle bundle, Throwable th) {
        if (!u.k(context)) {
            new com.cmic.sso.sdk.c.b().a(context, str, bundle, th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r7.putLong("systemEndTime", java.lang.System.currentTimeMillis());
        r7.putString("endtime", com.cmic.sso.sdk.d.t.a());
        r0 = r7.getInt("logintype", -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r8 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r8 = com.cmic.sso.sdk.auth.c.a(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        r6 = com.cmic.sso.sdk.auth.c.a(r5, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        r6 = com.cmic.sso.sdk.auth.c.a(r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        r4.mHandler.post(new com.cmic.sso.sdk.auth.AuthnHelper.AnonymousClass6(r4));
        sendLog(r4.mContext, r5, r7, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callBackResult(java.lang.String r5, java.lang.String r6, final android.os.Bundle r7, org.json.JSONObject r8, java.lang.Throwable r9) {
        /*
            r4 = this;
            java.lang.String r0 = "traceId"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ Exception -> 0x0071 }
            boolean r1 = com.cmic.sso.sdk.d.h.a(r0)     // Catch:{ Exception -> 0x0071 }
            if (r1 != 0) goto L_0x0057
            monitor-enter(r4)     // Catch:{ Exception -> 0x0071 }
            com.cmic.sso.sdk.auth.TokenListener r1 = com.cmic.sso.sdk.d.h.c(r0)     // Catch:{ all -> 0x0054 }
            com.cmic.sso.sdk.d.h.b(r0)     // Catch:{ all -> 0x0054 }
            if (r1 != 0) goto L_0x0018
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            return
        L_0x0018:
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "systemEndTime"
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0071 }
            r7.putLong(r0, r2)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r0 = "endtime"
            java.lang.String r2 = com.cmic.sso.sdk.d.t.a()     // Catch:{ Exception -> 0x0071 }
            r7.putString(r0, r2)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r0 = "logintype"
            r2 = -1
            int r0 = r7.getInt(r0, r2)     // Catch:{ Exception -> 0x0071 }
            if (r8 != 0) goto L_0x0038
            org.json.JSONObject r8 = com.cmic.sso.sdk.auth.c.a(r5, r6)     // Catch:{ Exception -> 0x0071 }
        L_0x0038:
            r2 = 3
            if (r0 != r2) goto L_0x0040
            org.json.JSONObject r6 = com.cmic.sso.sdk.auth.c.a(r5, r7, r8)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0044
        L_0x0040:
            org.json.JSONObject r6 = com.cmic.sso.sdk.auth.c.a(r5, r6, r7, r8)     // Catch:{ Exception -> 0x0071 }
        L_0x0044:
            android.os.Handler r8 = r4.mHandler     // Catch:{ Exception -> 0x0071 }
            com.cmic.sso.sdk.auth.AuthnHelper$6 r0 = new com.cmic.sso.sdk.auth.AuthnHelper$6     // Catch:{ Exception -> 0x0071 }
            r0.<init>(r1, r6)     // Catch:{ Exception -> 0x0071 }
            r8.post(r0)     // Catch:{ Exception -> 0x0071 }
            android.content.Context r6 = r4.mContext     // Catch:{ Exception -> 0x0071 }
            r4.sendLog(r6, r5, r7, r9)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0057
        L_0x0054:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            throw r5     // Catch:{ Exception -> 0x0071 }
        L_0x0057:
            com.cmic.sso.sdk.auth.AuthnHelper$7 r5 = new com.cmic.sso.sdk.auth.AuthnHelper$7     // Catch:{ Exception -> 0x0071 }
            android.content.Context r6 = r4.mContext     // Catch:{ Exception -> 0x0071 }
            r5.<init>(r6, r7, r7)     // Catch:{ Exception -> 0x0071 }
            com.cmic.sso.sdk.d.s.a(r5)     // Catch:{ Exception -> 0x0071 }
            boolean r5 = com.cmic.sso.sdk.d.h.a()     // Catch:{ Exception -> 0x0071 }
            if (r5 == 0) goto L_0x0070
            android.content.Context r5 = r4.mContext     // Catch:{ Exception -> 0x0071 }
            com.cmic.sso.sdk.d.x r5 = com.cmic.sso.sdk.d.x.a((android.content.Context) r5)     // Catch:{ Exception -> 0x0071 }
            r5.b()     // Catch:{ Exception -> 0x0071 }
        L_0x0070:
            return
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmic.sso.sdk.auth.AuthnHelper.callBackResult(java.lang.String, java.lang.String, android.os.Bundle, org.json.JSONObject, java.lang.Throwable):void");
    }

    public boolean commonInit(Bundle bundle, String str, String str2, String str3, int i, TokenListener tokenListener) {
        String str4;
        String str5;
        Bundle bundle2 = bundle;
        String str6 = str;
        String str7 = str2;
        int i2 = i;
        TokenListener tokenListener2 = tokenListener;
        String b2 = w.b();
        bundle.putString("traceId", b2);
        h.a(b2, tokenListener2);
        bundle.putBoolean("CLOSE_CERT_VERIFY", u.h(this.mContext));
        bundle.putLong("systemStartTime", System.currentTimeMillis());
        bundle.putString("starttime", t.a());
        bundle.putString("loginMethod", str3);
        bundle.putString("appkey", str7);
        bundle.putString("appid", str6);
        bundle.putString("timeOut", String.valueOf(this.overTime));
        int a2 = r.a(this.mContext);
        bundle.putInt("networktype", a2);
        if (!j.a(this.mContext, "android.permission.READ_PHONE_STATE")) {
            callBackResult("200005", "用户未授权READ_PHONE_STATE", bundle, null, null);
            f.a("AuthnHelper", "缺少必要权限---READ_PHONE_STATE");
            return false;
        }
        b.a().b(this.mContext);
        bundle.putString("networkClass", b.a().c(this.mContext));
        bundle.putString("simCardNum", String.valueOf(b.a().a(this.mContext).i()));
        String b3 = m.a(this.mContext).b();
        String b4 = m.a(this.mContext).b(this.mContext);
        String a3 = m.a(this.mContext).a(b3);
        bundle.putString("imsi", b3);
        bundle.putString("imei", b4);
        bundle.putString("operatortype", a3);
        boolean a4 = k.a(this.mContext, bundle);
        bundle.putBoolean("isCacheScrip", a4);
        f.b("AuthnHelper", "isCachePhoneScrip = " + a4);
        if (tokenListener2 == null) {
            callBackResult("102203", "listener不能为空", bundle, null, null);
            return false;
        }
        if (str6 == null) {
            str4 = "";
        } else {
            str4 = str.trim();
        }
        if (TextUtils.isEmpty(str4)) {
            callBackResult("102203", "appId 不能为空", bundle, null, null);
            return false;
        }
        if (str7 == null) {
            str5 = "";
        } else {
            str5 = str2.trim();
        }
        if (TextUtils.isEmpty(str5)) {
            callBackResult("102203", "appkey不能为空", bundle, null, null);
            return false;
        } else if (a2 == 0) {
            callBackResult("102101", "未检测到网络", bundle, null, null);
            return false;
        } else if (TextUtils.isEmpty(b3)) {
            bundle.putString("authtype", PushConstants.PUSH_TYPE_NOTIFY);
            if (i2 == 3) {
                callBackResult("200010", "imsi获取失败或者没有sim卡，预取号失败", bundle, null, null);
                return false;
            }
            f.a("AuthnHelper", "imsi获取失败或者没有sim卡，预取号失败");
            callBackResult("200002", "手机未安装SIM卡", bundle, null, null);
            return false;
        } else if (a2 == 2 && !a4) {
            callBackResult("102103", "无数据网络", bundle, null, null);
            return false;
        } else if (!PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(a3) && i2 == 0) {
            callBackResult("200080", "本机号码校验仅支持移动手机号", bundle, null, null);
            return false;
        } else if (PushConstants.PUSH_TYPE_UPLOAD_LOG.equals(a3) && u.i(this.mContext)) {
            callBackResult("200082", "服务器繁忙，请稍后重试", bundle, null, null);
            return false;
        } else if (!"3".equals(a3) || !u.j(this.mContext)) {
            bundle.putInt("logintype", i2);
            n.a(this.mContext, "phonetimes", System.currentTimeMillis());
            return true;
        } else {
            callBackResult("200082", "服务器繁忙，请稍后重试", bundle, null, null);
            return false;
        }
    }
}
