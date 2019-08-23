package com.ss.android.ugc.aweme.net.interceptor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56972a;

    /* renamed from: b  reason: collision with root package name */
    static HashSet<String> f56973b;

    static {
        HashSet<String> hashSet = new HashSet<>();
        f56973b = hashSet;
        hashSet.add("raw_ad_data");
    }

    static List<String> a(JSONObject jSONObject, Class<?> cls) throws NoSuchFieldException, JSONException {
        JSONObject jSONObject2 = jSONObject;
        Class<?> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, cls2}, null, f56972a, true, 60930, new Class[]{JSONObject.class, Class.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{jSONObject2, cls2}, null, f56972a, true, 60930, new Class[]{JSONObject.class, Class.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (Field name : cls.getFields()) {
            hashSet.add(name.getName());
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject2.get(next);
            if (!hashSet.contains(next)) {
                arrayList.add(cls.getCanonicalName() + "miss field:" + next + ",value:" + obj + "\n");
            } else {
                Type genericType = cls2.getField(next).getGenericType();
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        Object obj2 = jSONArray.get(i);
                        if (obj2 instanceof JSONObject) {
                            arrayList.addAll(a((JSONObject) obj2, (Class) ((ParameterizedType) genericType).getActualTypeArguments()[0]));
                        }
                    }
                } else if ((obj instanceof JSONObject) && !f56973b.contains(next)) {
                    arrayList.addAll(a((JSONObject) obj, (Class) genericType));
                }
            }
        }
        return arrayList;
    }
}
