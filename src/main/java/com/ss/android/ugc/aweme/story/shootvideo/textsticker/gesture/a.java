package com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture;

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
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.filter.y;
import com.ss.android.ugc.aweme.shortvideo.edit.e;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout;
import com.ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator;

public class a extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74290a;

    /* renamed from: b  reason: collision with root package name */
    public StickerGesturePresenter f74291b;

    /* renamed from: c  reason: collision with root package name */
    public VideoRecordGestureLayout f74292c;

    /* renamed from: d  reason: collision with root package name */
    public C0031a f74293d;

    /* renamed from: e  reason: collision with root package name */
    public h f74294e;

    /* renamed from: f  reason: collision with root package name */
    public h f74295f;
    public b g;
    public boolean h;
    private ViewGroup i;
    private Context j;
    private LifecycleOwner k;
    private Animator.AnimatorListener l = new AnimatorListenerAdapter() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74296a;

        public final void onAnimationStart(Animator animator) {
            a.this.f74291b.f74280e = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f74296a, false, 86270, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f74296a, false, 86270, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            if (a.this.f74295f != null) {
                a.this.f74294e = a.this.f74295f;
                a.this.f74291b.f74279d = 0.0f;
                if (a.this.f74293d != null) {
                    a.this.f74293d.a(a.this.f74294e);
                }
                a.this.g.a(a.this.f74294e);
            }
            a.this.f74291b.f74280e = false;
        }
    };
    private ValueAnimator.AnimatorUpdateListener m = new ValueAnimator.AnimatorUpdateListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74298a;

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f74298a, false, 86271, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f74298a, false, 86271, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            a.this.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.a$a  reason: collision with other inner class name */
    public interface C0031a {
        void a(h hVar);

        void a(h hVar, h hVar2, float f2);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74300a;

        /* renamed from: b  reason: collision with root package name */
        private final Context f74301b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f74302c;

        /* renamed from: d  reason: collision with root package name */
        private CompositeStoryFilterIndicator f74303d;

        /* renamed from: e  reason: collision with root package name */
        private h f74304e;

        private void b(h hVar) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{hVar}, this, f74300a, false, 86274, new Class[]{h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar}, this, f74300a, false, 86274, new Class[]{h.class}, Void.TYPE);
                return;
            }
            String c2 = com.ss.android.ugc.aweme.port.in.a.d().c(this.f74304e);
            String c3 = com.ss.android.ugc.aweme.port.in.a.d().c(hVar);
            CompositeStoryFilterIndicator compositeStoryFilterIndicator = this.f74303d;
            com.ss.android.ugc.aweme.story.widget.a aVar = new com.ss.android.ugc.aweme.story.widget.a(this.f74304e.f47599c, c2);
            com.ss.android.ugc.aweme.story.widget.a aVar2 = new com.ss.android.ugc.aweme.story.widget.a(hVar.f47599c, c3);
            if (this.f74304e.f47602f >= hVar.f47602f) {
                z = false;
            }
            compositeStoryFilterIndicator.a(aVar, aVar2, z);
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74300a, false, 86272, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74300a, false, 86272, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f74303d = new CompositeStoryFilterIndicator(this.f74301b);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            this.f74303d.setLayoutParams(layoutParams);
            this.f74303d.setVisibility(8);
            this.f74302c.addView(this.f74303d, i);
        }

        public final void a(h hVar) {
            if (PatchProxy.isSupport(new Object[]{hVar}, this, f74300a, false, 86273, new Class[]{h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar}, this, f74300a, false, 86273, new Class[]{h.class}, Void.TYPE);
            } else if (this.f74303d != null && this.f74304e.f47602f != hVar.f47602f) {
                b(hVar);
                this.f74304e = hVar;
            }
        }

        public b(Context context, ViewGroup viewGroup, h hVar) {
            this.f74301b = context;
            this.f74302c = viewGroup;
            this.f74304e = hVar == null ? y.a(0) : hVar;
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

    public final void a(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f74290a, false, 86263, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f74290a, false, 86263, new Class[]{h.class}, Void.TYPE);
            return;
        }
        this.f74294e = hVar;
        this.g.a(hVar);
    }

    private void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74290a, false, 86262, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74290a, false, 86262, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f74292c = new VideoRecordGestureLayout(this.j);
        this.f74292c.setId(C0906R.id.dsr);
        this.f74292c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.i.addView(this.f74292c, i2);
        this.g.a(i2 + 1);
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f74290a, false, 86267, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f74290a, false, 86267, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.h) {
            c(f2);
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{1}, this, f74290a, false, 86261, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{1}, this, f74290a, false, 86261, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        b(1);
        this.f74291b = new StickerGesturePresenter(this.k, this, this.f74292c);
    }

    public final void c(float f2) {
        int i2;
        float f3;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f74290a, false, 86269, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f74290a, false, 86269, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        int d2 = d(f2);
        int i3 = this.f74294e.f47602f;
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
        if (this.f74293d != null) {
            this.f74293d.a(a2, a3, f3);
        }
    }

    public final void a(float f2, float f3) {
        long j2;
        ValueAnimator valueAnimator;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f74290a, false, 86268, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f74290a, false, 86268, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
        } else if (this.h) {
            int width = this.i.getWidth();
            if (Math.signum(f3) == Math.signum(f2)) {
                this.f74295f = this.f74294e;
                valueAnimator = ValueAnimator.ofFloat(new float[]{f3, 0.0f});
                j2 = (long) (((float) ((long) (((float) width) * Math.abs(f3)))) / ((Math.abs(f2) / 1000.0f) / 2.0f));
            } else {
                if (f2 >= 1.0E-5f) {
                    this.f74295f = y.a(Math.max(0, this.f74294e.f47602f - 1));
                    valueAnimator = ValueAnimator.ofFloat(new float[]{f3, -1.0f});
                } else {
                    this.f74295f = y.a(Math.min(y.b().size() - 1, this.f74294e.f47602f + 1));
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

    public a(ViewGroup viewGroup, Context context, LifecycleOwner lifecycleOwner, h hVar) {
        this.i = viewGroup;
        this.j = context;
        this.k = lifecycleOwner;
        this.f74294e = hVar;
        this.g = new b(context, viewGroup, hVar);
        this.h = true;
    }
}
