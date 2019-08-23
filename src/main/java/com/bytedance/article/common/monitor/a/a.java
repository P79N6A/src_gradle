package com.bytedance.article.common.monitor.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.k.e;
import com.bytedance.apm.k.o;
import java.io.File;
import java.io.IOException;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static long f19115a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f19116b;

    /* renamed from: c  reason: collision with root package name */
    public static String f19117c;

    /* renamed from: d  reason: collision with root package name */
    public static String f19118d;

    public static boolean a(Context context) {
        String str;
        boolean z;
        if (!o.a(context)) {
            return false;
        }
        String str2 = str + File.separator + "/tmp";
        File file = new File(context.getApplicationInfo().dataDir + File.separator + "databases");
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                String name = file2.getName();
                if (name.endsWith(".db") && !f19116b && !e.a(file2.getAbsolutePath(), str2, name)) {
                    return false;
                }
                if (f19116b && !TextUtils.isEmpty(f19117c) && f19117c.equals(name) && !e.a(file2.getAbsolutePath(), str2, name)) {
                    return false;
                }
            }
        }
        try {
            e.a(str2, str + File.separator + f19118d);
            e.a(str2);
            File file3 = new File(str + File.separator + f19118d);
            if (!file3.exists() || file3.length() <= 52428800) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            file3.delete();
            return a(str, String.format("%s file to big", new Object[]{f19118d}));
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            new File(str, String.format("DbFileError: %s", new Object[]{str2})).createNewFile();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
