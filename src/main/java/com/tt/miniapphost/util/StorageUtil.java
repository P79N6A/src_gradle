package com.tt.miniapphost.util;

import android.content.Context;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import com.tt.miniapphost.process.annotation.AnyProcess;
import java.io.File;

@AnyProcess
public class StorageUtil {
    private static final String TAG = "StorageUtil";

    public static File getExternalCacheDir(Context context) {
        String str;
        File file;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception unused) {
            str = "";
        }
        if ("mounted".equals(str)) {
            file = context.getExternalCacheDir();
        } else {
            file = null;
        }
        if (file == null) {
            return new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), "cache");
        }
        return file;
    }

    public static File getExternalFilesDir(Context context) {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception unused) {
            str = "";
        }
        File file = null;
        if ("mounted".equals(str)) {
            file = context.getExternalFilesDir(null);
        }
        if (file == null) {
            file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), "files");
        }
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String getSessionByAppid(@NonNull Context context, String str) {
        String string = c.a(context, "TmaSession", 0).getString(str, "");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String string2 = c.a(context, "MiniAppCookiePersistence", 0).getString(str, "");
        if (!TextUtils.isEmpty(string2)) {
            saveSession(context, str, string2);
        }
        return string2;
    }

    public static void saveSession(@NonNull Context context, String str, String str2) {
        c.a(context, "TmaSession", 0).edit().putString(str, str2).commit();
    }
}
