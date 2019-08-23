package com.ss.android.ugc.aweme.newfollow.vh;

import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPlayerProgressbar;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;

public class FollowVideoViewHolder_ViewBinding extends BaseFollowViewHolder_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f57588b;

    /* renamed from: c  reason: collision with root package name */
    private FollowVideoViewHolder f57589c;

    /* renamed from: d  reason: collision with root package name */
    private View f57590d;

    /* renamed from: e  reason: collision with root package name */
    private View f57591e;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57588b, false, 62390, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57588b, false, 62390, new Class[0], Void.TYPE);
            return;
        }
        FollowVideoViewHolder followVideoViewHolder = this.f57589c;
        if (followVideoViewHolder != null) {
            this.f57589c = null;
            followVideoViewHolder.mVideoLayout = null;
            followVideoViewHolder.mVideoView = null;
            followVideoViewHolder.mIvMusicIcon = null;
            followVideoViewHolder.mTvMusicOriginal = null;
            followVideoViewHolder.mMusicTitleView = null;
            followVideoViewHolder.mMusicTitleLayout = null;
            followVideoViewHolder.mProgressbar = null;
            followVideoViewHolder.mIvLoading = null;
            followVideoViewHolder.mMusicLayout = null;
            followVideoViewHolder.mIvPlay = null;
            followVideoViewHolder.mIvPause = null;
            followVideoViewHolder.mDynamicStub = null;
            followVideoViewHolder.mInteractStickers = null;
            if (this.f57590d != null) {
                this.f57590d.setOnClickListener(null);
                this.f57590d = null;
            }
            if (this.f57591e != null) {
                this.f57591e.setOnClickListener(null);
                this.f57591e = null;
            }
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FollowVideoViewHolder_ViewBinding(final FollowVideoViewHolder followVideoViewHolder, View view) {
        super(followVideoViewHolder, view);
        this.f57589c = followVideoViewHolder;
        followVideoViewHolder.mVideoLayout = (FrameLayout) Utils.findOptionalViewAsType(view, C0906R.id.baf, "field 'mVideoLayout'", FrameLayout.class);
        followVideoViewHolder.mVideoView = (KeepSurfaceTextureView) Utils.findOptionalViewAsType(view, C0906R.id.d28, "field 'mVideoView'", KeepSurfaceTextureView.class);
        followVideoViewHolder.mIvMusicIcon = (ImageView) Utils.findOptionalViewAsType(view, C0906R.id.bof, "field 'mIvMusicIcon'", ImageView.class);
        followVideoViewHolder.mTvMusicOriginal = (TextView) Utils.findOptionalViewAsType(view, C0906R.id.bol, "field 'mTvMusicOriginal'", TextView.class);
        followVideoViewHolder.mMusicTitleView = (MarqueeView) Utils.findOptionalViewAsType(view, C0906R.id.bov, "field 'mMusicTitleView'", MarqueeView.class);
        followVideoViewHolder.mMusicTitleLayout = (ViewGroup) Utils.findOptionalViewAsType(view, C0906R.id.b9f, "field 'mMusicTitleLayout'", ViewGroup.class);
        followVideoViewHolder.mProgressbar = (VideoPlayerProgressbar) Utils.findOptionalViewAsType(view, C0906R.id.dsn, "field 'mProgressbar'", VideoPlayerProgressbar.class);
        followVideoViewHolder.mIvLoading = (ImageView) Utils.findOptionalViewAsType(view, C0906R.id.b2w, "field 'mIvLoading'", ImageView.class);
        followVideoViewHolder.mMusicLayout = (ViewGroup) Utils.findOptionalViewAsType(view, C0906R.id.b9e, "field 'mMusicLayout'", ViewGroup.class);
        View findViewById = view.findViewById(C0906R.id.b43);
        followVideoViewHolder.mIvPlay = (ImageView) Utils.castView(findViewById, C0906R.id.b43, "field 'mIvPlay'", ImageView.class);
        if (findViewById != null) {
            this.f57590d = findViewById;
            findViewById.setOnClickListener(new DebouncingOnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57592a;

                public final void doClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f57592a, false, 62391, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f57592a, false, 62391, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    followVideoViewHolder.onClickPlayPause();
                }
            });
        }
        View findViewById2 = view.findViewById(C0906R.id.b3s);
        followVideoViewHolder.mIvPause = (ImageView) Utils.castView(findViewById2, C0906R.id.b3s, "field 'mIvPause'", ImageView.class);
        if (findViewById2 != null) {
            this.f57591e = findViewById2;
            findViewById2.setOnClickListener(new DebouncingOnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57595a;

                public final void doClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f57595a, false, 62392, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f57595a, false, 62392, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    followVideoViewHolder.onClickPlayPause();
                }
            });
        }
        followVideoViewHolder.mDynamicStub = (ViewStub) Utils.findOptionalViewAsType(view, C0906R.id.cwi, "field 'mDynamicStub'", ViewStub.class);
        followVideoViewHolder.mInteractStickers = (ViewGroup) Utils.findOptionalViewAsType(view, C0906R.id.av6, "field 'mInteractStickers'", ViewGroup.class);
    }
}
