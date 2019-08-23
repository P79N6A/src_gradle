package com.ss.android.ugc.aweme.story.base.view;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class OnRecyclerViewFlingListener extends RecyclerView.OnFlingListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71977a;

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f71978b;

    /* renamed from: c  reason: collision with root package name */
    private d f71979c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f71980d = true;

    /* renamed from: e  reason: collision with root package name */
    private int[] f71981e;

    /* renamed from: f  reason: collision with root package name */
    private int[] f71982f;
    private int g = -1;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f71977a, false, 82428, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71977a, false, 82428, new Class[0], Void.TYPE);
        } else if (this.f71979c.a()) {
            this.f71979c.b();
        } else {
            this.f71979c.a(false);
        }
    }

    public OnRecyclerViewFlingListener(RecyclerView recyclerView, d dVar) {
        this.f71978b = recyclerView;
        this.f71979c = dVar;
    }

    public boolean onFling(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71977a, false, 82427, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71977a, false, 82427, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!this.f71980d) {
            return false;
        } else {
            RecyclerView.LayoutManager layoutManager = this.f71978b.getLayoutManager();
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
                if (this.f71981e == null) {
                    this.f71981e = new int[staggeredGridLayoutManager.getSpanCount()];
                }
                if (this.f71982f == null) {
                    this.f71982f = new int[staggeredGridLayoutManager.getSpanCount()];
                }
                staggeredGridLayoutManager.findFirstVisibleItemPositions(this.f71981e);
                staggeredGridLayoutManager.findLastVisibleItemPositions(this.f71982f);
                i4 = this.f71981e[0];
                i3 = this.f71982f[this.f71982f.length - 1];
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
