package com.toutiao.proxyserver;

import android.annotation.SuppressLint;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.toutiao.proxyserver.IDownloadStateReporter;
import com.toutiao.proxyserver.b.c;
import com.toutiao.proxyserver.d.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class Proxy {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f79953a = null;

    /* renamed from: b  reason: collision with root package name */
    public static volatile g f79954b = null;

    /* renamed from: c  reason: collision with root package name */
    public static volatile h f79955c = null;

    /* renamed from: d  reason: collision with root package name */
    public static volatile c f79956d = null;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: e  reason: collision with root package name */
    public static volatile Context f79957e = null;

    /* renamed from: f  reason: collision with root package name */
    public static volatile String f79958f = null;
    public static volatile n g = null;
    public static volatile m h = null;
    public static volatile l i = null;
    public static volatile k j = null;
    public static volatile boolean k = false;
    public static volatile boolean l = true;
    public static int m = 8192;
    public static volatile boolean n = true;
    public static boolean o = false;
    public static boolean p = true;
    public static volatile boolean q = false;
    public static volatile int r = 0;
    public static volatile b s = null;
    public static volatile boolean t = true;
    public static boolean u = false;
    public static volatile boolean v = true;
    private static long w;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DownloadProgressFlag {
    }

    public static Context a() {
        return f79957e;
    }

    public static n b() {
        return g;
    }

    public static h e() {
        return f79955c;
    }

    public static g f() {
        return f79954b;
    }

    public static synchronized long d() {
        long j2;
        synchronized (Proxy.class) {
            j2 = w;
        }
        return j2;
    }

    public static synchronized long c() {
        long j2;
        synchronized (Proxy.class) {
            j2 = 1;
            if (w < Long.MAX_VALUE) {
                j2 = 1 + w;
            }
            w = j2;
        }
        return j2;
    }

    public static void a(@IDownloadStateReporter.DownloadState int i2, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2}, null, f79953a, true, 91699, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2}, null, f79953a, true, 91699, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (j != null) {
            j.a(i2, str2);
        }
    }

    public static void a(int i2, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str3, str4}, null, f79953a, true, 91698, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str3, str4}, null, f79953a, true, 91698, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        if (i != null) {
            i.a(i2, str3, str4);
        }
    }
}
