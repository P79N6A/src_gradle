package com.ss.android.common.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.http.a.a.a.b;
import com.ss.android.http.a.b.e;
import java.util.ArrayList;
import java.util.List;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28336a;

    /* renamed from: b  reason: collision with root package name */
    public final List<e> f28337b;

    /* renamed from: c  reason: collision with root package name */
    public String f28338c;

    /* renamed from: d  reason: collision with root package name */
    public String f28339d;

    public i() {
        this.f28337b = new ArrayList();
        this.f28339d = "UTF-8";
        this.f28338c = null;
    }

    public String toString() {
        if (!PatchProxy.isSupport(new Object[0], this, f28336a, false, 16149, new Class[0], String.class)) {
            return a();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f28336a, false, 16149, new Class[0], String.class);
    }

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f28336a, false, 16148, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f28336a, false, 16148, new Class[0], String.class);
        } else if (this.f28337b.isEmpty()) {
            return this.f28338c;
        } else {
            String a2 = b.a(this.f28337b, this.f28339d);
            if (this.f28338c == null || this.f28338c.length() == 0) {
                return a2;
            }
            if (this.f28338c.indexOf(63) >= 0) {
                return this.f28338c + "&" + a2;
            }
            return this.f28338c + "?" + a2;
        }
    }

    public i(String str) {
        this.f28337b = new ArrayList();
        this.f28339d = "UTF-8";
        this.f28338c = str;
    }

    public final void a(String str, double d2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Double.valueOf(d2)}, this, f28336a, false, 16146, new Class[]{String.class, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Double.valueOf(d2)}, this, f28336a, false, 16146, new Class[]{String.class, Double.TYPE}, Void.TYPE);
            return;
        }
        this.f28337b.add(new e(str2, String.valueOf(d2)));
    }

    public final void a(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f28336a, false, 16144, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f28336a, false, 16144, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f28337b.add(new e(str2, String.valueOf(i)));
    }

    public final void a(String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f28336a, false, 16145, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f28336a, false, 16145, new Class[]{String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        this.f28337b.add(new e(str2, String.valueOf(j)));
    }

    public final void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f28336a, false, 16147, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f28336a, false, 16147, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.f28337b.add(new e(str3, str4));
    }
}
