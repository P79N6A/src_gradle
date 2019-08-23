package com.ss.android.ugc.aweme.arch.widgets;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import java.util.ArrayList;

public abstract class WidgetListAdapter extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34347a;

    /* renamed from: b  reason: collision with root package name */
    protected WidgetManager f34348b;

    /* renamed from: c  reason: collision with root package name */
    protected DataCenter f34349c;

    /* renamed from: d  reason: collision with root package name */
    protected RecyclerView f34350d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<ListItemWidget> f34351e = new ArrayList<>();

    public abstract ListItemWidget b(int i);

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        return null;
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f34347a, false, 23774, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f34347a, false, 23774, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.f34350d = recyclerView2;
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f34347a, false, 23775, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f34347a, false, 23775, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        this.f34350d = null;
    }

    public final ListItemWidget a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34347a, false, 23777, new Class[]{Integer.TYPE}, ListItemWidget.class)) {
            return (ListItemWidget) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34347a, false, 23777, new Class[]{Integer.TYPE}, ListItemWidget.class);
        } else if (i < this.f34351e.size()) {
            return this.f34351e.get(i);
        } else {
            ListItemWidget b2 = b(i);
            this.f34348b.a((Widget) b2);
            this.f34351e.add(b2);
            return b2;
        }
    }

    public WidgetListAdapter(WidgetManager widgetManager, DataCenter dataCenter) {
        this.f34348b = widgetManager;
        this.f34349c = dataCenter;
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f34347a, false, 23776, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f34347a, false, 23776, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (viewHolder2 instanceof ItemWidgetViewHolder) {
            ItemWidgetViewHolder itemWidgetViewHolder = (ItemWidgetViewHolder) viewHolder2;
            ListItemWidget listItemWidget = itemWidgetViewHolder.f34345b;
            if (listItemWidget != null) {
                listItemWidget.f34346a = null;
            }
            ListItemWidget a2 = a(i);
            if (PatchProxy.isSupport(new Object[]{a2}, itemWidgetViewHolder, ItemWidgetViewHolder.f34344a, false, 23773, new Class[]{ListItemWidget.class}, Void.TYPE)) {
                ItemWidgetViewHolder itemWidgetViewHolder2 = itemWidgetViewHolder;
                PatchProxy.accessDispatch(new Object[]{a2}, itemWidgetViewHolder2, ItemWidgetViewHolder.f34344a, false, 23773, new Class[]{ListItemWidget.class}, Void.TYPE);
                return;
            }
            itemWidgetViewHolder.f34345b = a2;
            itemWidgetViewHolder.f34345b.a(itemWidgetViewHolder);
        }
    }
}
