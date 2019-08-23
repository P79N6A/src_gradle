package com.bytedance.crash.runtime;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.crash.event.b;
import com.bytedance.crash.i.h;
import com.bytedance.crash.nativecrash.c;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public Context f19539a;

    public d(Context context) {
        this.f19539a = context;
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008f A[SYNTHETIC, Splitter:B:34:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0096 A[SYNTHETIC, Splitter:B:41:0x0096] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.bytedance.crash.nativecrash.c r10) {
        /*
            java.lang.String r0 = ".info"
            java.io.File r10 = r10.a((java.lang.String) r0)
            boolean r0 = r10.isFile()
            if (r0 == 0) goto L_0x009b
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0094 }
            r2.<init>(r10)     // Catch:{ Throwable -> 0x0094 }
            r0.load(r2)     // Catch:{ Throwable -> 0x0093 }
            r2.close()     // Catch:{ Throwable -> 0x0093 }
            java.lang.String r2 = "alogJsonGenerated"
            java.lang.String r2 = r0.getProperty(r2)
            if (r2 != 0) goto L_0x009b
            java.lang.String r2 = "aloglogdir"
            java.lang.String r2 = r0.getProperty(r2)
            if (r2 == 0) goto L_0x009b
            java.lang.String r3 = "crash_time"
            java.lang.String r3 = r0.getProperty(r3)
            r4 = 0
            if (r3 == 0) goto L_0x0042
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ NumberFormatException -> 0x0041 }
            long r6 = r3.longValue()     // Catch:{ NumberFormatException -> 0x0041 }
            r4 = r6
            goto L_0x0042
        L_0x0041:
        L_0x0042:
            java.lang.String r3 = "process_name"
            java.lang.String r3 = r0.getProperty(r3)
            if (r3 != 0) goto L_0x004c
            java.lang.String r3 = ""
        L_0x004c:
            com.bytedance.crash.a.e r6 = new com.bytedance.crash.a.e
            r6.<init>(r3)
            java.util.List r2 = r6.a(r2, r4)
            com.bytedance.crash.e.d r2 = com.bytedance.crash.a.a.a((java.util.List<java.lang.String>) r2)
            boolean r3 = com.bytedance.crash.a.a.a((com.bytedance.crash.e.d) r2)
            if (r3 != 0) goto L_0x0060
            return
        L_0x0060:
            android.content.Context r3 = com.bytedance.crash.j.d()
            java.io.File r4 = com.bytedance.crash.i.h.c(r3)
            java.lang.String r5 = com.bytedance.crash.i.h.a()
            java.lang.String r6 = r2.f19427e
            java.lang.String r7 = r2.f19428f
            java.lang.String r8 = r2.g
            java.util.List<java.lang.String> r9 = r2.h
            com.bytedance.crash.i.d.a((java.io.File) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.util.List<java.lang.String>) r9)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x008d }
            r2.<init>(r10)     // Catch:{ Throwable -> 0x008d }
            java.lang.String r10 = "alogJsonGenerated"
            java.lang.String r1 = "true"
            r0.setProperty(r10, r1)     // Catch:{ Throwable -> 0x008c }
            java.lang.String r10 = ""
            r0.store(r2, r10)     // Catch:{ Throwable -> 0x008c }
            r2.close()     // Catch:{ Throwable -> 0x008c }
            return
        L_0x008c:
            r1 = r2
        L_0x008d:
            if (r1 == 0) goto L_0x009b
            r1.close()     // Catch:{ Throwable -> 0x009b }
            return
        L_0x0093:
            r1 = r2
        L_0x0094:
            if (r1 == 0) goto L_0x009a
            r1.close()     // Catch:{ Throwable -> 0x009a }
            return
        L_0x009a:
            return
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.d.a(com.bytedance.crash.nativecrash.c):void");
    }

    public void a(boolean z) {
        File[] a2 = a(h.b(this.f19539a), (String) null);
        if (a2 != null) {
            c cVar = new c(this.f19539a);
            Arrays.sort(a2, Collections.reverseOrder());
            for (File file : a2) {
                if (file.isDirectory()) {
                    cVar.f19496a = file;
                    boolean a3 = cVar.a();
                    if (!a3) {
                        ArrayList a4 = b.a(cVar);
                        if (a4 != null) {
                            com.bytedance.crash.event.c.a(a4);
                            cVar.b(".evt");
                        }
                    }
                    if (!a3) {
                        a(cVar);
                    }
                    if (cVar.c()) {
                        if (z) {
                            a(cVar, null, false);
                        }
                    } else if (!a3) {
                        boolean a5 = cVar.a(file);
                        if (!a5 || !z) {
                            StringBuilder sb = new StringBuilder("[collectNativeCrashLog] isCompleteCrash=");
                            sb.append(a5);
                            sb.append(", isNetEnable=");
                            sb.append(z);
                        } else {
                            a(cVar, file.getName(), true);
                        }
                    } else if (cVar.b()) {
                        cVar.e();
                    }
                }
            }
        }
    }

    @Nullable
    public File[] a(File file, String str) {
        File[] fileArr;
        if (!file.exists()) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            fileArr = file.listFiles();
        } else {
            fileArr = file.listFiles(new FilenameFilter() {
                public final boolean accept(File file, String str) {
                    if (str == null || !str.endsWith(".npth")) {
                        return false;
                    }
                    return true;
                }
            });
        }
        return fileArr;
    }

    @Nullable
    private static com.bytedance.crash.e.d a(c cVar, boolean z) {
        if (!cVar.c()) {
            return null;
        }
        File a2 = h.a(cVar.f19496a, ".npth");
        com.bytedance.crash.e.d c2 = com.bytedance.crash.i.d.c(a2.getAbsolutePath());
        if (c2 == null && !z && cVar.a(cVar.f19496a)) {
            c2 = com.bytedance.crash.i.d.c(a2.getAbsolutePath());
        }
        if (c2 == null) {
            cVar.e();
        }
        return c2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.bytedance.crash.nativecrash.c r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            r0 = 0
            boolean r1 = r6.c()     // Catch:{ Throwable -> 0x009a }
            if (r1 != 0) goto L_0x0008
            return
        L_0x0008:
            com.bytedance.crash.e.d r8 = a((com.bytedance.crash.nativecrash.c) r6, (boolean) r8)     // Catch:{ Throwable -> 0x009a }
            if (r8 == 0) goto L_0x0099
            org.json.JSONObject r1 = r8.f19424b     // Catch:{ Throwable -> 0x009a }
            if (r1 == 0) goto L_0x0099
            java.io.File r1 = r6.f19496a     // Catch:{ Throwable -> 0x009a }
            java.lang.String r2 = ".npth"
            java.io.File r1 = com.bytedance.crash.i.h.a(r1, r2)     // Catch:{ Throwable -> 0x009a }
            com.bytedance.crash.db.a r2 = com.bytedance.crash.db.a.a()     // Catch:{ Throwable -> 0x009a }
            java.lang.String r3 = r1.getAbsolutePath()     // Catch:{ Throwable -> 0x009a }
            boolean r2 = r2.a((java.lang.String) r3)     // Catch:{ Throwable -> 0x009a }
            if (r2 != 0) goto L_0x0096
            org.json.JSONObject r2 = r8.f19424b     // Catch:{ Throwable -> 0x009a }
            java.lang.String r3 = "upload_scene"
            java.lang.String r4 = "launch_scan"
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x009a }
            if (r7 == 0) goto L_0x0038
            java.lang.String r3 = "crash_uuid"
            r2.put(r3, r7)     // Catch:{ Throwable -> 0x009a }
        L_0x0038:
            com.bytedance.crash.d r7 = com.bytedance.crash.d.NATIVE     // Catch:{ Throwable -> 0x009a }
            java.lang.String r3 = com.bytedance.crash.c.a.f19382f     // Catch:{ Throwable -> 0x009a }
            com.bytedance.crash.event.a r7 = com.bytedance.crash.event.b.a((com.bytedance.crash.d) r7, (java.lang.String) r3, (org.json.JSONObject) r2)     // Catch:{ Throwable -> 0x009a }
            com.bytedance.crash.event.c.a((com.bytedance.crash.event.a) r7)     // Catch:{ Throwable -> 0x009a }
            com.bytedance.crash.event.a r7 = r7.clone()     // Catch:{ Throwable -> 0x009a }
            java.lang.String r3 = com.bytedance.crash.c.a.g     // Catch:{ Throwable -> 0x009a }
            com.bytedance.crash.event.a r7 = r7.eventType(r3)     // Catch:{ Throwable -> 0x009a }
            java.lang.String r0 = r8.f19423a     // Catch:{ Throwable -> 0x0093 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0093 }
            java.lang.String r8 = r8.f19425c     // Catch:{ Throwable -> 0x0093 }
            com.bytedance.crash.upload.h r8 = com.bytedance.crash.upload.b.a((java.lang.String) r0, (java.lang.String) r2, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0093 }
            boolean r0 = r8.a()     // Catch:{ Throwable -> 0x0093 }
            if (r0 == 0) goto L_0x0083
            boolean r6 = r6.e()     // Catch:{ Throwable -> 0x0093 }
            if (r6 != 0) goto L_0x0074
            com.bytedance.crash.db.a r6 = com.bytedance.crash.db.a.a()     // Catch:{ Throwable -> 0x0093 }
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ Throwable -> 0x0093 }
            com.bytedance.crash.db.a.a r0 = com.bytedance.crash.db.a.a.a(r0)     // Catch:{ Throwable -> 0x0093 }
            r6.a((com.bytedance.crash.db.a.a) r0)     // Catch:{ Throwable -> 0x0093 }
        L_0x0074:
            r6 = 0
            com.bytedance.crash.event.a r6 = r7.state(r6)     // Catch:{ Throwable -> 0x0093 }
            org.json.JSONObject r8 = r8.f19589c     // Catch:{ Throwable -> 0x0093 }
            com.bytedance.crash.event.a r6 = r6.errorInfo((org.json.JSONObject) r8)     // Catch:{ Throwable -> 0x0093 }
            com.bytedance.crash.event.c.a((com.bytedance.crash.event.a) r6)     // Catch:{ Throwable -> 0x0093 }
            goto L_0x0099
        L_0x0083:
            int r6 = r8.f19587a     // Catch:{ Throwable -> 0x0093 }
            com.bytedance.crash.event.a r6 = r7.state(r6)     // Catch:{ Throwable -> 0x0093 }
            java.lang.String r8 = r8.f19588b     // Catch:{ Throwable -> 0x0093 }
            com.bytedance.crash.event.a r6 = r6.errorInfo((java.lang.String) r8)     // Catch:{ Throwable -> 0x0093 }
            com.bytedance.crash.event.c.a((com.bytedance.crash.event.a) r6)     // Catch:{ Throwable -> 0x0093 }
            goto L_0x00aa
        L_0x0093:
            r6 = move-exception
            r0 = r7
            goto L_0x009b
        L_0x0096:
            r6.e()     // Catch:{ Throwable -> 0x009a }
        L_0x0099:
            return
        L_0x009a:
            r6 = move-exception
        L_0x009b:
            if (r0 == 0) goto L_0x00aa
            r7 = 211(0xd3, float:2.96E-43)
            com.bytedance.crash.event.a r7 = r0.state(r7)
            com.bytedance.crash.event.a r6 = r7.errorInfo((java.lang.Throwable) r6)
            com.bytedance.crash.event.c.a((com.bytedance.crash.event.a) r6)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.d.a(com.bytedance.crash.nativecrash.c, java.lang.String, boolean):void");
    }
}
