package com.ss.android.ugc.aweme.am;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33302a;

    /* renamed from: b  reason: collision with root package name */
    static final C0423a f33303b;

    /* renamed from: com.ss.android.ugc.aweme.am.a$a  reason: collision with other inner class name */
    static class C0423a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33304a;

        C0423a() {
        }

        public String a(Context context) {
            if (PatchProxy.isSupport(new Object[]{context}, this, f33304a, false, 86670, new Class[]{Context.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{context}, this, f33304a, false, 86670, new Class[]{Context.class}, String.class);
            }
            return Environment.getExternalStorageDirectory() + "/DCIM/Camera/";
        }
    }

    static class b extends C0423a {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f33305b;

        b() {
        }

        public final String a(Context context) {
            if (PatchProxy.isSupport(new Object[]{context}, this, f33305b, false, 86671, new Class[]{Context.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{context}, this, f33305b, false, 86671, new Class[]{Context.class}, String.class);
            }
            if (!c.a.a.a.a.f1626a) {
                float b2 = c.a.a.a.a.b();
                if (c.a.a.a.a.a() || b2 >= 3.6f) {
                    c.a.a.a.a.f1627b = true;
                }
                c.a.a.a.a.f1626a = true;
            }
            if (c.a.a.a.a.f1627b) {
                return super.a(context);
            }
            return Environment.getExternalStorageDirectory() + "/相机/";
        }
    }

    static {
        if ("VIVO".equals(Build.BRAND.toUpperCase())) {
            f33303b = new b();
        } else {
            f33303b = new C0423a();
        }
    }

    public static String a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f33302a, true, 86669, new Class[]{Context.class}, String.class)) {
            return f33303b.a(context2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f33302a, true, 86669, new Class[]{Context.class}, String.class);
    }
}
