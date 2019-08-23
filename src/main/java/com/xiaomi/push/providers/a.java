package com.xiaomi.push.providers;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.xiaomi.channel.commonutils.logger.b;

public class a extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private static int f82450a = 1;

    /* renamed from: a  reason: collision with other field name */
    public static final Object f882a = new Object();

    /* renamed from: a  reason: collision with other field name */
    private static final String[] f883a = {"package_name", "TEXT", "message_ts", " LONG DEFAULT 0 ", "bytes", " LONG DEFAULT 0 ", "network_type", " INT DEFAULT -1 ", "rcv", " INT DEFAULT -1 ", "imsi", "TEXT"};

    public a(Context context) {
        super(context, "traffic.db", null, f82450a);
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder("CREATE TABLE traffic(_id INTEGER  PRIMARY KEY ,");
        for (int i = 0; i < f883a.length - 1; i += 2) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(f883a[i]);
            sb.append(" ");
            sb.append(f883a[i + 1]);
        }
        sb.append(");");
        sQLiteDatabase.execSQL(sb.toString());
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f882a) {
            try {
                a(sQLiteDatabase);
            } catch (SQLException e2) {
                b.a((Throwable) e2);
            }
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
