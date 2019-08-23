package com.ss.android.message.a.a;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.f;
import org.json.JSONObject;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29852a;

    /* renamed from: b  reason: collision with root package name */
    public String f29853b;

    /* renamed from: c  reason: collision with root package name */
    public String f29854c;

    /* renamed from: d  reason: collision with root package name */
    public String f29855d;

    /* renamed from: e  reason: collision with root package name */
    public long f29856e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f29857f;
    public int g;
    public String h;

    public final String a() {
        return this.f29853b;
    }

    public final String b() {
        return this.f29854c;
    }

    public final long d() {
        return this.f29856e;
    }

    public final boolean e() {
        return this.f29857f;
    }

    public final String f() {
        return this.h;
    }

    public final long c() {
        if (PatchProxy.isSupport(new Object[0], this, f29852a, false, 17977, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f29852a, false, 17977, new Class[0], Long.TYPE)).longValue();
        }
        String str = this.f29855d;
        if (StringUtils.isEmpty(str)) {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        return Long.parseLong(str);
    }

    private JSONObject g() {
        if (PatchProxy.isSupport(new Object[0], this, f29852a, false, 17975, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f29852a, false, 17975, new Class[0], JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PushConstants.TITLE, "今日头条");
            jSONObject.put("text", "新消息");
            jSONObject.put("id", (int) ((Math.random() * 1000.0d) + 1012.0d));
            jSONObject.put(f.f34168b, "snssdk143://detail?groupid=34265446" + String.valueOf((int) (Math.random() * 100.0d)));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f29852a, false, 17972, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f29852a, false, 17972, new Class[0], String.class);
        }
        return this.f29853b + "|" + String.valueOf(this.f29854c) + "|" + this.f29855d + "|" + String.valueOf(this.f29856e) + "|" + String.valueOf(this.f29857f) + "|" + String.valueOf(this.g) + "|" + this.h;
    }

    public final void a(com.ss.android.message.a.b.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f29852a, false, 17976, new Class[]{com.ss.android.message.a.b.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f29852a, false, 17976, new Class[]{com.ss.android.message.a.b.c.class}, Void.TYPE);
            return;
        }
        Logger.debug();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r20, byte[] r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f29852a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<byte[]> r4 = byte[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 17974(0x4636, float:2.5187E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0045
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f29852a
            r15 = 0
            r16 = 17974(0x4636, float:2.5187E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<byte[]> r1 = byte[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0045:
            if (r1 == 0) goto L_0x008b
            org.json.JSONObject r1 = com.ss.android.pushmanager.app.f.a((byte[]) r1, (boolean) r10)     // Catch:{ DataFormatException -> 0x0086, IOException -> 0x0081, Exception -> 0x007c }
            if (r1 == 0) goto L_0x006a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ DataFormatException -> 0x0086, IOException -> 0x0081, Exception -> 0x007c }
            java.lang.String r3 = "PushUtils.getMessage = "
            r2.<init>(r3)     // Catch:{ DataFormatException -> 0x0086, IOException -> 0x0081, Exception -> 0x007c }
            java.lang.String r3 = r1.toString()     // Catch:{ DataFormatException -> 0x0086, IOException -> 0x0081, Exception -> 0x007c }
            r2.append(r3)     // Catch:{ DataFormatException -> 0x0086, IOException -> 0x0081, Exception -> 0x007c }
            java.lang.String r2 = r2.toString()     // Catch:{ DataFormatException -> 0x0086, IOException -> 0x0081, Exception -> 0x007c }
            com.ss.android.message.a.a.b.a(r0, r2)     // Catch:{ DataFormatException -> 0x0086, IOException -> 0x0081, Exception -> 0x007c }
            java.lang.String r2 = r19.f()     // Catch:{ DataFormatException -> 0x0086, IOException -> 0x0081, Exception -> 0x007c }
            com.ss.android.message.f.a(r0, r1, r11, r2)     // Catch:{ DataFormatException -> 0x0086, IOException -> 0x0081, Exception -> 0x007c }
            goto L_0x008b
        L_0x006a:
            boolean r1 = com.bytedance.common.utility.Logger.debug()     // Catch:{ DataFormatException -> 0x0086, IOException -> 0x0081, Exception -> 0x007c }
            if (r1 == 0) goto L_0x007b
            org.json.JSONObject r1 = r19.g()     // Catch:{ DataFormatException -> 0x0086, IOException -> 0x0081, Exception -> 0x007c }
            java.lang.String r2 = r19.f()     // Catch:{ DataFormatException -> 0x0086, IOException -> 0x0081, Exception -> 0x007c }
            com.ss.android.message.f.a(r0, r1, r11, r2)     // Catch:{ DataFormatException -> 0x0086, IOException -> 0x0081, Exception -> 0x007c }
        L_0x007b:
            return
        L_0x007c:
            r0 = move-exception
            com.ss.android.message.b.h.a((java.lang.Exception) r0)
            goto L_0x008b
        L_0x0081:
            r0 = move-exception
            com.ss.android.message.b.h.a((java.lang.Exception) r0)
            return
        L_0x0086:
            r0 = move-exception
            com.ss.android.message.b.h.a((java.lang.Exception) r0)
            return
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.a.a.c.a(android.content.Context, byte[]):void");
    }
}
