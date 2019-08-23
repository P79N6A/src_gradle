package com.bytedance.im.core.b.a.c.b.b;

import com.bytedance.im.core.b.a.c.d;
import com.tencent.wcdb.database.SQLiteStatement;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private SQLiteStatement f20937a;

    public final int a() {
        return this.f20937a.executeUpdateDelete();
    }

    public final long b() {
        return this.f20937a.executeInsert();
    }

    public final void c() {
        this.f20937a.close();
    }

    public final void d() {
        this.f20937a.clearBindings();
    }

    public e(SQLiteStatement sQLiteStatement) {
        this.f20937a = sQLiteStatement;
    }

    public final void a(int i, long j) {
        this.f20937a.bindLong(i, j);
    }

    public final void a(int i, String str) {
        this.f20937a.bindString(i, str);
    }
}
