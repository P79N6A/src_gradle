package com.ss.android.ugc.aweme.profile.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class ProfileCoverViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61277a;
    @BindView(2131494996)
    RemoteImageView mCoverImage;
    @BindView(2131494330)
    View mSelectBtn;
    @BindView(2131495151)
    ImageView mSelectedImage;
    @BindView(2131498212)
    TextView mUnselectedText;

    public ProfileCoverViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
    }
}
