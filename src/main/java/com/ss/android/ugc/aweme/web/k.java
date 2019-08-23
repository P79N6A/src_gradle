package com.ss.android.ugc.aweme.web;

import android.content.Context;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.g.a;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static String f76855a = "https://aweme.snssdk.com";

    /* renamed from: b  reason: collision with root package name */
    public static String f76856b = "https://www.tiktokv.com";

    /* renamed from: c  reason: collision with root package name */
    public static String f76857c = "https://test-aweme.snssdk.com/";

    /* renamed from: d  reason: collision with root package name */
    public static String f76858d;

    /* renamed from: e  reason: collision with root package name */
    public static String f76859e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f76860f = b.b().b((Context) com.ss.android.ugc.aweme.app.k.a(), "is_use_test_host", false);

    static {
        String str;
        String str2;
        if (!a.a() || !f76860f) {
            str = f76855a;
        } else {
            str = f76857c;
        }
        f76858d = str;
        if (!a.a() || !f76860f) {
            str2 = f76856b;
        } else {
            str2 = f76857c;
        }
        f76859e = str2;
    }
}
