package com.ss.android.image;

import android.content.Context;
import com.bytedance.common.utility.StringUtils;
import java.io.File;
import java.util.Set;

public final class e {
    private static void b(String str) throws Exception {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    b(listFiles[i].getAbsolutePath());
                } else {
                    listFiles[i].delete();
                }
            }
            file.delete();
        }
    }

    public static String a(Context context) throws NullPointerException {
        String str;
        if (context != null) {
            try {
                if (context.getCacheDir() != null) {
                    str = context.getCacheDir().getPath();
                } else {
                    File dir = context.getDir("/data/data/" + context.getPackageName() + "/cache/", 0);
                    if (dir != null) {
                        str = dir.getPath();
                    }
                    str = null;
                }
            } catch (Throwable unused) {
            }
            if (!StringUtils.isEmpty(str)) {
                return str;
            }
            throw new NullPointerException("Cannot Create Cache Dir");
        }
        throw new NullPointerException("Context is NUll");
    }

    public static void a(String str) throws Exception {
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    b(listFiles[i].getAbsolutePath());
                } else if (listFiles[i].isFile()) {
                    listFiles[i].delete();
                }
            }
        }
    }

    public static long a(File file, boolean z) {
        long j = 0;
        try {
            if (!file.exists() && file.isDirectory()) {
                return 0;
            }
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    j += a(file2, z);
                } else if (file2.isFile()) {
                    j += file2.length();
                }
            }
            return j;
        } catch (Throwable unused) {
        }
    }

    private static void b(String str, Set<String> set) throws Exception {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    b(listFiles[i].getAbsolutePath(), set);
                } else {
                    String name = listFiles[i].getName();
                    if (set == null || !set.contains(name)) {
                        listFiles[i].delete();
                    }
                }
            }
        }
    }

    public static void a(String str, Set<String> set) throws Exception {
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    b(listFiles[i].getAbsolutePath(), set);
                } else if (listFiles[i].isFile()) {
                    String name = listFiles[i].getName();
                    if (set == null || !set.contains(name)) {
                        listFiles[i].delete();
                    }
                }
            }
        }
    }
}
