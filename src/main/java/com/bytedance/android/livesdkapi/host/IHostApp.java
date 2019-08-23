package com.bytedance.android.livesdkapi.host;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.b;
import com.bytedance.android.livesdkapi.g.c;
import com.bytedance.android.livesdkapi.g.d;

public interface IHostApp extends b {

    public @interface ActivityType {
    }

    d a(Context context);

    Class a(@ActivityType int i);

    void a();

    void a(Activity activity);

    void a(Activity activity, String str, String str2, p pVar);

    void a(Context context, String str, int i);

    void a(FragmentActivity fragmentActivity, String str);

    void a(FragmentActivity fragmentActivity, String str, String str2);

    void a(@NonNull AppCompatActivity appCompatActivity, @NonNull FragmentManager fragmentManager, @NonNull String str, @NonNull FrameLayout frameLayout, @NonNull q qVar);

    void a(View view, String str, Bitmap.Config config);

    boolean a(Activity activity, String str);

    Typeface b(int i);

    void b(Context context, String str, int i);

    boolean b();

    void c();

    Class d();

    c e();

    @NonNull
    String f();
}
