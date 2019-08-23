package com.ss.android.ugc.aweme.poi.nearby.ui;

import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60092a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiRankListActivity f60093b;

    e(PoiRankListActivity poiRankListActivity) {
        this.f60093b = poiRankListActivity;
    }

    public final void onDismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f60092a, false, 65300, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60092a, false, 65300, new Class[0], Void.TYPE);
            return;
        }
        this.f60093b.f60051c.notifyDataSetChanged();
    }
}
