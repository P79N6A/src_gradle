package com.bytedance.jedi.ext.adapter;

import android.support.v7.util.ListUpdateCallback;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.jedi.ext.adapter.internal.e;
import com.bytedance.jedi.ext.adapter.multitype.a;
import com.bytedance.jedi.ext.adapter.multitype.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000*&\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002*\u0018\u0012\u0002\b\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003j\u0006\u0012\u0002\b\u0003`\u00052\u00020\u0006B#\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\"\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0016J\u0018\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0016J\u0018\u0010#\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0016R\u0010\u0010\u0007\u001a\u00028\u0000X\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/JediListUpdateCallback;", "T", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/bytedance/jedi/ext/adapter/multitype/GenericViewHolderFactoryManagerOwner;", "Lcom/bytedance/jedi/ext/adapter/JediViewHolderFactoryManager;", "Lcom/bytedance/jedi/ext/adapter/JediViewHolderFactoryManagerOwner;", "Landroid/support/v7/util/ListUpdateCallback;", "adapter", "positionMapper", "Lkotlin/Function1;", "", "(Landroid/support/v7/widget/RecyclerView$Adapter;Lkotlin/jvm/functions/Function1;)V", "Landroid/support/v7/widget/RecyclerView$Adapter;", "manager", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderItemInitiationStatusManager;", "getManager", "()Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderItemInitiationStatusManager;", "memento", "Lcom/bytedance/jedi/ext/adapter/multitype/LatestPositionMemento;", "getMemento", "()Lcom/bytedance/jedi/ext/adapter/multitype/LatestPositionMemento;", "proxyWidgetStore", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyStore;", "getProxyWidgetStore", "()Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyStore;", "onChanged", "", "position", "count", "payload", "", "onInserted", "onMoved", "from", "to", "onRemoved", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class JediListUpdateCallback<T extends RecyclerView.Adapter<?> & a<?, ? extends f<?>>> implements ListUpdateCallback {

    /* renamed from: a  reason: collision with root package name */
    private final T f21431a;

    /* renamed from: b  reason: collision with root package name */
    private final Function1<Integer, Integer> f21432b;

    private final com.bytedance.jedi.ext.adapter.internal.a a() {
        return ((f) ((a) this.f21431a).b()).f21470a;
    }

    private final e b() {
        return ((f) ((a) this.f21431a).b()).f21471b.f21490b;
    }

    private final b c() {
        return ((f) ((a) this.f21431a).b()).f21501c;
    }

    public JediListUpdateCallback(@NotNull T t, @NotNull Function1<? super Integer, Integer> function1) {
        Intrinsics.checkParameterIsNotNull(t, "adapter");
        Intrinsics.checkParameterIsNotNull(function1, "positionMapper");
        this.f21431a = t;
        this.f21432b = function1;
    }

    public final void onInserted(int i, int i2) {
        if (i2 != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i + i3;
                a().a(i4, false);
                b().a(i4, null);
            }
            c().a();
            int intValue = ((Number) this.f21432b.invoke(Integer.valueOf(i))).intValue();
            this.f21431a.notifyItemRangeInserted(intValue, i2);
            c().a(intValue);
        }
    }

    public final void onMoved(int i, int i2) {
        List<Boolean> list = a().f21483a;
        if (i < list.size() && i2 < list.size()) {
            boolean booleanValue = list.get(i).booleanValue();
            list.set(i, list.get(i2));
            list.set(i2, Boolean.valueOf(booleanValue));
        }
        List<JediViewHolderProxy> list2 = b().f21492a;
        if (i < list2.size() && i2 < list2.size()) {
            list2.set(i, list2.get(i2));
            list2.set(i2, list2.get(i));
        }
        this.f21431a.notifyItemMoved(((Number) this.f21432b.invoke(Integer.valueOf(i))).intValue(), ((Number) this.f21432b.invoke(Integer.valueOf(i2))).intValue());
    }

    public final void onRemoved(int i, int i2) {
        if (i2 != 0) {
            com.bytedance.jedi.ext.adapter.internal.a a2 = a();
            if (i != 0 || i2 < a2.f21483a.size()) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (i < a2.f21483a.size()) {
                        a2.f21483a.remove(i);
                    }
                    e b2 = b();
                    if (i < b2.f21492a.size()) {
                        JediViewHolderProxy remove = b2.f21492a.remove(i);
                        if (remove != null) {
                            b2.f21493b.b(remove);
                        }
                    }
                }
                this.f21431a.notifyItemRangeRemoved(((Number) this.f21432b.invoke(Integer.valueOf(i))).intValue(), i2);
                return;
            }
            if (a2.f21483a.size() != 0) {
                a2.f21483a.clear();
            }
            e b3 = b();
            if (b3.f21492a.size() != 0) {
                for (JediViewHolderProxy jediViewHolderProxy : b3.f21492a) {
                    if (jediViewHolderProxy != null) {
                        b3.f21493b.b(jediViewHolderProxy);
                    }
                }
                b3.f21492a.clear();
            }
            this.f21431a.notifyDataSetChanged();
        }
    }

    public final void onChanged(int i, int i2, @Nullable Object obj) {
        this.f21431a.notifyItemRangeChanged(((Number) this.f21432b.invoke(Integer.valueOf(i))).intValue(), i2, TuplesKt.to(obj, c.a()));
    }
}
