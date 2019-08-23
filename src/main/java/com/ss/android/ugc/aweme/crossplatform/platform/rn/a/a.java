package com.ss.android.ugc.aweme.crossplatform.platform.rn.a;

import android.support.annotation.NonNull;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40831a;

    private static JSONArray a(@NonNull ReadableArray readableArray) {
        ReadableArray readableArray2 = readableArray;
        if (PatchProxy.isSupport(new Object[]{readableArray2}, null, f40831a, true, 34409, new Class[]{ReadableArray.class}, JSONArray.class)) {
            return (JSONArray) PatchProxy.accessDispatch(new Object[]{readableArray2}, null, f40831a, true, 34409, new Class[]{ReadableArray.class}, JSONArray.class);
        }
        JSONArray jSONArray = new JSONArray();
        int size = readableArray.size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                switch (readableArray2.getType(i)) {
                    case Map:
                        jSONArray.put(a(readableArray2.getMap(i)));
                        break;
                    case Array:
                        jSONArray.put(a(readableArray2.getArray(i)));
                        break;
                    case Number:
                        jSONArray.put(readableArray2.getInt(i));
                        break;
                    case Boolean:
                        jSONArray.put(readableArray2.getBoolean(i));
                        break;
                    case String:
                        jSONArray.put(readableArray2.getString(i));
                        break;
                }
            }
        }
        return jSONArray;
    }

    public static JSONObject a(ReadableMap readableMap) {
        ReadableMap readableMap2 = readableMap;
        if (PatchProxy.isSupport(new Object[]{readableMap2}, null, f40831a, true, 34408, new Class[]{ReadableMap.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{readableMap2}, null, f40831a, true, 34408, new Class[]{ReadableMap.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                switch (readableMap2.getType(nextKey)) {
                    case Map:
                        jSONObject.put(nextKey, a(readableMap2.getMap(nextKey)));
                        break;
                    case Array:
                        jSONObject.put(nextKey, a(readableMap2.getArray(nextKey)));
                        break;
                    case Number:
                        jSONObject.put(nextKey, readableMap2.getInt(nextKey));
                        break;
                    case Boolean:
                        jSONObject.put(nextKey, readableMap2.getBoolean(nextKey));
                        break;
                    case String:
                        jSONObject.put(nextKey, readableMap2.getString(nextKey));
                        break;
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static String a(@NonNull String str, @NonNull ReadableMap readableMap) {
        String str2 = str;
        ReadableMap readableMap2 = readableMap;
        if (PatchProxy.isSupport(new Object[]{str2, readableMap2}, null, f40831a, true, 34410, new Class[]{String.class, ReadableMap.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, readableMap2}, null, f40831a, true, 34410, new Class[]{String.class, ReadableMap.class}, String.class);
        }
        String str3 = null;
        switch (readableMap2.getType(str2)) {
            case Map:
                JSONObject a2 = a(readableMap2.getMap(str2));
                if (a2 != null) {
                    str3 = a2.toString();
                    break;
                }
                break;
            case Array:
                JSONArray a3 = a(readableMap2.getArray(str2));
                if (a3 != null) {
                    str3 = a3.toString();
                    break;
                }
                break;
            case Number:
                str3 = String.valueOf(readableMap2.getInt(str2));
                break;
            case Boolean:
                str3 = String.valueOf(readableMap2.getBoolean(str2));
                break;
            case String:
                str3 = readableMap2.getString(str2);
                break;
        }
        return str3;
    }
}
