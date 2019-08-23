package com.umeng.analytics.pro;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

public class e extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private String f80636a;

    public File getDatabasePath(String str) {
        File file = new File(this.f80636a + str);
        if (!file.getParentFile().exists() && !file.getParentFile().isDirectory()) {
            file.getParentFile().mkdirs();
        }
        return file;
    }

    public e(Context context, String str) {
        super(context);
        this.f80636a = str;
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str).getAbsolutePath(), cursorFactory);
    }
}
