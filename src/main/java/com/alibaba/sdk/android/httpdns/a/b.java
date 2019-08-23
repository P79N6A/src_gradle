package com.alibaba.sdk.android.httpdns.a;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static f f5081a;

    /* renamed from: a  reason: collision with other field name */
    private static h f19a;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f5082f;

    public static List<e> a() {
        ArrayList arrayList = new ArrayList();
        if (!f5082f) {
            return arrayList;
        }
        arrayList.addAll(f5081a.a());
        return arrayList;
    }

    public static void a(Context context) {
        a(context, null);
    }

    public static void a(Context context, h hVar) {
        f5081a = new a(context);
        f19a = hVar;
        if (hVar == null) {
            f19a = new h();
        }
    }

    public static void a(e eVar) {
        if (eVar != null) {
            f5081a.a(eVar);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m0a() {
        return f5082f;
    }

    public static void b(Context context) {
        if (context != null) {
            f19a.c(context);
        }
    }

    public static void b(e eVar) {
        if (eVar != null) {
            f5081a.b(eVar);
        }
    }

    public static void c(boolean z) {
        f5082f = z;
    }

    public static String g() {
        return f19a.g();
    }
}
