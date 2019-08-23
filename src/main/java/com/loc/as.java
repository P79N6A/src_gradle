package com.loc;

import android.content.Context;
import com.google.a.a.a.a.a.a;

public final class as {

    /* renamed from: a  reason: collision with root package name */
    Context f25484a;

    /* renamed from: b  reason: collision with root package name */
    dh f25485b;

    /* renamed from: c  reason: collision with root package name */
    String f25486c;

    public as(Context context, dh dhVar, String str) {
        this.f25484a = context.getApplicationContext();
        this.f25485b = dhVar;
        this.f25486c = str;
    }

    static String a(Context context, dh dhVar, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("\"sdkversion\":\"");
            sb.append(dhVar.b());
            sb.append("\",\"product\":\"");
            sb.append(dhVar.a());
            sb.append("\",\"nt\":\"");
            sb.append(dc.e(context));
            sb.append("\",\"details\":");
            sb.append(str);
        } catch (Throwable th) {
            a.b(th);
        }
        return sb.toString();
    }
}
