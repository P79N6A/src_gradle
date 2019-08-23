package com.monitor.cloudmessage.b.b.a;

import android.content.Context;
import android.text.TextUtils;
import com.monitor.cloudmessage.e.b;
import java.io.File;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f27338a = "db.zip";

    /* renamed from: b  reason: collision with root package name */
    private static boolean f27339b;

    /* renamed from: c  reason: collision with root package name */
    private static String f27340c;

    public static File a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            f27339b = true;
            f27340c = str;
        }
        String str2 = context.getApplicationInfo().dataDir + File.separator + "databases";
        String str3 = context.getApplicationInfo().dataDir + File.separator + "dbFiles";
        String str4 = str3 + File.separator + "/tmp";
        File file = new File(str2);
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                String name = file2.getName();
                if (name.endsWith(".db") && !f27339b && !b.a(file2.getAbsolutePath(), str4, name)) {
                    return null;
                }
                if (f27339b && !TextUtils.isEmpty(f27340c) && f27340c.equals(name) && !b.a(file2.getAbsolutePath(), str4, name)) {
                    return null;
                }
            }
        }
        try {
            b.a(str4, str3 + File.separator + f27338a);
            b.a(str4);
            return new File(str3 + File.separator + f27338a);
        } catch (Exception unused) {
            return null;
        }
    }
}
