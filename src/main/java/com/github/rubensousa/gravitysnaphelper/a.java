package com.github.rubensousa.gravitysnaphelper;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    int f24392a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f24393b;

    /* renamed from: c  reason: collision with root package name */
    GravitySnapHelper.a f24394c;

    /* renamed from: d  reason: collision with root package name */
    boolean f24395d;

    /* renamed from: e  reason: collision with root package name */
    private OrientationHelper f24396e;

    /* renamed from: f  reason: collision with root package name */
    private OrientationHelper f24397f;
    private boolean g;
    private RecyclerView.OnScrollListener h;

    private OrientationHelper b(RecyclerView.LayoutManager layoutManager) {
        if (this.f24396e == null) {
            this.f24396e = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.f24396e;
    }

    private OrientationHelper c(RecyclerView.LayoutManager layoutManager) {
        if (this.f24397f == null) {
            this.f24397f = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.f24397f;
    }

    public final void a(@NonNull RecyclerView recyclerView) {
        if (recyclerView != null) {
            if ((this.f24392a == 8388611 || this.f24392a == 8388613) && Build.VERSION.SDK_INT >= 17) {
                boolean z = true;
                if (recyclerView.getContext().getResources().getConfiguration().getLayoutDirection() != 1) {
                    z = false;
                }
                this.g = z;
            }
            if (this.f24394c != null) {
                recyclerView.addOnScrollListener(this.h);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(android.support.v7.widget.RecyclerView.LayoutManager r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof android.support.v7.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x003d
            int r0 = r2.f24392a
            r1 = 48
            if (r0 == r1) goto L_0x0034
            r1 = 80
            if (r0 == r1) goto L_0x002b
            r1 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 == r1) goto L_0x0022
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r0 == r1) goto L_0x0019
            goto L_0x003d
        L_0x0019:
            android.support.v7.widget.OrientationHelper r0 = r2.c(r3)
            android.view.View r3 = r2.b(r3, r0)
            goto L_0x003e
        L_0x0022:
            android.support.v7.widget.OrientationHelper r0 = r2.c(r3)
            android.view.View r3 = r2.a((android.support.v7.widget.RecyclerView.LayoutManager) r3, (android.support.v7.widget.OrientationHelper) r0)
            goto L_0x003e
        L_0x002b:
            android.support.v7.widget.OrientationHelper r0 = r2.b(r3)
            android.view.View r3 = r2.b(r3, r0)
            goto L_0x003e
        L_0x0034:
            android.support.v7.widget.OrientationHelper r0 = r2.b(r3)
            android.view.View r3 = r2.a((android.support.v7.widget.RecyclerView.LayoutManager) r3, (android.support.v7.widget.OrientationHelper) r0)
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            if (r3 == 0) goto L_0x0042
            r0 = 1
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            r2.f24395d = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.rubensousa.gravitysnaphelper.a.a(android.support.v7.widget.RecyclerView$LayoutManager):android.view.View");
    }

    private View a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        float f2;
        boolean z;
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition == -1) {
            return null;
        }
        View findViewByPosition = layoutManager.findViewByPosition(findFirstVisibleItemPosition);
        if (this.g) {
            f2 = ((float) (orientationHelper.getTotalSpace() - orientationHelper.getDecoratedStart(findViewByPosition))) / ((float) orientationHelper.getDecoratedMeasurement(findViewByPosition));
        } else {
            f2 = ((float) orientationHelper.getDecoratedEnd(findViewByPosition)) / ((float) orientationHelper.getDecoratedMeasurement(findViewByPosition));
        }
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == layoutManager.getItemCount() - 1) {
            z = true;
        } else {
            z = false;
        }
        if (f2 > 0.5f && !z) {
            return findViewByPosition;
        }
        if (this.f24393b && z) {
            return findViewByPosition;
        }
        if (z) {
            return null;
        }
        return layoutManager.findViewByPosition(findFirstVisibleItemPosition + 1);
    }

    private View b(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        float f2;
        boolean z;
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (findLastVisibleItemPosition == -1) {
            return null;
        }
        View findViewByPosition = layoutManager.findViewByPosition(findLastVisibleItemPosition);
        if (this.g) {
            f2 = ((float) orientationHelper.getDecoratedEnd(findViewByPosition)) / ((float) orientationHelper.getDecoratedMeasurement(findViewByPosition));
        } else {
            f2 = ((float) (orientationHelper.getTotalSpace() - orientationHelper.getDecoratedStart(findViewByPosition))) / ((float) orientationHelper.getDecoratedMeasurement(findViewByPosition));
        }
        if (linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (f2 > 0.5f && !z) {
            return findViewByPosition;
        }
        if (this.f24393b && z) {
            return findViewByPosition;
        }
        if (z) {
            return null;
        }
        return layoutManager.findViewByPosition(findLastVisibleItemPosition - 1);
    }

    public final int[] a(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int[] iArr = new int[2];
        if (!layoutManager.canScrollHorizontally()) {
            iArr[0] = 0;
        } else if (this.f24392a == 8388611) {
            iArr[0] = a(view, c(layoutManager), false);
        } else {
            iArr[0] = b(view, c(layoutManager), false);
        }
        if (!layoutManager.canScrollVertically()) {
            iArr[1] = 0;
        } else if (this.f24392a == 48) {
            iArr[1] = a(view, b(layoutManager), false);
        } else {
            iArr[1] = b(view, b(layoutManager), false);
        }
        return iArr;
    }

    private int a(View view, OrientationHelper orientationHelper, boolean z) {
        if (!this.g || z) {
            return orientationHelper.getDecoratedStart(view) - orientationHelper.getStartAfterPadding();
        }
        return b(view, orientationHelper, true);
    }

    private int b(View view, OrientationHelper orientationHelper, boolean z) {
        if (!this.g || z) {
            return orientationHelper.getDecoratedEnd(view) - orientationHelper.getEndAfterPadding();
        }
        return a(view, orientationHelper, true);
    }
}
