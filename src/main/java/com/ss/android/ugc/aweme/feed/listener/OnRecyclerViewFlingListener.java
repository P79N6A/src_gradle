package com.ss.android.ugc.aweme.feed.listener;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class OnRecyclerViewFlingListener extends RecyclerView.OnFlingListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45609a;

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f45610b;

    /* renamed from: c  reason: collision with root package name */
    private m f45611c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f45612d = true;

    /* renamed from: e  reason: collision with root package name */
    private int[] f45613e;

    /* renamed from: f  reason: collision with root package name */
    private int[] f45614f;
    private int g = -1;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f45609a, false, 41366, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45609a, false, 41366, new Class[0], Void.TYPE);
        } else if (this.f45611c.d()) {
            this.f45611c.I_();
        } else {
            this.f45611c.b(false);
        }
    }

    public OnRecyclerViewFlingListener(RecyclerView recyclerView, m mVar) {
        this.f45610b = recyclerView;
        this.f45611c = mVar;
    }

    public boolean onFling(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f45609a, false, 41365, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f45609a, false, 41365, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!this.f45612d) {
            return false;
        } else {
            RecyclerView.LayoutManager layoutManager = this.f45610b.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                i4 = gridLayoutManager.findFirstVisibleItemPosition();
                i3 = gridLayoutManager.findLastVisibleItemPosition();
                if (this.g == -1) {
                    this.g = gridLayoutManager.getSpanCount();
                }
            } else if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                i4 = linearLayoutManager.findFirstVisibleItemPosition();
                i3 = linearLayoutManager.findLastVisibleItemPosition();
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                if (this.g == -1) {
                    this.g = staggeredGridLayoutManager.getSpanCount();
                }
                if (this.f45613e == null) {
                    this.f45613e = new int[staggeredGridLayoutManager.getSpanCount()];
                }
                if (this.f45614f == null) {
                    this.f45614f = new int[staggeredGridLayoutManager.getSpanCount()];
                }
                staggeredGridLayoutManager.findFirstVisibleItemPositions(this.f45613e);
                staggeredGridLayoutManager.findLastVisibleItemPositions(this.f45614f);
                i4 = this.f45613e[0];
                i3 = this.f45614f[this.f45614f.length - 1];
            } else {
                throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager and StaggeredGridLayoutManager");
            }
            int childCount = layoutManager.getChildCount();
            int itemCount = layoutManager.getItemCount();
            if (childCount > 0) {
                View findViewByPosition = layoutManager.findViewByPosition(i4);
                if (findViewByPosition != null) {
                    i5 = findViewByPosition.getHeight();
                } else {
                    i5 = 0;
                }
                if (i5 == 0) {
                    return false;
                }
                if (this.g != -1) {
                    if ((i2 / i5) + (i3 / this.g) + 3 >= itemCount / this.g) {
                        a();
                    }
                } else if ((i2 / i5) + i3 >= itemCount - 2) {
                    a();
                }
            }
            return false;
        }
    }
}
