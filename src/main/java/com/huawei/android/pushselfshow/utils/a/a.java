package com.huawei.android.pushselfshow.utils.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.huawei.android.pushagent.utils.a.e;
import java.io.File;
import java.util.ArrayList;

public class a {
    public static ArrayList a(Context context, String str) {
        Cursor a2;
        String str2;
        String str3;
        ArrayList arrayList = new ArrayList();
        try {
            String c2 = c(context, "hwpushApp.db");
            if (TextUtils.isEmpty(c2)) {
                e.a("PushSelfShowLog", "database is null,can't queryAppinfo");
                return arrayList;
            }
            e.a("PushSelfShowLog", "dbName path is " + c2);
            if (d.a().a(c2, "openmarket")) {
                a2 = d.a().a(c2, "select * from openmarket where package = ?;", new String[]{str});
                if (a2 == null) {
                    e.a("PushSelfShowLog", "cursor is null.");
                    return arrayList;
                }
                try {
                    if (a2.getCount() > 0) {
                        do {
                            String string = a2.getString(a2.getColumnIndex("msgid"));
                            arrayList.add(string);
                            e.a("TAG", "msgid and packageName is  " + string + "," + str);
                        } while (a2.moveToNext());
                    }
                    try {
                        a2.close();
                    } catch (Exception e2) {
                        e = e2;
                        str2 = "PushSelfShowLog";
                        str3 = "cursor.close() ";
                    }
                } catch (Exception e3) {
                    e.c("TAG", "queryAppinfo error " + e3.toString(), e3);
                    try {
                        a2.close();
                    } catch (Exception e4) {
                        e = e4;
                        str2 = "PushSelfShowLog";
                        str3 = "cursor.close() ";
                    }
                }
            }
            return arrayList;
            e.d(str2, str3, e);
            return arrayList;
        } catch (Exception e5) {
            e.d("PushSelfShowLog", "queryAppinfo error", e5);
        } catch (Throwable th) {
            try {
                a2.close();
            } catch (Exception e6) {
                e.d("PushSelfShowLog", "cursor.close() ", e6);
            }
            throw th;
        }
    }

    public static void a(Context context, String str, String str2) {
        try {
            if (!context.getDatabasePath("hwpushApp.db").exists()) {
                context.openOrCreateDatabase("hwpushApp.db", 0, null);
            }
            String c2 = c(context, "hwpushApp.db");
            if (TextUtils.isEmpty(c2)) {
                e.d("PushSelfShowLog", "database is null,can't insert appinfo into db");
                return;
            }
            e.a("PushSelfShowLog", "dbName path is " + c2);
            if (!d.a().a(c2, "openmarket")) {
                d.a().a(context, c2, "create table openmarket(    _id INTEGER PRIMARY KEY AUTOINCREMENT,     msgid  TEXT,    package TEXT);");
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("msgid", str);
            contentValues.put("package", str2);
            d.a().a(context, c2, "openmarket", contentValues);
        } catch (Exception e2) {
            e.d("PushSelfShowLog", "insertAppinfo error", e2);
        }
    }

    public static void b(Context context, String str) {
        try {
            String c2 = c(context, "hwpushApp.db");
            if (TextUtils.isEmpty(c2)) {
                e.d("PushSelfShowLog", "database is null,can't delete appinfo");
                return;
            }
            e.a("PushSelfShowLog", "dbName path is " + c2);
            if (d.a().a(c2, "openmarket")) {
                d.a().a(c2, "openmarket", "package = ?", new String[]{str});
            }
        } catch (Exception e2) {
            e.d("PushSelfShowLog", "Delete Appinfo error", e2);
        }
    }

    private static String c(Context context, String str) {
        String str2 = "";
        if (context == null) {
            return str2;
        }
        File databasePath = context.getDatabasePath("hwpushApp.db");
        if (databasePath.exists()) {
            str2 = databasePath.getAbsolutePath();
        }
        return str2;
    }
}
