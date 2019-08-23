package com.alipay.c.c;

import android.content.Context;
import android.os.Build;
import com.alipay.d.a.a.e.d;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class a {
    public static synchronized void a(Context context, String str, String str2, String str3) {
        synchronized (a.class) {
            com.alipay.d.a.a.e.a aVar = new com.alipay.d.a.a.e.a(Build.MODEL, context.getApplicationContext().getApplicationInfo().packageName, "security-sdk-token", "3.2.0-20160621", str, str2, str3);
            String format = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
            d.a(context.getFilesDir().getAbsolutePath() + "/log/ap", format + ".log", aVar.toString());
        }
    }

    public static synchronized void a(String str) {
        synchronized (a.class) {
            d.a(str);
        }
    }

    public static synchronized void a(Throwable th) {
        synchronized (a.class) {
            d.a(th);
        }
    }
}
