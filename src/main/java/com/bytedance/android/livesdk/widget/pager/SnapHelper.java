package com.bytedance.android.livesdk.widget.pager;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class SnapHelper extends RecyclerView.OnFlingListener {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f18538f;

    /* renamed from: a  reason: collision with root package name */
    private Scroller f18539a;

    /* renamed from: b  reason: collision with root package name */
    private final RecyclerView.OnScrollListener f18540b = new RecyclerView.OnScrollListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18541a;

        /* renamed from: b  reason: collision with root package name */
        boolean f18542b;

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f18541a, false, 14886, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f18541a, false, 14886, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f18542b) {
                SnapHelper.this.a();
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f18542b = true;
            }
        }
    };
    protected RecyclerView g;

    public abstract int a(RecyclerView.LayoutManager layoutManager, int i, int i2);

    @Nullable
    public abstract View a(RecyclerView.LayoutManager layoutManager);

    @Nullable
    public abstract int[] a(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view);

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f18538f, false, 14884, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18538f, false, 14884, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            RecyclerView.LayoutManager layoutManager = this.g.getLayoutManager();
            if (layoutManager != null) {
                View a2 = a(layoutManager);
                if (a2 != null) {
                    int[] a3 = a(layoutManager, a2);
                    if (!(a3[0] == 0 && a3[1] == 0)) {
                        this.g.smoothScrollBy(a3[0], a3[1]);
                    }
                }
            }
        }
    }

    @Nullable
    public LinearSmoothScroller b(RecyclerView.LayoutManager layoutManager) {
        if (PatchProxy.isSupport(new Object[]{layoutManager}, this, f18538f, false, 14885, new Class[]{RecyclerView.LayoutManager.class}, LinearSmoothScroller.class)) {
            return (LinearSmoothScroller) PatchProxy.accessDispatch(new Object[]{layoutManager}, this, f18538f, false, 14885, new Class[]{RecyclerView.LayoutManager.class}, LinearSmoothScroller.class);
        } else if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider)) {
            return null;
        } else {
            return new LinearSmoothScroller(this.g.getContext()) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f18544a;

                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / ((float) displayMetrics.densityDpi);
                }

                public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    View view2 = view;
                    RecyclerView.SmoothScroller.Action action2 = action;
                    if (PatchProxy.isSupport(new Object[]{view2, state, action2}, this, f18544a, false, 14887, new Class[]{View.class, RecyclerView.State.class, RecyclerView.SmoothScroller.Action.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2, state, action2}, this, f18544a, false, 14887, new Class[]{View.class, RecyclerView.State.class, RecyclerView.SmoothScroller.Action.class}, Void.TYPE);
                        return;
                    }
                    int[] a2 = SnapHelper.this.a(SnapHelper.this.g.getLayoutManager(), view);
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

    public final void a(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f18538f, false, 14879, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f18538f, false, 14879, new Class[]{RecyclerView.class}, Void.TYPE);
        } else if (this.g != recyclerView) {
            if (this.g != null) {
                if (PatchProxy.isSupport(new Object[0], this, f18538f, false, 14881, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f18538f, false, 14881, new Class[0], Void.TYPE);
                } else {
                    this.g.removeOnScrollListener(this.f18540b);
                    this.g.setOnFlingListener(null);
                }
            }
            this.g = recyclerView;
            if (this.g != null) {
                if (PatchProxy.isSupport(new Object[0], this, f18538f, false, 14880, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f18538f, false, 14880, new Class[0], Void.TYPE);
                } else if (this.g.getOnFlingListener() == null) {
                    this.g.addOnScrollListener(this.f18540b);
                    this.g.setOnFlingListener(this);
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                this.f18539a = new Scroller(this.g.getContext(), new DecelerateInterpolator());
                a();
            }
        }
    }

    public boolean onFling(int i, int i2) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f18538f, false, 14878, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f18538f, false, 14878, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = this.g.getLayoutManager();
        if (layoutManager == null || this.g.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.g.getMinFlingVelocity();
        if (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) {
            if (PatchProxy.isSupport(new Object[]{layoutManager, Integer.valueOf(i), Integer.valueOf(i2)}, this, f18538f, false, 14883, new Class[]{RecyclerView.LayoutManager.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{layoutManager, Integer.valueOf(i), Integer.valueOf(i2)}, this, f18538f, false, 14883, new Class[]{RecyclerView.LayoutManager.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else {
                if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
                    LinearSmoothScroller b2 = b(layoutManager);
                    if (b2 != null) {
                        int a2 = a(layoutManager, i, i2);
                        if (a2 != -1) {
                            b2.setTargetPosition(a2);
                            layoutManager.startSmoothScroll(b2);
                            z = true;
                        }
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
