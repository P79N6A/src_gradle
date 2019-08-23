package com.ss.android.ugc.aweme.global.config.settings;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Method;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49550a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f49551b = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static final g f49552e = new g();

    /* renamed from: f  reason: collision with root package name */
    private static a f49553f;
    private static com.ss.android.ugc.aweme.global.config.settings.pojo.a g;
    private static Method h;

    /* renamed from: c  reason: collision with root package name */
    public a f49554c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f49555d;

    public interface a {
        com.ss.android.ugc.aweme.global.config.settings.pojo.a get();
    }

    private g() {
    }

    public static g a() {
        return f49552e;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.global.config.settings.pojo.a b() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f49550a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.global.config.settings.pojo.a> r7 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.class
            r2 = 0
            r4 = 1
            r5 = 47583(0xb9df, float:6.6678E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f49550a
            r5 = 1
            r6 = 47583(0xb9df, float:6.6678E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.global.config.settings.pojo.a> r8 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r0 = (com.ss.android.ugc.aweme.global.config.settings.pojo.a) r0
            return r0
        L_0x0028:
            com.ss.android.ugc.aweme.global.config.settings.g r1 = a()
            com.ss.android.ugc.aweme.global.config.settings.g$a r1 = r1.f49554c
            if (r1 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.global.config.settings.g r1 = a()
            com.ss.android.ugc.aweme.global.config.settings.g$a r1 = r1.f49554c
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r1 = r1.get()
            if (r1 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.global.config.settings.g r0 = a()
            com.ss.android.ugc.aweme.global.config.settings.g$a r0 = r0.f49554c
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r0 = r0.get()
            return r0
        L_0x0047:
            java.lang.Object r1 = f49551b
            monitor-enter(r1)
        L_0x004a:
            com.ss.android.ugc.aweme.global.config.settings.g r2 = a()     // Catch:{ all -> 0x0147 }
            com.ss.android.ugc.aweme.global.config.settings.g$a r2 = r2.f49554c     // Catch:{ all -> 0x0147 }
            if (r2 == 0) goto L_0x006b
            com.ss.android.ugc.aweme.global.config.settings.g r2 = a()     // Catch:{ all -> 0x0147 }
            com.ss.android.ugc.aweme.global.config.settings.g$a r2 = r2.f49554c     // Catch:{ all -> 0x0147 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r2 = r2.get()     // Catch:{ all -> 0x0147 }
            if (r2 != 0) goto L_0x005f
            goto L_0x006b
        L_0x005f:
            com.ss.android.ugc.aweme.global.config.settings.g r0 = a()     // Catch:{ all -> 0x0147 }
            com.ss.android.ugc.aweme.global.config.settings.g$a r0 = r0.f49554c     // Catch:{ all -> 0x0147 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r0 = r0.get()     // Catch:{ all -> 0x0147 }
            monitor-exit(r1)     // Catch:{ all -> 0x0147 }
            return r0
        L_0x006b:
            com.ss.android.ugc.aweme.global.config.settings.g r2 = a()     // Catch:{ all -> 0x0147 }
            boolean r2 = r2.f49555d     // Catch:{ all -> 0x0147 }
            if (r2 == 0) goto L_0x0097
            java.lang.Object r2 = f49551b     // Catch:{ InterruptedException -> 0x007a }
            r3 = 2000(0x7d0, double:9.88E-321)
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x007a }
        L_0x007a:
            com.ss.android.ugc.aweme.global.config.settings.g r2 = a()     // Catch:{ all -> 0x0147 }
            com.ss.android.ugc.aweme.global.config.settings.g$a r2 = r2.f49554c     // Catch:{ all -> 0x0147 }
            if (r2 == 0) goto L_0x008f
            com.ss.android.ugc.aweme.global.config.settings.g r2 = a()     // Catch:{ all -> 0x0147 }
            com.ss.android.ugc.aweme.global.config.settings.g$a r2 = r2.f49554c     // Catch:{ all -> 0x0147 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r2 = r2.get()     // Catch:{ all -> 0x0147 }
            if (r2 == 0) goto L_0x008f
            goto L_0x004a
        L_0x008f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0147 }
            java.lang.String r2 = "must call init() before get()!"
            r0.<init>(r2)     // Catch:{ all -> 0x0147 }
            throw r0     // Catch:{ all -> 0x0147 }
        L_0x0097:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0147 }
            r4 = 0
            java.lang.Object r5 = f49551b     // Catch:{ InterruptedException -> 0x00b9 }
            r5.wait()     // Catch:{ InterruptedException -> 0x00b9 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x00b9 }
            java.lang.String r6 = "Wait "
            r5.<init>(r6)     // Catch:{ InterruptedException -> 0x00b9 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException -> 0x00b9 }
            r8 = 0
            long r6 = r6 - r2
            r5.append(r6)     // Catch:{ InterruptedException -> 0x00b9 }
            java.lang.String r5 = r5.toString()     // Catch:{ InterruptedException -> 0x00b9 }
            a(r4, r5)     // Catch:{ InterruptedException -> 0x00b9 }
            goto L_0x004a
        L_0x00b9:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
            java.lang.String r7 = "InterruptedException "
            r6.<init>(r7)     // Catch:{ all -> 0x0147 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0147 }
            r9 = 0
            long r7 = r7 - r2
            r6.append(r7)     // Catch:{ all -> 0x0147 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0147 }
            a(r5, r6)     // Catch:{ all -> 0x0147 }
            com.ss.android.ugc.aweme.global.config.settings.g$a r5 = f49553f     // Catch:{ Throwable -> 0x010d }
            if (r5 != 0) goto L_0x00f1
            java.lang.String r5 = "com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ Throwable -> 0x010d }
            java.lang.String r6 = "inst"
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ Throwable -> 0x010d }
            java.lang.reflect.Method r5 = r5.getMethod(r6, r7)     // Catch:{ Throwable -> 0x010d }
            r6 = 1
            r5.setAccessible(r6)     // Catch:{ Throwable -> 0x010d }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x010d }
            java.lang.Object r0 = r5.invoke(r4, r0)     // Catch:{ Throwable -> 0x010d }
            com.ss.android.ugc.aweme.global.config.settings.g$a r0 = (com.ss.android.ugc.aweme.global.config.settings.g.a) r0     // Catch:{ Throwable -> 0x010d }
            f49553f = r0     // Catch:{ Throwable -> 0x010d }
        L_0x00f1:
            com.ss.android.ugc.aweme.global.config.settings.g$a r0 = f49553f     // Catch:{ Throwable -> 0x010d }
            if (r0 == 0) goto L_0x0105
            com.ss.android.ugc.aweme.global.config.settings.g$a r0 = f49553f     // Catch:{ Throwable -> 0x010d }
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r0 = r0.get()     // Catch:{ Throwable -> 0x010d }
            if (r0 == 0) goto L_0x0105
            com.ss.android.ugc.aweme.global.config.settings.g$a r0 = f49553f     // Catch:{ Throwable -> 0x010d }
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r0 = r0.get()     // Catch:{ Throwable -> 0x010d }
            monitor-exit(r1)     // Catch:{ all -> 0x0147 }
            return r0
        L_0x0105:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Throwable -> 0x010d }
            java.lang.String r5 = "sIesSettingsProxyWrapReflect or sIesSettingsProxyWrapReflect.get() can not be null"
            r0.<init>(r5)     // Catch:{ Throwable -> 0x010d }
            throw r0     // Catch:{ Throwable -> 0x010d }
        L_0x010d:
            r0 = move-exception
            r0.getMessage()     // Catch:{ all -> 0x0147 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
            java.lang.String r6 = "Throwable "
            r5.<init>(r6)     // Catch:{ all -> 0x0147 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0147 }
            r8 = 0
            long r6 = r6 - r2
            r5.append(r6)     // Catch:{ all -> 0x0147 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0147 }
            a(r0, r2)     // Catch:{ all -> 0x0147 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r0 = g     // Catch:{ all -> 0x0147 }
            if (r0 != 0) goto L_0x0143
            com.squareup.wire.DefaultValueBuilder r0 = new com.squareup.wire.DefaultValueBuilder     // Catch:{ all -> 0x0147 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings$Builder r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings$Builder     // Catch:{ all -> 0x0147 }
            r2.<init>()     // Catch:{ all -> 0x0147 }
            r0.<init>(r2)     // Catch:{ all -> 0x0147 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.a     // Catch:{ all -> 0x0147 }
            com.squareup.wire.Message r0 = r0.build()     // Catch:{ all -> 0x0147 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = (com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings) r0     // Catch:{ all -> 0x0147 }
            r2.<init>(r0, r4)     // Catch:{ all -> 0x0147 }
            g = r2     // Catch:{ all -> 0x0147 }
        L_0x0143:
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r0 = g     // Catch:{ all -> 0x0147 }
            monitor-exit(r1)     // Catch:{ all -> 0x0147 }
            return r0
        L_0x0147:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0147 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.global.config.settings.g.b():com.ss.android.ugc.aweme.global.config.settings.pojo.a");
    }

    private static void a(Throwable th, String str) {
        String str2;
        int i;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{th, str3}, null, f49550a, true, 47584, new Class[]{Throwable.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th, str3}, null, f49550a, true, 47584, new Class[]{Throwable.class, String.class}, Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("classDesc", "SettingsReader");
            jSONObject.put("errorField", "SettingsReader");
            if (th == null || th.getMessage() == null) {
                str2 = "";
            } else {
                str2 = th.getMessage();
            }
            jSONObject.put("errorDesc", str2);
            jSONObject.put("jsonDesc", str3);
            if (th != null) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("status", i);
            if (h == null) {
                Method method = Class.forName("com.ss.android.ugc.aweme.global.config.settings.SettingsReaderUtil").getMethod("monitorError", new Class[]{JSONObject.class});
                h = method;
                method.setAccessible(true);
            }
            h.invoke(null, new Object[]{jSONObject});
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }
}
