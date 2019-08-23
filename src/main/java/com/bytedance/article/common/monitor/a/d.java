package com.bytedance.article.common.monitor.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.c;
import com.bytedance.apm.k.e;
import com.bytedance.apm.k.o;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static long f19122a;

    public static boolean a(Context context) {
        String str;
        String str2;
        if (!o.a(context)) {
            return false;
        }
        String str3 = str + File.separator + "/tmp";
        File file = new File(context.getApplicationInfo().dataDir + "/shared_prefs");
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                String name = file2.getName();
                if (name.endsWith(".xml") && !e.a(file2.getAbsolutePath(), str3, name)) {
                    return false;
                }
            }
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm");
            String a2 = b.a(c.f());
            if (TextUtils.isEmpty(a2)) {
                str2 = String.format("%s_sp.zip", new Object[]{simpleDateFormat.format(new Date(System.currentTimeMillis()))});
            } else {
                str2 = String.format("%s_sp_%s.zip", new Object[]{simpleDateFormat.format(new Date(System.currentTimeMillis())), a2});
            }
            sb.append(str2);
            e.a(str3, sb.toString());
            e.a(str3);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
