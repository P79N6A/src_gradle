package com.ss.android.ugc.aweme.filter;

import android.support.annotation.RawRes;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class au {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47524a = null;
    @RawRes

    /* renamed from: b */
    public static final int filters = 2131951623;

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f47525c = new String[3];

    /* renamed from: d  reason: collision with root package name */
    public static String f47526d;

    /* renamed from: e  reason: collision with root package name */
    public static String f47527e;

    /* renamed from: f  reason: collision with root package name */
    public static String f47528f;
    public static String g;
    public static String h;

    @Deprecated
    public static String b(int i) {
        if (i != 3) {
            return "";
        }
        return g + String.format("beauty_%s/", new Object[]{12});
    }

    public static String a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f47524a, true, 44420, new Class[]{Integer.TYPE}, String.class)) {
            return w.d(i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f47524a, true, 44420, new Class[]{Integer.TYPE}, String.class);
    }

    public static String c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f47524a, true, 44422, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f47524a, true, 44422, new Class[]{Integer.TYPE}, String.class);
        } else if (i != 3) {
            return "";
        } else {
            return g + String.format("beauty_%s_1_1/", new Object[]{12});
        }
    }

    public static String d(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f47524a, true, 44423, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f47524a, true, 44423, new Class[]{Integer.TYPE}, String.class);
        } else if (i != 3) {
            return "";
        } else {
            return g + String.format("beauty_%s_1_1/", new Object[]{13});
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, str4, str5}, null, f47524a, true, 44418, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str, str2, str3, str4, str5};
            PatchProxy.accessDispatch(objArr, null, f47524a, true, 44418, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], null, f47524a, true, 44419, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f47524a, true, 44419, new Class[0], Void.TYPE);
        } else {
            int length = f47525c.length;
            for (int i = 0; i < length; i++) {
                f47525c[i] = b(i);
            }
        }
        f47526d = str;
        f47528f = str2;
        g = str3;
        h = str4;
        f47527e = str5;
    }
}
