package com.bytedance.apm.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public long f18981a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18982b;

    /* renamed from: c  reason: collision with root package name */
    public long f18983c;

    /* renamed from: d  reason: collision with root package name */
    public String f18984d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18985e;

    /* renamed from: f  reason: collision with root package name */
    public String f18986f;
    public long g;
    public String h;
    public long i;
    public String j;
    public boolean k;
    public String l;
    public boolean m;

    public b() {
    }

    public final boolean a() {
        if (!this.f18982b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "BatteryLogEntity{id=" + this.f18981a + ", front=" + this.f18982b + ", time=" + this.f18983c + ", type='" + this.f18984d + '\'' + ", status=" + this.f18985e + ", scene='" + this.f18986f + '\'' + ", accumulation=" + this.g + ", source='" + this.h + '\'' + ", versionId=" + this.i + ", processName='" + this.j + '\'' + ", mainProcess=" + this.k + ", startUuid='" + this.l + '\'' + ", deleteFlag=" + this.m + '}';
    }

    public b(boolean z, long j2) {
        this.f18982b = z;
        this.f18983c = j2;
    }

    public b(boolean z, long j2, String str, long j3) {
        this.f18982b = z;
        this.f18983c = j2;
        this.f18984d = str;
        this.g = j3;
    }

    public b(boolean z, long j2, String str, boolean z2) {
        this.f18982b = z;
        this.f18983c = j2;
        this.f18984d = str;
        this.f18985e = z2;
    }

    public b(boolean z, long j2, String str, boolean z2, String str2, long j3, String str3) {
        this.f18982b = z;
        this.f18983c = j2;
        this.f18984d = str;
        this.f18985e = z2;
        this.f18986f = str2;
        this.g = j3;
        this.h = str3;
    }
}
