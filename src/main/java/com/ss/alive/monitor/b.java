package com.ss.alive.monitor;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.ss.alive.monitor.util.ProcessLockUtil;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f2391c;

    /* renamed from: a  reason: collision with root package name */
    public Context f2392a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2393b;

    /* renamed from: d  reason: collision with root package name */
    private Handler f2394d = new Handler(Looper.getMainLooper());

    public final void a(long j) {
        this.f2394d.postDelayed(new Runnable() {
            public final void run() {
                try {
                    b bVar = b.this;
                    if (d.a(bVar.f2392a).a().f2402a) {
                        long a2 = d.a(bVar.f2392a).f2398a.a("last_send_monitor_live_data_time", 0);
                        d a3 = d.a(bVar.f2392a);
                        int a4 = a3.f2398a.a("send_monitor_live_data_interval_second", a3.a().f2405d);
                        Logger.debug();
                        if ((System.currentTimeMillis() - a2) / 1000 >= ((long) a4)) {
                            ThreadPlus.submitRunnable(new Runnable() {
                                /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                                /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0092 */
                                /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
                                /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3 A[Catch:{ Throwable -> 0x0180 }] */
                                /* JADX WARNING: Removed duplicated region for block: B:36:0x00c6 A[Catch:{ Throwable -> 0x0180 }] */
                                /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1 A[Catch:{ Throwable -> 0x0180 }] */
                                /* JADX WARNING: Removed duplicated region for block: B:42:0x00ed A[Catch:{ Throwable -> 0x0180 }] */
                                /* JADX WARNING: Removed duplicated region for block: B:43:0x00f0 A[Catch:{ Throwable -> 0x0180 }] */
                                /* JADX WARNING: Removed duplicated region for block: B:46:0x010a A[Catch:{ Throwable -> 0x0180 }] */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                public final void run() {
                                    /*
                                        r10 = this;
                                        com.ss.alive.monitor.b r0 = com.ss.alive.monitor.b.this     // Catch:{ Throwable -> 0x0180 }
                                        android.content.Context r1 = r0.f2392a     // Catch:{ Throwable -> 0x0180 }
                                        com.ss.alive.monitor.a.a r1 = com.ss.alive.monitor.a.a.a((android.content.Context) r1)     // Catch:{ Throwable -> 0x0180 }
                                        r2 = 0
                                        android.content.Context r0 = r0.f2392a     // Catch:{ Throwable -> 0x0180 }
                                        com.ss.alive.monitor.d r0 = com.ss.alive.monitor.d.a((android.content.Context) r0)     // Catch:{ Throwable -> 0x0180 }
                                        com.ss.alive.monitor.d$a r0 = r0.a()     // Catch:{ Throwable -> 0x0180 }
                                        int r0 = r0.f2404c     // Catch:{ Throwable -> 0x0180 }
                                        java.util.List r0 = r1.a(r2, r0)     // Catch:{ Throwable -> 0x0180 }
                                        com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0180 }
                                        int r1 = r0.size()     // Catch:{ Throwable -> 0x0180 }
                                        r2 = 1
                                        if (r1 > r2) goto L_0x0025
                                        return
                                    L_0x0025:
                                        org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Throwable -> 0x0180 }
                                        r1.<init>()     // Catch:{ Throwable -> 0x0180 }
                                        r3 = 0
                                        if (r0 == 0) goto L_0x0055
                                        int r4 = r0.size()     // Catch:{ Throwable -> 0x0180 }
                                        if (r4 <= r2) goto L_0x0055
                                        r4 = 0
                                    L_0x0034:
                                        int r5 = r0.size()     // Catch:{ Throwable -> 0x0180 }
                                        int r5 = r5 - r2
                                        if (r4 >= r5) goto L_0x0055
                                        java.lang.Object r5 = r0.get(r4)     // Catch:{ Throwable -> 0x0180 }
                                        com.ss.alive.monitor.a.b r5 = (com.ss.alive.monitor.a.b) r5     // Catch:{ Throwable -> 0x0180 }
                                        org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0180 }
                                        java.lang.String r7 = r5.f2389b     // Catch:{ Throwable -> 0x0180 }
                                        r6.<init>(r7)     // Catch:{ Throwable -> 0x0180 }
                                        java.lang.String r7 = "end_time"
                                        long r8 = r5.f2390c     // Catch:{ Throwable -> 0x0180 }
                                        r6.put(r7, r8)     // Catch:{ Throwable -> 0x0180 }
                                        r1.put(r6)     // Catch:{ Throwable -> 0x0180 }
                                        int r4 = r4 + 1
                                        goto L_0x0034
                                    L_0x0055:
                                        org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0180 }
                                        r4.<init>()     // Catch:{ Throwable -> 0x0180 }
                                        java.lang.String r5 = "launches"
                                        r4.put(r5, r1)     // Catch:{ Throwable -> 0x0180 }
                                        com.ss.alive.monitor.b r1 = com.ss.alive.monitor.b.this     // Catch:{  }
                                        android.content.Context r5 = r1.f2392a     // Catch:{  }
                                        com.ss.alive.monitor.d r5 = com.ss.alive.monitor.d.a((android.content.Context) r5)     // Catch:{  }
                                        com.ss.alive.monitor.d$a r5 = r5.a()     // Catch:{  }
                                        if (r5 == 0) goto L_0x0092
                                        boolean r6 = r5.f2402a     // Catch:{  }
                                        if (r6 == 0) goto L_0x0092
                                        boolean r6 = r5.f2406e     // Catch:{  }
                                        if (r6 == 0) goto L_0x0092
                                        java.util.List<java.lang.String> r5 = r5.f2407f     // Catch:{  }
                                        if (r5 == 0) goto L_0x0092
                                        int r6 = r5.size()     // Catch:{  }
                                        if (r6 > 0) goto L_0x0080
                                        goto L_0x0092
                                    L_0x0080:
                                        org.json.JSONArray r1 = r1.a((java.util.List<java.lang.String>) r5)     // Catch:{  }
                                        if (r1 == 0) goto L_0x0092
                                        int r5 = r1.length()     // Catch:{  }
                                        if (r5 != 0) goto L_0x008d
                                        goto L_0x0092
                                    L_0x008d:
                                        java.lang.String r5 = "unactive_apps"
                                        r4.put(r5, r1)     // Catch:{ Throwable -> 0x0092 }
                                    L_0x0092:
                                        java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0180 }
                                        r1.<init>()     // Catch:{ Throwable -> 0x0180 }
                                        android.util.Pair r5 = new android.util.Pair     // Catch:{ Throwable -> 0x0180 }
                                        java.lang.String r6 = "data"
                                        java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0180 }
                                        r5.<init>(r6, r4)     // Catch:{ Throwable -> 0x0180 }
                                        r1.add(r5)     // Catch:{ Throwable -> 0x0180 }
                                        java.lang.String r4 = com.ss.alive.monitor.a.f2383a     // Catch:{ Throwable -> 0x0180 }
                                        com.ss.android.pushmanager.app.d$b r5 = com.ss.android.pushmanager.app.d.b()     // Catch:{ Throwable -> 0x0180 }
                                        java.util.Map r5 = r5.h()     // Catch:{ Throwable -> 0x0180 }
                                        java.lang.String r6 = "invoke_mode"
                                        com.ss.alive.monitor.b r7 = com.ss.alive.monitor.b.this     // Catch:{ Throwable -> 0x0180 }
                                        android.content.Context r7 = r7.f2392a     // Catch:{ Throwable -> 0x0180 }
                                        com.ss.alive.monitor.b r8 = com.ss.alive.monitor.b.this     // Catch:{ Throwable -> 0x0180 }
                                        android.content.Context r8 = r8.f2392a     // Catch:{ Throwable -> 0x0180 }
                                        java.lang.String r8 = r8.getPackageName()     // Catch:{ Throwable -> 0x0180 }
                                        boolean r7 = com.ss.android.message.b.k.a((android.content.Context) r7, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0180 }
                                        if (r7 == 0) goto L_0x00c6
                                        java.lang.String r7 = "0"
                                        goto L_0x00c8
                                    L_0x00c6:
                                        java.lang.String r7 = "1"
                                    L_0x00c8:
                                        r5.put(r6, r7)     // Catch:{ Throwable -> 0x0180 }
                                        boolean r6 = com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0180 }
                                        if (r6 == 0) goto L_0x00df
                                        java.lang.String r6 = "debug_mode"
                                        java.lang.String r7 = "true"
                                        r5.put(r6, r7)     // Catch:{ Throwable -> 0x0180 }
                                        java.lang.String r6 = "invoke_mode"
                                        java.lang.String r7 = "1"
                                        r5.put(r6, r7)     // Catch:{ Throwable -> 0x0180 }
                                    L_0x00df:
                                        java.lang.String r6 = "local_push"
                                        com.ss.alive.monitor.b r7 = com.ss.alive.monitor.b.this     // Catch:{ Throwable -> 0x0180 }
                                        android.content.Context r7 = r7.f2392a     // Catch:{ Throwable -> 0x0180 }
                                        com.ss.alive.monitor.d r7 = com.ss.alive.monitor.d.a((android.content.Context) r7)     // Catch:{ Throwable -> 0x0180 }
                                        boolean r7 = r7.f2399b     // Catch:{ Throwable -> 0x0180 }
                                        if (r7 == 0) goto L_0x00f0
                                        java.lang.String r7 = "1"
                                        goto L_0x00f2
                                    L_0x00f0:
                                        java.lang.String r7 = "0"
                                    L_0x00f2:
                                        r5.put(r6, r7)     // Catch:{ Throwable -> 0x0180 }
                                        java.lang.String r4 = com.ss.android.message.b.k.a((java.lang.String) r4, (java.util.Map<java.lang.String, java.lang.String>) r5)     // Catch:{ Throwable -> 0x0180 }
                                        com.bytedance.common.utility.NetworkClient r5 = com.bytedance.common.utility.NetworkClient.getDefault()     // Catch:{ Throwable -> 0x0180 }
                                        java.lang.String r1 = r5.post(r4, r1)     // Catch:{ Throwable -> 0x0180 }
                                        com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0180 }
                                        boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x0180 }
                                        if (r4 != 0) goto L_0x017f
                                        com.ss.alive.monitor.b r4 = com.ss.alive.monitor.b.this     // Catch:{ Throwable -> 0x0180 }
                                        android.content.Context r4 = r4.f2392a     // Catch:{ Throwable -> 0x0180 }
                                        com.ss.alive.monitor.d r4 = com.ss.alive.monitor.d.a((android.content.Context) r4)     // Catch:{ Throwable -> 0x0180 }
                                        long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0180 }
                                        com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r4 = r4.f2398a     // Catch:{ Throwable -> 0x0180 }
                                        com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$a r4 = r4.a()     // Catch:{ Throwable -> 0x0180 }
                                        java.lang.String r7 = "last_send_monitor_live_data_time"
                                        com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$a r4 = r4.a((java.lang.String) r7, (long) r5)     // Catch:{ Throwable -> 0x0180 }
                                        r4.a()     // Catch:{ Throwable -> 0x0180 }
                                        org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x017f }
                                        r4.<init>(r1)     // Catch:{ Exception -> 0x017f }
                                        java.lang.String r1 = "code"
                                        r5 = -1
                                        int r1 = r4.optInt(r1, r5)     // Catch:{ Exception -> 0x017f }
                                        if (r1 != 0) goto L_0x0180
                                        if (r0 == 0) goto L_0x0158
                                        int r1 = r0.size()     // Catch:{ Exception -> 0x017f }
                                        if (r1 <= r2) goto L_0x0158
                                    L_0x013b:
                                        int r1 = r0.size()     // Catch:{ Exception -> 0x017f }
                                        int r1 = r1 - r2
                                        if (r3 >= r1) goto L_0x0158
                                        java.lang.Object r1 = r0.get(r3)     // Catch:{ Exception -> 0x017f }
                                        com.ss.alive.monitor.a.b r1 = (com.ss.alive.monitor.a.b) r1     // Catch:{ Exception -> 0x017f }
                                        com.ss.alive.monitor.b r5 = com.ss.alive.monitor.b.this     // Catch:{ Exception -> 0x017f }
                                        android.content.Context r5 = r5.f2392a     // Catch:{ Exception -> 0x017f }
                                        com.ss.alive.monitor.a.a r5 = com.ss.alive.monitor.a.a.a((android.content.Context) r5)     // Catch:{ Exception -> 0x017f }
                                        long r6 = r1.f2388a     // Catch:{ Exception -> 0x017f }
                                        r5.a((long) r6)     // Catch:{ Exception -> 0x017f }
                                        int r3 = r3 + 1
                                        goto L_0x013b
                                    L_0x0158:
                                        java.lang.String r0 = "next_interval"
                                        int r0 = r4.optInt(r0)     // Catch:{ Exception -> 0x017f }
                                        if (r0 <= 0) goto L_0x0177
                                        com.ss.alive.monitor.b r1 = com.ss.alive.monitor.b.this     // Catch:{ Exception -> 0x017f }
                                        android.content.Context r1 = r1.f2392a     // Catch:{ Exception -> 0x017f }
                                        com.ss.alive.monitor.d r1 = com.ss.alive.monitor.d.a((android.content.Context) r1)     // Catch:{ Exception -> 0x017f }
                                        com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r1 = r1.f2398a     // Catch:{ Exception -> 0x017f }
                                        com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$a r1 = r1.a()     // Catch:{ Exception -> 0x017f }
                                        java.lang.String r2 = "send_monitor_live_data_interval_second"
                                        com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$a r0 = r1.a((java.lang.String) r2, (int) r0)     // Catch:{ Exception -> 0x017f }
                                        r0.a()     // Catch:{ Exception -> 0x017f }
                                    L_0x0177:
                                        com.ss.alive.monitor.b r0 = com.ss.alive.monitor.b.this     // Catch:{ Exception -> 0x017f }
                                        android.content.Context r0 = r0.f2392a     // Catch:{ Exception -> 0x017f }
                                        com.ss.alive.monitor.c.a(r0, r4)     // Catch:{ Exception -> 0x017f }
                                        goto L_0x0180
                                    L_0x017f:
                                        return
                                    L_0x0180:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.ss.alive.monitor.b.AnonymousClass2.run():void");
                                }
                            });
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }, 0);
    }

    private b(Context context) {
        this.f2392a = context;
        this.f2393b = ProcessLockUtil.a(this.f2392a);
    }

    public static b a(Context context) {
        if (f2391c == null) {
            synchronized (b.class) {
                if (f2391c == null) {
                    f2391c = new b(context);
                }
            }
        }
        return f2391c;
    }

    private boolean b(String str) {
        if (this.f2392a == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (this.f2392a.getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public JSONArray a(List<String> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (String next : list) {
            int a2 = a(next);
            Logger.debug();
            d a3 = d.a(this.f2392a);
            int i = -1;
            if (!TextUtils.isEmpty(next)) {
                i = a3.f2398a.a(next, -1);
            }
            d a4 = d.a(this.f2392a);
            if (!TextUtils.isEmpty(next)) {
                a4.f2398a.a().a(next, a2);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("package_name", next);
                jSONObject.put("pre_status", i);
                jSONObject.put("cur_status", a2);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0035 A[Catch:{ Exception -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0037 A[Catch:{ Exception -> 0x0085 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 4
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            android.content.Context r0 = r6.f2392a
            if (r0 != 0) goto L_0x000d
            return r1
        L_0x000d:
            boolean r0 = r6.b(r7)     // Catch:{ Exception -> 0x0085 }
            if (r0 != 0) goto L_0x0018
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x0085 }
            r7 = 2
            return r7
        L_0x0018:
            android.content.Context r0 = r6.f2392a     // Catch:{ Exception -> 0x0085 }
            r2 = 0
            if (r0 != 0) goto L_0x001f
        L_0x001d:
            r0 = r2
            goto L_0x0033
        L_0x001f:
            android.content.Context r0 = r6.f2392a     // Catch:{ Exception -> 0x0085 }
            java.io.File r0 = r0.getCacheDir()     // Catch:{ Exception -> 0x0085 }
            if (r0 != 0) goto L_0x0028
            goto L_0x001d
        L_0x0028:
            java.io.File r0 = r0.getParentFile()     // Catch:{ Exception -> 0x0085 }
            if (r0 != 0) goto L_0x002f
            goto L_0x001d
        L_0x002f:
            java.io.File r0 = r0.getParentFile()     // Catch:{ Exception -> 0x0085 }
        L_0x0033:
            if (r0 != 0) goto L_0x0037
            r7 = 5
            return r7
        L_0x0037:
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0085 }
            r3.<init>(r0, r7)     // Catch:{ Exception -> 0x0085 }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0085 }
            java.lang.String r4 = "databases"
            r0.<init>(r3, r4)     // Catch:{ Exception -> 0x0085 }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x0085 }
            r3 = 0
            if (r0 == 0) goto L_0x004b
            return r3
        L_0x004b:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0085 }
            r4 = 19
            r5 = 1
            if (r0 >= r4) goto L_0x005b
            android.content.Context r0 = r6.f2392a     // Catch:{ Exception -> 0x0085 }
            java.io.File r0 = r0.getExternalCacheDir()     // Catch:{ Exception -> 0x0085 }
            if (r0 != 0) goto L_0x005b
            return r5
        L_0x005b:
            android.content.Context r0 = r6.f2392a     // Catch:{ Exception -> 0x0085 }
            if (r0 != 0) goto L_0x0060
            goto L_0x0074
        L_0x0060:
            android.content.Context r0 = r6.f2392a     // Catch:{ Exception -> 0x0085 }
            java.io.File r0 = r0.getExternalCacheDir()     // Catch:{ Exception -> 0x0085 }
            if (r0 != 0) goto L_0x0069
            goto L_0x0074
        L_0x0069:
            java.io.File r0 = r0.getParentFile()     // Catch:{ Exception -> 0x0085 }
            if (r0 != 0) goto L_0x0070
            goto L_0x0074
        L_0x0070:
            java.io.File r2 = r0.getParentFile()     // Catch:{ Exception -> 0x0085 }
        L_0x0074:
            if (r2 != 0) goto L_0x0078
            r7 = 6
            return r7
        L_0x0078:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0085 }
            r0.<init>(r2, r7)     // Catch:{ Exception -> 0x0085 }
            boolean r7 = r0.exists()     // Catch:{ Exception -> 0x0085 }
            if (r7 == 0) goto L_0x0084
            return r3
        L_0x0084:
            return r5
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.alive.monitor.b.a(java.lang.String):int");
    }
}
