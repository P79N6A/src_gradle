package com.ss.android.ugc.b;

import android.content.Context;
import okhttp3.OkHttpClient;

public class c {

    /* renamed from: f  reason: collision with root package name */
    public static int f77141f = 30000;
    private static c g;

    /* renamed from: a  reason: collision with root package name */
    public a f77142a;

    /* renamed from: b  reason: collision with root package name */
    public a f77143b;

    /* renamed from: c  reason: collision with root package name */
    public Context f77144c;

    /* renamed from: d  reason: collision with root package name */
    public OkHttpClient f77145d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f77146e = true;

    public interface a {
        String a();
    }

    public final String b() {
        return this.f77142a.a();
    }

    public static c a() {
        if (g == null) {
            synchronized (c.class) {
                if (g == null) {
                    g = new c();
                }
            }
        }
        return g;
    }

    public final String a(String str) {
        return this.f77142a.a() + a.b(str);
    }
}
