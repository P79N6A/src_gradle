package com.amap.api.mapcore2d;

public class ea {

    /* renamed from: a  reason: collision with root package name */
    String f6001a;

    /* renamed from: b  reason: collision with root package name */
    String f6002b;

    /* renamed from: c  reason: collision with root package name */
    String f6003c;

    /* renamed from: d  reason: collision with root package name */
    String f6004d;

    /* renamed from: e  reason: collision with root package name */
    String f6005e;

    /* renamed from: f  reason: collision with root package name */
    int f6006f;
    int g;
    private String h;
    private String i;

    /* access modifiers changed from: package-private */
    public String a() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return this.f6003c;
    }

    public ea(String str, String str2, String str3) {
        this.h = str;
        this.i = str2;
        try {
            String[] split = str.split("/");
            int length = split.length;
            if (length > 1) {
                this.f6001a = split[length - 1];
                String[] split2 = this.f6001a.split("_");
                this.f6002b = split2[0];
                this.f6003c = split2[2];
                this.f6004d = split2[1];
                this.f6006f = Integer.parseInt(split2[3]);
                this.g = Integer.parseInt(split2[4].split("\\.")[0]);
            }
        } catch (Throwable th) {
            ek.a(th, "DexDownloadItem", "DexDownloadItem");
        }
    }
}
