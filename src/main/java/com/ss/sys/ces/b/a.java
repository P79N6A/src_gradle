package com.ss.sys.ces.b;

import android.content.Context;
import com.ss.a.a.b;

public final class a extends b {

    /* renamed from: f  reason: collision with root package name */
    private Context f78497f;

    public a(Context context, String str) {
        super(context, str);
        this.f78497f = context;
        this.f2371a = com.ss.a.a.a.a() + "/v2/r" + b();
    }

    private String b() {
        String str = "";
        try {
            str = this.f78497f.getPackageManager().getPackageInfo(this.f78497f.getPackageName(), 0).versionName;
        } catch (Exception unused) {
        }
        String str2 = "?os=0&ver=0.6.05.22&m=2" + "&app_ver=" + str;
        String str3 = str2 + "&region=" + this.f78497f.getResources().getConfiguration().locale.getCountry();
        String str4 = str3 + "&aid=" + com.ss.sys.ces.b.f78488b;
        return str4 + "&did=" + com.ss.sys.ces.b.f78492f;
    }

    public final boolean a(int i, byte[] bArr) {
        if (i == 200 && bArr != null) {
            try {
                if (bArr.length > 0 && bArr != null && bArr.length > 0 && bArr.length == 37) {
                    com.ss.sys.ces.b.h = true;
                }
            } catch (Throwable unused) {
                com.ss.sys.ces.b.i = false;
            }
        }
        return true;
    }
}
