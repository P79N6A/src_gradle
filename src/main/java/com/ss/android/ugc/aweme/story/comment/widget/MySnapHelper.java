package com.ss.android.ugc.aweme.story.comment.widget;

import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class MySnapHelper extends SnapHelper {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72330a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private OrientationHelper f72331b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private OrientationHelper f72332c;

    @NonNull
    private OrientationHelper b(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (PatchProxy.isSupport(new Object[]{layoutManager}, this, f72330a, false, 83083, new Class[]{RecyclerView.LayoutManager.class}, OrientationHelper.class)) {
            return (OrientationHelper) PatchProxy.accessDispatch(new Object[]{layoutManager}, this, f72330a, false, 83083, new Class[]{RecyclerView.LayoutManager.class}, OrientationHelper.class);
        }
        if (this.f72332c == null || this.f72332c.getLayoutManager() != layoutManager) {
            this.f72332c = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.f72332c;
    }

    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (PatchProxy.isSupport(new Object[]{layoutManager}, this, f72330a, false, 83077, new Class[]{RecyclerView.LayoutManager.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutManager}, this, f72330a, false, 83077, new Class[]{RecyclerView.LayoutManager.class}, View.class);
        } else if (layoutManager.canScrollVertically()) {
            return a(layoutManager, a(layoutManager));
        } else {
            if (layoutManager.canScrollHorizontally()) {
                return a(layoutManager, b(layoutManager));
            }
            return null;
        }
    }

    @NonNull
    private OrientationHelper a(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (PatchProxy.isSupport(new Object[]{layoutManager}, this, f72330a, false, 83082, new Class[]{RecyclerView.LayoutManager.class}, OrientationHelper.class)) {
            return (OrientationHelper) PatchProxy.accessDispatch(new Object[]{layoutManager}, this, f72330a, false, 83082, new Class[]{RecyclerView.LayoutManager.class}, OrientationHelper.class);
        }
        if (this.f72331b == null || this.f72331b.getLayoutManager() != layoutManager) {
            this.f72331b = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.f72331b;
    }

    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        if (PatchProxy.isSupport(new Object[]{layoutManager, view}, this, f72330a, false, 83075, new Class[]{RecyclerView.LayoutManager.class, View.class}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{layoutManager, view}, this, f72330a, false, 83075, new Class[]{RecyclerView.LayoutManager.class, View.class}, int[].class);
        }
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = a(layoutManager, view, b(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = a(layoutManager, view, a(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    private float b(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        RecyclerView.LayoutManager layoutManager2 = layoutManager;
        OrientationHelper orientationHelper2 = orientationHelper;
        if (PatchProxy.isSupport(new Object[]{layoutManager2, orientationHelper2}, this, f72330a, false, 83081, new Class[]{RecyclerView.LayoutManager.class, OrientationHelper.class}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{layoutManager2, orientationHelper2}, this, f72330a, false, 83081, new Class[]{RecyclerView.LayoutManager.class, OrientationHelper.class}, Float.TYPE)).floatValue();
        }
        int i = Integer.MAX_VALUE;
        int childCount = layoutManager.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = layoutManager2.getChildAt(i3);
            int position = layoutManager2.getPosition(childAt);
            if (position != -1) {
                if (position < i) {
                    view = childAt;
                    i = position;
                }
                if (position > i2) {
                    view2 = childAt;
                    i2 = position;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(orientationHelper2.getDecoratedEnd(view), orientationHelper2.getDecoratedEnd(view2)) - Math.min(orientationHelper2.getDecoratedStart(view), orientationHelper2.getDecoratedStart(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i2 - i) + 1));
    }

    @Nullable
    private View a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int i;
        RecyclerView.LayoutManager layoutManager2 = layoutManager;
        OrientationHelper orientationHelper2 = orientationHelper;
        if (PatchProxy.isSupport(new Object[]{layoutManager2, orientationHelper2}, this, f72330a, false, 83080, new Class[]{RecyclerView.LayoutManager.class, OrientationHelper.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutManager2, orientationHelper2}, this, f72330a, false, 83080, new Class[]{RecyclerView.LayoutManager.class, OrientationHelper.class}, View.class);
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

    private int a(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view, OrientationHelper orientationHelper) {
        int i;
        View view2 = view;
        OrientationHelper orientationHelper2 = orientationHelper;
        if (PatchProxy.isSupport(new Object[]{layoutManager, view2, orientationHelper2}, this, f72330a, false, 83078, new Class[]{RecyclerView.LayoutManager.class, View.class, OrientationHelper.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{layoutManager, view2, orientationHelper2}, this, f72330a, false, 83078, new Class[]{RecyclerView.LayoutManager.class, View.class, OrientationHelper.class}, Integer.TYPE)).intValue();
        }
        int decoratedStart = orientationHelper2.getDecoratedStart(view2) + (orientationHelper2.getDecoratedMeasurement(view2) / 2);
        if (layoutManager.getClipToPadding()) {
            i = orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2);
        } else {
            i = orientationHelper.getEnd() / 2;
        }
        return decoratedStart - i;
    }

    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int i3;
        int i4;
        RecyclerView.LayoutManager layoutManager2 = layoutManager;
        if (PatchProxy.isSupport(new Object[]{layoutManager2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f72330a, false, 83076, new Class[]{RecyclerView.LayoutManager.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{layoutManager2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f72330a, false, 83076, new Class[]{RecyclerView.LayoutManager.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (!(layoutManager2 instanceof RecyclerView.SmoothScroller.ScrollVectorProvider)) {
            return -1;
        } else {
            int itemCount = layoutManager.getItemCount();
            if (itemCount == 0) {
                return -1;
            }
            View findSnapView = findSnapView(layoutManager);
            if (findSnapView == null) {
                return -1;
            }
            int position = layoutManager.getPosition(findSnapView);
            if (position == -1) {
                return -1;
            }
            int i5 = itemCount - 1;
            PointF computeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager2).computeScrollVectorForPosition(i5);
            if (computeScrollVectorForPosition == null) {
                return -1;
            }
            if (layoutManager.canScrollHorizontally()) {
                int i6 = i;
                i3 = a(layoutManager, b(layoutManager), i, 0);
                if (computeScrollVectorForPosition.x < 0.0f) {
                    i3 = -i3;
                }
            } else {
                i3 = 0;
            }
            if (layoutManager.canScrollVertically()) {
                int a2 = a(layoutManager, a(layoutManager), 0, i2);
                if (computeScrollVectorForPosition.y < 0.0f) {
                    i4 = -a2;
                } else {
                    i4 = a2;
                }
            } else {
                i4 = 0;
            }
            if (!layoutManager.canScrollVertically()) {
                i4 = i3;
            }
            if (i4 == 0) {
                return -1;
            }
            int i7 = position + i4;
            if (i7 < 0) {
                i7 = 0;
            }
            if (i7 >= itemCount) {
                i7 = i5;
            }
            return i7;
        }
    }

    private int a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i, int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{layoutManager, orientationHelper, Integer.valueOf(i), Integer.valueOf(i2)}, this, f72330a, false, 83079, new Class[]{RecyclerView.LayoutManager.class, OrientationHelper.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{layoutManager, orientationHelper, Integer.valueOf(i), Integer.valueOf(i2)}, this, f72330a, false, 83079, new Class[]{RecyclerView.LayoutManager.class, OrientationHelper.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int[] calculateScrollDistance = calculateScrollDistance(i, i2);
        float b2 = b(layoutManager, orientationHelper);
        if (b2 <= 0.0f) {
            return 0;
        }
        if (Math.abs(calculateScrollDistance[0]) > Math.abs(calculateScrollDistance[1])) {
            i3 = calculateScrollDistance[0];
        } else {
            i3 = calculateScrollDistance[1];
        }
        return Math.round(((float) i3) / b2);
    }
}
