package com.ss.android.ugc.aweme.commerce.preview.footprint;

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

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f37431d;

    /* renamed from: a  reason: collision with root package name */
    private Scroller f37432a;

    /* renamed from: b  reason: collision with root package name */
    private final RecyclerView.OnScrollListener f37433b = new RecyclerView.OnScrollListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37435a;

        /* renamed from: b  reason: collision with root package name */
        boolean f37436b;

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f37435a, false, 28975, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f37435a, false, 28975, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f37436b) {
                this.f37436b = false;
                SnapHelper.this.a();
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f37436b = true;
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    RecyclerView f37434e;

    public abstract int a(RecyclerView.LayoutManager layoutManager, int i, int i2);

    @Nullable
    public abstract View a(RecyclerView.LayoutManager layoutManager);

    @Nullable
    public abstract int[] a(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view);

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f37431d, false, 28973, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37431d, false, 28973, new Class[0], Void.TYPE);
        } else if (this.f37434e != null) {
            RecyclerView.LayoutManager layoutManager = this.f37434e.getLayoutManager();
            if (layoutManager != null) {
                View a2 = a(layoutManager);
                if (a2 != null) {
                    int[] a3 = a(layoutManager, a2);
                    if (!(a3[0] == 0 && a3[1] == 0)) {
                        this.f37434e.smoothScrollBy(a3[0], a3[1]);
                    }
                }
            }
        }
    }

    @Nullable
    @Deprecated
    public LinearSmoothScroller b(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider)) {
            return null;
        }
        return new LinearSmoothScroller(this.f37434e.getContext()) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37438a;

            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                View view2 = view;
                RecyclerView.SmoothScroller.Action action2 = action;
                if (PatchProxy.isSupport(new Object[]{view2, state, action2}, this, f37438a, false, 28976, new Class[]{View.class, RecyclerView.State.class, RecyclerView.SmoothScroller.Action.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2, state, action2}, this, f37438a, false, 28976, new Class[]{View.class, RecyclerView.State.class, RecyclerView.SmoothScroller.Action.class}, Void.TYPE);
                } else if (SnapHelper.this.f37434e != null) {
                    int[] a2 = SnapHelper.this.a(SnapHelper.this.f37434e.getLayoutManager(), view);
                    int i = a2[0];
                    int i2 = a2[1];
                    int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                    if (calculateTimeForDeceleration > 0) {
                        action2.update(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }
            }
        };
    }

    public final void a(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f37431d, false, 28968, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f37431d, false, 28968, new Class[]{RecyclerView.class}, Void.TYPE);
        } else if (this.f37434e != recyclerView) {
            if (this.f37434e != null) {
                if (PatchProxy.isSupport(new Object[0], this, f37431d, false, 28970, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f37431d, false, 28970, new Class[0], Void.TYPE);
                } else {
                    this.f37434e.removeOnScrollListener(this.f37433b);
                    this.f37434e.setOnFlingListener(null);
                }
            }
            this.f37434e = recyclerView;
            if (this.f37434e != null) {
                if (PatchProxy.isSupport(new Object[0], this, f37431d, false, 28969, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f37431d, false, 28969, new Class[0], Void.TYPE);
                } else if (this.f37434e.getOnFlingListener() == null) {
                    this.f37434e.addOnScrollListener(this.f37433b);
                    this.f37434e.setOnFlingListener(this);
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                this.f37432a = new Scroller(this.f37434e.getContext(), new DecelerateInterpolator());
                a();
            }
        }
    }

    public boolean onFling(int i, int i2) {
        boolean z;
        RecyclerView.SmoothScroller smoothScroller;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f37431d, false, 28967, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f37431d, false, 28967, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = this.f37434e.getLayoutManager();
        if (layoutManager == null || this.f37434e.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f37434e.getMinFlingVelocity();
        if (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) {
            if (PatchProxy.isSupport(new Object[]{layoutManager, Integer.valueOf(i), Integer.valueOf(i2)}, this, f37431d, false, 28972, new Class[]{RecyclerView.LayoutManager.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{layoutManager, Integer.valueOf(i), Integer.valueOf(i2)}, this, f37431d, false, 28972, new Class[]{RecyclerView.LayoutManager.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else {
                if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
                    if (PatchProxy.isSupport(new Object[]{layoutManager}, this, f37431d, false, 28974, new Class[]{RecyclerView.LayoutManager.class}, RecyclerView.SmoothScroller.class)) {
                        smoothScroller = (RecyclerView.SmoothScroller) PatchProxy.accessDispatch(new Object[]{layoutManager}, this, f37431d, false, 28974, new Class[]{RecyclerView.LayoutManager.class}, RecyclerView.SmoothScroller.class);
                    } else {
                        smoothScroller = b(layoutManager);
                    }
                    if (smoothScroller != null) {
                        int a2 = a(layoutManager, i, i2);
                        if (a2 != -1) {
                            smoothScroller.setTargetPosition(a2);
                            layoutManager.startSmoothScroll(smoothScroller);
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
