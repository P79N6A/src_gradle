package com.bytedance.framwork.core.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.framwork.core.b.f;

public class a extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private static a f20077a;

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE monitor_log ( _id Integer PRIMARY KEY AUTOINCREMENT, aid Integer, type VARCHAR, type2 VARCHAR, time Integer, data TEXT, data2 TEXT, data3 TEXT  )");
        } catch (Exception unused) {
        }
    }

    public static a a(Context context) {
        if (f20077a == null) {
            synchronized (a.class) {
                if (f20077a == null) {
                    String a2 = f.a(context);
                    f20077a = new a(context, a2 + "sdkmon.db");
                }
            }
        }
        return f20077a;
    }

    private a(Context context, String str) {
        super(context, str, null, 1);
    }
}
