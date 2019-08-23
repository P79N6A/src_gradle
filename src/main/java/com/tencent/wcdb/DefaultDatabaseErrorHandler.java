package com.tencent.wcdb;

import android.util.Pair;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteTrace;
import com.tencent.wcdb.support.Log;
import java.io.File;
import java.util.List;

public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    private static final String[] SUFFIX_TO_BACKUP = {"", "-journal", "-wal", ".sm", ".bak", "-vfslog", "-vfslo1"};
    private final boolean mNoCorruptionBackup;

    public DefaultDatabaseErrorHandler() {
    }

    public DefaultDatabaseErrorHandler(boolean z) {
        this.mNoCorruptionBackup = z;
    }

    private static boolean deleteFile(String str) {
        return new File(str).delete();
    }

    private void deleteDatabaseFile(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            Log.e("WCDB.DefaultDatabaseErrorHandler", "Remove database file: " + str);
            int i = 0;
            if (!this.mNoCorruptionBackup) {
                if (!new File(new File(str).getParentFile(), "corrupted").mkdirs()) {
                    Log.e("WCDB.DefaultDatabaseErrorHandler", "Could not create directory for corrupted database. Corruption backup may be unavailable.");
                }
                String str2 = r2.getPath() + "/" + r0.getName();
                String[] strArr = SUFFIX_TO_BACKUP;
                int length = strArr.length;
                while (i < length) {
                    String str3 = strArr[i];
                    moveOrDeleteFile(str + str3, str2 + str3);
                    i++;
                }
                return;
            }
            String[] strArr2 = SUFFIX_TO_BACKUP;
            int length2 = strArr2.length;
            while (i < length2) {
                String str4 = strArr2[i];
                deleteFile(str + str4);
                i++;
            }
        }
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        Log.e("WCDB.DefaultDatabaseErrorHandler", "Corruption reported by sqlite on database: " + sQLiteDatabase.getPath());
        if (!sQLiteDatabase.isOpen()) {
            deleteDatabaseFile(sQLiteDatabase.getPath());
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
                    deleteDatabaseFile((String) pair.second);
                }
                return;
            }
        } catch (SQLiteException unused2) {
            if (list != null) {
                for (Pair<String, String> pair2 : list) {
                    deleteDatabaseFile((String) pair2.second);
                }
                return;
            }
        } catch (Throwable th) {
            if (list != null) {
                for (Pair<String, String> pair3 : list) {
                    deleteDatabaseFile((String) pair3.second);
                }
            } else {
                deleteDatabaseFile(sQLiteDatabase.getPath());
            }
            throw th;
        }
        deleteDatabaseFile(sQLiteDatabase.getPath());
    }

    private static boolean moveOrDeleteFile(String str, String str2) {
        File file = new File(str);
        boolean renameTo = file.renameTo(new File(str2));
        if (!renameTo) {
            file.delete();
        }
        return renameTo;
    }
}
