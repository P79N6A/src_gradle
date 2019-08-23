package com.ss.android.ugc.aweme.crossplatform.business.a;

import android.text.TextUtils;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40759a;

    /* renamed from: b  reason: collision with root package name */
    private long f40760b;

    /* renamed from: c  reason: collision with root package name */
    private int f40761c;

    /* renamed from: d  reason: collision with root package name */
    private long f40762d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f40763e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f40764f;
    private boolean g;
    private String h;
    private String i;
    private boolean j;

    public final void a(WebView webView, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{webView, str3, str4}, this, f40759a, false, 34285, new Class[]{WebView.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, str3, str4}, this, f40759a, false, 34285, new Class[]{WebView.class, String.class, String.class}, Void.TYPE);
        } else if (webView != null && !TextUtils.isEmpty(str)) {
            if (this.h == null) {
                this.h = str3;
            }
            if (this.f40760b == 0) {
                this.f40760b = System.currentTimeMillis();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f40761c = com.ss.android.ugc.aweme.commercialize.feed.b.a.f38813e.a(str4);
            }
        }
    }

    public final void a() {
        this.j = false;
        this.f40764f = false;
        this.g = false;
        this.i = null;
        this.f40762d = 0;
        this.f40760b = 0;
    }

    public final void a(WebView webView, String str, long j2, JSONObject jSONObject) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{webView, str, new Long(j3), jSONObject}, this, f40759a, false, 34289, new Class[]{WebView.class, String.class, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {webView, str, new Long(j3), jSONObject};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f40759a, false, 34289, new Class[]{WebView.class, String.class, Long.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        c(webView, str, j2, jSONObject, null);
    }

    private void a(String str, long j2, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        String str2 = str;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j3), jSONObject, jSONObject2}, this, f40759a, false, 34291, new Class[]{String.class, Long.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {str2, new Long(j3), jSONObject, jSONObject2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f40759a, false, 34291, new Class[]{String.class, Long.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE);
        } else if (j3 > 0) {
            if (jSONObject == null) {
                jSONObject3 = new JSONObject();
            } else {
                jSONObject3 = jSONObject;
            }
            try {
                jSONObject3.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                jSONObject3.put("tag", "draw_ad");
                if (jSONObject2 == null) {
                    jSONObject4 = new JSONObject();
                } else {
                    jSONObject4 = jSONObject2;
                }
                try {
                    jSONObject4.put("present_url", this.i);
                    jSONObject4.put("next_url", str2);
                    jSONObject3.put("ad_extra_data", jSONObject4.toString());
                } catch (JSONException unused) {
                }
            } catch (JSONException unused2) {
            }
            r.onEvent(MobClick.obtain().setLabelName("jump_page").setEventName("ad_wap_stat").setValue(String.valueOf(j2)).setJsonObject(jSONObject3));
        }
    }

    public final void a(long j2, long j3, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5), jSONObject, jSONObject2}, this, f40759a, false, 34293, new Class[]{Long.TYPE, Long.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5), jSONObject, jSONObject2}, this, f40759a, false, 34293, new Class[]{Long.TYPE, Long.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE);
        } else if (j5 > 0 && this.h != null) {
            if (jSONObject == null) {
                jSONObject3 = new JSONObject();
            } else {
                jSONObject3 = jSONObject;
            }
            try {
                jSONObject3.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                jSONObject3.put("tag", "draw_ad");
                if (jSONObject2 == null) {
                    jSONObject4 = new JSONObject();
                } else {
                    jSONObject4 = jSONObject2;
                }
                jSONObject4.put("present_url", this.h);
                jSONObject3.put("ad_extra_data", jSONObject4.toString());
            } catch (JSONException unused) {
            }
            r.onEvent(MobClick.obtain().setLabelName("stay_page").setEventName("ad_wap_stat").setValue(String.valueOf(j3)).setExtValueLong(j4).setJsonObject(jSONObject3));
        }
    }

    public final void b(WebView webView, String str, long j2, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2 = str;
        long j3 = j2;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{webView, str2, new Long(j3), jSONObject, jSONObject2}, this, f40759a, false, 34288, new Class[]{WebView.class, String.class, Long.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, str2, new Long(j3), jSONObject, jSONObject2}, this, f40759a, false, 34288, new Class[]{WebView.class, String.class, Long.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE);
        } else if (webView != null && !TextUtils.isEmpty(str)) {
            if (this.i == null) {
                this.i = this.h;
            }
            if (!TextUtils.isEmpty(webView.getOriginalUrl()) && !TextUtils.equals(webView.getOriginalUrl(), str2) && !this.f40764f) {
                z = true;
            }
            this.f40763e = z;
            a(str, j2, jSONObject, jSONObject2);
            this.i = str2;
        }
    }

    public final void c(WebView webView, String str, long j2, JSONObject jSONObject, JSONObject jSONObject2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{webView, str, new Long(j3), jSONObject, jSONObject2}, this, f40759a, false, 34290, new Class[]{WebView.class, String.class, Long.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {webView, str, new Long(j3), jSONObject, jSONObject2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f40759a, false, 34290, new Class[]{WebView.class, String.class, Long.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE);
            return;
        }
        this.g = true;
        a(webView.getContext(), str, j2, jSONObject, jSONObject2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ec, code lost:
        if (r4 < 1) goto L_0x00ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fe A[Catch:{ Exception -> 0x0169 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ff A[Catch:{ Exception -> 0x0169 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r21, java.lang.String r22, long r23, org.json.JSONObject r25, org.json.JSONObject r26) {
        /*
            r20 = this;
            r7 = r20
            r10 = r23
            r14 = 5
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r15 = 0
            r0[r15] = r21
            r6 = 1
            r0[r6] = r22
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r10)
            r16 = 2
            r0[r16] = r1
            r17 = 3
            r0[r17] = r25
            r18 = 4
            r0[r18] = r26
            com.meituan.robust.ChangeQuickRedirect r2 = f40759a
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r5[r15] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r6] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r5[r16] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r17] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r18] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r3 = 0
            r4 = 34292(0x85f4, float:4.8053E-41)
            r1 = r20
            r6 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x007c
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r15] = r21
            r1 = 1
            r0[r1] = r22
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r10)
            r0[r16] = r2
            r0[r17] = r25
            r0[r18] = r26
            com.meituan.robust.ChangeQuickRedirect r2 = f40759a
            r3 = 0
            r4 = 34292(0x85f4, float:4.8053E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r15] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r1] = r6
            java.lang.Class r1 = java.lang.Long.TYPE
            r5[r16] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r17] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r18] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x007c:
            r1 = 1
            if (r21 == 0) goto L_0x016a
            long r2 = r7.f40760b
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0089
            goto L_0x016a
        L_0x0089:
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x008e
            return
        L_0x008e:
            boolean r0 = r7.f40763e
            if (r0 != 0) goto L_0x009e
            boolean r0 = r7.f40764f
            if (r0 == 0) goto L_0x009e
            boolean r0 = r7.g
            if (r0 == 0) goto L_0x009b
            goto L_0x009e
        L_0x009b:
            java.lang.String r0 = "load_finish"
            goto L_0x00a0
        L_0x009e:
            java.lang.String r0 = "load"
        L_0x00a0:
            com.bytedance.common.utility.NetworkUtils$NetworkType r2 = com.bytedance.common.utility.NetworkUtils.getNetworkType(r21)     // Catch:{ Exception -> 0x0169 }
            com.bytedance.common.utility.NetworkUtils$NetworkType r3 = com.bytedance.common.utility.NetworkUtils.NetworkType.NONE     // Catch:{ Exception -> 0x0169 }
            if (r2 != r3) goto L_0x00a9
            return
        L_0x00a9:
            if (r25 != 0) goto L_0x00b2
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0169 }
            r3.<init>()     // Catch:{ Exception -> 0x0169 }
            r12 = r3
            goto L_0x00b4
        L_0x00b2:
            r12 = r25
        L_0x00b4:
            java.lang.String r3 = "ac"
            java.lang.String r6 = com.bytedance.common.utility.NetworkUtils.getNetworkAccessType((com.bytedance.common.utility.NetworkUtils.NetworkType) r2)     // Catch:{ Exception -> 0x0169 }
            r12.put(r3, r6)     // Catch:{ Exception -> 0x0169 }
            boolean r3 = r7.g     // Catch:{ Exception -> 0x0169 }
            if (r3 == 0) goto L_0x00c4
            java.lang.String r0 = "load_fail"
            goto L_0x010b
        L_0x00c4:
            long r14 = r7.f40762d     // Catch:{ Exception -> 0x0169 }
            int r3 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            java.lang.String r0 = "load"
        L_0x00cd:
            long r14 = r7.f40762d     // Catch:{ Exception -> 0x0169 }
            int r3 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x00db
            long r14 = r7.f40762d     // Catch:{ Exception -> 0x0169 }
            long r4 = r7.f40760b     // Catch:{ Exception -> 0x0169 }
            r3 = 0
            long r14 = r14 - r4
            r4 = r14
            goto L_0x00e4
        L_0x00db:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0169 }
            long r5 = r7.f40760b     // Catch:{ Exception -> 0x0169 }
            r8 = 0
            long r3 = r3 - r5
            r4 = r3
        L_0x00e4:
            com.bytedance.common.utility.NetworkUtils$NetworkType r3 = com.bytedance.common.utility.NetworkUtils.NetworkType.WIFI     // Catch:{ Exception -> 0x0169 }
            r14 = 1
            if (r2 != r3) goto L_0x00f3
            int r2 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x00f8
        L_0x00ee:
            r2 = 0
            r4 = 0
            goto L_0x00fa
        L_0x00f3:
            int r2 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x00f8
            goto L_0x00ee
        L_0x00f8:
            r2 = 0
        L_0x00fa:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x00ff
            return
        L_0x00ff:
            r2 = 90000(0x15f90, double:4.4466E-319)
            long r2 = java.lang.Math.min(r4, r2)     // Catch:{ Exception -> 0x0169 }
            java.lang.String r4 = "duration"
            r12.put(r4, r2)     // Catch:{ Exception -> 0x0169 }
        L_0x010b:
            if (r22 == 0) goto L_0x0110
            r9 = r22
            goto L_0x0113
        L_0x0110:
            java.lang.String r2 = r7.h     // Catch:{ Exception -> 0x0169 }
            r9 = r2
        L_0x0113:
            if (r9 != 0) goto L_0x0116
            return
        L_0x0116:
            java.lang.String r2 = "is_ad_event"
            java.lang.String r3 = "1"
            r12.put(r2, r3)     // Catch:{ Exception -> 0x0169 }
            java.lang.String r2 = "tag"
            java.lang.String r3 = "draw_ad"
            r12.put(r2, r3)     // Catch:{ Exception -> 0x0169 }
            if (r26 != 0) goto L_0x012d
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0169 }
            r2.<init>()     // Catch:{ Exception -> 0x0169 }
            r13 = r2
            goto L_0x012f
        L_0x012d:
            r13 = r26
        L_0x012f:
            java.lang.String r2 = "next_url"
            r13.put(r2, r9)     // Catch:{ Exception -> 0x0169 }
            java.lang.String r2 = "preload_status"
            int r3 = r7.f40761c     // Catch:{ Exception -> 0x0169 }
            r13.put(r2, r3)     // Catch:{ Exception -> 0x0169 }
            java.lang.String r2 = "ad_extra_data"
            java.lang.String r3 = r13.toString()     // Catch:{ Exception -> 0x0169 }
            r12.put(r2, r3)     // Catch:{ Exception -> 0x0169 }
            boolean r2 = r7.j     // Catch:{ Exception -> 0x0169 }
            if (r2 == 0) goto L_0x0149
            return
        L_0x0149:
            r7.j = r1     // Catch:{ Exception -> 0x0169 }
            com.ss.android.ugc.aweme.common.MobClick r1 = com.ss.android.ugc.aweme.common.MobClick.obtain()     // Catch:{ Exception -> 0x0169 }
            com.ss.android.ugc.aweme.common.MobClick r0 = r1.setLabelName(r0)     // Catch:{ Exception -> 0x0169 }
            java.lang.String r1 = "ad_wap_stat"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)     // Catch:{ Exception -> 0x0169 }
            java.lang.String r1 = java.lang.String.valueOf(r23)     // Catch:{ Exception -> 0x0169 }
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setValue(r1)     // Catch:{ Exception -> 0x0169 }
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r12)     // Catch:{ Exception -> 0x0169 }
            com.ss.android.ugc.aweme.common.r.onEvent(r0)     // Catch:{ Exception -> 0x0169 }
            return
        L_0x0169:
            return
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.business.a.a.a(android.content.Context, java.lang.String, long, org.json.JSONObject, org.json.JSONObject):void");
    }

    public final void a(WebView webView, String str, long j2, JSONObject jSONObject, JSONObject jSONObject2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{webView, str, new Long(j3), jSONObject, jSONObject2}, this, f40759a, false, 34287, new Class[]{WebView.class, String.class, Long.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, str, new Long(j3), jSONObject, jSONObject2}, this, f40759a, false, 34287, new Class[]{WebView.class, String.class, Long.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (webView != null && !TextUtils.isEmpty(str) && !this.f40763e && !this.f40764f) {
            this.f40762d = System.currentTimeMillis();
            this.f40764f = true;
            a(webView.getContext(), str, j2, jSONObject, jSONObject2);
        }
    }
}
