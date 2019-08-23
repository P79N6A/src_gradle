package com.tencent.wcdb.database;

import android.os.Environment;
import android.os.StatFs;

public final class SQLiteGlobal {
    public static final int defaultPageSize;

    public static void loadLib() {
    }

    private static native int nativeReleaseMemory();

    private static native void nativeSetDefaultPageSize(int i);

    private SQLiteGlobal() {
    }

    public static int releaseMemory() {
        return nativeReleaseMemory();
    }

    static {
        int i;
        if (!WCDBInitializationProbe.libLoaded) {
            System.loadLibrary("wcdb");
        }
        try {
            i = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getBlockSize();
        } catch (RuntimeException unused) {
            i = 4096;
        }
        defaultPageSize = i;
        nativeSetDefaultPageSize(i);
    }
}
