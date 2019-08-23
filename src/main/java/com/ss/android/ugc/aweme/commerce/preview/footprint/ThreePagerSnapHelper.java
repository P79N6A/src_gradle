package com.ss.android.ugc.aweme.commerce.preview.footprint;

import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ThreePagerSnapHelper extends SnapHelper {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f37440f;
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private OrientationHelper f37441a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private OrientationHelper f37442b;

    @NonNull
    private OrientationHelper c(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (PatchProxy.isSupport(new Object[]{layoutManager}, this, f37440f, false, 28984, new Class[]{RecyclerView.LayoutManager.class}, OrientationHelper.class)) {
            return (OrientationHelper) PatchProxy.accessDispatch(new Object[]{layoutManager}, this, f37440f, false, 28984, new Class[]{RecyclerView.LayoutManager.class}, OrientationHelper.class);
        }
        if (this.f37441a == null || this.f37441a.getLayoutManager() != layoutManager) {
            this.f37441a = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.f37441a;
    }

    @NonNull
    private OrientationHelper d(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (PatchProxy.isSupport(new Object[]{layoutManager}, this, f37440f, false, 28985, new Class[]{RecyclerView.LayoutManager.class}, OrientationHelper.class)) {
            return (OrientationHelper) PatchProxy.accessDispatch(new Object[]{layoutManager}, this, f37440f, false, 28985, new Class[]{RecyclerView.LayoutManager.class}, OrientationHelper.class);
        }
        if (this.f37442b == null || this.f37442b.getLayoutManager() != layoutManager) {
            this.f37442b = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.f37442b;
    }

    public final LinearSmoothScroller b(RecyclerView.LayoutManager layoutManager) {
        if (PatchProxy.isSupport(new Object[]{layoutManager}, this, f37440f, false, 28980, new Class[]{RecyclerView.LayoutManager.class}, LinearSmoothScroller.class)) {
            return (LinearSmoothScroller) PatchProxy.accessDispatch(new Object[]{layoutManager}, this, f37440f, false, 28980, new Class[]{RecyclerView.LayoutManager.class}, LinearSmoothScroller.class);
        } else if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider)) {
            return null;
        } else {
            return new LinearSmoothScroller(this.f37434e.getContext()) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f37443a;

                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / ((float) displayMetrics.densityDpi);
                }

                public int calculateTimeForScrolling(int i) {
                    if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f37443a, false, 28987, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                        return Math.min(100, super.calculateTimeForScrolling(i));
                    }
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f37443a, false, 28987, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                }

                public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    View view2 = view;
                    RecyclerView.SmoothScroller.Action action2 = action;
                    if (PatchProxy.isSupport(new Object[]{view2, state, action2}, this, f37443a, false, 28986, new Class[]{View.class, RecyclerView.State.class, RecyclerView.SmoothScroller.Action.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2, state, action2}, this, f37443a, false, 28986, new Class[]{View.class, RecyclerView.State.class, RecyclerView.SmoothScroller.Action.class}, Void.TYPE);
                        return;
                    }
                    int[] a2 = ThreePagerSnapHelper.this.a(ThreePagerSnapHelper.this.f37434e.getLayoutManager(), view);
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
        if (PatchProxy.isSupport(new Object[]{layoutManager}, this, f37440f, false, 28978, new Class[]{RecyclerView.LayoutManager.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutManager}, this, f37440f, false, 28978, new Class[]{RecyclerView.LayoutManager.class}, View.class);
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
    private View a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int i;
        RecyclerView.LayoutManager layoutManager2 = layoutManager;
        OrientationHelper orientationHelper2 = orientationHelper;
        if (PatchProxy.isSupport(new Object[]{layoutManager2, orientationHelper2}, this, f37440f, false, 28982, new Class[]{RecyclerView.LayoutManager.class, OrientationHelper.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutManager2, orientationHelper2}, this, f37440f, false, 28982, new Class[]{RecyclerView.LayoutManager.class, OrientationHelper.class}, View.class);
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        if (layoutManager.getClipToPadding()) {
            i = orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2);
        } else {
            i = orientationHelper.getEnd() / 2;
        }
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = layoutManager2.getChildAt(i3);
            int abs = Math.abs((orientationHelper2.getDecoratedStart(childAt) + (orientationHelper2.getDecoratedMeasurement(childAt) / 2)) - i);
            if (abs < i2) {
                view = childAt;
                i2 = abs;
            }
        }
        return view;
    }

    @Nullable
    public final int[] a(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        if (PatchProxy.isSupport(new Object[]{layoutManager, view}, this, f37440f, false, 28977, new Class[]{RecyclerView.LayoutManager.class, View.class}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{layoutManager, view}, this, f37440f, false, 28977, new Class[]{RecyclerView.LayoutManager.class, View.class}, int[].class);
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

    private int a(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view, OrientationHelper orientationHelper) {
        int i;
        View view2 = view;
        OrientationHelper orientationHelper2 = orientationHelper;
        if (PatchProxy.isSupport(new Object[]{layoutManager, view2, orientationHelper2}, this, f37440f, false, 28981, new Class[]{RecyclerView.LayoutManager.class, View.class, OrientationHelper.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{layoutManager, view2, orientationHelper2}, this, f37440f, false, 28981, new Class[]{RecyclerView.LayoutManager.class, View.class, OrientationHelper.class}, Integer.TYPE)).intValue();
        }
        int decoratedStart = orientationHelper2.getDecoratedStart(view2) + (orientationHelper2.getDecoratedMeasurement(view2) / 2);
        if (layoutManager.getClipToPadding()) {
            i = orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2);
        } else {
            i = orientationHelper.getEnd() / 2;
        }
        return decoratedStart - i;
    }

    public final int a(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        boolean z;
        RecyclerView.LayoutManager layoutManager2 = layoutManager;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{layoutManager2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f37440f, false, 28979, new Class[]{RecyclerView.LayoutManager.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{layoutManager2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f37440f, false, 28979, new Class[]{RecyclerView.LayoutManager.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        View view = null;
        if (layoutManager.canScrollVertically()) {
            view = a(layoutManager, c(layoutManager));
        } else if (layoutManager.canScrollHorizontally()) {
            view = a(layoutManager, d(layoutManager));
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
        if (z2) {
            if (!z) {
                return position + 1;
            }
        } else if (z) {
            return position + 1;
        }
        return position - 1;
    }
}
