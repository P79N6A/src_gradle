package com.ss.android.ugc.aweme.port.in;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.ColorInt;
import android.support.v4.app.Fragment;
import android.view.View;

public interface am {

    public interface a {
        void a();

        void a(float f2);

        void a(int i);

        void a(int i, int i2, Intent intent);

        void a(int i, b bVar);

        void a(int i, boolean z);

        void a(Fragment fragment);

        void a(String str);

        void a(boolean z);

        String b();

        void b(@ColorInt int i);

        int c();

        void c(int i);

        View d();
    }

    public interface b {
        boolean a(View view);
    }

    a a(Context context);
}
