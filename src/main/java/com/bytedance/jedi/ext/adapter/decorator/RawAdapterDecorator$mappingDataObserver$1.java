package com.bytedance.jedi.ext.adapter.decorator;

import android.support.v7.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"com/bytedance/jedi/ext/adapter/decorator/RawAdapterDecorator$mappingDataObserver$1", "Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;", "onChanged", "", "onItemRangeChanged", "positionStart", "", "itemCount", "payload", "", "onItemRangeInserted", "onItemRangeMoved", "fromPosition", "toPosition", "onItemRangeRemoved", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class RawAdapterDecorator$mappingDataObserver$1 extends RecyclerView.AdapterDataObserver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RawAdapterDecorator f21443a;

    public final void onChanged() {
        this.f21443a.notifyDataSetChanged();
    }

    public final void onItemRangeChanged(int i, int i2) {
        onItemRangeChanged(i, i2, null);
    }

    public final void onItemRangeInserted(int i, int i2) {
        RawAdapterDecorator rawAdapterDecorator = this.f21443a;
        rawAdapterDecorator.notifyItemRangeInserted(i + rawAdapterDecorator.a(), i2);
    }

    public final void onItemRangeRemoved(int i, int i2) {
        RawAdapterDecorator rawAdapterDecorator = this.f21443a;
        rawAdapterDecorator.notifyItemRangeRemoved(i + rawAdapterDecorator.a(), i2);
    }

    public final void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
        RawAdapterDecorator rawAdapterDecorator = this.f21443a;
        rawAdapterDecorator.notifyItemRangeChanged(i + rawAdapterDecorator.a(), i2, obj);
    }

    public final void onItemRangeMoved(int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            RawAdapterDecorator rawAdapterDecorator = this.f21443a;
            rawAdapterDecorator.notifyItemMoved(rawAdapterDecorator.a() + i + i4, this.f21443a.a() + i2 + i4);
        }
    }
}
