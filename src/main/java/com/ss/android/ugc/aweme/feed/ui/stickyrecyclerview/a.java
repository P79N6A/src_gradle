package com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.d.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46914a;

    /* renamed from: b  reason: collision with root package name */
    final c f46915b;

    /* renamed from: c  reason: collision with root package name */
    final b f46916c;

    /* renamed from: d  reason: collision with root package name */
    final com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.a.a f46917d;

    /* renamed from: e  reason: collision with root package name */
    final com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.b.a f46918e;

    /* renamed from: f  reason: collision with root package name */
    final Rect f46919f = new Rect();
    final Rect g = new Rect();

    private boolean a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f46914a, false, 43550, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f46914a, false, 43550, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (i2 >= 0) {
            if (i2 >= this.f46915b.getItemCount()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public int b(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f46914a, false, 43558, new Class[]{RecyclerView.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f46914a, false, 43558, new Class[]{RecyclerView.class}, Integer.TYPE)).intValue();
        } else if (recyclerView.getLayoutManager().getClipToPadding()) {
            return recyclerView.getPaddingLeft();
        } else {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public int a(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f46914a, false, 43557, new Class[]{RecyclerView.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f46914a, false, 43557, new Class[]{RecyclerView.class}, Integer.TYPE)).intValue();
        } else if (recyclerView.getLayoutManager().getClipToPadding()) {
            return recyclerView.getPaddingTop();
        } else {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public View a(RecyclerView recyclerView, View view) {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{recyclerView, view}, this, f46914a, false, 43555, new Class[]{RecyclerView.class, View.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{recyclerView, view}, this, f46914a, false, 43555, new Class[]{RecyclerView.class, View.class}, View.class);
        }
        boolean b2 = this.f46916c.b(recyclerView);
        if (b2) {
            i = -1;
        } else {
            i = 1;
        }
        if (b2) {
            i2 = recyclerView.getChildCount() - 1;
        }
        while (i2 >= 0 && i2 <= recyclerView.getChildCount() - 1) {
            View childAt = recyclerView.getChildAt(i2);
            if (!a(recyclerView, childAt, view, this.f46916c.a(recyclerView))) {
                return childAt;
            }
            i2 += i;
        }
        return null;
    }

    public final boolean a(int i, boolean z) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f46914a, false, 43549, new Class[]{Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, f46914a, false, 43549, new Class[]{Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (a(i)) {
            return false;
        } else {
            long a2 = this.f46915b.a(i);
            if (a2 < 0) {
                return false;
            }
            long j = -1;
            if (z) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            int i4 = i2 + i;
            if (!a(i4)) {
                j = this.f46915b.a(i4);
            }
            if (z) {
                i3 = this.f46915b.getItemCount() - 1;
            } else {
                i3 = 0;
            }
            if (i == i3 || a2 != j) {
                return true;
            }
            return false;
        }
    }

    public a(c cVar, com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.a.a aVar, b bVar, com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.b.a aVar2) {
        this.f46915b = cVar;
        this.f46917d = aVar;
        this.f46916c = bVar;
        this.f46918e = aVar2;
    }

    private boolean a(RecyclerView recyclerView, View view, View view2, int i) {
        RecyclerView recyclerView2 = recyclerView;
        View view3 = view2;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, view, view3, Integer.valueOf(i)}, this, f46914a, false, 43556, new Class[]{RecyclerView.class, View.class, View.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{recyclerView2, view, view3, Integer.valueOf(i)}, this, f46914a, false, 43556, new Class[]{RecyclerView.class, View.class, View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f46918e.a(this.f46919f, view3);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1 || this.f46917d.a(recyclerView2, childAdapterPosition) != view3) {
            return false;
        }
        if (i == 1) {
            if (view.getTop() - layoutParams.topMargin >= a(recyclerView) + view2.getBottom() + this.f46919f.bottom + this.f46919f.top) {
                return false;
            }
        } else if (view.getLeft() - layoutParams.leftMargin >= b(recyclerView) + view2.getRight() + this.f46919f.right + this.f46919f.left) {
            return false;
        }
        return true;
    }
}
