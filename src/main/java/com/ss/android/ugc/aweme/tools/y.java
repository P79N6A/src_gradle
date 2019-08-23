package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class y implements bc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74953a;

    /* renamed from: b  reason: collision with root package name */
    public final String f74954b;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74953a, false, 86969, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74953a, false, 86969, new Class[0], String.class);
        }
        return "GoNextUiEvent{reason='" + this.f74954b + '\'' + '}';
    }

    public y(String str) {
        this.f74954b = str;
    }
}
