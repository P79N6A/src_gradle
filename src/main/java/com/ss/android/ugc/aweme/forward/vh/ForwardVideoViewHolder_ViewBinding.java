package com.ss.android.ugc.aweme.forward.vh;

import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPlayerProgressbar;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;

public class ForwardVideoViewHolder_ViewBinding extends BaseForwardViewHolder_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f48375b;

    /* renamed from: c  reason: collision with root package name */
    private ForwardVideoViewHolder f48376c;

    /* renamed from: d  reason: collision with root package name */
    private View f48377d;

    /* renamed from: e  reason: collision with root package name */
    private View f48378e;

    /* renamed from: f  reason: collision with root package name */
    private View f48379f;
    private View g;
    private View h;
    private View i;
    private View j;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f48375b, false, 45678, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48375b, false, 45678, new Class[0], Void.TYPE);
            return;
        }
        ForwardVideoViewHolder forwardVideoViewHolder = this.f48376c;
        if (forwardVideoViewHolder != null) {
            this.f48376c = null;
            forwardVideoViewHolder.mCoverView = null;
            forwardVideoViewHolder.mVideoLayout = null;
            forwardVideoViewHolder.mOriginDescView = null;
            forwardVideoViewHolder.mOriginHeader = null;
            forwardVideoViewHolder.mOriginRootView = null;
            forwardVideoViewHolder.mVideoView = null;
            forwardVideoViewHolder.mIvMusicIcon = null;
            forwardVideoViewHolder.mTvMusicOriginal = null;
            forwardVideoViewHolder.mMusicTitleView = null;
            forwardVideoViewHolder.mProgressbar = null;
            forwardVideoViewHolder.mIvLoading = null;
            forwardVideoViewHolder.mMusicLayout = null;
            forwardVideoViewHolder.mIvPlay = null;
            forwardVideoViewHolder.mIvPause = null;
            forwardVideoViewHolder.mDynamicStub = null;
            forwardVideoViewHolder.mInteractStickers = null;
            this.f48377d.setOnClickListener(null);
            this.f48377d = null;
            this.f48378e.setOnClickListener(null);
            this.f48378e = null;
            this.f48379f.setOnClickListener(null);
            this.f48379f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.j.setOnClickListener(null);
            this.j = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ForwardVideoViewHolder_ViewBinding(final ForwardVideoViewHolder forwardVideoViewHolder, View view) {
        super(forwardVideoViewHolder, view);
        this.f48376c = forwardVideoViewHolder;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.b08, "field 'mCoverView' and method 'onClickOriginContent'");
        forwardVideoViewHolder.mCoverView = (RemoteImageView) Utils.castView(findRequiredView, C0906R.id.b08, "field 'mCoverView'", RemoteImageView.class);
        this.f48377d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48380a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f48380a, false, 45679, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f48380a, false, 45679, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                forwardVideoViewHolder.onClickOriginContent(view2);
            }
        });
        forwardVideoViewHolder.mVideoLayout = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.baf, "field 'mVideoLayout'", ViewGroup.class);
        forwardVideoViewHolder.mOriginDescView = (MentionTextView) Utils.findRequiredViewAsType(view, C0906R.id.dft, "field 'mOriginDescView'", MentionTextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.b9j, "field 'mOriginHeader' and method 'onCheckDetail'");
        forwardVideoViewHolder.mOriginHeader = findRequiredView2;
        this.f48378e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48383a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f48383a, false, 45680, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f48383a, false, 45680, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                forwardVideoViewHolder.onCheckDetail();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.ci0, "field 'mOriginRootView' and method 'onClickOriginContent'");
        forwardVideoViewHolder.mOriginRootView = (ViewGroup) Utils.castView(findRequiredView3, C0906R.id.ci0, "field 'mOriginRootView'", ViewGroup.class);
        this.f48379f = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48386a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f48386a, false, 45681, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f48386a, false, 45681, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                forwardVideoViewHolder.onClickOriginContent(view2);
            }
        });
        forwardVideoViewHolder.mVideoView = (KeepSurfaceTextureView) Utils.findRequiredViewAsType(view, C0906R.id.d28, "field 'mVideoView'", KeepSurfaceTextureView.class);
        forwardVideoViewHolder.mIvMusicIcon = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.bof, "field 'mIvMusicIcon'", ImageView.class);
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.bol, "field 'mTvMusicOriginal' and method 'onClickOriginMusic'");
        forwardVideoViewHolder.mTvMusicOriginal = (TextView) Utils.castView(findRequiredView4, C0906R.id.bol, "field 'mTvMusicOriginal'", TextView.class);
        this.g = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48389a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f48389a, false, 45682, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f48389a, false, 45682, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                forwardVideoViewHolder.onClickOriginMusic(view2);
            }
        });
        forwardVideoViewHolder.mMusicTitleView = (MarqueeView) Utils.findRequiredViewAsType(view, C0906R.id.bov, "field 'mMusicTitleView'", MarqueeView.class);
        forwardVideoViewHolder.mProgressbar = (VideoPlayerProgressbar) Utils.findRequiredViewAsType(view, C0906R.id.dsn, "field 'mProgressbar'", VideoPlayerProgressbar.class);
        forwardVideoViewHolder.mIvLoading = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b2w, "field 'mIvLoading'", ImageView.class);
        forwardVideoViewHolder.mMusicLayout = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.b9e, "field 'mMusicLayout'", ViewGroup.class);
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.b43, "field 'mIvPlay' and method 'onClickPlayPause'");
        forwardVideoViewHolder.mIvPlay = (ImageView) Utils.castView(findRequiredView5, C0906R.id.b43, "field 'mIvPlay'", ImageView.class);
        this.h = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48392a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f48392a, false, 45683, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f48392a, false, 45683, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                forwardVideoViewHolder.onClickPlayPause();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, C0906R.id.b3s, "field 'mIvPause' and method 'onClickPlayPause'");
        forwardVideoViewHolder.mIvPause = (ImageView) Utils.castView(findRequiredView6, C0906R.id.b3s, "field 'mIvPause'", ImageView.class);
        this.i = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48395a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f48395a, false, 45684, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f48395a, false, 45684, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                forwardVideoViewHolder.onClickPlayPause();
            }
        });
        forwardVideoViewHolder.mDynamicStub = (ViewStub) Utils.findOptionalViewAsType(view, C0906R.id.cwi, "field 'mDynamicStub'", ViewStub.class);
        forwardVideoViewHolder.mInteractStickers = (ViewGroup) Utils.findOptionalViewAsType(view, C0906R.id.av6, "field 'mInteractStickers'", ViewGroup.class);
        View findRequiredView7 = Utils.findRequiredView(view, C0906R.id.b9f, "method 'onClickMusicTitle'");
        this.j = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48398a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f48398a, false, 45685, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f48398a, false, 45685, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                forwardVideoViewHolder.onClickMusicTitle(view2);
            }
        });
    }
}
