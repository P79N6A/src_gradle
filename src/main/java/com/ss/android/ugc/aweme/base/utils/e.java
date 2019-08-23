package com.ss.android.ugc.aweme.base.utils;

import android.os.Build;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f35018a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f35019b;

    static {
        boolean z;
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        f35018a = z;
        if (Build.VERSION.SDK_INT >= 19) {
            z2 = true;
        }
        f35019b = z2;
    }
}
