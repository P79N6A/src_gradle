package com.ss.android.ugc.effectmanager.effect.e.b;

import android.os.Handler;
import com.ss.android.ugc.effectmanager.common.e.d;
import com.ss.android.ugc.effectmanager.g;

public final class a extends d {

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.effectmanager.a.a f77420e;

    /* renamed from: f  reason: collision with root package name */
    private g f77421f = this.f77420e.f77204a;
    private String g;
    private String h;
    private String i;
    private int j;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r8 = this;
            int r0 = r8.j
            switch(r0) {
                case 1: goto L_0x001d;
                case 2: goto L_0x0016;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "effect_version"
            r0.<init>(r1)
            java.lang.String r1 = r8.g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0025
        L_0x0016:
            java.lang.String r0 = r8.g
            java.lang.String r0 = com.ss.android.ugc.effectmanager.common.f.a.a(r0)
            goto L_0x0025
        L_0x001d:
            java.lang.String r0 = r8.g
            java.lang.String r1 = r8.h
            java.lang.String r0 = com.ss.android.ugc.effectmanager.common.f.a.c(r0, r1)
        L_0x0025:
            com.ss.android.ugc.effectmanager.g r1 = r8.f77421f
            com.ss.android.ugc.effectmanager.common.d.a r1 = r1.r
            java.io.InputStream r0 = r1.b(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0033
        L_0x0031:
            r0 = 0
            goto L_0x0047
        L_0x0033:
            com.ss.android.ugc.effectmanager.g r3 = r8.f77421f
            com.ss.android.ugc.effectmanager.common.d.c r3 = r3.v
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.CheckUpdateVersionModel> r4 = com.ss.android.ugc.effectmanager.effect.model.CheckUpdateVersionModel.class
            java.lang.Object r0 = r3.a(r0, r4)
            com.ss.android.ugc.effectmanager.effect.model.CheckUpdateVersionModel r0 = (com.ss.android.ugc.effectmanager.effect.model.CheckUpdateVersionModel) r0
            if (r0 != 0) goto L_0x0042
            goto L_0x0031
        L_0x0042:
            java.lang.String r0 = r0.version
            r8.i = r0
            r0 = 1
        L_0x0047:
            r3 = 0
            r4 = 13
            if (r0 == 0) goto L_0x01f7
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.ss.android.ugc.effectmanager.a.a r5 = r8.f77420e
            com.ss.android.ugc.effectmanager.link.LinkSelector r5 = r5.f77205b
            if (r5 == 0) goto L_0x0083
            android.content.Context r5 = r5.f77522f
            java.lang.String r6 = "version"
            android.content.SharedPreferences r5 = com.ss.android.ugc.aweme.q.c.a(r5, r6, r2)
            java.lang.String r6 = "app_version"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            com.ss.android.ugc.effectmanager.g r7 = r8.f77421f
            java.lang.String r7 = r7.f77478d
            boolean r6 = r6.equals(r7)
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x0084
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r6 = "app_version"
            com.ss.android.ugc.effectmanager.g r7 = r8.f77421f
            java.lang.String r7 = r7.f77478d
            r5.putString(r6, r7)
            r5.commit()
            goto L_0x0084
        L_0x0083:
            r1 = 0
        L_0x0084:
            com.ss.android.ugc.effectmanager.g r5 = r8.f77421f
            java.lang.String r5 = r5.f77476b
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0097
            java.lang.String r5 = "access_key"
            com.ss.android.ugc.effectmanager.g r6 = r8.f77421f
            java.lang.String r6 = r6.f77476b
            r0.put(r5, r6)
        L_0x0097:
            com.ss.android.ugc.effectmanager.g r5 = r8.f77421f
            java.lang.String r5 = r5.f77478d
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00aa
            java.lang.String r5 = "app_version"
            com.ss.android.ugc.effectmanager.g r6 = r8.f77421f
            java.lang.String r6 = r6.f77478d
            r0.put(r5, r6)
        L_0x00aa:
            com.ss.android.ugc.effectmanager.g r5 = r8.f77421f
            java.lang.String r5 = r5.f77477c
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00bd
            java.lang.String r5 = "sdk_version"
            com.ss.android.ugc.effectmanager.g r6 = r8.f77421f
            java.lang.String r6 = r6.f77477c
            r0.put(r5, r6)
        L_0x00bd:
            com.ss.android.ugc.effectmanager.g r5 = r8.f77421f
            java.lang.String r5 = r5.f77480f
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00d0
            java.lang.String r5 = "channel"
            com.ss.android.ugc.effectmanager.g r6 = r8.f77421f
            java.lang.String r6 = r6.f77480f
            r0.put(r5, r6)
        L_0x00d0:
            com.ss.android.ugc.effectmanager.g r5 = r8.f77421f
            java.lang.String r5 = r5.g
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00e3
            java.lang.String r5 = "device_platform"
            com.ss.android.ugc.effectmanager.g r6 = r8.f77421f
            java.lang.String r6 = r6.g
            r0.put(r5, r6)
        L_0x00e3:
            com.ss.android.ugc.effectmanager.g r5 = r8.f77421f
            java.lang.String r5 = r5.f77479e
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00f6
            java.lang.String r5 = "device_id"
            com.ss.android.ugc.effectmanager.g r6 = r8.f77421f
            java.lang.String r6 = r6.f77479e
            r0.put(r5, r6)
        L_0x00f6:
            com.ss.android.ugc.effectmanager.g r5 = r8.f77421f
            java.lang.String r5 = r5.j
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0109
            java.lang.String r5 = "region"
            com.ss.android.ugc.effectmanager.g r6 = r8.f77421f
            java.lang.String r6 = r6.j
            r0.put(r5, r6)
        L_0x0109:
            com.ss.android.ugc.effectmanager.g r5 = r8.f77421f
            java.lang.String r5 = r5.h
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x011c
            java.lang.String r5 = "device_type"
            com.ss.android.ugc.effectmanager.g r6 = r8.f77421f
            java.lang.String r6 = r6.h
            r0.put(r5, r6)
        L_0x011c:
            com.ss.android.ugc.effectmanager.g r5 = r8.f77421f
            java.lang.String r5 = r5.k
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x012f
            java.lang.String r5 = "aid"
            com.ss.android.ugc.effectmanager.g r6 = r8.f77421f
            java.lang.String r6 = r6.k
            r0.put(r5, r6)
        L_0x012f:
            com.ss.android.ugc.effectmanager.g r5 = r8.f77421f
            java.lang.String r5 = r5.l
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0142
            java.lang.String r5 = "app_language"
            com.ss.android.ugc.effectmanager.g r6 = r8.f77421f
            java.lang.String r6 = r6.l
            r0.put(r5, r6)
        L_0x0142:
            com.ss.android.ugc.effectmanager.g r5 = r8.f77421f
            java.lang.String r5 = r5.m
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0155
            java.lang.String r5 = "language"
            com.ss.android.ugc.effectmanager.g r6 = r8.f77421f
            java.lang.String r6 = r6.m
            r0.put(r5, r6)
        L_0x0155:
            java.lang.String r5 = "panel"
            java.lang.String r6 = r8.g
            r0.put(r5, r6)
            int r5 = r8.j
            switch(r5) {
                case 1: goto L_0x0167;
                case 2: goto L_0x0164;
                default: goto L_0x0161;
            }
        L_0x0161:
            java.lang.String r5 = "/panel/check"
            goto L_0x0170
        L_0x0164:
            java.lang.String r5 = "/panel/check"
            goto L_0x0170
        L_0x0167:
            java.lang.String r5 = "/category/check"
            java.lang.String r6 = "category"
            java.lang.String r7 = r8.h
            r0.put(r6, r7)
        L_0x0170:
            if (r1 == 0) goto L_0x017a
            java.lang.String r1 = "version"
            java.lang.String r6 = ""
            r0.put(r1, r6)
            goto L_0x0181
        L_0x017a:
            java.lang.String r1 = "version"
            java.lang.String r6 = r8.i
            r0.put(r1, r6)
        L_0x0181:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.ss.android.ugc.effectmanager.a.a r6 = r8.f77420e
            com.ss.android.ugc.effectmanager.link.LinkSelector r6 = r6.f77205b
            java.lang.String r6 = r6.i
            r1.append(r6)
            com.ss.android.ugc.effectmanager.g r6 = r8.f77421f
            java.lang.String r6 = r6.f77475a
            r1.append(r6)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = com.ss.android.ugc.effectmanager.common.f.f.a(r0, r1)
            com.ss.android.ugc.effectmanager.common.a r1 = new com.ss.android.ugc.effectmanager.common.a
            java.lang.String r5 = "GET"
            r1.<init>(r5, r0)
            boolean r0 = r8.f77323c
            if (r0 == 0) goto L_0x01bb
            com.ss.android.ugc.effectmanager.effect.e.a.c r0 = new com.ss.android.ugc.effectmanager.effect.e.a.c
            com.ss.android.ugc.effectmanager.common.e.c r5 = new com.ss.android.ugc.effectmanager.common.e.c
            r6 = 10001(0x2711, float:1.4014E-41)
            r5.<init>((int) r6)
            r0.<init>(r2, r5)
            r8.a(r4, r0)
        L_0x01bb:
            com.ss.android.ugc.effectmanager.g r0 = r8.f77421f     // Catch:{ Exception -> 0x01e8 }
            com.ss.android.ugc.effectmanager.d.a r0 = r0.w     // Catch:{ Exception -> 0x01e8 }
            com.ss.android.ugc.effectmanager.g r5 = r8.f77421f     // Catch:{ Exception -> 0x01e8 }
            com.ss.android.ugc.effectmanager.common.d.c r5 = r5.v     // Catch:{ Exception -> 0x01e8 }
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.net.EffectCheckUpdateResponse> r6 = com.ss.android.ugc.effectmanager.effect.model.net.EffectCheckUpdateResponse.class
            com.ss.android.ugc.effectmanager.common.model.BaseNetResponse r0 = r0.a(r1, r5, r6)     // Catch:{ Exception -> 0x01e8 }
            com.ss.android.ugc.effectmanager.effect.model.net.EffectCheckUpdateResponse r0 = (com.ss.android.ugc.effectmanager.effect.model.net.EffectCheckUpdateResponse) r0     // Catch:{ Exception -> 0x01e8 }
            if (r0 == 0) goto L_0x01d8
            com.ss.android.ugc.effectmanager.effect.e.a.c r1 = new com.ss.android.ugc.effectmanager.effect.e.a.c     // Catch:{ Exception -> 0x01e8 }
            boolean r0 = r0.updated     // Catch:{ Exception -> 0x01e8 }
            r1.<init>(r0, r3)     // Catch:{ Exception -> 0x01e8 }
            r8.a(r4, r1)     // Catch:{ Exception -> 0x01e8 }
            goto L_0x01f6
        L_0x01d8:
            com.ss.android.ugc.effectmanager.effect.e.a.c r0 = new com.ss.android.ugc.effectmanager.effect.e.a.c     // Catch:{ Exception -> 0x01e8 }
            com.ss.android.ugc.effectmanager.common.e.c r1 = new com.ss.android.ugc.effectmanager.common.e.c     // Catch:{ Exception -> 0x01e8 }
            r3 = 10002(0x2712, float:1.4016E-41)
            r1.<init>((int) r3)     // Catch:{ Exception -> 0x01e8 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x01e8 }
            r8.a(r4, r0)     // Catch:{ Exception -> 0x01e8 }
            goto L_0x01ff
        L_0x01e8:
            r0 = move-exception
            com.ss.android.ugc.effectmanager.effect.e.a.c r1 = new com.ss.android.ugc.effectmanager.effect.e.a.c
            com.ss.android.ugc.effectmanager.common.e.c r3 = new com.ss.android.ugc.effectmanager.common.e.c
            r3.<init>((java.lang.Exception) r0)
            r1.<init>(r2, r3)
            r8.a(r4, r1)
        L_0x01f6:
            return
        L_0x01f7:
            com.ss.android.ugc.effectmanager.effect.e.a.c r0 = new com.ss.android.ugc.effectmanager.effect.e.a.c
            r0.<init>(r1, r3)
            r8.a(r4, r0)
        L_0x01ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.e.b.a.a():void");
    }

    public a(com.ss.android.ugc.effectmanager.a.a aVar, String str, Handler handler, String str2, String str3, int i2) {
        super(handler, str, "NETWORK");
        this.f77420e = aVar;
        this.g = str2;
        this.h = str3;
        this.j = i2;
    }
}
