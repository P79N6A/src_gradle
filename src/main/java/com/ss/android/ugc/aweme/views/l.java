package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public interface l<T extends PagerAdapter> {
    View a(Context context);

    View a(Context context, int i);

    View a(Context context, ViewGroup viewGroup, T t, int i, int i2, View.OnClickListener onClickListener);

    int b(Context context);
}
