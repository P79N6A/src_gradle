package com.bytedance.crash.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.crash.db.b.b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f19409a;

    /* renamed from: b  reason: collision with root package name */
    private b f19410b;

    /* renamed from: c  reason: collision with root package name */
    private SQLiteDatabase f19411c;

    private a() {
    }

    public static a a() {
        if (f19409a == null) {
            synchronized (a.class) {
                if (f19409a == null) {
                    f19409a = new a();
                }
            }
        }
        return f19409a;
    }

    public final void a(Context context) {
        try {
            this.f19411c = new b(context).getWritableDatabase();
        } catch (Throwable unused) {
        }
        this.f19410b = new b();
    }

    public final synchronized void a(com.bytedance.crash.db.a.a aVar) {
        if (this.f19410b != null) {
            this.f19410b.a(this.f19411c, aVar);
        }
    }

    public final synchronized boolean a(String str) {
        if (this.f19410b == null) {
            return false;
        }
        return this.f19410b.a(this.f19411c, str);
    }
}
