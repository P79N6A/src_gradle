package com.ss.android.ugc.aweme.newfollow.vh;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FlowFeedArticleViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57526a;

    /* renamed from: b  reason: collision with root package name */
    private FlowFeedArticleViewHolder f57527b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57526a, false, 62155, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57526a, false, 62155, new Class[0], Void.TYPE);
            return;
        }
        FlowFeedArticleViewHolder flowFeedArticleViewHolder = this.f57527b;
        if (flowFeedArticleViewHolder != null) {
            this.f57527b = null;
            flowFeedArticleViewHolder.mRecyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FlowFeedArticleViewHolder_ViewBinding(FlowFeedArticleViewHolder flowFeedArticleViewHolder, View view) {
        this.f57527b = flowFeedArticleViewHolder;
        flowFeedArticleViewHolder.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.cc7, "field 'mRecyclerView'", RecyclerView.class);
    }
}
