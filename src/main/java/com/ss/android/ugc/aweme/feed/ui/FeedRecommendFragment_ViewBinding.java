package com.ss.android.ugc.aweme.feed.ui;

import android.support.annotation.UiThread;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FeedRecommendFragment_ViewBinding extends BaseFeedListFragment_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f46187b;

    /* renamed from: c  reason: collision with root package name */
    private FeedRecommendFragment f46188c;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f46187b, false, 42664, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46187b, false, 42664, new Class[0], Void.TYPE);
            return;
        }
        FeedRecommendFragment feedRecommendFragment = this.f46188c;
        if (feedRecommendFragment != null) {
            this.f46188c = null;
            feedRecommendFragment.dialogContainer = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FeedRecommendFragment_ViewBinding(FeedRecommendFragment feedRecommendFragment, View view) {
        super(feedRecommendFragment, view);
        this.f46188c = feedRecommendFragment;
        feedRecommendFragment.dialogContainer = (ConstraintLayout) Utils.findRequiredViewAsType(view, C0906R.id.a4h, "field 'dialogContainer'", ConstraintLayout.class);
    }
}
