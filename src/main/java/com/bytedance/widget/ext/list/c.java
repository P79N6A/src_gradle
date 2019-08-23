package com.bytedance.widget.ext.list;

import com.bytedance.widget.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u000e\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\tJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tH\u0002J \u0010\u0011\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0010\u0010\u0012\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0007J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tJ\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tJ \u0010\u0017\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u000e\u0010\u0012\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007H\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/bytedance/widget/ext/list/ItemWidgetStore;", "", "widgetManager", "Lcom/bytedance/widget/WidgetManager;", "(Lcom/bytedance/widget/WidgetManager;)V", "itemWidgetList", "", "Lcom/bytedance/widget/ext/list/ItemWidget;", "widgetsCount", "", "getWidgetsCount", "()I", "clear", "", "get", "position", "insert", "put", "widget", "remove", "swap", "from", "to", "update", "widget_ext_list_release"}, k = 1, mv = {1, 1, 13})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    final List<ItemWidget<?, ?>> f22921a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    final a f22922b;

    private final void a(int i) {
        this.f22921a.add(i, null);
    }

    public c(@NotNull a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "widgetManager");
        this.f22922b = aVar;
    }

    private final void b(int i, ItemWidget<?, ?> itemWidget) {
        if (i < this.f22921a.size()) {
            this.f22921a.set(i, itemWidget);
        } else {
            this.f22921a.add(i, itemWidget);
        }
    }

    public final void a(int i, @Nullable ItemWidget<?, ?> itemWidget) {
        if (i >= 0 && i <= this.f22921a.size()) {
            if (itemWidget == null) {
                a(i);
            } else {
                b(i, itemWidget);
            }
        }
    }
}
