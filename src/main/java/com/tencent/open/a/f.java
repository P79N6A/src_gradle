package com.tencent.open.a;

import android.text.TextUtils;
import com.tencent.open.a.d;
import com.tencent.open.d.c;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static f f79670a;

    /* renamed from: c  reason: collision with root package name */
    protected static final b f79671c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f79672d;

    /* renamed from: b  reason: collision with root package name */
    protected a f79673b = new a(f79671c);

    private f() {
    }

    static {
        b bVar = new b(c(), c.m, c.g, c.h, c.f79660c, (long) c.i, 10, c.f79662e, c.n);
        f79671c = bVar;
    }

    private static f b() {
        if (f79670a == null) {
            synchronized (f.class) {
                if (f79670a == null) {
                    f79670a = new f();
                    f79672d = true;
                }
            }
        }
        return f79670a;
    }

    public static void a() {
        synchronized (f.class) {
            f b2 = b();
            if (b2.f79673b != null) {
                b2.f79673b.a();
                b2.f79673b.b();
                b2.f79673b = null;
            }
            if (f79670a != null) {
                f79670a = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[Catch:{ Throwable -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021 A[Catch:{ Throwable -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File c() {
        /*
            java.lang.String r0 = com.tencent.open.a.c.f79661d
            r1 = 0
            r2 = 0
            java.lang.String r3 = android.os.Environment.getExternalStorageState()     // Catch:{ Throwable -> 0x0057 }
            java.lang.String r4 = "mounted"
            boolean r4 = r4.equals(r3)     // Catch:{ Throwable -> 0x0057 }
            r5 = 1
            if (r4 != 0) goto L_0x001c
            java.lang.String r4 = "mounted_ro"
            boolean r3 = r4.equals(r3)     // Catch:{ Throwable -> 0x0057 }
            if (r3 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r3 = 0
            goto L_0x001d
        L_0x001c:
            r3 = 1
        L_0x001d:
            if (r3 != 0) goto L_0x0021
            r4 = r1
            goto L_0x004c
        L_0x0021:
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Throwable -> 0x0057 }
            com.tencent.open.a.d$b r4 = new com.tencent.open.a.d$b     // Catch:{ Throwable -> 0x0057 }
            r4.<init>()     // Catch:{ Throwable -> 0x0057 }
            r4.f79666a = r3     // Catch:{ Throwable -> 0x0057 }
            android.os.StatFs r6 = new android.os.StatFs     // Catch:{ Throwable -> 0x0057 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Throwable -> 0x0057 }
            r6.<init>(r3)     // Catch:{ Throwable -> 0x0057 }
            int r3 = r6.getBlockSize()     // Catch:{ Throwable -> 0x0057 }
            long r7 = (long) r3     // Catch:{ Throwable -> 0x0057 }
            int r3 = r6.getBlockCount()     // Catch:{ Throwable -> 0x0057 }
            long r9 = (long) r3     // Catch:{ Throwable -> 0x0057 }
            int r3 = r6.getAvailableBlocks()     // Catch:{ Throwable -> 0x0057 }
            long r11 = (long) r3     // Catch:{ Throwable -> 0x0057 }
            long r9 = r9 * r7
            r4.f79667b = r9     // Catch:{ Throwable -> 0x0057 }
            long r11 = r11 * r7
            r4.f79668c = r11     // Catch:{ Throwable -> 0x0057 }
        L_0x004c:
            if (r4 == 0) goto L_0x0057
            long r3 = r4.f79668c     // Catch:{ Throwable -> 0x0057 }
            long r6 = com.tencent.open.a.c.f79663f     // Catch:{ Throwable -> 0x0057 }
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0057
            r2 = 1
        L_0x0057:
            if (r2 == 0) goto L_0x0063
            java.io.File r1 = new java.io.File
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            r1.<init>(r2, r0)
            return r1
        L_0x0063:
            java.io.File r2 = new java.io.File
            android.content.Context r3 = com.tencent.open.d.c.a()
            if (r3 != 0) goto L_0x006c
            goto L_0x0074
        L_0x006c:
            android.content.Context r1 = com.tencent.open.d.c.a()
            java.io.File r1 = r1.getFilesDir()
        L_0x0074:
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.a.f.c():java.io.File");
    }

    public static final void a(String str, String str2) {
        b().a(1, str, str2, null);
    }

    public static final void b(String str, String str2) {
        b().a(2, str, str2, null);
    }

    public static final void c(String str, String str2) {
        b().a(4, str, str2, null);
    }

    public static final void d(String str, String str2) {
        b().a(8, str, str2, null);
    }

    public static final void e(String str, String str2) {
        b().a(16, str, str2, null);
    }

    public static final void a(String str, String str2, Throwable th) {
        b().a(2, str, str2, th);
    }

    public static final void b(String str, String str2, Throwable th) {
        b().a(16, str, str2, th);
    }

    private void a(int i, String str, String str2, Throwable th) {
        if (f79672d) {
            if (!TextUtils.isEmpty(c.b())) {
                String str3 = r0 + " SDK_VERSION:3.3.0.lite";
                if (this.f79673b != null) {
                    String str4 = str3;
                    e.f79669a.b(32, Thread.currentThread(), System.currentTimeMillis(), "openSDK_LOG", str4, null);
                    this.f79673b.b(32, Thread.currentThread(), System.currentTimeMillis(), "openSDK_LOG", str4, null);
                    f79672d = false;
                } else {
                    return;
                }
            }
        }
        e.f79669a.b(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
        if (d.a.a(c.f79659b, i) && this.f79673b != null) {
            this.f79673b.b(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
        }
    }
}
