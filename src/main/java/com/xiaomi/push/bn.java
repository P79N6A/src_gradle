package com.xiaomi.push;

import android.os.Build;
import java.lang.reflect.Field;

public class bn {

    /* renamed from: a  reason: collision with root package name */
    private static Class f81867a = null;

    /* renamed from: a  reason: collision with other field name */
    private static String f191a = "NLPBuild";

    /* renamed from: a  reason: collision with other field name */
    private static Field f192a;

    /* renamed from: a  reason: collision with other field name */
    private static boolean f193a;

    /* renamed from: b  reason: collision with root package name */
    private static String f81868b = Build.BRAND;

    /* renamed from: b  reason: collision with other field name */
    private static Field f194b;

    /* renamed from: c  reason: collision with root package name */
    private static String f81869c = Build.TYPE;

    /* renamed from: c  reason: collision with other field name */
    private static Field f195c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f81870d;

    static {
        boolean z = true;
        try {
            Class<?> cls = Class.forName("miui.os.Build");
            f81867a = cls;
            f192a = cls.getField("IS_CTA_BUILD");
            f194b = f81867a.getField("IS_ALPHA_BUILD");
            f195c = f81867a.getField("IS_DEVELOPMENT_VERSION");
            f81870d = f81867a.getField("IS_STABLE_VERSION");
            z = false;
        } catch (ClassNotFoundException | Exception | NoSuchFieldException unused) {
        }
        if (z) {
            f81867a = null;
            f192a = null;
            f194b = null;
            f195c = null;
            f81870d = null;
        }
    }

    public static String a() {
        return "3rdROM-" + f81869c;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m131a() {
        return f81868b != null && f81868b.equalsIgnoreCase("xiaomi");
    }

    public static boolean b() {
        if (!(!a() || f81867a == null || f194b == null)) {
            try {
                boolean z = f194b.getBoolean(f81867a);
                if (!f193a) {
                    return z;
                }
                new StringBuilder();
                return z;
            } catch (IllegalAccessException unused) {
            }
        }
        return false;
    }

    public static boolean c() {
        if (!(!a() || f81867a == null || f195c == null)) {
            try {
                boolean z = f195c.getBoolean(f81867a);
                if (!f193a) {
                    return z;
                }
                new StringBuilder();
                return z;
            } catch (IllegalAccessException unused) {
            }
        }
        return false;
    }

    public static boolean d() {
        if (!(!a() || f81867a == null || f81870d == null)) {
            try {
                boolean z = f81870d.getBoolean(f81867a);
                if (!f193a) {
                    return z;
                }
                new StringBuilder();
                return z;
            } catch (IllegalAccessException unused) {
            }
        }
        return false;
    }
}
