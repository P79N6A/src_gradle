package com.bytedance.android.livesdkapi.k.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18832a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f18833b;

    /* renamed from: c  reason: collision with root package name */
    public String f18834c;

    /* renamed from: d  reason: collision with root package name */
    public String f18835d;

    public e() {
        this.f18833b = new ArrayList();
        this.f18835d = "UTF-8";
        this.f18834c = null;
    }

    public final String toString() {
        if (!PatchProxy.isSupport(new Object[0], this, f18832a, false, 15150, new Class[0], String.class)) {
            return a();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f18832a, false, 15150, new Class[0], String.class);
    }

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f18832a, false, 15149, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f18832a, false, 15149, new Class[0], String.class);
        } else if (this.f18833b.isEmpty()) {
            return this.f18834c;
        } else {
            String a2 = d.a(this.f18833b, this.f18835d);
            if (this.f18834c == null || this.f18834c.length() == 0) {
                return a2;
            }
            if (this.f18834c.indexOf(63) >= 0) {
                return this.f18834c + "&" + a2;
            }
            return this.f18834c + "?" + a2;
        }
    }

    public e(String str) {
        this.f18833b = new ArrayList();
        this.f18835d = "UTF-8";
        this.f18834c = str;
    }

    public final void a(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f18832a, false, 15145, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f18832a, false, 15145, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f18833b.add(new a(str2, String.valueOf(i)));
    }

    public final void a(String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f18832a, false, 15146, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f18832a, false, 15146, new Class[]{String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        this.f18833b.add(new a(str2, String.valueOf(j)));
    }

    public final void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f18832a, false, 15148, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f18832a, false, 15148, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.f18833b.add(new a(str3, str4));
    }
}
