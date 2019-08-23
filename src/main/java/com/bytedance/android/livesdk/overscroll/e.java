package com.bytedance.android.livesdk.overscroll;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.overscroll.adapters.IOverScrollDecoratorAdapter;
import com.bytedance.android.livesdk.overscroll.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class e implements View.OnTouchListener, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16749a;

    /* renamed from: b  reason: collision with root package name */
    protected final f f16750b = new f();

    /* renamed from: c  reason: collision with root package name */
    protected final IOverScrollDecoratorAdapter f16751c;

    /* renamed from: d  reason: collision with root package name */
    protected final d f16752d;

    /* renamed from: e  reason: collision with root package name */
    protected final g f16753e;

    /* renamed from: f  reason: collision with root package name */
    protected final b f16754f;
    protected c g;
    protected b h = new d.a();
    protected c i = new d.b();
    protected float j;
    protected View k;
    protected View l;

    protected static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public Property<View, Float> f16755a;

        /* renamed from: b  reason: collision with root package name */
        public float f16756b;

        /* renamed from: c  reason: collision with root package name */
        public float f16757c;

        public abstract void a(View view);
    }

    protected class b implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f16758a;

        /* renamed from: b  reason: collision with root package name */
        protected final Interpolator f16759b = new DecelerateInterpolator();

        /* renamed from: c  reason: collision with root package name */
        protected final float f16760c;

        /* renamed from: d  reason: collision with root package name */
        protected final float f16761d;

        /* renamed from: e  reason: collision with root package name */
        protected final a f16762e;

        public final boolean a(MotionEvent motionEvent) {
            return true;
        }

        public final boolean b(MotionEvent motionEvent) {
            return true;
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f16758a, false, 12558, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f16758a, false, 12558, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }

        public final void onAnimationEnd(Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f16758a, false, 12557, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f16758a, false, 12557, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            e.this.a(e.this.f16752d);
            if (PatchProxy.isSupport(new Object[0], null, f.f16779a, true, 12568, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f.f16779a, true, 12568, new Class[0], Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.j.a.a().a("end", new j(), Room.class);
        }

        public final void a(c cVar) {
            AnimatorSet animatorSet;
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f16758a, false, 12556, new Class[]{c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f16758a, false, 12556, new Class[]{c.class}, Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[0], this, f16758a, false, 12559, new Class[0], Animator.class)) {
                animatorSet = (Animator) PatchProxy.accessDispatch(new Object[0], this, f16758a, false, 12559, new Class[0], Animator.class);
            } else {
                View a2 = e.this.f16751c.a();
                this.f16762e.a(a2);
                ObjectAnimator a3 = a(a2, 400, e.this.f16750b.f16771b);
                ObjectAnimator objectAnimator = null;
                if (e.this.k != null && e.this.f16750b.f16772c) {
                    objectAnimator = a(e.this.k, 400, (float) (-e.this.k.getHeight()));
                }
                if (e.this.l != null && !e.this.f16750b.f16772c) {
                    objectAnimator = a(e.this.l, 400, (float) a2.getBottom());
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(a3);
                animatorSet = animatorSet2;
                if (objectAnimator != null) {
                    animatorSet2.play(objectAnimator).with(a3);
                    animatorSet = animatorSet2;
                }
            }
            animatorSet.addListener(this);
            animatorSet.start();
        }

        public b(float f2) {
            this.f16760c = f2;
            this.f16761d = f2 * 2.0f;
            this.f16762e = e.this.c();
        }

        private ObjectAnimator a(View view, int i, float f2) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2, 400, Float.valueOf(f2)}, this, f16758a, false, 12560, new Class[]{View.class, Integer.TYPE, Float.TYPE}, ObjectAnimator.class)) {
                return (ObjectAnimator) PatchProxy.accessDispatch(new Object[]{view2, 400, Float.valueOf(f2)}, this, f16758a, false, 12560, new Class[]{View.class, Integer.TYPE, Float.TYPE}, ObjectAnimator.class);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, this.f16762e.f16755a, new float[]{f2});
            ofFloat.setDuration((long) Math.max(400, 200));
            ofFloat.setInterpolator(this.f16759b);
            ofFloat.addUpdateListener(this);
            return ofFloat;
        }
    }

    protected interface c {
        void a(c cVar);

        boolean a(MotionEvent motionEvent);

        boolean b(MotionEvent motionEvent);
    }

    protected class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f16764a;

        /* renamed from: b  reason: collision with root package name */
        final C0114e f16765b;

        public final void a(c cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f16764a, false, 12562, new Class[]{c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f16764a, false, 12562, new Class[]{c.class}, Void.TYPE);
            }
        }

        public final boolean b(MotionEvent motionEvent) {
            return false;
        }

        public d() {
            this.f16765b = e.this.b();
        }

        public final boolean a(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f16764a, false, 12561, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f16764a, false, 12561, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            if (!this.f16765b.a(e.this.f16751c.a(), motionEvent)) {
                return false;
            }
            if ((!e.this.f16751c.b() || !this.f16765b.f16769c) && (!e.this.f16751c.c() || this.f16765b.f16769c)) {
                return false;
            }
            e.this.f16750b.f16770a = motionEvent.getPointerId(0);
            e.this.f16750b.f16771b = this.f16765b.f16767a;
            e.this.f16750b.f16772c = this.f16765b.f16769c;
            e.this.a(e.this.f16753e);
            return e.this.f16753e.a(motionEvent);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.overscroll.e$e  reason: collision with other inner class name */
    protected static abstract class C0114e {

        /* renamed from: a  reason: collision with root package name */
        public float f16767a;

        /* renamed from: b  reason: collision with root package name */
        public float f16768b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f16769c;

        public abstract boolean a(View view, MotionEvent motionEvent);
    }

    protected static class f {

        /* renamed from: a  reason: collision with root package name */
        protected int f16770a;

        /* renamed from: b  reason: collision with root package name */
        protected float f16771b;

        /* renamed from: c  reason: collision with root package name */
        protected boolean f16772c;

        protected f() {
        }
    }

    protected class g implements c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f16773a;

        /* renamed from: b  reason: collision with root package name */
        protected final float f16774b;

        /* renamed from: c  reason: collision with root package name */
        protected final float f16775c;

        /* renamed from: d  reason: collision with root package name */
        final C0114e f16776d;

        /* renamed from: e  reason: collision with root package name */
        int f16777e;

        public final void a(c cVar) {
            int i = 1;
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f16773a, false, 12565, new Class[]{c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f16773a, false, 12565, new Class[]{c.class}, Void.TYPE);
                return;
            }
            if (!e.this.f16750b.f16772c) {
                i = 2;
            }
            this.f16777e = i;
        }

        public final boolean b(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f16773a, false, 12564, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f16773a, false, 12564, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            e.this.a(e.this.f16754f);
            return false;
        }

        public final boolean a(MotionEvent motionEvent) {
            float f2;
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f16773a, false, 12563, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f16773a, false, 12563, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (e.this.f16750b.f16770a != motionEvent.getPointerId(0)) {
                e.this.a(e.this.f16754f);
                return true;
            } else {
                View a2 = e.this.f16751c.a();
                if (!this.f16776d.a(a2, motionEvent)) {
                    return true;
                }
                float f3 = this.f16776d.f16768b;
                if (this.f16776d.f16769c == e.this.f16750b.f16772c) {
                    f2 = this.f16774b;
                } else {
                    f2 = this.f16775c;
                }
                float f4 = f3 / f2;
                float f5 = this.f16776d.f16767a + f4;
                if ((!e.this.f16750b.f16772c || this.f16776d.f16769c || f5 > e.this.f16750b.f16771b) && (e.this.f16750b.f16772c || !this.f16776d.f16769c || f5 < e.this.f16750b.f16771b)) {
                    if (a2.getParent() != null) {
                        a2.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    long eventTime = motionEvent.getEventTime() - motionEvent.getHistoricalEventTime(0);
                    if (eventTime > 0) {
                        e.this.j = f4 / ((float) eventTime);
                    }
                    e.this.a(a2, f5);
                    return true;
                }
                e.this.a(a2, e.this.f16750b.f16771b, motionEvent);
                e.this.a(e.this.f16752d);
                return true;
            }
        }

        public g(float f2, float f3) {
            this.f16776d = e.this.b();
            this.f16774b = f2;
            this.f16775c = f3;
        }
    }

    public abstract void a(View view, float f2);

    public abstract void a(View view, float f2, MotionEvent motionEvent);

    public abstract C0114e b();

    public abstract a c();

    public final IOverScrollDecoratorAdapter a() {
        return this.f16751c;
    }

    private View d() {
        if (!PatchProxy.isSupport(new Object[0], this, f16749a, false, 12552, new Class[0], View.class)) {
            return this.f16751c.a();
        }
        return (View) PatchProxy.accessDispatch(new Object[0], this, f16749a, false, 12552, new Class[0], View.class);
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f16749a, false, 12553, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f16749a, false, 12553, new Class[]{c.class}, Void.TYPE);
            return;
        }
        c cVar2 = this.g;
        this.g = cVar;
        this.g.a(cVar2);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f16749a, false, 12548, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f16749a, false, 12548, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 1:
            case 3:
                return this.g.b(motionEvent);
            case 2:
                return this.g.a(motionEvent);
            default:
                return false;
        }
    }

    public e(IOverScrollDecoratorAdapter iOverScrollDecoratorAdapter, View view, View view2, float f2, float f3, float f4) {
        this.f16751c = iOverScrollDecoratorAdapter;
        this.k = view;
        this.l = view2;
        this.f16754f = new b(f2);
        this.f16753e = new g(f3, f4);
        this.f16752d = new d();
        this.g = this.f16752d;
        if (PatchProxy.isSupport(new Object[0], this, f16749a, false, 12554, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16749a, false, 12554, new Class[0], Void.TYPE);
            return;
        }
        d().setOnTouchListener(this);
        d().setOverScrollMode(2);
    }
}
