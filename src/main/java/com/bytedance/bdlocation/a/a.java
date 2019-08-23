package com.bytedance.bdlocation.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.Util;
import com.bytedance.bdlocation.netwok.a.b;
import com.ss.android.ugc.aweme.q.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f19222a;

    /* renamed from: b  reason: collision with root package name */
    public BDLocation f19223b;

    /* renamed from: c  reason: collision with root package name */
    public b f19224c;

    @Nullable
    public final BDLocation a() {
        if (this.f19223b == null) {
            this.f19223b = b(a("BDLocation"));
        }
        return this.f19223b;
    }

    public a(Context context) {
        this.f19222a = c.a(context, "BDLocationCache", 0);
    }

    private String a(String str) {
        return this.f19222a.getString(str, "");
    }

    public static String a(BDLocation bDLocation) {
        if (bDLocation == null) {
            return null;
        }
        try {
            return Util.sGson.toJson((Object) bDLocation);
        } catch (Throwable th) {
            com.ss.b.a.a.b("BDLocation", th);
            return null;
        }
    }

    private static BDLocation b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (BDLocation) Util.sGson.fromJson(str, BDLocation.class);
        } catch (Throwable th) {
            com.ss.b.a.a.b("BDLocation", th);
            return null;
        }
    }
}
