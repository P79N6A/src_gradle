package com.ss.android.ugc.aweme.feed.ui;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FeedFollowFragment_ViewBinding extends BaseFeedListFragment_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f46170b;

    /* renamed from: c  reason: collision with root package name */
    private FeedFollowFragment f46171c;

    /* renamed from: d  reason: collision with root package name */
    private View f46172d;

    /* renamed from: e  reason: collision with root package name */
    private View f46173e;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f46170b, false, 42611, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46170b, false, 42611, new Class[0], Void.TYPE);
            return;
        }
        FeedFollowFragment feedFollowFragment = this.f46171c;
        if (feedFollowFragment != null) {
            this.f46171c = null;
            feedFollowFragment.mFlContentContainer = null;
            feedFollowFragment.mSkyLightTopContainer = null;
            feedFollowFragment.mSkyLightBottomContainer = null;
            feedFollowFragment.mSkyLightStyleBTxt = null;
            feedFollowFragment.mSkyLightStyleCLayout = null;
            feedFollowFragment.mTopSpace = null;
            this.f46172d.setOnClickListener(null);
            this.f46172d = null;
            this.f46173e.setOnClickListener(null);
            this.f46173e = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FeedFollowFragment_ViewBinding(final FeedFollowFragment feedFollowFragment, View view) {
        super(feedFollowFragment, view);
        this.f46171c = feedFollowFragment;
        feedFollowFragment.mFlContentContainer = (LiveSkyLightTouchEventFrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.afe, "field 'mFlContentContainer'", LiveSkyLightTouchEventFrameLayout.class);
        feedFollowFragment.mSkyLightTopContainer = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.ag_, "field 'mSkyLightTopContainer'", FrameLayout.class);
        feedFollowFragment.mSkyLightBottomContainer = Utils.findRequiredView(view, C0906R.id.ag9, "field 'mSkyLightBottomContainer'");
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.dj6, "field 'mSkyLightStyleBTxt' and method 'onSkyLightStyleBTxtClick'");
        feedFollowFragment.mSkyLightStyleBTxt = (DmtTextView) Utils.castView(findRequiredView, C0906R.id.dj6, "field 'mSkyLightStyleBTxt'", DmtTextView.class);
        this.f46172d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46174a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f46174a, false, 42612, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f46174a, false, 42612, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                feedFollowFragment.onSkyLightStyleBTxtClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.bi0, "field 'mSkyLightStyleCLayout' and method 'onSkyLightStyleCTxtClick'");
        feedFollowFragment.mSkyLightStyleCLayout = (LinearLayout) Utils.castView(findRequiredView2, C0906R.id.bi0, "field 'mSkyLightStyleCLayout'", LinearLayout.class);
        this.f46173e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46177a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f46177a, false, 42613, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f46177a, false, 42613, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                feedFollowFragment.onSkyLightStyleCTxtClick();
            }
        });
        feedFollowFragment.mTopSpace = Utils.findRequiredView(view, C0906R.id.d5u, "field 'mTopSpace'");
    }
}
