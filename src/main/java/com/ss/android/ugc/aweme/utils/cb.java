package com.ss.android.ugc.aweme.utils;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class cb {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75667a;

    /* renamed from: b  reason: collision with root package name */
    private static Gson f75668b;

    public static Gson a() {
        if (PatchProxy.isSupport(new Object[0], null, f75667a, true, 88348, new Class[0], Gson.class)) {
            return (Gson) PatchProxy.accessDispatch(new Object[0], null, f75667a, true, 88348, new Class[0], Gson.class);
        }
        if (f75668b == null) {
            f75668b = new Gson();
        }
        return f75668b;
    }

    public static String a(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, null, f75667a, true, 88349, new Class[]{Object.class}, String.class)) {
            return a().toJson(obj2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{obj2}, null, f75667a, true, 88349, new Class[]{Object.class}, String.class);
    }

    public static <T> T a(String str, Class<T> cls) {
        String str2 = str;
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{str2, cls2}, null, f75667a, true, 88350, new Class[]{String.class, Class.class}, Object.class)) {
            return a().fromJson(str2, cls2);
        }
        return PatchProxy.accessDispatch(new Object[]{str2, cls2}, null, f75667a, true, 88350, new Class[]{String.class, Class.class}, Object.class);
    }

    public static <T> List<T> b(String str, Class<T[]> cls) {
        String str2 = str;
        Class<T[]> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{str2, cls2}, null, f75667a, true, 88351, new Class[]{String.class, Class.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2, cls2}, null, f75667a, true, 88351, new Class[]{String.class, Class.class}, List.class);
        }
        Object[] objArr = (Object[]) a().fromJson(str2, cls2);
        if (objArr == null) {
            return new ArrayList();
        }
        return new ArrayList(Arrays.asList(objArr));
    }
}
