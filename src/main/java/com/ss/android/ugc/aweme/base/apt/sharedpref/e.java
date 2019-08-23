package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34572a;

    public static Object a(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, String str, String str2, Object[] objArr) {
        SharedPreferences.Editor editor;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{sharedPreferences, sharedPreferences2, str3, str4, objArr}, null, f34572a, true, 24150, new Class[]{SharedPreferences.class, SharedPreferences.class, String.class, String.class, Object[].class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{sharedPreferences, sharedPreferences2, str3, str4, objArr}, null, f34572a, true, 24150, new Class[]{SharedPreferences.class, SharedPreferences.class, String.class, String.class, Object[].class}, Object.class);
        }
        String str5 = objArr[0];
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        if (sharedPreferences == null) {
            editor = null;
        } else {
            editor = sharedPreferences.edit();
        }
        if (TextUtils.equals(str4, "java.lang.String")) {
            String str6 = str5;
            edit.putString(str3, str6);
            if (editor != null) {
                editor.putString(str3, str6);
            }
        } else if (TextUtils.equals(str4, "java.lang.Integer") || TextUtils.equals(str4, "int")) {
            Integer num = (Integer) str5;
            edit.putInt(str3, num.intValue());
            if (editor != null) {
                editor.putInt(str3, num.intValue());
            }
        } else if (TextUtils.equals(str4, "java.lang.Float") || TextUtils.equals(str4, "float")) {
            Float f2 = (Float) str5;
            edit.putFloat(str3, f2.floatValue());
            if (editor != null) {
                editor.putFloat(str3, f2.floatValue());
            }
        } else if (TextUtils.equals(str4, "java.lang.Long") || TextUtils.equals(str4, "long")) {
            Long l = (Long) str5;
            edit.putLong(str3, l.longValue());
            if (editor != null) {
                editor.putLong(str3, l.longValue());
            }
        } else if (TextUtils.equals(str4, "java.lang.Boolean") || TextUtils.equals(str4, "boolean")) {
            Boolean bool = (Boolean) str5;
            edit.putBoolean(str3, bool.booleanValue());
            if (editor != null) {
                editor.putBoolean(str3, bool.booleanValue());
            }
        } else {
            throw new IllegalArgumentException("Unexpected argument type: " + str4);
        }
        edit.apply();
        if (editor != null) {
            editor.apply();
        }
        return null;
    }

    public static Object a(SharedPreferences sharedPreferences, String str, SharedPreferences sharedPreferences2, String str2, String str3, String str4, Object[] objArr) {
        SharedPreferences sharedPreferences3 = sharedPreferences2;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{null, null, sharedPreferences3, str5, str6, str4, objArr}, null, f34572a, true, 24151, new Class[]{SharedPreferences.class, String.class, SharedPreferences.class, String.class, String.class, String.class, Object[].class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{null, null, sharedPreferences3, str5, str6, str4, objArr}, null, f34572a, true, 24151, new Class[]{SharedPreferences.class, String.class, SharedPreferences.class, String.class, String.class, String.class, Object[].class}, Object.class);
        }
        int i = objArr[0];
        if (TextUtils.equals(str6, "java.lang.String")) {
            return sharedPreferences3.getString(str5, (String) i);
        }
        if (TextUtils.equals(str6, "java.lang.Integer") || TextUtils.equals(str6, "int")) {
            if (i == null) {
                i = 0;
            }
            return Integer.valueOf(sharedPreferences3.getInt(str5, ((Integer) i).intValue()));
        } else if (TextUtils.equals(str6, "java.lang.Float") || TextUtils.equals(str6, "float")) {
            if (i == null) {
                i = Float.valueOf(0.0f);
            }
            return Float.valueOf(sharedPreferences3.getFloat(str5, ((Float) i).floatValue()));
        } else if (TextUtils.equals(str6, "java.lang.Long") || TextUtils.equals(str6, "long")) {
            if (i == null) {
                i = 0L;
            }
            return Long.valueOf(sharedPreferences3.getLong(str5, ((Long) i).longValue()));
        } else if (TextUtils.equals(str6, "java.lang.Boolean") || TextUtils.equals(str6, "boolean")) {
            if (i == null) {
                i = Boolean.FALSE;
            }
            return Boolean.valueOf(sharedPreferences3.getBoolean(str5, ((Boolean) i).booleanValue()));
        } else {
            throw new IllegalArgumentException("Unexpected argument type: " + str6);
        }
    }
}
