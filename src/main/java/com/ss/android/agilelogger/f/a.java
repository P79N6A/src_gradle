package com.ss.android.agilelogger.f;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class a {
    public static String a(Context context) {
        int a2 = m.a(context);
        String format = new SimpleDateFormat("yyyy_MM_dd", Locale.getDefault()).format(new Date());
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(format);
        stringBuffer.append("_");
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append("_");
        stringBuffer.append(h.a(context));
        stringBuffer.append("_");
        stringBuffer.append(String.valueOf(a2));
        stringBuffer.append(".hoting");
        return stringBuffer.toString();
    }
}
