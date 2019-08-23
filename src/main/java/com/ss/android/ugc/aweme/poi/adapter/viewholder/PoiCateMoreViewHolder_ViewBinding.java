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

public class PoiCateMoreViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59499a;

    /* renamed from: b  reason: collision with root package name */
    private PoiCateMoreViewHolder f59500b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f59499a, false, 64796, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59499a, false, 64796, new Class[0], Void.TYPE);
            return;
        }
        PoiCateMoreViewHolder poiCateMoreViewHolder = this.f59500b;
        if (poiCateMoreViewHolder != null) {
            this.f59500b = null;
            poiCateMoreViewHolder.mTxtMore = null;
            poiCateMoreViewHolder.mDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiCateMoreViewHolder_ViewBinding(PoiCateMoreViewHolder poiCateMoreViewHolder, View view) {
        this.f59500b = poiCateMoreViewHolder;
        poiCateMoreViewHolder.mTxtMore = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bzh, "field 'mTxtMore'", TextView.class);
        poiCateMoreViewHolder.mDivider = Utils.findRequiredView(view, C0906R.id.bzg, "field 'mDivider'");
    }
}
