package com.facebook.common.d;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.common.internal.k;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public final class a {

    /* renamed from: c  reason: collision with root package name */
    private static a f23500c;

    /* renamed from: d  reason: collision with root package name */
    private static final long f23501d = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: a  reason: collision with root package name */
    public volatile StatFs f23502a;

    /* renamed from: b  reason: collision with root package name */
    public volatile StatFs f23503b;

    /* renamed from: e  reason: collision with root package name */
    private volatile File f23504e;

    /* renamed from: f  reason: collision with root package name */
    private volatile File f23505f;
    @GuardedBy
    private long g;
    private final Lock h = new ReentrantLock();
    private volatile boolean i;

    /* renamed from: com.facebook.common.d.a$a  reason: collision with other inner class name */
    public enum C0255a {
        INTERNAL,
        EXTERNAL
    }

    protected a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f23500c == null) {
                f23500c = new a();
            }
            aVar = f23500c;
        }
        return aVar;
    }

    @GuardedBy
    private void d() {
        this.f23502a = a(this.f23502a, this.f23504e);
        this.f23503b = a(this.f23503b, this.f23505f);
        this.g = SystemClock.uptimeMillis();
    }

    public void b() {
        if (!this.i) {
            this.h.lock();
            try {
                if (!this.i) {
                    this.f23504e = Environment.getDataDirectory();
                    this.f23505f = Environment.getExternalStorageDirectory();
                    d();
                    this.i = true;
                }
            } finally {
                this.h.unlock();
            }
        }
    }

    public void c() {
        if (this.h.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.g > f23501d) {
                    d();
                }
            } finally {
                this.h.unlock();
            }
        }
    }

    private static StatFs a(@Nullable StatFs statFs, @Nullable File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        if (statFs == null) {
            try {
                statFs = new StatFs(file.getAbsolutePath());
            } catch (IllegalArgumentException unused) {
                statFs = null;
            } catch (Throwable th) {
                throw k.b(th);
            }
        } else {
            statFs.restat(file.getAbsolutePath());
        }
        return statFs;
    }
}
