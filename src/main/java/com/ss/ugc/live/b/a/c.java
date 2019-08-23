package com.ss.ugc.live.b.a;

import java.util.Arrays;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f78634a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f78635b;

    /* renamed from: c  reason: collision with root package name */
    public long f78636c;

    /* renamed from: d  reason: collision with root package name */
    public String f78637d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f78638e;

    /* renamed from: f  reason: collision with root package name */
    public int f78639f = -1;

    public final String a() {
        return this.f78635b[0];
    }

    public final void c() {
        this.f78639f++;
    }

    public final String b() {
        return this.f78635b[Math.min(this.f78639f, this.f78635b.length - 1)];
    }

    public String toString() {
        return "GetResourceRequest{mId=" + this.f78634a + ", mUrls='" + Arrays.toString(this.f78635b) + '\'' + ", mMd5='" + this.f78637d + '\'' + ", mSourceFrom='" + this.f78636c + '\'' + ", mNeedToUnzip=" + this.f78638e + '}';
    }

    public c(long j, String[] strArr, String str, long j2, boolean z) {
        this.f78634a = j;
        this.f78635b = strArr;
        this.f78637d = str;
        this.f78636c = j2;
        this.f78638e = true;
    }
}
