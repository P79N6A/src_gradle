package com.bytedance.jedi.model.i;

import java.util.Comparator;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator<a> f21706a = new Comparator<a>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return (int) Math.abs(((a) obj).f21710e - ((a) obj2).f21710e);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator<a> f21707b = new Comparator<a>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return (int) Math.abs(((a) obj).f21711f - ((a) obj2).f21711f);
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public static final Comparator<a> f21708c = new Comparator<a>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((a) obj).f21709d.getCanonicalName().compareTo(((a) obj2).f21709d.getCanonicalName());
        }
    };

    /* renamed from: d  reason: collision with root package name */
    public final Class<?> f21709d;

    /* renamed from: e  reason: collision with root package name */
    public long f21710e;

    /* renamed from: f  reason: collision with root package name */
    public long f21711f;

    public final String toString() {
        return "ClassHistogramElement[class=" + this.f21709d.getCanonicalName() + ", instances=" + this.f21710e + ", bytes=" + this.f21711f + "]";
    }

    public a(Class<?> cls) {
        this.f21709d = cls;
    }

    public final void a(long j) {
        this.f21710e++;
        this.f21711f += j;
    }
}
