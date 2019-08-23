package com.airbnb.lottie;

import android.support.annotation.RestrictTo;
import android.support.v4.os.TraceCompat;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashSet;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f4801a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f4802b = false;

    /* renamed from: c  reason: collision with root package name */
    private static String[] f4803c;

    /* renamed from: d  reason: collision with root package name */
    private static long[] f4804d;

    /* renamed from: e  reason: collision with root package name */
    private static int f4805e = 0;

    /* renamed from: f  reason: collision with root package name */
    private static int f4806f = 0;

    public static void a(String str) {
        if (!f4801a.contains(str)) {
            f4801a.add(str);
        }
    }

    public static void b(String str) {
        if (f4802b) {
            if (f4805e == 20) {
                f4806f++;
                return;
            }
            f4803c[f4805e] = str;
            f4804d[f4805e] = System.nanoTime();
            TraceCompat.beginSection(str);
            f4805e++;
        }
    }

    public static float c(String str) {
        if (f4806f > 0) {
            f4806f--;
            return 0.0f;
        } else if (!f4802b) {
            return 0.0f;
        } else {
            int i = f4805e - 1;
            f4805e = i;
            if (i == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f4803c[f4805e])) {
                TraceCompat.endSection();
                return ((float) (System.nanoTime() - f4804d[f4805e])) / 1000000.0f;
            } else {
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f4803c[f4805e] + ClassUtils.PACKAGE_SEPARATOR);
            }
        }
    }
}
