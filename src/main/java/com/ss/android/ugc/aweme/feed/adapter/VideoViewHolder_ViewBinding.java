package com.ss.android.ugc.aweme.feed.adapter;

import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.PoiCardWebPageContainer;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.feed.ui.DebugInfoView;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.setting.ui.RestrictTextView;

public class VideoViewHolder_ViewBinding extends BaseFeedViewHolder_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f44844b;

    /* renamed from: c  reason: collision with root package name */
    private VideoViewHolder f44845c;

    /* renamed from: d  reason: collision with root package name */
    private View f44846d;

    /* renamed from: e  reason: collision with root package name */
    private View f44847e;

    /* renamed from: f  reason: collision with root package name */
    private View f44848f;
    private View g;
    private View h;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f44844b, false, 40867, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44844b, false, 40867, new Class[0], Void.TYPE);
            return;
        }
        VideoViewHolder videoViewHolder = this.f44845c;
        if (videoViewHolder != null) {
            this.f44845c = null;
            videoViewHolder.poiCardWebPageContainer = null;
            videoViewHolder.mWidgetContainer = null;
            videoViewHolder.mCoverView = null;
            videoViewHolder.mHudView = null;
            videoViewHolder.mVideoTagContainer = null;
            videoViewHolder.mBottomView = null;
            videoViewHolder.mTitleView = null;
            videoViewHolder.mGradualBottomView = null;
            videoViewHolder.mRestrictTextView = null;
            videoViewHolder.tagLayout = null;
            videoViewHolder.mIvRelieveTag = null;
            videoViewHolder.feedReportVotell = null;
            videoViewHolder.feedReportWarnll = null;
            videoViewHolder.mAwemeInCheckLayout = null;
            videoViewHolder.llRightMenu = null;
            videoViewHolder.llAwemeIntro = null;
            videoViewHolder.mLongPressLayout = null;
            videoViewHolder.mRootView = null;
            videoViewHolder.mTxtProhibited = null;
            videoViewHolder.mVoteStatusTextView = null;
            videoViewHolder.mAllowDisplayBtn = null;
            videoViewHolder.mDisallowDisplayBtn = null;
            videoViewHolder.mAvatarLayout = null;
            videoViewHolder.mShareTipImageView = null;
            videoViewHolder.shareTipsRl = null;
            videoViewHolder.shareTipsTv = null;
            videoViewHolder.mXiguaTaskEveningIv = null;
            videoViewHolder.txtTTFeedback = null;
            videoViewHolder.flInteractLayout = null;
            videoViewHolder.mCornerTL = null;
            videoViewHolder.mCornerTR = null;
            videoViewHolder.mCornerBL = null;
            videoViewHolder.mCornerBR = null;
            videoViewHolder.mDebugInfoView = null;
            videoViewHolder.mPoiDistance = null;
            videoViewHolder.mPoiDistanceLayout = null;
            this.f44846d.setOnClickListener(null);
            this.f44846d = null;
            this.f44847e.setOnClickListener(null);
            this.f44847e = null;
            this.f44848f.setOnClickListener(null);
            this.f44848f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.h.setOnClickListener(null);
            this.h = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public VideoViewHolder_ViewBinding(final VideoViewHolder videoViewHolder, View view) {
        super(videoViewHolder, view);
        this.f44845c = videoViewHolder;
        videoViewHolder.poiCardWebPageContainer = (PoiCardWebPageContainer) Utils.findRequiredViewAsType(view, C0906R.id.bze, "field 'poiCardWebPageContainer'", PoiCardWebPageContainer.class);
        videoViewHolder.mWidgetContainer = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.dxn, "field 'mWidgetContainer'", RelativeLayout.class);
        videoViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.a1a, "field 'mCoverView'", RemoteImageView.class);
        videoViewHolder.mHudView = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.apf, "field 'mHudView'", FrameLayout.class);
        videoViewHolder.mVideoTagContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.dsz, "field 'mVideoTagContainer'", ViewGroup.class);
        videoViewHolder.mBottomView = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.m0, "field 'mBottomView'", FrameLayout.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.title, "field 'mTitleView' and method 'onClick'");
        videoViewHolder.mTitleView = (TextView) Utils.castView(findRequiredView, C0906R.id.title, "field 'mTitleView'", TextView.class);
        this.f44846d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44849a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f44849a, false, 40868, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f44849a, false, 40868, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                videoViewHolder.onClick(view2);
            }
        });
        videoViewHolder.mGradualBottomView = Utils.findRequiredView(view, C0906R.id.alf, "field 'mGradualBottomView'");
        videoViewHolder.mRestrictTextView = (RestrictTextView) Utils.findRequiredViewAsType(view, C0906R.id.dhh, "field 'mRestrictTextView'", RestrictTextView.class);
        videoViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, C0906R.id.dt0, "field 'tagLayout'", TagLayout.class);
        videoViewHolder.mIvRelieveTag = (AnimationImageView) Utils.findRequiredViewAsType(view, C0906R.id.dss, "field 'mIvRelieveTag'", AnimationImageView.class);
        videoViewHolder.feedReportVotell = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.acx, "field 'feedReportVotell'", LinearLayout.class);
        videoViewHolder.feedReportWarnll = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.acy, "field 'feedReportWarnll'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.il, "field 'mAwemeInCheckLayout' and method 'onClick'");
        videoViewHolder.mAwemeInCheckLayout = (ViewGroup) Utils.castView(findRequiredView2, C0906R.id.il, "field 'mAwemeInCheckLayout'", ViewGroup.class);
        this.f44847e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44852a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f44852a, false, 40869, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f44852a, false, 40869, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                videoViewHolder.onClick(view2);
            }
        });
        videoViewHolder.llRightMenu = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.ceq, "field 'llRightMenu'", LinearLayout.class);
        videoViewHolder.llAwemeIntro = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.im, "field 'llAwemeIntro'", ViewGroup.class);
        videoViewHolder.mLongPressLayout = (LongPressLayout) Utils.findRequiredViewAsType(view, C0906R.id.bkq, "field 'mLongPressLayout'", LongPressLayout.class);
        videoViewHolder.mRootView = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.duj, "field 'mRootView'", FrameLayout.class);
        videoViewHolder.mTxtProhibited = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.dnf, "field 'mTxtProhibited'", DmtTextView.class);
        videoViewHolder.mVoteStatusTextView = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.dll, "field 'mVoteStatusTextView'", DmtTextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.ej, "field 'mAllowDisplayBtn' and method 'onClick'");
        videoViewHolder.mAllowDisplayBtn = (DmtTextView) Utils.castView(findRequiredView3, C0906R.id.ej, "field 'mAllowDisplayBtn'", DmtTextView.class);
        this.f44848f = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44855a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f44855a, false, 40870, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f44855a, false, 40870, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                videoViewHolder.onClick(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.a5c, "field 'mDisallowDisplayBtn' and method 'onClick'");
        videoViewHolder.mDisallowDisplayBtn = (DmtTextView) Utils.castView(findRequiredView4, C0906R.id.a5c, "field 'mDisallowDisplayBtn'", DmtTextView.class);
        this.g = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44858a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f44858a, false, 40871, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f44858a, false, 40871, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                videoViewHolder.onClick(view2);
            }
        });
        videoViewHolder.mAvatarLayout = Utils.findRequiredView(view, C0906R.id.i5, "field 'mAvatarLayout'");
        videoViewHolder.mShareTipImageView = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b16, "field 'mShareTipImageView'", ImageView.class);
        videoViewHolder.shareTipsRl = Utils.findRequiredView(view, C0906R.id.cpc, "field 'shareTipsRl'");
        videoViewHolder.shareTipsTv = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.cpd, "field 'shareTipsTv'", DmtTextView.class);
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.dy4, "field 'mXiguaTaskEveningIv' and method 'onClick'");
        videoViewHolder.mXiguaTaskEveningIv = (RemoteImageView) Utils.castView(findRequiredView5, C0906R.id.dy4, "field 'mXiguaTaskEveningIv'", RemoteImageView.class);
        this.h = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44861a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f44861a, false, 40872, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f44861a, false, 40872, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                videoViewHolder.onClick(view2);
            }
        });
        videoViewHolder.txtTTFeedback = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.dno, "field 'txtTTFeedback'", DmtTextView.class);
        videoViewHolder.flInteractLayout = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.av6, "field 'flInteractLayout'", FrameLayout.class);
        videoViewHolder.mCornerTL = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.a04, "field 'mCornerTL'", ImageView.class);
        videoViewHolder.mCornerTR = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.a05, "field 'mCornerTR'", ImageView.class);
        videoViewHolder.mCornerBL = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.a00, "field 'mCornerBL'", ImageView.class);
        videoViewHolder.mCornerBR = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.a01, "field 'mCornerBR'", ImageView.class);
        videoViewHolder.mDebugInfoView = (DebugInfoView) Utils.findRequiredViewAsType(view, C0906R.id.a2p, "field 'mDebugInfoView'", DebugInfoView.class);
        videoViewHolder.mPoiDistance = (DmtTextView) Utils.findOptionalViewAsType(view, C0906R.id.c1g, "field 'mPoiDistance'", DmtTextView.class);
        videoViewHolder.mPoiDistanceLayout = view.findViewById(C0906R.id.c1h);
    }
}
