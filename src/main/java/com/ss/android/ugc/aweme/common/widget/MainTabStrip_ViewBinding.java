package com.ss.android.ugc.aweme.common.widget;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class MainTabStrip_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40417a;

    /* renamed from: b  reason: collision with root package name */
    private MainTabStrip f40418b;

    /* renamed from: c  reason: collision with root package name */
    private View f40419c;

    /* renamed from: d  reason: collision with root package name */
    private View f40420d;

    /* renamed from: e  reason: collision with root package name */
    private View f40421e;

    /* renamed from: f  reason: collision with root package name */
    private View f40422f;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f40417a, false, 33703, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40417a, false, 33703, new Class[0], Void.TYPE);
            return;
        }
        MainTabStrip mainTabStrip = this.f40418b;
        if (mainTabStrip != null) {
            this.f40418b = null;
            mainTabStrip.mTvFollow = null;
            mainTabStrip.mTvNearByLeft = null;
            mainTabStrip.mIvFollowDot = null;
            mainTabStrip.mTvFollowDotCount = null;
            mainTabStrip.mTvHot = null;
            mainTabStrip.mTvFresh = null;
            mainTabStrip.mLeftLine = null;
            mainTabStrip.mRightLine = null;
            mainTabStrip.mIndicator = null;
            this.f40419c.setOnClickListener(null);
            this.f40419c = null;
            this.f40420d.setOnClickListener(null);
            this.f40420d = null;
            this.f40421e.setOnClickListener(null);
            this.f40421e = null;
            this.f40422f.setOnClickListener(null);
            this.f40422f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MainTabStrip_ViewBinding(final MainTabStrip mainTabStrip, View view) {
        this.f40418b = mainTabStrip;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.dbu, "field 'mTvFollow' and method 'click'");
        mainTabStrip.mTvFollow = (TextView) Utils.castView(findRequiredView, C0906R.id.dbu, "field 'mTvFollow'", TextView.class);
        this.f40419c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40423a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f40423a, false, 33704, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f40423a, false, 33704, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                mainTabStrip.click(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.df8, "field 'mTvNearByLeft' and method 'click'");
        mainTabStrip.mTvNearByLeft = (TextView) Utils.castView(findRequiredView2, C0906R.id.df8, "field 'mTvNearByLeft'", TextView.class);
        this.f40420d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40426a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f40426a, false, 33705, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f40426a, false, 33705, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                mainTabStrip.click(view2);
            }
        });
        mainTabStrip.mIvFollowDot = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.cyq, "field 'mIvFollowDot'", ImageView.class);
        mainTabStrip.mTvFollowDotCount = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.cyr, "field 'mTvFollowDotCount'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.dcx, "field 'mTvHot' and method 'click'");
        mainTabStrip.mTvHot = (TextView) Utils.castView(findRequiredView3, C0906R.id.dcx, "field 'mTvHot'", TextView.class);
        this.f40421e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40429a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f40429a, false, 33706, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f40429a, false, 33706, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                mainTabStrip.click(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.dc2, "field 'mTvFresh' and method 'click'");
        mainTabStrip.mTvFresh = (TextView) Utils.castView(findRequiredView4, C0906R.id.dc2, "field 'mTvFresh'", TextView.class);
        this.f40422f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40432a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f40432a, false, 33707, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f40432a, false, 33707, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                mainTabStrip.click(view2);
            }
        });
        mainTabStrip.mLeftLine = Utils.findRequiredView(view, C0906R.id.bay, "field 'mLeftLine'");
        mainTabStrip.mRightLine = Utils.findRequiredView(view, C0906R.id.cen, "field 'mRightLine'");
        mainTabStrip.mIndicator = Utils.findRequiredView(view, C0906R.id.bl5, "field 'mIndicator'");
    }
}
