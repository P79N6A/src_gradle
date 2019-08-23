package com.bytedance.android.live.core.utils;

import android.support.annotation.Nullable;
import com.bytedance.android.live.a;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Type;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8319a;

    /* renamed from: b  reason: collision with root package name */
    private static JsonParser f8320b = new JsonParser();

    public static String a(Object obj) throws JsonParseException {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, null, f8319a, true, 1186, new Class[]{Object.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{obj2}, null, f8319a, true, 1186, new Class[]{Object.class}, String.class);
        } else if (obj2 == null) {
            return "";
        } else {
            try {
                return a.a().toJson(obj2);
            } catch (Throwable th) {
                throw new JsonParseException(th);
            }
        }
    }

    @Nullable
    public static <T> T a(String str, Type type) {
        String str2 = str;
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{str2, type2}, null, f8319a, true, 1190, new Class[]{String.class, Type.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{str2, type2}, null, f8319a, true, 1190, new Class[]{String.class, Type.class}, Object.class);
        } else if (str2 == null) {
            return null;
        } else {
            try {
                return a.a().fromJson(str2, type2);
            } catch (Exception unused) {
                return null;
            }
        }
    }
}
