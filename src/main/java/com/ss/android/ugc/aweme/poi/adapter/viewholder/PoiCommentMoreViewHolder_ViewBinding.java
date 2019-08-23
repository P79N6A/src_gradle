package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PoiCommentMoreViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59522a;

    /* renamed from: b  reason: collision with root package name */
    private PoiCommentMoreViewHolder f59523b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f59522a, false, 64804, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59522a, false, 64804, new Class[0], Void.TYPE);
            return;
        }
        PoiCommentMoreViewHolder poiCommentMoreViewHolder = this.f59523b;
        if (poiCommentMoreViewHolder != null) {
            this.f59523b = null;
            poiCommentMoreViewHolder.mTxtMore = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiCommentMoreViewHolder_ViewBinding(PoiCommentMoreViewHolder poiCommentMoreViewHolder, View view) {
        this.f59523b = poiCommentMoreViewHolder;
        poiCommentMoreViewHolder.mTxtMore = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bzt, "field 'mTxtMore'", TextView.class);
    }
}
