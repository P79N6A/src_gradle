package com.ss.android.agilelogger.f;

import android.annotation.SuppressLint;
import android.os.Build;

public class g {

    /* renamed from: a  reason: collision with root package name */
    static final g f27921a = b();

    static class a extends g {
        a() {
        }

        /* access modifiers changed from: package-private */
        public final String a() {
            if (Build.VERSION.SDK_INT < 19) {
                return "\n";
            }
            return System.lineSeparator();
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    public String a() {
        return System.lineSeparator();
    }

    private static g b() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new a();
            }
        } catch (ClassNotFoundException unused) {
        }
        return new g();
    }
}
