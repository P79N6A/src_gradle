package com.ss.android.ugc.aweme.detail.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AudioControlView;
import com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPlayerProgressbar;

public class DetailPageFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41353a;

    /* renamed from: b  reason: collision with root package name */
    private DetailPageFragment f41354b;

    /* renamed from: c  reason: collision with root package name */
    private View f41355c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41353a, false, 35164, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41353a, false, 35164, new Class[0], Void.TYPE);
            return;
        }
        DetailPageFragment detailPageFragment = this.f41354b;
        if (detailPageFragment != null) {
            this.f41354b = null;
            detailPageFragment.mDisLikeAwemeLayout = null;
            detailPageFragment.mTopBarLayout = null;
            detailPageFragment.mVolumeBtnStub = null;
            detailPageFragment.mBackView = null;
            detailPageFragment.mLayout = null;
            detailPageFragment.mLoadMoreLayout = null;
            detailPageFragment.mRefreshLayout = null;
            detailPageFragment.mLlHorizontalContainer = null;
            detailPageFragment.mAudioControlView = null;
            detailPageFragment.mVideoPlayerProgressbar = null;
            detailPageFragment.mPrivateAccountTipStub = null;
            detailPageFragment.mSearchImageView = null;
            this.f41355c.setOnClickListener(null);
            this.f41355c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public DetailPageFragment_ViewBinding(final DetailPageFragment detailPageFragment, View view) {
        this.f41354b = detailPageFragment;
        detailPageFragment.mDisLikeAwemeLayout = (DisLikeAwemeLayout) Utils.findRequiredViewAsType(view, C0906R.id.a5m, "field 'mDisLikeAwemeLayout'", DisLikeAwemeLayout.class);
        detailPageFragment.mTopBarLayout = Utils.findRequiredView(view, C0906R.id.aie, "field 'mTopBarLayout'");
        detailPageFragment.mVolumeBtnStub = (ViewStub) Utils.findRequiredViewAsType(view, C0906R.id.aif, "field 'mVolumeBtnStub'", ViewStub.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ix, "field 'mBackView' and method 'back'");
        detailPageFragment.mBackView = findRequiredView;
        this.f41355c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41356a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f41356a, false, 35165, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f41356a, false, 35165, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                detailPageFragment.back();
            }
        });
        detailPageFragment.mLayout = Utils.findRequiredView(view, C0906R.id.chy, "field 'mLayout'");
        detailPageFragment.mLoadMoreLayout = (LoadMoreFrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.bjm, "field 'mLoadMoreLayout'", LoadMoreFrameLayout.class);
        detailPageFragment.mRefreshLayout = (FeedSwipeRefreshLayout) Utils.findRequiredViewAsType(view, C0906R.id.ccw, "field 'mRefreshLayout'", FeedSwipeRefreshLayout.class);
        detailPageFragment.mLlHorizontalContainer = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.bgw, "field 'mLlHorizontalContainer'", LinearLayout.class);
        detailPageFragment.mAudioControlView = (AudioControlView) Utils.findRequiredViewAsType(view, C0906R.id.gk, "field 'mAudioControlView'", AudioControlView.class);
        detailPageFragment.mVideoPlayerProgressbar = (VideoPlayerProgressbar) Utils.findRequiredViewAsType(view, C0906R.id.dsn, "field 'mVideoPlayerProgressbar'", VideoPlayerProgressbar.class);
        detailPageFragment.mPrivateAccountTipStub = (ViewStub) Utils.findRequiredViewAsType(view, C0906R.id.cx1, "field 'mPrivateAccountTipStub'", ViewStub.class);
        detailPageFragment.mSearchImageView = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b4s, "field 'mSearchImageView'", ImageView.class);
    }
}
