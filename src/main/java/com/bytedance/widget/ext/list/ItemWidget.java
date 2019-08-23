package com.bytedance.widget.ext.list;

import android.arch.lifecycle.ItemViewModelStore;
import android.support.annotation.CallSuper;
import com.bytedance.widget.Widget;
import com.bytedance.widget.ext.list.ItemWidgetViewHolder;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J/\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00028\u0001H\u0017¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0018H\u0016J\b\u0010 \u001a\u00020\u0018H\u0017J\u0019\u0010!\u001a\u00020\u0018*\u00028\u00012\u0006\u0010\f\u001a\u00028\u0000H$¢\u0006\u0002\u0010\"J\u0011\u0010#\u001a\u00020\u0018*\u00028\u0001H\u0014¢\u0006\u0002\u0010\u001eR\u0016\u0010\u0007\u001a\u0004\u0018\u00018\u00018DX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00018\u0001X\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\u00028\u00008DX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/bytedance/widget/ext/list/ItemWidget;", "ITEM", "VH", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "Lcom/bytedance/widget/Widget;", "Lcom/bytedance/widget/ext/list/ItemViewModelStoreOwner;", "()V", "holder", "getHolder", "()Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "holderInternal", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "item", "getItem", "()Ljava/lang/Object;", "itemInternal", "Ljava/lang/Object;", "realStore", "Lkotlin/Lazy;", "Landroid/arch/lifecycle/ItemViewModelStore;", "store", "getStore", "()Landroid/arch/lifecycle/ItemViewModelStore;", "bindViewHolder", "", "widgetManager", "Lcom/bytedance/widget/WidgetManager;", "bindViewHolder$widget_ext_list_release", "(Lcom/bytedance/widget/WidgetManager;Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;Ljava/lang/Object;)V", "onAttachedToWindow", "(Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;)V", "onDestroy", "onDetachedFromWindow", "onBindViewHolder", "(Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;Ljava/lang/Object;)V", "onUnbindViewHolder", "widget_ext_list_release"}, k = 1, mv = {1, 1, 13})
@Deprecated(level = kotlin.a.WARNING, message = "do not use ItemWidget, use JediViewHolder instead")
public abstract class ItemWidget<ITEM, VH extends ItemWidgetViewHolder<ITEM>> extends Widget {

    /* renamed from: f  reason: collision with root package name */
    public VH f2338f;
    private ITEM g;
    private final Lazy<ItemViewModelStore> h = LazyKt.lazy(a.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/ItemViewModelStore;", "ITEM", "VH", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class a extends Lambda implements Function0<ItemViewModelStore> {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        @NotNull
        public final ItemViewModelStore invoke() {
            return new ItemViewModelStore();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(@NotNull VH vh, ITEM item);

    public final ITEM l() {
        ITEM item = this.g;
        if (item == null) {
            Intrinsics.throwNpe();
        }
        return item;
    }

    @NotNull
    public final ItemViewModelStore m() {
        return (ItemViewModelStore) this.h.getValue();
    }

    public final void i() {
        super.i();
        if (this.h.isInitialized()) {
            m().clear();
        }
    }

    @CallSuper
    public void a(@NotNull VH vh) {
        Intrinsics.checkParameterIsNotNull(vh, "holder");
        this.f2338f = vh;
    }

    public final void a(@NotNull com.bytedance.widget.a aVar, @Nullable ItemWidgetViewHolder<ITEM> itemWidgetViewHolder, ITEM item) {
        Intrinsics.checkParameterIsNotNull(aVar, "widgetManager");
        if (itemWidgetViewHolder != null) {
            this.f2338f = itemWidgetViewHolder;
            this.g = item;
            aVar.a(this);
            a(itemWidgetViewHolder, item);
            return;
        }
        VH vh = this.f2338f;
        if (vh != null) {
            Intrinsics.checkParameterIsNotNull(vh, "receiver$0");
        }
        this.f2338f = null;
    }
}
