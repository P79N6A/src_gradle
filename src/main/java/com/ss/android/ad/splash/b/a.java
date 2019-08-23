package com.ss.android.ad.splash.b;

import android.text.TextUtils;
import com.ss.android.ad.splash.core.e;
import com.ss.android.ad.splash.core.i;
import org.json.JSONObject;

public class a {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f27493d;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f27494a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f27495b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f27496c;

    private a() {
    }

    public static a a() {
        if (f27493d == null) {
            synchronized (a.class) {
                if (f27493d == null) {
                    f27493d = new a();
                }
            }
        }
        return f27493d;
    }

    public static JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (e.e() == null) {
                return jSONObject;
            }
            String str = e.e().f22770c;
            jSONObject.put("device_id", e.N());
            jSONObject.put("app_version", "1.8.2-rc2");
            jSONObject.put("channel", str);
            jSONObject.put("update_version_code", e.K());
            jSONObject.put("package_name", e.F().getPackageName());
            return jSONObject;
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[SYNTHETIC, Splitter:B:19:0x0034] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(final com.ss.android.ad.splash.core.i r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ss.android.ad.splash.a r0 = com.ss.android.ad.splash.core.e.e()     // Catch:{ all -> 0x005e }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            java.util.concurrent.ExecutorService r0 = com.ss.android.ad.splash.core.e.y()     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x000f
            goto L_0x0059
        L_0x000f:
            com.ss.android.ad.splash.a r0 = com.ss.android.ad.splash.core.e.e()     // Catch:{ all -> 0x005e }
            r2 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0016:
            r0 = 0
            goto L_0x002b
        L_0x0018:
            java.lang.String r0 = r0.f22770c     // Catch:{ all -> 0x005e }
            java.lang.String r3 = com.ss.android.ad.splash.core.e.N()     // Catch:{ all -> 0x005e }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x0016
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x0016
            r0 = 1
        L_0x002b:
            if (r0 != 0) goto L_0x0034
            r4.f27495b = r1     // Catch:{ all -> 0x005e }
            a((com.ss.android.ad.splash.core.i) r5, (boolean) r1)     // Catch:{ all -> 0x005e }
            monitor-exit(r4)
            return
        L_0x0034:
            boolean r0 = r4.f27495b     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x003d
            a((com.ss.android.ad.splash.core.i) r5, (boolean) r2)     // Catch:{ all -> 0x005e }
            monitor-exit(r4)
            return
        L_0x003d:
            int r0 = r4.f27496c     // Catch:{ all -> 0x005e }
            r3 = 5
            if (r0 > r3) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r2 = 0
        L_0x0044:
            if (r2 != 0) goto L_0x004b
            a((com.ss.android.ad.splash.core.i) r5, (boolean) r1)     // Catch:{ all -> 0x005e }
            monitor-exit(r4)
            return
        L_0x004b:
            com.ss.android.ad.splash.core.d.a r0 = com.ss.android.ad.splash.core.d.a.a()     // Catch:{ all -> 0x005e }
            com.ss.android.ad.splash.b.a$1 r1 = new com.ss.android.ad.splash.b.a$1     // Catch:{ all -> 0x005e }
            r1.<init>(r5)     // Catch:{ all -> 0x005e }
            r0.a(r1)     // Catch:{ all -> 0x005e }
            monitor-exit(r4)
            return
        L_0x0059:
            a((com.ss.android.ad.splash.core.i) r5, (boolean) r1)     // Catch:{ all -> 0x005e }
            monitor-exit(r4)
            return
        L_0x005e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.b.a.a(com.ss.android.ad.splash.core.i):void");
    }

    public static void a(i iVar, boolean z) {
        if (iVar != null) {
            if (z) {
                iVar.a(1, "");
            } else {
                iVar.a();
            }
        }
    }

    public final void a(Exception exc, String str) {
        try {
            String message = exc.getMessage();
            if (!TextUtils.isEmpty(message)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, message);
                a("service_ad_exception", (JSONObject) null, jSONObject);
            }
        } catch (Exception unused) {
        }
    }

    public final void a(final String str, int i, final JSONObject jSONObject) {
        if (this.f27494a) {
            if (!this.f27495b) {
                a(new i() {
                    public final void a() {
                    }

                    public final void a(int i, Object obj) {
                        com.bytedance.framwork.core.b.i.a(e.J()).a(str, 1, jSONObject);
                    }
                });
            } else {
                com.bytedance.framwork.core.b.i.a(e.J()).a(str, i, jSONObject);
            }
        }
    }

    public final void a(final String str, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (this.f27494a) {
            if (!this.f27495b) {
                a(new i() {
                    public final void a() {
                    }

                    public final void a(int i, Object obj) {
                        com.bytedance.framwork.core.b.i.a(e.J()).a(str, jSONObject, jSONObject2);
                    }
                });
            } else {
                com.bytedance.framwork.core.b.i.a(e.J()).a(str, jSONObject, jSONObject2);
            }
        }
    }

    public final void a(final String str, int i, final JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.f27494a) {
            if (!this.f27495b) {
                a(new i(null) {
                    public final void a() {
                    }

                    public final void a(int i, Object obj) {
                        com.bytedance.framwork.core.b.i.a(e.J()).a(str, 1, jSONObject, null);
                    }
                });
            } else {
                com.bytedance.framwork.core.b.i.a(e.J()).a(str, i, jSONObject, null);
            }
        }
    }
}
