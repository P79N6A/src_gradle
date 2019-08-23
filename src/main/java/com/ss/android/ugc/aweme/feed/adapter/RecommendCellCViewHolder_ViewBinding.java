package com.ss.android.ugc.aweme.feed.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.BorderLayout;
import com.ss.android.ugc.aweme.base.ui.TagLayout;

public class RecommendCellCViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44782a;

    /* renamed from: b  reason: collision with root package name */
    private RecommendCellCViewHolder f44783b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f44782a, false, 40634, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44782a, false, 40634, new Class[0], Void.TYPE);
            return;
        }
        RecommendCellCViewHolder recommendCellCViewHolder = this.f44783b;
        if (recommendCellCViewHolder != null) {
            this.f44783b = null;
            recommendCellCViewHolder.txtDesc = null;
            recommendCellCViewHolder.txtLikeCount = null;
            recommendCellCViewHolder.txtCommentCount = null;
            recommendCellCViewHolder.tagLayout = null;
            recommendCellCViewHolder.borderLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public RecommendCellCViewHolder_ViewBinding(RecommendCellCViewHolder recommendCellCViewHolder, View view) {
        this.f44783b = recommendCellCViewHolder;
        recommendCellCViewHolder.txtDesc = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a3m, "field 'txtDesc'", TextView.class);
        recommendCellCViewHolder.txtLikeCount = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bbd, "field 'txtLikeCount'", TextView.class);
        recommendCellCViewHolder.txtCommentCount = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.v4, "field 'txtCommentCount'", TextView.class);
        recommendCellCViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, C0906R.id.czc, "field 'tagLayout'", TagLayout.class);
        recommendCellCViewHolder.borderLayout = (BorderLayout) Utils.findRequiredViewAsType(view, C0906R.id.ly, "field 'borderLayout'", BorderLayout.class);
    }
}
