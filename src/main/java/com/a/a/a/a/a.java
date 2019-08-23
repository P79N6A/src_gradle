package com.a.a.a.a;

import android.content.Context;
import android.os.Environment;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

public final class a {
    private static b a(String[] strArr) throws IOException {
        b bVar = null;
        for (String str : strArr) {
            if (bVar == null) {
                bVar = new b(str);
            } else {
                bVar.b(str);
            }
        }
        return bVar;
    }

    public static b a(Context context, int i, int i2) throws IOException {
        String packageName = context.getPackageName();
        Vector vector = new Vector();
        if (Environment.getExternalStorageState().equals("mounted")) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (new File(externalStorageDirectory.toString() + "/Android/obb/" + packageName).exists()) {
                if (i > 0) {
                    String str = r2 + File.separator + "main." + i + ClassUtils.PACKAGE_SEPARATOR + packageName + ".obb";
                    if (new File(str).isFile()) {
                        vector.add(str);
                    }
                }
                if (i2 > 0) {
                    String str2 = r2 + File.separator + "patch." + i2 + ClassUtils.PACKAGE_SEPARATOR + packageName + ".obb";
                    if (new File(str2).isFile()) {
                        vector.add(str2);
                    }
                }
            }
        }
        String[] strArr = new String[vector.size()];
        vector.toArray(strArr);
        return a(strArr);
    }
}
