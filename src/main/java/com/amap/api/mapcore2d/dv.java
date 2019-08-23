package com.amap.api.mapcore2d;

import java.util.HashMap;
import java.util.Map;

public abstract class dv {
    @Cdo(a = "b2", b = 2)

    /* renamed from: a  reason: collision with root package name */
    protected int f5977a = -1;
    @Cdo(a = "b1", b = 6)

    /* renamed from: b  reason: collision with root package name */
    protected String f5978b;
    @Cdo(a = "b3", b = 2)

    /* renamed from: c  reason: collision with root package name */
    protected int f5979c = 1;
    @Cdo(a = "a1", b = 6)

    /* renamed from: d  reason: collision with root package name */
    private String f5980d;

    public int a() {
        return this.f5977a;
    }

    public String b() {
        return this.f5978b;
    }

    public int c() {
        return this.f5979c;
    }

    public void a(int i) {
        this.f5977a = i;
    }

    public void b(int i) {
        this.f5979c = i;
    }

    public static String c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("b1", str);
        return dm.a((Map<String, String>) hashMap);
    }

    public void a(String str) {
        this.f5978b = str;
    }

    public void b(String str) {
        this.f5980d = cz.b(str);
    }

    public static String c(int i) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("b2=");
            sb.append(i);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }
}
