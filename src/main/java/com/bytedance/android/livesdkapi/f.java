package com.bytedance.android.livesdkapi;

import android.content.Context;
import android.support.v4.app.Fragment;
import java.util.HashMap;

public interface f {

    public interface a {
        void a();

        b b();
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Context f18760a;

        /* renamed from: b  reason: collision with root package name */
        public Fragment f18761b;

        /* renamed from: c  reason: collision with root package name */
        public HashMap<String, String> f18762c = new HashMap<>();

        public b(Context context, Fragment fragment) {
            this.f18760a = context;
            this.f18761b = fragment;
        }
    }

    void a(a aVar);
}
