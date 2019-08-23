package com.bytedance.widget.ext.list;

import android.view.View;
import com.bytedance.viewholder.typesafe.TypeSafeViewHolder;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001b\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0018H\u0016R\"\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR%\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010\u00078G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "ITEM", "Lcom/bytedance/viewholder/typesafe/TypeSafeViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "currentWidget", "Lcom/bytedance/widget/ext/list/ItemWidget;", "itemWidgetProvider", "Lcom/bytedance/widget/ext/list/ItemWidgetProvider;", "getItemWidgetProvider$widget_ext_list_release", "()Lcom/bytedance/widget/ext/list/ItemWidgetProvider;", "setItemWidgetProvider$widget_ext_list_release", "(Lcom/bytedance/widget/ext/list/ItemWidgetProvider;)V", "widget", "getWidget", "()Lcom/bytedance/widget/ext/list/ItemWidget;", "widgetManager", "Lcom/bytedance/widget/WidgetManager;", "getWidgetManager$widget_ext_list_release", "()Lcom/bytedance/widget/WidgetManager;", "setWidgetManager$widget_ext_list_release", "(Lcom/bytedance/widget/WidgetManager;)V", "attachToWindow", "", "bind", "item", "position", "", "(Ljava/lang/Object;I)V", "detachFromWindow", "widget_ext_list_release"}, k = 1, mv = {1, 1, 13})
@Deprecated(level = a.WARNING, message = "do not use ItemWidget, use JediViewHolder instead")
public class ItemWidgetViewHolder<ITEM> extends TypeSafeViewHolder<ITEM> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public b f2342a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.widget.a f2343b;

    /* renamed from: c  reason: collision with root package name */
    public ItemWidget<ITEM, ItemWidgetViewHolder<ITEM>> f2344c;

    public final void a() {
        super.a();
        ItemWidget<ITEM, ItemWidgetViewHolder<ITEM>> itemWidget = this.f2344c;
        if (itemWidget != null) {
            itemWidget.a(this);
        }
    }

    public final void b() {
        super.b();
        ItemWidget<ITEM, ItemWidgetViewHolder<ITEM>> itemWidget = this.f2344c;
        if (itemWidget != null) {
            itemWidget.f2338f = null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemWidgetViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.bytedance.widget.ext.list.ItemWidget<ITEM, com.bytedance.widget.ext.list.ItemWidgetViewHolder<ITEM>>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(ITEM r5, int r6) {
        /*
            r4 = this;
            com.bytedance.widget.ext.list.b r0 = r4.f2342a
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "itemWidgetProvider"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0009:
            com.bytedance.widget.ext.list.c r1 = r0.f22919a
            r2 = 0
            if (r6 < 0) goto L_0x001f
            java.util.List<com.bytedance.widget.ext.list.ItemWidget<?, ?>> r3 = r1.f22921a
            int r3 = r3.size()
            if (r6 >= r3) goto L_0x001f
            java.util.List<com.bytedance.widget.ext.list.ItemWidget<?, ?>> r1 = r1.f22921a
            java.lang.Object r1 = r1.get(r6)
            com.bytedance.widget.ext.list.ItemWidget r1 = (com.bytedance.widget.ext.list.ItemWidget) r1
            goto L_0x0020
        L_0x001f:
            r1 = r2
        L_0x0020:
            boolean r3 = r1 instanceof com.bytedance.widget.ext.list.ItemWidget
            if (r3 != 0) goto L_0x0025
            r1 = r2
        L_0x0025:
            if (r1 != 0) goto L_0x0045
            kotlin.jvm.functions.Function1<java.lang.Integer, com.bytedance.widget.ext.list.ItemWidget<?, ?>> r1 = r0.f22920b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            java.lang.Object r1 = r1.invoke(r3)
            r3 = r1
            com.bytedance.widget.ext.list.ItemWidget r3 = (com.bytedance.widget.ext.list.ItemWidget) r3
            com.bytedance.widget.ext.list.c r0 = r0.f22919a
            r0.a(r6, r3)
            if (r1 == 0) goto L_0x003d
            r1 = r3
            goto L_0x0045
        L_0x003d:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException
            java.lang.String r6 = "null cannot be cast to non-null type com.bytedance.widget.ext.list.ItemWidget<kotlin.Any, *>"
            r5.<init>(r6)
            throw r5
        L_0x0045:
            if (r1 == 0) goto L_0x006a
            com.bytedance.widget.ext.list.ItemWidget<ITEM, com.bytedance.widget.ext.list.ItemWidgetViewHolder<ITEM>> r6 = r4.f2344c
            if (r1 == r6) goto L_0x005d
            com.bytedance.widget.ext.list.ItemWidget<ITEM, com.bytedance.widget.ext.list.ItemWidgetViewHolder<ITEM>> r6 = r4.f2344c
            if (r6 == 0) goto L_0x005b
            com.bytedance.widget.a r0 = r4.f2343b
            if (r0 != 0) goto L_0x0058
            java.lang.String r3 = "widgetManager"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0058:
            r6.a(r0, r2, r5)
        L_0x005b:
            r4.f2344c = r1
        L_0x005d:
            com.bytedance.widget.a r6 = r4.f2343b
            if (r6 != 0) goto L_0x0066
            java.lang.String r0 = "widgetManager"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x0066:
            r1.a(r6, r4, r5)
            return
        L_0x006a:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException
            java.lang.String r6 = "null cannot be cast to non-null type com.bytedance.widget.ext.list.ItemWidget<ITEM, com.bytedance.widget.ext.list.ItemWidgetViewHolder<ITEM>>"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.widget.ext.list.ItemWidgetViewHolder.a(java.lang.Object, int):void");
    }
}
