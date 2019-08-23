package com.ss.android.ugc.aweme.story.comment.discretescrollview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72168a;

    /* renamed from: b  reason: collision with root package name */
    RecyclerView.LayoutManager f72169b;

    public final void a(View view, RecyclerView.Recycler recycler) {
        View view2 = view;
        RecyclerView.Recycler recycler2 = recycler;
        if (PatchProxy.isSupport(new Object[]{view2, recycler2}, this, f72168a, false, 82822, new Class[]{View.class, RecyclerView.Recycler.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, recycler2}, this, f72168a, false, 82822, new Class[]{View.class, RecyclerView.Recycler.class}, Void.TYPE);
            return;
        }
        recycler2.recycleView(view2);
    }

    public final int a() {
        if (!PatchProxy.isSupport(new Object[0], this, f72168a, false, 82824, new Class[0], Integer.TYPE)) {
            return this.f72169b.getChildCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f72168a, false, 82824, new Class[0], Integer.TYPE)).intValue();
    }

    public final int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f72168a, false, 82825, new Class[0], Integer.TYPE)) {
            return this.f72169b.getItemCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f72168a, false, 82825, new Class[0], Integer.TYPE)).intValue();
    }

    public final int c() {
        if (!PatchProxy.isSupport(new Object[0], this, f72168a, false, 82832, new Class[0], Integer.TYPE)) {
            return this.f72169b.getWidth();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f72168a, false, 82832, new Class[0], Integer.TYPE)).intValue();
    }

    public final int d() {
        if (!PatchProxy.isSupport(new Object[0], this, f72168a, false, 82833, new Class[0], Integer.TYPE)) {
            return this.f72169b.getHeight();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f72168a, false, 82833, new Class[0], Integer.TYPE)).intValue();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f72168a, false, 82836, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72168a, false, 82836, new Class[0], Void.TYPE);
            return;
        }
        this.f72169b.requestLayout();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f72168a, false, 82838, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72168a, false, 82838, new Class[0], Void.TYPE);
            return;
        }
        this.f72169b.removeAllViews();
    }

    public c(@NonNull RecyclerView.LayoutManager layoutManager) {
        this.f72169b = layoutManager;
    }

    public final View a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72168a, false, 82828, new Class[]{Integer.TYPE}, View.class)) {
            return this.f72169b.getChildAt(i);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72168a, false, 82828, new Class[]{Integer.TYPE}, View.class);
    }

    public final void b(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f72168a, false, 82819, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f72168a, false, 82819, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f72169b.detachView(view2);
    }

    public final int c(View view) {
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{view2}, this, f72168a, false, 82829, new Class[]{View.class}, Integer.TYPE)) {
            return this.f72169b.getPosition(view2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{view2}, this, f72168a, false, 82829, new Class[]{View.class}, Integer.TYPE)).intValue();
    }

    public final void a(RecyclerView.SmoothScroller smoothScroller) {
        RecyclerView.SmoothScroller smoothScroller2 = smoothScroller;
        if (PatchProxy.isSupport(new Object[]{smoothScroller2}, this, f72168a, false, 82837, new Class[]{RecyclerView.SmoothScroller.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{smoothScroller2}, this, f72168a, false, 82837, new Class[]{RecyclerView.SmoothScroller.class}, Void.TYPE);
            return;
        }
        this.f72169b.startSmoothScroll(smoothScroller2);
    }

    public final void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f72168a, false, 82818, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f72168a, false, 82818, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f72169b.attachView(view2);
    }

    public final View a(int i, RecyclerView.Recycler recycler) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), recycler}, this, f72168a, false, 82826, new Class[]{Integer.TYPE, RecyclerView.Recycler.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), recycler}, this, f72168a, false, 82826, new Class[]{Integer.TYPE, RecyclerView.Recycler.class}, View.class);
        }
        View viewForPosition = recycler.getViewForPosition(i);
        this.f72169b.addView(viewForPosition);
        this.f72169b.measureChildWithMargins(viewForPosition, 0, 0);
        return viewForPosition;
    }

    public final void a(View view, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f72168a, false, 82827, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f72168a, false, 82827, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f72169b.layoutDecoratedWithMargins(view, i, i2, i3, i4);
    }
}
