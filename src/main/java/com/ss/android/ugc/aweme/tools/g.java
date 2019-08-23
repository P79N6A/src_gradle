package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class g extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74760a;

    /* renamed from: b  reason: collision with root package name */
    public Object f74761b;

    /* renamed from: c  reason: collision with root package name */
    public Object f74762c;

    /* renamed from: d  reason: collision with root package name */
    public int f74763d;

    /* renamed from: e  reason: collision with root package name */
    public int f74764e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f74765f;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74760a, false, 86949, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74760a, false, 86949, new Class[0], String.class);
        }
        return "BottomTabIndexChangeEvent{tag=" + this.f74762c + ", fromIndex=" + this.f74763d + ", toIndex=" + this.f74764e + '}';
    }

    public g(Object obj, Object obj2, int i, int i2) {
        this.f74761b = obj;
        this.f74762c = obj2;
        this.f74763d = i;
        this.f74764e = i2;
    }
}
