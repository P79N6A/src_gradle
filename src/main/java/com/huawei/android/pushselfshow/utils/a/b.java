package com.huawei.android.pushselfshow.utils.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.android.pushagent.utils.a.e;

public class b extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private static b f25365a;

    /* renamed from: b  reason: collision with root package name */
    private static b f25366b;

    private b(Context context) {
        super(context, "push.db", null, 1);
        e.a("PushSelfShowLog", "DBHelper instance, version is 1");
    }

    private b(Context context, String str) {
        super(context, str, null, 1);
        e.a("PushSelfShowLog", "DBHelper instance, version is 1");
    }

    public static synchronized b a(Context context) {
        synchronized (b.class) {
            if (f25365a != null) {
                b bVar = f25365a;
                return bVar;
            }
            b bVar2 = new b(context);
            f25365a = bVar2;
            return bVar2;
        }
    }

    public static synchronized b a(Context context, String str) {
        synchronized (b.class) {
            if (f25366b != null) {
                b bVar = f25366b;
                return bVar;
            }
            b bVar2 = new b(context, str);
            f25366b = bVar2;
            return bVar2;
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        e.a("PushSelfShowLog", "updateVersionFrom0To1");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("token", " ".getBytes("UTF-8"));
            sQLiteDatabase.update("pushmsg", contentValues, null, null);
        } catch (Exception e2) {
            e.c("PushSelfShowLog", e2.toString(), e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.database.sqlite.SQLiteDatabase r12, java.lang.String r13) {
        /*
            r11 = this;
            r0 = 0
            if (r12 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "(tbl_name='"
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = "')"
            r1.append(r13)
            java.lang.String r5 = r1.toString()
            r13 = 0
            java.lang.String r3 = "sqlite_master"
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r12
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0048 }
            if (r12 == 0) goto L_0x0040
            r12.moveToFirst()     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            int r13 = r12.getCount()     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            if (r13 <= 0) goto L_0x0030
            r0 = 1
        L_0x0030:
            if (r12 == 0) goto L_0x0035
            r12.close()
        L_0x0035:
            return r0
        L_0x0036:
            r13 = move-exception
            r10 = r13
            r13 = r12
            r12 = r10
            goto L_0x0058
        L_0x003b:
            r13 = move-exception
            r10 = r13
            r13 = r12
            r12 = r10
            goto L_0x0049
        L_0x0040:
            if (r12 == 0) goto L_0x0057
            r12.close()
            goto L_0x0057
        L_0x0046:
            r12 = move-exception
            goto L_0x0058
        L_0x0048:
            r12 = move-exception
        L_0x0049:
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.String r2 = r12.toString()     // Catch:{ all -> 0x0046 }
            com.huawei.android.pushagent.utils.a.e.c(r1, r2, r12)     // Catch:{ all -> 0x0046 }
            if (r13 == 0) goto L_0x0057
            r13.close()
        L_0x0057:
            return r0
        L_0x0058:
            if (r13 == 0) goto L_0x005d
            r13.close()
        L_0x005d:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.utils.a.b.a(android.database.sqlite.SQLiteDatabase, java.lang.String):boolean");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        e.a("PushSelfShowLog", "onCreate");
        if (a(sQLiteDatabase, "pushmsg")) {
            e.a("PushSelfShowLog", "old table is exist");
            onUpgrade(sQLiteDatabase, 0, 1);
            return;
        }
        try {
            sQLiteDatabase.execSQL("create table notify(url  TEXT  PRIMARY KEY , bmp  BLOB );");
            sQLiteDatabase.execSQL("create table pushmsg( _id INTEGER PRIMARY KEY AUTOINCREMENT, url  TEXT  , token  BLOB ,msg  BLOB );");
        } catch (SQLException e2) {
            e.c("PushSelfShowLog", e2.toString(), e2);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        e.a("PushSelfShowLog", "onDowngrade,oldVersion:" + i + ",newVersion:" + i2);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        e.a("PushSelfShowLog", "onUpgrade,oldVersion:" + i + ",newVersion:" + i2);
        if (i == 0) {
            a(sQLiteDatabase);
        }
    }
}
