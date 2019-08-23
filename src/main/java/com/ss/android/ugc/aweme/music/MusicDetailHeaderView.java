package com.ss.android.ugc.aweme.music;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.Unbinder;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.music.ui.OriginalMusicEntryView;

public class MusicDetailHeaderView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56133a;

    /* renamed from: b  reason: collision with root package name */
    private Unbinder f56134b;
    @BindView(2131494082)
    Button btnEditMusicTitle;
    @BindView(2131495813)
    CheckableImageView ivMusicCollect;
    @BindView(2131496069)
    ImageView ivMusicianMark;
    @BindView(2131496065)
    OriginalMusicEntryView ivOriginalMusicEntryView;
    @BindView(2131495826)
    ImageView ivPlay;
    @BindView(2131495832)
    ImageView ivStop;
    @BindView(2131493263)
    RemoteImageView mBgCover;
    @BindView(2131494572)
    View mHeadLayout;
    @BindView(2131495566)
    View mMusicCollectLayout;
    @BindView(2131498010)
    TextView mMusicCollectionText;
    @BindView(2131495814)
    RemoteImageView mMusicCover;
    @BindView(2131495823)
    ViewGroup mMusicName;
    @BindView(2131495834)
    TextView mMusicTitle;
    @BindView(2131498339)
    TextView mMusicUsedCount;
    @BindView(2131495103)
    ImageView mMusicianEntry;
    @BindView(2131498026)
    TextView mNickName;
    @BindView(2131498051)
    TextView mPlaceHolder;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131497613)
    View mTitleLayout;
    @BindView(2131497461)
    RecyclerView recyclerTag;
    @BindView(2131493928)
    View tagLayout;
    @BindView(2131497459)
    View tagMask;
    @BindView(2131494096)
    TextView txtElse;

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f56133a, false, 59795, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56133a, false, 59795, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        if (this.f56134b != null) {
            this.f56134b.unbind();
        }
    }
}
