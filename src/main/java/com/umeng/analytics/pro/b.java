package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.atomic.AtomicInteger;

public class b {

    /* renamed from: c  reason: collision with root package name */
    private static b f80415c;

    /* renamed from: d  reason: collision with root package name */
    private static SQLiteOpenHelper f80416d;

    /* renamed from: a  reason: collision with root package name */
    private AtomicInteger f80417a = new AtomicInteger();

    /* renamed from: b  reason: collision with root package name */
    private AtomicInteger f80418b = new AtomicInteger();

    /* renamed from: e  reason: collision with root package name */
    private SQLiteDatabase f80419e;

    public synchronized void c() {
        if (this.f80417a.decrementAndGet() == 0) {
            this.f80419e.close();
        }
        if (this.f80418b.decrementAndGet() == 0) {
            this.f80419e.close();
        }
    }

    public synchronized SQLiteDatabase a() {
        if (this.f80417a.incrementAndGet() == 1) {
            this.f80419e = f80416d.getReadableDatabase();
        }
        return this.f80419e;
    }

    public synchronized SQLiteDatabase b() {
        if (this.f80417a.incrementAndGet() == 1) {
            this.f80419e = f80416d.getWritableDatabase();
        }
        return this.f80419e;
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            if (f80415c == null) {
                b(context);
            }
            bVar = f80415c;
        }
        return bVar;
    }

    private static synchronized void b(Context context) {
        synchronized (b.class) {
            if (f80415c == null) {
                f80415c = new b();
                f80416d = c.a(context);
            }
        }
    }
}
