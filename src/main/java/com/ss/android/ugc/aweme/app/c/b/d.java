package com.ss.android.ugc.aweme.app.c.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34036a;

    /* renamed from: b  reason: collision with root package name */
    public String f34037b;

    /* renamed from: c  reason: collision with root package name */
    public String f34038c;

    /* renamed from: d  reason: collision with root package name */
    public String f34039d;

    /* renamed from: e  reason: collision with root package name */
    public String f34040e;

    /* renamed from: f  reason: collision with root package name */
    public String f34041f;
    public String g;
    public JSONObject h;
    public boolean i;
    public String j;
    public boolean k;
    public String l;
    private String m;
    private String n;

    public final void a(JSONObject jSONObject) {
        boolean z;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f34036a, false, 23421, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f34036a, false, 23421, new Class[]{JSONObject.class}, Void.TYPE);
        } else if (jSONObject != null) {
            this.f34037b = jSONObject.optString("id", null);
            this.f34038c = jSONObject.optString("source", null);
            this.f34039d = jSONObject.optString("card_type", null);
            this.f34040e = jSONObject.optString("pkg_name", null);
            this.f34041f = jSONObject.optString("name", null);
            this.g = jSONObject.optString("download_url", null);
            if (jSONObject.optInt("is_ad", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.i = z;
            this.m = jSONObject.optString("log_extra", null);
            this.j = jSONObject.optString("event_tag", "game_room_app_ad");
            this.h = jSONObject.optJSONObject(PushConstants.EXTRA);
            if (jSONObject.optInt("support_multiple", 0) != 1) {
                z2 = false;
            }
            this.k = z2;
            this.l = jSONObject.optString("group_id", null);
            this.n = jSONObject.optString("quick_app_url", "");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0100  */
    @android.support.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.downloadad.api.a.c a(@android.support.annotation.NonNull com.ss.android.ugc.aweme.app.c.b.d r20) {
        /*
            r7 = r20
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f34036a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.app.c.b.d> r1 = com.ss.android.ugc.aweme.app.c.b.d.class
            r5[r9] = r1
            java.lang.Class<com.ss.android.downloadad.api.a.c> r6 = com.ss.android.downloadad.api.a.c.class
            r1 = 0
            r3 = 1
            r4 = 23422(0x5b7e, float:3.2821E-41)
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0035
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r7
            r2 = 0
            com.meituan.robust.ChangeQuickRedirect r3 = f34036a
            r4 = 1
            r5 = 23422(0x5b7e, float:3.2821E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.app.c.b.d> r0 = com.ss.android.ugc.aweme.app.c.b.d.class
            r6[r9] = r0
            java.lang.Class<com.ss.android.downloadad.api.a.c> r7 = com.ss.android.downloadad.api.a.c.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            com.ss.android.downloadad.api.a.c r0 = (com.ss.android.downloadad.api.a.c) r0
            return r0
        L_0x0035:
            r0 = -1
            java.lang.String r2 = r7.f34037b     // Catch:{ Exception -> 0x004d }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x004d }
            long r2 = r2.longValue()     // Catch:{ Exception -> 0x004d }
            java.lang.String r4 = r7.l     // Catch:{ Exception -> 0x004e }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x004e }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x004e }
            r10 = r4
            goto L_0x004f
        L_0x004d:
            r2 = r0
        L_0x004e:
            r10 = r0
        L_0x004f:
            com.ss.android.ugc.aweme.app.c.d.e r12 = com.ss.android.ugc.aweme.app.c.d.f.a()
            com.ss.android.downloadad.api.a.c$a r0 = new com.ss.android.downloadad.api.a.c$a
            r0.<init>()
            boolean r1 = r7.i
            com.ss.android.downloadad.api.a.c$a r0 = r0.a((boolean) r1)
            com.ss.android.downloadad.api.a.c$a r0 = r0.a((long) r2)
            java.lang.String r1 = "game_room"
            java.lang.String r2 = r7.f34038c
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x006e
            r1 = 2
            goto L_0x006f
        L_0x006e:
            r1 = 0
        L_0x006f:
            com.ss.android.downloadad.api.a.c$a r13 = r0.a((int) r1)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f34036a
            r3 = 0
            r4 = 23420(0x5b7c, float:3.2818E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x009a
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f34036a
            r3 = 0
            r4 = 23420(0x5b7c, float:3.2818E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r20
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00a7
        L_0x009a:
            java.lang.String r0 = r7.m
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00a5
            java.lang.String r0 = ""
            goto L_0x00a7
        L_0x00a5:
            java.lang.String r0 = r7.m
        L_0x00a7:
            com.ss.android.downloadad.api.a.c$a r0 = r13.a((java.lang.String) r0)
            java.lang.String r1 = r7.g
            com.ss.android.downloadad.api.a.c$a r0 = r0.d(r1)
            java.lang.String r1 = r7.f34040e
            com.ss.android.downloadad.api.a.c$a r0 = r0.b((java.lang.String) r1)
            java.lang.String r1 = r7.f34041f
            com.ss.android.downloadad.api.a.c$a r0 = r0.e(r1)
            org.json.JSONObject r1 = r7.h
            com.ss.android.downloadad.api.a.c$a r0 = r0.a((org.json.JSONObject) r1)
            com.ss.android.downloadad.api.a.c$a r0 = r0.b((long) r10)
            java.lang.String r1 = r7.g
            java.lang.Object[] r13 = new java.lang.Object[r8]
            r13[r9] = r1
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f34036a
            r16 = 1
            r17 = 23426(0x5b82, float:3.2827E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r9] = r3
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0100
            java.lang.Object[] r13 = new java.lang.Object[r8]
            r13[r9] = r1
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f34036a
            r16 = 1
            r17 = 23426(0x5b82, float:3.2827E-41)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r9] = r2
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x012b
        L_0x0100:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x012a
            java.lang.String r2 = "/"
            int r2 = r1.lastIndexOf(r2)
            r3 = 45
            int r3 = r1.lastIndexOf(r3)
            java.lang.String r4 = ".apk"
            int r4 = r1.lastIndexOf(r4)
            int r5 = r1.length()
            if (r3 <= 0) goto L_0x012a
            if (r2 >= r3) goto L_0x012a
            if (r3 >= r4) goto L_0x012a
            if (r4 >= r5) goto L_0x012a
            int r3 = r3 + r8
            java.lang.String r1 = r1.substring(r3, r4)
            goto L_0x012b
        L_0x012a:
            r1 = 0
        L_0x012b:
            r0.v = r1
            java.lang.String r1 = r7.n
            com.ss.android.downloadad.api.a.c r0 = r12.a((com.ss.android.downloadad.api.a.c.a) r0, (java.lang.String) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.c.b.d.a(com.ss.android.ugc.aweme.app.c.b.d):com.ss.android.downloadad.api.a.c");
    }
}
