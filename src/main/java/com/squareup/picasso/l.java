package com.squareup.picasso;

import android.graphics.Bitmap;
import java.util.LinkedHashMap;

public final class l implements d {

    /* renamed from: b  reason: collision with root package name */
    final LinkedHashMap<String, Bitmap> f27423b;

    /* renamed from: c  reason: collision with root package name */
    private final int f27424c;

    /* renamed from: d  reason: collision with root package name */
    private int f27425d;

    /* renamed from: e  reason: collision with root package name */
    private int f27426e;

    /* renamed from: f  reason: collision with root package name */
    private int f27427f;
    private int g;
    private int h;

    public final synchronized int a() {
        return this.f27425d;
    }

    public final synchronized int b() {
        return this.f27424c;
    }

    private l(int i) {
        if (i > 0) {
            this.f27424c = i;
            this.f27423b = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("Max size must be positive.");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "activity"
            java.lang.Object r0 = com.squareup.picasso.ad.a((android.content.Context) r5, (java.lang.String) r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            int r5 = r5.flags
            r1 = 1048576(0x100000, float:1.469368E-39)
            r5 = r5 & r1
            if (r5 == 0) goto L_0x0015
            r5 = 1
            goto L_0x0016
        L_0x0015:
            r5 = 0
        L_0x0016:
            int r2 = r0.getMemoryClass()
            if (r5 == 0) goto L_0x0026
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 11
            if (r5 < r3) goto L_0x0026
            int r2 = r0.getLargeMemoryClass()
        L_0x0026:
            int r2 = r2 * r1
            int r2 = r2 / 7
            r4.<init>((int) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.l.<init>(android.content.Context):void");
    }

    public final Bitmap a(String str) {
        if (str != null) {
            synchronized (this) {
                Bitmap bitmap = this.f27423b.get(str);
                if (bitmap != null) {
                    this.g++;
                    return bitmap;
                }
                this.h++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r4) {
        /*
            r3 = this;
        L_0x0000:
            monitor-enter(r3)
            int r0 = r3.f27425d     // Catch:{ all -> 0x0071 }
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f27423b     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0011
            int r0 = r3.f27425d     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r3.f27425d     // Catch:{ all -> 0x0071 }
            if (r0 <= r4) goto L_0x0050
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f27423b     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f27423b     // Catch:{ all -> 0x0071 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0071 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0071 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r3.f27423b     // Catch:{ all -> 0x0071 }
            r2.remove(r1)     // Catch:{ all -> 0x0071 }
            int r1 = r3.f27425d     // Catch:{ all -> 0x0071 }
            int r0 = com.squareup.picasso.ad.a((android.graphics.Bitmap) r0)     // Catch:{ all -> 0x0071 }
            int r1 = r1 - r0
            r3.f27425d = r1     // Catch:{ all -> 0x0071 }
            int r0 = r3.f27427f     // Catch:{ all -> 0x0071 }
            int r0 = r0 + 1
            r3.f27427f = r0     // Catch:{ all -> 0x0071 }
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0000
        L_0x0050:
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            return
        L_0x0052:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Class r1 = r3.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0071 }
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
            r4.<init>(r0)     // Catch:{ all -> 0x0071 }
            throw r4     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.l.a(int):void");
    }

    public final void a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        synchronized (this) {
            this.f27426e++;
            this.f27425d += ad.a(bitmap);
            Bitmap bitmap2 = (Bitmap) this.f27423b.put(str, bitmap);
            if (bitmap2 != null) {
                this.f27425d -= ad.a(bitmap2);
            }
        }
        a(this.f27424c);
    }
}
