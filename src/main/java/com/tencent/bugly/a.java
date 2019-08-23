package com.tencent.bugly;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.x;

public abstract class a {
    public int id;
    public String moduleName;
    public String version;
    public String versionKey;

    public abstract String[] getTables();

    public abstract void init(Context context, boolean z, BuglyStrategy buglyStrategy);

    public void onDbCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public void onServerStrategyChanged(StrategyBean strategyBean) {
    }

    public void onDbDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (getTables() != null) {
                for (String valueOf : getTables()) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(valueOf)));
                }
                onDbCreate(sQLiteDatabase);
            }
        } catch (Throwable th) {
            x.b(th);
        }
    }

    public void onDbUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (getTables() != null) {
                for (String valueOf : getTables()) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(valueOf)));
                }
                onDbCreate(sQLiteDatabase);
            }
        } catch (Throwable th) {
            x.b(th);
        }
    }
}
