package com.bytedance.im.core.b.a.c.b.b;

import android.content.ContentValues;
import com.bytedance.im.core.b.a.c.b;
import com.bytedance.im.core.b.a.c.d;
import com.tencent.wcdb.SQLException;
import com.tencent.wcdb.database.SQLiteDatabase;

public final class c implements com.bytedance.im.core.b.a.c.c {

    /* renamed from: a  reason: collision with root package name */
    public SQLiteDatabase f20935a;

    public final void b() {
        this.f20935a.close();
    }

    public final boolean c() {
        return this.f20935a.inTransaction();
    }

    public final void d() {
        this.f20935a.beginTransaction();
    }

    public final void e() {
        this.f20935a.setTransactionSuccessful();
    }

    public final void f() {
        this.f20935a.endTransaction();
    }

    public final boolean a() {
        return this.f20935a.isOpen();
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        this.f20935a = sQLiteDatabase;
    }

    public final d b(String str) throws SQLException {
        return new e(this.f20935a.compileStatement(str));
    }

    public final void a(String str) throws SQLException {
        this.f20935a.execSQL(str);
    }

    public final b a(String str, String[] strArr) {
        return new a(this.f20935a.rawQuery(str, strArr));
    }

    public final int a(String str, String str2, String[] strArr) {
        return this.f20935a.delete(str, str2, strArr);
    }

    public final long a(String str, String str2, ContentValues contentValues) {
        return this.f20935a.insert(str, str2, contentValues);
    }

    public final int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        return this.f20935a.update(str, contentValues, str2, strArr);
    }
}
