package com.ss.android.chooser;

public class f implements Comparable<f> {

    /* renamed from: a  reason: collision with root package name */
    public long f27989a;

    /* renamed from: b  reason: collision with root package name */
    public String f27990b;

    /* renamed from: c  reason: collision with root package name */
    public long f27991c;

    /* renamed from: d  reason: collision with root package name */
    public int f27992d;

    /* renamed from: e  reason: collision with root package name */
    public long f27993e;

    /* renamed from: f  reason: collision with root package name */
    public long f27994f;
    public String g;
    public String h;
    public int i;
    public int j;

    public int hashCode() {
        return Long.valueOf(this.f27989a).hashCode();
    }

    public f(long j2) {
        this.f27989a = j2;
    }

    public static f a(int i2) {
        f fVar = new f(-1);
        fVar.f27991c = Long.MAX_VALUE;
        fVar.f27992d = i2;
        return fVar;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        f fVar = (f) obj;
        if (this.f27991c > fVar.f27991c) {
            return -1;
        }
        if (this.f27991c < fVar.f27991c) {
            return 1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f) || obj == null || this.f27989a != ((f) obj).f27989a) {
            return false;
        }
        return true;
    }
}
