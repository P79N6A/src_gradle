package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import com.ss.android.ugc.aweme.C0906R;

public class CoverViewHolder_ViewBinding implements Unbinder {
    @CallSuper
    public void unbind() {
    }

    @UiThread
    @Deprecated
    public CoverViewHolder_ViewBinding(CoverViewHolder coverViewHolder, View view) {
        this(coverViewHolder, view.getContext());
    }

    @UiThread
    private CoverViewHolder_ViewBinding(CoverViewHolder coverViewHolder, Context context) {
        Resources resources = context.getResources();
        coverViewHolder.mWidth = resources.getDimensionPixelSize(C0906R.dimen.c0);
        coverViewHolder.mHeight = resources.getDimensionPixelSize(C0906R.dimen.bz);
    }
}
