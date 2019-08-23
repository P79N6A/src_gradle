package com.bytedance.ies.geckoclient.a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.ies.geckoclient.e.b;
import com.bytedance.ies.geckoclient.e.d;
import java.io.File;

public final class e extends b {
    e() {
    }

    public final void a() {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        Cursor rawQuery;
        Cursor cursor = null;
        try {
            sQLiteDatabase = d.a(this.h).getWritableDatabase();
            try {
                rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + this.f20710e, null);
            } catch (Exception unused) {
                b.a(cursor);
                b.a(sQLiteDatabase);
            } catch (Throwable th2) {
                th = th2;
                b.a(cursor);
                b.a(sQLiteDatabase);
                throw th;
            }
            try {
                int count = rawQuery.getCount() - this.f20709d.f20700a;
                while (true) {
                    int i = count - 1;
                    if (count <= 0) {
                        break;
                    }
                    if (rawQuery.moveToNext() && a(rawQuery)) {
                        a(sQLiteDatabase, rawQuery);
                    }
                    count = i;
                }
                b.a(rawQuery);
            } catch (Exception unused2) {
                cursor = rawQuery;
                b.a(cursor);
                b.a(sQLiteDatabase);
            } catch (Throwable th3) {
                Cursor cursor2 = rawQuery;
                th = th3;
                cursor = cursor2;
                b.a(cursor);
                b.a(sQLiteDatabase);
                throw th;
            }
        } catch (Exception unused3) {
            sQLiteDatabase = null;
            b.a(cursor);
            b.a(sQLiteDatabase);
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabase = null;
            b.a(cursor);
            b.a(sQLiteDatabase);
            throw th;
        }
        b.a(sQLiteDatabase);
    }

    private boolean a(Cursor cursor) {
        try {
            String string = cursor.getString(cursor.getColumnIndex("update_zip"));
            String string2 = cursor.getString(cursor.getColumnIndex("update_zip_dir"));
            boolean b2 = com.bytedance.ies.geckoclient.d.b(this.g + string) | false | com.bytedance.ies.geckoclient.d.a(this.g + string2);
            String string3 = cursor.getString(cursor.getColumnIndex("patch_zip"));
            StringBuilder sb = new StringBuilder();
            sb.append(this.g);
            sb.append(string3);
            boolean a2 = b2 | com.bytedance.ies.geckoclient.d.a(sb.toString());
            String string4 = cursor.getString(cursor.getColumnIndex("zip"));
            boolean b3 = a2 | com.bytedance.ies.geckoclient.d.b(new File(this.g + string4));
            String string5 = cursor.getString(cursor.getColumnIndex("package_dir"));
            return com.bytedance.ies.geckoclient.d.a(this.g + string5) | b3;
        } catch (Exception unused) {
            return false;
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase, Cursor cursor) {
        try {
            String string = cursor.getString(cursor.getColumnIndex("channel"));
            sQLiteDatabase.execSQL("DELETE FROM " + this.f20710e + " where channel" + " = \"" + string + "\"");
            if (this.f20709d.f20702c != null) {
                this.f20709d.f20702c.a(string);
            }
        } catch (Exception unused) {
        }
    }

    public final void a(Context context, a aVar, String str, String str2, String str3) {
        super.a(context, aVar, str, str2, str3);
    }
}
