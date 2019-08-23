package com.ss.android.medialib.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29624a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f29625b = "VESDK-";

    /* renamed from: c  reason: collision with root package name */
    public static byte f29626c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static byte f29627d = 3;

    /* renamed from: e  reason: collision with root package name */
    private static byte f29628e = 1;

    /* renamed from: f  reason: collision with root package name */
    private static byte f29629f = 4;
    private static byte g = 8;
    private static byte h = 16;

    public static void a(String str, String str2) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, str2}, null, f29624a, true, 17075, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str2}, null, f29624a, true, 17075, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        if ((f29629f & f29627d) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f29625b);
            sb.append(str3);
        }
    }

    public static void b(String str, String str2) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, str2}, null, f29624a, true, 17076, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str2}, null, f29624a, true, 17076, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        if ((g & f29627d) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f29625b);
            sb.append(str3);
        }
    }

    public static void c(String str, String str2) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, str2}, null, f29624a, true, 17079, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str2}, null, f29624a, true, 17079, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        if ((f29628e & f29627d) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f29625b);
            sb.append(str3);
        }
    }
}
