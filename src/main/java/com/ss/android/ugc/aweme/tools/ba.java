package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ba implements bc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74649a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f74650b;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74649a, false, 86998, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74649a, false, 86998, new Class[0], String.class);
        }
        return "SwitchZoomStateEvent{toWide=" + this.f74650b + '}';
    }

    public ba(boolean z) {
        this.f74650b = z;
    }
}
