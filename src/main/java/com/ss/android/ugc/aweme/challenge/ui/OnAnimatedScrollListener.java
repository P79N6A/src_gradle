package com.ss.android.ugc.aweme.challenge.ui;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.ss.android.ugc.aweme.setting.f;

public class OnAnimatedScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35558a;

    /* renamed from: b  reason: collision with root package name */
    private int f35559b;

    /* renamed from: c  reason: collision with root package name */
    private int f35560c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f35561d = new int[2];

    /* renamed from: e  reason: collision with root package name */
    private int f35562e = ViewConfiguration.get(k.a()).getScaledTouchSlop();

    /* renamed from: f  reason: collision with root package name */
    private a f35563f;

    class a {

        /* renamed from: a  reason: collision with root package name */
        public int f35564a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f35565b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f35566c = -1;

        a() {
        }
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f35558a, false, 26293, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f35558a, false, 26293, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (this.f35559b == 0) {
            this.f35559b = UIUtils.getScreenHeight(context);
        }
    }

    private boolean a(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f35558a, false, 26291, new Class[]{RecyclerView.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f35558a, false, 26291, new Class[]{RecyclerView.class}, Boolean.TYPE)).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).getOrientation() == 1) {
                return true;
            }
            return false;
        } else if (!(layoutManager instanceof StaggeredGridLayoutManager) || ((StaggeredGridLayoutManager) layoutManager).getOrientation() != 1) {
            return false;
        } else {
            return true;
        }
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f35558a, false, 26288, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f35558a, false, 26288, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            a(recyclerView2, false);
        }
    }

    private void c(RecyclerView recyclerView, boolean z) {
        int i;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f35558a, false, 26295, new Class[]{RecyclerView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Byte.valueOf(z)}, this, f35558a, false, 26295, new Class[]{RecyclerView.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(recyclerView.getContext());
        recyclerView.getLocationOnScreen(this.f35561d);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int childCount = recyclerView.getChildCount();
        int i2 = this.f35561d[1];
        int min = Math.min(this.f35559b, recyclerView.getHeight() + i2);
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
            if (childViewHolder.getItemViewType() == 0) {
                AnimatedViewHolder animatedViewHolder = (AnimatedViewHolder) childViewHolder;
                if (!animatedViewHolder.d()) {
                    if (z) {
                        if (z) {
                            animatedViewHolder.a();
                        }
                    }
                }
                int decoratedTop = layoutManager.getDecoratedTop(childAt);
                int decoratedBottom = layoutManager.getDecoratedBottom(childAt);
                int height = childAt.getHeight();
                if (decoratedTop >= 0 || decoratedBottom <= min) {
                    if (decoratedTop < 0) {
                        i = decoratedTop + height;
                    } else {
                        int i4 = decoratedBottom + i2;
                        if (i4 > min) {
                            i = height - (i4 - min);
                        } else {
                            i = height;
                        }
                    }
                    if (i * 4 > height * 3) {
                        animatedViewHolder.b(true);
                        animatedViewHolder.f();
                    } else {
                        animatedViewHolder.b(false);
                        animatedViewHolder.g();
                    }
                }
            }
        }
    }

    public final void a(RecyclerView recyclerView, boolean z) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Byte.valueOf(z ? (byte) 1 : 0)}, this, f35558a, false, 26290, new Class[]{RecyclerView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Byte.valueOf(z)}, this, f35558a, false, 26290, new Class[]{RecyclerView.class, Boolean.TYPE}, Void.TYPE);
        } else if (a(recyclerView)) {
            c(recyclerView, z);
        } else {
            b(recyclerView, z);
        }
    }

    private void b(RecyclerView recyclerView, boolean z) {
        boolean z2;
        int i;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f35558a, false, 26294, new Class[]{RecyclerView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Byte.valueOf(z)}, this, f35558a, false, 26294, new Class[]{RecyclerView.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Context context = recyclerView.getContext();
        if (PatchProxy.isSupport(new Object[]{context}, this, f35558a, false, 26292, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f35558a, false, 26292, new Class[]{Context.class}, Void.TYPE);
        } else if (this.f35560c == 0) {
            this.f35560c = UIUtils.getScreenWidth(context);
        }
        a(recyclerView.getContext());
        recyclerView.getLocationOnScreen(this.f35561d);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int childCount = recyclerView.getChildCount();
        int i2 = this.f35561d[0];
        int min = Math.min(this.f35560c, recyclerView.getWidth() + i2);
        int height = recyclerView.getHeight();
        if (this.f35561d[1] + (height >> 2) <= 0 || this.f35559b - this.f35561d[1] <= (height >> 1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
            if (childViewHolder.getItemViewType() == 0) {
                AnimatedViewHolder animatedViewHolder = (AnimatedViewHolder) childViewHolder;
                if (!animatedViewHolder.d()) {
                    if (z) {
                        if (z) {
                            animatedViewHolder.a();
                        }
                    }
                }
                if (!z2) {
                    int decoratedLeft = layoutManager.getDecoratedLeft(childAt);
                    int decoratedRight = layoutManager.getDecoratedRight(childAt);
                    int width = childAt.getWidth();
                    if (decoratedLeft >= 0 || decoratedRight <= min) {
                        if (decoratedLeft < 0) {
                            i = decoratedLeft + width;
                        } else {
                            int i4 = decoratedRight + i2;
                            if (i4 > min) {
                                i = width - (i4 - min);
                            } else {
                                i = width;
                            }
                        }
                        if (i * 4 > width * 3) {
                            animatedViewHolder.b(true);
                            animatedViewHolder.f();
                        }
                    }
                }
                animatedViewHolder.b(false);
                animatedViewHolder.g();
            }
        }
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        RecyclerView recyclerView2 = recyclerView;
        int i3 = i;
        int i4 = i2;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f35558a, false, 26289, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f35558a, false, 26289, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int scrollState = recyclerView.getScrollState();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(scrollState), Integer.valueOf(i), Integer.valueOf(i2)}, this, f35558a, false, 26287, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(scrollState), Integer.valueOf(i), Integer.valueOf(i2)}, this, f35558a, false, 26287, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else {
            if (this.f35563f == null) {
                this.f35563f = new a();
            }
            if (scrollState != 0 || (this.f35563f.f35564a == scrollState && this.f35563f.f35565b == i3 && this.f35563f.f35566c == i4)) {
                z = false;
            } else {
                this.f35563f.f35564a = scrollState;
                this.f35563f.f35565b = i3;
                this.f35563f.f35566c = i4;
            }
        }
        if (z && f.a(k.a())) {
            if (a(recyclerView)) {
                i3 = i4;
            }
            if (Math.abs(i3) <= this.f35562e) {
                a(recyclerView2, false);
            }
        }
    }
}
