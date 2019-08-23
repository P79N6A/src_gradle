package com.ss.android.ugc.aweme.story.profile.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.h.g;

public class OnAnimatedScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73372a;

    /* renamed from: b  reason: collision with root package name */
    private int f73373b;

    /* renamed from: c  reason: collision with root package name */
    private int f73374c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f73375d = new int[2];

    /* renamed from: e  reason: collision with root package name */
    private int f73376e;

    /* renamed from: f  reason: collision with root package name */
    private a f73377f;
    private Context g;

    class a {

        /* renamed from: a  reason: collision with root package name */
        public int f73378a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f73379b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f73380c = -1;

        public a() {
        }
    }

    public OnAnimatedScrollListener(Context context) {
        this.f73376e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.g = context;
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f73372a, false, 85007, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f73372a, false, 85007, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (this.f73373b == 0) {
            this.f73373b = UIUtils.getScreenHeight(context);
        }
    }

    private boolean a(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f73372a, false, 85005, new Class[]{RecyclerView.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f73372a, false, 85005, new Class[]{RecyclerView.class}, Boolean.TYPE)).booleanValue();
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

    private void a(RecyclerView recyclerView, boolean z) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, (byte) 0}, this, f73372a, false, 85004, new Class[]{RecyclerView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, (byte) 0}, this, f73372a, false, 85004, new Class[]{RecyclerView.class, Boolean.TYPE}, Void.TYPE);
        } else if (a(recyclerView)) {
            c(recyclerView, false);
        } else {
            b(recyclerView, false);
        }
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f73372a, false, 85002, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f73372a, false, 85002, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
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
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f73372a, false, 85009, new Class[]{RecyclerView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Byte.valueOf(z)}, this, f73372a, false, 85009, new Class[]{RecyclerView.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(recyclerView.getContext());
        recyclerView.getLocationOnScreen(this.f73375d);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int childCount = recyclerView.getChildCount();
        int i2 = this.f73375d[1];
        int min = Math.min(this.f73373b, recyclerView.getHeight() + i2);
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
            if (childViewHolder instanceof AllStoryImageViewHolder) {
                AllStoryImageViewHolder allStoryImageViewHolder = (AllStoryImageViewHolder) childViewHolder;
                if (!allStoryImageViewHolder.f73319e) {
                    if (z) {
                        if (z) {
                            allStoryImageViewHolder.b();
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
                        allStoryImageViewHolder.a(true);
                        allStoryImageViewHolder.c();
                    } else {
                        allStoryImageViewHolder.a(false);
                        allStoryImageViewHolder.d();
                    }
                }
            }
        }
    }

    private void b(RecyclerView recyclerView, boolean z) {
        boolean z2;
        int i;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f73372a, false, 85008, new Class[]{RecyclerView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Byte.valueOf(z)}, this, f73372a, false, 85008, new Class[]{RecyclerView.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Context context = recyclerView.getContext();
        if (PatchProxy.isSupport(new Object[]{context}, this, f73372a, false, 85006, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f73372a, false, 85006, new Class[]{Context.class}, Void.TYPE);
        } else if (this.f73374c == 0) {
            this.f73374c = UIUtils.getScreenWidth(context);
        }
        a(recyclerView.getContext());
        recyclerView.getLocationOnScreen(this.f73375d);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int childCount = recyclerView.getChildCount();
        int i2 = this.f73375d[0];
        int min = Math.min(this.f73374c, recyclerView.getWidth() + i2);
        int height = recyclerView.getHeight();
        if (this.f73375d[1] + (height >> 2) <= 0 || this.f73373b - this.f73375d[1] <= (height >> 1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
            if (childViewHolder instanceof AllStoryImageViewHolder) {
                AllStoryImageViewHolder allStoryImageViewHolder = (AllStoryImageViewHolder) childViewHolder;
                if (!allStoryImageViewHolder.f73319e) {
                    if (z) {
                        if (z) {
                            allStoryImageViewHolder.b();
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
                            allStoryImageViewHolder.a(true);
                            allStoryImageViewHolder.c();
                        }
                    }
                }
                allStoryImageViewHolder.a(false);
                allStoryImageViewHolder.d();
            }
        }
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        RecyclerView recyclerView2 = recyclerView;
        int i3 = i;
        int i4 = i2;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f73372a, false, 85003, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f73372a, false, 85003, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int scrollState = recyclerView.getScrollState();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(scrollState), Integer.valueOf(i), Integer.valueOf(i2)}, this, f73372a, false, 85001, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(scrollState), Integer.valueOf(i), Integer.valueOf(i2)}, this, f73372a, false, 85001, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else {
            if (this.f73377f == null) {
                this.f73377f = new a();
            }
            if (scrollState != 0 || (this.f73377f.f73378a == scrollState && this.f73377f.f73379b == i3 && this.f73377f.f73380c == i4)) {
                z = false;
            } else {
                this.f73377f.f73378a = scrollState;
                this.f73377f.f73379b = i3;
                this.f73377f.f73380c = i4;
            }
        }
        if (z && ((g) ServiceManager.get().getService(g.class)).a(this.g)) {
            if (a(recyclerView)) {
                i3 = i4;
            }
            if (Math.abs(i3) <= this.f73376e) {
                a(recyclerView2, false);
            }
        }
    }
}
