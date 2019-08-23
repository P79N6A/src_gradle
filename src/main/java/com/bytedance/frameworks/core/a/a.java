package com.bytedance.frameworks.core.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class a extends SQLiteOpenHelper {
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE local_monitor_log ( _id Integer PRIMARY KEY AUTOINCREMENT, type VARCHAR, type2 VARCHAR, create_time Integer, version_id Integer, is_sampled Integer DEFAULT 0, data TEXT, data2 TEXT, data3 TEXT  )");
            sQLiteDatabase.execSQL("CREATE TABLE local_monitor_version ( _id INTEGER PRIMARY KEY AUTOINCREMENT, version_code TEXT, version_name TEXT, manifest_version_code TEXT, update_version_code TEXT  )");
        } catch (Exception unused) {
        }
    }

    public a(Context context, String str) {
        super(context, str + "_ss_local_monitor.db", null, 1);
    }
}
