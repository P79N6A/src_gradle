package com.ss.android.ugc.aweme.common.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class PullUpLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40465a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.common.widget.scrollablelayout.a f40466b;

    /* renamed from: c  reason: collision with root package name */
    public a f40467c;

    /* renamed from: d  reason: collision with root package name */
    private Context f40468d;

    /* renamed from: e  reason: collision with root package name */
    private float f40469e;

    /* renamed from: f  reason: collision with root package name */
    private View f40470f;
    private VelocityTracker g;
    private boolean h;
    private ObjectAnimator i;
    private b j;

    public interface a {
    }

    public interface b {
        void a(MotionEvent motionEvent);
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f40465a, false, 33757, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40465a, false, 33757, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.g = VelocityTracker.obtain();
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f40465a, false, 33756, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40465a, false, 33756, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        if (this.g != null) {
            this.g.clear();
            this.g.recycle();
            this.g = null;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40465a, false, 33760, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40465a, false, 33760, new Class[0], Void.TYPE);
            return;
        }
        float translationY = this.f40470f.getTranslationY();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f40470f, "translationY", new float[]{translationY, 0.0f});
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    public void setAnimationListener(a aVar) {
        this.f40467c = aVar;
    }

    public void setInternalTouchEventListener(b bVar) {
        this.j = bVar;
    }

    public void setPullUpListener(@NonNull com.ss.android.ugc.aweme.common.widget.scrollablelayout.a aVar) {
        this.f40466b = aVar;
    }

    public PullUpLayout(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f40465a, false, 33761, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f40465a, false, 33761, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.j != null) {
            this.j.a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f40465a, false, 33755, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f40465a, false, 33755, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.f40469e = motionEvent.getY();
        } else if (motionEvent.getAction() == 2 && this.f40469e - motionEvent.getY() > ((float) ViewConfiguration.get(this.f40468d).getScaledTouchSlop())) {
            return this.h;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f40465a, false, 33758, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f40465a, false, 33758, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        this.g.addMovement(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f40469e = motionEvent.getY();
        }
        if (motionEvent.getAction() == 2) {
            if ((this.f40470f == null || this.f40470f.getTranslationY() <= 0.0f) && !onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            this.f40470f.setTranslationY((float) ((int) Math.min(0.0f, motionEvent.getY() - this.f40469e)));
        } else if (motionEvent.getAction() == 1) {
            float translationY = this.f40470f.getTranslationY();
            if (Math.abs(this.f40470f.getTranslationY() / ((float) this.f40470f.getHeight())) > 0.3f) {
                z = true;
            }
            a(translationY, z);
        }
        return true;
    }

    public PullUpLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(float f2, final boolean z) {
        long j2;
        long j3;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f40465a, false, 33759, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Byte.valueOf(z)}, this, f40465a, false, 33759, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f40470f != null) {
            this.g.computeCurrentVelocity(2);
            long j4 = 300;
            if (z) {
                if (this.g.getYVelocity() != 0.0f) {
                    j2 = (long) ((((float) this.f40470f.getHeight()) + f2) / Math.abs(this.g.getYVelocity()));
                } else {
                    j2 = 300;
                }
                this.i = ObjectAnimator.ofFloat(this.f40470f, "translationY", new float[]{f2, (float) (-this.f40470f.getHeight())});
            } else {
                if (this.g.getYVelocity() != 0.0f) {
                    j3 = (long) (f2 / Math.abs(this.g.getYVelocity()));
                } else {
                    j3 = 300;
                }
                this.i = ObjectAnimator.ofFloat(this.f40470f, "translationY", new float[]{f2, 0.0f});
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (Math.abs(j2) <= 300) {
                j4 = Math.abs(j2);
            }
            animatorSet.setDuration(j4);
            animatorSet.play(this.i);
            animatorSet.addListener(new Animator.AnimatorListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f40471a;

                public final void onAnimationCancel(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f40471a, false, 33766, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f40471a, false, 33766, new Class[]{Animator.class}, Void.TYPE);
                    }
                }

                public final void onAnimationRepeat(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f40471a, false, 33767, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f40471a, false, 33767, new Class[]{Animator.class}, Void.TYPE);
                    }
                }

                public final void onAnimationStart(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f40471a, false, 33764, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f40471a, false, 33764, new Class[]{Animator.class}, Void.TYPE);
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f40471a, false, 33765, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f40471a, false, 33765, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    if (PullUpLayout.this.f40466b != null && z) {
                        PullUpLayout.this.f40466b.a();
                    }
                }
            });
            animatorSet.start();
        }
    }

    public final void a(View view, boolean z) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, (byte) 0}, this, f40465a, false, 33754, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, (byte) 0}, this, f40465a, false, 33754, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f40470f = view2;
    }

    public PullUpLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = true;
        this.f40468d = context;
        this.g = VelocityTracker.obtain();
    }
}
