package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class eu<F, S, T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75848a;

    /* renamed from: b  reason: collision with root package name */
    public final F f75849b;

    /* renamed from: c  reason: collision with root package name */
    public final S f75850c;

    /* renamed from: d  reason: collision with root package name */
    public final T f75851d;

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f75848a, false, 88643, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f75848a, false, 88643, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f75849b == null) {
            i = 0;
        } else {
            i = this.f75849b.hashCode();
        }
        if (this.f75850c == null) {
            i2 = 0;
        } else {
            i2 = this.f75850c.hashCode();
        }
        int i4 = i ^ i2;
        if (this.f75851d != null) {
            i3 = this.f75851d.hashCode();
        }
        return i3 ^ i4;
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f75848a, false, 88642, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f75848a, false, 88642, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (!(obj instanceof eu)) {
            return false;
        } else {
            eu euVar = (eu) obj;
            if (!a(euVar.f75849b, this.f75849b) || !a(euVar.f75850c, this.f75850c) || !a(euVar.f75851d, this.f75851d)) {
                return false;
            }
            return true;
        }
    }

    private static boolean a(Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        if (PatchProxy.isSupport(new Object[]{obj3, obj4}, null, f75848a, true, 88640, new Class[]{Object.class, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj3, obj4}, null, f75848a, true, 88640, new Class[]{Object.class, Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj3 == obj4 || (obj3 != null && obj.equals(obj2))) {
            return true;
        } else {
            return false;
        }
    }

    private eu(F f2, S s, T t) {
        this.f75849b = f2;
        this.f75850c = s;
        this.f75851d = t;
    }

    public static <A, B, C> eu<A, B, C> a(A a2, B b2, C c2) {
        A a3 = a2;
        B b3 = b2;
        C c3 = c2;
        if (!PatchProxy.isSupport(new Object[]{a3, b3, c3}, null, f75848a, true, 88641, new Class[]{Object.class, Object.class, Object.class}, eu.class)) {
            return new eu<>(a3, b3, c3);
        }
        return (eu) PatchProxy.accessDispatch(new Object[]{a3, b3, c3}, null, f75848a, true, 88641, new Class[]{Object.class, Object.class, Object.class}, eu.class);
    }
}
