package com.bytedance.crash.nativecrash;

import android.content.Context;
import com.bytedance.crash.e.a;
import com.bytedance.crash.i.d;
import com.bytedance.crash.i.h;
import com.bytedance.crash.i.k;
import com.bytedance.crash.runtime.j;
import java.io.File;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public File f19496a;

    /* renamed from: b  reason: collision with root package name */
    private Context f19497b;

    public final boolean e() {
        return d.a(this.f19496a, true);
    }

    public final boolean a() {
        File a2 = h.a(this.f19496a, ".ind");
        if (!a2.exists() || a2.length() == 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        return h.a(this.f19496a, ".npth").exists();
    }

    public final e d() {
        if (!c(".nls")) {
            return f();
        }
        e eVar = new e(0);
        eVar.f19508c = h.a(this.f19496a, ".nls");
        return eVar;
    }

    public final boolean b() {
        File a2 = h.a(this.f19496a, ".info");
        if (a2.exists()) {
            try {
                Map<String, String> b2 = d.b(a2);
                if (b2 != null) {
                    String str = b2.get("start_time");
                    if (str == null || System.currentTimeMillis() - Long.decode(str).longValue() > 86400000) {
                        return true;
                    }
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private e f() {
        e eVar;
        File a2 = h.a(this.f19496a, ".rst");
        File a3 = h.a(this.f19496a, ".sts");
        int i = 1;
        if (a2.exists()) {
            String absolutePath = a2.getAbsolutePath();
            String absolutePath2 = a3.getAbsolutePath();
            if (!NativeCrashMonitor.f19488a) {
                i = 4;
            } else if (new File(absolutePath).exists()) {
                File file = new File(absolutePath2);
                if (file.isFile()) {
                    file.delete();
                }
                i = NativeCrashMonitor.doConvertRstFileToStsFile(absolutePath, absolutePath2);
            }
            if (i == 0) {
                try {
                    d.a(a2);
                } catch (SecurityException unused) {
                }
            } else {
                d.a(a3);
            }
            eVar = new e(i);
        } else {
            eVar = new e(a3.exists() ^ true ? 1 : 0);
        }
        eVar.f19506a = a3;
        eVar.f19507b = a2;
        return eVar;
    }

    public c(Context context) {
        this.f19497b = context;
    }

    private boolean c(String str) {
        return h.a(this.f19496a, str).exists();
    }

    public final File a(String str) {
        if (str == null) {
            return null;
        }
        return h.a(this.f19496a, str);
    }

    public final boolean b(String str) {
        File a2 = a(str);
        if (a2 != null) {
            try {
                return d.a(a2);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055 A[Catch:{ IOException -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059 A[Catch:{ IOException -> 0x00c5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.io.File r12) {
        /*
            r11 = this;
            java.lang.String r0 = ".dmp"
            java.io.File r0 = com.bytedance.crash.i.h.a(r12, r0)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 != 0) goto L_0x000e
            return r2
        L_0x000e:
            java.lang.String r1 = ".info"
            java.io.File r1 = com.bytedance.crash.i.h.a(r12, r1)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L_0x00c5
            java.util.Map r5 = com.bytedance.crash.i.d.b((java.io.File) r1)
            com.bytedance.crash.nativecrash.e r1 = r11.d()
            java.lang.String r3 = ".log"
            java.io.File r3 = com.bytedance.crash.i.h.a(r12, r3)
            java.lang.String r4 = ".logcat"
            java.io.File r4 = com.bytedance.crash.i.h.a(r12, r4)
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.String r6 = r1.a()     // Catch:{ IOException -> 0x00c5 }
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x00c5 }
            java.lang.String r3 = "\n"
            java.lang.String r7 = com.bytedance.crash.i.d.a((java.lang.String) r1, (java.lang.String) r3)     // Catch:{ IOException -> 0x00c5 }
            com.bytedance.crash.b r1 = com.bytedance.crash.j.b()     // Catch:{ IOException -> 0x00c5 }
            com.bytedance.crash.h r1 = r1.g     // Catch:{ IOException -> 0x00c5 }
            r3 = 1
            if (r1 == 0) goto L_0x0052
            boolean r1 = r1.b()     // Catch:{ IOException -> 0x00c5 }
            if (r1 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r1 = 0
            goto L_0x0053
        L_0x0052:
            r1 = 1
        L_0x0053:
            if (r1 != 0) goto L_0x0059
            com.bytedance.crash.i.d.a((java.io.File) r12, (boolean) r3)     // Catch:{ IOException -> 0x00c5 }
            return r2
        L_0x0059:
            r1 = 0
            java.lang.String r8 = ".ntmp"
            boolean r8 = r11.c(r8)     // Catch:{ IOException -> 0x00c5 }
            if (r8 == 0) goto L_0x0091
            java.lang.String r8 = ".ntmp"
            java.io.File r8 = com.bytedance.crash.i.h.a(r12, r8)     // Catch:{ IOException -> 0x00c5 }
            java.lang.String r9 = r8.getAbsolutePath()     // Catch:{ IOException -> 0x00c5 }
            java.lang.String r9 = com.bytedance.crash.i.d.b((java.lang.String) r9)     // Catch:{ IOException -> 0x00c5 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0090 }
            r10.<init>(r9)     // Catch:{ JSONException -> 0x0090 }
            java.lang.String r9 = "body"
            org.json.JSONObject r9 = r10.optJSONObject(r9)     // Catch:{ JSONException -> 0x0090 }
            java.lang.String r10 = "data"
            r9.put(r10, r6)     // Catch:{ JSONException -> 0x0090 }
            com.bytedance.crash.e.a r10 = new com.bytedance.crash.e.a     // Catch:{ JSONException -> 0x0090 }
            r10.<init>(r9)     // Catch:{ JSONException -> 0x0090 }
            java.lang.String r1 = ".npth"
            java.io.File r1 = com.bytedance.crash.i.h.a(r12, r1)     // Catch:{ JSONException -> 0x008e }
            r8.renameTo(r1)     // Catch:{ JSONException -> 0x008e }
        L_0x008e:
            r1 = r10
            goto L_0x0091
        L_0x0090:
        L_0x0091:
            if (r1 != 0) goto L_0x009d
            java.util.List r8 = com.bytedance.crash.runtime.e.a(r4)     // Catch:{ IOException -> 0x00c5 }
            r4 = r11
            r9 = r12
            com.bytedance.crash.e.a r1 = r4.a(r5, r6, r7, r8, r9)     // Catch:{ IOException -> 0x00c5 }
        L_0x009d:
            if (r1 != 0) goto L_0x00a0
            return r2
        L_0x00a0:
            java.lang.String r6 = com.bytedance.crash.upload.b.b()     // Catch:{ IOException -> 0x00c5 }
            java.lang.String r4 = ".npth"
            java.io.File r4 = com.bytedance.crash.i.h.a(r12, r4)     // Catch:{ IOException -> 0x00c5 }
            java.lang.String r5 = r4.getName()     // Catch:{ IOException -> 0x00c5 }
            org.json.JSONObject r7 = r1.f19417a     // Catch:{ IOException -> 0x00c5 }
            java.lang.String r8 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x00c5 }
            r9 = 0
            r4 = r12
            java.lang.String r12 = com.bytedance.crash.i.d.a((java.io.File) r4, (java.lang.String) r5, (java.lang.String) r6, (org.json.JSONObject) r7, (java.lang.String) r8, (boolean) r9)     // Catch:{ IOException -> 0x00c5 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c5 }
            java.lang.String r1 = "[repackIncompleteNativeCrash] crashFilePath="
            r0.<init>(r1)     // Catch:{ IOException -> 0x00c5 }
            r0.append(r12)     // Catch:{ IOException -> 0x00c5 }
            return r3
        L_0x00c5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.c.a(java.io.File):boolean");
    }

    private a a(Map<String, String> map, String str, String str2, List<String> list, File file) {
        com.bytedance.crash.e.c a2 = com.bytedance.crash.e.c.a(this.f19497b);
        JSONObject a3 = j.a(file);
        if (a3 == null) {
            return null;
        }
        a2.a(a3);
        if (com.bytedance.crash.j.a() != null) {
            a2.a(com.bytedance.crash.j.c().a());
            if (com.bytedance.crash.j.a().f19511a != null) {
                a2.a(com.bytedance.crash.j.a().f19511a.c());
            }
        }
        a aVar = new a();
        aVar.a(a2);
        aVar.a("is_native_crash", (Object) 1);
        aVar.a("remote_process", (Object) 0);
        aVar.a("data", (Object) str);
        aVar.a("repack_time", (Object) Long.valueOf(System.currentTimeMillis()));
        aVar.a("native_log", (Object) d.b(str2, "\n"));
        if (map == null) {
            return aVar;
        }
        String str3 = map.get("process_name");
        if (str3 != null) {
            aVar.a("process_name", (Object) str3);
        }
        String str4 = map.get("start_time");
        if (str4 != null) {
            try {
                aVar.a(Long.decode(str4).longValue());
            } catch (Throwable unused) {
            }
        }
        String str5 = map.get("pid");
        if (str5 != null) {
            try {
                aVar.a("pid", (Object) Long.decode(str5));
            } catch (Throwable unused2) {
            }
        }
        String str6 = map.get("crash_thread_name");
        if (str6 != null) {
            aVar.a("crash_thread_name", (Object) str6);
        }
        String str7 = map.get("crash_time");
        if (str7 != null) {
            try {
                aVar.a("crash_time", (Object) Long.decode(str7));
            } catch (Throwable unused3) {
            }
        }
        if (list != null && list.size() > 0) {
            aVar.b(list);
        }
        String str8 = map.get("lib_names");
        String str9 = map.get("lib_uuid");
        if (!(str8 == null || str9 == null)) {
            aVar.a("crash_lib_uuid", (Object) NativeCrashCollector.a(str9.split(","), str8.split(",")));
        }
        k.a(aVar, a2, com.bytedance.crash.d.NATIVE);
        return aVar;
    }
}
