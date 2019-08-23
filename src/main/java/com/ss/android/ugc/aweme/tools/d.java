package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class d extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74665a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f74666b;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74665a, false, 86942, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74665a, false, 86942, new Class[0], String.class);
        }
        return "BeautyConfigChangeEvent{on=" + this.f74666b + '}';
    }

    public d(boolean z) {
        this.f74666b = z;
    }
}
