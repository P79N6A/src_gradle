package com.amap.api.services.a;

public class cl {

    /* renamed from: a  reason: collision with root package name */
    String f6722a;

    /* renamed from: b  reason: collision with root package name */
    String f6723b;

    /* renamed from: c  reason: collision with root package name */
    String f6724c;

    /* renamed from: d  reason: collision with root package name */
    String f6725d;

    /* renamed from: e  reason: collision with root package name */
    String f6726e;

    /* renamed from: f  reason: collision with root package name */
    int f6727f;
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
        return this.f6724c;
    }

    public cl(String str, String str2, String str3) {
        this.h = str;
        this.i = str2;
        try {
            String[] split = str.split("/");
            int length = split.length;
            if (length > 1) {
                this.f6722a = split[length - 1];
                String[] split2 = this.f6722a.split("_");
                this.f6723b = split2[0];
                this.f6724c = split2[2];
                this.f6725d = split2[1];
                this.f6727f = Integer.parseInt(split2[3]);
                this.g = Integer.parseInt(split2[4].split("\\.")[0]);
            }
        } catch (Throwable th) {
            cv.a(th, "DexDownloadItem", "DexDownloadItem");
        }
    }
}
