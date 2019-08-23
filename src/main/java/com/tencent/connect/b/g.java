package com.tencent.connect.b;

import com.tencent.tauth.b;
import java.util.HashMap;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static g f79615a;

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ boolean f79616d = (!g.class.desiredAssertionStatus());

    /* renamed from: e  reason: collision with root package name */
    private static int f79617e = 0;

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, a> f79618b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final String f79619c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public b f79620a;

        /* renamed from: b  reason: collision with root package name */
        public e f79621b;

        /* renamed from: c  reason: collision with root package name */
        public String f79622c;
    }

    public final String a(a aVar) {
        int i = f79617e + 1;
        f79617e = i;
        try {
            HashMap<String, a> hashMap = this.f79618b;
            hashMap.put(i, aVar);
        } catch (Throwable unused) {
        }
        return i;
    }
}
