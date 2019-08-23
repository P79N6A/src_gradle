package com.bytedance.ies.geckoclient;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public final class d {
    public static boolean b(File file) {
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return a(new File(str));
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return b(new File(str));
    }

    public static boolean a(File file) {
        if (!file.exists()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return file.delete();
        }
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].isDirectory()) {
                a(listFiles[i]);
            } else {
                listFiles[i].delete();
            }
        }
        return file.delete();
    }

    public static String a(String str, String str2) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        return str + str2 + "/";
    }

    private static boolean c(String str, String str2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return true;
                }
            }
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean d(String str, String str2) {
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        String str3 = str2 + "/" + new File(str).getName();
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str3);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return true;
                }
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            File file2 = new File(str2);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isDirectory()) {
                    b(listFiles[i].getPath() + "/", str2 + listFiles[i].getName() + "/");
                } else {
                    c(listFiles[i].getPath(), str2 + listFiles[i].getName());
                }
            }
            return true;
        }
        d(str, str2);
        return true;
    }
}
