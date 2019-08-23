package com.toutiao.proxyserver.d;

import com.google.a.a.a.a.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80041a;

    /* renamed from: b  reason: collision with root package name */
    public static a f80042b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f80043c;

    public static String a(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, null, f80041a, true, 91798, new Class[]{Throwable.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{th2}, null, f80041a, true, 91798, new Class[]{Throwable.class}, String.class);
        } else if (th2 == null) {
            return "";
        } else {
            for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
                if (th3 instanceof UnknownHostException) {
                    return "UnknownHostException";
                }
            }
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            a.a(th2, printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }
    }

    public static void b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f80041a, true, 91792, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f80041a, true, 91792, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        b(str3, str4, null);
    }

    public static void c(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f80041a, true, 91794, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f80041a, true, 91794, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        c(str3, str4, null);
    }

    public static void d(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f80041a, true, 91796, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f80041a, true, 91796, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        d(str3, str4, null);
    }

    public static void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f80041a, true, 91788, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f80041a, true, 91788, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        a(str3, str4, null);
    }

    public static void b(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, null, f80041a, true, 91793, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, null, f80041a, true, 91793, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (f80042b != null && f80043c) {
            f80042b.b(str4, str5, str6);
        }
    }

    public static void c(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, null, f80041a, true, 91795, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, null, f80041a, true, 91795, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (f80042b != null && f80043c) {
            f80042b.c(str4, str5, str6);
        }
    }

    public static void d(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, null, f80041a, true, 91797, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, null, f80041a, true, 91797, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (f80042b != null && f80043c) {
            f80042b.d(str4, str5, str6);
        }
    }

    public static void a(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, null, f80041a, true, 91789, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, null, f80041a, true, 91789, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (f80042b != null && f80043c) {
            f80042b.a(str4, str5, str6);
        }
    }
}
