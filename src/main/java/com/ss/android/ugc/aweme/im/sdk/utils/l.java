package com.ss.android.ugc.aweme.im.sdk.utils;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52600a;

    /* renamed from: b  reason: collision with root package name */
    private static am<Gson> f52601b = new am<Gson>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52602a;

        public final /* synthetic */ Object a() {
            if (!PatchProxy.isSupport(new Object[0], this, f52602a, false, 53394, new Class[0], Gson.class)) {
                return new Gson();
            }
            return (Gson) PatchProxy.accessDispatch(new Object[0], this, f52602a, false, 53394, new Class[0], Gson.class);
        }
    };

    public static String a(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, null, f52600a, true, 53391, new Class[]{Object.class}, String.class)) {
            return ((Gson) f52601b.b()).toJson(obj2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{obj2}, null, f52600a, true, 53391, new Class[]{Object.class}, String.class);
    }

    public static <T> T a(String str, Class<T> cls) {
        String str2 = str;
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{str2, cls2}, null, f52600a, true, 53392, new Class[]{String.class, Class.class}, Object.class)) {
            return ((Gson) f52601b.b()).fromJson(str2, cls2);
        }
        return PatchProxy.accessDispatch(new Object[]{str2, cls2}, null, f52600a, true, 53392, new Class[]{String.class, Class.class}, Object.class);
    }
}
