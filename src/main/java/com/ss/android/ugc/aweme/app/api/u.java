package com.ss.android.ugc.aweme.app.api;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33908a;

    public static Gson a() {
        if (PatchProxy.isSupport(new Object[0], null, f33908a, true, 23174, new Class[0], Gson.class)) {
            return (Gson) PatchProxy.accessDispatch(new Object[0], null, f33908a, true, 23174, new Class[0], Gson.class);
        }
        return m.d();
    }
}
