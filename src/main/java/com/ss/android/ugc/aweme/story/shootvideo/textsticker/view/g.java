package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Vibrator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.p;
import java.util.ArrayList;
import java.util.List;

public class g extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74375a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f74376b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f74377c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f74378d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f74379e;

    /* renamed from: f  reason: collision with root package name */
    private View f74380f;
    private View g;
    private View h;
    private boolean i;
    private Vibrator j;
    private int k;
    private List<a> l;

    public interface a {
        boolean a();

        boolean a(Object obj);

        boolean b(Object obj);

        boolean c(Object obj);
    }

    private void e() {
        this.i = false;
        this.f74376b = false;
        this.f74378d = false;
        this.f74377c = false;
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f74375a, false, 86348, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74375a, false, 86348, new Class[0], Void.TYPE);
            return;
        }
        if (this.h.getVisibility() == 0) {
            a(this.h, false, true);
        }
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f74375a, false, 86350, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74375a, false, 86350, new Class[0], Void.TYPE);
        } else if (this.f74378d) {
            this.f74378d = false;
            a(this.f74380f, false, true);
        }
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f74375a, false, 86353, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74375a, false, 86353, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            try {
                this.j.vibrate(10);
            } catch (Throwable unused) {
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f74375a, false, 86342, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74375a, false, 86342, new Class[0], Void.TYPE);
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.topMargin = p.c();
        setLayoutParams(layoutParams);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f74375a, false, 86355, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74375a, false, 86355, new Class[0], Void.TYPE);
            return;
        }
        f();
        d();
        this.i = false;
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f74375a, false, 86344, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74375a, false, 86344, new Class[0], Void.TYPE);
        } else if (!this.f74377c) {
            this.g.setVisibility(0);
            this.f74377c = true;
            a(this.g, true, false);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -20.0f, 10.0f, 30.0f);
            rotateAnimation.setDuration(300);
            rotateAnimation.setFillAfter(true);
            this.f74379e.startAnimation(rotateAnimation);
        }
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f74375a, false, 86345, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74375a, false, 86345, new Class[0], Void.TYPE);
        } else if (this.f74377c) {
            this.f74377c = false;
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 0.0f, 10.0f, 30.0f);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setDuration(300);
            this.f74379e.startAnimation(rotateAnimation);
            a(this.g, false, false);
        }
    }

    public g(@NonNull Context context) {
        this(context, null);
    }

    public void setStickerDeleteListener(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f74375a, false, 86354, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f74375a, false, 86354, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.l.add(aVar2);
    }

    private g(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, null);
        this.l = new ArrayList();
        if (PatchProxy.isSupport(new Object[]{context}, this, f74375a, false, 86343, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f74375a, false, 86343, new Class[]{Context.class}, Void.TYPE);
        } else {
            View inflate = LayoutInflater.from(context).inflate(C0906R.layout.a9d, null);
            this.f74379e = (ImageView) inflate.findViewById(C0906R.id.d5e);
            this.f74380f = inflate.findViewById(C0906R.id.a3k);
            this.h = inflate.findViewById(C0906R.id.bwf);
            this.g = inflate.findViewById(C0906R.id.kt);
            addView(inflate);
        }
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        this.j = (Vibrator) context.getSystemService("vibrator");
    }

    private void a(View view, boolean z, boolean z2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        final View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74375a, false, 86351, new Class[]{View.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z), Byte.valueOf(z2)}, this, f74375a, false, 86351, new Class[]{View.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = new float[2];
        float f7 = 1.0f;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        fArr[0] = f2;
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        fArr[1] = f3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", fArr);
        float[] fArr2 = new float[2];
        if (z) {
            f4 = 0.0f;
        } else {
            f4 = 1.0f;
        }
        fArr2[0] = f4;
        if (z) {
            f5 = 1.0f;
        } else {
            f5 = 0.0f;
        }
        fArr2[1] = f5;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "scaleX", fArr2);
        float[] fArr3 = new float[2];
        if (z) {
            f6 = 0.0f;
        } else {
            f6 = 1.0f;
        }
        fArr3[0] = f6;
        if (!z) {
            f7 = 0.0f;
        }
        fArr3[1] = f7;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "scaleY", fArr3);
        animatorSet.setDuration(300);
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        final boolean z3 = z2;
        animatorSet.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74381a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f74381a, false, 86356, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f74381a, false, 86356, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (z3) {
                    view2.setVisibility(8);
                }
                super.onAnimationEnd(animator);
            }
        });
        animatorSet.start();
    }

    public final void a(Object obj, int i2, int i3, boolean z, boolean z2) {
        int i4;
        int i5;
        Object obj2 = obj;
        int i6 = i2;
        int i7 = i3;
        if (PatchProxy.isSupport(new Object[]{obj2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74375a, false, 86352, new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z), Byte.valueOf(z2)}, this, f74375a, false, 86352, new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            if (z) {
                f();
                d();
                this.i = false;
                e();
                if (this.k == 1) {
                    i5 = 2;
                } else {
                    i5 = -1;
                }
            } else {
                g();
                c();
                this.i = true;
                i5 = 1;
            }
            i4 = 3;
        } else {
            i4 = 3;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z)}, this, f74375a, false, 86346, new Class[]{Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
                i5 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z)}, this, f74375a, false, 86346, new Class[]{Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
            } else {
                Rect rect = new Rect(getLeft(), getTop(), getRight(), getBottom());
                if (z) {
                    if (rect.contains(i6, i7)) {
                        f();
                        d();
                        i5 = 2;
                    } else {
                        f();
                        d();
                    }
                } else if (rect.contains(i6, i7)) {
                    g();
                    c();
                    this.i = true;
                    i5 = 1;
                } else {
                    d();
                    if (PatchProxy.isSupport(new Object[0], this, f74375a, false, 86347, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f74375a, false, 86347, new Class[0], Void.TYPE);
                    } else if (this.h.getVisibility() == 8) {
                        this.h.setVisibility(0);
                        a(this.h, true, false);
                    }
                    if (PatchProxy.isSupport(new Object[0], this, f74375a, false, 86349, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f74375a, false, 86349, new Class[0], Void.TYPE);
                    } else if (!this.f74378d) {
                        this.f74378d = true;
                        this.f74380f.setVisibility(0);
                        a(this.f74380f, true, false);
                    }
                    if (this.i) {
                        this.i = false;
                        i5 = 3;
                    }
                }
                this.i = false;
                i5 = -1;
            }
        }
        this.k = i5;
        if (i5 == 1) {
            if (!this.f74376b) {
                h();
                for (a next : this.l) {
                    if (next != null && next.a(obj2)) {
                        break;
                    }
                }
                this.f74376b = true;
            }
            this.f74376b = true;
        } else if (i5 == 2) {
            e();
            this.f74376b = false;
            for (a next2 : this.l) {
                if (next2 != null && next2.b(obj2)) {
                    break;
                }
            }
        } else if (i5 == i4) {
            h();
            for (a next3 : this.l) {
                if (next3 != null && next3.a()) {
                    break;
                }
            }
        } else {
            this.f74376b = false;
            for (a next4 : this.l) {
                if (next4 != null && next4.c(obj2)) {
                    break;
                }
            }
        }
    }
}
