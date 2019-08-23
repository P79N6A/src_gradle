package com.ss.android.push.daemon;

import android.content.Context;
import android.os.Build;
import com.ss.android.push.daemon.a.b;
import com.ss.android.push.daemon.a.c;

public interface f {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static f f30428a;

        static f a() {
            if (f30428a != null) {
                return f30428a;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                f30428a = new com.ss.android.push.daemon.a.a();
            } else if (i >= 23) {
                f30428a = new c();
            } else {
                f30428a = new b();
            }
            return f30428a;
        }
    }

    void a();

    void a(Context context, b bVar);

    void b(Context context, b bVar);
}
