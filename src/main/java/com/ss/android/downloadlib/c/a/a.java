package com.ss.android.downloadlib.c.a;

import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.os.Build;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final C0345a f28872a;

    /* renamed from: com.ss.android.downloadlib.c.a.a$a  reason: collision with other inner class name */
    static class C0345a {
        private C0345a() {
        }

        /* synthetic */ C0345a(byte b2) {
            this();
        }

        public <T> void a(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
            try {
                asyncTask.execute(tArr);
            } catch (Throwable unused) {
            }
        }
    }

    @TargetApi(11)
    static class b extends C0345a {
        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final <T> void a(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
            try {
                asyncTask.executeOnExecutor(c.f28877c, tArr);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f28872a = new b((byte) 0);
        } else {
            f28872a = new C0345a((byte) 0);
        }
    }

    public static <T> void a(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
        f28872a.a(asyncTask, tArr);
    }
}
