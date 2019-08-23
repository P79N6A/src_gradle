package com.bytedance.frameworks.plugin.f;

import java.io.File;

public final class d {
    public static void a(String str) {
        a(new File(str));
    }

    public static void a(File file) {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File a2 : listFiles) {
                        a(a2);
                    }
                }
            }
            file.delete();
        }
    }
}
