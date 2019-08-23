package com.toutiao.proxyserver.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class d extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80027a;

    public d(Context context) {
        super(context, "video.db", null, 3);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        if (PatchProxy.isSupport(new Object[]{sQLiteDatabase2}, this, f80027a, false, 91786, new Class[]{SQLiteDatabase.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sQLiteDatabase2}, this, f80027a, false, 91786, new Class[]{SQLiteDatabase.class}, Void.TYPE);
            return;
        }
        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS video_http_header_t(_id INTEGER PRIMARY KEY AUTOINCREMENT,key TEXT,mime TEXT,contentLength INTEGER,flag INTEGER,extra TEXT)");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{sQLiteDatabase2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f80027a, false, 91787, new Class[]{SQLiteDatabase.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sQLiteDatabase2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f80027a, false, 91787, new Class[]{SQLiteDatabase.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i3 == 1) {
            sQLiteDatabase2.execSQL("ALTER TABLE video_http_header_t ADD COLUMN flag INTEGER DEFAULT 0");
            sQLiteDatabase2.execSQL("ALTER TABLE video_http_header_t ADD COLUMN extra TEXT DEFAULT ''");
        } else if (i3 == 2) {
            sQLiteDatabase2.execSQL("ALTER TABLE video_http_header_t ADD COLUMN extra TEXT DEFAULT ''");
        } else {
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS video_http_header_t");
            onCreate(sQLiteDatabase);
        }
    }
}
