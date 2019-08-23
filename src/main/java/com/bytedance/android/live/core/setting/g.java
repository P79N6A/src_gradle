package com.bytedance.android.live.core.setting;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.android.live.base.sp.TTLiveSettingUtil;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdkapi.host.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.utils.eq;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8166a;

    /* renamed from: b  reason: collision with root package name */
    static final SharedPreferences f8167b;

    /* renamed from: c  reason: collision with root package name */
    static Map<String, JSONObject> f8168c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    static Map<String, Map<String, Object>> f8169d = new HashMap();

    public static Context a() {
        if (PatchProxy.isSupport(new Object[0], null, f8166a, true, 911, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], null, f8166a, true, 911, new Class[0], Context.class);
        }
        return ((d) b.a(d.class)).a();
    }

    private static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f8166a, true, 909, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f8166a, true, 909, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return m.a();
    }

    static {
        SharedPreferences sharedPreferences;
        if (a() == null) {
            sharedPreferences = null;
        } else {
            sharedPreferences = c.a(a(), "ttlive_sdk_shared_pref_cache", 0);
        }
        f8167b = sharedPreferences;
        try {
            f8168c.put("key_ttlive_sdk_setting", new JSONObject(f8167b.getString("key_ttlive_sdk_setting", "")));
        } catch (Exception unused) {
            f8168c.put("key_ttlive_sdk_setting", new JSONObject());
        }
        try {
            f8168c.put("TT_APP_SETTING", new JSONObject(f8167b.getString("TT_APP_SETTING", "")));
        } catch (Exception unused2) {
            f8168c.put("TT_APP_SETTING", new JSONObject());
        }
        try {
            f8168c.put("TT_USER_SETTING", new JSONObject(f8167b.getString("TT_USER_SETTING", "")));
        } catch (Exception unused3) {
            f8168c.put("TT_USER_SETTING", new JSONObject());
        }
        TTLiveSettingUtil.update.subscribe(h.f8171b);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        f8169d.clear();
        f8169d.put("key_ttlive_sdk_setting", hashMap);
        f8169d.put("TT_APP_SETTING", hashMap2);
        f8169d.put("TT_USER_SETTING", hashMap3);
    }

    @Nullable
    public static String a(String str, l lVar) {
        String str2 = str;
        l lVar2 = lVar;
        if (PatchProxy.isSupport(new Object[]{str2, lVar2}, null, f8166a, true, 913, new Class[]{String.class, l.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, lVar2}, null, f8166a, true, 913, new Class[]{String.class, l.class}, String.class);
        }
        if (f8168c.containsKey(str2) && !f8168c.get(str2).isNull(lVar2.f8181b)) {
            try {
                return String.valueOf(f8168c.get(str2).get(lVar2.f8181b));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static boolean a(l lVar, String str) {
        l lVar2 = lVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{lVar2, str2}, null, f8166a, true, 912, new Class[]{l.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{lVar2, str2}, null, f8166a, true, 912, new Class[]{l.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        if (str2 != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (lVar2.f8185f == Boolean.class) {
                        f8167b.edit().putBoolean(lVar2.f8181b, Boolean.valueOf(Boolean.parseBoolean(str)).booleanValue()).apply();
                    } else if (lVar2.f8185f == Integer.class) {
                        f8167b.edit().putInt(lVar2.f8181b, Integer.parseInt(str)).apply();
                    } else if (lVar2.f8185f == Long.class) {
                        f8167b.edit().putLong(lVar2.f8181b, Long.parseLong(str)).apply();
                    } else if (lVar2.f8185f == Float.class) {
                        f8167b.edit().putFloat(lVar2.f8181b, Float.parseFloat(str)).apply();
                    } else if (lVar2.f8185f == Double.class) {
                        f8167b.edit().putString(lVar2.f8181b, String.valueOf((double) Long.parseLong(str))).apply();
                    } else if (lVar2.f8185f == String.class) {
                        f8167b.edit().putString(lVar2.f8181b, str2).apply();
                    } else {
                        f8167b.edit().putString(lVar2.f8181b, str2).apply();
                        f8169d.remove(lVar2.f8181b);
                    }
                    return true;
                }
            } catch (NumberFormatException unused) {
                Toast makeText = Toast.makeText(a(), String.format(Locale.US, "Illegal value of %s : %s", new Object[]{lVar2.f8181b, String.valueOf(str)}), 0);
                if (PatchProxy.isSupport(new Object[]{makeText}, null, i.f8172a, true, 916, new Class[]{Toast.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{makeText}, null, i.f8172a, true, 916, new Class[]{Toast.class}, Void.TYPE);
                } else {
                    if (Build.VERSION.SDK_INT == 25) {
                        eq.a(makeText);
                    }
                    makeText.show();
                }
                return false;
            }
        }
        f8167b.edit().remove(lVar2.f8181b).apply();
        f8169d.remove(lVar2.f8181b);
        return true;
    }

    private static double a(String str, String str2, double d2) {
        String str3 = str;
        String str4 = str2;
        double d3 = d2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Double.valueOf(d2)}, null, f8166a, true, 905, new Class[]{String.class, String.class, Double.TYPE}, Double.TYPE)) {
            return ((Double) PatchProxy.accessDispatch(new Object[]{str3, str4, Double.valueOf(d2)}, null, f8166a, true, 905, new Class[]{String.class, String.class, Double.TYPE}, Double.TYPE)).doubleValue();
        } else if (b() && f8167b.contains(str4)) {
            try {
                return Double.parseDouble(f8167b.getString(str4, String.valueOf(d2)));
            } catch (Exception unused) {
                return d3;
            }
        } else if (f8168c.get(str3) == null) {
            return d3;
        } else {
            return f8168c.get(str3).optDouble(str4, d3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008b, code lost:
        if (r0.getInt(r1) != 0) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008d, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008e, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008f, code lost:
        return r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0087 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.lang.String r21, java.lang.String r22, boolean r23) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            java.lang.Byte r5 = java.lang.Byte.valueOf(r23)
            r13 = 2
            r4[r13] = r5
            com.meituan.robust.ChangeQuickRedirect r6 = f8166a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = 0
            r7 = 1
            r8 = 900(0x384, float:1.261E-42)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0062
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            java.lang.Byte r0 = java.lang.Byte.valueOf(r23)
            r14[r13] = r0
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f8166a
            r17 = 1
            r18 = 900(0x384, float:1.261E-42)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Boolean.TYPE
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0062:
            boolean r3 = b()
            if (r3 == 0) goto L_0x0077
            android.content.SharedPreferences r3 = f8167b
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x0077
            android.content.SharedPreferences r0 = f8167b
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
        L_0x0077:
            java.util.Map<java.lang.String, org.json.JSONObject> r3 = f8168c
            java.lang.Object r0 = r3.get(r0)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 != 0) goto L_0x0082
            return r2
        L_0x0082:
            boolean r3 = r0.getBoolean(r1)     // Catch:{ JSONException -> 0x0087 }
            return r3
        L_0x0087:
            int r0 = r0.getInt(r1)     // Catch:{ JSONException -> 0x008f }
            if (r0 == 0) goto L_0x008e
            r11 = 1
        L_0x008e:
            return r11
        L_0x008f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.setting.g.a(java.lang.String, java.lang.String, boolean):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:4|5|(1:7)|8|(3:10|11|12)|13|14|(1:16)(1:17)|18|(1:22)|23|(2:25|26)(2:27|28)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0092 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009a A[Catch:{ Exception -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009d A[Catch:{ Exception -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c9 A[Catch:{ Exception -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d5 A[Catch:{ Exception -> 0x00e1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T b(java.lang.String r22, java.lang.String r23, java.lang.reflect.Type r24, T r25) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = 4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            r14 = 3
            r4[r14] = r25
            com.meituan.robust.ChangeQuickRedirect r6 = f8166a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<java.lang.reflect.Type> r5 = java.lang.reflect.Type.class
            r9[r13] = r5
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r9[r14] = r5
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            r5 = 0
            r7 = 1
            r8 = 906(0x38a, float:1.27E-42)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0065
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r11] = r0
            r4[r12] = r1
            r4[r13] = r2
            r4[r14] = r25
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = f8166a
            r18 = 1
            r19 = 906(0x38a, float:1.27E-42)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.lang.reflect.Type> r1 = java.lang.reflect.Type.class
            r0[r13] = r1
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r0[r14] = r1
            java.lang.Class<java.lang.Object> r21 = java.lang.Object.class
            r15 = r4
            r20 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x0065:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r3 = f8169d     // Catch:{ Exception -> 0x00e1 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ Exception -> 0x00e1 }
            if (r3 != 0) goto L_0x0077
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r3 = f8169d     // Catch:{ Exception -> 0x00e1 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ Exception -> 0x00e1 }
            r4.<init>()     // Catch:{ Exception -> 0x00e1 }
            r3.put(r0, r4)     // Catch:{ Exception -> 0x00e1 }
        L_0x0077:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r3 = f8169d     // Catch:{ Exception -> 0x00e1 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ Exception -> 0x00e1 }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ Exception -> 0x00e1 }
            boolean r3 = r3.containsKey(r1)     // Catch:{ Exception -> 0x00e1 }
            if (r3 == 0) goto L_0x0092
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r3 = f8169d     // Catch:{ Exception -> 0x0092 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ Exception -> 0x0092 }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ Exception -> 0x0092 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ Exception -> 0x0092 }
            return r3
        L_0x0092:
            java.util.Map<java.lang.String, org.json.JSONObject> r3 = f8168c     // Catch:{ Exception -> 0x00e1 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ Exception -> 0x00e1 }
            if (r3 != 0) goto L_0x009d
            java.lang.String r3 = ""
            goto L_0x00ab
        L_0x009d:
            java.util.Map<java.lang.String, org.json.JSONObject> r3 = f8168c     // Catch:{ Exception -> 0x00e1 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ Exception -> 0x00e1 }
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r4 = ""
            java.lang.String r3 = r3.optString(r1, r4)     // Catch:{ Exception -> 0x00e1 }
        L_0x00ab:
            boolean r4 = b()     // Catch:{ Exception -> 0x00e1 }
            if (r4 == 0) goto L_0x00bf
            android.content.SharedPreferences r4 = f8167b     // Catch:{ Exception -> 0x00e1 }
            boolean r4 = r4.contains(r1)     // Catch:{ Exception -> 0x00e1 }
            if (r4 == 0) goto L_0x00bf
            android.content.SharedPreferences r4 = f8167b     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r3 = r4.getString(r1, r3)     // Catch:{ Exception -> 0x00e1 }
        L_0x00bf:
            com.google.gson.Gson r4 = com.bytedance.android.live.core.setting.m.c()     // Catch:{ Exception -> 0x00e1 }
            java.lang.Object r2 = r4.fromJson((java.lang.String) r3, (java.lang.reflect.Type) r2)     // Catch:{ Exception -> 0x00e1 }
            if (r2 != 0) goto L_0x00d5
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r2 = f8169d     // Catch:{ Exception -> 0x00e1 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ Exception -> 0x00e1 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ Exception -> 0x00e1 }
            r2.remove(r1)     // Catch:{ Exception -> 0x00e1 }
            return r25
        L_0x00d5:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r3 = f8169d     // Catch:{ Exception -> 0x00e1 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ Exception -> 0x00e1 }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ Exception -> 0x00e1 }
            r3.put(r1, r2)     // Catch:{ Exception -> 0x00e1 }
            return r2
        L_0x00e1:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r2 = f8169d
            java.lang.Object r2 = r2.get(r0)
            if (r2 == 0) goto L_0x00f5
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r2 = f8169d
            java.lang.Object r0 = r2.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            r0.remove(r1)
        L_0x00f5:
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.setting.g.b(java.lang.String, java.lang.String, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    public static <T> T a(String str, String str2, Type type, T t) {
        String str3 = str;
        String str4 = str2;
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{str3, str4, type2, t}, null, f8166a, true, 908, new Class[]{String.class, String.class, Type.class, Object.class}, Object.class)) {
            Object[] objArr = {str3, str4, type2, t};
            return PatchProxy.accessDispatch(objArr, null, f8166a, true, 908, new Class[]{String.class, String.class, Type.class, Object.class}, Object.class);
        } else if (type2 == Boolean.class) {
            return Boolean.valueOf(a(str3, str4, ((Boolean) t).booleanValue()));
        } else {
            if (type2 == Integer.class || type2 == Short.class) {
                int intValue = ((Integer) t).intValue();
                if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(intValue)}, null, f8166a, true, 901, new Class[]{String.class, String.class, Integer.TYPE}, Integer.TYPE)) {
                    intValue = ((Integer) PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(intValue)}, null, f8166a, true, 901, new Class[]{String.class, String.class, Integer.TYPE}, Integer.TYPE)).intValue();
                } else if (b() && f8167b.contains(str4)) {
                    intValue = f8167b.getInt(str4, intValue);
                } else if (f8168c.get(str3) != null) {
                    intValue = f8168c.get(str3).optInt(str4, intValue);
                }
                return Integer.valueOf(intValue);
            } else if (type2 == Float.class) {
                float floatValue = ((Float) t).floatValue();
                if (PatchProxy.isSupport(new Object[]{str3, str4, Float.valueOf(floatValue)}, null, f8166a, true, 904, new Class[]{String.class, String.class, Float.TYPE}, Float.TYPE)) {
                    floatValue = ((Float) PatchProxy.accessDispatch(new Object[]{str3, str4, Float.valueOf(floatValue)}, null, f8166a, true, 904, new Class[]{String.class, String.class, Float.TYPE}, Float.TYPE)).floatValue();
                } else if (b() && f8167b.contains(str4)) {
                    floatValue = f8167b.getFloat(str4, floatValue);
                } else if (f8168c.get(str3) != null) {
                    floatValue = (float) f8168c.get(str3).optDouble(str4, (double) floatValue);
                }
                return Float.valueOf(floatValue);
            } else if (type2 == Long.class) {
                long longValue = ((Long) t).longValue();
                if (PatchProxy.isSupport(new Object[]{str3, str4, new Long(longValue)}, null, f8166a, true, 902, new Class[]{String.class, String.class, Long.TYPE}, Long.TYPE)) {
                    longValue = ((Long) PatchProxy.accessDispatch(new Object[]{str3, str4, new Long(longValue)}, null, f8166a, true, 902, new Class[]{String.class, String.class, Long.TYPE}, Long.TYPE)).longValue();
                } else if (b() && f8167b.contains(str4)) {
                    longValue = f8167b.getLong(str4, longValue);
                } else if (f8168c.get(str3) != null) {
                    longValue = f8168c.get(str3).optLong(str4, longValue);
                }
                return Long.valueOf(longValue);
            } else if (type2 == Double.class) {
                return Double.valueOf(a(str3, str4, ((Double) t).doubleValue()));
            } else {
                if (type2 != String.class) {
                    return b(str, str2, type, t);
                }
                T t2 = (String) t;
                if (PatchProxy.isSupport(new Object[]{str3, str4, t2}, null, f8166a, true, 903, new Class[]{String.class, String.class, String.class}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{str3, str4, t2}, null, f8166a, true, 903, new Class[]{String.class, String.class, String.class}, String.class);
                } else if (b() && f8167b.contains(str4)) {
                    return f8167b.getString(str4, t2);
                } else {
                    if (f8168c.get(str3) == null) {
                        return t2;
                    }
                    return f8168c.get(str3).optString(str4, t2);
                }
            }
        }
    }
}
