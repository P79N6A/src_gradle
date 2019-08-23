package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import android.content.Context;
import android.content.ServiceConnection;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.c;

public interface m {

    public interface a {
        void a();

        void a(boolean z);
    }

    ServiceConnection a(FragmentActivity fragmentActivity);

    Class<? extends FragmentActivity> a();

    String a(Context context);

    void a(Activity activity, View view, float f2, String... strArr);

    void a(Context context, int i);

    void a(Context context, a aVar);

    void a(Context context, @NonNull c cVar);

    void a(Context context, String str);

    void a(Fragment fragment, boolean z);

    void a(FragmentActivity fragmentActivity, String str);

    void a(String str);

    void a(String str, String str2);

    void a(String str, String str2, String str3);

    void a(boolean z);

    boolean a(long j);

    @NonNull
    Class<? extends FragmentActivity> b();

    int c();

    String d();

    String e();

    void f();

    boolean g();

    int h();

    int i();
}
