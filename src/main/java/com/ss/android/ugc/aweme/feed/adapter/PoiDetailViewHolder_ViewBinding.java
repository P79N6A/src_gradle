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

public class PoiDetailViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44756a;

    /* renamed from: b  reason: collision with root package name */
    private PoiDetailViewHolder f44757b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f44756a, false, 40602, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44756a, false, 40602, new Class[0], Void.TYPE);
            return;
        }
        PoiDetailViewHolder poiDetailViewHolder = this.f44757b;
        if (poiDetailViewHolder != null) {
            this.f44757b = null;
            poiDetailViewHolder.txtDesc = null;
            poiDetailViewHolder.txtLikeCount = null;
            poiDetailViewHolder.authorAvatar = null;
            poiDetailViewHolder.txtAuthorName = null;
            poiDetailViewHolder.tagLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiDetailViewHolder_ViewBinding(PoiDetailViewHolder poiDetailViewHolder, View view) {
        this.f44757b = poiDetailViewHolder;
        poiDetailViewHolder.txtDesc = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a3m, "field 'txtDesc'", TextView.class);
        poiDetailViewHolder.txtLikeCount = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bbd, "field 'txtLikeCount'", TextView.class);
        poiDetailViewHolder.authorAvatar = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.gu, "field 'authorAvatar'", RemoteImageView.class);
        poiDetailViewHolder.txtAuthorName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.gw, "field 'txtAuthorName'", TextView.class);
        poiDetailViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, C0906R.id.czc, "field 'tagLayout'", TagLayout.class);
    }
}
