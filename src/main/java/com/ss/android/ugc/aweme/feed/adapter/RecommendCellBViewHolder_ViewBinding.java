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
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;

public class RecommendCellBViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44773a;

    /* renamed from: b  reason: collision with root package name */
    private RecommendCellBViewHolder f44774b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f44773a, false, 40623, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44773a, false, 40623, new Class[0], Void.TYPE);
            return;
        }
        RecommendCellBViewHolder recommendCellBViewHolder = this.f44774b;
        if (recommendCellBViewHolder != null) {
            this.f44774b = null;
            recommendCellBViewHolder.txtDesc = null;
            recommendCellBViewHolder.txtLikeCount = null;
            recommendCellBViewHolder.authorAvatar = null;
            recommendCellBViewHolder.txtAuthorName = null;
            recommendCellBViewHolder.tagLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public RecommendCellBViewHolder_ViewBinding(RecommendCellBViewHolder recommendCellBViewHolder, View view) {
        this.f44774b = recommendCellBViewHolder;
        recommendCellBViewHolder.txtDesc = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a3m, "field 'txtDesc'", TextView.class);
        recommendCellBViewHolder.txtLikeCount = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bbd, "field 'txtLikeCount'", TextView.class);
        recommendCellBViewHolder.authorAvatar = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.gu, "field 'authorAvatar'", RemoteImageView.class);
        recommendCellBViewHolder.txtAuthorName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.gw, "field 'txtAuthorName'", TextView.class);
        recommendCellBViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, C0906R.id.czc, "field 'tagLayout'", TagLayout.class);
    }
}
