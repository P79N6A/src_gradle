package com.ss.android.downloadlib.c;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.os.Build;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final b f28897a;

    static class a implements b {
        a() {
        }

        public final void a(SharedPreferences.Editor editor) {
            editor.commit();
        }
    }

    public interface b {
        void a(SharedPreferences.Editor editor);
    }

    static class c implements b {
        c() {
        }

        @TargetApi(9)
        public final void a(SharedPreferences.Editor editor) {
            editor.apply();
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 9) {
            f28897a = new c();
        } else {
            f28897a = new a();
        }
    }
}
