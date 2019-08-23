package com.amap.api.mapcore2d;

import android.content.Context;

public class ez {

    /* renamed from: a  reason: collision with root package name */
    private Context f6100a;

    /* renamed from: b  reason: collision with root package name */
    private cy f6101b;

    /* renamed from: c  reason: collision with root package name */
    private String f6102c;

    /* access modifiers changed from: package-private */
    public byte[] a() {
        return cz.a(a(this.f6100a, this.f6101b, this.f6102c));
    }

    public ez(Context context, cy cyVar, String str) {
        this.f6100a = context.getApplicationContext();
        this.f6101b = cyVar;
        this.f6102c = str;
    }

    private static String a(Context context, cy cyVar, String str) {
        return cs.b(context, cz.b(cz.a(b(context, cyVar, str))));
    }

    private static String b(Context context, cy cyVar, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("\"sdkversion\":\"");
            sb.append(cyVar.c());
            sb.append("\",\"product\":\"");
            sb.append(cyVar.a());
            sb.append("\",\"nt\":\"");
            sb.append(ct.c(context));
            sb.append("\",\"details\":");
            sb.append(str);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }
}
