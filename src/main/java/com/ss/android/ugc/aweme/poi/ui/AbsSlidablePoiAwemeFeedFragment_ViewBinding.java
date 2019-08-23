package com.ss.android.ugc.aweme.poi.ui;

import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.widget.BannerViewPager;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.poi.map.MapLayout;
import com.ss.android.ugc.aweme.poi.widget.PoiHeaderLayout;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;

public class AbsSlidablePoiAwemeFeedFragment_ViewBinding extends AbsPoiAwemeFeedFragment_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f60411b;

    /* renamed from: c  reason: collision with root package name */
    private AbsSlidablePoiAwemeFeedFragment f60412c;

    /* renamed from: d  reason: collision with root package name */
    private View f60413d;

    /* renamed from: e  reason: collision with root package name */
    private View f60414e;

    /* renamed from: f  reason: collision with root package name */
    private View f60415f;
    private View g;
    private View h;
    private View i;
    private View j;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f60411b, false, 65957, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60411b, false, 65957, new Class[0], Void.TYPE);
            return;
        }
        AbsSlidablePoiAwemeFeedFragment absSlidablePoiAwemeFeedFragment = this.f60412c;
        if (absSlidablePoiAwemeFeedFragment != null) {
            this.f60412c = null;
            absSlidablePoiAwemeFeedFragment.mPoiMap = null;
            absSlidablePoiAwemeFeedFragment.mBannerVPer = null;
            absSlidablePoiAwemeFeedFragment.mStatusBar = null;
            absSlidablePoiAwemeFeedFragment.mIndicatorView = null;
            absSlidablePoiAwemeFeedFragment.mHeader = null;
            absSlidablePoiAwemeFeedFragment.mUploadImage = null;
            absSlidablePoiAwemeFeedFragment.mTopbar = null;
            absSlidablePoiAwemeFeedFragment.mTopbarStatus = null;
            absSlidablePoiAwemeFeedFragment.mTopbarBg = null;
            absSlidablePoiAwemeFeedFragment.mRouteStatus = null;
            absSlidablePoiAwemeFeedFragment.mTopCollectImg = null;
            absSlidablePoiAwemeFeedFragment.mCollectContainer = null;
            absSlidablePoiAwemeFeedFragment.mBottomToolbar = null;
            absSlidablePoiAwemeFeedFragment.mBottomToolbarCollect = null;
            absSlidablePoiAwemeFeedFragment.mBottomToolbarCollectImg = null;
            absSlidablePoiAwemeFeedFragment.mBottomToolbarShare = null;
            absSlidablePoiAwemeFeedFragment.mBottomToolbarDivider = null;
            absSlidablePoiAwemeFeedFragment.mPoiMore = null;
            absSlidablePoiAwemeFeedFragment.mPoiHeaderLayout = null;
            absSlidablePoiAwemeFeedFragment.mTitleBarBg = null;
            absSlidablePoiAwemeFeedFragment.mBackBtn = null;
            absSlidablePoiAwemeFeedFragment.mShareBtn = null;
            absSlidablePoiAwemeFeedFragment.mTitleBarTools = null;
            this.f60413d.setOnClickListener(null);
            this.f60413d = null;
            this.f60414e.setOnClickListener(null);
            this.f60414e = null;
            this.f60415f.setOnClickListener(null);
            this.f60415f = null;
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
    public AbsSlidablePoiAwemeFeedFragment_ViewBinding(final AbsSlidablePoiAwemeFeedFragment absSlidablePoiAwemeFeedFragment, View view) {
        super(absSlidablePoiAwemeFeedFragment, view);
        this.f60412c = absSlidablePoiAwemeFeedFragment;
        absSlidablePoiAwemeFeedFragment.mPoiMap = (MapLayout) Utils.findRequiredViewAsType(view, C0906R.id.c31, "field 'mPoiMap'", MapLayout.class);
        absSlidablePoiAwemeFeedFragment.mBannerVPer = (BannerViewPager) Utils.findRequiredViewAsType(view, C0906R.id.duu, "field 'mBannerVPer'", BannerViewPager.class);
        absSlidablePoiAwemeFeedFragment.mStatusBar = Utils.findRequiredView(view, C0906R.id.cv0, "field 'mStatusBar'");
        absSlidablePoiAwemeFeedFragment.mIndicatorView = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.dn7, "field 'mIndicatorView'", DmtTextView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.c0f, "field 'mHeader' and method 'onClick'");
        absSlidablePoiAwemeFeedFragment.mHeader = findRequiredView;
        this.f60413d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60416a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60416a, false, 65958, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60416a, false, 65958, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                absSlidablePoiAwemeFeedFragment.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.c43, "field 'mUploadImage' and method 'onClick'");
        absSlidablePoiAwemeFeedFragment.mUploadImage = (ImageView) Utils.castView(findRequiredView2, C0906R.id.c43, "field 'mUploadImage'", ImageView.class);
        this.f60414e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60419a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60419a, false, 65959, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60419a, false, 65959, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                absSlidablePoiAwemeFeedFragment.onClick(view2);
            }
        });
        absSlidablePoiAwemeFeedFragment.mTopbar = Utils.findRequiredView(view, C0906R.id.d3v, "field 'mTopbar'");
        absSlidablePoiAwemeFeedFragment.mTopbarStatus = Utils.findRequiredView(view, C0906R.id.c37, "field 'mTopbarStatus'");
        absSlidablePoiAwemeFeedFragment.mTopbarBg = Utils.findRequiredView(view, C0906R.id.c35, "field 'mTopbarBg'");
        absSlidablePoiAwemeFeedFragment.mRouteStatus = Utils.findRequiredView(view, C0906R.id.c33, "field 'mRouteStatus'");
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.b01, "field 'mTopCollectImg' and method 'onClick'");
        absSlidablePoiAwemeFeedFragment.mTopCollectImg = (CheckableImageView) Utils.castView(findRequiredView3, C0906R.id.b01, "field 'mTopCollectImg'", CheckableImageView.class);
        this.f60415f = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60422a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60422a, false, 65960, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60422a, false, 65960, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                absSlidablePoiAwemeFeedFragment.onClick(view2);
            }
        });
        absSlidablePoiAwemeFeedFragment.mCollectContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.u7, "field 'mCollectContainer'", ViewGroup.class);
        absSlidablePoiAwemeFeedFragment.mBottomToolbar = Utils.findRequiredView(view, C0906R.id.c07, "field 'mBottomToolbar'");
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.c0b, "field 'mBottomToolbarCollect' and method 'onClick'");
        absSlidablePoiAwemeFeedFragment.mBottomToolbarCollect = findRequiredView4;
        this.g = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60425a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60425a, false, 65961, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60425a, false, 65961, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                absSlidablePoiAwemeFeedFragment.onClick(view2);
            }
        });
        absSlidablePoiAwemeFeedFragment.mBottomToolbarCollectImg = (CheckableImageView) Utils.findRequiredViewAsType(view, C0906R.id.c0a, "field 'mBottomToolbarCollectImg'", CheckableImageView.class);
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.c1f, "field 'mBottomToolbarShare' and method 'onClick'");
        absSlidablePoiAwemeFeedFragment.mBottomToolbarShare = findRequiredView5;
        this.h = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60428a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60428a, false, 65962, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60428a, false, 65962, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                absSlidablePoiAwemeFeedFragment.onClick(view2);
            }
        });
        absSlidablePoiAwemeFeedFragment.mBottomToolbarDivider = Utils.findRequiredView(view, C0906R.id.c08, "field 'mBottomToolbarDivider'");
        View findRequiredView6 = Utils.findRequiredView(view, C0906R.id.c11, "field 'mPoiMore' and method 'onClick'");
        absSlidablePoiAwemeFeedFragment.mPoiMore = findRequiredView6;
        this.i = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60431a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60431a, false, 65963, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60431a, false, 65963, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                absSlidablePoiAwemeFeedFragment.onClick(view2);
            }
        });
        absSlidablePoiAwemeFeedFragment.mPoiHeaderLayout = (PoiHeaderLayout) Utils.findOptionalViewAsType(view, C0906R.id.c1v, "field 'mPoiHeaderLayout'", PoiHeaderLayout.class);
        absSlidablePoiAwemeFeedFragment.mTitleBarBg = Utils.findRequiredView(view, C0906R.id.c3k, "field 'mTitleBarBg'");
        absSlidablePoiAwemeFeedFragment.mBackBtn = (AutoRTLImageView) Utils.findRequiredViewAsType(view, C0906R.id.ix, "field 'mBackBtn'", AutoRTLImageView.class);
        View findRequiredView7 = Utils.findRequiredView(view, C0906R.id.cp9, "field 'mShareBtn' and method 'onClick'");
        absSlidablePoiAwemeFeedFragment.mShareBtn = (ImageView) Utils.castView(findRequiredView7, C0906R.id.cp9, "field 'mShareBtn'", ImageView.class);
        this.j = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60434a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60434a, false, 65964, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60434a, false, 65964, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                absSlidablePoiAwemeFeedFragment.onClick(view2);
            }
        });
        absSlidablePoiAwemeFeedFragment.mTitleBarTools = Utils.findRequiredView(view, C0906R.id.c38, "field 'mTitleBarTools'");
    }
}
