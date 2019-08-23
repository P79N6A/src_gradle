package com.bytedance.im.core.b.a.c.b.a;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.im.core.b.a.c.b;
import com.bytedance.im.core.b.a.c.d;

public final class c implements com.bytedance.im.core.b.a.c.c {

    /* renamed from: a  reason: collision with root package name */
    private SQLiteDatabase f20930a;

    public final void b() {
        this.f20930a.close();
    }

    public final boolean c() {
        return this.f20930a.inTransaction();
    }

    public final void d() {
        this.f20930a.beginTransaction();
    }

    public final void e() {
        this.f20930a.setTransactionSuccessful();
    }

    public final void f() {
        this.f20930a.endTransaction();
    }

    public final boolean a() {
        return this.f20930a.isOpen();
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        this.f20930a = sQLiteDatabase;
    }

    public final d b(String str) throws SQLException {
        return new e(this.f20930a.compileStatement(str));
    }

    public final void a(String str) throws SQLException {
        this.f20930a.execSQL(str);
    }

    public final b a(String str, String[] strArr) {
        return new a(this.f20930a.rawQuery(str, strArr));
    }

    public final int a(String str, String str2, String[] strArr) {
        return this.f20930a.delete(str, str2, strArr);
    }

    public final long a(String str, String str2, ContentValues contentValues) {
        return this.f20930a.insert(str, str2, contentValues);
    }

    public final int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        return this.f20930a.update(str, contentValues, str2, strArr);
    }
}
