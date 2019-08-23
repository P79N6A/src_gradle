package com.ss.sys.ck.a;

import android.content.Context;
import com.ss.a.a.b;

public final class a extends b {

    /* renamed from: f  reason: collision with root package name */
    private Context f78543f;

    public a(Context context, String str, String str2) {
        super(context, str);
        this.f78543f = context;
        str2 = (str2 == null || str2.length() <= 0) ? "" : "";
        this.f2371a = com.ss.a.a.a.a() + "/v.s" + str2;
    }

    public final boolean a(int i, byte[] bArr) {
        if (i != 200 || bArr == null) {
            return false;
        }
        try {
            if (bArr.length > 0) {
                return com.ss.sys.ck.b.a(new String(bArr));
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
