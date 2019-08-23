package com.bytedance.im.core.b.a.a;

import android.content.Context;
import com.bytedance.im.core.b.a.c.a.a;
import com.bytedance.im.core.b.a.c.c;
import com.bytedance.im.core.b.e.d;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.database.SQLiteDatabase;
import java.io.File;

public final class e extends a {
    private Context g;
    private String h;

    public final a a() {
        return this;
    }

    public final void a(c cVar) {
        d.a("IMEncryptedDBHelper onCreate");
        File databasePath = this.g.getDatabasePath(this.h);
        if (!databasePath.exists() || !(cVar instanceof com.bytedance.im.core.b.a.c.b.b.c)) {
            super.a(cVar);
            return;
        }
        d.b("IMEncryptedDBHelper Migrating old database to encrypted one.");
        com.bytedance.im.core.b.a.c.b.b.c cVar2 = (com.bytedance.im.core.b.a.c.b.b.c) cVar;
        SQLiteDatabase sQLiteDatabase = cVar2.f20935a;
        sQLiteDatabase.endTransaction();
        sQLiteDatabase.execSQL(String.format("ATTACH DATABASE %s AS old KEY '';", new Object[]{DatabaseUtils.sqlEscapeString(databasePath.getPath())}));
        sQLiteDatabase.beginTransaction();
        DatabaseUtils.stringForQuery(sQLiteDatabase, "SELECT sqlcipher_export('main', 'old');", null);
        sQLiteDatabase.setTransactionSuccessful();
        sQLiteDatabase.endTransaction();
        int longForQuery = (int) DatabaseUtils.longForQuery(sQLiteDatabase, "PRAGMA old.user_version;", null);
        sQLiteDatabase.execSQL("DETACH DATABASE old;");
        databasePath.delete();
        sQLiteDatabase.beginTransaction();
        if (longForQuery <= 12 && longForQuery < 12) {
            a(cVar2, longForQuery, 12);
        }
    }

    public final void a(c cVar, int i, int i2) {
        super.a(cVar, i, i2);
    }

    public e(Context context, String str, String str2) {
        super(context, "encrypted_" + str, str2);
        this.g = context;
        this.h = str;
    }
}
