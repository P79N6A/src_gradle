package com.bytedance.widget.ext.list;

import com.bytedance.viewholder.typesafe.TypeSafeViewHolder;
import com.bytedance.viewholder.typesafe.a;
import com.bytedance.widget.ext.list.ItemWidgetViewHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00028\u00000\t0\u0007¢\u0006\u0002\u0010\nJ\u0015\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/bytedance/widget/ext/list/ItemWidgetViewHolderFactoryManager;", "VH", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "Lcom/bytedance/viewholder/typesafe/ViewHolderFactoryManager;", "manager", "Lcom/bytedance/widget/WidgetManager;", "widgetFactory", "Lkotlin/Function1;", "", "Lcom/bytedance/widget/ext/list/ItemWidget;", "(Lcom/bytedance/widget/WidgetManager;Lkotlin/jvm/functions/Function1;)V", "provider", "Lcom/bytedance/widget/ext/list/ItemWidgetProvider;", "getProvider", "()Lcom/bytedance/widget/ext/list/ItemWidgetProvider;", "initViewHolder", "holder", "(Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;)Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "widget_ext_list_release"}, k = 1, mv = {1, 1, 13})
public final class d<VH extends ItemWidgetViewHolder<?>> extends a<VH> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final b f22923a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.widget.a f22924b;

    public final /* synthetic */ TypeSafeViewHolder a(TypeSafeViewHolder typeSafeViewHolder) {
        ItemWidgetViewHolder itemWidgetViewHolder = (ItemWidgetViewHolder) typeSafeViewHolder;
        Intrinsics.checkParameterIsNotNull(itemWidgetViewHolder, "holder");
        b bVar = this.f22923a;
        Intrinsics.checkParameterIsNotNull(bVar, "<set-?>");
        itemWidgetViewHolder.f2342a = bVar;
        com.bytedance.widget.a aVar = this.f22924b;
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        itemWidgetViewHolder.f2343b = aVar;
        return itemWidgetViewHolder;
    }

    public d(@NotNull com.bytedance.widget.a aVar, @NotNull Function1<? super Integer, ? extends ItemWidget<?, ? extends VH>> function1) {
        Intrinsics.checkParameterIsNotNull(aVar, "manager");
        Intrinsics.checkParameterIsNotNull(function1, "widgetFactory");
        this.f22924b = aVar;
        this.f22923a = new b(function1, this.f22924b);
    }
}
