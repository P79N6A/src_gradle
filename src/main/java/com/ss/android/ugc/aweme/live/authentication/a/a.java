package com.ss.android.ugc.aweme.live.authentication.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.ag.h;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53291a;

    /* renamed from: b  reason: collision with root package name */
    private i f53292b;

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f53291a, false, 55637, new Class[0], String.class)) {
            return this.f53292b.a();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f53291a, false, 55637, new Class[0], String.class);
    }

    private a(String str) {
        this.f53292b = new i(str);
    }

    public static a a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f53291a, true, 55631, new Class[]{String.class}, a.class)) {
            return new a(str2);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{str2}, null, f53291a, true, 55631, new Class[]{String.class}, a.class);
    }

    public final a a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f53291a, false, 55632, new Class[]{String.class, String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f53291a, false, 55632, new Class[]{String.class, String.class}, a.class);
        }
        this.f53292b.a(str, str2);
        h.a().f2591d.a(str);
        return this;
    }

    public final a a(String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f53291a, false, 55636, new Class[]{String.class, Boolean.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f53291a, false, 55636, new Class[]{String.class, Boolean.TYPE}, a.class);
        }
        this.f53292b.a(str, Boolean.toString(z));
        h.a().f2591d.c(str);
        return this;
    }
}
