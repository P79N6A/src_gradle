package com.bytedance.android.livesdk.widget.pager;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18546a;

    /* renamed from: b  reason: collision with root package name */
    protected final RecyclerView.LayoutManager f18547b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f18548c;

    /* renamed from: d  reason: collision with root package name */
    private int f18549d;

    public abstract int a();

    public abstract int a(View view);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    private a(RecyclerView.LayoutManager layoutManager) {
        this.f18549d = Integer.MIN_VALUE;
        this.f18548c = new Rect();
        this.f18547b = layoutManager;
    }

    public static a a(RecyclerView.LayoutManager layoutManager) {
        RecyclerView.LayoutManager layoutManager2 = layoutManager;
        if (!PatchProxy.isSupport(new Object[]{layoutManager2}, null, f18546a, true, 14846, new Class[]{RecyclerView.LayoutManager.class}, a.class)) {
            return new a(layoutManager2) {

                /* renamed from: d  reason: collision with root package name */
                public static ChangeQuickRedirect f18550d;

                public final int a() {
                    if (!PatchProxy.isSupport(new Object[0], this, f18550d, false, 14851, new Class[0], Integer.TYPE)) {
                        return this.f18547b.getPaddingLeft();
                    }
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f18550d, false, 14851, new Class[0], Integer.TYPE)).intValue();
                }

                public final int b() {
                    if (!PatchProxy.isSupport(new Object[0], this, f18550d, false, 14849, new Class[0], Integer.TYPE)) {
                        return this.f18547b.getWidth();
                    }
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f18550d, false, 14849, new Class[0], Integer.TYPE)).intValue();
                }

                public final int c() {
                    if (!PatchProxy.isSupport(new Object[0], this, f18550d, false, 14858, new Class[0], Integer.TYPE)) {
                        return (this.f18547b.getWidth() - this.f18547b.getPaddingLeft()) - this.f18547b.getPaddingRight();
                    }
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f18550d, false, 14858, new Class[0], Integer.TYPE)).intValue();
                }

                public final int a(View view) {
                    View view2 = view;
                    if (!PatchProxy.isSupport(new Object[]{view2}, this, f18550d, false, 14855, new Class[]{View.class}, Integer.TYPE)) {
                        return this.f18547b.getDecoratedLeft(view2) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
                    }
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{view2}, this, f18550d, false, 14855, new Class[]{View.class}, Integer.TYPE)).intValue();
                }

                public final int b(View view) {
                    View view2 = view;
                    if (!PatchProxy.isSupport(new Object[]{view2}, this, f18550d, false, 14854, new Class[]{View.class}, Integer.TYPE)) {
                        return this.f18547b.getDecoratedRight(view2) + ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
                    }
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{view2}, this, f18550d, false, 14854, new Class[]{View.class}, Integer.TYPE)).intValue();
                }

                public final int c(View view) {
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f18550d, false, 14852, new Class[]{View.class}, Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[]{view2}, this, f18550d, false, 14852, new Class[]{View.class}, Integer.TYPE)).intValue();
                    }
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                    return this.f18547b.getDecoratedMeasuredWidth(view2) + layoutParams.leftMargin + layoutParams.rightMargin;
                }
            };
        }
        return (a) PatchProxy.accessDispatch(new Object[]{layoutManager2}, null, f18546a, true, 14846, new Class[]{RecyclerView.LayoutManager.class}, a.class);
    }

    public static a b(RecyclerView.LayoutManager layoutManager) {
        RecyclerView.LayoutManager layoutManager2 = layoutManager;
        if (!PatchProxy.isSupport(new Object[]{layoutManager2}, null, f18546a, true, 14847, new Class[]{RecyclerView.LayoutManager.class}, a.class)) {
            return new a(layoutManager2) {

                /* renamed from: d  reason: collision with root package name */
                public static ChangeQuickRedirect f18551d;

                public final int a() {
                    if (!PatchProxy.isSupport(new Object[0], this, f18551d, false, 14866, new Class[0], Integer.TYPE)) {
                        return this.f18547b.getPaddingTop();
                    }
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f18551d, false, 14866, new Class[0], Integer.TYPE)).intValue();
                }

                public final int b() {
                    if (!PatchProxy.isSupport(new Object[0], this, f18551d, false, 14864, new Class[0], Integer.TYPE)) {
                        return this.f18547b.getHeight();
                    }
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f18551d, false, 14864, new Class[0], Integer.TYPE)).intValue();
                }

                public final int c() {
                    if (!PatchProxy.isSupport(new Object[0], this, f18551d, false, 14873, new Class[0], Integer.TYPE)) {
                        return (this.f18547b.getHeight() - this.f18547b.getPaddingTop()) - this.f18547b.getPaddingBottom();
                    }
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f18551d, false, 14873, new Class[0], Integer.TYPE)).intValue();
                }

                public final int a(View view) {
                    View view2 = view;
                    if (!PatchProxy.isSupport(new Object[]{view2}, this, f18551d, false, 14870, new Class[]{View.class}, Integer.TYPE)) {
                        return this.f18547b.getDecoratedTop(view2) - ((RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
                    }
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{view2}, this, f18551d, false, 14870, new Class[]{View.class}, Integer.TYPE)).intValue();
                }

                public final int b(View view) {
                    View view2 = view;
                    if (!PatchProxy.isSupport(new Object[]{view2}, this, f18551d, false, 14869, new Class[]{View.class}, Integer.TYPE)) {
                        return this.f18547b.getDecoratedBottom(view2) + ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
                    }
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{view2}, this, f18551d, false, 14869, new Class[]{View.class}, Integer.TYPE)).intValue();
                }

                public final int c(View view) {
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f18551d, false, 14867, new Class[]{View.class}, Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[]{view2}, this, f18551d, false, 14867, new Class[]{View.class}, Integer.TYPE)).intValue();
                    }
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                    return this.f18547b.getDecoratedMeasuredHeight(view2) + layoutParams.topMargin + layoutParams.bottomMargin;
                }
            };
        }
        return (a) PatchProxy.accessDispatch(new Object[]{layoutManager2}, null, f18546a, true, 14847, new Class[]{RecyclerView.LayoutManager.class}, a.class);
    }

    /* synthetic */ a(RecyclerView.LayoutManager layoutManager, byte b2) {
        this(layoutManager);
    }
}
