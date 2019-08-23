package com.alipay.sdk.app.a;

import android.content.Context;
import android.text.TextUtils;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static c f5416a;

    public static void a(Context context) {
        if (f5416a == null) {
            f5416a = new c(context);
        }
    }

    public static void a(String str, Throwable th) {
        if (f5416a != null && th.getClass() != null) {
            f5416a.a(str, th.getClass().getSimpleName(), th);
        }
    }

    public static synchronized void a(Context context, String str) {
        String str2;
        String str3;
        String str4;
        synchronized (a.class) {
            if (f5416a != null) {
                c cVar = f5416a;
                if (TextUtils.isEmpty(cVar.i)) {
                    str2 = "";
                } else {
                    String[] split = str.split("&");
                    if (split != null) {
                        str4 = null;
                        str3 = null;
                        for (String split2 : split) {
                            String[] split3 = split2.split("=");
                            if (split3 != null && split3.length == 2) {
                                if (split3[0].equalsIgnoreCase("partner")) {
                                    split3[1].replace("\"", "");
                                } else if (split3[0].equalsIgnoreCase("out_trade_no")) {
                                    str4 = split3[1].replace("\"", "");
                                } else if (split3[0].equalsIgnoreCase("trade_no")) {
                                    str3 = split3[1].replace("\"", "");
                                }
                            }
                        }
                    } else {
                        str4 = null;
                        str3 = null;
                    }
                    String a2 = c.a(str3);
                    String a3 = c.a(str4);
                    cVar.f5420b = String.format("%s,%s,-,%s,-,-,-", new Object[]{a2, a3, c.a(a3)});
                    str2 = String.format("[(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s)]", new Object[]{cVar.f5419a, cVar.f5420b, cVar.f5421c, cVar.f5422d, cVar.f5423e, cVar.f5424f, cVar.g, cVar.h, cVar.i, cVar.j});
                }
                new Thread(new b(context, str2)).start();
                f5416a = null;
            }
        }
    }

    public static void a(String str, String str2, String str3) {
        if (f5416a != null) {
            f5416a.a(str, str2, str3);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (f5416a != null) {
            f5416a.a(str, str2, th);
        }
    }
}
