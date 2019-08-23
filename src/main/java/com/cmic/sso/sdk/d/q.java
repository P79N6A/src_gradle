package com.cmic.sso.sdk.d;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class q {
    public static boolean a() {
        String[] strArr = {"/system/xbin/", "/system/bin/", "/system/sbin/", "/sbin/", "/vendor/bin/", "/su/bin/"};
        int i = 0;
        while (i < 6) {
            try {
                String str = strArr[i];
                String str2 = str + "su";
                if (new File(str2).exists()) {
                    String a2 = a(new String[]{"ls", "-l", str2});
                    f.b("cyb", "isRooted=" + a2);
                    if (TextUtils.isEmpty(a2) || a2.indexOf("root") == a2.lastIndexOf("root")) {
                        return false;
                    }
                    return true;
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static String a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        try {
            Process start = new ProcessBuilder(strArr).start();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            start.getInputStream().close();
            start.destroy();
        } catch (Exception unused) {
        }
        return sb.toString();
    }
}
