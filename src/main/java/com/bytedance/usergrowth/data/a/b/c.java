package com.bytedance.usergrowth.data.a.b;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.os.Build;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f2325a;

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

    /* renamed from: com.bytedance.usergrowth.data.a.b.c$c  reason: collision with other inner class name */
    static class C0017c implements b {
        C0017c() {
        }

        @TargetApi(9)
        public final void a(SharedPreferences.Editor editor) {
            editor.apply();
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 9) {
            f2325a = new C0017c();
        } else {
            f2325a = new a();
        }
    }
}
