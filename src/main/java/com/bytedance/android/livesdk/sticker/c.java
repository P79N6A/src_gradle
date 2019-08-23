package com.bytedance.android.livesdk.sticker;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.host.q;

public interface c {
    void a();

    void a(@NonNull AppCompatActivity appCompatActivity, @NonNull FragmentManager fragmentManager, @NonNull String str, @NonNull FrameLayout frameLayout, @NonNull q qVar);

    boolean b();
}
