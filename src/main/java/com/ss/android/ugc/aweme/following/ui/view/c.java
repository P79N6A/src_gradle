package com.ss.android.ugc.aweme.following.ui.view;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.view.View;

public interface c {
    void a(int i, int i2);

    Context getContext();

    LifecycleOwner getLifeCycleOwner();

    void setFollowStatus(int i);

    void setOnClickListener(View.OnClickListener onClickListener);
}
