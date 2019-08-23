package com.ss.android.ugc.aweme.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class ca {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54696a;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ca f54697a = new ca((byte) 0);
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f54696a, false, 57721, new Class[0], Boolean.TYPE)) {
            return false;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f54696a, false, 57721, new Class[0], Boolean.TYPE)).booleanValue();
    }

    private ca() {
    }

    public static ca a() {
        return a.f54697a;
    }

    /* synthetic */ ca(byte b2) {
        this();
    }
}
