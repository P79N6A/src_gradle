package com.bytedance.android.live.core.utils.b;

import android.os.Build;
import com.bytedance.android.live.core.utils.ah;
import com.bytedance.common.utility.reflect.JavaCalls;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import d.a.a.a.a.a;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8245a;

    /* renamed from: b  reason: collision with root package name */
    public static String f8246b;

    /* renamed from: c  reason: collision with root package name */
    public static String f8247c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f8248d;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        f8248d = z;
    }

    public static int a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], null, f8245a, true, 1452, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f8245a, true, 1452, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            if (b()) {
                if (PatchProxy.isSupport(new Object[]{"ro.miui.ui.version.name"}, null, f8245a, true, 1450, new Class[]{String.class}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{"ro.miui.ui.version.name"}, null, f8245a, true, 1450, new Class[]{String.class}, String.class);
                } else {
                    str = (String) JavaCalls.callStaticMethod("android.os.SystemProperties", "get", "ro.miui.ui.version.name", "");
                }
                return Integer.parseInt(str.trim().substring(1));
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    public static String a(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, null, f8245a, true, 1449, new Class[]{String.class}, String.class)) {
            return ah.a(str);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f8245a, true, 1449, new Class[]{String.class}, String.class);
    }
}
