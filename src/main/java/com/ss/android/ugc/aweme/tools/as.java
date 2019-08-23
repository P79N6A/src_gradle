package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.jetbrains.annotations.NotNull;

public class as implements bc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74630a;

    /* renamed from: b  reason: collision with root package name */
    public int f74631b;

    @NotNull
    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74630a, false, 86991, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74630a, false, 86991, new Class[0], String.class);
        }
        return "SpeedPanelOpenEvent{visibility=" + this.f74631b + '}';
    }

    public as(int i) {
        this.f74631b = i;
    }
}
