package com.ss.android.pushmanager;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.a;
import com.ss.android.pushmanager.setting.b;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30556a;
    private static h k;
    private static final HashSet<Integer> m = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f30557b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f30558c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f30559d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f30560e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f30561f = true;
    private boolean g = true;
    private boolean h = true;
    private boolean i;
    private boolean j = true;
    private boolean l;

    private h() {
    }

    public static h a() {
        if (PatchProxy.isSupport(new Object[0], null, f30556a, true, 18945, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], null, f30556a, true, 18945, new Class[0], h.class);
        }
        if (k == null) {
            synchronized (h.class) {
                if (k == null) {
                    k = new h();
                }
            }
        }
        return k;
    }

    private static void c() {
        if (PatchProxy.isSupport(new Object[0], null, f30556a, true, 18969, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f30556a, true, 18969, new Class[0], Void.TYPE);
            return;
        }
        Logger.debug();
        if (m.isEmpty()) {
            a(b.a().m(), false);
        }
    }

    public final JSONArray b() {
        if (PatchProxy.isSupport(new Object[0], this, f30556a, false, 18966, new Class[0], JSONArray.class)) {
            return (JSONArray) PatchProxy.accessDispatch(new Object[0], this, f30556a, false, 18966, new Class[0], JSONArray.class);
        }
        a((Context) a.a());
        JSONArray jSONArray = new JSONArray();
        if (this.f30557b) {
            jSONArray.put(1);
        }
        if (this.f30558c) {
            jSONArray.put(2);
        }
        if (this.f30559d) {
            jSONArray.put(6);
        }
        if (this.f30560e) {
            jSONArray.put(7);
        }
        if (this.f30561f) {
            jSONArray.put(8);
        }
        if (this.g) {
            jSONArray.put(10);
        }
        if (this.h) {
            jSONArray.put(11);
        }
        if (this.i) {
            jSONArray.put(5);
        }
        if (this.j) {
            jSONArray.put(14);
        }
        return jSONArray;
    }

    public static boolean a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, f30556a, true, 18970, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, f30556a, true, 18970, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        c();
        return m.contains(Integer.valueOf(i2));
    }

    public final h b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f30556a, false, 18955, new Class[]{Boolean.TYPE}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f30556a, false, 18955, new Class[]{Boolean.TYPE}, h.class);
        }
        a((Context) a.a());
        this.h = z;
        return this;
    }

    public final h a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f30556a, false, 18954, new Class[]{Boolean.TYPE}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f30556a, false, 18954, new Class[]{Boolean.TYPE}, h.class);
        }
        a((Context) a.a());
        this.g = z;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r10.f30557b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r10.f30561f = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r10.g = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r10.i = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r10.j = false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x008b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x009c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00ed */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x00fe */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0124 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x0143 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.Context r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f30556a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r6[r9] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 18946(0x4a02, float:2.6549E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0030
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f30556a
            r4 = 0
            r5 = 18946(0x4a02, float:2.6549E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r6[r9] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0030:
            boolean r1 = r10.l
            if (r1 == 0) goto L_0x0035
            return
        L_0x0035:
            monitor-enter(r10)
            boolean r1 = r10.l     // Catch:{ all -> 0x0147 }
            if (r1 == 0) goto L_0x003c
            monitor-exit(r10)     // Catch:{ all -> 0x0147 }
            return
        L_0x003c:
            r10.l = r8     // Catch:{ all -> 0x0147 }
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0147 }
            r1[r9] = r11     // Catch:{ all -> 0x0147 }
            com.meituan.robust.ChangeQuickRedirect r3 = f30556a     // Catch:{ all -> 0x0147 }
            r4 = 0
            r5 = 18947(0x4a03, float:2.655E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0147 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r6[r9] = r2     // Catch:{ all -> 0x0147 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0147 }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0147 }
            if (r1 == 0) goto L_0x006d
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0147 }
            r1[r9] = r11     // Catch:{ all -> 0x0147 }
            com.meituan.robust.ChangeQuickRedirect r3 = f30556a     // Catch:{ all -> 0x0147 }
            r4 = 0
            r5 = 18947(0x4a03, float:2.655E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0147 }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r6[r9] = r0     // Catch:{ all -> 0x0147 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0147 }
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0147 }
            goto L_0x0145
        L_0x006d:
            java.lang.String r1 = "com.xiaomi.MiPushAdapter"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x008b }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ Throwable -> 0x008b }
            boolean r1 = r1 instanceof com.ss.android.pushmanager.thirdparty.IPushAdapter     // Catch:{ Throwable -> 0x008b }
            if (r1 == 0) goto L_0x0087
            com.ss.android.pushmanager.d r1 = com.ss.android.pushmanager.f.a()     // Catch:{ Throwable -> 0x008b }
            android.util.Pair r1 = r1.b()     // Catch:{ Throwable -> 0x008b }
            if (r1 == 0) goto L_0x0087
            r1 = 1
            goto L_0x0088
        L_0x0087:
            r1 = 0
        L_0x0088:
            r10.f30557b = r1     // Catch:{ Throwable -> 0x008b }
            goto L_0x008d
        L_0x008b:
            r10.f30557b = r9     // Catch:{ all -> 0x0147 }
        L_0x008d:
            java.lang.String r1 = "com.umeng.UmengPushAdapter"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x009c }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ Throwable -> 0x009c }
            boolean r1 = r1 instanceof com.ss.android.pushmanager.thirdparty.IPushAdapter     // Catch:{ Throwable -> 0x009c }
            r10.f30559d = r1     // Catch:{ Throwable -> 0x009c }
            goto L_0x009e
        L_0x009c:
            r10.f30559d = r9     // Catch:{ all -> 0x0147 }
        L_0x009e:
            java.lang.String r1 = "com.huawei.HWPushAdapter"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x00ad }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ Throwable -> 0x00ad }
            boolean r1 = r1 instanceof com.ss.android.pushmanager.thirdparty.IPushAdapter     // Catch:{ Throwable -> 0x00ad }
            r10.f30560e = r1     // Catch:{ Throwable -> 0x00ad }
            goto L_0x00af
        L_0x00ad:
            r10.f30560e = r9     // Catch:{ all -> 0x0147 }
        L_0x00af:
            java.lang.String r1 = "com.meizu.MzPushAdapter"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x00cd }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ Throwable -> 0x00cd }
            boolean r1 = r1 instanceof com.ss.android.pushmanager.thirdparty.IPushAdapter     // Catch:{ Throwable -> 0x00cd }
            if (r1 == 0) goto L_0x00c9
            com.ss.android.pushmanager.d r1 = com.ss.android.pushmanager.f.a()     // Catch:{ Throwable -> 0x00cd }
            android.util.Pair r1 = r1.c()     // Catch:{ Throwable -> 0x00cd }
            if (r1 == 0) goto L_0x00c9
            r1 = 1
            goto L_0x00ca
        L_0x00c9:
            r1 = 0
        L_0x00ca:
            r10.f30561f = r1     // Catch:{ Throwable -> 0x00cd }
            goto L_0x00cf
        L_0x00cd:
            r10.f30561f = r9     // Catch:{ all -> 0x0147 }
        L_0x00cf:
            java.lang.String r1 = "com.coloros.OppoPushAdapter"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x00ed }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ Throwable -> 0x00ed }
            boolean r1 = r1 instanceof com.ss.android.pushmanager.thirdparty.IPushAdapter     // Catch:{ Throwable -> 0x00ed }
            if (r1 == 0) goto L_0x00e9
            com.ss.android.pushmanager.d r1 = com.ss.android.pushmanager.f.a()     // Catch:{ Throwable -> 0x00ed }
            android.util.Pair r1 = r1.d()     // Catch:{ Throwable -> 0x00ed }
            if (r1 == 0) goto L_0x00e9
            r1 = 1
            goto L_0x00ea
        L_0x00e9:
            r1 = 0
        L_0x00ea:
            r10.g = r1     // Catch:{ Throwable -> 0x00ed }
            goto L_0x00ef
        L_0x00ed:
            r10.g = r9     // Catch:{ all -> 0x0147 }
        L_0x00ef:
            java.lang.String r1 = "com.vivo.VivoPushAdapter"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x00fe }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ Throwable -> 0x00fe }
            boolean r1 = r1 instanceof com.ss.android.pushmanager.thirdparty.IPushAdapter     // Catch:{ Throwable -> 0x00fe }
            r10.h = r1     // Catch:{ Throwable -> 0x00fe }
            goto L_0x0100
        L_0x00fe:
            r10.h = r9     // Catch:{ all -> 0x0147 }
        L_0x0100:
            java.lang.String r1 = "com.fcm.FcmPushAdapter"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x0124 }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ Throwable -> 0x0124 }
            boolean r1 = r1 instanceof com.ss.android.pushmanager.thirdparty.IPushAdapter     // Catch:{ Throwable -> 0x0124 }
            if (r1 == 0) goto L_0x0120
            java.lang.String r1 = "com.android.vending"
            boolean r1 = com.ss.android.common.util.ToolUtils.isInstalledApp((android.content.Context) r11, (java.lang.String) r1)     // Catch:{ Throwable -> 0x0124 }
            if (r1 == 0) goto L_0x0120
            java.lang.String r1 = "com.google.android.gms"
            boolean r1 = com.ss.android.common.util.ToolUtils.isInstalledApp((android.content.Context) r11, (java.lang.String) r1)     // Catch:{ Throwable -> 0x0124 }
            if (r1 == 0) goto L_0x0120
            r1 = 1
            goto L_0x0121
        L_0x0120:
            r1 = 0
        L_0x0121:
            r10.i = r1     // Catch:{ Throwable -> 0x0124 }
            goto L_0x0126
        L_0x0124:
            r10.i = r9     // Catch:{ all -> 0x0147 }
        L_0x0126:
            java.lang.String r1 = "com.adm.push.AdmPushAdapter"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x0143 }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ Throwable -> 0x0143 }
            boolean r2 = r1 instanceof com.ss.android.pushmanager.thirdparty.IPushAdapter     // Catch:{ Throwable -> 0x0143 }
            if (r2 == 0) goto L_0x013f
            com.ss.android.pushmanager.thirdparty.IPushAdapter r1 = (com.ss.android.pushmanager.thirdparty.IPushAdapter) r1     // Catch:{ Throwable -> 0x0143 }
            r2 = 14
            boolean r0 = r1.isPushAvailable(r11, r2)     // Catch:{ Throwable -> 0x0143 }
            if (r0 == 0) goto L_0x013f
            goto L_0x0140
        L_0x013f:
            r8 = 0
        L_0x0140:
            r10.j = r8     // Catch:{ Throwable -> 0x0143 }
            goto L_0x0145
        L_0x0143:
            r10.j = r9     // Catch:{ all -> 0x0147 }
        L_0x0145:
            monitor-exit(r10)     // Catch:{ all -> 0x0147 }
            return
        L_0x0147:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0147 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.h.a(android.content.Context):void");
    }

    public final boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f30556a, false, 18967, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f30556a, false, 18967, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        a((Context) a.a());
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!"[]".equals(str2)) {
                    JSONArray jSONArray = new JSONArray(str2);
                    if (jSONArray.length() <= 0) {
                        return false;
                    }
                    if (jSONArray.optInt(0) == -9307) {
                        return true;
                    }
                    String jSONArray2 = a().b().toString();
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        int optInt = jSONArray.optInt(i2);
                        if (jSONArray2.contains(optInt)) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    public static void a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f30556a, true, 18968, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, null, f30556a, true, 18968, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            b a2 = b.a();
            if (PatchProxy.isSupport(new Object[]{str2}, a2, b.f2543a, false, 19216, new Class[]{String.class}, Void.TYPE)) {
                b bVar = a2;
                PatchProxy.accessDispatch(new Object[]{str2}, bVar, b.f2543a, false, 19216, new Class[]{String.class}, Void.TYPE);
            } else {
                a2.f2546c.a().a("push_channels_json_array", str2).a();
            }
        }
        if (!TextUtils.isEmpty(str)) {
            JSONArray jSONArray = null;
            try {
                jSONArray = new JSONArray(str2);
            } catch (JSONException unused) {
            }
            if (jSONArray != null) {
                Logger.debug();
                m.clear();
                int length = jSONArray.length();
                boolean z2 = false;
                for (int i2 = 0; i2 < length; i2++) {
                    int optInt = jSONArray.optInt(i2);
                    if (optInt > 0) {
                        m.add(Integer.valueOf(optInt));
                        if (optInt == 2) {
                            z2 = true;
                        }
                    }
                }
                Logger.debug();
                b a3 = b.a();
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, a3, b.f2543a, false, 19212, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    b bVar2 = a3;
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, bVar2, b.f2543a, false, 19212, new Class[]{Boolean.TYPE}, Void.TYPE);
                    return;
                }
                a3.f2546c.a().a("allow_self_push_enable", z2).a();
            }
        }
    }
}
