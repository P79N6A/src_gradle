package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ac implements bc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74599a;

    /* renamed from: b  reason: collision with root package name */
    public long f74600b;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74599a, false, 86972, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74599a, false, 86972, new Class[0], String.class);
        }
        return "MaxDurationChangeEvent{value=" + this.f74600b + '}';
    }

    public ac(long j) {
        this.f74600b = j;
    }
}
