package com.bytedance.android.livesdkapi.host;

import android.content.Context;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.android.live.base.b;

public interface i extends b {

    public interface a {
        void a(String str);

        void b(String str);
    }

    String a();

    void a(Context context, @NonNull com.bytedance.android.livesdkapi.j.a aVar, String str, a aVar2);

    boolean a(int i, Context context, @Nullable String str, String str2, ClassLoader classLoader);

    boolean a(String str);

    @MainThread
    void b(String str);
}
