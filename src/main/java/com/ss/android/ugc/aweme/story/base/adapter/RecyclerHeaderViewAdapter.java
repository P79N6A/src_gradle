package com.ss.android.ugc.aweme.story.base.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;

public abstract class RecyclerHeaderViewAdapter<DATA> extends BaseAdapter<DATA> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71900a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f71901b = 10000;

    /* renamed from: c  reason: collision with root package name */
    public static int f71902c = 20000;

    /* renamed from: f  reason: collision with root package name */
    private static final String f71903f = "com.ss.android.ugc.aweme.story.base.adapter.RecyclerHeaderViewAdapter";

    /* renamed from: d  reason: collision with root package name */
    public View f71904d;

    /* renamed from: e  reason: collision with root package name */
    public View f71905e;

    public int getBasicItemCount() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f71900a, false, 82201, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f71900a, false, 82201, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f71904d != null) {
            i = 1;
        }
        return super.getBasicItemCount() + i;
    }

    public int getBasicItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71900a, false, 82200, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71900a, false, 82200, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.f71904d == null && this.f71905e == null) {
            return 0;
        } else {
            if (this.f71904d != null && i == 0) {
                return f71901b;
            }
            if (i != getItemCount() - 1 || !this.mShowFooter) {
                return 0;
            }
            return f71902c;
        }
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f71900a, false, 82198, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f71900a, false, 82198, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (getItemViewType(i) != 0 && getItemViewType(i) == f71902c && (viewHolder instanceof LoadMoreRecyclerViewAdapter.LoadMoreViewHolder)) {
            ((LoadMoreRecyclerViewAdapter.LoadMoreViewHolder) viewHolder).a();
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f71900a, false, 82199, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f71900a, false, 82199, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (this.f71904d != null && i == f71901b) {
            return new HeaderHolder(this.f71904d);
        } else {
            if (this.f71905e == null || i != f71902c) {
                return null;
            }
            return onCreateFooterViewHolder(viewGroup);
        }
    }
}
