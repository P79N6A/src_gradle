package com.meizu.cloud.pushsdk.c.d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.meizu.cloud.pushsdk.c.f.c;

public class b extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private static final String f27149a = "com.meizu.cloud.pushsdk.c.d.b";

    /* renamed from: b  reason: collision with root package name */
    private static b f27150b;

    private b(Context context, String str) {
        super(context, str, null, 1);
    }

    public static b a(Context context, String str) {
        if (f27150b == null) {
            f27150b = new b(context.getApplicationContext(), str);
        }
        return f27150b;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS 'events' (id INTEGER PRIMARY KEY, eventData BLOB, dateCreated TIMESTAMP DEFAULT CURRENT_TIMESTAMP)");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str = f27149a;
        c.b(str, "Upgrading database from version " + i + " to " + i2 + ". Destroying old data now..", new Object[0]);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'events'");
        onCreate(sQLiteDatabase);
    }
}
