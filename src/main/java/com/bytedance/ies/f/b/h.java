package com.bytedance.ies.f.b;

import android.support.annotation.NonNull;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private k f20656a;

    h(k kVar) {
        this.f20656a = kVar;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final <T> String a(T t) {
        String str;
        if (t == null) {
            return "{}";
        }
        if ((t instanceof JSONObject) || (t instanceof JSONArray)) {
            str = t.toString();
        } else {
            str = this.f20656a.a(t);
        }
        a(str);
        return str;
    }

    private static void a(String str) {
        if (!str.startsWith("{") || !str.endsWith("}")) {
            i.a(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n " + str));
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final <T> T a(@NonNull String str, @NonNull Type type) throws JSONException {
        a(str);
        if (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) {
            return new JSONObject(str);
        }
        return this.f20656a.a(str, type);
    }
}
