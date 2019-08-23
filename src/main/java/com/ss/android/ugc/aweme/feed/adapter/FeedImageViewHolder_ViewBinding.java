package com.ss.android.ugc.aweme.feed.adapter;

import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.CommerceTag;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;

public class FeedImageViewHolder_ViewBinding extends BaseFeedViewHolder_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f44695b;

    /* renamed from: c  reason: collision with root package name */
    private FeedImageViewHolder f44696c;

    /* renamed from: d  reason: collision with root package name */
    private View f44697d;

    /* renamed from: e  reason: collision with root package name */
    private View f44698e;

    /* renamed from: f  reason: collision with root package name */
    private View f44699f;
    private View g;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f44695b, false, 40401, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44695b, false, 40401, new Class[0], Void.TYPE);
            return;
        }
        FeedImageViewHolder feedImageViewHolder = this.f44696c;
        if (feedImageViewHolder != null) {
            this.f44696c = null;
            feedImageViewHolder.mWidgetContainer = null;
            feedImageViewHolder.mRootView = null;
            feedImageViewHolder.mCoverView = null;
            feedImageViewHolder.mCommerceTagView = null;
            feedImageViewHolder.mTvChallenge = null;
            feedImageViewHolder.mTitleView = null;
            feedImageViewHolder.mTitleLayout = null;
            feedImageViewHolder.mBottomView = null;
            feedImageViewHolder.mGradualBottomView = null;
            feedImageViewHolder.mTxtExtra = null;
            feedImageViewHolder.tagLayout = null;
            feedImageViewHolder.llRightMenu = null;
            feedImageViewHolder.llAwemeIntro = null;
            feedImageViewHolder.mLongPressLayout = null;
            feedImageViewHolder.mLineProgressBar = null;
            feedImageViewHolder.mAwemeInCheckLayout = null;
            this.f44697d.setOnClickListener(null);
            this.f44697d = null;
            this.f44698e.setOnClickListener(null);
            this.f44698e = null;
            this.f44699f.setOnClickListener(null);
            this.f44699f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FeedImageViewHolder_ViewBinding(final FeedImageViewHolder feedImageViewHolder, View view) {
        super(feedImageViewHolder, view);
        this.f44696c = feedImageViewHolder;
        feedImageViewHolder.mWidgetContainer = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.dxn, "field 'mWidgetContainer'", RelativeLayout.class);
        feedImageViewHolder.mRootView = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.duj, "field 'mRootView'", FrameLayout.class);
        feedImageViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.a1a, "field 'mCoverView'", RemoteImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.xl, "field 'mCommerceTagView' and method 'onClick'");
        feedImageViewHolder.mCommerceTagView = (CommerceTag) Utils.castView(findRequiredView, C0906R.id.xl, "field 'mCommerceTagView'", CommerceTag.class);
        this.f44697d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44700a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f44700a, false, 40402, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f44700a, false, 40402, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                feedImageViewHolder.onClick(view2);
            }
        });
        feedImageViewHolder.mTvChallenge = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.rg, "field 'mTvChallenge'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.title, "field 'mTitleView' and method 'onClick'");
        feedImageViewHolder.mTitleView = (TextView) Utils.castView(findRequiredView2, C0906R.id.title, "field 'mTitleView'", TextView.class);
        this.f44698e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44703a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f44703a, false, 40403, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f44703a, false, 40403, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                feedImageViewHolder.onClick(view2);
            }
        });
        feedImageViewHolder.mTitleLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.d3w, "field 'mTitleLayout'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.m0, "field 'mBottomView' and method 'onClick'");
        feedImageViewHolder.mBottomView = findRequiredView3;
        this.f44699f = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44706a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f44706a, false, 40404, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f44706a, false, 40404, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                feedImageViewHolder.onClick(view2);
            }
        });
        feedImageViewHolder.mGradualBottomView = Utils.findRequiredView(view, C0906R.id.alf, "field 'mGradualBottomView'");
        feedImageViewHolder.mTxtExtra = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dbk, "field 'mTxtExtra'", TextView.class);
        feedImageViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, C0906R.id.dt0, "field 'tagLayout'", TagLayout.class);
        feedImageViewHolder.llRightMenu = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.ceq, "field 'llRightMenu'", LinearLayout.class);
        feedImageViewHolder.llAwemeIntro = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.im, "field 'llAwemeIntro'", LinearLayout.class);
        feedImageViewHolder.mLongPressLayout = (LongPressLayout) Utils.findRequiredViewAsType(view, C0906R.id.bkq, "field 'mLongPressLayout'", LongPressLayout.class);
        feedImageViewHolder.mLineProgressBar = (LineProgressBar) Utils.findRequiredViewAsType(view, C0906R.id.bym, "field 'mLineProgressBar'", LineProgressBar.class);
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.il, "field 'mAwemeInCheckLayout' and method 'onClick'");
        feedImageViewHolder.mAwemeInCheckLayout = (ViewGroup) Utils.castView(findRequiredView4, C0906R.id.il, "field 'mAwemeInCheckLayout'", ViewGroup.class);
        this.g = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44709a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f44709a, false, 40405, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f44709a, false, 40405, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                feedImageViewHolder.onClick(view2);
            }
        });
    }
}
