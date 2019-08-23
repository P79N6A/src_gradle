package com.ss.sys.ces.b;

import android.content.Context;
import com.ss.a.a.a;
import com.ss.sys.ces.b;

public final class e {

    /* renamed from: d  reason: collision with root package name */
    private static String f78504d = "";

    /* renamed from: a  reason: collision with root package name */
    public String f78505a = "";

    /* renamed from: b  reason: collision with root package name */
    public Context f78506b;

    /* renamed from: c  reason: collision with root package name */
    public String f78507c = "";

    public e(Context context, String str) {
        this.f78505a = (str == null || str.length() <= 0) ? "" : "";
        this.f78506b = context;
        this.f78507c = a.a() + "/v2/s" + a();
    }

    private String a() {
        String str = "";
        try {
            str = str + this.f78506b.getPackageManager().getPackageInfo(this.f78506b.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
        }
        String str2 = "?os=0&ver=0.6.05.22&m=2" + "&app_ver=" + str;
        String str3 = str2 + "&region=" + this.f78506b.getResources().getConfiguration().locale.getCountry();
        String str4 = str3 + "&aid=" + b.f78488b;
        return str4 + "&did=" + b.f78492f;
    }
}
