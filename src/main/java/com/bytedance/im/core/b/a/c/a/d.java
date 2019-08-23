package com.bytedance.im.core.b.a.c.a;

import android.util.Pair;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteTrace;
import com.tencent.wcdb.support.Log;
import java.io.File;
import java.util.List;

public class d implements DatabaseErrorHandler {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f20920b = {"", "-journal", "-wal", ".sm", ".bak", "-vfslog", "-vfslo1"};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f20921a;

    private void a(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            Log.e("WCDB.DefaultDatabaseErrorHandler", "Remove database file: " + str);
            int i = 0;
            if (!this.f20921a) {
                if (!new File(new File(str).getParentFile(), "corrupted").mkdirs()) {
                    Log.e("WCDB.DefaultDatabaseErrorHandler", "Could not create directory for corrupted database. Corruption backup may be unavailable.");
                }
                String str2 = r2.getPath() + "/" + r0.getName();
                String[] strArr = f20920b;
                int length = strArr.length;
                while (i < length) {
                    String str3 = strArr[i];
                    String str4 = str + str3;
                    String str5 = str2 + str3;
                    File file = new File(str4);
                    if (!file.renameTo(new File(str5))) {
                        file.delete();
                    }
                    i++;
                }
                return;
            }
            String[] strArr2 = f20920b;
            int length2 = strArr2.length;
            while (i < length2) {
                String str6 = strArr2[i];
                new File(str + str6).delete();
                i++;
            }
        }
    }

    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        Log.e("WCDB.DefaultDatabaseErrorHandler", "Corruption reported by sqlite on database: " + sQLiteDatabase.getPath());
        if (!sQLiteDatabase.isOpen()) {
            a(sQLiteDatabase.getPath());
            return;
        }
        List<Pair<String, String>> list = null;
        try {
            list = sQLiteDatabase.getAttachedDbs();
        } catch (SQLiteException unused) {
        }
        SQLiteTrace traceCallback = sQLiteDatabase.getTraceCallback();
        if (traceCallback != null) {
            traceCallback.onDatabaseCorrupted(sQLiteDatabase);
        }
        try {
            sQLiteDatabase.close();
            if (list != null) {
                for (Pair<String, String> pair : list) {
                    a((String) pair.second);
                }
                return;
            }
        } catch (SQLiteException unused2) {
            if (list != null) {
                for (Pair<String, String> pair2 : list) {
                    a((String) pair2.second);
                }
                return;
            }
        } catch (Throwable th) {
            if (list != null) {
                for (Pair<String, String> pair3 : list) {
                    a((String) pair3.second);
                }
            } else {
                a(sQLiteDatabase.getPath());
            }
            throw th;
        }
        a(sQLiteDatabase.getPath());
    }
}
