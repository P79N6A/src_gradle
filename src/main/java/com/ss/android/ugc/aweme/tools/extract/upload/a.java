package com.ss.android.ugc.aweme.tools.extract.upload;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74749a;

    /* renamed from: b  reason: collision with root package name */
    private static a f74750b;

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        if (PatchProxy.isSupport(new Object[]{sQLiteDatabase2}, this, f74749a, false, 87079, new Class[]{SQLiteDatabase.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sQLiteDatabase2}, this, f74749a, false, 87079, new Class[]{SQLiteDatabase.class}, Void.TYPE);
            return;
        }
        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `frames_table` (\n\t`aweme_id`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`video_id`\tTEXT NOT NULL,\n\t`zip_uri`\tTEXT NOT NULL,\n\t`zip_path`\tTEXT NOT NULL,\n\t`extract_model`\tTEXT NOT NULL,\n\t`update_time`\tLONG NOT NULL\n);");
    }

    public static a a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f74749a, true, 87078, new Class[]{Context.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{context}, null, f74749a, true, 87078, new Class[]{Context.class}, a.class);
        }
        if (f74750b == null) {
            synchronized (a.class) {
                if (f74750b == null) {
                    f74750b = new a(context.getApplicationContext(), "frames_table", null, 1);
                }
            }
        }
        return f74750b;
    }

    public final void a(@NonNull b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f74749a, false, 87081, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f74749a, false, 87081, new Class[]{b.class}, Void.TYPE);
        } else if (bVar2.f74755e == null) {
            a(bVar2.f74751a);
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("aweme_id", bVar2.f74751a);
            contentValues.put("video_id", bVar2.f74752b);
            contentValues.put("zip_uri", bVar2.f74753c);
            contentValues.put("zip_path", bVar2.f74754d);
            contentValues.put("extract_model", bVar2.f74755e.toString());
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            getWritableDatabase().replace("frames_table", null, contentValues);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f74749a, false, 87082, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f74749a, false, 87082, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            getWritableDatabase().delete("frames_table", "aweme_id = ?", new String[]{str});
        }
    }

    private a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, null, 1);
    }
}
