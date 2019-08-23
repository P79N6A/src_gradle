package com.ss.android.ugc.b;

import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import java.io.File;
import java.io.IOException;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f77128a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    public static String b(String str) {
        return DigestUtils.md5Hex(str) + ".mp3";
    }

    private static void c(String str) {
        try {
            File file = new File(str);
            if (file.getParentFile().exists()) {
                file.mkdir();
                return;
            }
            c(file.getParent());
            file.mkdir();
        } catch (Exception unused) {
        }
    }

    public static File a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            if (!z) {
                c(file.getPath());
            } else {
                try {
                    File parentFile = file.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    file.createNewFile();
                } catch (IOException unused) {
                }
            }
        }
        return file;
    }
}
