package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.ss.android.ugc.aweme.commercialize.views.BlackMaskLayer;

public class UserProfileFragment_ViewBinding extends BaseDTProfileFragment_ViewBinding {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62412a;

    /* renamed from: d  reason: collision with root package name */
    private UserProfileFragment f62413d;

    /* renamed from: e  reason: collision with root package name */
    private View f62414e;

    /* renamed from: f  reason: collision with root package name */
    private View f62415f;
    private View g;
    private View h;
    private View i;
    private View j;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f62412a, false, 69269, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62412a, false, 69269, new Class[0], Void.TYPE);
            return;
        }
        UserProfileFragment userProfileFragment = this.f62413d;
        if (userProfileFragment != null) {
            this.f62413d = null;
            userProfileFragment.adBottomMoreBtn = null;
            userProfileFragment.adBottomAvatar = null;
            userProfileFragment.adBottomTitle = null;
            userProfileFragment.adBottomDescLL = null;
            userProfileFragment.adBottomCloseBtn = null;
            userProfileFragment.txtHomePageBottomTextual = null;
            userProfileFragment.mBackBtn = null;
            userProfileFragment.adBottomLayout = null;
            userProfileFragment.mRightMoreBtn = null;
            userProfileFragment.mHitRankTagContainer = null;
            userProfileFragment.blackMaskLayer = null;
            userProfileFragment.adHalfLandpageContainer = null;
            this.f62414e.setOnClickListener(null);
            this.f62414e = null;
            this.f62415f.setOnClickListener(null);
            this.f62415f = null;
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
    public UserProfileFragment_ViewBinding(final UserProfileFragment userProfileFragment, View view) {
        super(userProfileFragment, view);
        this.f62413d = userProfileFragment;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.bk, "field 'adBottomMoreBtn' and method 'onAdBottomClick'");
        userProfileFragment.adBottomMoreBtn = (TextView) Utils.castView(findRequiredView, C0906R.id.bk, "field 'adBottomMoreBtn'", TextView.class);
        this.f62414e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62416a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62416a, false, 69270, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62416a, false, 69270, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                userProfileFragment.onAdBottomClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.bg, "field 'adBottomAvatar' and method 'onAdBottomClick'");
        userProfileFragment.adBottomAvatar = (AvatarImageView) Utils.castView(findRequiredView2, C0906R.id.bg, "field 'adBottomAvatar'", AvatarImageView.class);
        this.f62415f = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62419a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62419a, false, 69271, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62419a, false, 69271, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                userProfileFragment.onAdBottomClick(view2);
            }
        });
        userProfileFragment.adBottomTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bl, "field 'adBottomTitle'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.bi, "field 'adBottomDescLL' and method 'onAdBottomClick'");
        userProfileFragment.adBottomDescLL = findRequiredView3;
        this.g = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62422a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62422a, false, 69272, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62422a, false, 69272, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                userProfileFragment.onAdBottomClick(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.bh, "field 'adBottomCloseBtn' and method 'onAdBottomClick'");
        userProfileFragment.adBottomCloseBtn = findRequiredView4;
        this.h = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62425a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62425a, false, 69273, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62425a, false, 69273, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                userProfileFragment.onAdBottomClick(view2);
            }
        });
        userProfileFragment.txtHomePageBottomTextual = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dn6, "field 'txtHomePageBottomTextual'", TextView.class);
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.ix, "field 'mBackBtn' and method 'onBack'");
        userProfileFragment.mBackBtn = (ImageView) Utils.castView(findRequiredView5, C0906R.id.ix, "field 'mBackBtn'", ImageView.class);
        this.i = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62428a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62428a, false, 69274, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62428a, false, 69274, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                userProfileFragment.onBack(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, C0906R.id.bj, "field 'adBottomLayout' and method 'onAdBottomClick'");
        userProfileFragment.adBottomLayout = findRequiredView6;
        this.j = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62431a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62431a, false, 69275, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62431a, false, 69275, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                userProfileFragment.onAdBottomClick(view2);
            }
        });
        userProfileFragment.mRightMoreBtn = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.d3o, "field 'mRightMoreBtn'", ImageView.class);
        userProfileFragment.mHitRankTagContainer = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.dqa, "field 'mHitRankTagContainer'", FrameLayout.class);
        userProfileFragment.blackMaskLayer = (BlackMaskLayer) Utils.findRequiredViewAsType(view, C0906R.id.lj, "field 'blackMaskLayer'", BlackMaskLayer.class);
        userProfileFragment.adHalfLandpageContainer = (AdHalfWebPageContainer) Utils.findRequiredViewAsType(view, C0906R.id.c2, "field 'adHalfLandpageContainer'", AdHalfWebPageContainer.class);
    }
}
