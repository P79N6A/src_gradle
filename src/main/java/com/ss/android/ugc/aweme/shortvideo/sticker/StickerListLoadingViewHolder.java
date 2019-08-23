package com.ss.android.ugc.aweme.shortvideo.sticker;

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
    public static ChangeQuickRedirect f69229a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f69230b;

    /* renamed from: c  reason: collision with root package name */
    public ObjectAnimator f69231c;

    public StickerListLoadingViewHolder(View view) {
        super(view);
        View findViewById = view.findViewById(C0906R.id.chu);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = UIUtils.getScreenWidth(view.getContext());
            findViewById.setLayoutParams(layoutParams);
        }
        this.f69230b = (ImageView) view.findViewById(C0906R.id.biy);
    }
}
