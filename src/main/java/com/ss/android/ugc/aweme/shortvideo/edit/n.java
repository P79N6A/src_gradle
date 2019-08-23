package com.ss.android.ugc.aweme.shortvideo.edit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.filter.y;
import com.ss.android.ugc.aweme.shortvideo.gesture.defult.DefaultGesturePresenter;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout;
import com.ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator;

public final class n extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67468a;

    /* renamed from: b  reason: collision with root package name */
    public DefaultGesturePresenter f67469b;

    /* renamed from: c  reason: collision with root package name */
    public a f67470c;

    /* renamed from: d  reason: collision with root package name */
    public h f67471d;

    /* renamed from: e  reason: collision with root package name */
    public h f67472e;

    /* renamed from: f  reason: collision with root package name */
    public b f67473f;
    public boolean g;
    private ViewGroup h;
    private Context i;
    private VideoRecordGestureLayout j;
    private LifecycleOwner k;
    private Animator.AnimatorListener l = new AnimatorListenerAdapter() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67474a;

        public final void onAnimationStart(Animator animator) {
            n.this.f67469b.f67908e = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f67474a, false, 76285, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f67474a, false, 76285, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            if (n.this.f67472e != null) {
                n.this.f67471d = n.this.f67472e;
                n.this.f67469b.f67907d = 0.0f;
                if (n.this.f67470c != null) {
                    n.this.f67470c.a(n.this.f67471d);
                }
                n.this.f67473f.a(n.this.f67471d);
            }
            n.this.f67469b.f67908e = false;
        }
    };
    private ValueAnimator.AnimatorUpdateListener m = new ValueAnimator.AnimatorUpdateListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67476a;

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f67476a, false, 76286, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f67476a, false, 76286, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            n.this.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    };

    public interface a {
        void a(h hVar);

        void a(h hVar, h hVar2, float f2);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67478a;

        /* renamed from: b  reason: collision with root package name */
        private final Context f67479b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f67480c;

        /* renamed from: d  reason: collision with root package name */
        private CompositeStoryFilterIndicator f67481d;

        /* renamed from: e  reason: collision with root package name */
        private h f67482e;

        private void b(h hVar) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{hVar}, this, f67478a, false, 76289, new Class[]{h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar}, this, f67478a, false, 76289, new Class[]{h.class}, Void.TYPE);
                return;
            }
            String c2 = com.ss.android.ugc.aweme.port.in.a.d().c(this.f67482e);
            String c3 = com.ss.android.ugc.aweme.port.in.a.d().c(hVar);
            CompositeStoryFilterIndicator compositeStoryFilterIndicator = this.f67481d;
            com.ss.android.ugc.aweme.story.widget.a aVar = new com.ss.android.ugc.aweme.story.widget.a(this.f67482e.f47599c, c2);
            com.ss.android.ugc.aweme.story.widget.a aVar2 = new com.ss.android.ugc.aweme.story.widget.a(hVar.f47599c, c3);
            if (this.f67482e.f47602f >= hVar.f47602f) {
                z = false;
            }
            compositeStoryFilterIndicator.a(aVar, aVar2, z);
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f67478a, false, 76287, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f67478a, false, 76287, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f67481d = new CompositeStoryFilterIndicator(this.f67479b);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            this.f67481d.setLayoutParams(layoutParams);
            this.f67481d.setVisibility(8);
            this.f67480c.addView(this.f67481d, i);
        }

        public final void a(h hVar) {
            if (PatchProxy.isSupport(new Object[]{hVar}, this, f67478a, false, 76288, new Class[]{h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar}, this, f67478a, false, 76288, new Class[]{h.class}, Void.TYPE);
            } else if (this.f67481d != null && this.f67482e.f47602f != hVar.f47602f) {
                b(hVar);
                this.f67482e = hVar;
            }
        }

        public b(Context context, ViewGroup viewGroup, h hVar) {
            this.f67479b = context;
            this.f67480c = viewGroup;
            this.f67482e = hVar == null ? y.a(0) : hVar;
        }
    }

    private static int d(float f2) {
        if (f2 == 0.0f) {
            return 0;
        }
        return f2 < 0.0f ? -1 : 1;
    }

    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    public final boolean b(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    private void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f67468a, false, 76279, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f67468a, false, 76279, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.j = new VideoRecordGestureLayout(this.i);
        this.j.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.h.addView(this.j, i2);
        this.f67473f.a(i2 + 1);
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67468a, false, 76282, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67468a, false, 76282, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.g) {
            c(f2);
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{1}, this, f67468a, false, 76278, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{1}, this, f67468a, false, 76278, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        b(1);
        this.f67469b = new DefaultGesturePresenter(this.k, this, this.j);
    }

    public final void c(float f2) {
        int i2;
        float f3;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67468a, false, 76284, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67468a, false, 76284, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        int d2 = d(f2);
        int i3 = this.f67471d.f47602f;
        if (d2 == 0) {
            i2 = i3;
        } else if (d2 == -1) {
            int i4 = i3 - 1;
            if (i4 < 0) {
                i4 = 0;
            }
            int i5 = i3;
            i3 = i4;
            i2 = i5;
        } else {
            i2 = i3 + 1;
            if (i2 >= y.b().size()) {
                i2 = y.b().size() - 1;
            }
        }
        h a2 = y.a(i3);
        h a3 = y.a(i2);
        if (f2 < 0.0f) {
            f3 = Math.abs(f2);
        } else {
            f3 = 1.0f - f2;
        }
        if (this.f67470c != null) {
            this.f67470c.a(a2, a3, f3);
        }
    }

    public final void a(float f2, float f3) {
        long j2;
        ValueAnimator valueAnimator;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67468a, false, 76283, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67468a, false, 76283, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
        } else if (this.g) {
            int width = this.h.getWidth();
            if (Math.signum(f3) == Math.signum(f2)) {
                this.f67472e = this.f67471d;
                valueAnimator = ValueAnimator.ofFloat(new float[]{f3, 0.0f});
                j2 = (long) (((float) ((long) (((float) width) * Math.abs(f3)))) / ((Math.abs(f2) / 1000.0f) / 2.0f));
            } else {
                if (f2 >= 1.0E-5f) {
                    this.f67472e = y.a(Math.max(0, this.f67471d.f47602f - 1));
                    valueAnimator = ValueAnimator.ofFloat(new float[]{f3, -1.0f});
                } else {
                    this.f67472e = y.a(Math.min(y.b().size() - 1, this.f67471d.f47602f + 1));
                    valueAnimator = ValueAnimator.ofFloat(new float[]{f3, 1.0f});
                }
                j2 = (long) (((float) ((long) (((float) width) * (1.0f - Math.abs(f3))))) / ((Math.abs(f2) / 1000.0f) / 2.0f));
            }
            long min = Math.min(j2, 400);
            valueAnimator.setInterpolator(new DecelerateInterpolator());
            valueAnimator.setDuration(min);
            valueAnimator.addUpdateListener(this.m);
            valueAnimator.addListener(this.l);
            valueAnimator.start();
        }
    }

    public final void a(h hVar, boolean z) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, (byte) 0}, this, f67468a, false, 76281, new Class[]{h.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, (byte) 0}, this, f67468a, false, 76281, new Class[]{h.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f67471d = hVar2;
    }

    public n(ViewGroup viewGroup, Context context, LifecycleOwner lifecycleOwner, h hVar) {
        this.h = viewGroup;
        this.i = context;
        this.k = lifecycleOwner;
        this.f67471d = hVar;
        this.f67473f = new b(context, viewGroup, hVar);
        this.g = true;
    }
}
