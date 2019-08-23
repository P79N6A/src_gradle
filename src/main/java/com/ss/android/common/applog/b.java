package com.ss.android.common.applog;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b implements m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2438a;

    /* renamed from: b  reason: collision with root package name */
    private static b f2439b;

    /* renamed from: c  reason: collision with root package name */
    private String f2440c;

    public final String b() {
        return this.f2440c;
    }

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f2438a, true, 15253, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f2438a, true, 15253, new Class[0], b.class);
        }
        if (f2439b == null) {
            synchronized (b.class) {
                if (f2439b == null) {
                    f2439b = new b();
                }
            }
        }
        return f2439b;
    }

    private b() {
        String str;
        String str2;
        if (c()) {
            if (PatchProxy.isSupport(new Object[0], null, f2438a, true, 15254, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], null, f2438a, true, 15254, new Class[0], String.class);
            } else {
                str = a("ro.aliyun.clouduuid", "false");
            }
            this.f2440c = str;
            if (TextUtils.isEmpty(this.f2440c)) {
                if (PatchProxy.isSupport(new Object[0], null, f2438a, true, 15255, new Class[0], String.class)) {
                    str2 = (String) PatchProxy.accessDispatch(new Object[0], null, f2438a, true, 15255, new Class[0], String.class);
                } else {
                    str2 = a("ro.sys.aliyun.clouduuid", "false");
                }
                this.f2440c = str2;
            }
        }
    }

    @SuppressLint({"DefaultLocale"})
    private static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f2438a, true, 15257, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f2438a, true, 15257, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            if ((System.getProperty("java.vm.name") != null && System.getProperty("java.vm.name").toLowerCase().contains("lemur")) || System.getProperty("ro.yunos.version") != null) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static String a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, null, f2438a, true, 15256, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str, str2}, null, f2438a, true, 15256, new Class[]{String.class, String.class}, String.class);
        }
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{str, str2});
        } catch (Exception unused) {
            return str2;
        }
    }
}
