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

public class PoiCateTitleViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59507a;

    /* renamed from: b  reason: collision with root package name */
    private PoiCateTitleViewHolder f59508b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f59507a, false, 64799, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59507a, false, 64799, new Class[0], Void.TYPE);
            return;
        }
        PoiCateTitleViewHolder poiCateTitleViewHolder = this.f59508b;
        if (poiCateTitleViewHolder != null) {
            this.f59508b = null;
            poiCateTitleViewHolder.mTxtTitle = null;
            poiCateTitleViewHolder.mMoreTxt = null;
            poiCateTitleViewHolder.mMoreArrow = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiCateTitleViewHolder_ViewBinding(PoiCateTitleViewHolder poiCateTitleViewHolder, View view) {
        this.f59508b = poiCateTitleViewHolder;
        poiCateTitleViewHolder.mTxtTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bzj, "field 'mTxtTitle'", TextView.class);
        poiCateTitleViewHolder.mMoreTxt = Utils.findRequiredView(view, C0906R.id.bzh, "field 'mMoreTxt'");
        poiCateTitleViewHolder.mMoreArrow = Utils.findRequiredView(view, C0906R.id.bzi, "field 'mMoreArrow'");
    }
}
