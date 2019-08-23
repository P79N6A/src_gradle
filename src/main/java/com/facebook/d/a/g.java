package com.facebook.d.a;

import android.os.StrictMode;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class g {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public static g f23583a;

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<byte[]> f23584b = new ThreadLocal<byte[]>() {
        public final /* bridge */ /* synthetic */ Object initialValue() {
            return new byte[512];
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private static long f23585c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static f f23586d = new f();

    /* renamed from: e  reason: collision with root package name */
    private static a f23587e = new a();

    /* renamed from: f  reason: collision with root package name */
    private String f23588f;

    @Nonnull
    public static synchronized g a() {
        g gVar;
        synchronized (g.class) {
            if (f23583a == null) {
                f23583a = new g("/proc/net/xt_qtaguid/stats");
            }
            gVar = f23583a;
        }
        return gVar;
    }

    private g(String str) {
        this.f23588f = str;
    }

    public final long a(int i) {
        FileInputStream fileInputStream;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        long j = 0;
        try {
            fileInputStream = new FileInputStream(this.f23588f);
            f fVar = f23586d;
            fVar.f23579a = fileInputStream;
            fVar.f23581c = 0;
            fVar.f23580b = 0;
            byte[] bArr = f23584b.get();
            f23586d.a();
            while (true) {
                int a2 = f23586d.a(bArr);
                if (a2 == -1) {
                    break;
                }
                try {
                    a aVar = f23587e;
                    aVar.f23556a = bArr;
                    aVar.f23557b = 0;
                    aVar.f23558c = a2;
                    aVar.f23560e = false;
                    a aVar2 = f23587e;
                    aVar2.a();
                    aVar2.f23559d = ' ';
                    aVar2.f23560e = true;
                    f23587e.c();
                    if (!f23587e.a("lo")) {
                        f23587e.c();
                        if (f23587e.b() == i) {
                            f23587e.c();
                            j += (long) f23587e.b();
                        }
                    }
                } catch (NumberFormatException | NoSuchElementException unused) {
                }
            }
            fileInputStream.close();
            if (f23585c == -1) {
                f23585c = j;
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return -1;
            }
            long j2 = j - f23585c;
            f23585c = j;
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return j2;
        } catch (IOException unused2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return -1;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
