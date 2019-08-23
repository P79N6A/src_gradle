package com.facebook.common.b;

import java.io.File;

public final class a {
    public static boolean b(File file) {
        if (file.isDirectory()) {
            a(file);
        }
        return file.delete();
    }

    public static boolean a(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File b2 : listFiles) {
                z &= b(b2);
            }
        }
        return z;
    }

    public static void a(File file, b bVar) {
        bVar.a(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2, bVar);
                } else {
                    bVar.b(file2);
                }
            }
        }
        bVar.c(file);
    }
}
