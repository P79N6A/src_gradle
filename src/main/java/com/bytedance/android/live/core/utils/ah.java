package com.bytedance.android.live.core.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class ah {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8239a;

    public static String a(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, null, f8239a, true, 1288, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f8239a, true, 1288, new Class[]{String.class}, String.class);
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str2 = (String) cls.getDeclaredMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception unused) {
            str2 = "";
        }
        return str2;
    }

    public static int a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, 0}, null, f8239a, true, 1289, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, 0}, null, f8239a, true, 1289, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        try {
            return Integer.parseInt(a(str).trim());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
