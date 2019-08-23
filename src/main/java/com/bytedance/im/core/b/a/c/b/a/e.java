package com.bytedance.im.core.b.a.c.b.a;

import android.database.sqlite.SQLiteStatement;
import com.bytedance.im.core.b.a.c.d;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private SQLiteStatement f20932a;

    public final int a() {
        return this.f20932a.executeUpdateDelete();
    }

    public final long b() {
        return this.f20932a.executeInsert();
    }

    public final void c() {
        this.f20932a.close();
    }

    public final void d() {
        this.f20932a.clearBindings();
    }

    public e(SQLiteStatement sQLiteStatement) {
        this.f20932a = sQLiteStatement;
    }

    public final void a(int i, long j) {
        this.f20932a.bindLong(i, j);
    }

    public final void a(int i, String str) {
        this.f20932a.bindString(i, str);
    }
}
