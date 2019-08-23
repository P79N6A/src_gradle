package com.bytedance.sdk.account.i.c;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.CtAuth;
import cn.com.chinatelecom.account.api.CtSetting;
import cn.com.chinatelecom.account.api.ResultListener;
import com.bytedance.sdk.account.i.a.b;
import com.bytedance.sdk.account.i.b.a;
import com.bytedance.sdk.account.i.b.d;
import com.bytedance.sdk.account.i.c.b;
import com.cmic.sso.sdk.auth.AuthnHelper;
import com.cmic.sso.sdk.auth.TokenListener;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.unicom.xiaowo.login.UniAuthHelper;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f22463a;

    /* renamed from: b  reason: collision with root package name */
    b.c f22464b;

    /* renamed from: c  reason: collision with root package name */
    public a f22465c;

    /* renamed from: d  reason: collision with root package name */
    public String f22466d;

    /* renamed from: e  reason: collision with root package name */
    public String f22467e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22468f;
    protected Handler g = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            long j;
            if (!c.this.f22463a) {
                e eVar = null;
                if (message.obj != null && (message.obj instanceof e)) {
                    eVar = (e) message.obj;
                }
                int i = message.what;
                if (i != 1003) {
                    switch (i) {
                        case 1011:
                            if (!(eVar == null || eVar.f22495a == null || !(eVar.f22496b instanceof Bundle))) {
                                eVar.f22495a.a((Bundle) eVar.f22496b);
                                return;
                            }
                        case 1012:
                            if (!(eVar == null || eVar.f22495a == null || !(eVar.f22496b instanceof d))) {
                                eVar.f22495a.b((d) eVar.f22496b);
                                return;
                            }
                    }
                } else {
                    c cVar = c.this;
                    cVar.f22468f = true;
                    cVar.f22467e = "";
                    if (!(eVar == null || eVar.f22495a == null || !(eVar.f22496b instanceof d))) {
                        d dVar = (d) eVar.f22496b;
                        eVar.f22495a.b(dVar);
                        if (cVar.f22465c != null) {
                            if (cVar.f22464b != null) {
                                j = cVar.f22464b.f22462c;
                            } else {
                                j = 3000;
                            }
                            c.a(false, dVar.f22434a, dVar.f22435b, j, "china_unicom");
                        }
                    }
                }
            }
        }
    };
    private Context h;
    private AuthnHelper i;
    private UniAuthHelper j;
    private b.a k;
    private b.C0234b l;

    public final void b() {
        this.f22463a = true;
        if (this.g != null) {
            this.g.removeCallbacksAndMessages(null);
        }
        this.f22466d = "";
        this.f22467e = "";
        this.f22468f = false;
    }

    public final String a() {
        this.f22463a = false;
        String optString = this.i.getNetworkType(this.h).optString("operatortype");
        if (PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(optString)) {
            return "mobile";
        }
        if ("3".equals(optString)) {
            return "telecom";
        }
        if (PushConstants.PUSH_TYPE_UPLOAD_LOG.equals(optString)) {
            return "unicom";
        }
        return "others";
    }

    public c(Context context, b bVar) {
        long j2;
        this.h = context.getApplicationContext();
        this.k = bVar.f22448a;
        this.l = bVar.f22449b;
        this.f22464b = bVar.f22450c;
        this.f22465c = bVar.f22451d;
        this.i = AuthnHelper.getInstance(this.h);
        this.j = UniAuthHelper.getInstance(this.h);
        this.f22468f = false;
        if (this.k != null) {
            j2 = this.k.f22454c;
        } else {
            j2 = 3000;
        }
        this.i.setOverTime(j2);
        if (this.l != null) {
            CtAuth.getInstance().init(this.h, this.l.f22455a, this.l.f22456b, null);
        }
    }

    public final void a(int i2, Object obj) {
        if (!this.f22463a) {
            Message obtain = Message.obtain();
            obtain.what = i2;
            obtain.obj = obj;
            if (this.g != null) {
                this.g.sendMessage(obtain);
            }
        }
    }

    public final void b(String str, final a aVar) {
        this.f22463a = false;
        this.f22468f = false;
        if ("mobile".equals(str)) {
            if (this.k == null) {
                if (aVar != null && !this.f22463a) {
                    aVar.b(a("-3", "sdk_init_error", "mobile", 2, (JSONObject) null));
                }
                if (this.f22465c != null) {
                    a(false, "-3", "sdk_init_error", 0, "china_mobile");
                }
            } else {
                final long currentTimeMillis = System.currentTimeMillis();
                this.i.loginAuth(this.k.f22452a, this.k.f22453b, new TokenListener() {
                    /* JADX WARNING: Removed duplicated region for block: B:15:0x00af  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void onGetTokenComplete(org.json.JSONObject r13) {
                        /*
                            r12 = this;
                            java.lang.String r0 = "-1"
                            java.lang.String r1 = "unknown"
                            long r2 = java.lang.System.currentTimeMillis()
                            long r4 = r0
                            long r9 = r2 - r4
                            if (r13 == 0) goto L_0x0090
                            java.lang.String r0 = "103000"
                            java.lang.String r2 = "resultCode"
                            java.lang.String r2 = r13.optString(r2)
                            boolean r0 = r0.equals(r2)
                            if (r0 == 0) goto L_0x0089
                            java.lang.String r0 = "token"
                            boolean r0 = r13.has(r0)
                            if (r0 == 0) goto L_0x0082
                            java.lang.String r0 = "token"
                            java.lang.String r0 = r13.optString(r0)
                            java.lang.String r1 = "openId"
                            java.lang.String r1 = r13.optString(r1)
                            java.lang.String r2 = "authType"
                            java.lang.String r2 = r13.optString(r2)
                            java.lang.String r3 = "authTypeDes"
                            java.lang.String r3 = r13.optString(r3)
                            android.os.Bundle r4 = new android.os.Bundle
                            r4.<init>()
                            java.lang.String r5 = "access_token"
                            r4.putString(r5, r0)
                            java.lang.String r0 = "net_type"
                            java.lang.String r5 = "mobile"
                            r4.putString(r0, r5)
                            java.lang.String r0 = "openId"
                            r4.putString(r0, r1)
                            java.lang.String r0 = "authType"
                            r4.putString(r0, r2)
                            java.lang.String r0 = "authTypeDes"
                            r4.putString(r0, r3)
                            java.lang.String r0 = "raw_result"
                            java.lang.String r13 = r13.toString()
                            r4.putString(r0, r13)
                            com.bytedance.sdk.account.i.c.c r13 = com.bytedance.sdk.account.i.c.c.this
                            r0 = 1011(0x3f3, float:1.417E-42)
                            com.bytedance.sdk.account.i.c.e r1 = new com.bytedance.sdk.account.i.c.e
                            com.bytedance.sdk.account.i.b.a r2 = r13
                            r1.<init>(r2, r4)
                            r13.a((int) r0, (java.lang.Object) r1)
                            com.bytedance.sdk.account.i.c.c r13 = com.bytedance.sdk.account.i.c.c.this
                            com.bytedance.sdk.account.i.c.a r13 = r13.f22465c
                            if (r13 == 0) goto L_0x0081
                            r6 = 1
                            r7 = 0
                            r8 = 0
                            java.lang.String r11 = "china_mobile"
                            com.bytedance.sdk.account.i.c.c.a((boolean) r6, (java.lang.String) r7, (java.lang.String) r8, (long) r9, (java.lang.String) r11)
                        L_0x0081:
                            return
                        L_0x0082:
                            java.lang.String r0 = "resultCode"
                            java.lang.String r0 = r13.optString(r0)
                            goto L_0x0090
                        L_0x0089:
                            java.lang.String r0 = "resultCode"
                            java.lang.String r0 = r13.optString(r0)
                            goto L_0x0092
                        L_0x0090:
                            java.lang.String r1 = "invalid_response"
                        L_0x0092:
                            r7 = r0
                            r8 = r1
                            java.lang.String r0 = "mobile"
                            r1 = 2
                            com.bytedance.sdk.account.i.b.d r13 = com.bytedance.sdk.account.i.c.c.a((java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r0, (int) r1, (org.json.JSONObject) r13)
                            com.bytedance.sdk.account.i.c.c r0 = com.bytedance.sdk.account.i.c.c.this
                            r1 = 1012(0x3f4, float:1.418E-42)
                            com.bytedance.sdk.account.i.c.e r2 = new com.bytedance.sdk.account.i.c.e
                            com.bytedance.sdk.account.i.b.a r3 = r13
                            r2.<init>(r3, r13)
                            r0.a((int) r1, (java.lang.Object) r2)
                            com.bytedance.sdk.account.i.c.c r13 = com.bytedance.sdk.account.i.c.c.this
                            com.bytedance.sdk.account.i.c.a r13 = r13.f22465c
                            if (r13 == 0) goto L_0x00b5
                            r6 = 0
                            java.lang.String r11 = "china_mobile"
                            com.bytedance.sdk.account.i.c.c.a((boolean) r6, (java.lang.String) r7, (java.lang.String) r8, (long) r9, (java.lang.String) r11)
                        L_0x00b5:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.i.c.c.AnonymousClass5.onGetTokenComplete(org.json.JSONObject):void");
                    }
                });
            }
        } else if ("telecom".equals(str)) {
            if (TextUtils.isEmpty(this.f22466d)) {
                this.f22466d = "";
                if (this.l == null) {
                    if (aVar != null && !this.f22463a) {
                        aVar.b(a("-3", "sdk_init_error", "telecom", 3, (JSONObject) null));
                    }
                    if (this.f22465c != null) {
                        a(false, "-3", "sdk_init_error", 0, "china_telecom");
                    }
                } else {
                    final long currentTimeMillis2 = System.currentTimeMillis();
                    CtAuth.getInstance().requestPreCode(new CtSetting((int) this.l.f22457c, (int) this.l.f22458d, (int) this.l.f22459e), new ResultListener() {
                        /* JADX WARNING: Removed duplicated region for block: B:29:0x008b  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void onResult(java.lang.String r13) {
                            /*
                                r12 = this;
                                java.lang.String r0 = "-1"
                                java.lang.String r1 = "unknown"
                                long r2 = java.lang.System.currentTimeMillis()
                                long r4 = r2
                                long r9 = r2 - r4
                                boolean r2 = android.text.TextUtils.isEmpty(r13)
                                r3 = 0
                                if (r2 != 0) goto L_0x0066
                                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0063 }
                                r2.<init>(r13)     // Catch:{ Exception -> 0x0063 }
                                java.lang.String r13 = "result"
                                int r13 = r2.optInt(r13)     // Catch:{ Exception -> 0x0062 }
                                if (r13 != 0) goto L_0x004d
                                java.lang.String r13 = "data"
                                java.lang.Object r13 = r2.opt(r13)     // Catch:{ Exception -> 0x0062 }
                                org.json.JSONObject r13 = (org.json.JSONObject) r13     // Catch:{ Exception -> 0x0062 }
                                if (r13 == 0) goto L_0x004a
                                java.lang.String r3 = "accessCode"
                                boolean r3 = r13.has(r3)     // Catch:{ Exception -> 0x0062 }
                                if (r3 == 0) goto L_0x004a
                                com.bytedance.sdk.account.i.c.c r3 = com.bytedance.sdk.account.i.c.c.this     // Catch:{ Exception -> 0x0062 }
                                java.lang.String r4 = "accessCode"
                                java.lang.String r13 = r13.optString(r4)     // Catch:{ Exception -> 0x0062 }
                                r3.f22466d = r13     // Catch:{ Exception -> 0x0062 }
                                com.bytedance.sdk.account.i.c.c r13 = com.bytedance.sdk.account.i.c.c.this     // Catch:{ Exception -> 0x0062 }
                                com.bytedance.sdk.account.i.c.c r3 = com.bytedance.sdk.account.i.c.c.this     // Catch:{ Exception -> 0x0062 }
                                java.lang.String r3 = r3.f22466d     // Catch:{ Exception -> 0x0062 }
                                long r4 = r2     // Catch:{ Exception -> 0x0062 }
                                com.bytedance.sdk.account.i.b.a r6 = r13     // Catch:{ Exception -> 0x0062 }
                                r13.a((java.lang.String) r3, (long) r4, (com.bytedance.sdk.account.i.b.a) r6)     // Catch:{ Exception -> 0x0062 }
                                return
                            L_0x004a:
                                java.lang.String r13 = "invalid_response"
                                r1 = r13
                            L_0x004d:
                                java.lang.String r13 = "result"
                                int r13 = r2.optInt(r13)     // Catch:{ Exception -> 0x0062 }
                                java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ Exception -> 0x0062 }
                                java.lang.String r0 = "msg"
                                java.lang.String r0 = r2.optString(r0)     // Catch:{ Exception -> 0x0061 }
                                r7 = r13
                                r8 = r0
                                r3 = r2
                                goto L_0x006a
                            L_0x0061:
                                r0 = r13
                            L_0x0062:
                                r3 = r2
                            L_0x0063:
                                r7 = r0
                                r8 = r1
                                goto L_0x006a
                            L_0x0066:
                                java.lang.String r13 = "invalid_response"
                                r8 = r13
                                r7 = r0
                            L_0x006a:
                                com.bytedance.sdk.account.i.c.c r13 = com.bytedance.sdk.account.i.c.c.this
                                java.lang.String r0 = ""
                                r13.f22466d = r0
                                java.lang.String r13 = "telecom"
                                r0 = 3
                                com.bytedance.sdk.account.i.b.d r13 = com.bytedance.sdk.account.i.c.c.a((java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r13, (int) r0, (org.json.JSONObject) r3)
                                com.bytedance.sdk.account.i.c.c r0 = com.bytedance.sdk.account.i.c.c.this
                                r1 = 1012(0x3f4, float:1.418E-42)
                                com.bytedance.sdk.account.i.c.e r2 = new com.bytedance.sdk.account.i.c.e
                                com.bytedance.sdk.account.i.b.a r3 = r13
                                r2.<init>(r3, r13)
                                r0.a((int) r1, (java.lang.Object) r2)
                                com.bytedance.sdk.account.i.c.c r13 = com.bytedance.sdk.account.i.c.c.this
                                com.bytedance.sdk.account.i.c.a r13 = r13.f22465c
                                if (r13 == 0) goto L_0x0091
                                r6 = 0
                                java.lang.String r11 = "china_telecom"
                                com.bytedance.sdk.account.i.c.c.a((boolean) r6, (java.lang.String) r7, (java.lang.String) r8, (long) r9, (java.lang.String) r11)
                            L_0x0091:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.i.c.c.AnonymousClass6.onResult(java.lang.String):void");
                        }
                    });
                }
            } else {
                a(this.f22466d, System.currentTimeMillis(), aVar);
            }
        } else if (!"unicom".equals(str)) {
            if (aVar != null) {
                d dVar = new d();
                dVar.f22438d = str;
                dVar.f22439e = 2;
                dVar.f22434a = "-2";
                dVar.f22435b = "not support operator";
                aVar.b(dVar);
            }
            if (this.f22465c != null) {
                a(false, "-2", "not support operator", 0, "others");
            }
        } else if (TextUtils.isEmpty(this.f22467e)) {
            this.f22467e = "";
            if (this.f22464b == null) {
                if (aVar != null && !this.f22463a) {
                    aVar.b(a("-3", "sdk_init_error", "unicom", 3, (JSONObject) null));
                }
                if (this.f22465c != null) {
                    a(false, "-3", "sdk_init_error", 0, "china_unicom");
                }
            } else {
                a(1003, (Object) new e(aVar, a("-8", "cu_request_time_out", "unicom", 3, (JSONObject) null)), this.f22464b.f22462c);
                final long currentTimeMillis3 = System.currentTimeMillis();
                this.j.getAccesscode(this.f22464b.f22460a, this.f22464b.f22461b, new com.unicom.xiaowo.login.ResultListener() {
                    /* JADX WARNING: Removed duplicated region for block: B:28:0x007b A[RETURN] */
                    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void onResult(java.lang.String r19) {
                        /*
                            r18 = this;
                            r0 = r18
                            java.lang.String r1 = "-1"
                            java.lang.String r2 = "unknown"
                            long r3 = java.lang.System.currentTimeMillis()
                            long r5 = r0
                            long r10 = r3 - r5
                            boolean r3 = android.text.TextUtils.isEmpty(r19)
                            r4 = 0
                            if (r3 != 0) goto L_0x006b
                            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x006d }
                            r5 = r19
                            r3.<init>(r5)     // Catch:{ Exception -> 0x006d }
                            java.lang.String r4 = "0"
                            java.lang.String r5 = "resultCode"
                            java.lang.String r5 = r3.optString(r5)     // Catch:{ Exception -> 0x0069 }
                            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x0069 }
                            if (r4 == 0) goto L_0x0058
                            java.lang.String r4 = "resultData"
                            java.lang.Object r4 = r3.opt(r4)     // Catch:{ Exception -> 0x0069 }
                            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch:{ Exception -> 0x0069 }
                            if (r4 == 0) goto L_0x0058
                            java.lang.String r5 = "accessCode"
                            boolean r5 = r4.has(r5)     // Catch:{ Exception -> 0x0069 }
                            if (r5 == 0) goto L_0x0058
                            com.bytedance.sdk.account.i.c.c r5 = com.bytedance.sdk.account.i.c.c.this     // Catch:{ Exception -> 0x0069 }
                            java.lang.String r6 = "accessCode"
                            java.lang.String r4 = r4.optString(r6)     // Catch:{ Exception -> 0x0069 }
                            r5.f22467e = r4     // Catch:{ Exception -> 0x0069 }
                            com.bytedance.sdk.account.i.c.c r12 = com.bytedance.sdk.account.i.c.c.this     // Catch:{ Exception -> 0x0069 }
                            com.bytedance.sdk.account.i.c.c r4 = com.bytedance.sdk.account.i.c.c.this     // Catch:{ Exception -> 0x0069 }
                            java.lang.String r13 = r4.f22467e     // Catch:{ Exception -> 0x0069 }
                            long r14 = r0     // Catch:{ Exception -> 0x0069 }
                            r16 = 0
                            com.bytedance.sdk.account.i.b.a r4 = r13     // Catch:{ Exception -> 0x0069 }
                            r17 = r4
                            r12.a(r13, r14, r16, r17)     // Catch:{ Exception -> 0x0069 }
                            return
                        L_0x0058:
                            java.lang.String r4 = "resultCode"
                            java.lang.String r4 = r3.optString(r4)     // Catch:{ Exception -> 0x0069 }
                            java.lang.String r1 = "resultMsg"
                            java.lang.String r1 = r3.optString(r1)     // Catch:{ Exception -> 0x0068 }
                            r9 = r1
                            r8 = r4
                            r4 = r3
                            goto L_0x006f
                        L_0x0068:
                            r1 = r4
                        L_0x0069:
                            r4 = r3
                            goto L_0x006d
                        L_0x006b:
                            java.lang.String r2 = "invalid_response"
                        L_0x006d:
                            r8 = r1
                            r9 = r2
                        L_0x006f:
                            com.bytedance.sdk.account.i.c.c r1 = com.bytedance.sdk.account.i.c.c.this
                            java.lang.String r2 = ""
                            r1.f22467e = r2
                            com.bytedance.sdk.account.i.c.c r1 = com.bytedance.sdk.account.i.c.c.this
                            boolean r1 = r1.f22468f
                            if (r1 == 0) goto L_0x007c
                            return
                        L_0x007c:
                            com.bytedance.sdk.account.i.c.c r1 = com.bytedance.sdk.account.i.c.c.this
                            android.os.Handler r1 = r1.g
                            if (r1 == 0) goto L_0x0095
                            com.bytedance.sdk.account.i.c.c r1 = com.bytedance.sdk.account.i.c.c.this
                            android.os.Handler r1 = r1.g
                            r2 = 1003(0x3eb, float:1.406E-42)
                            boolean r1 = r1.hasMessages(r2)
                            if (r1 == 0) goto L_0x0095
                            com.bytedance.sdk.account.i.c.c r1 = com.bytedance.sdk.account.i.c.c.this
                            android.os.Handler r1 = r1.g
                            r1.removeMessages(r2)
                        L_0x0095:
                            java.lang.String r1 = "unicom"
                            r2 = 3
                            com.bytedance.sdk.account.i.b.d r1 = com.bytedance.sdk.account.i.c.c.a((java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r1, (int) r2, (org.json.JSONObject) r4)
                            com.bytedance.sdk.account.i.c.c r2 = com.bytedance.sdk.account.i.c.c.this
                            r3 = 1012(0x3f4, float:1.418E-42)
                            com.bytedance.sdk.account.i.c.e r4 = new com.bytedance.sdk.account.i.c.e
                            com.bytedance.sdk.account.i.b.a r5 = r13
                            r4.<init>(r5, r1)
                            r2.a((int) r3, (java.lang.Object) r4)
                            com.bytedance.sdk.account.i.c.c r1 = com.bytedance.sdk.account.i.c.c.this
                            com.bytedance.sdk.account.i.c.a r1 = r1.f22465c
                            if (r1 == 0) goto L_0x00b6
                            r7 = 0
                            java.lang.String r12 = "china_unicom"
                            com.bytedance.sdk.account.i.c.c.a((boolean) r7, (java.lang.String) r8, (java.lang.String) r9, (long) r10, (java.lang.String) r12)
                        L_0x00b6:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.i.c.c.AnonymousClass8.onResult(java.lang.String):void");
                    }
                });
            }
        } else {
            a(this.f22467e, System.currentTimeMillis(), true, aVar);
        }
    }

    public final void a(String str, final a aVar) {
        this.f22463a = false;
        this.f22468f = false;
        if ("mobile".equals(str)) {
            if (this.k == null) {
                if (aVar != null && !this.f22463a) {
                    aVar.b(a("-3", "sdk_init_error", "mobile", 1, (JSONObject) null));
                }
                if (this.f22465c != null) {
                    a(false, "-3", "sdk_init_error", 0, "china_mobile");
                }
            } else {
                final long currentTimeMillis = System.currentTimeMillis();
                this.i.getPhoneInfo(this.k.f22452a, this.k.f22453b, new TokenListener() {
                    public final void onGetTokenComplete(JSONObject jSONObject) {
                        String str;
                        String str2 = "-1";
                        long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                        if (jSONObject == null) {
                            str = "invalid_response";
                        } else if (jSONObject.has("securityphone")) {
                            String optString = jSONObject.optString("securityphone");
                            Bundle bundle = new Bundle();
                            bundle.putString("security_phone", optString);
                            bundle.putString("net_type", "mobile");
                            bundle.putString("raw_result", jSONObject.toString());
                            c.this.a(1011, (Object) new e(aVar, bundle));
                            if (c.this.f22465c != null) {
                                c.a(true, (String) null, (String) null, currentTimeMillis, "china_mobile");
                            }
                            return;
                        } else {
                            str2 = jSONObject.optString("resultCode");
                            str = jSONObject.optString("resultDesc");
                        }
                        String str3 = str2;
                        String str4 = str;
                        c.this.a(1012, (Object) new e(aVar, c.a(str3, str4, "mobile", 1, jSONObject)));
                        if (c.this.f22465c != null) {
                            c.a(false, str3, str4, currentTimeMillis, "china_mobile");
                        }
                    }
                });
            }
        } else if ("telecom".equals(str)) {
            this.f22466d = "";
            if (this.l == null) {
                if (aVar != null && !this.f22463a) {
                    aVar.b(a("-3", "sdk_init_error", "telecom", 1, (JSONObject) null));
                }
                if (this.f22465c != null) {
                    a(false, "-3", "sdk_init_error", 0, "china_telecom");
                }
            } else {
                final long currentTimeMillis2 = System.currentTimeMillis();
                CtAuth.getInstance().requestPreCode(new CtSetting((int) this.l.f22457c, (int) this.l.f22458d, (int) this.l.f22459e), new ResultListener() {
                    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b1  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void onResult(java.lang.String r13) {
                        /*
                            r12 = this;
                            java.lang.String r0 = "-1"
                            java.lang.String r1 = "unknown"
                            long r2 = java.lang.System.currentTimeMillis()
                            long r4 = r2
                            long r2 = r2 - r4
                            boolean r4 = android.text.TextUtils.isEmpty(r13)
                            r5 = 0
                            if (r4 != 0) goto L_0x008c
                            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x008e }
                            r4.<init>(r13)     // Catch:{ Exception -> 0x008e }
                            java.lang.String r5 = "result"
                            int r5 = r4.optInt(r5)     // Catch:{ Exception -> 0x008a }
                            if (r5 != 0) goto L_0x0075
                            java.lang.String r5 = "data"
                            java.lang.Object r5 = r4.opt(r5)     // Catch:{ Exception -> 0x008a }
                            org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch:{ Exception -> 0x008a }
                            if (r5 == 0) goto L_0x0075
                            java.lang.String r6 = "number"
                            boolean r6 = r5.has(r6)     // Catch:{ Exception -> 0x008a }
                            if (r6 == 0) goto L_0x0075
                            java.lang.String r6 = "number"
                            java.lang.String r6 = r5.optString(r6)     // Catch:{ Exception -> 0x008a }
                            com.bytedance.sdk.account.i.c.c r7 = com.bytedance.sdk.account.i.c.c.this     // Catch:{ Exception -> 0x008a }
                            java.lang.String r8 = "accessCode"
                            java.lang.String r5 = r5.optString(r8)     // Catch:{ Exception -> 0x008a }
                            r7.f22466d = r5     // Catch:{ Exception -> 0x008a }
                            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ Exception -> 0x008a }
                            r5.<init>()     // Catch:{ Exception -> 0x008a }
                            java.lang.String r7 = "security_phone"
                            r5.putString(r7, r6)     // Catch:{ Exception -> 0x008a }
                            java.lang.String r6 = "net_type"
                            java.lang.String r7 = "telecom"
                            r5.putString(r6, r7)     // Catch:{ Exception -> 0x008a }
                            java.lang.String r6 = "raw_result"
                            r5.putString(r6, r13)     // Catch:{ Exception -> 0x008a }
                            com.bytedance.sdk.account.i.c.c r13 = com.bytedance.sdk.account.i.c.c.this     // Catch:{ Exception -> 0x008a }
                            r6 = 1011(0x3f3, float:1.417E-42)
                            com.bytedance.sdk.account.i.c.e r7 = new com.bytedance.sdk.account.i.c.e     // Catch:{ Exception -> 0x008a }
                            com.bytedance.sdk.account.i.b.a r8 = r8     // Catch:{ Exception -> 0x008a }
                            r7.<init>(r8, r5)     // Catch:{ Exception -> 0x008a }
                            r13.a((int) r6, (java.lang.Object) r7)     // Catch:{ Exception -> 0x008a }
                            com.bytedance.sdk.account.i.c.c r13 = com.bytedance.sdk.account.i.c.c.this     // Catch:{ Exception -> 0x008a }
                            com.bytedance.sdk.account.i.c.a r13 = r13.f22465c     // Catch:{ Exception -> 0x008a }
                            if (r13 == 0) goto L_0x0074
                            r6 = 1
                            r7 = 0
                            r8 = 0
                            java.lang.String r11 = "china_telecom"
                            r9 = r2
                            com.bytedance.sdk.account.i.c.c.a((boolean) r6, (java.lang.String) r7, (java.lang.String) r8, (long) r9, (java.lang.String) r11)     // Catch:{ Exception -> 0x008a }
                        L_0x0074:
                            return
                        L_0x0075:
                            java.lang.String r13 = "result"
                            int r13 = r4.optInt(r13)     // Catch:{ Exception -> 0x008a }
                            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ Exception -> 0x008a }
                            java.lang.String r0 = "msg"
                            java.lang.String r0 = r4.optString(r0)     // Catch:{ Exception -> 0x0089 }
                            r7 = r13
                            r8 = r0
                            r5 = r4
                            goto L_0x0090
                        L_0x0089:
                            r0 = r13
                        L_0x008a:
                            r5 = r4
                            goto L_0x008e
                        L_0x008c:
                            java.lang.String r1 = "invalid_response"
                        L_0x008e:
                            r7 = r0
                            r8 = r1
                        L_0x0090:
                            com.bytedance.sdk.account.i.c.c r13 = com.bytedance.sdk.account.i.c.c.this
                            java.lang.String r0 = ""
                            r13.f22466d = r0
                            java.lang.String r13 = "telecom"
                            r0 = 1
                            com.bytedance.sdk.account.i.b.d r13 = com.bytedance.sdk.account.i.c.c.a((java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r13, (int) r0, (org.json.JSONObject) r5)
                            com.bytedance.sdk.account.i.c.c r0 = com.bytedance.sdk.account.i.c.c.this
                            r1 = 1012(0x3f4, float:1.418E-42)
                            com.bytedance.sdk.account.i.c.e r4 = new com.bytedance.sdk.account.i.c.e
                            com.bytedance.sdk.account.i.b.a r5 = r8
                            r4.<init>(r5, r13)
                            r0.a((int) r1, (java.lang.Object) r4)
                            com.bytedance.sdk.account.i.c.c r13 = com.bytedance.sdk.account.i.c.c.this
                            com.bytedance.sdk.account.i.c.a r13 = r13.f22465c
                            if (r13 == 0) goto L_0x00b8
                            r6 = 0
                            java.lang.String r11 = "china_telecom"
                            r9 = r2
                            com.bytedance.sdk.account.i.c.c.a((boolean) r6, (java.lang.String) r7, (java.lang.String) r8, (long) r9, (java.lang.String) r11)
                        L_0x00b8:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.i.c.c.AnonymousClass3.onResult(java.lang.String):void");
                    }
                });
            }
        } else if ("unicom".equals(str)) {
            this.f22467e = "";
            if (this.f22464b == null) {
                if (aVar != null && !this.f22463a) {
                    aVar.b(a("-3", "sdk_init_error", "unicom", 1, (JSONObject) null));
                }
                if (this.f22465c != null) {
                    a(false, "-3", "sdk_init_error", 0, "china_unicom");
                }
            } else {
                a(1003, (Object) new e(aVar, a("-8", "cu_request_time_out", "unicom", 1, (JSONObject) null)), this.f22464b.f22462c);
                final long currentTimeMillis3 = System.currentTimeMillis();
                this.j.getAccesscode(this.f22464b.f22460a, this.f22464b.f22461b, new com.unicom.xiaowo.login.ResultListener() {
                    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d3  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void onResult(java.lang.String r13) {
                        /*
                            r12 = this;
                            com.bytedance.sdk.account.i.c.c r0 = com.bytedance.sdk.account.i.c.c.this
                            boolean r0 = r0.f22468f
                            if (r0 == 0) goto L_0x0007
                            return
                        L_0x0007:
                            com.bytedance.sdk.account.i.c.c r0 = com.bytedance.sdk.account.i.c.c.this
                            android.os.Handler r0 = r0.g
                            if (r0 == 0) goto L_0x0020
                            com.bytedance.sdk.account.i.c.c r0 = com.bytedance.sdk.account.i.c.c.this
                            android.os.Handler r0 = r0.g
                            r1 = 1003(0x3eb, float:1.406E-42)
                            boolean r0 = r0.hasMessages(r1)
                            if (r0 == 0) goto L_0x0020
                            com.bytedance.sdk.account.i.c.c r0 = com.bytedance.sdk.account.i.c.c.this
                            android.os.Handler r0 = r0.g
                            r0.removeMessages(r1)
                        L_0x0020:
                            java.lang.String r0 = "-1"
                            java.lang.String r1 = "unknown"
                            long r2 = java.lang.System.currentTimeMillis()
                            long r4 = r0
                            long r2 = r2 - r4
                            r4 = 0
                            boolean r5 = android.text.TextUtils.isEmpty(r13)
                            if (r5 != 0) goto L_0x00ae
                            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x00b0 }
                            r5.<init>(r13)     // Catch:{ Exception -> 0x00b0 }
                            java.lang.String r4 = "0"
                            java.lang.String r6 = "resultCode"
                            java.lang.String r6 = r5.optString(r6)     // Catch:{ Exception -> 0x00ac }
                            boolean r4 = r4.equals(r6)     // Catch:{ Exception -> 0x00ac }
                            if (r4 == 0) goto L_0x009b
                            java.lang.String r4 = "resultData"
                            java.lang.Object r4 = r5.opt(r4)     // Catch:{ Exception -> 0x00ac }
                            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch:{ Exception -> 0x00ac }
                            if (r4 == 0) goto L_0x009b
                            java.lang.String r6 = "mobile"
                            boolean r6 = r4.has(r6)     // Catch:{ Exception -> 0x00ac }
                            if (r6 == 0) goto L_0x009b
                            java.lang.String r6 = "mobile"
                            java.lang.String r6 = r4.optString(r6)     // Catch:{ Exception -> 0x00ac }
                            com.bytedance.sdk.account.i.c.c r7 = com.bytedance.sdk.account.i.c.c.this     // Catch:{ Exception -> 0x00ac }
                            java.lang.String r8 = "accessCode"
                            java.lang.String r4 = r4.optString(r8)     // Catch:{ Exception -> 0x00ac }
                            r7.f22467e = r4     // Catch:{ Exception -> 0x00ac }
                            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ Exception -> 0x00ac }
                            r4.<init>()     // Catch:{ Exception -> 0x00ac }
                            java.lang.String r7 = "security_phone"
                            r4.putString(r7, r6)     // Catch:{ Exception -> 0x00ac }
                            java.lang.String r6 = "net_type"
                            java.lang.String r7 = "unicom"
                            r4.putString(r6, r7)     // Catch:{ Exception -> 0x00ac }
                            java.lang.String r6 = "raw_result"
                            r4.putString(r6, r13)     // Catch:{ Exception -> 0x00ac }
                            com.bytedance.sdk.account.i.c.c r13 = com.bytedance.sdk.account.i.c.c.this     // Catch:{ Exception -> 0x00ac }
                            r6 = 1011(0x3f3, float:1.417E-42)
                            com.bytedance.sdk.account.i.c.e r7 = new com.bytedance.sdk.account.i.c.e     // Catch:{ Exception -> 0x00ac }
                            com.bytedance.sdk.account.i.b.a r8 = r8     // Catch:{ Exception -> 0x00ac }
                            r7.<init>(r8, r4)     // Catch:{ Exception -> 0x00ac }
                            r13.a((int) r6, (java.lang.Object) r7)     // Catch:{ Exception -> 0x00ac }
                            com.bytedance.sdk.account.i.c.c r13 = com.bytedance.sdk.account.i.c.c.this     // Catch:{ Exception -> 0x00ac }
                            com.bytedance.sdk.account.i.c.a r13 = r13.f22465c     // Catch:{ Exception -> 0x00ac }
                            if (r13 == 0) goto L_0x009a
                            r6 = 1
                            r7 = 0
                            r8 = 0
                            java.lang.String r11 = "china_unicom"
                            r9 = r2
                            com.bytedance.sdk.account.i.c.c.a((boolean) r6, (java.lang.String) r7, (java.lang.String) r8, (long) r9, (java.lang.String) r11)     // Catch:{ Exception -> 0x00ac }
                        L_0x009a:
                            return
                        L_0x009b:
                            java.lang.String r13 = "resultCode"
                            java.lang.String r13 = r5.optString(r13)     // Catch:{ Exception -> 0x00ac }
                            java.lang.String r0 = "resultMsg"
                            java.lang.String r0 = r5.optString(r0)     // Catch:{ Exception -> 0x00ab }
                            r7 = r13
                            r8 = r0
                            r4 = r5
                            goto L_0x00b2
                        L_0x00ab:
                            r0 = r13
                        L_0x00ac:
                            r4 = r5
                            goto L_0x00b0
                        L_0x00ae:
                            java.lang.String r1 = "invalid_response"
                        L_0x00b0:
                            r7 = r0
                            r8 = r1
                        L_0x00b2:
                            com.bytedance.sdk.account.i.c.c r13 = com.bytedance.sdk.account.i.c.c.this
                            java.lang.String r0 = ""
                            r13.f22467e = r0
                            java.lang.String r13 = "unicom"
                            r0 = 1
                            com.bytedance.sdk.account.i.b.d r13 = com.bytedance.sdk.account.i.c.c.a((java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r13, (int) r0, (org.json.JSONObject) r4)
                            com.bytedance.sdk.account.i.c.c r0 = com.bytedance.sdk.account.i.c.c.this
                            r1 = 1012(0x3f4, float:1.418E-42)
                            com.bytedance.sdk.account.i.c.e r4 = new com.bytedance.sdk.account.i.c.e
                            com.bytedance.sdk.account.i.b.a r5 = r8
                            r4.<init>(r5, r13)
                            r0.a((int) r1, (java.lang.Object) r4)
                            com.bytedance.sdk.account.i.c.c r13 = com.bytedance.sdk.account.i.c.c.this
                            com.bytedance.sdk.account.i.c.a r13 = r13.f22465c
                            if (r13 == 0) goto L_0x00da
                            r6 = 0
                            java.lang.String r11 = "china_unicom"
                            r9 = r2
                            com.bytedance.sdk.account.i.c.c.a((boolean) r6, (java.lang.String) r7, (java.lang.String) r8, (long) r9, (java.lang.String) r11)
                        L_0x00da:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.i.c.c.AnonymousClass4.onResult(java.lang.String):void");
                    }
                });
            }
        } else {
            if (!this.f22463a) {
                d dVar = new d();
                dVar.f22438d = str;
                dVar.f22439e = 1;
                dVar.f22434a = "-2";
                dVar.f22435b = "not support operator";
                aVar.b(dVar);
            }
            if (this.f22465c != null) {
                a(false, "-2", "not support operator", 0, "others");
            }
        }
    }

    private void a(int i2, Object obj, long j2) {
        if (!this.f22463a) {
            Message obtain = Message.obtain();
            obtain.what = 1003;
            obtain.obj = obj;
            if (this.g != null) {
                this.g.sendMessageDelayed(obtain, j2);
            }
        }
    }

    public final void a(String str, final long j2, final a aVar) {
        if (this.f22463a) {
            this.f22466d = "";
        } else if (this.l == null) {
            if (aVar != null && !this.f22463a) {
                aVar.b(a("-3", "sdk_init_error", "telecom", 2, (JSONObject) null));
            }
            if (this.f22465c != null) {
                a(false, "-3", "sdk_init_error", j2, "china_telecom");
            }
            this.f22466d = "";
        } else {
            CtAuth.getInstance().requestNetworkAuth(str, new CtSetting((int) this.l.f22457c, (int) this.l.f22458d, (int) this.l.f22459e), new ResultListener() {
                /* JADX WARNING: Removed duplicated region for block: B:31:0x00c2  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onResult(java.lang.String r13) {
                    /*
                        r12 = this;
                        com.bytedance.sdk.account.i.c.c r0 = com.bytedance.sdk.account.i.c.c.this
                        java.lang.String r1 = ""
                        r0.f22466d = r1
                        java.lang.String r0 = "-1"
                        java.lang.String r1 = "unknown"
                        long r2 = java.lang.System.currentTimeMillis()
                        long r4 = r8
                        long r2 = r2 - r4
                        boolean r4 = android.text.TextUtils.isEmpty(r13)
                        r5 = 0
                        if (r4 != 0) goto L_0x00a3
                        org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x00a0 }
                        r4.<init>(r13)     // Catch:{ Exception -> 0x00a0 }
                        java.lang.String r5 = "result"
                        int r5 = r4.optInt(r5)     // Catch:{ Exception -> 0x009f }
                        if (r5 != 0) goto L_0x008a
                        java.lang.String r5 = "responseData"
                        java.lang.Object r5 = r4.opt(r5)     // Catch:{ Exception -> 0x009f }
                        org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch:{ Exception -> 0x009f }
                        if (r5 == 0) goto L_0x0087
                        java.lang.String r6 = "accessToken"
                        boolean r6 = r5.has(r6)     // Catch:{ Exception -> 0x009f }
                        if (r6 == 0) goto L_0x0087
                        java.lang.String r6 = "accessToken"
                        java.lang.String r6 = r5.optString(r6)     // Catch:{ Exception -> 0x009f }
                        android.os.Bundle r7 = new android.os.Bundle     // Catch:{ Exception -> 0x009f }
                        r7.<init>()     // Catch:{ Exception -> 0x009f }
                        java.lang.String r8 = "access_token"
                        r7.putString(r8, r6)     // Catch:{ Exception -> 0x009f }
                        java.lang.String r6 = "net_type"
                        java.lang.String r8 = "telecom"
                        r7.putString(r6, r8)     // Catch:{ Exception -> 0x009f }
                        java.lang.String r6 = "refreshToken"
                        java.lang.String r8 = "refreshToken"
                        java.lang.String r8 = r5.optString(r8)     // Catch:{ Exception -> 0x009f }
                        r7.putString(r6, r8)     // Catch:{ Exception -> 0x009f }
                        java.lang.String r6 = "openId"
                        java.lang.String r8 = "openId"
                        java.lang.String r5 = r5.optString(r8)     // Catch:{ Exception -> 0x009f }
                        r7.putString(r6, r5)     // Catch:{ Exception -> 0x009f }
                        java.lang.String r5 = "raw_result"
                        r7.putString(r5, r13)     // Catch:{ Exception -> 0x009f }
                        com.bytedance.sdk.account.i.c.c r13 = com.bytedance.sdk.account.i.c.c.this     // Catch:{ Exception -> 0x009f }
                        r5 = 1011(0x3f3, float:1.417E-42)
                        com.bytedance.sdk.account.i.c.e r6 = new com.bytedance.sdk.account.i.c.e     // Catch:{ Exception -> 0x009f }
                        com.bytedance.sdk.account.i.b.a r8 = r10     // Catch:{ Exception -> 0x009f }
                        r6.<init>(r8, r7)     // Catch:{ Exception -> 0x009f }
                        r13.a((int) r5, (java.lang.Object) r6)     // Catch:{ Exception -> 0x009f }
                        com.bytedance.sdk.account.i.c.c r13 = com.bytedance.sdk.account.i.c.c.this     // Catch:{ Exception -> 0x009f }
                        com.bytedance.sdk.account.i.c.a r13 = r13.f22465c     // Catch:{ Exception -> 0x009f }
                        if (r13 == 0) goto L_0x0086
                        r6 = 1
                        r7 = 0
                        r8 = 0
                        java.lang.String r11 = "china_telecom"
                        r9 = r2
                        com.bytedance.sdk.account.i.c.c.a((boolean) r6, (java.lang.String) r7, (java.lang.String) r8, (long) r9, (java.lang.String) r11)     // Catch:{ Exception -> 0x009f }
                    L_0x0086:
                        return
                    L_0x0087:
                        java.lang.String r13 = "invalid_response"
                        r1 = r13
                    L_0x008a:
                        java.lang.String r13 = "result"
                        int r13 = r4.optInt(r13)     // Catch:{ Exception -> 0x009f }
                        java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ Exception -> 0x009f }
                        java.lang.String r0 = "msg"
                        java.lang.String r0 = r4.optString(r0)     // Catch:{ Exception -> 0x009e }
                        r7 = r13
                        r8 = r0
                        r5 = r4
                        goto L_0x00a7
                    L_0x009e:
                        r0 = r13
                    L_0x009f:
                        r5 = r4
                    L_0x00a0:
                        r7 = r0
                        r8 = r1
                        goto L_0x00a7
                    L_0x00a3:
                        java.lang.String r13 = "invalid_response"
                        r8 = r13
                        r7 = r0
                    L_0x00a7:
                        java.lang.String r13 = "telecom"
                        r0 = 2
                        com.bytedance.sdk.account.i.b.d r13 = com.bytedance.sdk.account.i.c.c.a((java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r13, (int) r0, (org.json.JSONObject) r5)
                        com.bytedance.sdk.account.i.c.c r0 = com.bytedance.sdk.account.i.c.c.this
                        r1 = 1012(0x3f4, float:1.418E-42)
                        com.bytedance.sdk.account.i.c.e r4 = new com.bytedance.sdk.account.i.c.e
                        com.bytedance.sdk.account.i.b.a r5 = r10
                        r4.<init>(r5, r13)
                        r0.a((int) r1, (java.lang.Object) r4)
                        com.bytedance.sdk.account.i.c.c r13 = com.bytedance.sdk.account.i.c.c.this
                        com.bytedance.sdk.account.i.c.a r13 = r13.f22465c
                        if (r13 == 0) goto L_0x00c9
                        r6 = 0
                        java.lang.String r11 = "china_telecom"
                        r9 = r2
                        com.bytedance.sdk.account.i.c.c.a((boolean) r6, (java.lang.String) r7, (java.lang.String) r8, (long) r9, (java.lang.String) r11)
                    L_0x00c9:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.i.c.c.AnonymousClass7.onResult(java.lang.String):void");
                }
            });
        }
    }

    public final void a(String str, final long j2, boolean z, final a aVar) {
        if (this.f22463a) {
            this.f22467e = "";
        } else if (this.f22464b == null) {
            if (aVar != null && !this.f22463a) {
                aVar.b(a("-3", "sdk_init_error", "unicom", 2, (JSONObject) null));
            }
            if (this.f22465c != null) {
                a(false, "-3", "sdk_init_error", j2, "china_unicom");
            }
            this.f22467e = "";
        } else if (this.f22468f) {
            this.f22467e = "";
        } else {
            if (z) {
                a(1003, (Object) new e(aVar, a("-8", "cu_request_time_out", "unicom", 3, (JSONObject) null)), this.f22464b.f22462c);
            }
            this.j.getToken(this.f22464b.f22460a, this.f22464b.f22461b, str, new com.unicom.xiaowo.login.ResultListener() {
                /* JADX WARNING: Removed duplicated region for block: B:39:0x00e8  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onResult(java.lang.String r14) {
                    /*
                        r13 = this;
                        com.bytedance.sdk.account.i.c.c r0 = com.bytedance.sdk.account.i.c.c.this
                        java.lang.String r1 = ""
                        r0.f22467e = r1
                        com.bytedance.sdk.account.i.c.c r0 = com.bytedance.sdk.account.i.c.c.this
                        boolean r0 = r0.f22468f
                        if (r0 == 0) goto L_0x000d
                        return
                    L_0x000d:
                        com.bytedance.sdk.account.i.c.c r0 = com.bytedance.sdk.account.i.c.c.this
                        android.os.Handler r0 = r0.g
                        if (r0 == 0) goto L_0x0026
                        com.bytedance.sdk.account.i.c.c r0 = com.bytedance.sdk.account.i.c.c.this
                        android.os.Handler r0 = r0.g
                        r1 = 1003(0x3eb, float:1.406E-42)
                        boolean r0 = r0.hasMessages(r1)
                        if (r0 == 0) goto L_0x0026
                        com.bytedance.sdk.account.i.c.c r0 = com.bytedance.sdk.account.i.c.c.this
                        android.os.Handler r0 = r0.g
                        r0.removeMessages(r1)
                    L_0x0026:
                        java.lang.String r0 = "-1"
                        java.lang.String r1 = "unknown"
                        r2 = 0
                        long r3 = java.lang.System.currentTimeMillis()
                        long r5 = r8
                        long r3 = r3 - r5
                        boolean r5 = android.text.TextUtils.isEmpty(r14)
                        if (r5 != 0) goto L_0x00c9
                        org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x00c6 }
                        r5.<init>(r14)     // Catch:{ Exception -> 0x00c6 }
                        java.lang.String r2 = "0"
                        java.lang.String r6 = "resultCode"
                        java.lang.String r6 = r5.optString(r6)     // Catch:{ Exception -> 0x00c5 }
                        boolean r2 = r2.equals(r6)     // Catch:{ Exception -> 0x00c5 }
                        if (r2 == 0) goto L_0x00b4
                        java.lang.String r2 = "resultData"
                        java.lang.Object r2 = r5.opt(r2)     // Catch:{ Exception -> 0x00c5 }
                        org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch:{ Exception -> 0x00c5 }
                        if (r2 == 0) goto L_0x00b1
                        java.lang.String r6 = "access_token"
                        boolean r6 = r2.has(r6)     // Catch:{ Exception -> 0x00c5 }
                        if (r6 == 0) goto L_0x00b1
                        java.lang.String r6 = "access_token"
                        java.lang.String r6 = r2.optString(r6)     // Catch:{ Exception -> 0x00c5 }
                        android.os.Bundle r7 = new android.os.Bundle     // Catch:{ Exception -> 0x00c5 }
                        r7.<init>()     // Catch:{ Exception -> 0x00c5 }
                        java.lang.String r8 = "access_token"
                        r7.putString(r8, r6)     // Catch:{ Exception -> 0x00c5 }
                        java.lang.String r6 = "net_type"
                        java.lang.String r8 = "unicom"
                        r7.putString(r6, r8)     // Catch:{ Exception -> 0x00c5 }
                        java.lang.String r6 = "expires_in"
                        java.lang.String r8 = "expires_in"
                        long r8 = r2.optLong(r8)     // Catch:{ Exception -> 0x00c5 }
                        java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00c5 }
                        r7.putString(r6, r8)     // Catch:{ Exception -> 0x00c5 }
                        java.lang.String r6 = "openId"
                        java.lang.String r8 = "open_id"
                        java.lang.String r2 = r2.optString(r8)     // Catch:{ Exception -> 0x00c5 }
                        r7.putString(r6, r2)     // Catch:{ Exception -> 0x00c5 }
                        java.lang.String r2 = "raw_result"
                        r7.putString(r2, r14)     // Catch:{ Exception -> 0x00c5 }
                        com.bytedance.sdk.account.i.c.c r14 = com.bytedance.sdk.account.i.c.c.this     // Catch:{ Exception -> 0x00c5 }
                        r2 = 1011(0x3f3, float:1.417E-42)
                        com.bytedance.sdk.account.i.c.e r6 = new com.bytedance.sdk.account.i.c.e     // Catch:{ Exception -> 0x00c5 }
                        com.bytedance.sdk.account.i.b.a r8 = r11     // Catch:{ Exception -> 0x00c5 }
                        r6.<init>(r8, r7)     // Catch:{ Exception -> 0x00c5 }
                        r14.a((int) r2, (java.lang.Object) r6)     // Catch:{ Exception -> 0x00c5 }
                        com.bytedance.sdk.account.i.c.c r14 = com.bytedance.sdk.account.i.c.c.this     // Catch:{ Exception -> 0x00c5 }
                        com.bytedance.sdk.account.i.c.a r14 = r14.f22465c     // Catch:{ Exception -> 0x00c5 }
                        if (r14 == 0) goto L_0x00b0
                        r7 = 1
                        r8 = 0
                        r9 = 0
                        java.lang.String r12 = "china_unicom"
                        r10 = r3
                        com.bytedance.sdk.account.i.c.c.a((boolean) r7, (java.lang.String) r8, (java.lang.String) r9, (long) r10, (java.lang.String) r12)     // Catch:{ Exception -> 0x00c5 }
                    L_0x00b0:
                        return
                    L_0x00b1:
                        java.lang.String r14 = "invalid_response"
                        r1 = r14
                    L_0x00b4:
                        java.lang.String r14 = "resultCode"
                        java.lang.String r14 = r5.optString(r14)     // Catch:{ Exception -> 0x00c5 }
                        java.lang.String r0 = "resultMsg"
                        java.lang.String r0 = r5.optString(r0)     // Catch:{ Exception -> 0x00c4 }
                        r8 = r14
                        r9 = r0
                        r2 = r5
                        goto L_0x00cd
                    L_0x00c4:
                        r0 = r14
                    L_0x00c5:
                        r2 = r5
                    L_0x00c6:
                        r8 = r0
                        r9 = r1
                        goto L_0x00cd
                    L_0x00c9:
                        java.lang.String r14 = "invalid_response"
                        r9 = r14
                        r8 = r0
                    L_0x00cd:
                        java.lang.String r14 = "unicom"
                        r0 = 2
                        com.bytedance.sdk.account.i.b.d r14 = com.bytedance.sdk.account.i.c.c.a((java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r14, (int) r0, (org.json.JSONObject) r2)
                        com.bytedance.sdk.account.i.c.c r0 = com.bytedance.sdk.account.i.c.c.this
                        r1 = 1012(0x3f4, float:1.418E-42)
                        com.bytedance.sdk.account.i.c.e r2 = new com.bytedance.sdk.account.i.c.e
                        com.bytedance.sdk.account.i.b.a r5 = r11
                        r2.<init>(r5, r14)
                        r0.a((int) r1, (java.lang.Object) r2)
                        com.bytedance.sdk.account.i.c.c r14 = com.bytedance.sdk.account.i.c.c.this
                        com.bytedance.sdk.account.i.c.a r14 = r14.f22465c
                        if (r14 == 0) goto L_0x00ef
                        r7 = 0
                        java.lang.String r12 = "china_unicom"
                        r10 = r3
                        com.bytedance.sdk.account.i.c.c.a((boolean) r7, (java.lang.String) r8, (java.lang.String) r9, (long) r10, (java.lang.String) r12)
                    L_0x00ef:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.i.c.c.AnonymousClass9.onResult(java.lang.String):void");
                }
            });
        }
    }

    public static d a(String str, String str2, String str3, int i2, JSONObject jSONObject) {
        d dVar = new d();
        dVar.f22438d = str3;
        dVar.f22434a = str;
        dVar.f22435b = str2;
        dVar.f22439e = i2;
        dVar.f22437c = jSONObject;
        return dVar;
    }

    public static JSONObject a(boolean z, String str, String str2, long j2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result_value", z ? 1 : 0);
            if (!z) {
                jSONObject.put("error_code", str);
                jSONObject.put("error_msg", str2);
            }
            jSONObject.put("duration", j2);
            jSONObject.put("carrier", str3);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
