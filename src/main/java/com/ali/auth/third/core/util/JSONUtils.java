package com.ali.auth.third.core.util;

import android.util.Base64;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONUtils {
    public static Boolean optBoolean(JSONObject jSONObject, String str) {
        return Boolean.valueOf(jSONObject.has(str) ? jSONObject.optBoolean(str) : false);
    }

    public static Integer optInteger(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return Integer.valueOf(jSONObject.optInt(str));
        }
        return null;
    }

    public static Long optLong(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return Long.valueOf(jSONObject.optLong(str));
        }
        return null;
    }

    public static String optString(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [T, java.lang.Byte[]] */
    /* JADX WARNING: type inference failed for: r5v8, types: [java.lang.Character[], T] */
    public static <T> T parseStringValue(String str, Class<T> cls) {
        if (str == null || cls == null) {
            return null;
        }
        if (String.class.equals(cls)) {
            return str;
        }
        if (Short.TYPE.equals(cls) || Short.class.equals(cls)) {
            return Short.valueOf(str);
        }
        if (Integer.TYPE.equals(cls) || Integer.class.equals(cls)) {
            return Integer.valueOf(str);
        }
        if (Long.TYPE.equals(cls) || Long.class.equals(cls)) {
            return Long.valueOf(str);
        }
        if (Boolean.TYPE.equals(cls) || Boolean.class.equals(cls)) {
            return Boolean.valueOf(str);
        }
        if (Float.TYPE.equals(cls) || Float.class.equals(cls)) {
            return Float.valueOf(str);
        }
        if (Double.TYPE.equals(cls) || Double.class.equals(cls)) {
            return Double.valueOf(str);
        }
        if (Byte.TYPE.equals(cls) || Byte.class.equals(cls)) {
            return Byte.valueOf(str);
        }
        int i = 0;
        if (Character.TYPE.equals(cls) || Character.class.equals(cls)) {
            return Character.valueOf(str.charAt(0));
        }
        if (Date.class.isAssignableFrom(cls)) {
            try {
                return new SimpleDateFormat("yyyyMMddHHmmssSSSZ", Locale.US).parse(str);
            } catch (ParseException e2) {
                throw new RuntimeException("Parse Date error", e2);
            }
        } else {
            char charAt = str.charAt(0);
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (charAt == '[') {
                    try {
                        return toPOJOArray(new JSONArray(str), componentType);
                    } catch (Exception e3) {
                        throw new RuntimeException(e3);
                    }
                } else if (String.class.equals(componentType)) {
                    return str.split(",");
                } else {
                    if (Character.TYPE.equals(componentType)) {
                        return str.toCharArray();
                    }
                    if (Character.class.equals(componentType)) {
                        char[] charArray = str.toCharArray();
                        ? r5 = new Character[charArray.length];
                        while (i < r5.length) {
                            r5[i] = Character.valueOf(charArray[i]);
                            i++;
                        }
                        return r5;
                    } else if (Byte.TYPE.equals(componentType)) {
                        return Base64.decode(str, 0);
                    } else {
                        if (!Byte.class.equals(componentType)) {
                            return null;
                        }
                        byte[] decode = Base64.decode(str, 0);
                        ? r52 = new Byte[decode.length];
                        while (i < r52.length) {
                            r52[i] = Byte.valueOf(decode[i]);
                            i++;
                        }
                        return r52;
                    }
                }
            } else if (charAt == '{') {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return Map.class.isAssignableFrom(cls) ? toMap(jSONObject) : toPOJO(jSONObject, cls);
                } catch (Exception e4) {
                    throw new RuntimeException(e4);
                }
            } else if (cls.isAssignableFrom(String.class)) {
                return str;
            } else {
                return null;
            }
        }
    }

    public static String toJson(Map<String, Object> map) {
        return toJsonObject(map).toString();
    }

    public static JSONArray toJsonArray(List<Object> list) {
        JSONArray jSONArray = new JSONArray();
        for (Object next : list) {
            if (next instanceof Map) {
                next = toJsonObject((Map) next);
            }
            jSONArray.put(next);
        }
        return jSONArray;
    }

    public static JSONArray toJsonArray(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (JSONObject jSONObject : objArr) {
            if (jSONObject instanceof Map) {
                jSONObject = toJsonObject((Map) jSONObject);
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static JSONObject toJsonObject(Map<String, ? extends Object> map) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry next : map.entrySet()) {
                Object value = next.getValue();
                if (value != null) {
                    if (value instanceof Map) {
                        str = (String) next.getKey();
                        value = toJsonObject((Map) value);
                    } else if (value instanceof List) {
                        str = (String) next.getKey();
                        value = toJsonArray((List) value);
                    } else if (value.getClass().isArray()) {
                        str = (String) next.getKey();
                        value = toJsonArray((Object[]) value);
                    } else {
                        str = (String) next.getKey();
                    }
                    jSONObject.put(str, value);
                }
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String toJsonString(Map<String, String> map) {
        return toJsonObject(map).toString();
    }

    public static List<Object> toList(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            arrayList.add(obj instanceof JSONObject ? toMap((JSONObject) obj) : obj instanceof JSONArray ? toList((JSONArray) obj) : jSONArray.get(i));
        }
        return arrayList;
    }

    public static Map<String, Object> toMap(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof JSONObject) {
                opt = toMap((JSONObject) opt);
            } else if (opt instanceof JSONArray) {
                opt = toList((JSONArray) opt);
            }
            hashMap.put(next, opt);
        }
        return hashMap;
    }

    public static <T> T toPOJO(JSONObject jSONObject, Class<T> cls) {
        char c2;
        Object obj;
        if (jSONObject == null || cls == null || cls == Void.TYPE) {
            return null;
        }
        try {
            T newInstance = cls.newInstance();
            for (Field field : cls.getFields()) {
                Class type = field.getType();
                String name = field.getName();
                if (jSONObject.has(name)) {
                    if (!type.isPrimitive()) {
                        if (type == String.class) {
                            obj = jSONObject.getString(name);
                        } else {
                            if (!(type == Boolean.class || type == Integer.class || type == Short.class || type == Long.class)) {
                                if (type != Double.class) {
                                    obj = type.isArray() ? toPOJOArray(jSONObject.getJSONArray(name), type.getComponentType()) : Map.class.isAssignableFrom(type) ? toMap(jSONObject.getJSONObject(name)) : toPOJO(jSONObject.getJSONObject(name), type);
                                }
                            }
                            obj = jSONObject.get(name);
                        }
                        field.set(newInstance, obj);
                    } else if (type == Boolean.TYPE) {
                        field.setBoolean(newInstance, jSONObject.getBoolean(name));
                    } else if (type == Byte.TYPE) {
                        field.setByte(newInstance, (byte) jSONObject.getInt(name));
                    } else if (type == Character.TYPE) {
                        String string = jSONObject.getString(name);
                        if (string != null) {
                            if (string.length() != 0) {
                                c2 = string.charAt(0);
                                field.setChar(newInstance, c2);
                            }
                        }
                        c2 = 0;
                        field.setChar(newInstance, c2);
                    } else if (type == Short.TYPE) {
                        field.setShort(newInstance, (short) jSONObject.getInt(name));
                    } else if (type == Integer.TYPE) {
                        field.setInt(newInstance, jSONObject.getInt(name));
                    } else if (type == Long.TYPE) {
                        field.setLong(newInstance, jSONObject.getLong(name));
                    } else if (type == Float.TYPE) {
                        field.setFloat(newInstance, (float) jSONObject.getDouble(name));
                    } else if (type == Double.TYPE) {
                        field.setDouble(newInstance, jSONObject.getDouble(name));
                    }
                }
            }
            return newInstance;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Class, java.lang.Class<T>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T[] toPOJOArray(org.json.JSONArray r5, java.lang.Class<T> r6) {
        /*
            if (r5 == 0) goto L_0x00f4
            if (r6 == 0) goto L_0x00f4
            java.lang.Class r0 = java.lang.Void.TYPE
            if (r6 != r0) goto L_0x000a
            goto L_0x00f4
        L_0x000a:
            int r0 = r5.length()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r6, r0)
            r1 = 0
            r2 = 0
        L_0x0014:
            int r3 = r5.length()     // Catch:{ JSONException -> 0x00ed }
            if (r2 >= r3) goto L_0x00ea
            boolean r3 = r6.isPrimitive()     // Catch:{ JSONException -> 0x00ed }
            if (r3 != 0) goto L_0x0074
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r6 != r3) goto L_0x0029
            java.lang.String r3 = r5.getString(r2)     // Catch:{ JSONException -> 0x00ed }
            goto L_0x006f
        L_0x0029:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            if (r6 == r3) goto L_0x006b
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r6 == r3) goto L_0x006b
            java.lang.Class<java.lang.Short> r3 = java.lang.Short.class
            if (r6 == r3) goto L_0x006b
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            if (r6 == r3) goto L_0x006b
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            if (r6 != r3) goto L_0x003e
            goto L_0x006b
        L_0x003e:
            boolean r3 = r6.isArray()     // Catch:{ JSONException -> 0x00ed }
            if (r3 == 0) goto L_0x0051
            org.json.JSONArray r3 = r5.getJSONArray(r2)     // Catch:{ JSONException -> 0x00ed }
            java.lang.Class r4 = r6.getComponentType()     // Catch:{ JSONException -> 0x00ed }
            java.lang.Object[] r3 = toPOJOArray(r3, r4)     // Catch:{ JSONException -> 0x00ed }
            goto L_0x006f
        L_0x0051:
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r6)     // Catch:{ JSONException -> 0x00ed }
            if (r3 == 0) goto L_0x0062
            org.json.JSONObject r3 = r5.getJSONObject(r2)     // Catch:{ JSONException -> 0x00ed }
            java.util.Map r3 = toMap(r3)     // Catch:{ JSONException -> 0x00ed }
            goto L_0x006f
        L_0x0062:
            org.json.JSONObject r3 = r5.getJSONObject(r2)     // Catch:{ JSONException -> 0x00ed }
            java.lang.Object r3 = toPOJO(r3, r6)     // Catch:{ JSONException -> 0x00ed }
            goto L_0x006f
        L_0x006b:
            java.lang.Object r3 = r5.get(r2)     // Catch:{ JSONException -> 0x00ed }
        L_0x006f:
            java.lang.reflect.Array.set(r0, r2, r3)     // Catch:{ JSONException -> 0x00ed }
            goto L_0x00e6
        L_0x0074:
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch:{ JSONException -> 0x00ed }
            if (r6 != r3) goto L_0x0081
            boolean r3 = r5.getBoolean(r2)     // Catch:{ JSONException -> 0x00ed }
            java.lang.reflect.Array.setBoolean(r0, r2, r3)     // Catch:{ JSONException -> 0x00ed }
            goto L_0x00e6
        L_0x0081:
            java.lang.Class r3 = java.lang.Byte.TYPE     // Catch:{ JSONException -> 0x00ed }
            if (r6 != r3) goto L_0x008e
            int r3 = r5.getInt(r2)     // Catch:{ JSONException -> 0x00ed }
            byte r3 = (byte) r3     // Catch:{ JSONException -> 0x00ed }
            java.lang.reflect.Array.setByte(r0, r2, r3)     // Catch:{ JSONException -> 0x00ed }
            goto L_0x00e6
        L_0x008e:
            java.lang.Class r3 = java.lang.Character.TYPE     // Catch:{ JSONException -> 0x00ed }
            if (r6 != r3) goto L_0x00a9
            java.lang.String r3 = r5.getString(r2)     // Catch:{ JSONException -> 0x00ed }
            if (r3 == 0) goto L_0x00a4
            int r4 = r3.length()     // Catch:{ JSONException -> 0x00ed }
            if (r4 != 0) goto L_0x009f
            goto L_0x00a4
        L_0x009f:
            char r3 = r3.charAt(r1)     // Catch:{ JSONException -> 0x00ed }
            goto L_0x00a5
        L_0x00a4:
            r3 = 0
        L_0x00a5:
            java.lang.reflect.Array.setChar(r0, r2, r3)     // Catch:{ JSONException -> 0x00ed }
            goto L_0x00e6
        L_0x00a9:
            java.lang.Class r3 = java.lang.Short.TYPE     // Catch:{ JSONException -> 0x00ed }
            if (r6 != r3) goto L_0x00b6
            int r3 = r5.getInt(r2)     // Catch:{ JSONException -> 0x00ed }
            short r3 = (short) r3     // Catch:{ JSONException -> 0x00ed }
            java.lang.reflect.Array.setShort(r0, r2, r3)     // Catch:{ JSONException -> 0x00ed }
            goto L_0x00e6
        L_0x00b6:
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ JSONException -> 0x00ed }
            if (r6 != r3) goto L_0x00c2
            int r3 = r5.getInt(r2)     // Catch:{ JSONException -> 0x00ed }
            java.lang.reflect.Array.setInt(r0, r2, r3)     // Catch:{ JSONException -> 0x00ed }
            goto L_0x00e6
        L_0x00c2:
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ JSONException -> 0x00ed }
            if (r6 != r3) goto L_0x00ce
            long r3 = r5.getLong(r2)     // Catch:{ JSONException -> 0x00ed }
            java.lang.reflect.Array.setLong(r0, r2, r3)     // Catch:{ JSONException -> 0x00ed }
            goto L_0x00e6
        L_0x00ce:
            java.lang.Class r3 = java.lang.Float.TYPE     // Catch:{ JSONException -> 0x00ed }
            if (r6 != r3) goto L_0x00db
            double r3 = r5.getDouble(r2)     // Catch:{ JSONException -> 0x00ed }
            float r3 = (float) r3     // Catch:{ JSONException -> 0x00ed }
            java.lang.reflect.Array.setFloat(r0, r2, r3)     // Catch:{ JSONException -> 0x00ed }
            goto L_0x00e6
        L_0x00db:
            java.lang.Class r3 = java.lang.Double.TYPE     // Catch:{ JSONException -> 0x00ed }
            if (r6 != r3) goto L_0x00e6
            double r3 = r5.getDouble(r2)     // Catch:{ JSONException -> 0x00ed }
            java.lang.reflect.Array.setDouble(r0, r2, r3)     // Catch:{ JSONException -> 0x00ed }
        L_0x00e6:
            int r2 = r2 + 1
            goto L_0x0014
        L_0x00ea:
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
        L_0x00ed:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        L_0x00f4:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.auth.third.core.util.JSONUtils.toPOJOArray(org.json.JSONArray, java.lang.Class):java.lang.Object[]");
    }

    public static String[] toStringArray(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return new String[0];
        }
        String[] strArr = new String[jSONArray.length()];
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.optString(i);
        }
        return strArr;
    }
}
