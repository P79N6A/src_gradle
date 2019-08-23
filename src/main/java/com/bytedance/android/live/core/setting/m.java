package com.bytedance.android.live.core.setting;

import com.bytedance.android.live.a;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Type;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8186a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f8187b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f8188c;

    /* renamed from: d  reason: collision with root package name */
    private static Gson f8189d = a.a();

    public static Gson c() {
        return f8189d;
    }

    public static boolean b() {
        return f8188c;
    }

    public static boolean a() {
        return f8187b;
    }

    public static String a(l lVar) {
        return lVar.f8181b;
    }

    public static String b(l lVar) {
        return lVar.f8182c;
    }

    public static String[] d(l lVar) {
        return lVar.g;
    }

    public static void a(boolean z) {
        f8187b = true;
    }

    public static Type c(l lVar) {
        return lVar.f8185f;
    }

    public static boolean a(l lVar, String str) {
        if (!PatchProxy.isSupport(new Object[]{lVar, str}, null, f8186a, true, 932, new Class[]{l.class, String.class}, Boolean.TYPE)) {
            return g.a(lVar, str);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{lVar, str}, null, f8186a, true, 932, new Class[]{l.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    public static <T> T a(String str, String str2, Type type, T t) {
        if (!PatchProxy.isSupport(new Object[]{str, str2, type, t}, null, f8186a, true, 930, new Class[]{String.class, String.class, Type.class, Object.class}, Object.class)) {
            return g.a(str, str2, type, t);
        }
        return PatchProxy.accessDispatch(new Object[]{str, str2, type, t}, null, f8186a, true, 930, new Class[]{String.class, String.class, Type.class, Object.class}, Object.class);
    }
}
