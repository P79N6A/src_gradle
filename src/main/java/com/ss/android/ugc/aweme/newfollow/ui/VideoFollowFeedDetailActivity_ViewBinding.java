package com.ss.android.ugc.aweme.newfollow.ui;

import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.widget.MarqueeView;

public class VideoFollowFeedDetailActivity_ViewBinding extends AbsFollowFeedDetailActivity_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f57293b;

    /* renamed from: c  reason: collision with root package name */
    private VideoFollowFeedDetailActivity f57294c;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57293b, false, 61749, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57293b, false, 61749, new Class[0], Void.TYPE);
            return;
        }
        VideoFollowFeedDetailActivity videoFollowFeedDetailActivity = this.f57294c;
        if (videoFollowFeedDetailActivity != null) {
            this.f57294c = null;
            videoFollowFeedDetailActivity.mIvMusicIcon = null;
            videoFollowFeedDetailActivity.mTvMusicOriginal = null;
            videoFollowFeedDetailActivity.mMusicTitleLayout = null;
            videoFollowFeedDetailActivity.mMusicTitleView = null;
            videoFollowFeedDetailActivity.mMusicLayout = null;
            videoFollowFeedDetailActivity.mLoadingView = null;
            videoFollowFeedDetailActivity.mIvPlay = null;
            videoFollowFeedDetailActivity.mIvPause = null;
            videoFollowFeedDetailActivity.mPlayStatusLayout = null;
            videoFollowFeedDetailActivity.mInteractStickers = null;
            videoFollowFeedDetailActivity.mAdDownloadButton = null;
            videoFollowFeedDetailActivity.mAdDownloadButtonPercent = null;
            videoFollowFeedDetailActivity.mAdDownloadButtonSize = null;
            videoFollowFeedDetailActivity.mAdDownloadButtonDetail = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public VideoFollowFeedDetailActivity_ViewBinding(VideoFollowFeedDetailActivity videoFollowFeedDetailActivity, View view) {
        super(videoFollowFeedDetailActivity, view);
        this.f57294c = videoFollowFeedDetailActivity;
        videoFollowFeedDetailActivity.mIvMusicIcon = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.bof, "field 'mIvMusicIcon'", ImageView.class);
        videoFollowFeedDetailActivity.mTvMusicOriginal = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bol, "field 'mTvMusicOriginal'", TextView.class);
        videoFollowFeedDetailActivity.mMusicTitleLayout = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.b9f, "field 'mMusicTitleLayout'", ViewGroup.class);
        videoFollowFeedDetailActivity.mMusicTitleView = (MarqueeView) Utils.findRequiredViewAsType(view, C0906R.id.bov, "field 'mMusicTitleView'", MarqueeView.class);
        videoFollowFeedDetailActivity.mMusicLayout = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.b9e, "field 'mMusicLayout'", ViewGroup.class);
        videoFollowFeedDetailActivity.mLoadingView = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b2w, "field 'mLoadingView'", ImageView.class);
        videoFollowFeedDetailActivity.mIvPlay = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b43, "field 'mIvPlay'", ImageView.class);
        videoFollowFeedDetailActivity.mIvPause = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b3s, "field 'mIvPause'", ImageView.class);
        videoFollowFeedDetailActivity.mPlayStatusLayout = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.b9t, "field 'mPlayStatusLayout'", ViewGroup.class);
        videoFollowFeedDetailActivity.mInteractStickers = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.av6, "field 'mInteractStickers'", ViewGroup.class);
        videoFollowFeedDetailActivity.mAdDownloadButton = (ViewGroup) Utils.findOptionalViewAsType(view, C0906R.id.bu, "field 'mAdDownloadButton'", ViewGroup.class);
        videoFollowFeedDetailActivity.mAdDownloadButtonPercent = (TextView) Utils.findOptionalViewAsType(view, C0906R.id.bje, "field 'mAdDownloadButtonPercent'", TextView.class);
        videoFollowFeedDetailActivity.mAdDownloadButtonSize = (TextView) Utils.findOptionalViewAsType(view, C0906R.id.bjg, "field 'mAdDownloadButtonSize'", TextView.class);
        videoFollowFeedDetailActivity.mAdDownloadButtonDetail = (ImageView) Utils.findOptionalViewAsType(view, C0906R.id.a76, "field 'mAdDownloadButtonDetail'", ImageView.class);
    }
}
