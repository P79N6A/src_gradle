package com.ss.android.ugc.aweme.base.mvvm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.base.mvvm.e;

public interface d<K extends e> extends c<K> {
    d create(Context context, ViewGroup viewGroup);

    View getAndroidView();
}
