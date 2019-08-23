package com.ss.android.ugc.aweme.fe.b;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44410a;

    private static WritableArray a(JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2 = jSONArray;
        if (PatchProxy.isSupport(new Object[]{jSONArray2}, null, f44410a, true, 39887, new Class[]{JSONArray.class}, WritableArray.class)) {
            return (WritableArray) PatchProxy.accessDispatch(new Object[]{jSONArray2}, null, f44410a, true, 39887, new Class[]{JSONArray.class}, WritableArray.class);
        }
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray2.get(i);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                createArray.pushDouble(jSONArray2.getDouble(i));
            } else if (obj instanceof Number) {
                createArray.pushInt(jSONArray2.getInt(i));
            } else if (obj instanceof String) {
                createArray.pushString(jSONArray2.getString(i));
            } else if (obj instanceof JSONObject) {
                createArray.pushMap(a(jSONArray2.getJSONObject(i)));
            } else if (obj instanceof Boolean) {
                createArray.pushBoolean(jSONArray2.getBoolean(i));
            } else if (obj instanceof JSONArray) {
                createArray.pushArray(a(jSONArray2.getJSONArray(i)));
            } else if (obj == JSONObject.NULL) {
                createArray.pushNull();
            }
        }
        return createArray;
    }

    public static WritableMap a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, f44410a, true, 39886, new Class[]{JSONObject.class}, WritableMap.class)) {
            return (WritableMap) PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, f44410a, true, 39886, new Class[]{JSONObject.class}, WritableMap.class);
        }
        WritableMap createMap = Arguments.createMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject2.get(next);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                createMap.putDouble(next, jSONObject2.getDouble(next));
            } else if (obj instanceof Number) {
                createMap.putInt(next, jSONObject2.getInt(next));
            } else if (obj instanceof String) {
                createMap.putString(next, jSONObject2.getString(next));
            } else if (obj instanceof JSONObject) {
                createMap.putMap(next, a(jSONObject2.getJSONObject(next)));
            } else if (obj instanceof JSONArray) {
                createMap.putArray(next, a(jSONObject2.getJSONArray(next)));
            } else if (obj instanceof Boolean) {
                createMap.putBoolean(next, jSONObject2.getBoolean(next));
            } else if (obj == JSONObject.NULL) {
                createMap.putNull(next);
            }
        }
        return createMap;
    }

    private static JSONArray a(ReadableArray readableArray) throws JSONException {
        ReadableArray readableArray2 = readableArray;
        if (PatchProxy.isSupport(new Object[]{readableArray2}, null, f44410a, true, 39885, new Class[]{ReadableArray.class}, JSONArray.class)) {
            return (JSONArray) PatchProxy.accessDispatch(new Object[]{readableArray2}, null, f44410a, true, 39885, new Class[]{ReadableArray.class}, JSONArray.class);
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (readableArray2.getType(i)) {
                case Null:
                    jSONArray.put(JSONObject.NULL);
                    break;
                case Boolean:
                    jSONArray.put(readableArray2.getBoolean(i));
                    break;
                case Number:
                    try {
                        jSONArray.put(readableArray2.getInt(i));
                        break;
                    } catch (Exception unused) {
                        jSONArray.put(readableArray2.getDouble(i));
                        break;
                    }
                case String:
                    jSONArray.put(readableArray2.getString(i));
                    break;
                case Map:
                    jSONArray.put(a(readableArray2.getMap(i)));
                    break;
                case Array:
                    jSONArray.put(a(readableArray2.getArray(i)));
                    break;
            }
        }
        return jSONArray;
    }

    public static JSONObject a(ReadableMap readableMap) throws JSONException {
        ReadableMap readableMap2 = readableMap;
        if (PatchProxy.isSupport(new Object[]{readableMap2}, null, f44410a, true, 39884, new Class[]{ReadableMap.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{readableMap2}, null, f44410a, true, 39884, new Class[]{ReadableMap.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (readableMap2.getType(nextKey)) {
                case Null:
                    jSONObject.put(nextKey, JSONObject.NULL);
                    break;
                case Boolean:
                    jSONObject.put(nextKey, readableMap2.getBoolean(nextKey));
                    break;
                case Number:
                    try {
                        jSONObject.put(nextKey, readableMap2.getInt(nextKey));
                        break;
                    } catch (Exception unused) {
                        jSONObject.put(nextKey, readableMap2.getDouble(nextKey));
                        break;
                    }
                case String:
                    jSONObject.put(nextKey, readableMap2.getString(nextKey));
                    break;
                case Map:
                    jSONObject.put(nextKey, a(readableMap2.getMap(nextKey)));
                    break;
                case Array:
                    jSONObject.put(nextKey, a(readableMap2.getArray(nextKey)));
                    break;
            }
        }
        return jSONObject;
    }
}
