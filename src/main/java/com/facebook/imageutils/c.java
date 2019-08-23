package com.facebook.imageutils;

import android.support.annotation.Nullable;
import com.facebook.common.logging.FLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static Class f24230a;

    /* renamed from: b  reason: collision with root package name */
    private static Class f24231b;

    /* renamed from: c  reason: collision with root package name */
    private static com.facebook.b.c f24232c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f24233d;

    static {
        try {
            f24230a = Class.forName("com.ixigua.image.heif.Heif");
            f24231b = Class.forName("com.bytedance.fresco.heif.HeifDecoder");
        } catch (ClassNotFoundException e2) {
            FLog.e("HeifFormatUtil", "Heif init ", (Throwable) e2);
        }
    }

    @Nullable
    public static com.facebook.b.c a() {
        if (f24232c != null) {
            return f24232c;
        }
        if (f24231b == null) {
            return null;
        }
        try {
            f24232c = (com.facebook.b.c) f24231b.getDeclaredField("HEIF_FORMAT").get(null);
        } catch (NoSuchFieldException e2) {
            FLog.e("HeifFormatUtil", "HeifFormat init ", (Throwable) e2);
        } catch (IllegalAccessException e3) {
            FLog.e("HeifFormatUtil", "HeifFormat init ", (Throwable) e3);
        } catch (Exception unused) {
        }
        return f24232c;
    }

    public static int[] a(byte[] bArr, int i) {
        if (f24230a == null) {
            return null;
        }
        try {
            if (f24233d == null) {
                f24233d = f24230a.getDeclaredMethod("parseMeta", new Class[]{byte[].class, Integer.TYPE});
            }
            if (f24233d != null) {
                f24233d.setAccessible(true);
                return (int[]) f24233d.invoke(null, new Object[]{bArr, Integer.valueOf(i)});
            }
        } catch (Exception | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return null;
    }
}
