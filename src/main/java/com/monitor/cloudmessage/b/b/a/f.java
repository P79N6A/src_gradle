package com.monitor.cloudmessage.b.b.a;

import android.content.Context;
import com.monitor.cloudmessage.e.b;
import java.io.File;

public final class f {
    public static File a(Context context) {
        String str = context.getApplicationInfo().dataDir + "/shared_prefs";
        String str2 = context.getApplicationInfo().dataDir + "/spFiles";
        String str3 = str2 + File.separator + "/tmp";
        File file = new File(str);
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                String name = file2.getName();
                if (name.endsWith(".xml") && !b.a(file2.getAbsolutePath(), str3, name)) {
                    return null;
                }
            }
        }
        try {
            b.a(str3, str2 + File.separator + "pre.zip");
            b.a(str3);
            return new File(str2 + File.separator + "pre.zip");
        } catch (Exception unused) {
            return null;
        }
    }
}
