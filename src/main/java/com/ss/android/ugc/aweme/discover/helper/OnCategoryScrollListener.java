package com.ss.android.ugc.aweme.discover.helper;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.discover.adapter.CategoryListAdapter;
import com.ss.android.ugc.aweme.discover.adapter.CategoryNewViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.CategoryViewHolder;

public class OnCategoryScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42300a;

    /* renamed from: b  reason: collision with root package name */
    public a f42301b;

    /* renamed from: c  reason: collision with root package name */
    private int f42302c;

    /* renamed from: d  reason: collision with root package name */
    private int f42303d = ViewConfiguration.get(k.a()).getScaledTouchSlop();

    public interface a {
        void a();
    }

    public final boolean a() {
        if (this.f42302c == 0) {
            return true;
        }
        return false;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f42300a, false, 36335, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f42300a, false, 36335, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (i == 0) {
            a(recyclerView, true);
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            if (!(this.f42302c == 0 || findFirstVisibleItemPosition != 0 || this.f42301b == null)) {
                this.f42301b.a();
            }
            this.f42302c = findFirstVisibleItemPosition;
        }
    }

    public final void a(RecyclerView recyclerView, boolean z) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f42300a, false, 36337, new Class[]{RecyclerView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Byte.valueOf(z)}, this, f42300a, false, 36337, new Class[]{RecyclerView.class, Boolean.TYPE}, Void.TYPE);
        } else if (recyclerView2 != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView.ViewHolder childViewHolder = recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i));
                if (childViewHolder != null && childViewHolder.getItemViewType() == CategoryListAdapter.a.a()) {
                    if (z) {
                        ((CategoryViewHolder) childViewHolder).b();
                    } else {
                        ((CategoryViewHolder) childViewHolder).c();
                    }
                }
                if (childViewHolder != null && childViewHolder.getItemViewType() == CategoryListAdapter.g) {
                    CategoryNewViewHolder categoryNewViewHolder = (CategoryNewViewHolder) childViewHolder;
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, categoryNewViewHolder, CategoryNewViewHolder.f41561b, false, 35524, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        CategoryNewViewHolder categoryNewViewHolder2 = categoryNewViewHolder;
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, categoryNewViewHolder2, CategoryNewViewHolder.f41561b, false, 35524, new Class[]{Boolean.TYPE}, Void.TYPE);
                    } else if (z) {
                        categoryNewViewHolder.f41562c.b();
                    } else {
                        categoryNewViewHolder.f41562c.c();
                    }
                }
            }
        }
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f42300a, false, 36336, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f42300a, false, 36336, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (Math.abs(i2) <= this.f42303d) {
            a(recyclerView, true);
        }
    }
}
