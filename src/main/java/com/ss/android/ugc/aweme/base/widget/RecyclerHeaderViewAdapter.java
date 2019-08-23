package com.ss.android.ugc.aweme.base.widget;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;

public abstract class RecyclerHeaderViewAdapter<DATA> extends BaseAdapter<DATA> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35102a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f35103b = 10000;

    /* renamed from: c  reason: collision with root package name */
    public static int f35104c = 20000;

    /* renamed from: d  reason: collision with root package name */
    public View f35105d;

    /* renamed from: e  reason: collision with root package name */
    public View f35106e;

    public RecyclerView.ViewHolder a(ViewGroup viewGroup, int i) {
        return null;
    }

    public void a(RecyclerView.ViewHolder viewHolder, int i) {
    }

    public final boolean c() {
        if (this.f35105d != null) {
            return true;
        }
        return false;
    }

    public RecyclerHeaderViewAdapter() {
        this.spanSizeLookup = new GridLayoutManager.SpanSizeLookup() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35107a;

            public int getSpanSize(int i) {
                int i2 = i;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f35107a, false, 25436, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f35107a, false, 25436, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                }
                if (i2 == 0) {
                    if (RecyclerHeaderViewAdapter.this.getBasicItemViewType(i2) == RecyclerHeaderViewAdapter.f35103b) {
                        return 2;
                    }
                }
                return 1;
            }
        };
        setLoadEmptyTextResId(C0906R.string.a3f);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f35102a, false, 25430, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35102a, false, 25430, new Class[0], Void.TYPE);
            return;
        }
        if (this.f35105d != null) {
            f35103b++;
            this.f35105d = null;
            notifyItemRemoved(0);
        }
    }

    public int getBasicItemCount() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f35102a, false, 25435, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f35102a, false, 25435, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f35105d != null) {
            i = 1;
        }
        return super.getBasicItemCount() + i;
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f35102a, false, 25429, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f35102a, false, 25429, new Class[]{View.class}, Void.TYPE);
        } else if (view != null) {
            this.f35105d = view;
            notifyItemInserted(0);
        }
    }

    public int getBasicItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f35102a, false, 25434, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f35102a, false, 25434, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.f35105d == null && this.f35106e == null) {
            return 0;
        } else {
            if (i == 0) {
                return f35103b;
            }
            if (!this.mShowFooter || i != getItemCount() - 1) {
                return 0;
            }
            return f35104c;
        }
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f35102a, false, 25432, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f35102a, false, 25432, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (getItemViewType(i) == 0) {
            if (this.f35105d == null || i == 0) {
                i2 = i;
            } else {
                i2 = i - 1;
            }
            a(viewHolder, i2);
        } else {
            if (getItemViewType(i) == f35104c && (viewHolder instanceof LoadMoreRecyclerViewAdapter.LoadMoreViewHolder)) {
                ((LoadMoreRecyclerViewAdapter.LoadMoreViewHolder) viewHolder).a();
            }
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f35102a, false, 25433, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f35102a, false, 25433, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (this.f35105d != null && i == f35103b) {
            return new HeaderHolder(this.f35105d);
        } else {
            if (this.f35106e == null || i != f35104c) {
                return a(viewGroup, i);
            }
            return onCreateFooterViewHolder(viewGroup);
        }
    }
}
