package com.ss.android.ugc.aweme.newfollow.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class CommentLikeListView_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57197a;

    /* renamed from: b  reason: collision with root package name */
    private CommentLikeListView f57198b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57197a, false, 61450, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57197a, false, 61450, new Class[0], Void.TYPE);
            return;
        }
        CommentLikeListView commentLikeListView = this.f57198b;
        if (commentLikeListView != null) {
            this.f57198b = null;
            commentLikeListView.mHeadViews = null;
            commentLikeListView.mTvContent = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public CommentLikeListView_ViewBinding(CommentLikeListView commentLikeListView, View view) {
        this.f57198b = commentLikeListView;
        commentLikeListView.mHeadViews = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.bbf, "field 'mHeadViews'", RelativeLayout.class);
        commentLikeListView.mTvContent = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.bbg, "field 'mTvContent'", DmtTextView.class);
    }
}
