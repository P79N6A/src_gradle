package com.facebook.imagepipeline.nativecode;

import android.os.Build;
import com.facebook.imageutils.b;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f2351a;

    public static synchronized void ensure() {
        synchronized (d.class) {
            if (!f2351a) {
                if (Build.VERSION.SDK_INT <= 16) {
                    try {
                        b.a("fb_jpegturbo");
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                b.a("static-webp");
                f2351a = true;
            }
        }
    }
}
