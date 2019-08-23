package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.animation.ObjectAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.C0906R;

public class StickerListLoadingViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69643a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f69644b;

    /* renamed from: c  reason: collision with root package name */
    ObjectAnimator f69645c;

    public StickerListLoadingViewHolder(View view) {
        super(view);
        View findViewById = view.findViewById(C0906R.id.chu);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = UIUtils.getScreenWidth(view.getContext());
            findViewById.setLayoutParams(layoutParams);
        }
        this.f69644b = (ImageView) view.findViewById(C0906R.id.biy);
    }
}
