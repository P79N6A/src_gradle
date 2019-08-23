package com.ss.android.ugc.aweme.ag;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.i;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33250a;

    /* renamed from: b  reason: collision with root package name */
    private i f33251b;

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f33250a, false, 70974, new Class[0], String.class)) {
            return this.f33251b.a();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f33250a, false, 70974, new Class[0], String.class);
    }

    private j(String str) {
        this.f33251b = new i(str);
    }

    public static j a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f33250a, true, 70969, new Class[]{String.class}, j.class)) {
            return new j(str2);
        }
        return (j) PatchProxy.accessDispatch(new Object[]{str2}, null, f33250a, true, 70969, new Class[]{String.class}, j.class);
    }

    public final j a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f33250a, false, 70971, new Class[]{String.class, Integer.TYPE}, j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f33250a, false, 70971, new Class[]{String.class, Integer.TYPE}, j.class);
        }
        this.f33251b.a(str, i);
        h.a().f2591d.b(str);
        return this;
    }

    public final j a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f33250a, false, 70970, new Class[]{String.class, String.class}, j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f33250a, false, 70970, new Class[]{String.class, String.class}, j.class);
        }
        this.f33251b.a(str, str2);
        h.a().f2591d.a(str);
        return this;
    }
}
