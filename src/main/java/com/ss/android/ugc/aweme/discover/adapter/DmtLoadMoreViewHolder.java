package com.ss.android.ugc.aweme.discover.adapter;

import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class DmtLoadMoreViewHolder extends LoadMoreViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41609a;

    /* renamed from: b  reason: collision with root package name */
    DmtStatusView f41610b;

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41609a, false, 35570, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41609a, false, 35570, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (i) {
            case 0:
                this.f41610b.b();
                break;
            case 1:
                this.f41610b.d();
                return;
            case 2:
                this.f41610b.f();
                return;
            case 3:
                this.f41610b.e();
                return;
        }
    }
}
