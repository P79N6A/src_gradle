package com.ss.android.ugc.aweme.port.internal;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.views.LiveButtonView;

public interface b {
    void a(int i, int i2, Intent intent);

    void a(Context context, LifecycleOwner lifecycleOwner, Fragment fragment);

    void a(ViewGroup viewGroup);

    void a(LiveButtonView.a aVar);

    void a(boolean z);

    void a(View... viewArr);

    boolean a();

    @Nullable
    View b();

    void b(ViewGroup viewGroup);

    @Nullable
    ImageView c();

    @Nullable
    View d();
}
