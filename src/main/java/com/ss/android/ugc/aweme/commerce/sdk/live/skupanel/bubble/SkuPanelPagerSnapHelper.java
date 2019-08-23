package com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble;

import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J \u0010\u000f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\"\u0010\u0014\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/bubble/SkuPanelPagerSnapHelper;", "Landroid/support/v7/widget/PagerSnapHelper;", "()V", "mHorizontalHelper", "Landroid/support/v7/widget/OrientationHelper;", "mVerticalHelper", "calculateDistanceToFinalSnap", "", "layoutManager", "Landroid/support/v7/widget/RecyclerView$LayoutManager;", "targetView", "Landroid/view/View;", "distanceToEnd", "", "helper", "distanceToStart", "findEndView", "findSnapView", "findStartClosetView", "findStartView", "findTargetSnapPosition", "velocityX", "velocityY", "getHorizontalHelper", "getVerticalHelper", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class SkuPanelPagerSnapHelper extends PagerSnapHelper {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37764a;

    /* renamed from: b  reason: collision with root package name */
    private OrientationHelper f37765b;

    /* renamed from: c  reason: collision with root package name */
    private OrientationHelper f37766c;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (r0.getLayoutManager() != r10) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.support.v7.widget.OrientationHelper b(android.support.v7.widget.RecyclerView.LayoutManager r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f37764a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.support.v7.widget.RecyclerView$LayoutManager> r1 = android.support.v7.widget.RecyclerView.LayoutManager.class
            r5[r8] = r1
            java.lang.Class<android.support.v7.widget.OrientationHelper> r6 = android.support.v7.widget.OrientationHelper.class
            r3 = 0
            r4 = 29341(0x729d, float:4.1115E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f37764a
            r3 = 0
            r4 = 29341(0x729d, float:4.1115E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.support.v7.widget.RecyclerView$LayoutManager> r1 = android.support.v7.widget.RecyclerView.LayoutManager.class
            r5[r8] = r1
            java.lang.Class<android.support.v7.widget.OrientationHelper> r6 = android.support.v7.widget.OrientationHelper.class
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.support.v7.widget.OrientationHelper r0 = (android.support.v7.widget.OrientationHelper) r0
            return r0
        L_0x0033:
            android.support.v7.widget.OrientationHelper r0 = r9.f37766c
            if (r0 == 0) goto L_0x0044
            android.support.v7.widget.OrientationHelper r0 = r9.f37766c
            if (r0 != 0) goto L_0x003e
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x003e:
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            if (r0 == r10) goto L_0x004a
        L_0x0044:
            android.support.v7.widget.OrientationHelper r0 = android.support.v7.widget.OrientationHelper.createHorizontalHelper(r10)
            r9.f37766c = r0
        L_0x004a:
            android.support.v7.widget.OrientationHelper r0 = r9.f37766c
            if (r0 != 0) goto L_0x0051
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelPagerSnapHelper.b(android.support.v7.widget.RecyclerView$LayoutManager):android.support.v7.widget.OrientationHelper");
    }

    @Nullable
    public final View findSnapView(@Nullable RecyclerView.LayoutManager layoutManager) {
        if (PatchProxy.isSupport(new Object[]{layoutManager}, this, f37764a, false, 29338, new Class[]{RecyclerView.LayoutManager.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutManager}, this, f37764a, false, 29338, new Class[]{RecyclerView.LayoutManager.class}, View.class);
        } else if (layoutManager == null) {
            return null;
        } else {
            if (layoutManager.canScrollVertically()) {
                return c(layoutManager, a(layoutManager));
            }
            if (layoutManager.canScrollHorizontally()) {
                return c(layoutManager, b(layoutManager));
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (r0.getLayoutManager() != r10) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.support.v7.widget.OrientationHelper a(android.support.v7.widget.RecyclerView.LayoutManager r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f37764a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.support.v7.widget.RecyclerView$LayoutManager> r1 = android.support.v7.widget.RecyclerView.LayoutManager.class
            r5[r8] = r1
            java.lang.Class<android.support.v7.widget.OrientationHelper> r6 = android.support.v7.widget.OrientationHelper.class
            r3 = 0
            r4 = 29340(0x729c, float:4.1114E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f37764a
            r3 = 0
            r4 = 29340(0x729c, float:4.1114E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.support.v7.widget.RecyclerView$LayoutManager> r1 = android.support.v7.widget.RecyclerView.LayoutManager.class
            r5[r8] = r1
            java.lang.Class<android.support.v7.widget.OrientationHelper> r6 = android.support.v7.widget.OrientationHelper.class
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.support.v7.widget.OrientationHelper r0 = (android.support.v7.widget.OrientationHelper) r0
            return r0
        L_0x0033:
            android.support.v7.widget.OrientationHelper r0 = r9.f37765b
            if (r0 == 0) goto L_0x0044
            android.support.v7.widget.OrientationHelper r0 = r9.f37765b
            if (r0 != 0) goto L_0x003e
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x003e:
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            if (r0 == r10) goto L_0x004a
        L_0x0044:
            android.support.v7.widget.OrientationHelper r0 = android.support.v7.widget.OrientationHelper.createVerticalHelper(r10)
            r9.f37765b = r0
        L_0x004a:
            android.support.v7.widget.OrientationHelper r0 = r9.f37765b
            if (r0 != 0) goto L_0x0051
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelPagerSnapHelper.a(android.support.v7.widget.RecyclerView$LayoutManager):android.support.v7.widget.OrientationHelper");
    }

    private final View c(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        RecyclerView.LayoutManager layoutManager2 = layoutManager;
        OrientationHelper orientationHelper2 = orientationHelper;
        if (PatchProxy.isSupport(new Object[]{layoutManager2, orientationHelper2}, this, f37764a, false, 29344, new Class[]{RecyclerView.LayoutManager.class, OrientationHelper.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutManager2, orientationHelper2}, this, f37764a, false, 29344, new Class[]{RecyclerView.LayoutManager.class, OrientationHelper.class}, View.class);
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager2.getChildAt(i2);
            int abs = Math.abs(orientationHelper2.getDecoratedStart(childAt));
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    @Nullable
    public final int[] calculateDistanceToFinalSnap(@NotNull RecyclerView.LayoutManager layoutManager, @NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{layoutManager, view}, this, f37764a, false, 29337, new Class[]{RecyclerView.LayoutManager.class, View.class}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{layoutManager, view}, this, f37764a, false, 29337, new Class[]{RecyclerView.LayoutManager.class, View.class}, int[].class);
        }
        Intrinsics.checkParameterIsNotNull(layoutManager, "layoutManager");
        Intrinsics.checkParameterIsNotNull(view, "targetView");
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

    private final View b(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        RecyclerView.LayoutManager layoutManager2 = layoutManager;
        OrientationHelper orientationHelper2 = orientationHelper;
        if (PatchProxy.isSupport(new Object[]{layoutManager2, orientationHelper2}, this, f37764a, false, 29343, new Class[]{RecyclerView.LayoutManager.class, OrientationHelper.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutManager2, orientationHelper2}, this, f37764a, false, 29343, new Class[]{RecyclerView.LayoutManager.class, OrientationHelper.class}, View.class);
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager2.getChildAt(i2);
            int decoratedEnd = orientationHelper2.getDecoratedEnd(childAt);
            if (decoratedEnd > i) {
                view = childAt;
                i = decoratedEnd;
            }
        }
        return view;
    }

    private final View a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        RecyclerView.LayoutManager layoutManager2 = layoutManager;
        OrientationHelper orientationHelper2 = orientationHelper;
        if (PatchProxy.isSupport(new Object[]{layoutManager2, orientationHelper2}, this, f37764a, false, 29342, new Class[]{RecyclerView.LayoutManager.class, OrientationHelper.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutManager2, orientationHelper2}, this, f37764a, false, 29342, new Class[]{RecyclerView.LayoutManager.class, OrientationHelper.class}, View.class);
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager2.getChildAt(i2);
            int decoratedStart = orientationHelper2.getDecoratedStart(childAt);
            if (decoratedStart < i) {
                view = childAt;
                i = decoratedStart;
            }
        }
        return view;
    }

    private final int a(RecyclerView.LayoutManager layoutManager, View view, OrientationHelper orientationHelper) {
        View view2 = view;
        OrientationHelper orientationHelper2 = orientationHelper;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{layoutManager, view2, orientationHelper2}, this, f37764a, false, 29345, new Class[]{RecyclerView.LayoutManager.class, View.class, OrientationHelper.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{layoutManager, view2, orientationHelper2}, this, f37764a, false, 29345, new Class[]{RecyclerView.LayoutManager.class, View.class, OrientationHelper.class}, Integer.TYPE)).intValue();
        }
        int decoratedStart = orientationHelper2.getDecoratedStart(view2);
        if (layoutManager.getClipToPadding()) {
            i = orientationHelper.getStartAfterPadding();
        }
        return decoratedStart - i;
    }

    public final int findTargetSnapPosition(@Nullable RecyclerView.LayoutManager layoutManager, int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        RecyclerView.LayoutManager layoutManager2 = layoutManager;
        if (PatchProxy.isSupport(new Object[]{layoutManager2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f37764a, false, 29339, new Class[]{RecyclerView.LayoutManager.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{layoutManager2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f37764a, false, 29339, new Class[]{RecyclerView.LayoutManager.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (layoutManager2 == null) {
            return -1;
        } else {
            int itemCount = layoutManager.getItemCount();
            if (itemCount == 0) {
                return -1;
            }
            OrientationHelper orientationHelper = null;
            if (layoutManager.canScrollVertically()) {
                orientationHelper = a(layoutManager);
            } else if (layoutManager.canScrollHorizontally()) {
                orientationHelper = b(layoutManager);
            }
            OrientationHelper orientationHelper2 = orientationHelper;
            if (orientationHelper2 == null) {
                return -1;
            }
            View a2 = a(layoutManager2, orientationHelper2);
            View b2 = b(layoutManager2, orientationHelper2);
            if (a2 == null || b2 == null) {
                return -1;
            }
            int position = layoutManager2.getPosition(a2);
            int position2 = layoutManager2.getPosition(b2);
            if (position == -1 || position2 == -1) {
                return -1;
            }
            if (!layoutManager.canScrollHorizontally() ? i2 <= 0 : i <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (position2 == itemCount - 1) {
                    i3 = position2;
                    if (PatchProxy.isSupport(new Object[]{layoutManager2, b2, orientationHelper2}, this, f37764a, false, 29346, new Class[]{RecyclerView.LayoutManager.class, View.class, OrientationHelper.class}, Integer.TYPE)) {
                        i4 = ((Integer) PatchProxy.accessDispatch(new Object[]{layoutManager2, b2, orientationHelper2}, this, f37764a, false, 29346, new Class[]{RecyclerView.LayoutManager.class, View.class, OrientationHelper.class}, Integer.TYPE)).intValue();
                    } else {
                        int decoratedEnd = orientationHelper2.getDecoratedEnd(b2);
                        if (layoutManager.getClipToPadding()) {
                            i5 = orientationHelper2.getEndAfterPadding();
                        } else {
                            i5 = orientationHelper2.getEnd();
                        }
                        i4 = decoratedEnd - i5;
                    }
                    if (i4 == 0) {
                        return -1;
                    }
                } else {
                    i3 = position2;
                }
                return i3;
            } else if (position == 0 && a(layoutManager2, a2, orientationHelper2) == 0) {
                return -1;
            } else {
                return position;
            }
        }
    }
}
