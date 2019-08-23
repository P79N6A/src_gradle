package com.bytedance.android.livesdk.browser.jsbridge.c;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.utils.af;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.wallet.f;
import com.bytedance.android.livesdk.wallet.k;
import com.bytedance.android.livesdkapi.depend.model.a;
import com.bytedance.android.livesdkapi.depend.model.b;
import com.bytedance.android.livesdkapi.depend.model.c;
import com.bytedance.android.livesdkapi.host.n;
import com.bytedance.android.livesdkapi.host.r;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9456a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<Context> f9457b;

    /* renamed from: c  reason: collision with root package name */
    public c f9458c;

    /* renamed from: d  reason: collision with root package name */
    public ProgressDialog f9459d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.android.livesdk.wallet.e f9460e;

    /* renamed from: f  reason: collision with root package name */
    private n f9461f = TTLiveSDKContext.getHostService().f();

    public e(WeakReference<Context> weakReference) {
        this.f9457b = weakReference;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: android.util.Pair} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a(org.json.JSONObject r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f9456a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<org.json.JSONObject> r3 = org.json.JSONObject.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Integer.TYPE
            r5 = 0
            r6 = 3623(0xe27, float:5.077E-42)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f9456a
            r13 = 0
            r14 = 3623(0xe27, float:5.077E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Integer.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x003b:
            if (r0 != 0) goto L_0x003e
            return r9
        L_0x003e:
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ NullPointerException -> 0x01bc }
            r2[r9] = r0     // Catch:{ NullPointerException -> 0x01bc }
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f9456a     // Catch:{ NullPointerException -> 0x01bc }
            r5 = 1
            r6 = 3627(0xe2b, float:5.083E-42)
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.Class<org.json.JSONObject> r8 = org.json.JSONObject.class
            r7[r9] = r8     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.Class<android.util.Pair> r8 = android.util.Pair.class
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ NullPointerException -> 0x01bc }
            r3 = 0
            if (r2 == 0) goto L_0x0072
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ NullPointerException -> 0x01bc }
            r10[r9] = r0     // Catch:{ NullPointerException -> 0x01bc }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f9456a     // Catch:{ NullPointerException -> 0x01bc }
            r13 = 1
            r14 = 3627(0xe2b, float:5.083E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r15[r9] = r1     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.Class<android.util.Pair> r16 = android.util.Pair.class
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ NullPointerException -> 0x01bc }
            r3 = r1
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ NullPointerException -> 0x01bc }
            goto L_0x0192
        L_0x0072:
            if (r0 != 0) goto L_0x0076
            goto L_0x0192
        L_0x0076:
            com.bytedance.android.livesdk.v.e r1 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()     // Catch:{ NullPointerException -> 0x01bc }
            com.bytedance.android.livesdk.wallet.l r1 = r1.f()     // Catch:{ NullPointerException -> 0x01bc }
            if (r1 != 0) goto L_0x0082
            goto L_0x0192
        L_0x0082:
            java.lang.String r1 = "type"
            java.lang.String r1 = r0.optString(r1)     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r2 = "args"
            org.json.JSONObject r2 = r0.optJSONObject(r2)     // Catch:{ NullPointerException -> 0x01bc }
            if (r2 != 0) goto L_0x0092
            goto L_0x0192
        L_0x0092:
            com.bytedance.android.livesdkapi.depend.model.c r4 = new com.bytedance.android.livesdkapi.depend.model.c     // Catch:{ NullPointerException -> 0x01bc }
            r4.<init>()     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r5 = "order_id"
            java.lang.String r5 = r2.optString(r5)     // Catch:{ NullPointerException -> 0x01bc }
            r4.f18695a = r5     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r5 = "channel_id"
            java.lang.String r5 = r2.optString(r5)     // Catch:{ NullPointerException -> 0x01bc }
            r4.f18700f = r5     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r5 = "product_id"
            java.lang.String r5 = r2.optString(r5)     // Catch:{ NullPointerException -> 0x01bc }
            r4.f18697c = r5     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r5 = "real_count"
            int r5 = r2.optInt(r5)     // Catch:{ NullPointerException -> 0x01bc }
            r4.f18698d = r5     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r5 = "alipay"
            boolean r5 = android.text.TextUtils.equals(r1, r5)     // Catch:{ NullPointerException -> 0x01bc }
            if (r5 == 0) goto L_0x0151
            com.bytedance.android.livesdkapi.host.r r3 = com.bytedance.android.livesdkapi.host.r.ALIPAY     // Catch:{ NullPointerException -> 0x01bc }
            r4.f18696b = r3     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r3 = "order_info"
            java.lang.String r3 = r2.optString(r3)     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r5 = "sign"
            java.lang.String r5 = r2.optString(r5)     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r6 = "sign_type"
            java.lang.String r2 = r2.optString(r6)     // Catch:{ NullPointerException -> 0x01bc }
            boolean r6 = com.bytedance.android.live.uikit.a.a.b()     // Catch:{ NullPointerException -> 0x01bc }
            if (r6 == 0) goto L_0x0110
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ NullPointerException -> 0x01bc }
            if (r6 != 0) goto L_0x00f5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ NullPointerException -> 0x01bc }
            r6.<init>()     // Catch:{ NullPointerException -> 0x01bc }
            r6.append(r3)     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r3 = "&sign="
            r6.append(r3)     // Catch:{ NullPointerException -> 0x01bc }
            r6.append(r5)     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r3 = r6.toString()     // Catch:{ NullPointerException -> 0x01bc }
        L_0x00f5:
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ NullPointerException -> 0x01bc }
            if (r5 != 0) goto L_0x014e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NullPointerException -> 0x01bc }
            r5.<init>()     // Catch:{ NullPointerException -> 0x01bc }
            r5.append(r3)     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r3 = "&sign_type="
            r5.append(r3)     // Catch:{ NullPointerException -> 0x01bc }
            r5.append(r2)     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r3 = r5.toString()     // Catch:{ NullPointerException -> 0x01bc }
            goto L_0x014e
        L_0x0110:
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ NullPointerException -> 0x01bc }
            if (r6 != 0) goto L_0x012f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ NullPointerException -> 0x01bc }
            r6.<init>()     // Catch:{ NullPointerException -> 0x01bc }
            r6.append(r3)     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r3 = "&sign=\""
            r6.append(r3)     // Catch:{ NullPointerException -> 0x01bc }
            r6.append(r5)     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r3 = "\""
            r6.append(r3)     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r3 = r6.toString()     // Catch:{ NullPointerException -> 0x01bc }
        L_0x012f:
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ NullPointerException -> 0x01bc }
            if (r5 != 0) goto L_0x014e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NullPointerException -> 0x01bc }
            r5.<init>()     // Catch:{ NullPointerException -> 0x01bc }
            r5.append(r3)     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r3 = "&sign_type=\""
            r5.append(r3)     // Catch:{ NullPointerException -> 0x01bc }
            r5.append(r2)     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r2 = "\""
            r5.append(r2)     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r3 = r5.toString()     // Catch:{ NullPointerException -> 0x01bc }
        L_0x014e:
            r4.g = r3     // Catch:{ NullPointerException -> 0x01bc }
            goto L_0x018d
        L_0x0151:
            java.lang.String r5 = "wxpay"
            boolean r5 = android.text.TextUtils.equals(r1, r5)     // Catch:{ NullPointerException -> 0x01bc }
            if (r5 == 0) goto L_0x0192
            com.bytedance.android.livesdkapi.host.r r3 = com.bytedance.android.livesdkapi.host.r.WEIXIN     // Catch:{ NullPointerException -> 0x01bc }
            r4.f18696b = r3     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r3 = "app_id"
            java.lang.String r3 = r2.optString(r3)     // Catch:{ NullPointerException -> 0x01bc }
            r4.h = r3     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r3 = "partner_id"
            java.lang.String r3 = r2.optString(r3)     // Catch:{ NullPointerException -> 0x01bc }
            r4.i = r3     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r3 = "nonce_str"
            java.lang.String r3 = r2.optString(r3)     // Catch:{ NullPointerException -> 0x01bc }
            r4.k = r3     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r3 = "prepay_id"
            java.lang.String r3 = r2.optString(r3)     // Catch:{ NullPointerException -> 0x01bc }
            r4.j = r3     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r3 = "timestamp"
            java.lang.String r3 = r2.optString(r3)     // Catch:{ NullPointerException -> 0x01bc }
            r4.l = r3     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r3 = "sign"
            java.lang.String r2 = r2.optString(r3)     // Catch:{ NullPointerException -> 0x01bc }
            r4.m = r2     // Catch:{ NullPointerException -> 0x01bc }
        L_0x018d:
            android.util.Pair r3 = new android.util.Pair     // Catch:{ NullPointerException -> 0x01bc }
            r3.<init>(r1, r4)     // Catch:{ NullPointerException -> 0x01bc }
        L_0x0192:
            if (r3 != 0) goto L_0x0195
            return r9
        L_0x0195:
            java.lang.String r1 = "args"
            org.json.JSONObject r0 = r0.optJSONObject(r1)     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r1 = "live_detail"
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x01ad
            java.lang.String r1 = "request_page"
            java.lang.String r1 = r0.optString(r1)     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r2 = "charge_reason"
            java.lang.String r2 = r0.optString(r2)     // Catch:{ NullPointerException -> 0x01bc }
        L_0x01ad:
            java.lang.Object r0 = r3.second     // Catch:{ NullPointerException -> 0x01bc }
            com.bytedance.android.livesdkapi.depend.model.c r0 = (com.bytedance.android.livesdkapi.depend.model.c) r0     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.Object r3 = r3.first     // Catch:{ NullPointerException -> 0x01bc }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ NullPointerException -> 0x01bc }
            r4 = r17
            int r0 = r4.a(r0, r3, r1, r2)     // Catch:{ NullPointerException -> 0x01be }
            return r0
        L_0x01bc:
            r4 = r17
        L_0x01be:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.c.e.a(org.json.JSONObject):int");
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        h hVar2 = hVar;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject2}, this, f9456a, false, 3622, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject2}, this, f9456a, false, 3622, new Class[]{h.class, JSONObject.class}, Void.TYPE);
        } else if (hVar2 == null || hVar2.f20623d == null) {
        } else {
            jSONObject2.put("code", a(hVar2.f20623d));
        }
    }

    public final JSONObject a(@NonNull c cVar, int i) {
        String str;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2, Integer.valueOf(i)}, this, f9456a, false, 3626, new Class[]{c.class, Integer.TYPE}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{cVar2, Integer.valueOf(i)}, this, f9456a, false, 3626, new Class[]{c.class, Integer.TYPE}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "pay");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("order_id", cVar2.f18695a);
            jSONObject2.put("channel_param", i);
            if (cVar2.f18696b == r.ALIPAY) {
                str = "alipay";
            } else {
                str = "wxpay";
            }
            jSONObject2.put("channel", str);
            jSONObject2.put("channel_id", cVar2.f18700f);
            jSONObject.put("args", jSONObject2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private int a(c cVar, String str, String str2, String str3) {
        com.bytedance.android.livesdk.wallet.e eVar;
        c cVar2 = cVar;
        String str4 = str;
        if (PatchProxy.isSupport(new Object[]{cVar2, str4, str2, str3}, this, f9456a, false, 3624, new Class[]{c.class, String.class, String.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{cVar2, str4, str2, str3}, this, f9456a, false, 3624, new Class[]{c.class, String.class, String.class, String.class}, Integer.TYPE)).intValue();
        } else if (this.f9457b == null || this.f9457b.get() == null || this.f9461f == null) {
            return 1;
        } else {
            a aVar = new a();
            aVar.h = cVar2.f18698d;
            try {
                aVar.f18678a = Long.parseLong(cVar2.f18697c);
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a("LivePayMethod", (Throwable) e2);
            }
            r rVar = r.UNKNOWN;
            if (TextUtils.equals(str4, "wxpay")) {
                rVar = r.WEIXIN;
            } else if (TextUtils.equals(str4, "alipay")) {
                rVar = r.ALIPAY;
            }
            if (com.bytedance.android.live.core.utils.d.a((Context) this.f9457b.get()) == null) {
                com.bytedance.android.live.core.c.a.c("LivePayMethod", "No activity was attached while paying");
                return 1;
            }
            this.f9458c = cVar2;
            Activity activity = (Activity) this.f9457b.get();
            a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{activity, str2, str3}, this, f9456a, false, 3625, new Class[]{Activity.class, String.class, String.class}, com.bytedance.android.livesdk.wallet.e.class)) {
                eVar = (com.bytedance.android.livesdk.wallet.e) PatchProxy.accessDispatch(new Object[]{activity, str2, str3}, this, f9456a, false, 3625, new Class[]{Activity.class, String.class, String.class}, com.bytedance.android.livesdk.wallet.e.class);
            } else {
                if (this.f9460e == null) {
                    com.bytedance.android.livesdk.wallet.e eVar2 = new com.bytedance.android.livesdk.wallet.e(activity, new k() {
                        public final Observable<b> a() {
                            return null;
                        }
                    }, str3, str2, 0);
                    this.f9460e = eVar2;
                    this.f9460e.a(new f() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f9463a;

                        public final void a() {
                        }

                        public final void a(b bVar) {
                        }

                        public final void a(Exception exc) {
                        }

                        public final void a(Exception exc, int i) {
                        }

                        public final void b() {
                        }

                        public final void c() {
                            if (PatchProxy.isSupport(new Object[0], this, f9463a, false, 3630, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f9463a, false, 3630, new Class[0], Void.TYPE);
                                return;
                            }
                            if (e.this.f9459d != null) {
                                if (e.this.f9459d.isShowing()) {
                                    e.this.f9459d.dismiss();
                                }
                                e.this.f9459d = null;
                            }
                        }

                        public final void d() {
                            if (PatchProxy.isSupport(new Object[0], this, f9463a, false, 3633, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f9463a, false, 3633, new Class[0], Void.TYPE);
                                return;
                            }
                            ai.a((int) C0906R.string.dgi);
                            j.q().f().a("H5_payStatusChange", e.this.a(e.this.f9458c, -1));
                        }

                        public final void a(int i) {
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f9463a, false, 3629, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f9463a, false, 3629, new Class[]{Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            if ((e.this.f9457b.get() != null && e.this.f9459d == null) || !e.this.f9459d.isShowing()) {
                                e.this.f9459d = af.a((Context) e.this.f9457b.get(), ac.a((int) C0906R.string.dgp));
                            }
                        }

                        public final void a(int i, @Nullable com.bytedance.android.livesdk.wallet.a.a aVar) {
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), aVar}, this, f9463a, false, 3631, new Class[]{Integer.TYPE, com.bytedance.android.livesdk.wallet.a.a.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), aVar}, this, f9463a, false, 3631, new Class[]{Integer.TYPE, com.bytedance.android.livesdk.wallet.a.a.class}, Void.TYPE);
                                return;
                            }
                            ai.a((int) C0906R.string.dgr);
                            j.q().f().a("H5_payStatusChange", e.this.a(e.this.f9458c, 1));
                            com.bytedance.android.livesdk.g.c cVar = new com.bytedance.android.livesdk.g.c(e.this.f9458c.f18698d);
                            cVar.f14631a = 0;
                            com.bytedance.android.livesdk.u.a.a().a((Object) cVar);
                        }

                        public final void b(Exception exc, int i) {
                            if (PatchProxy.isSupport(new Object[]{exc, 0}, this, f9463a, false, 3632, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{exc, 0}, this, f9463a, false, 3632, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            j.q().f().a("H5_payStatusChange", e.this.a(e.this.f9458c, 2));
                            if (exc instanceof com.bytedance.android.live.a.a.a.a) {
                                int errorCode = ((com.bytedance.android.live.a.a.a.a) exc).getErrorCode();
                                if (errorCode == 0) {
                                    ai.a((int) C0906R.string.dgs);
                                } else if (errorCode == 1 || errorCode == 2) {
                                    ai.a((int) C0906R.string.dgt);
                                } else {
                                    ai.a((int) C0906R.string.dgl);
                                }
                            } else {
                                ai.a((int) C0906R.string.dgk);
                            }
                        }
                    });
                }
                eVar = this.f9460e;
            }
            eVar.a(cVar2, aVar2, rVar);
            return 1;
        }
    }
}
