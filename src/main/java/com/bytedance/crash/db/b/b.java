package com.bytedance.crash.db.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.crash.db.a.a;
import java.util.HashMap;

public final class b extends a<a> {
    public b() {
        super("duplicatelog");
    }

    /* access modifiers changed from: protected */
    public final HashMap<String, String> a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("path", "TEXT");
        hashMap.put("insert_time", "INTEGER");
        hashMap.put("ext1", "TEXT");
        hashMap.put("ext2", "TEXT");
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ ContentValues a(Object obj) {
        a aVar = (a) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("path", aVar.f19412a);
        contentValues.put("insert_time", Long.valueOf(aVar.f19413b));
        return contentValues;
    }

    public final void a(SQLiteDatabase sQLiteDatabase, a aVar) {
        if (aVar != null && !a(sQLiteDatabase, aVar.f19412a)) {
            super.a(sQLiteDatabase, aVar);
            try {
                sQLiteDatabase.execSQL("delete from " + this.f19415b + " where _id" + " in (select _id" + " from " + this.f19415b + " order by insert_time" + " desc limit 1000 offset 500" + ")");
            } catch (Exception unused) {
            }
        }
    }

    public final boolean a(SQLiteDatabase sQLiteDatabase, String str) {
        int i;
        if (sQLiteDatabase == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Cursor query = sQLiteDatabase.query(this.f19415b, null, "path=?", new String[]{str}, null, null, null);
            i = query.getCount();
            try {
                query.close();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            i = 0;
        }
        if (i > 0) {
            return true;
        }
        return false;
    }
}
