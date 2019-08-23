package com.bytedance.im.core.b.a.c.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.im.core.b.a.c.c;
import com.bytedance.im.core.b.e.d;

public final class e extends SQLiteOpenHelper implements b {

    /* renamed from: a  reason: collision with root package name */
    private a f20922a;

    public final void a(c cVar) {
    }

    public final void a(c cVar, int i, int i2) {
    }

    public final void close() {
        super.close();
    }

    public final c b() {
        return a(getWritableDatabase());
    }

    public final void a(a aVar) {
        this.f20922a = aVar;
    }

    public final void setWriteAheadLoggingEnabled(boolean z) {
        super.setWriteAheadLoggingEnabled(z);
    }

    private static c a(SQLiteDatabase sQLiteDatabase) {
        return new com.bytedance.im.core.b.a.c.b.a.c(sQLiteDatabase);
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        d.a(getClass().getSimpleName() + " onConfigure");
        a(sQLiteDatabase);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        d.a(getClass().getSimpleName() + " onOpen");
        a(sQLiteDatabase);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        d.a(getClass().getSimpleName() + " onCreate");
        this.f20922a.a(a(sQLiteDatabase));
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        d.a(getClass().getSimpleName() + " onUpgrade");
        this.f20922a.a(a(sQLiteDatabase), i, i2);
    }

    public e(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        d.a(getClass().getSimpleName());
    }
}
