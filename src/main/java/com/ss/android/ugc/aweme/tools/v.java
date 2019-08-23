package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class v implements bc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74941a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f74942b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f74943c = true;

    public static v a() {
        if (PatchProxy.isSupport(new Object[0], null, f74941a, true, 86962, new Class[0], v.class)) {
            return (v) PatchProxy.accessDispatch(new Object[0], null, f74941a, true, 86962, new Class[0], v.class);
        }
        return new v(true);
    }

    public static v b() {
        if (PatchProxy.isSupport(new Object[0], null, f74941a, true, 86963, new Class[0], v.class)) {
            return (v) PatchProxy.accessDispatch(new Object[0], null, f74941a, true, 86963, new Class[0], v.class);
        }
        return new v(false);
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74941a, false, 86964, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74941a, false, 86964, new Class[0], String.class);
        }
        return "FrontRearChangeEvent{toFront=" + this.f74942b + '}';
    }

    private v(boolean z) {
        this.f74942b = z;
    }
}
