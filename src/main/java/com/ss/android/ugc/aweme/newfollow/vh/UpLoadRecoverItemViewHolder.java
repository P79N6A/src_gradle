package com.ss.android.ugc.aweme.newfollow.vh;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class UpLoadRecoverItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57686a;

    /* renamed from: b  reason: collision with root package name */
    public FragmentActivity f57687b;
    @BindView(2131493831)
    public RemoteImageView mCoverImage;
    @BindView(2131494988)
    public ImageView mIvClose;
    @BindView(2131495130)
    public ImageView mIvRefresh;
    @BindView(2131498328)
    public ProgressBar mProgressBar;
    @BindView(2131498327)
    public TextView mTextView;

    public UpLoadRecoverItemViewHolder(View view, FragmentActivity fragmentActivity) {
        super(view);
        this.f57687b = fragmentActivity;
        ButterKnife.bind((Object) this, view);
    }
}
