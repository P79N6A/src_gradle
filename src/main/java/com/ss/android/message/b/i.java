package com.ss.android.message.b;

import android.os.Build;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29989a;

    /* renamed from: b  reason: collision with root package name */
    public static String f29990b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f29991c = String.valueOf(Build.VERSION.SDK);

    /* renamed from: d  reason: collision with root package name */
    private static final j f29992d = new j();

    /* renamed from: e  reason: collision with root package name */
    private static String f29993e;

    private static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f29989a, true, 18178, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f29989a, true, 18178, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String str = Build.MANUFACTURER;
        if (!StringUtils.isEmpty(str)) {
            return str.toLowerCase().contains("oppo");
        }
        return false;
    }

    private static boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f29989a, true, 18184, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f29989a, true, 18184, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            String a2 = a("ro.build.version.emui");
            f29993e = a2;
            boolean isEmpty = StringUtils.isEmpty(a2);
            if (!isEmpty) {
                f29993e = f29993e.toLowerCase();
            }
            if (!isEmpty) {
                z = true;
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        String str;
        boolean z;
        f29990b = f29991c;
        try {
            if (PatchProxy.isSupport(new Object[0], null, f29989a, true, 18177, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], null, f29989a, true, 18177, new Class[0], String.class);
            } else if (!b()) {
                if (PatchProxy.isSupport(new Object[0], null, f29989a, true, 18180, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f29989a, true, 18180, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    String a2 = a("ro.vivo.os.build.display.id");
                    if (StringUtils.isEmpty(a2) || !a2.toLowerCase().contains("funtouch")) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    if (PatchProxy.isSupport(new Object[0], null, f29989a, true, 18181, new Class[0], String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[0], null, f29989a, true, 18181, new Class[0], String.class);
                    } else {
                        str = (a("ro.vivo.os.build.display.id") + "_" + a("ro.vivo.product.version")).toLowerCase();
                    }
                } else if (a()) {
                    if (PatchProxy.isSupport(new Object[0], null, f29989a, true, 18179, new Class[0], String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[0], null, f29989a, true, 18179, new Class[0], String.class);
                    } else if (a()) {
                        str = ("coloros_" + a("ro.build.version.opporom") + "_" + Build.DISPLAY).toLowerCase();
                    } else {
                        str = f29991c;
                    }
                } else if (!ToolUtils.isMiui()) {
                    str = f29991c;
                } else if (PatchProxy.isSupport(new Object[0], null, f29989a, true, 18182, new Class[0], String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[0], null, f29989a, true, 18182, new Class[0], String.class);
                } else {
                    str = ("miui_" + a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL).toLowerCase();
                }
            } else if (PatchProxy.isSupport(new Object[0], null, f29989a, true, 18185, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], null, f29989a, true, 18185, new Class[0], String.class);
            } else {
                if (StringUtils.isEmpty(f29993e)) {
                    f29993e = a("ro.build.version.emui");
                }
                String lowerCase = (f29993e + "_" + Build.DISPLAY).toLowerCase();
                if (!StringUtils.isEmpty(lowerCase)) {
                    str = lowerCase.toLowerCase();
                } else {
                    str = f29991c;
                }
            }
        } catch (Throwable unused) {
            str = null;
        }
        if (StringUtils.isEmpty(str)) {
            str = f29991c;
        }
        f29990b = str;
    }

    private static String a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f29989a, true, 18183, new Class[]{String.class}, String.class)) {
            return f29992d.a(str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f29989a, true, 18183, new Class[]{String.class}, String.class);
    }
}
