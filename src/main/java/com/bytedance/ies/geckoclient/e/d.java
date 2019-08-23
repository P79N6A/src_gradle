package com.bytedance.ies.geckoclient.e;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.common.utility.io.FileUtils;
import java.io.File;

public class d extends SQLiteOpenHelper {

    /* renamed from: e  reason: collision with root package name */
    private static volatile d f20731e;

    /* renamed from: a  reason: collision with root package name */
    public String f20732a;

    /* renamed from: b  reason: collision with root package name */
    public String f20733b;

    /* renamed from: c  reason: collision with root package name */
    public String f20734c;

    /* renamed from: d  reason: collision with root package name */
    public String f20735d;

    private d(Context context) {
        super(context, "gecko_local_info.db", null, 3);
    }

    public static d a(Context context) {
        if (f20731e == null) {
            synchronized (d.class) {
                if (f20731e == null) {
                    f20731e = new d(context);
                }
            }
        }
        return f20731e;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(this.f20735d);
        } catch (Exception e2) {
            new StringBuilder("create db exception ").append(e2);
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        String str = this.f20732a;
        int lastIndexOf = str.lastIndexOf("_");
        if (lastIndexOf > 0) {
            str = str.substring(0, lastIndexOf);
        }
        a(sQLiteDatabase, this.f20733b, str);
        try {
            sQLiteDatabase.execSQL("DROP TABLE " + this.f20732a);
        } catch (Exception unused) {
        }
        if (!FileUtils.exists(this.f20734c)) {
            new File(this.f20734c).mkdirs();
        }
        sQLiteDatabase.execSQL(this.f20735d);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (i) {
            case 1:
                a(sQLiteDatabase);
                break;
            case 2:
                break;
        }
        try {
            sQLiteDatabase.execSQL("alter table " + this.f20732a + " add package_type" + " integer default -1");
        } catch (SQLException unused) {
        }
    }

    private static boolean a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE " + str2);
        } catch (Exception unused) {
        }
        return com.bytedance.ies.geckoclient.d.a(str);
    }
}
