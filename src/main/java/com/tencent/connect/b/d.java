package com.tencent.connect.b;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public String f79590a;

    /* renamed from: b  reason: collision with root package name */
    public String f79591b;

    /* renamed from: c  reason: collision with root package name */
    public String f79592c;

    /* renamed from: d  reason: collision with root package name */
    public int f79593d = 1;

    /* renamed from: e  reason: collision with root package name */
    public long f79594e = -1;

    public final boolean a() {
        if (this.f79591b == null || System.currentTimeMillis() >= this.f79594e) {
            return false;
        }
        return true;
    }

    public d(String str) {
        this.f79590a = str;
    }

    public final void a(String str, String str2) throws NumberFormatException {
        this.f79591b = str;
        this.f79594e = 0;
        if (str2 != null) {
            this.f79594e = System.currentTimeMillis() + (Long.parseLong(str2) * 1000);
        }
    }
}
