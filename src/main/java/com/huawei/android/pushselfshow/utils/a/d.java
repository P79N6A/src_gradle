package com.huawei.android.pushselfshow.utils.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.android.pushagent.utils.a.e;
import java.io.File;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f25367a = new d();

    private d() {
    }

    private SQLiteDatabase a(String str) {
        File file = new File(str);
        if (file.exists()) {
            return SQLiteDatabase.openDatabase(str, null, 0);
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && parentFile.mkdirs()) {
            e.e("PushLogSC2815", "datafiledir.mkdirs true");
        }
        return SQLiteDatabase.openOrCreateDatabase(str, null);
    }

    public static d a() {
        return f25367a;
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.close();
    }

    public Cursor a(String str, String str2, String str3) {
        SQLiteDatabase a2 = a(str);
        if (a2 == null) {
            return null;
        }
        Cursor query = a2.query(str2, null, str3, null, null, null, null);
        query.moveToFirst();
        a(a2);
        return query;
    }

    public Cursor a(String str, String str2, String[] strArr) {
        SQLiteDatabase a2 = a(str);
        if (a2 == null) {
            return null;
        }
        Cursor rawQuery = a2.rawQuery(str2, strArr);
        rawQuery.moveToFirst();
        a(a2);
        return rawQuery;
    }

    public void a(Context context, String str, String str2) {
        SQLiteDatabase a2 = a(str);
        if (a2 != null) {
            a2.execSQL(str2);
            a(a2);
        }
    }

    public void a(Context context, String str, String str2, ContentValues contentValues) {
        SQLiteDatabase a2 = a(str);
        if (a2 != null) {
            a2.insert(str2, null, contentValues);
            a(a2);
        }
    }

    public void a(String str, String str2, String str3, String[] strArr) {
        SQLiteDatabase a2 = a(str);
        if (a2 != null) {
            a2.delete(str2, str3, strArr);
            a(a2);
        }
    }

    public boolean a(String str, String str2) {
        Cursor a2 = a(str, "sqlite_master", "(tbl_name='" + str2 + "')");
        if (a2 == null) {
            e.a("PushLogSC2815", "cursor is null.");
            return false;
        }
        int count = a2.getCount();
        a2.close();
        return count > 0;
    }
}
