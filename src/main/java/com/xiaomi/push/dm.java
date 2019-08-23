package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.text.SimpleDateFormat;

public class dm {

    /* renamed from: a  reason: collision with root package name */
    private static String f81941a;

    /* renamed from: a  reason: collision with other field name */
    private static SimpleDateFormat f268a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f268a = simpleDateFormat;
        f81941a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static io a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        io ioVar = new io();
        ioVar.d("category_push_stat");
        ioVar.a("push_sdk_stat_channel");
        ioVar.a(1);
        ioVar.b(str);
        ioVar.a(true);
        ioVar.b(System.currentTimeMillis());
        ioVar.g(cv.a(context).a());
        ioVar.e("com.xiaomi.xmsf");
        ioVar.f("");
        ioVar.c("push_stat");
        return ioVar;
    }
}
