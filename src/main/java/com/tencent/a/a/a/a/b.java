package com.tencent.a.a.a.a;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public final class b extends f {
    b(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|3|4|5|6) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r0.<init>()     // Catch:{ all -> 0x0062 }
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x0062 }
            r0.append(r1)     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = "/"
            r0.append(r1)     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = "6X8Y4XdM2Vhvn0I="
            java.lang.String r1 = com.tencent.a.a.a.a.h.c(r1)     // Catch:{ all -> 0x0062 }
            r0.append(r1)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0062 }
            com.tencent.a.a.a.a.a.a((java.lang.String) r0)     // Catch:{ all -> 0x0062 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0062 }
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x0062 }
            java.lang.String r2 = "6X8Y4XdM2Vhvn0KfzcEatGnWaNU="
            java.lang.String r2 = com.tencent.a.a.a.a.h.c(r2)     // Catch:{ all -> 0x0062 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0062 }
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ Exception -> 0x0060 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0060 }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0060 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0060 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0060 }
            r1.<init>()     // Catch:{ Exception -> 0x0060 }
            java.lang.String r2 = "4kU71lN96TJUomD1vOU9lgj9Tw=="
            java.lang.String r2 = com.tencent.a.a.a.a.h.c(r2)     // Catch:{ Exception -> 0x0060 }
            r1.append(r2)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r2 = ","
            r1.append(r2)     // Catch:{ Exception -> 0x0060 }
            r1.append(r4)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0060 }
            r0.write(r4)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r4 = "\n"
            r0.write(r4)     // Catch:{ Exception -> 0x0060 }
            r0.close()     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            monitor-exit(r3)     // Catch:{ all -> 0x0062 }
            return
        L_0x0062:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0062 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.a.a.a.a.b.a(java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return h.a(this.f79217a, "android.permission.WRITE_EXTERNAL_STORAGE") && Environment.getExternalStorageState().equals("mounted");
    }

    /* access modifiers changed from: protected */
    public final String b() {
        String str;
        synchronized (this) {
            try {
                Iterator<String> it2 = a.a(new File(Environment.getExternalStorageDirectory(), h.c("6X8Y4XdM2Vhvn0KfzcEatGnWaNU="))).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String[] split = it2.next().split(",");
                    if (split.length == 2 && split[0].equals(h.c("4kU71lN96TJUomD1vOU9lgj9Tw=="))) {
                        new StringBuilder("read mid from InternalStorage:").append(split[1]);
                        str = split[1];
                        break;
                    }
                }
            } catch (IOException unused) {
            }
            str = null;
        }
        return str;
    }
}
