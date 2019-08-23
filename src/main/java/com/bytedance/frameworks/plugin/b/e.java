package com.bytedance.frameworks.plugin.b;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static File f2170a;

    public static String b() {
        return a(new File(com.bytedance.frameworks.plugin.e.a().getFilesDir(), ".patchs"));
    }

    public static String a() {
        Context a2 = com.bytedance.frameworks.plugin.e.a();
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalFilesDir = a2.getExternalFilesDir(".patchs");
                if (externalFilesDir != null) {
                    return a(externalFilesDir);
                }
            }
        } catch (Exception unused) {
        }
        return a(new File(a2.getFilesDir(), ".patchs"));
    }

    public static String a(String str) {
        return a(str);
    }

    public static String b(String str) {
        return a(str, "data");
    }

    private static String a(File file) {
        if (file == null) {
            return null;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath();
    }

    public static String a(String... strArr) {
        if (f2170a == null) {
            File file = new File(com.bytedance.frameworks.plugin.e.a().getFilesDir(), "plugins");
            f2170a = file;
            a(file);
        }
        File file2 = f2170a;
        if (strArr.length > 0) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    file2 = new File(file2, str);
                }
            }
        }
        return a(file2);
    }

    public static String b(String str, int i) {
        return a(str, "version-" + i, "dalvik-cache");
    }

    public static String c(String str, int i) {
        return a(str, "version-" + i, "lib");
    }

    public static String a(String str, int i) {
        return new File(a(str, "version-" + i, "apk"), "base-1.apk").getPath();
    }
}
