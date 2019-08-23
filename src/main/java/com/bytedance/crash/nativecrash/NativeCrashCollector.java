package com.bytedance.crash.nativecrash;

import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.crash.d;
import com.bytedance.crash.g;
import com.bytedance.crash.i.m;
import com.bytedance.crash.j;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NativeCrashCollector {
    private static void a(Thread thread) {
        for (g a2 : j.b().f19344e) {
            a2.a(d.NATIVE, "", thread);
        }
    }

    @NonNull
    private static Pair<Thread, String> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new Pair<>(null, null);
        }
        if ("main".equalsIgnoreCase(str)) {
            Thread thread = Looper.getMainLooper().getThread();
            return new Pair<>(thread, m.a(thread.getStackTrace()));
        }
        try {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                String name = ((Thread) next.getKey()).getName();
                if (name.equals(str) || name.startsWith(str)) {
                    return new Pair<>(next.getKey(), m.a((StackTraceElement[]) next.getValue()));
                }
                if (name.endsWith(str)) {
                    return new Pair<>(next.getKey(), m.a((StackTraceElement[]) next.getValue()));
                }
            }
        } catch (Throwable unused) {
        }
        return new Pair<>(null, null);
    }

    @NonNull
    static JSONArray a(String[] strArr, String[] strArr2) {
        JSONArray jSONArray = new JSONArray();
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            return jSONArray;
        }
        int i = 0;
        while (i < strArr.length) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lib_name", strArr2[i]);
                jSONObject.put("lib_uuid", strArr[i]);
                jSONArray.put(jSONObject);
                i++;
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Thread} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Thread} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012c  */
    @android.support.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void onNativeCrash(java.lang.String r11, java.lang.String r12, java.lang.String[] r13, java.lang.String[] r14) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            com.bytedance.crash.d r2 = com.bytedance.crash.d.NATIVE
            java.lang.String r3 = com.bytedance.crash.c.a.f19380d
            r4 = 0
            com.bytedance.crash.event.a r2 = com.bytedance.crash.event.b.a(r2, r3, r0, r4)
            com.bytedance.crash.event.c.b(r2)
            com.bytedance.crash.event.a r2 = r2.clone()
            java.lang.String r3 = com.bytedance.crash.c.a.f19381e
            com.bytedance.crash.event.a r2 = r2.eventType(r3)
            if (r11 != 0) goto L_0x001e
            java.lang.String r11 = ""
        L_0x001e:
            r9 = r11
            java.io.File r11 = new java.io.File     // Catch:{ IOException -> 0x010d, all -> 0x010a }
            r11.<init>(r9)     // Catch:{ IOException -> 0x010d, all -> 0x010a }
            java.io.File r11 = r11.getParentFile()     // Catch:{ IOException -> 0x010d, all -> 0x010a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x010d, all -> 0x010a }
            java.lang.String r5 = "[onNativeCrash] nativeCrashFilename="
            r3.<init>(r5)     // Catch:{ IOException -> 0x010d, all -> 0x010a }
            r3.append(r9)     // Catch:{ IOException -> 0x010d, all -> 0x010a }
            java.lang.String r5 = " crashedThreadNameStartOrEnd="
            r3.append(r5)     // Catch:{ IOException -> 0x010d, all -> 0x010a }
            r3.append(r12)     // Catch:{ IOException -> 0x010d, all -> 0x010a }
            android.util.Pair r3 = a((java.lang.String) r12)     // Catch:{ IOException -> 0x010d, all -> 0x010a }
            java.lang.String r5 = ".log"
            java.io.File r5 = com.bytedance.crash.i.h.a(r11, r5)     // Catch:{ IOException -> 0x0108 }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ IOException -> 0x0108 }
            java.lang.String r6 = ".logcat"
            java.io.File r6 = com.bytedance.crash.i.h.a(r11, r6)     // Catch:{ IOException -> 0x0108 }
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ IOException -> 0x0108 }
            java.lang.String r7 = "\n"
            java.lang.String r5 = com.bytedance.crash.i.d.a((java.lang.String) r5, (java.lang.String) r7)     // Catch:{ IOException -> 0x0108 }
            android.content.Context r7 = com.bytedance.crash.j.d()     // Catch:{ IOException -> 0x0108 }
            com.bytedance.crash.e.a r0 = com.bytedance.crash.e.a.a(r0, r7, r4)     // Catch:{ IOException -> 0x0108 }
            r0.f19418b = r6     // Catch:{ IOException -> 0x0108 }
            java.lang.String r1 = "crash_thread_name"
            java.lang.Object r6 = r3.first     // Catch:{ IOException -> 0x0108 }
            if (r6 != 0) goto L_0x006b
            java.lang.String r6 = ""
            goto L_0x006d
        L_0x006b:
            java.lang.Object r6 = r3.first     // Catch:{ IOException -> 0x0108 }
        L_0x006d:
            r0.a((java.lang.String) r1, (java.lang.Object) r6)     // Catch:{ IOException -> 0x0108 }
            java.lang.String r1 = "java_data"
            java.lang.Object r6 = r3.second     // Catch:{ IOException -> 0x0108 }
            if (r6 != 0) goto L_0x0079
            java.lang.String r6 = ""
            goto L_0x007d
        L_0x0079:
            java.lang.Object r6 = r3.second     // Catch:{ IOException -> 0x0108 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x0108 }
        L_0x007d:
            r0.a((java.lang.String) r1, (java.lang.Object) r6)     // Catch:{ IOException -> 0x0108 }
            org.json.JSONObject r12 = com.bytedance.crash.i.m.a((java.lang.String) r12)     // Catch:{ IOException -> 0x0108 }
            java.lang.String r1 = "all_thread_stacks"
            r0.a((java.lang.String) r1, (java.lang.Object) r12)     // Catch:{ IOException -> 0x0108 }
            java.lang.String r12 = "crash_lib_uuid"
            org.json.JSONArray r13 = a(r13, r14)     // Catch:{ IOException -> 0x0108 }
            r0.a((java.lang.String) r12, (java.lang.Object) r13)     // Catch:{ IOException -> 0x0108 }
            java.lang.String r12 = "native_log"
            java.lang.String r13 = "\n"
            org.json.JSONArray r13 = com.bytedance.crash.i.d.b(r5, r13)     // Catch:{ IOException -> 0x0108 }
            r0.a((java.lang.String) r12, (java.lang.Object) r13)     // Catch:{ IOException -> 0x0108 }
            com.bytedance.crash.runtime.assembly.e r12 = com.bytedance.crash.runtime.assembly.e.a()     // Catch:{ IOException -> 0x0108 }
            com.bytedance.crash.d r13 = com.bytedance.crash.d.NATIVE     // Catch:{ IOException -> 0x0108 }
            r12.a(r13, r0)     // Catch:{ IOException -> 0x0108 }
            java.lang.String r12 = "crash_uuid"
            java.lang.String r11 = r11.getName()     // Catch:{ IOException -> 0x0108 }
            r0.a((java.lang.String) r12, (java.lang.Object) r11)     // Catch:{ IOException -> 0x0108 }
            r11 = 0
            com.bytedance.crash.event.a r11 = r2.state(r11)     // Catch:{ IOException -> 0x0108 }
            com.bytedance.crash.event.c.b(r11)     // Catch:{ IOException -> 0x0108 }
            android.content.Context r11 = com.bytedance.crash.j.d()     // Catch:{ IOException -> 0x0108 }
            com.bytedance.crash.d r12 = com.bytedance.crash.d.NATIVE     // Catch:{ IOException -> 0x0108 }
            java.lang.String r12 = r12.getName()     // Catch:{ IOException -> 0x0108 }
            java.lang.Object r13 = r3.first     // Catch:{ IOException -> 0x0108 }
            if (r13 != 0) goto L_0x00c7
            r13 = r4
            goto L_0x00cf
        L_0x00c7:
            java.lang.Object r13 = r3.first     // Catch:{ IOException -> 0x0108 }
            java.lang.Thread r13 = (java.lang.Thread) r13     // Catch:{ IOException -> 0x0108 }
            java.lang.String r13 = r13.getName()     // Catch:{ IOException -> 0x0108 }
        L_0x00cf:
            com.bytedance.crash.i.d.a((android.content.Context) r11, (java.lang.String) r12, (java.lang.String) r13)     // Catch:{ IOException -> 0x0108 }
            org.json.JSONObject r11 = r0.f19417a     // Catch:{ IOException -> 0x0108 }
            if (r11 == 0) goto L_0x0100
            int r12 = r11.length()     // Catch:{ IOException -> 0x0108 }
            if (r12 > 0) goto L_0x00dd
            goto L_0x0100
        L_0x00dd:
            java.lang.String r7 = com.bytedance.crash.upload.b.b()     // Catch:{ Throwable -> 0x0100 }
            java.io.File r12 = new java.io.File     // Catch:{ Throwable -> 0x0100 }
            r12.<init>(r9)     // Catch:{ Throwable -> 0x0100 }
            java.io.File r5 = r12.getParentFile()     // Catch:{ Throwable -> 0x0100 }
            java.lang.String r12 = ".ntmp"
            java.io.File r12 = com.bytedance.crash.i.h.a(r5, r12)     // Catch:{ Throwable -> 0x0100 }
            java.lang.String r6 = r12.getName()     // Catch:{ Throwable -> 0x0100 }
            r10 = 0
            r8 = r11
            com.bytedance.crash.i.d.a((java.io.File) r5, (java.lang.String) r6, (java.lang.String) r7, (org.json.JSONObject) r8, (java.lang.String) r9, (boolean) r10)     // Catch:{ Throwable -> 0x0100 }
            java.lang.String r12 = "upload_scene"
            java.lang.String r13 = "direct"
            r11.put(r12, r13)     // Catch:{ Throwable -> 0x0100 }
        L_0x0100:
            java.lang.Object r11 = r3.first
            java.lang.Thread r11 = (java.lang.Thread) r11
            a((java.lang.Thread) r11)
            return
        L_0x0108:
            r11 = move-exception
            goto L_0x010f
        L_0x010a:
            r11 = move-exception
            r3 = r4
            goto L_0x0129
        L_0x010d:
            r11 = move-exception
            r3 = r4
        L_0x010f:
            r12 = 301(0x12d, float:4.22E-43)
            com.bytedance.crash.event.a r12 = r2.state(r12)     // Catch:{ all -> 0x0128 }
            com.bytedance.crash.event.a r11 = r12.errorInfo((java.lang.Throwable) r11)     // Catch:{ all -> 0x0128 }
            com.bytedance.crash.event.c.b(r11)     // Catch:{ all -> 0x0128 }
            if (r3 != 0) goto L_0x011f
            goto L_0x0124
        L_0x011f:
            java.lang.Object r11 = r3.first
            r4 = r11
            java.lang.Thread r4 = (java.lang.Thread) r4
        L_0x0124:
            a((java.lang.Thread) r4)
            return
        L_0x0128:
            r11 = move-exception
        L_0x0129:
            if (r3 != 0) goto L_0x012c
            goto L_0x0131
        L_0x012c:
            java.lang.Object r12 = r3.first
            r4 = r12
            java.lang.Thread r4 = (java.lang.Thread) r4
        L_0x0131:
            a((java.lang.Thread) r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.NativeCrashCollector.onNativeCrash(java.lang.String, java.lang.String, java.lang.String[], java.lang.String[]):void");
    }
}
