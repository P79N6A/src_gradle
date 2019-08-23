package com.ss.android.ugc.aweme.poi.nearby.ui;

import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60098a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiTypeFilterDetailActivity f60099b;

    h(PoiTypeFilterDetailActivity poiTypeFilterDetailActivity) {
        this.f60099b = poiTypeFilterDetailActivity;
    }

    public final void onDismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f60098a, false, 65355, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60098a, false, 65355, new Class[0], Void.TYPE);
            return;
        }
        this.f60099b.f60076c.notifyDataSetChanged();
    }
}
