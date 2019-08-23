package com.ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.feed.i.a;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import com.ss.android.ugc.aweme.poi.e.o;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.cb;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45079a;

    /* renamed from: b  reason: collision with root package name */
    public static NearbyCities.CityBean f45080b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f45081c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f45082d;

    public static boolean f() {
        if (f45081c || f45082d) {
            return true;
        }
        return false;
    }

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f45079a, true, 39947, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f45079a, true, 39947, new Class[0], String.class);
        }
        NearbyCities.CityBean cityBean = null;
        try {
            cityBean = (NearbyCities.CityBean) cb.a(((a) com.ss.android.ugc.aweme.base.sharedpref.c.a(k.a(), a.class)).c(""), NearbyCities.CityBean.class);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a();
            a2.a("poi_class_code", aa.f75005b);
            a2.a("err_msg", "getSelectCityCode:" + e2.getMessage());
            o.a(a2.b());
        }
        if (cityBean == null) {
            return "";
        }
        return cityBean.code;
    }

    public static NearbyCities.CityBean b() {
        if (PatchProxy.isSupport(new Object[0], null, f45079a, true, 39948, new Class[0], NearbyCities.CityBean.class)) {
            return (NearbyCities.CityBean) PatchProxy.accessDispatch(new Object[0], null, f45079a, true, 39948, new Class[0], NearbyCities.CityBean.class);
        }
        NearbyCities.CityBean cityBean = null;
        try {
            cityBean = (NearbyCities.CityBean) cb.a(((a) com.ss.android.ugc.aweme.base.sharedpref.c.a(k.a(), a.class)).c(""), NearbyCities.CityBean.class);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a();
            a2.a("poi_class_code", aa.f75005b);
            a2.a("err_msg", "getSelectCity:" + e2.getMessage());
            o.a(a2.b());
        }
        return cityBean;
    }

    public static NearbyCities.CityBean c() {
        NearbyCities.CityBean cityBean;
        if (PatchProxy.isSupport(new Object[0], null, f45079a, true, 39951, new Class[0], NearbyCities.CityBean.class)) {
            return (NearbyCities.CityBean) PatchProxy.accessDispatch(new Object[0], null, f45079a, true, 39951, new Class[0], NearbyCities.CityBean.class);
        }
        if (f45080b != null) {
            NearbyCities.CityBean cityBean2 = f45080b;
            f45080b = null;
            return cityBean2;
        }
        try {
            cityBean = (NearbyCities.CityBean) cb.a(((a) com.ss.android.ugc.aweme.base.sharedpref.c.a(k.a(), a.class)).e(""), NearbyCities.CityBean.class);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a();
            a2.a("poi_class_code", aa.f75005b);
            a2.a("err_msg", "getCurrentCity:" + e2.getMessage());
            o.a(a2.b());
            cityBean = null;
        }
        return cityBean;
    }

    public static String d() {
        if (PatchProxy.isSupport(new Object[0], null, f45079a, true, 39952, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f45079a, true, 39952, new Class[0], String.class);
        }
        NearbyCities.CityBean cityBean = null;
        try {
            cityBean = (NearbyCities.CityBean) cb.a(((a) com.ss.android.ugc.aweme.base.sharedpref.c.a(k.a(), a.class)).e(""), NearbyCities.CityBean.class);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a();
            a2.a("poi_class_code", aa.f75005b);
            a2.a("err_msg", "getCurrentCityCode:" + e2.getMessage());
            o.a(a2.b());
        }
        if (cityBean == null) {
            return "";
        }
        return cityBean.code;
    }

    public static boolean e() {
        if (PatchProxy.isSupport(new Object[0], null, f45079a, true, 39953, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f45079a, true, 39953, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (TextUtils.isEmpty(a())) {
            return true;
        }
        return TextUtils.equals(a(), d());
    }

    public static void a(boolean z) {
        f45081c = z;
    }

    public static void b(boolean z) {
        f45082d = z;
    }

    public static void a(NearbyCities.CityBean cityBean) {
        String str;
        if (PatchProxy.isSupport(new Object[]{cityBean}, null, f45079a, true, 39949, new Class[]{NearbyCities.CityBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cityBean}, null, f45079a, true, 39949, new Class[]{NearbyCities.CityBean.class}, Void.TYPE);
            return;
        }
        if (cityBean != null) {
            try {
                str = cb.a(cityBean);
            } catch (Exception e2) {
                Exception exc = e2;
                com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a();
                a2.a("poi_class_code", aa.f75005b);
                a2.a("err_msg", "saveSelectCity:" + exc.getMessage());
                o.a(a2.b());
            }
            ((a) com.ss.android.ugc.aweme.base.sharedpref.c.a(k.a(), a.class)).d(str);
        }
        str = "";
        ((a) com.ss.android.ugc.aweme.base.sharedpref.c.a(k.a(), a.class)).d(str);
    }

    public static void b(NearbyCities.CityBean cityBean) {
        String str;
        if (PatchProxy.isSupport(new Object[]{cityBean}, null, f45079a, true, 39950, new Class[]{NearbyCities.CityBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cityBean}, null, f45079a, true, 39950, new Class[]{NearbyCities.CityBean.class}, Void.TYPE);
            return;
        }
        if (cityBean != null) {
            try {
                str = cb.a(cityBean);
            } catch (Exception e2) {
                Exception exc = e2;
                com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a();
                a2.a("poi_class_code", aa.f75005b);
                a2.a("err_msg", "saveCurrentCity:" + exc.getMessage());
                o.a(a2.b());
            }
            ((a) com.ss.android.ugc.aweme.base.sharedpref.c.a(k.a(), a.class)).f(str);
        }
        str = "";
        ((a) com.ss.android.ugc.aweme.base.sharedpref.c.a(k.a(), a.class)).f(str);
    }
}
