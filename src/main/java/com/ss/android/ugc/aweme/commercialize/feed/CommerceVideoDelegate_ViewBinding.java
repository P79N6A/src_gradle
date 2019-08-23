package com.ss.android.ugc.aweme.commercialize.feed;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.CommerceTag;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.card.CommerceGoodHalfCardContainer;
import com.ss.android.ugc.aweme.commercialize.ad.AdRatingView;
import com.ss.android.ugc.aweme.commercialize.ad.AdTagGroup;
import com.ss.android.ugc.aweme.commercialize.ad.DescTextView;
import com.ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout;
import com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout;
import com.ss.android.ugc.aweme.commercialize.link.video.DouPlusTagLayout;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.ss.android.ugc.aweme.commercialize.views.BlackMaskLayer;
import com.ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView;
import com.ss.android.ugc.aweme.commercialize.views.CircleWaveLayout;
import com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.ss.android.ugc.aweme.commercialize.views.StripAdBottomLabelView;

public class CommerceVideoDelegate_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38715a;

    /* renamed from: b  reason: collision with root package name */
    private CommerceVideoDelegate f38716b;

    /* renamed from: c  reason: collision with root package name */
    private View f38717c;

    /* renamed from: d  reason: collision with root package name */
    private View f38718d;

    /* renamed from: e  reason: collision with root package name */
    private View f38719e;

    /* renamed from: f  reason: collision with root package name */
    private View f38720f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;
    private View m;
    private View n;
    private View o;
    private View p;
    private View q;
    private View r;
    private View s;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f38715a, false, 30743, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38715a, false, 30743, new Class[0], Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38716b;
        if (commerceVideoDelegate != null) {
            this.f38716b = null;
            commerceVideoDelegate.adCircleWaveLayout = null;
            commerceVideoDelegate.mCommerceTagView = null;
            commerceVideoDelegate.oldAdBottomLabelView = null;
            commerceVideoDelegate.newAdBottomLabelView = null;
            commerceVideoDelegate.mAdBackgroundLayout = null;
            commerceVideoDelegate.adHalfWebPageContainer = null;
            commerceVideoDelegate.commerceGoodHalfCardContainer = null;
            commerceVideoDelegate.blackMaskLayer = null;
            commerceVideoDelegate.diggLayout = null;
            commerceVideoDelegate.adRedPacketIv = null;
            commerceVideoDelegate.flAdGuideRoot = null;
            commerceVideoDelegate.feedAdLayout = null;
            commerceVideoDelegate.feedAdDownloadBtn = null;
            commerceVideoDelegate.feedAdReplay = null;
            commerceVideoDelegate.introContainer = null;
            commerceVideoDelegate.mBottomView = null;
            commerceVideoDelegate.adGuideName = null;
            commerceVideoDelegate.adRatingView = null;
            commerceVideoDelegate.adLikeDivide = null;
            commerceVideoDelegate.adAppUseNumber = null;
            commerceVideoDelegate.adLikeLayout = null;
            commerceVideoDelegate.adTagGroup = null;
            commerceVideoDelegate.adGuideDesc = null;
            commerceVideoDelegate.adGuideIcon = null;
            commerceVideoDelegate.adGuideImage = null;
            commerceVideoDelegate.adGuideWebImage = null;
            commerceVideoDelegate.adGuideLabel = null;
            commerceVideoDelegate.adGuideTitle = null;
            commerceVideoDelegate.adPriceLayout = null;
            commerceVideoDelegate.adGuidePrice = null;
            commerceVideoDelegate.adGuideService = null;
            commerceVideoDelegate.mLinkTag = null;
            commerceVideoDelegate.mDouPlusLinkTag = null;
            commerceVideoDelegate.mIvRelieveTag = null;
            commerceVideoDelegate.mMicroTag = null;
            commerceVideoDelegate.vastAdTag = null;
            commerceVideoDelegate.vastAdTagAdChoice = null;
            commerceVideoDelegate.vastAdTagText = null;
            commerceVideoDelegate.feedStarAtlasCheckLL = null;
            commerceVideoDelegate.starAtlasCheckHintTv = null;
            this.f38717c.setOnClickListener(null);
            this.f38717c = null;
            this.f38718d.setOnClickListener(null);
            this.f38718d = null;
            this.f38719e.setOnClickListener(null);
            this.f38719e = null;
            this.f38720f.setOnClickListener(null);
            this.f38720f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.k.setOnClickListener(null);
            this.k = null;
            this.l.setOnClickListener(null);
            this.l = null;
            this.m.setOnClickListener(null);
            this.m = null;
            this.n.setOnClickListener(null);
            this.n = null;
            this.o.setOnClickListener(null);
            this.o = null;
            this.p.setOnClickListener(null);
            this.p = null;
            this.q.setOnClickListener(null);
            this.q = null;
            this.r.setOnClickListener(null);
            this.r = null;
            this.s.setOnClickListener(null);
            this.s = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public CommerceVideoDelegate_ViewBinding(final CommerceVideoDelegate commerceVideoDelegate, View view) {
        this.f38716b = commerceVideoDelegate;
        commerceVideoDelegate.adCircleWaveLayout = (CircleWaveLayout) Utils.findRequiredViewAsType(view, C0906R.id.bn, "field 'adCircleWaveLayout'", CircleWaveLayout.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.xl, "field 'mCommerceTagView' and method 'onClick'");
        commerceVideoDelegate.mCommerceTagView = (CommerceTag) Utils.castView(findRequiredView, C0906R.id.xl, "field 'mCommerceTagView'", CommerceTag.class);
        this.f38717c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38721a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38721a, false, 30744, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38721a, false, 30744, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                commerceVideoDelegate.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.bug, "field 'oldAdBottomLabelView' and method 'onClick'");
        commerceVideoDelegate.oldAdBottomLabelView = (StripAdBottomLabelView) Utils.castView(findRequiredView2, C0906R.id.bug, "field 'oldAdBottomLabelView'", StripAdBottomLabelView.class);
        this.f38718d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38724a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38724a, false, 30753, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38724a, false, 30753, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                commerceVideoDelegate.onClick(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.bq8, "field 'newAdBottomLabelView' and method 'onClick'");
        commerceVideoDelegate.newAdBottomLabelView = (ButtonAdBottomLabelView) Utils.castView(findRequiredView3, C0906R.id.bq8, "field 'newAdBottomLabelView'", ButtonAdBottomLabelView.class);
        this.f38719e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38727a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38727a, false, 30754, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38727a, false, 30754, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                commerceVideoDelegate.onClick(view2);
            }
        });
        commerceVideoDelegate.mAdBackgroundLayout = Utils.findRequiredView(view, C0906R.id.m3, "field 'mAdBackgroundLayout'");
        commerceVideoDelegate.adHalfWebPageContainer = (AdHalfWebPageContainer) Utils.findRequiredViewAsType(view, C0906R.id.c1, "field 'adHalfWebPageContainer'", AdHalfWebPageContainer.class);
        commerceVideoDelegate.commerceGoodHalfCardContainer = (CommerceGoodHalfCardContainer) Utils.findRequiredViewAsType(view, C0906R.id.wt, "field 'commerceGoodHalfCardContainer'", CommerceGoodHalfCardContainer.class);
        commerceVideoDelegate.blackMaskLayer = (BlackMaskLayer) Utils.findRequiredViewAsType(view, C0906R.id.li, "field 'blackMaskLayer'", BlackMaskLayer.class);
        commerceVideoDelegate.diggLayout = (CommerceLikeLayout) Utils.findRequiredViewAsType(view, C0906R.id.bs, "field 'diggLayout'", CommerceLikeLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.cq, "field 'adRedPacketIv' and method 'onClick'");
        commerceVideoDelegate.adRedPacketIv = (RemoteImageView) Utils.castView(findRequiredView4, C0906R.id.cq, "field 'adRedPacketIv'", RemoteImageView.class);
        this.f38720f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38730a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38730a, false, 30755, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38730a, false, 30755, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                commerceVideoDelegate.onClick(view2);
            }
        });
        commerceVideoDelegate.flAdGuideRoot = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.c0, "field 'flAdGuideRoot'", FrameLayout.class);
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.acr, "field 'feedAdLayout' and method 'onClick'");
        commerceVideoDelegate.feedAdLayout = (LinearLayout) Utils.castView(findRequiredView5, C0906R.id.acr, "field 'feedAdLayout'", LinearLayout.class);
        this.g = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38733a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38733a, false, 30756, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38733a, false, 30756, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                commerceVideoDelegate.onClick(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, C0906R.id.acq, "field 'feedAdDownloadBtn' and method 'onClick'");
        commerceVideoDelegate.feedAdDownloadBtn = (TextView) Utils.castView(findRequiredView6, C0906R.id.acq, "field 'feedAdDownloadBtn'", TextView.class);
        this.h = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38736a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38736a, false, 30757, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38736a, false, 30757, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                commerceVideoDelegate.onClick(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, C0906R.id.acs, "field 'feedAdReplay' and method 'onClick'");
        commerceVideoDelegate.feedAdReplay = findRequiredView7;
        this.i = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38739a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38739a, false, 30758, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38739a, false, 30758, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                commerceVideoDelegate.onClick(view2);
            }
        });
        commerceVideoDelegate.introContainer = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.im, "field 'introContainer'", LinearLayout.class);
        View findRequiredView8 = Utils.findRequiredView(view, C0906R.id.m0, "field 'mBottomView' and method 'onClick'");
        commerceVideoDelegate.mBottomView = (FrameLayout) Utils.castView(findRequiredView8, C0906R.id.m0, "field 'mBottomView'", FrameLayout.class);
        this.j = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38742a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38742a, false, 30759, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38742a, false, 30759, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                commerceVideoDelegate.onClick(view2);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, C0906R.id.cf, "field 'adGuideName' and method 'onClick'");
        commerceVideoDelegate.adGuideName = (DmtTextView) Utils.castView(findRequiredView9, C0906R.id.cf, "field 'adGuideName'", DmtTextView.class);
        this.k = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38745a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38745a, false, 30760, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38745a, false, 30760, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                commerceVideoDelegate.onClick(view2);
            }
        });
        commerceVideoDelegate.adRatingView = (AdRatingView) Utils.findRequiredViewAsType(view, C0906R.id.cp, "field 'adRatingView'", AdRatingView.class);
        commerceVideoDelegate.adLikeDivide = Utils.findRequiredView(view, C0906R.id.cc, "field 'adLikeDivide'");
        commerceVideoDelegate.adAppUseNumber = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.be, "field 'adAppUseNumber'", DmtTextView.class);
        View findRequiredView10 = Utils.findRequiredView(view, C0906R.id.cd, "field 'adLikeLayout' and method 'onClick'");
        commerceVideoDelegate.adLikeLayout = (LinearLayout) Utils.castView(findRequiredView10, C0906R.id.cd, "field 'adLikeLayout'", LinearLayout.class);
        this.l = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38748a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38748a, false, 30745, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38748a, false, 30745, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                commerceVideoDelegate.onClick(view2);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, C0906R.id.d5, "field 'adTagGroup' and method 'onClick'");
        commerceVideoDelegate.adTagGroup = (AdTagGroup) Utils.castView(findRequiredView11, C0906R.id.d5, "field 'adTagGroup'", AdTagGroup.class);
        this.m = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38751a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38751a, false, 30746, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38751a, false, 30746, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                commerceVideoDelegate.onClick(view2);
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, C0906R.id.br, "field 'adGuideDesc' and method 'onClick'");
        commerceVideoDelegate.adGuideDesc = (DescTextView) Utils.castView(findRequiredView12, C0906R.id.br, "field 'adGuideDesc'", DescTextView.class);
        this.n = findRequiredView12;
        findRequiredView12.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38754a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38754a, false, 30747, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38754a, false, 30747, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                commerceVideoDelegate.onClick(view2);
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, C0906R.id.c6, "field 'adGuideIcon' and method 'onClick'");
        commerceVideoDelegate.adGuideIcon = (RemoteImageView) Utils.castView(findRequiredView13, C0906R.id.c6, "field 'adGuideIcon'", RemoteImageView.class);
        this.o = findRequiredView13;
        findRequiredView13.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38757a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38757a, false, 30748, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38757a, false, 30748, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                commerceVideoDelegate.onClick(view2);
            }
        });
        View findRequiredView14 = Utils.findRequiredView(view, C0906R.id.c9, "field 'adGuideImage' and method 'onClick'");
        commerceVideoDelegate.adGuideImage = (RemoteImageView) Utils.castView(findRequiredView14, C0906R.id.c9, "field 'adGuideImage'", RemoteImageView.class);
        this.p = findRequiredView14;
        findRequiredView14.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38760a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38760a, false, 30749, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38760a, false, 30749, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                commerceVideoDelegate.onClick(view2);
            }
        });
        View findRequiredView15 = Utils.findRequiredView(view, C0906R.id.d_, "field 'adGuideWebImage' and method 'onClick'");
        commerceVideoDelegate.adGuideWebImage = (RemoteImageView) Utils.castView(findRequiredView15, C0906R.id.d_, "field 'adGuideWebImage'", RemoteImageView.class);
        this.q = findRequiredView15;
        findRequiredView15.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38763a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38763a, false, 30750, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38763a, false, 30750, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                commerceVideoDelegate.onClick(view2);
            }
        });
        commerceVideoDelegate.adGuideLabel = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.cb, "field 'adGuideLabel'", DmtTextView.class);
        commerceVideoDelegate.adGuideTitle = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.d6, "field 'adGuideTitle'", DmtTextView.class);
        View findRequiredView16 = Utils.findRequiredView(view, C0906R.id.co, "field 'adPriceLayout' and method 'onClick'");
        commerceVideoDelegate.adPriceLayout = (LinearLayout) Utils.castView(findRequiredView16, C0906R.id.co, "field 'adPriceLayout'", LinearLayout.class);
        this.r = findRequiredView16;
        findRequiredView16.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38766a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38766a, false, 30751, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38766a, false, 30751, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                commerceVideoDelegate.onClick(view2);
            }
        });
        commerceVideoDelegate.adGuidePrice = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.f4424cn, "field 'adGuidePrice'", DmtTextView.class);
        commerceVideoDelegate.adGuideService = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.cs, "field 'adGuideService'", DmtTextView.class);
        commerceVideoDelegate.mLinkTag = (CommerceTagLayout) Utils.findOptionalViewAsType(view, C0906R.id.bci, "field 'mLinkTag'", CommerceTagLayout.class);
        commerceVideoDelegate.mDouPlusLinkTag = (DouPlusTagLayout) Utils.findOptionalViewAsType(view, C0906R.id.a6i, "field 'mDouPlusLinkTag'", DouPlusTagLayout.class);
        commerceVideoDelegate.mIvRelieveTag = (AnimationImageView) Utils.findRequiredViewAsType(view, C0906R.id.dss, "field 'mIvRelieveTag'", AnimationImageView.class);
        commerceVideoDelegate.mMicroTag = (CommerceMicroTagLayout) Utils.findOptionalViewAsType(view, C0906R.id.bn1, "field 'mMicroTag'", CommerceMicroTagLayout.class);
        commerceVideoDelegate.vastAdTag = (ViewGroup) Utils.findOptionalViewAsType(view, C0906R.id.dr0, "field 'vastAdTag'", ViewGroup.class);
        commerceVideoDelegate.vastAdTagAdChoice = (RemoteImageView) Utils.findOptionalViewAsType(view, C0906R.id.dr1, "field 'vastAdTagAdChoice'", RemoteImageView.class);
        commerceVideoDelegate.vastAdTagText = (DmtTextView) Utils.findOptionalViewAsType(view, C0906R.id.dr2, "field 'vastAdTagText'", DmtTextView.class);
        commerceVideoDelegate.feedStarAtlasCheckLL = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.ad0, "field 'feedStarAtlasCheckLL'", LinearLayout.class);
        commerceVideoDelegate.starAtlasCheckHintTv = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.cu9, "field 'starAtlasCheckHintTv'", DmtTextView.class);
        View findRequiredView17 = Utils.findRequiredView(view, C0906R.id.d7, "method 'onClick'");
        this.s = findRequiredView17;
        findRequiredView17.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38769a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38769a, false, 30752, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38769a, false, 30752, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                commerceVideoDelegate.onClick(view2);
            }
        });
    }
}
