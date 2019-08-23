package com.ss.ugc.live.b.a.e;

import java.io.File;

public final class b {
    public static String a(String str) {
        if (c.a(str) || str.endsWith(File.separator)) {
            return str;
        }
        return str + File.separator;
    }

    public static File b(String str) {
        if (str != null) {
            return new File(str + ".tmp");
        }
        throw new IllegalArgumentException("file is null");
    }

    public static void a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                file.delete();
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                } else {
                    file2.delete();
                }
            }
            file.delete();
        }
    }
}
