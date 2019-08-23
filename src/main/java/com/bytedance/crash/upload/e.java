package com.bytedance.crash.upload;

import android.content.Context;
import com.bytedance.crash.event.c;
import com.bytedance.crash.j;
import com.bytedance.crash.runtime.h;

public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Context f19570a;

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f2 A[Catch:{ Exception -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f3 A[Catch:{ Exception -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f8 A[Catch:{ Exception -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0102 A[Catch:{ Exception -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0105 A[Catch:{ Exception -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012a A[Catch:{ Exception -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014f A[Catch:{ Exception -> 0x0160 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            com.bytedance.crash.runtime.d r0 = new com.bytedance.crash.runtime.d     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            android.content.Context r1 = r13.f19570a     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            android.content.Context r1 = r13.f19570a     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            boolean r1 = com.bytedance.crash.i.i.b(r1)     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            r2 = 0
            android.content.Context r3 = r0.f19539a     // Catch:{ Exception -> 0x005e }
            java.lang.String r4 = "npth"
            android.content.SharedPreferences r3 = com.ss.android.ugc.aweme.q.c.a(r3, r4, r2)     // Catch:{ Exception -> 0x005e }
            java.lang.String r4 = "history_time"
            r5 = -1
            long r4 = r3.getLong(r4, r5)     // Catch:{ Exception -> 0x005e }
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0036
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ Exception -> 0x005e }
            java.lang.String r4 = "history_time"
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x005e }
            android.content.SharedPreferences$Editor r3 = r3.putLong(r4, r5)     // Catch:{ Exception -> 0x005e }
            r3.apply()     // Catch:{ Exception -> 0x005e }
            goto L_0x005f
        L_0x0036:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x005e }
            r8 = 0
            long r6 = r6 - r4
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x005f
            android.content.Context r4 = r0.f19539a     // Catch:{ Exception -> 0x005e }
            java.io.File r4 = com.bytedance.crash.i.h.d(r4)     // Catch:{ Exception -> 0x005e }
            com.bytedance.crash.i.d.a((java.io.File) r4)     // Catch:{ Exception -> 0x005e }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ Exception -> 0x005e }
            java.lang.String r4 = "history_time"
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x005e }
            android.content.SharedPreferences$Editor r3 = r3.putLong(r4, r5)     // Catch:{ Exception -> 0x005e }
            r3.apply()     // Catch:{ Exception -> 0x005e }
            goto L_0x005f
        L_0x005e:
        L_0x005f:
            if (r1 == 0) goto L_0x01bb
            android.content.Context r1 = r0.f19539a     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            java.io.File r1 = com.bytedance.crash.i.h.a(r1)     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            java.lang.String r3 = ".npth"
            java.io.File[] r1 = r0.a((java.io.File) r1, (java.lang.String) r3)     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            r3 = 50
            r4 = 1
            if (r1 == 0) goto L_0x0164
            java.util.Comparator r5 = java.util.Collections.reverseOrder()     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            java.util.Arrays.sort(r1, r5)     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            r5 = 0
        L_0x007a:
            int r6 = r1.length     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            if (r5 >= r6) goto L_0x0164
            if (r5 >= r3) goto L_0x0164
            r6 = r1[r5]     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            com.bytedance.crash.db.a r7 = com.bytedance.crash.db.a.a()     // Catch:{ Exception -> 0x0160 }
            java.lang.String r8 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x0160 }
            boolean r7 = r7.a((java.lang.String) r8)     // Catch:{ Exception -> 0x0160 }
            if (r7 == 0) goto L_0x0094
            com.bytedance.crash.i.d.a((java.io.File) r6)     // Catch:{ Exception -> 0x0160 }
            goto L_0x0160
        L_0x0094:
            java.lang.String r7 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x0160 }
            com.bytedance.crash.e.d r7 = com.bytedance.crash.i.d.c(r7)     // Catch:{ Exception -> 0x0160 }
            if (r7 == 0) goto L_0x0160
            org.json.JSONObject r8 = r7.f19424b     // Catch:{ Exception -> 0x0160 }
            if (r8 == 0) goto L_0x0160
            org.json.JSONObject r8 = r7.f19424b     // Catch:{ Exception -> 0x0160 }
            java.lang.String r9 = r6.getName()     // Catch:{ Exception -> 0x0160 }
            r10 = 0
            if (r8 != 0) goto L_0x00b1
            boolean r11 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0160 }
            if (r11 != 0) goto L_0x00e5
        L_0x00b1:
            java.lang.String r11 = "launch_"
            boolean r11 = r9.startsWith(r11)     // Catch:{ Exception -> 0x0160 }
            if (r11 == 0) goto L_0x00bc
            com.bytedance.crash.d r9 = com.bytedance.crash.d.LAUNCH     // Catch:{ Exception -> 0x0160 }
            goto L_0x00e6
        L_0x00bc:
            java.lang.String r11 = "anr_"
            boolean r11 = r9.startsWith(r11)     // Catch:{ Exception -> 0x0160 }
            if (r11 == 0) goto L_0x00c7
            com.bytedance.crash.d r9 = com.bytedance.crash.d.ANR     // Catch:{ Exception -> 0x0160 }
            goto L_0x00e6
        L_0x00c7:
            java.lang.String r11 = "java_"
            boolean r9 = r9.startsWith(r11)     // Catch:{ Exception -> 0x0160 }
            if (r9 == 0) goto L_0x00e5
            java.lang.String r9 = "is_dart"
            int r9 = r8.optInt(r9)     // Catch:{ Exception -> 0x0160 }
            if (r9 != r4) goto L_0x00da
            com.bytedance.crash.d r9 = com.bytedance.crash.d.DART     // Catch:{ Exception -> 0x0160 }
            goto L_0x00e6
        L_0x00da:
            java.lang.String r9 = "isJava"
            int r9 = r8.optInt(r9)     // Catch:{ Exception -> 0x0160 }
            if (r9 != r4) goto L_0x00e5
            com.bytedance.crash.d r9 = com.bytedance.crash.d.JAVA     // Catch:{ Exception -> 0x0160 }
            goto L_0x00e6
        L_0x00e5:
            r9 = r10
        L_0x00e6:
            com.bytedance.crash.d r11 = com.bytedance.crash.d.LAUNCH     // Catch:{ Exception -> 0x0160 }
            if (r9 == r11) goto L_0x00f5
            com.bytedance.crash.d r11 = com.bytedance.crash.d.JAVA     // Catch:{ Exception -> 0x0160 }
            if (r9 == r11) goto L_0x00f5
            com.bytedance.crash.d r11 = com.bytedance.crash.d.DART     // Catch:{ Exception -> 0x0160 }
            if (r9 != r11) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r11 = 0
            goto L_0x00f6
        L_0x00f5:
            r11 = 1
        L_0x00f6:
            if (r11 == 0) goto L_0x0102
            java.lang.String r11 = com.bytedance.crash.c.a.f19382f     // Catch:{ Exception -> 0x0160 }
            com.bytedance.crash.event.a r9 = com.bytedance.crash.event.b.a((com.bytedance.crash.d) r9, (java.lang.String) r11, (org.json.JSONObject) r8)     // Catch:{ Exception -> 0x0160 }
            com.bytedance.crash.event.c.a((com.bytedance.crash.event.a) r9)     // Catch:{ Exception -> 0x0160 }
            goto L_0x0103
        L_0x0102:
            r9 = r10
        L_0x0103:
            if (r9 == 0) goto L_0x010f
            com.bytedance.crash.event.a r9 = r9.clone()     // Catch:{ Exception -> 0x0160 }
            java.lang.String r10 = com.bytedance.crash.c.a.g     // Catch:{ Exception -> 0x0160 }
            com.bytedance.crash.event.a r10 = r9.eventType(r10)     // Catch:{ Exception -> 0x0160 }
        L_0x010f:
            org.json.JSONObject r9 = r7.f19424b     // Catch:{ Exception -> 0x0160 }
            java.lang.String r11 = "upload_scene"
            java.lang.String r12 = "launch_scan"
            r9.put(r11, r12)     // Catch:{ Exception -> 0x0160 }
            java.lang.String r9 = r7.f19423a     // Catch:{ Exception -> 0x0160 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0160 }
            boolean r7 = r7.f19426d     // Catch:{ Exception -> 0x0160 }
            com.bytedance.crash.upload.h r7 = com.bytedance.crash.upload.b.a((java.lang.String) r9, (java.lang.String) r8, (boolean) r7)     // Catch:{ Exception -> 0x0160 }
            boolean r8 = r7.a()     // Catch:{ Exception -> 0x0160 }
            if (r8 == 0) goto L_0x014f
            boolean r8 = com.bytedance.crash.i.d.a((java.io.File) r6)     // Catch:{ Exception -> 0x0160 }
            if (r8 != 0) goto L_0x013f
            com.bytedance.crash.db.a r8 = com.bytedance.crash.db.a.a()     // Catch:{ Exception -> 0x0160 }
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x0160 }
            com.bytedance.crash.db.a.a r6 = com.bytedance.crash.db.a.a.a(r6)     // Catch:{ Exception -> 0x0160 }
            r8.a((com.bytedance.crash.db.a.a) r6)     // Catch:{ Exception -> 0x0160 }
        L_0x013f:
            if (r10 == 0) goto L_0x0160
            com.bytedance.crash.event.a r6 = r10.state(r2)     // Catch:{ Exception -> 0x0160 }
            org.json.JSONObject r7 = r7.f19589c     // Catch:{ Exception -> 0x0160 }
            com.bytedance.crash.event.a r6 = r6.errorInfo((org.json.JSONObject) r7)     // Catch:{ Exception -> 0x0160 }
            com.bytedance.crash.event.c.a((com.bytedance.crash.event.a) r6)     // Catch:{ Exception -> 0x0160 }
            goto L_0x0160
        L_0x014f:
            if (r10 == 0) goto L_0x0160
            int r6 = r7.f19587a     // Catch:{ Exception -> 0x0160 }
            com.bytedance.crash.event.a r6 = r10.state(r6)     // Catch:{ Exception -> 0x0160 }
            java.lang.String r7 = r7.f19588b     // Catch:{ Exception -> 0x0160 }
            com.bytedance.crash.event.a r6 = r6.errorInfo((java.lang.String) r7)     // Catch:{ Exception -> 0x0160 }
            com.bytedance.crash.event.c.a((com.bytedance.crash.event.a) r6)     // Catch:{ Exception -> 0x0160 }
        L_0x0160:
            int r5 = r5 + 1
            goto L_0x007a
        L_0x0164:
            r0.a((boolean) r4)     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            android.content.Context r1 = r0.f19539a     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            java.io.File r1 = com.bytedance.crash.i.h.c(r1)     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            java.lang.String r4 = ".npth"
            java.io.File[] r0 = r0.a((java.io.File) r1, (java.lang.String) r4)     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            if (r0 == 0) goto L_0x01b7
            java.util.Comparator r1 = java.util.Collections.reverseOrder()     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            java.util.Arrays.sort(r0, r1)     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
        L_0x017c:
            int r1 = r0.length     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            if (r2 >= r1) goto L_0x01b7
            if (r2 >= r3) goto L_0x01b7
            r1 = r0[r2]     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            java.lang.String r4 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x01b4 }
            com.bytedance.crash.e.d r4 = com.bytedance.crash.i.d.d(r4)     // Catch:{ Exception -> 0x01b4 }
            if (r4 == 0) goto L_0x01b4
            org.json.JSONObject r5 = r4.f19424b     // Catch:{ Exception -> 0x01b4 }
            if (r5 == 0) goto L_0x019a
            org.json.JSONObject r5 = r4.f19424b     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = "upload_scene"
            java.lang.String r7 = "launch_scan"
            r5.put(r6, r7)     // Catch:{ Exception -> 0x01b4 }
        L_0x019a:
            java.lang.String r5 = com.bytedance.crash.upload.b.a()     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = r4.f19428f     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r7 = r4.f19427e     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r8 = r4.g     // Catch:{ Exception -> 0x01b4 }
            java.util.List<java.lang.String> r9 = r4.h     // Catch:{ Exception -> 0x01b4 }
            boolean r5 = com.bytedance.crash.upload.b.a((java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.util.List<java.lang.String>) r9)     // Catch:{ Exception -> 0x01b4 }
            if (r5 == 0) goto L_0x01b4
            com.bytedance.crash.i.d.a((java.io.File) r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r1 = r4.f19425c     // Catch:{ Exception -> 0x01b4 }
            com.bytedance.crash.i.d.a((java.lang.String) r1)     // Catch:{ Exception -> 0x01b4 }
        L_0x01b4:
            int r2 = r2 + 1
            goto L_0x017c
        L_0x01b7:
            com.bytedance.crash.event.c.a()     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
            goto L_0x01be
        L_0x01bb:
            r0.a((boolean) r2)     // Catch:{ Throwable -> 0x01be, all -> 0x01dd }
        L_0x01be:
            android.content.Context r0 = r13.f19570a
            com.bytedance.crash.runtime.a r1 = com.bytedance.crash.j.a()
            java.util.Map r1 = r1.a()
            com.bytedance.crash.runtime.j r0 = com.bytedance.crash.runtime.j.a(r0, r1)
            r0.a()
            android.os.Handler r0 = com.bytedance.crash.runtime.h.b()
            android.content.Context r1 = r13.f19570a
            com.bytedance.crash.h.d r0 = com.bytedance.crash.h.d.a(r0, r1)
            r0.a()
            return
        L_0x01dd:
            r0 = move-exception
            android.content.Context r1 = r13.f19570a
            com.bytedance.crash.runtime.a r2 = com.bytedance.crash.j.a()
            java.util.Map r2 = r2.a()
            com.bytedance.crash.runtime.j r1 = com.bytedance.crash.runtime.j.a(r1, r2)
            r1.a()
            android.os.Handler r1 = com.bytedance.crash.runtime.h.b()
            android.content.Context r2 = r13.f19570a
            com.bytedance.crash.h.d r1 = com.bytedance.crash.h.d.a(r1, r2)
            r1.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.upload.e.run():void");
    }

    private e(Context context) {
        this.f19570a = context;
    }

    public static void a(Context context, int i) {
        try {
            if (!j.a().b().equals(context.getPackageName())) {
                return;
            }
        } catch (Exception unused) {
        }
        h.b().postDelayed(new e(context), 0);
        if (h.b().getLooper() == null) {
            c.a();
        }
    }
}
