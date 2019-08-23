package com.bytedance.ies.geckoclient.e;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public final class b {
    public static boolean a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }
}
