package com.bytedance.sdk.account.d;

import android.content.Context;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.sdk.account.api.b;
import com.bytedance.sdk.account.api.b.b;
import com.bytedance.sdk.account.api.b.c;
import com.bytedance.sdk.account.api.b.d;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class g<R extends BaseApiResponse> implements com.bytedance.sdk.account.api.b.a, c {

    /* renamed from: d  reason: collision with root package name */
    static List<String> f22341d;
    private static b j = new b() {
        public final d a(c cVar) {
            a aVar = new a(cVar, (byte) 0);
            aVar.b();
            return aVar;
        }
    };
    private static h k = new h() {
        public final void a(i iVar) {
            WeakHandler weakHandler = ((e) e.a()).z;
            Message obtain = Message.obtain(weakHandler, 100);
            obtain.obj = iVar;
            weakHandler.sendMessage(obtain);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    protected WeakReference<Context> f22342a;

    /* renamed from: b  reason: collision with root package name */
    protected com.bytedance.sdk.account.c.a f22343b;

    /* renamed from: c  reason: collision with root package name */
    protected WeakReference<? extends com.bytedance.sdk.account.api.call.a> f22344c;

    /* renamed from: e  reason: collision with root package name */
    private String f22345e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.sdk.account.c.b f22346f;
    private com.bytedance.sdk.account.api.call.a g;
    private d h;
    private boolean i;

    static class a extends com.bytedance.sdk.account.utils.a implements d {

        /* renamed from: f  reason: collision with root package name */
        private c f22347f;

        public final void run() {
            this.f22347f.b();
        }

        private a(c cVar) {
            this.f22347f = cVar;
        }

        /* synthetic */ a(c cVar, byte b2) {
            this(cVar);
        }
    }

    /* access modifiers changed from: protected */
    public abstract R a(boolean z, com.bytedance.sdk.account.c.b bVar);

    public abstract void a(R r);

    /* access modifiers changed from: protected */
    public abstract void a(JSONObject jSONObject, JSONObject jSONObject2);

    /* access modifiers changed from: protected */
    public abstract void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception;

    public final void a() {
        this.g = null;
    }

    public final void c() {
        a();
        d dVar = this.h;
        if (dVar != null) {
            dVar.c();
        }
    }

    public final void d() {
        this.h = j.a(this);
    }

    public final void b() {
        BaseApiResponse e2 = e();
        if (e2 != null) {
            a((R) e2);
            k.a(new i(this.f22344c, e2));
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f22341d = arrayList;
        arrayList.add(b.a.a("/passport/mobile/register/"));
        f22341d.add(b.a.d());
        f22341d.add(b.a.a("/passport/mobile/sms_login_only/"));
        f22341d.add(b.a.a("/passport/mobile/sms_login_continue/"));
        f22341d.add(b.a.c());
        f22341d.add(b.a.a("/passport/email/login/"));
        f22341d.add(b.a.a("/passport/email/register/v2/"));
        f22341d.add(b.a.a("/passport/user/login/"));
        f22341d.add(b.a.a("/passport/username/register/"));
        f22341d.add(b.a.i());
        f22341d.add(b.a.h());
        f22341d.add(b.a.a("/passport/auth/one_login_by_ticket/"));
        f22341d.add(b.C0231b.b());
        f22341d.add(b.C0231b.a("/passport/auth/register/"));
        f22341d.add(b.C0231b.a("/passport/auth/login_only/"));
        f22341d.add(b.a.a("/passport/email/register_verify_login/"));
        f22341d.add(b.a.a("/passport/password/reset_by_email_ticket/"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x014d A[Catch:{ Throwable -> 0x017f }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0152 A[Catch:{ Throwable -> 0x017f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private R e() {
        /*
            r11 = this;
            r0 = 0
            r11.i = r0
            r1 = -12
            r2 = -18
            java.lang.ref.WeakReference<android.content.Context> r3 = r11.f22342a     // Catch:{ Throwable -> 0x017f }
            java.lang.Object r3 = r3.get()     // Catch:{ Throwable -> 0x017f }
            if (r3 != 0) goto L_0x0015
            com.bytedance.sdk.account.c.b r3 = r11.f22346f     // Catch:{ Throwable -> 0x017f }
            r3.f22329b = r2     // Catch:{ Throwable -> 0x017f }
            goto L_0x017c
        L_0x0015:
            java.lang.ref.WeakReference<android.content.Context> r3 = r11.f22342a     // Catch:{ Throwable -> 0x017f }
            java.lang.Object r3 = r3.get()     // Catch:{ Throwable -> 0x017f }
            android.content.Context r3 = (android.content.Context) r3     // Catch:{ Throwable -> 0x017f }
            com.bytedance.sdk.account.utils.d$a r3 = com.bytedance.sdk.account.utils.d.b(r3)     // Catch:{ Throwable -> 0x017f }
            com.bytedance.sdk.account.utils.d$a r4 = com.bytedance.sdk.account.utils.d.a.NONE     // Catch:{ Throwable -> 0x017f }
            if (r3 != r4) goto L_0x002b
            com.bytedance.sdk.account.c.b r3 = r11.f22346f     // Catch:{ Throwable -> 0x017f }
            r3.f22329b = r1     // Catch:{ Throwable -> 0x017f }
            goto L_0x017c
        L_0x002b:
            java.lang.String r3 = "get"
            com.bytedance.sdk.account.c.a r4 = r11.f22343b     // Catch:{ Throwable -> 0x017f }
            java.lang.String r4 = r4.f22323b     // Catch:{ Throwable -> 0x017f }
            boolean r3 = r3.equals(r4)     // Catch:{ Throwable -> 0x017f }
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 362(0x16a, float:5.07E-43)
            r6 = 0
            if (r3 == 0) goto L_0x00c0
            java.lang.String r3 = r11.f22345e     // Catch:{ Throwable -> 0x017f }
            com.bytedance.sdk.account.c.a r7 = r11.f22343b     // Catch:{ Throwable -> 0x017f }
            java.util.Map<java.lang.String, java.lang.String> r7 = r7.f22324c     // Catch:{ Throwable -> 0x017f }
            com.bytedance.sdk.account.utils.f r8 = new com.bytedance.sdk.account.utils.f     // Catch:{ Throwable -> 0x017f }
            r8.<init>(r3)     // Catch:{ Throwable -> 0x017f }
            if (r7 == 0) goto L_0x0086
            java.util.Set r7 = r7.entrySet()     // Catch:{ Throwable -> 0x017f }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Throwable -> 0x017f }
        L_0x0052:
            boolean r9 = r7.hasNext()     // Catch:{ Throwable -> 0x017f }
            if (r9 == 0) goto L_0x0086
            java.lang.Object r9 = r7.next()     // Catch:{ Throwable -> 0x017f }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ Throwable -> 0x017f }
            java.lang.Object r10 = r9.getKey()     // Catch:{ Throwable -> 0x017f }
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ Throwable -> 0x017f }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Throwable -> 0x017f }
            if (r10 != 0) goto L_0x0052
            java.lang.Object r10 = r9.getValue()     // Catch:{ Throwable -> 0x017f }
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ Throwable -> 0x017f }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Throwable -> 0x017f }
            if (r10 != 0) goto L_0x0052
            java.lang.Object r10 = r9.getKey()     // Catch:{ Throwable -> 0x017f }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Throwable -> 0x017f }
            java.lang.Object r9 = r9.getValue()     // Catch:{ Throwable -> 0x017f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Throwable -> 0x017f }
            r8.a((java.lang.String) r10, (java.lang.String) r9)     // Catch:{ Throwable -> 0x017f }
            goto L_0x0052
        L_0x0086:
            com.ss.android.b r7 = com.ss.android.account.c.a()     // Catch:{ Throwable -> 0x017f }
            boolean r7 = r7.d()     // Catch:{ Throwable -> 0x017f }
            if (r7 == 0) goto L_0x009f
            java.util.List<java.lang.String> r7 = f22341d     // Catch:{ Throwable -> 0x017f }
            boolean r3 = r7.contains(r3)     // Catch:{ Throwable -> 0x017f }
            if (r3 == 0) goto L_0x009f
            java.lang.String r3 = "multi_login"
            java.lang.String r7 = "1"
            r8.a((java.lang.String) r3, (java.lang.String) r7)     // Catch:{ Throwable -> 0x017f }
        L_0x009f:
            java.lang.String r3 = "account_sdk_source"
            java.lang.String r7 = "app"
            r8.a((java.lang.String) r3, (java.lang.String) r7)     // Catch:{ Throwable -> 0x017f }
            java.lang.String r3 = "account_sdk_version"
            r8.a((java.lang.String) r3, (int) r5)     // Catch:{ Throwable -> 0x017f }
            java.lang.String r3 = r8.toString()     // Catch:{ Throwable -> 0x017f }
            com.ss.android.b r5 = com.ss.android.account.c.a()     // Catch:{ Throwable -> 0x017f }
            com.bytedance.sdk.account.c r5 = r5.c()     // Catch:{ Throwable -> 0x017f }
            if (r5 == 0) goto L_0x0147
            java.lang.String r3 = r5.a((int) r4, (java.lang.String) r3)     // Catch:{ Throwable -> 0x017f }
        L_0x00bd:
            r6 = r3
            goto L_0x0147
        L_0x00c0:
            java.lang.String r3 = "post"
            com.bytedance.sdk.account.c.a r7 = r11.f22343b     // Catch:{ Throwable -> 0x017f }
            java.lang.String r7 = r7.f22323b     // Catch:{ Throwable -> 0x017f }
            boolean r3 = r3.equals(r7)     // Catch:{ Throwable -> 0x017f }
            if (r3 == 0) goto L_0x0147
            java.lang.String r3 = r11.f22345e     // Catch:{ Throwable -> 0x017f }
            com.bytedance.sdk.account.c.a r7 = r11.f22343b     // Catch:{ Throwable -> 0x017f }
            java.util.Map<java.lang.String, java.lang.String> r7 = r7.f22324c     // Catch:{ Throwable -> 0x017f }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ Throwable -> 0x017f }
            r8.<init>()     // Catch:{ Throwable -> 0x017f }
            com.bytedance.sdk.account.utils.f r9 = new com.bytedance.sdk.account.utils.f     // Catch:{ Throwable -> 0x017f }
            r9.<init>(r3)     // Catch:{ Throwable -> 0x017f }
            if (r7 == 0) goto L_0x0116
            java.util.Set r3 = r7.entrySet()     // Catch:{ Throwable -> 0x017f }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x017f }
        L_0x00e6:
            boolean r7 = r3.hasNext()     // Catch:{ Throwable -> 0x017f }
            if (r7 == 0) goto L_0x0116
            java.lang.Object r7 = r3.next()     // Catch:{ Throwable -> 0x017f }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ Throwable -> 0x017f }
            java.lang.Object r10 = r7.getKey()     // Catch:{ Throwable -> 0x017f }
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ Throwable -> 0x017f }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Throwable -> 0x017f }
            if (r10 != 0) goto L_0x00e6
            java.lang.Object r10 = r7.getValue()     // Catch:{ Throwable -> 0x017f }
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ Throwable -> 0x017f }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Throwable -> 0x017f }
            if (r10 != 0) goto L_0x00e6
            java.lang.Object r10 = r7.getKey()     // Catch:{ Throwable -> 0x017f }
            java.lang.Object r7 = r7.getValue()     // Catch:{ Throwable -> 0x017f }
            r8.put(r10, r7)     // Catch:{ Throwable -> 0x017f }
            goto L_0x00e6
        L_0x0116:
            java.lang.String r3 = "account_sdk_source"
            java.lang.String r7 = "app"
            r8.put(r3, r7)     // Catch:{ Throwable -> 0x017f }
            com.ss.android.b r3 = com.ss.android.account.c.a()     // Catch:{ Throwable -> 0x017f }
            boolean r3 = r3.d()     // Catch:{ Throwable -> 0x017f }
            if (r3 == 0) goto L_0x012e
            java.lang.String r3 = "multi_login"
            java.lang.String r7 = "1"
            r8.put(r3, r7)     // Catch:{ Throwable -> 0x017f }
        L_0x012e:
            java.lang.String r3 = "account_sdk_version"
            r9.a((java.lang.String) r3, (int) r5)     // Catch:{ Throwable -> 0x017f }
            java.lang.String r3 = r9.toString()     // Catch:{ Throwable -> 0x017f }
            com.ss.android.b r5 = com.ss.android.account.c.a()     // Catch:{ Throwable -> 0x017f }
            com.bytedance.sdk.account.c r5 = r5.c()     // Catch:{ Throwable -> 0x017f }
            if (r5 == 0) goto L_0x0147
            java.lang.String r3 = r5.a(r4, r3, r8)     // Catch:{ Throwable -> 0x017f }
            goto L_0x00bd
        L_0x0147:
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x017f }
            if (r3 == 0) goto L_0x0152
            com.bytedance.sdk.account.c.b r3 = r11.f22346f     // Catch:{ Throwable -> 0x017f }
            r3.f22329b = r2     // Catch:{ Throwable -> 0x017f }
            goto L_0x017c
        L_0x0152:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x017f }
            r3.<init>(r6)     // Catch:{ Throwable -> 0x017f }
            org.json.JSONObject r4 = a((org.json.JSONObject) r3)     // Catch:{ Throwable -> 0x017f }
            java.lang.String r5 = "message"
            java.lang.String r5 = r3.optString(r5)     // Catch:{ Throwable -> 0x017f }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x017f }
            if (r6 != 0) goto L_0x016c
            boolean r0 = r11.a((org.json.JSONObject) r3, (org.json.JSONObject) r4, (java.lang.String) r5)     // Catch:{ Throwable -> 0x017f }
            goto L_0x017c
        L_0x016c:
            if (r4 == 0) goto L_0x017c
            org.json.JSONObject r0 = a((org.json.JSONObject) r4)     // Catch:{ Throwable -> 0x017f }
            java.lang.String r3 = "message"
            java.lang.String r3 = r4.optString(r3)     // Catch:{ Throwable -> 0x017f }
            boolean r0 = r11.a((org.json.JSONObject) r4, (org.json.JSONObject) r0, (java.lang.String) r3)     // Catch:{ Throwable -> 0x017f }
        L_0x017c:
            r11.i = r0     // Catch:{ Throwable -> 0x017f }
            goto L_0x01d4
        L_0x017f:
            r0 = move-exception
            com.bytedance.sdk.account.c.b r3 = r11.f22346f
            java.lang.ref.WeakReference<android.content.Context> r4 = r11.f22342a
            java.lang.Object r4 = r4.get()
            android.content.Context r4 = (android.content.Context) r4
            com.ss.android.b r5 = com.ss.android.account.c.a()
            com.bytedance.sdk.account.c r5 = r5.c()
            if (r5 == 0) goto L_0x019d
            int r5 = r5.a((android.content.Context) r4, (java.lang.Throwable) r0)
            if (r5 < 0) goto L_0x019b
            goto L_0x019d
        L_0x019b:
            r0 = r5
            goto L_0x01d2
        L_0x019d:
            boolean r5 = r0 instanceof org.apache.http.conn.ConnectTimeoutException
            r6 = -14
            r7 = -15
            if (r5 == 0) goto L_0x01a8
            r0 = -13
            goto L_0x01c4
        L_0x01a8:
            boolean r5 = r0 instanceof java.net.SocketTimeoutException
            if (r5 == 0) goto L_0x01af
            r0 = -14
            goto L_0x01c4
        L_0x01af:
            boolean r5 = r0 instanceof java.net.SocketException
            if (r5 == 0) goto L_0x01b6
        L_0x01b3:
            r0 = -15
            goto L_0x01c4
        L_0x01b6:
            boolean r5 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r5 == 0) goto L_0x01bd
            r0 = -21
            goto L_0x01c4
        L_0x01bd:
            boolean r0 = r0 instanceof java.io.IOException
            if (r0 == 0) goto L_0x01c2
            goto L_0x01b3
        L_0x01c2:
            r0 = -18
        L_0x01c4:
            if (r4 == 0) goto L_0x01d2
            if (r0 == r7) goto L_0x01ca
            if (r0 != r6) goto L_0x01d2
        L_0x01ca:
            boolean r2 = com.bytedance.sdk.account.utils.c.a(r4)
            if (r2 != 0) goto L_0x01d2
            r0 = -12
        L_0x01d2:
            r3.f22329b = r0
        L_0x01d4:
            boolean r0 = r11.i
            com.bytedance.sdk.account.c.b r1 = r11.f22346f
            com.bytedance.sdk.account.api.call.BaseApiResponse r0 = r11.a((boolean) r0, (com.bytedance.sdk.account.c.b) r1)
            if (r0 == 0) goto L_0x0203
            com.bytedance.sdk.account.c.b r1 = r11.f22346f
            int r1 = r1.f22329b
            if (r1 >= 0) goto L_0x0203
            int r1 = r0.error
            if (r1 != 0) goto L_0x01ee
            com.bytedance.sdk.account.c.b r1 = r11.f22346f
            int r1 = r1.f22329b
            r0.error = r1
        L_0x01ee:
            boolean r1 = r0 instanceof com.bytedance.sdk.account.api.call.c
            if (r1 == 0) goto L_0x0203
            r1 = r0
            com.bytedance.sdk.account.api.call.c r1 = (com.bytedance.sdk.account.api.call.c) r1
            T r1 = r1.f22251a
            if (r1 == 0) goto L_0x0203
            int r2 = r1.g
            if (r2 != 0) goto L_0x0203
            com.bytedance.sdk.account.c.b r2 = r11.f22346f
            int r2 = r2.f22329b
            r1.g = r2
        L_0x0203:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.d.g.e():com.bytedance.sdk.account.api.call.BaseApiResponse");
    }

    private static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null || !jSONObject.has("data")) {
            return null;
        }
        try {
            Object opt = jSONObject.opt("data");
            if (opt == null) {
                return null;
            }
            if (opt instanceof JSONObject) {
                jSONObject2 = (JSONObject) opt;
            } else {
                if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("data", jSONArray);
                    } catch (Exception unused) {
                    }
                    jSONObject2 = jSONObject3;
                }
                jSONObject2 = null;
            }
            return jSONObject2;
        } catch (Exception unused2) {
        }
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str) throws Exception {
        if (!"success".equals(str)) {
            a(str, jSONObject, jSONObject2);
            return false;
        }
        if (jSONObject2 != null) {
            b(jSONObject, jSONObject2);
        }
        return true;
    }

    public g(Context context, com.bytedance.sdk.account.c.a aVar, com.bytedance.sdk.account.api.call.a aVar2) {
        this.f22342a = new WeakReference<>(context);
        this.f22345e = aVar.f22322a;
        this.f22343b = aVar;
        this.g = aVar2;
        if (aVar2 != null) {
            aVar2.f22331b = this;
        }
        this.f22344c = new WeakReference<>(aVar2);
        this.f22346f = new com.bytedance.sdk.account.c.b(aVar);
    }

    private void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (("error".equals(str) || "exception".equals(str)) && jSONObject2 != null) {
            if (jSONObject2.has("error_code")) {
                this.f22346f.f22329b = jSONObject2.optInt("error_code", this.f22346f.f22329b);
            } else if (jSONObject2.has("code")) {
                this.f22346f.f22329b = jSONObject2.optInt("code", this.f22346f.f22329b);
            }
            this.f22346f.f22330c = jSONObject2.optString("description");
            a(jSONObject2, jSONObject);
        }
    }
}
