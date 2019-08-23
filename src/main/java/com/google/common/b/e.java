package com.google.common.b;

import com.google.common.a.i;
import com.google.common.a.j;
import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final long f24443a;

    /* renamed from: b  reason: collision with root package name */
    public final long f24444b;

    /* renamed from: c  reason: collision with root package name */
    public final long f24445c;

    /* renamed from: d  reason: collision with root package name */
    public final long f24446d;

    /* renamed from: e  reason: collision with root package name */
    public final long f24447e;

    /* renamed from: f  reason: collision with root package name */
    public final long f24448f;

    public final int hashCode() {
        return j.a(Long.valueOf(this.f24443a), Long.valueOf(this.f24444b), Long.valueOf(this.f24445c), Long.valueOf(this.f24446d), Long.valueOf(this.f24447e), Long.valueOf(this.f24448f));
    }

    public final String toString() {
        return i.a(this).a("hitCount", this.f24443a).a("missCount", this.f24444b).a("loadSuccessCount", this.f24445c).a("loadExceptionCount", this.f24446d).a("totalLoadTime", this.f24447e).a("evictionCount", this.f24448f).toString();
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f24443a == eVar.f24443a && this.f24444b == eVar.f24444b && this.f24445c == eVar.f24445c && this.f24446d == eVar.f24446d && this.f24447e == eVar.f24447e && this.f24448f == eVar.f24448f) {
            return true;
        }
        return false;
    }

    public e(long j, long j2, long j3, long j4, long j5, long j6) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j7 = j;
        long j8 = j2;
        long j9 = j3;
        long j10 = j4;
        long j11 = j5;
        long j12 = j6;
        boolean z6 = false;
        if (j7 >= 0) {
            z = true;
        } else {
            z = false;
        }
        m.a(z);
        if (j8 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        m.a(z2);
        if (j9 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        m.a(z3);
        if (j10 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        m.a(z4);
        if (j11 >= 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        m.a(z5);
        m.a(j12 >= 0 ? true : z6);
        this.f24443a = j7;
        this.f24444b = j8;
        this.f24445c = j9;
        this.f24446d = j10;
        this.f24447e = j11;
        this.f24448f = j12;
    }
}
