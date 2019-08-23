package com.loc;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public String f25880a;

    /* renamed from: b  reason: collision with root package name */
    public String f25881b;

    /* renamed from: c  reason: collision with root package name */
    String f25882c;

    /* renamed from: d  reason: collision with root package name */
    String f25883d;

    /* renamed from: e  reason: collision with root package name */
    String f25884e;

    /* renamed from: f  reason: collision with root package name */
    String f25885f;
    int g;
    int h;
    public boolean i;
    public boolean j;

    public s(String str, String str2) {
        this(str, str2, (byte) 0);
    }

    private s(String str, String str2, byte b2) {
        this.f25880a = str;
        this.f25881b = str2;
        try {
            String[] split = str.split("/");
            int length = split.length;
            if (length > 1) {
                this.f25882c = split[length - 1];
                String[] split2 = this.f25882c.split("_");
                this.f25883d = split2[0];
                this.f25884e = split2[2];
                this.f25885f = split2[1];
                this.g = Integer.parseInt(split2[3]);
                this.h = Integer.parseInt(split2[4].split("\\.")[0]);
            }
        } catch (Throwable th) {
            f.a(th, "DexDownloadItem", "DexDownloadItem");
        }
    }
}
