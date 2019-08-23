package com.bytedance.android.livesdk.widget.pager;

import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import com.bytedance.android.live.uikit.d.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class GridPagerSnapHelper extends SnapHelper {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f18531c;
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private a f18532a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private a f18533b;

    /* renamed from: d  reason: collision with root package name */
    public int f18534d = 1;

    /* renamed from: e  reason: collision with root package name */
    public int f18535e = 1;

    @Nullable
    public final int[] a(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        if (PatchProxy.isSupport(new Object[]{layoutManager, view}, this, f18531c, false, 14831, new Class[]{RecyclerView.LayoutManager.class, View.class}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{layoutManager, view}, this, f18531c, false, 14831, new Class[]{RecyclerView.LayoutManager.class, View.class}, int[].class);
        }
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = a(layoutManager, view, d(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = a(layoutManager, view, c(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    private int b() {
        return this.f18534d * this.f18535e;
    }

    private int a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f18531c, false, 14834, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return i / b();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f18531c, false, 14834, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    @NonNull
    private a c(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (PatchProxy.isSupport(new Object[]{layoutManager}, this, f18531c, false, 14839, new Class[]{RecyclerView.LayoutManager.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{layoutManager}, this, f18531c, false, 14839, new Class[]{RecyclerView.LayoutManager.class}, a.class);
        }
        if (this.f18532a == null || this.f18532a.f18547b != layoutManager) {
            this.f18532a = a.b(layoutManager);
        }
        return this.f18532a;
    }

    @NonNull
    private a d(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (PatchProxy.isSupport(new Object[]{layoutManager}, this, f18531c, false, 14840, new Class[]{RecyclerView.LayoutManager.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{layoutManager}, this, f18531c, false, 14840, new Class[]{RecyclerView.LayoutManager.class}, a.class);
        }
        if (this.f18533b == null || this.f18533b.f18547b != layoutManager) {
            this.f18533b = a.a(layoutManager);
        }
        return this.f18533b;
    }

    public final LinearSmoothScroller b(RecyclerView.LayoutManager layoutManager) {
        if (PatchProxy.isSupport(new Object[]{layoutManager}, this, f18531c, false, 14838, new Class[]{RecyclerView.LayoutManager.class}, LinearSmoothScroller.class)) {
            return (LinearSmoothScroller) PatchProxy.accessDispatch(new Object[]{layoutManager}, this, f18531c, false, 14838, new Class[]{RecyclerView.LayoutManager.class}, LinearSmoothScroller.class);
        } else if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider)) {
            return null;
        } else {
            return new LinearSmoothScroller(this.g.getContext()) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f18536a;

                public PointF computeScrollVectorForPosition(int i) {
                    return null;
                }

                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / ((float) displayMetrics.densityDpi);
                }

                public int calculateTimeForScrolling(int i) {
                    if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f18536a, false, 14842, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                        return Math.min(100, super.calculateTimeForScrolling(i));
                    }
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f18536a, false, 14842, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                }

                public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    View view2 = view;
                    RecyclerView.SmoothScroller.Action action2 = action;
                    if (PatchProxy.isSupport(new Object[]{view2, state, action2}, this, f18536a, false, 14841, new Class[]{View.class, RecyclerView.State.class, RecyclerView.SmoothScroller.Action.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2, state, action2}, this, f18536a, false, 14841, new Class[]{View.class, RecyclerView.State.class, RecyclerView.SmoothScroller.Action.class}, Void.TYPE);
                        return;
                    }
                    int[] a2 = GridPagerSnapHelper.this.a(GridPagerSnapHelper.this.g.getLayoutManager(), view);
                    int i = a2[0];
                    int i2 = a2[1];
                    int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                    if (calculateTimeForDeceleration > 0) {
                        action2.update(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }
            };
        }
    }

    @Nullable
    public View a(RecyclerView.LayoutManager layoutManager) {
        if (PatchProxy.isSupport(new Object[]{layoutManager}, this, f18531c, false, 14833, new Class[]{RecyclerView.LayoutManager.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutManager}, this, f18531c, false, 14833, new Class[]{RecyclerView.LayoutManager.class}, View.class);
        } else if (layoutManager.canScrollVertically()) {
            return a(layoutManager, c(layoutManager));
        } else {
            if (layoutManager.canScrollHorizontally()) {
                return a(layoutManager, d(layoutManager));
            }
            return null;
        }
    }

    @Nullable
    private View b(RecyclerView.LayoutManager layoutManager, a aVar) {
        RecyclerView.LayoutManager layoutManager2 = layoutManager;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{layoutManager2, aVar2}, this, f18531c, false, 14837, new Class[]{RecyclerView.LayoutManager.class, a.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutManager2, aVar2}, this, f18531c, false, 14837, new Class[]{RecyclerView.LayoutManager.class, a.class}, View.class);
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager2.getChildAt(i2);
            int a2 = aVar2.a(childAt);
            if (a2 < i) {
                view = childAt;
                i = a2;
            }
        }
        return view;
    }

    @Nullable
    private View a(RecyclerView.LayoutManager layoutManager, a aVar) {
        int i;
        RecyclerView.LayoutManager layoutManager2 = layoutManager;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{layoutManager2, aVar2}, this, f18531c, false, 14835, new Class[]{RecyclerView.LayoutManager.class, a.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutManager2, aVar2}, this, f18531c, false, 14835, new Class[]{RecyclerView.LayoutManager.class, a.class}, View.class);
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        if (layoutManager.getClipToPadding()) {
            i = aVar.a() + (aVar.c() / 2);
        } else {
            i = aVar.b() / 2;
        }
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = layoutManager2.getChildAt(i3);
            int abs = Math.abs((aVar2.a(childAt) + (aVar2.c(childAt) / 2)) - i);
            if (abs < i2) {
                view = childAt;
                i2 = abs;
            }
        }
        return view;
    }

    private int a(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view, a aVar) {
        int i;
        int i2;
        int i3;
        int i4;
        View view2 = view;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{layoutManager, view2, aVar2}, this, f18531c, false, 14832, new Class[]{RecyclerView.LayoutManager.class, View.class, a.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{layoutManager, view2, aVar2}, this, f18531c, false, 14832, new Class[]{RecyclerView.LayoutManager.class, View.class, a.class}, Integer.TYPE)).intValue();
        }
        boolean a2 = c.a(this.g.getContext());
        if (layoutManager.canScrollHorizontally()) {
            int width = this.g.getWidth() / this.f18535e;
            int position = layoutManager.getPosition(view);
            int a3 = a(position) * b();
            if (a2) {
                i3 = ((b() - (position - a3)) / this.f18534d) * width;
            } else {
                i3 = ((position - a3) / this.f18534d) * width;
            }
            if (a2) {
                i4 = aVar2.b(view2);
            } else {
                i4 = aVar2.a(view2);
            }
            return i4 - i3;
        }
        int height = this.g.getHeight() / this.f18534d;
        int position2 = layoutManager.getPosition(view);
        int a4 = a(position2) * b();
        if (a2) {
            i = ((b() - (position2 - a4)) / this.f18535e) * height;
        } else {
            i = ((position2 - a4) / this.f18535e) * height;
        }
        if (a2) {
            i2 = aVar2.b(view2);
        } else {
            i2 = aVar2.a(view2);
        }
        return i2 - i;
    }

    public int a(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        boolean z;
        RecyclerView.LayoutManager layoutManager2 = layoutManager;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{layoutManager2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f18531c, false, 14836, new Class[]{RecyclerView.LayoutManager.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{layoutManager2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f18531c, false, 14836, new Class[]{RecyclerView.LayoutManager.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        View view = null;
        if (layoutManager.canScrollVertically()) {
            view = b(layoutManager, c(layoutManager));
        } else if (layoutManager.canScrollHorizontally()) {
            view = b(layoutManager, d(layoutManager));
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view);
        if (position == -1) {
            return -1;
        }
        if (!layoutManager.canScrollHorizontally() ? i2 <= 0 : i <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (layoutManager2 instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            PointF computeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager2).computeScrollVectorForPosition(itemCount - 1);
            if (computeScrollVectorForPosition != null && (computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f)) {
                z2 = true;
            }
        }
        int a2 = a(position) * b();
        if (z2) {
            if (z) {
                a2 -= b();
            }
            return a2;
        } else if (z) {
            return a2 + b();
        } else {
            return (a2 + b()) - 1;
        }
    }
}
