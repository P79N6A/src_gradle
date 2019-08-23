package com.bytedance.jedi.ext.adapter.decorator;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/bytedance/jedi/ext/adapter/decorator/RawAdapterDecorator$onAttachedToRecyclerView$1", "Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;", "getSpanSize", "", "position", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class RawAdapterDecorator$onAttachedToRecyclerView$1 extends GridLayoutManager.SpanSizeLookup {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RawAdapterDecorator f21444a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ RecyclerView.LayoutManager f21445b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ GridLayoutManager.SpanSizeLookup f21446c;

    public final int getSpanSize(int i) {
        if (this.f21444a.a(this.f21444a.getItemViewType(i))) {
            return ((GridLayoutManager) this.f21445b).getSpanCount();
        }
        if (this.f21446c != null) {
            return this.f21446c.getSpanSize(i - this.f21444a.a());
        }
        return 1;
    }

    RawAdapterDecorator$onAttachedToRecyclerView$1(RawAdapterDecorator rawAdapterDecorator, RecyclerView.LayoutManager layoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
        this.f21444a = rawAdapterDecorator;
        this.f21445b = layoutManager;
        this.f21446c = spanSizeLookup;
    }
}
