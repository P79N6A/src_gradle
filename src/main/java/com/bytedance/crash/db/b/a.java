package com.bytedance.crash.db.b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;

public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final String f19414a = "_id";

    /* renamed from: b  reason: collision with root package name */
    protected final String f19415b;

    /* access modifiers changed from: protected */
    public abstract ContentValues a(T t);

    /* access modifiers changed from: protected */
    public abstract HashMap<String, String> a();

    protected a(String str) {
        this.f19415b = str;
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ");
            sb.append(this.f19415b);
            sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap<String, String> a2 = a();
            for (String next : a2.keySet()) {
                sb.append(next);
                sb.append(" ");
                sb.append(a2.get(next));
                sb.append(",");
            }
            sb.delete(sb.length() - 1, sb.length());
            sb.append(")");
            sQLiteDatabase.execSQL(sb.toString());
        } catch (Exception unused) {
        }
    }

    public void a(SQLiteDatabase sQLiteDatabase, T t) {
        if (!(sQLiteDatabase == null || t == null)) {
            try {
                sQLiteDatabase.insert(this.f19415b, null, a(t));
            } catch (Exception unused) {
            }
        }
    }
}
