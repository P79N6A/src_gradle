package com.ss.android.ugc.aweme.discover.base;

import android.support.v7.widget.GridLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/discover/base/HeaderAndFooterWrapper$onAttachedToRecyclerView$1", "Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;", "getSpanSize", "", "position", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HeaderAndFooterWrapper$onAttachedToRecyclerView$1 extends GridLayoutManager.SpanSizeLookup {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42118a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HeaderAndFooterWrapper f42119b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ GridLayoutManager f42120c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ GridLayoutManager.SpanSizeLookup f42121d;

    public final int getSpanSize(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42118a, false, 36124, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42118a, false, 36124, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.f42119b.a(this.f42119b.getItemViewType(i))) {
            GridLayoutManager gridLayoutManager = this.f42120c;
            if (gridLayoutManager != null) {
                return gridLayoutManager.getSpanCount();
            }
        } else if (this.f42121d != null) {
            return this.f42121d.getSpanSize(i - this.f42119b.a());
        }
        return 1;
    }

    HeaderAndFooterWrapper$onAttachedToRecyclerView$1(HeaderAndFooterWrapper headerAndFooterWrapper, GridLayoutManager gridLayoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
        this.f42119b = headerAndFooterWrapper;
        this.f42120c = gridLayoutManager;
        this.f42121d = spanSizeLookup;
    }
}
