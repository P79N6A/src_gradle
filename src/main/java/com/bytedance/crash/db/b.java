package com.bytedance.crash.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public final class b extends SQLiteOpenHelper {
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public b(@Nullable Context context) {
        super(context, "npth_log.db", null, 1);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        new com.bytedance.crash.db.b.b().a(sQLiteDatabase);
    }
}
