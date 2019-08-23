package com.cmic.sso.sdk.d;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.cmic.sso.sdk.d.s;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f23071a = q.a();

    /* renamed from: b  reason: collision with root package name */
    private static String f23072b;

    /* renamed from: c  reason: collision with root package name */
    private static String f23073c;

    /* renamed from: d  reason: collision with root package name */
    private static long f23074d = 0;

    public static boolean a() {
        return f23071a;
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f23072b)) {
            return f23072b;
        }
        String b2 = n.b(context, "phonescripcache", "");
        if (TextUtils.isEmpty(b2)) {
            f.a("PhoneScripUtils", "null");
            return null;
        }
        String b3 = e.b(context, b2);
        f23072b = b3;
        return b3;
    }

    private static boolean b(Context context) {
        f.b("PhoneScripUtils", f23072b + " " + f23073c + " " + f23074d);
        if (!TextUtils.isEmpty(f23072b)) {
            return a(f23074d);
        }
        String b2 = n.b(context, "phonescripcache", "");
        long b3 = n.b(context, "phonescripstarttime", 0);
        if (TextUtils.isEmpty(b2) || !a(b3)) {
            return false;
        }
        return true;
    }

    private static boolean a(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        f.b("PhoneScripUtils", j);
        f.b("PhoneScripUtils", currentTimeMillis);
        if (j - currentTimeMillis > 120000) {
            return true;
        }
        return false;
    }

    private static int a(Context context, String str) {
        String str2;
        if (!TextUtils.isEmpty(f23073c)) {
            str2 = f23073c;
        } else {
            str2 = n.b(context, "preimsi", "");
            f23073c = str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return 0;
        }
        if (str2.equals(str)) {
            return 1;
        }
        if (m.a(context).a()) {
            return 3;
        }
        return 2;
    }

    public static void a(Context context, boolean z) {
        n.a(context, "phonescripstarttime");
        n.a(context, "phonescripcache");
        n.a(context, "preimsi");
        if (z) {
            f23072b = null;
            f23073c = null;
            f23074d = 0;
        }
    }

    public static boolean a(Context context, Bundle bundle) {
        int a2 = a(context, bundle.getString("imsi"));
        bundle.putString("imsiState", a2);
        f.b("PhoneScripUtils", "imsiState = " + a2);
        if (a2 != 1) {
            return false;
        }
        if (f23071a) {
            f.b("PhoneScripUtils", "phone is root");
            a(context, false);
        }
        return b(context);
    }

    public static void a(Context context, String str, long j, String str2) {
        f23072b = str;
        f23074d = j;
        f23073c = str2;
        if (!f23071a) {
            final Context context2 = context;
            final String str3 = str;
            final long j2 = j;
            final String str4 = str2;
            AnonymousClass1 r1 = new s.a() {
                /* access modifiers changed from: protected */
                public final void a() {
                    f.b("PhoneScripUtils", "start save scrip to sp in sub thread");
                    k.c(context2, str3, j2, str4);
                }
            };
            s.a(r1);
        }
    }

    /* access modifiers changed from: private */
    public static void c(Context context, String str, long j, String str2) {
        String a2 = e.a(context, str);
        if (!TextUtils.isEmpty(a2)) {
            n.a(context, "phonescripcache", a2);
            n.a(context, "phonescripstarttime", j);
            n.a(context, "preimsi", str2);
        }
    }
}
