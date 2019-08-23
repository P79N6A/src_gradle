package com.bytedance.widget.ext.list;

import com.bytedance.widget.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00052\u0006\u0010\u000e\u001a\u00020\u0004R\"\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00050\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bytedance/widget/ext/list/ItemWidgetProvider;", "", "itemWidgetFactory", "Lkotlin/Function1;", "", "Lcom/bytedance/widget/ext/list/ItemWidget;", "widgetManager", "Lcom/bytedance/widget/WidgetManager;", "(Lkotlin/jvm/functions/Function1;Lcom/bytedance/widget/WidgetManager;)V", "store", "Lcom/bytedance/widget/ext/list/ItemWidgetStore;", "getStore", "()Lcom/bytedance/widget/ext/list/ItemWidgetStore;", "get", "position", "widget_ext_list_release"}, k = 1, mv = {1, 1, 13})
public final class b {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final c f22919a;

    /* renamed from: b  reason: collision with root package name */
    final Function1<Integer, ItemWidget<?, ?>> f22920b;

    public b(@NotNull Function1<? super Integer, ? extends ItemWidget<?, ?>> function1, @NotNull a aVar) {
        Intrinsics.checkParameterIsNotNull(function1, "itemWidgetFactory");
        Intrinsics.checkParameterIsNotNull(aVar, "widgetManager");
        this.f22920b = function1;
        this.f22919a = new c(aVar);
    }
}
