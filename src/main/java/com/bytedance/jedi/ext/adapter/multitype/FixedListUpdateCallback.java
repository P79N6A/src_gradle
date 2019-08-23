package com.bytedance.jedi.ext.adapter.multitype;

import android.support.v7.util.ListUpdateCallback;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import com.bytedance.jedi.ext.adapter.multitype.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000*&\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002*\u0018\u0012\u0002\b\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003j\u0006\u0012\u0002\b\u0003`\u00052\u00020\u0006B#\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0016J\u0018\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0016R\u0010\u0010\u0007\u001a\u00028\u0000X\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/multitype/FixedListUpdateCallback;", "T", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/bytedance/jedi/ext/adapter/multitype/GenericViewHolderFactoryManagerOwner;", "Lcom/bytedance/jedi/ext/adapter/multitype/ViewHolderFactoryManager;", "Lcom/bytedance/jedi/ext/adapter/multitype/ViewHolderFactoryManagerOwner;", "Landroid/support/v7/util/ListUpdateCallback;", "adapter", "positionMapper", "Lkotlin/Function1;", "", "(Landroid/support/v7/widget/RecyclerView$Adapter;Lkotlin/jvm/functions/Function1;)V", "Landroid/support/v7/widget/RecyclerView$Adapter;", "memento", "Lcom/bytedance/jedi/ext/adapter/multitype/LatestPositionMemento;", "getMemento", "()Lcom/bytedance/jedi/ext/adapter/multitype/LatestPositionMemento;", "onChanged", "", "position", "count", "payload", "", "onInserted", "onMoved", "from", "to", "onRemoved", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class FixedListUpdateCallback<T extends RecyclerView.Adapter<?> & a<?, ? extends c<?>>> implements ListUpdateCallback {

    /* renamed from: a  reason: collision with root package name */
    private final T f21494a;

    /* renamed from: b  reason: collision with root package name */
    private final Function1<Integer, Integer> f21495b;

    private final b a() {
        return ((a) this.f21494a).b().f21501c;
    }

    public final void onRemoved(int i, int i2) {
        if (i2 != 0) {
            this.f21494a.notifyItemRangeRemoved(((Number) this.f21495b.invoke(Integer.valueOf(i))).intValue(), i2);
        }
    }

    public final void onInserted(int i, int i2) {
        if (i2 != 0) {
            a().a();
            int intValue = ((Number) this.f21495b.invoke(Integer.valueOf(i))).intValue();
            this.f21494a.notifyItemRangeInserted(intValue, i2);
            a().a(intValue);
        }
    }

    public final void onMoved(int i, int i2) {
        this.f21494a.notifyItemMoved(((Number) this.f21495b.invoke(Integer.valueOf(i))).intValue(), ((Number) this.f21495b.invoke(Integer.valueOf(i2))).intValue());
    }

    public final void onChanged(int i, int i2, @Nullable Object obj) {
        this.f21494a.notifyItemRangeChanged(((Number) this.f21495b.invoke(Integer.valueOf(i))).intValue(), i2, obj);
    }
}
