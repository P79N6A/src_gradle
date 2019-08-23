package com.ss.sys.ces.b;

import android.content.Context;
import com.ss.a.a.a;

public final class b extends com.ss.a.a.b {

    /* renamed from: f  reason: collision with root package name */
    private Context f78498f;

    public b(Context context, String str) {
        super(context, str);
        this.f78498f = context;
        this.f2371a = a.a() + "/v2/s" + b();
    }

    private String b() {
        String str = "";
        try {
            str = this.f78498f.getPackageManager().getPackageInfo(this.f78498f.getPackageName(), 0).versionName;
        } catch (Exception unused) {
        }
        String str2 = "?os=0&ver=0.6.05.22&m=2" + "&app_ver=" + str;
        String str3 = str2 + "&region=" + this.f78498f.getResources().getConfiguration().locale.getCountry();
        String str4 = str3 + "&aid=" + com.ss.sys.ces.b.f78488b;
        return str4 + "&did=" + com.ss.sys.ces.b.f78492f;
    }

    public final boolean a(int i, byte[] bArr) {
        if (i == 200 && bArr != null) {
            try {
                if (bArr.length > 0) {
                    String str = (String) com.ss.sys.ces.a.meta(200, this.f78498f, bArr);
                    if (str != null && str.length() > 0) {
                        if (str.equalsIgnoreCase("AYE")) {
                            com.ss.sys.ces.b.i = true;
                            return true;
                        }
                        com.ss.sys.ces.b.i = false;
                    }
                }
            } catch (Throwable unused) {
                com.ss.sys.ces.b.i = false;
            }
        }
        return false;
    }
}
