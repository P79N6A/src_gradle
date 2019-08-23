package com.bytedance.widget.ext.list;

import android.support.v7.util.ListUpdateCallback;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import com.bytedance.widget.ext.list.e;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002*\u0006\u0012\u0002\b\u00030\u00032\u00020\u0004B#\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0016J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0016R\u0010\u0010\u0005\u001a\u00028\u0000X\u0004¢\u0006\u0004\n\u0002\u0010\nR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/bytedance/widget/ext/list/ItemWidgetListUpdateCallback;", "T", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolderFactoryManagerOwner;", "Landroid/support/v7/util/ListUpdateCallback;", "adapter", "positionMapper", "Lkotlin/Function1;", "", "(Landroid/support/v7/widget/RecyclerView$Adapter;Lkotlin/jvm/functions/Function1;)V", "Landroid/support/v7/widget/RecyclerView$Adapter;", "store", "Lcom/bytedance/widget/ext/list/ItemWidgetStore;", "getStore", "()Lcom/bytedance/widget/ext/list/ItemWidgetStore;", "onChanged", "", "positionStart", "itemCount", "payload", "", "onInserted", "position", "count", "onMoved", "from", "to", "onRemoved", "widget_ext_list_release"}, k = 1, mv = {1, 1, 13})
@Deprecated(level = a.WARNING, message = "do not use ItemWidget, use JediViewHolder instead")
public final class ItemWidgetListUpdateCallback<T extends RecyclerView.Adapter<?> & e<?>> implements ListUpdateCallback {

    /* renamed from: a  reason: collision with root package name */
    private final T f2340a;

    /* renamed from: b  reason: collision with root package name */
    private final Function1<Integer, Integer> f2341b;

    public final void onChanged(int i, int i2, @Nullable Object obj) {
    }

    private final c a() {
        return ((e) this.f2340a).b().f22923a.f22919a;
    }

    public ItemWidgetListUpdateCallback(@NotNull T t, @NotNull Function1<? super Integer, Integer> function1) {
        Intrinsics.checkParameterIsNotNull(t, "adapter");
        Intrinsics.checkParameterIsNotNull(function1, "positionMapper");
        this.f2340a = t;
        this.f2341b = function1;
    }

    public final void onInserted(int i, int i2) {
        if (i2 != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                a().a(i + i3, null);
            }
            this.f2340a.notifyItemRangeInserted(((Number) this.f2341b.invoke(Integer.valueOf(i))).intValue(), i2);
        }
    }

    public final void onMoved(int i, int i2) {
        List<ItemWidget<?, ?>> list = a().f22921a;
        if (i < list.size() && i2 < list.size()) {
            list.set(i, list.get(i2));
            list.set(i2, list.get(i));
        }
        this.f2340a.notifyItemMoved(((Number) this.f2341b.invoke(Integer.valueOf(i))).intValue(), ((Number) this.f2341b.invoke(Integer.valueOf(i2))).intValue());
    }

    public final void onRemoved(int i, int i2) {
        if (i2 != 0) {
            c a2 = a();
            if (i != 0 || i2 < a2.f22921a.size()) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (i < a2.f22921a.size()) {
                        ItemWidget remove = a2.f22921a.remove(i);
                        if (remove != null) {
                            a2.f22922b.b(remove);
                        }
                    }
                }
                this.f2340a.notifyItemRangeRemoved(((Number) this.f2341b.invoke(Integer.valueOf(i))).intValue(), i2);
                return;
            }
            if (a2.f22921a.size() != 0) {
                for (ItemWidget itemWidget : a2.f22921a) {
                    if (itemWidget != null) {
                        a2.f22922b.b(itemWidget);
                    }
                }
                a2.f22921a.clear();
            }
            this.f2340a.notifyDataSetChanged();
        }
    }
}
