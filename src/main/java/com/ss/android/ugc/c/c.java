package com.ss.android.ugc.c;

public final class c implements Comparable<c> {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f77196a = true;

    /* renamed from: b  reason: collision with root package name */
    public double f77197b;

    /* renamed from: c  reason: collision with root package name */
    public double f77198c;

    /* renamed from: d  reason: collision with root package name */
    public long f77199d;

    /* renamed from: e  reason: collision with root package name */
    public long f77200e;

    public final String toString() {
        return "SpeedRecord{mSpeed=" + this.f77197b + ", mWeight=" + this.f77198c + ", mCostTime=" + this.f77199d + ", currentTime=" + this.f77200e + '}';
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        c cVar = (c) obj;
        if (this.f77197b == cVar.f77197b) {
            return 0;
        }
        if (this.f77197b < cVar.f77197b) {
            return -1;
        }
        return 1;
    }

    public c(double d2, double d3, long j, long j2) {
        this.f77197b = d2;
        this.f77198c = d3;
        this.f77199d = j;
        this.f77200e = j2;
        if (!f77196a) {
            return;
        }
        if (this.f77197b < 0.0d || this.f77198c < 0.0d) {
            throw new IllegalArgumentException(toString());
        }
    }
}
