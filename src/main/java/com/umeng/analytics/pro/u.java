package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.atomic.AtomicInteger;

public class u {

    /* renamed from: c  reason: collision with root package name */
    private static u f80688c;

    /* renamed from: d  reason: collision with root package name */
    private static SQLiteOpenHelper f80689d;

    /* renamed from: a  reason: collision with root package name */
    private AtomicInteger f80690a = new AtomicInteger();

    /* renamed from: b  reason: collision with root package name */
    private AtomicInteger f80691b = new AtomicInteger();

    /* renamed from: e  reason: collision with root package name */
    private SQLiteDatabase f80692e;

    u() {
    }

    public synchronized SQLiteDatabase a() {
        if (this.f80690a.incrementAndGet() == 1) {
            this.f80692e = f80689d.getWritableDatabase();
        }
        return this.f80692e;
    }

    public synchronized void b() {
        if (this.f80690a.decrementAndGet() == 0) {
            this.f80692e.close();
        }
        if (this.f80691b.decrementAndGet() == 0) {
            this.f80692e.close();
        }
    }

    public static synchronized u a(Context context) {
        u uVar;
        synchronized (u.class) {
            if (f80688c == null) {
                b(context);
            }
            uVar = f80688c;
        }
        return uVar;
    }

    private static synchronized void b(Context context) {
        synchronized (u.class) {
            if (f80688c == null) {
                f80688c = new u();
                f80689d = t.a(context);
            }
        }
    }
}
