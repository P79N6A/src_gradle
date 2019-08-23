package com.ss.android.ugc.aweme.newfollow.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class RecommendFollowFeedActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57282a;

    /* renamed from: b  reason: collision with root package name */
    private RecommendFollowFeedActivity f57283b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57282a, false, 61680, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57282a, false, 61680, new Class[0], Void.TYPE);
            return;
        }
        RecommendFollowFeedActivity recommendFollowFeedActivity = this.f57283b;
        if (recommendFollowFeedActivity != null) {
            this.f57283b = null;
            recommendFollowFeedActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public RecommendFollowFeedActivity_ViewBinding(RecommendFollowFeedActivity recommendFollowFeedActivity, View view) {
        this.f57283b = recommendFollowFeedActivity;
        recommendFollowFeedActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTitleBar'", TextTitleBar.class);
    }
}
