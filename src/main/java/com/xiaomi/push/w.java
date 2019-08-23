package com.xiaomi.push;

import android.content.Context;
import java.io.File;

public abstract class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Context f82610a;

    /* renamed from: a  reason: collision with other field name */
    private File f1027a;

    /* renamed from: a  reason: collision with other field name */
    private Runnable f1028a;

    private w(Context context, File file) {
        this.f82610a = context;
        this.f1027a = file;
    }

    /* synthetic */ w(Context context, File file, x xVar) {
        this(context, file);
    }

    public static void a(Context context, File file, Runnable runnable) {
        new x(context, file, runnable).run();
    }

    /* access modifiers changed from: protected */
    public abstract void a(Context context);

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
            java.io.File r1 = r5.f1027a     // Catch:{ IOException -> 0x003e, all -> 0x0037 }
            if (r1 != 0) goto L_0x0014
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x003e, all -> 0x0037 }
            android.content.Context r2 = r5.f82610a     // Catch:{ IOException -> 0x003e, all -> 0x0037 }
            java.io.File r2 = r2.getFilesDir()     // Catch:{ IOException -> 0x003e, all -> 0x0037 }
            java.lang.String r3 = "default_locker"
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x003e, all -> 0x0037 }
            r5.f1027a = r1     // Catch:{ IOException -> 0x003e, all -> 0x0037 }
        L_0x0014:
            android.content.Context r1 = r5.f82610a     // Catch:{ IOException -> 0x003e, all -> 0x0037 }
            java.io.File r2 = r5.f1027a     // Catch:{ IOException -> 0x003e, all -> 0x0037 }
            com.xiaomi.push.v r1 = com.xiaomi.push.v.a(r1, r2)     // Catch:{ IOException -> 0x003e, all -> 0x0037 }
            java.lang.Runnable r0 = r5.f1028a     // Catch:{ IOException -> 0x0035, all -> 0x0030 }
            if (r0 == 0) goto L_0x0025
            java.lang.Runnable r0 = r5.f1028a     // Catch:{ IOException -> 0x0035, all -> 0x0030 }
            r0.run()     // Catch:{ IOException -> 0x0035, all -> 0x0030 }
        L_0x0025:
            android.content.Context r0 = r5.f82610a     // Catch:{ IOException -> 0x0035, all -> 0x0030 }
            r5.a(r0)     // Catch:{ IOException -> 0x0035, all -> 0x0030 }
            if (r1 == 0) goto L_0x0044
            r1.a()
            goto L_0x0044
        L_0x0030:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x0038
        L_0x0035:
            r0 = r1
            goto L_0x003f
        L_0x0037:
            r1 = move-exception
        L_0x0038:
            if (r0 == 0) goto L_0x003d
            r0.a()
        L_0x003d:
            throw r1
        L_0x003e:
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.a()
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.w.run():void");
    }
}
