package com.ss.android.ugc.aweme.poi.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.sharedpref.c;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60822a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile n f60823c;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.poi.e.n f60824b;

    private n() {
        try {
            this.f60824b = (com.ss.android.ugc.aweme.poi.e.n) c.a(k.a(), com.ss.android.ugc.aweme.poi.e.n.class);
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.util.c.a("SharedPreferencesAnnotatedManager getSP failed " + th.getMessage());
        }
    }

    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f60822a, false, 66026, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60822a, false, 66026, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f60824b != null) {
            z = this.f60824b.a(false);
        }
        return z;
    }

    public static n a() {
        if (PatchProxy.isSupport(new Object[0], null, f60822a, true, 66022, new Class[0], n.class)) {
            return (n) PatchProxy.accessDispatch(new Object[0], null, f60822a, true, 66022, new Class[0], n.class);
        }
        if (f60823c == null) {
            synchronized (n.class) {
                if (f60823c == null) {
                    f60823c = new n();
                }
            }
        }
        return f60823c;
    }

    public final double[] c() {
        if (PatchProxy.isSupport(new Object[0], this, f60822a, false, 66027, new Class[0], double[].class)) {
            return (double[]) PatchProxy.accessDispatch(new Object[0], this, f60822a, false, 66027, new Class[0], double[].class);
        } else if (this.f60824b == null) {
            return null;
        } else {
            try {
                String b2 = this.f60824b.b();
                String c2 = this.f60824b.c();
                double parseDouble = Double.parseDouble(b2);
                double parseDouble2 = Double.parseDouble(c2);
                if (Math.abs(parseDouble) < 90.0d) {
                    if (Math.abs(parseDouble2) < 180.0d) {
                        return new double[]{parseDouble, parseDouble2};
                    }
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public final void a(double[] dArr) {
        if (PatchProxy.isSupport(new Object[]{dArr}, this, f60822a, false, 66029, new Class[]{double[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dArr}, this, f60822a, false, 66029, new Class[]{double[].class}, Void.TYPE);
        } else if (this.f60824b != null) {
            this.f60824b.a(String.valueOf(dArr[0]));
            this.f60824b.b(String.valueOf(dArr[1]));
        }
    }
}
