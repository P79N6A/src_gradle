package com.ss.android.ugc.aweme.filter;

import android.animation.ObjectAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.C0906R;

public class FilterListLoadingViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47418a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f47419b;

    /* renamed from: c  reason: collision with root package name */
    ObjectAnimator f47420c;

    FilterListLoadingViewHolder(View view) {
        super(view);
        View findViewById = view.findViewById(C0906R.id.chu);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = UIUtils.getScreenWidth(view.getContext());
            findViewById.setLayoutParams(layoutParams);
        }
        this.f47419b = (ImageView) view.findViewById(C0906R.id.biy);
    }
}
