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
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;

public class LocationCellBViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44745a;

    /* renamed from: b  reason: collision with root package name */
    private LocationCellBViewHolder f44746b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f44745a, false, 40567, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44745a, false, 40567, new Class[0], Void.TYPE);
            return;
        }
        LocationCellBViewHolder locationCellBViewHolder = this.f44746b;
        if (locationCellBViewHolder != null) {
            this.f44746b = null;
            locationCellBViewHolder.mAvHeadView = null;
            locationCellBViewHolder.mTvLocation = null;
            locationCellBViewHolder.txtDistance = null;
            locationCellBViewHolder.mTvName = null;
            locationCellBViewHolder.tagLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public LocationCellBViewHolder_ViewBinding(LocationCellBViewHolder locationCellBViewHolder, View view) {
        this.f44746b = locationCellBViewHolder;
        locationCellBViewHolder.mAvHeadView = (AvatarImageView) Utils.findRequiredViewAsType(view, C0906R.id.hk, "field 'mAvHeadView'", AvatarImageView.class);
        locationCellBViewHolder.mTvLocation = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bjq, "field 'mTvLocation'", TextView.class);
        locationCellBViewHolder.txtDistance = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dmw, "field 'txtDistance'", TextView.class);
        locationCellBViewHolder.mTvName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.awq, "field 'mTvName'", TextView.class);
        locationCellBViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, C0906R.id.czc, "field 'tagLayout'", TagLayout.class);
    }
}
