package com.ss.android.ugc.aweme.common.adapter;

import android.support.v7.widget.RecyclerView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseAdapter<T> extends LoadMoreRecyclerViewAdapter {
    static final String TAG = "BaseAdapter";
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<T> mItems;
    protected int mPreviousCount;

    public List<T> getData() {
        return this.mItems;
    }

    public BaseAdapter() {
        registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40171a;

            public void onChanged() {
                if (PatchProxy.isSupport(new Object[0], this, f40171a, false, 33378, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40171a, false, 33378, new Class[0], Void.TYPE);
                    return;
                }
                BaseAdapter.this.mPreviousCount = BaseAdapter.this.getItemCount();
            }

            public void onItemRangeChanged(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f40171a, false, 33379, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f40171a, false, 33379, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                BaseAdapter.this.mPreviousCount = BaseAdapter.this.getItemCount();
            }

            public void onItemRangeInserted(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f40171a, false, 33380, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f40171a, false, 33380, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                BaseAdapter.this.mPreviousCount = BaseAdapter.this.getItemCount();
            }

            public void onItemRangeRemoved(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f40171a, false, 33381, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f40171a, false, 33381, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                BaseAdapter.this.mPreviousCount = BaseAdapter.this.getItemCount();
            }

            public void onItemRangeMoved(int i, int i2, int i3) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40171a, false, 33382, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40171a, false, 33382, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                BaseAdapter.this.mPreviousCount = BaseAdapter.this.getItemCount();
            }
        });
    }

    public void clearData() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33372, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33372, new Class[0], Void.TYPE);
            return;
        }
        if (this.mItems != null) {
            this.mItems.clear();
            notifyDataSetChanged();
        }
    }

    public int getBasicItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33377, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33377, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mItems == null) {
            return 0;
        } else {
            return this.mItems.size();
        }
    }

    public void setData(List<T> list) {
        List<T> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 33370, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 33370, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.mItems = list2;
        notifyDataSetChanged();
    }

    public void setDataAfterLoadLatest(List<T> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 33374, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 33374, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.mItems = list;
        notifyItemRangeInserted(0, getItemCount() - this.mPreviousCount);
    }

    public void addData(List<T> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 33376, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 33376, new Class[]{List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list)) {
            if (this.mItems == null) {
                this.mItems = new ArrayList();
            }
            this.mItems.addAll(list);
            notifyDataSetChanged();
        }
    }

    public void onShowFooterChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 33371, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 33371, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            notifyItemInserted(getItemCount() - 1);
        } else {
            notifyItemRemoved(getItemCount());
        }
        this.mPreviousCount = getItemCount();
    }

    public void setDataAfterLoadMore(List<T> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 33373, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 33373, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.mItems = list;
        if (this.mShowFooter) {
            notifyItemRangeInserted(this.mPreviousCount - 1, getItemCount() - this.mPreviousCount);
            notifyItemChanged(getItemCount() - 1);
            return;
        }
        notifyItemRangeInserted(this.mPreviousCount, getItemCount() - this.mPreviousCount);
    }

    public void insertData(T t, int i) {
        if (PatchProxy.isSupport(new Object[]{t, Integer.valueOf(i)}, this, changeQuickRedirect, false, 33375, new Class[]{Object.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t, Integer.valueOf(i)}, this, changeQuickRedirect, false, 33375, new Class[]{Object.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mItems == null) {
            this.mItems = new ArrayList();
        }
        this.mItems.add(i, t);
        notifyItemInserted(i);
    }
}
