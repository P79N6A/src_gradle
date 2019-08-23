package com.ss.android.ugc.aweme.newfollow.vh;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;

public class UpLoadItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57680a;
    @BindView(2131493831)
    public ImageView mCoverImage;
    @BindView(2131498328)
    public ProgressBar mProgressBar;
    @BindView(2131498327)
    TextView mTextView;

    public UpLoadItemViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
    }
}
