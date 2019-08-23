package com.ss.android.ugc.aweme.utils;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75658a;

    public static void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f75658a, true, 87860, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f75658a, true, 87860, new Class[]{View.class}, Void.TYPE);
            return;
        }
        a(view2, 0.75f);
    }

    public static Drawable a(@NonNull Drawable drawable, int i) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2, Integer.valueOf(i)}, null, f75658a, true, 87859, new Class[]{Drawable.class, Integer.TYPE}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{drawable2, Integer.valueOf(i)}, null, f75658a, true, 87859, new Class[]{Drawable.class, Integer.TYPE}, Drawable.class);
        }
        if (drawable2 instanceof GradientDrawable) {
            ((GradientDrawable) drawable2).setColor(i);
        } else {
            int i2 = i;
        }
        DrawableCompat.setTint(drawable, i);
        return drawable2;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public static void a(View view, float f2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(0.75f)}, null, f75658a, true, 87861, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(0.75f)}, null, f75658a, true, 87861, new Class[]{View.class, Float.TYPE}, Void.TYPE);
        } else if (view2 != null) {
            view2.setOnTouchListener(new d(view2, 0.75f));
        }
    }

    public static ValueAnimator a(View view, int i, int i2, int i3) {
        final View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f75658a, true, 87856, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, ValueAnimator.class)) {
            return (ValueAnimator) PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f75658a, true, 87856, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, ValueAnimator.class);
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75659a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f75659a, false, 87863, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f75659a, false, 87863, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                marginLayoutParams.bottomMargin = intValue;
                view2.setLayoutParams(marginLayoutParams);
            }
        });
        ofInt.setDuration((long) i3);
        ofInt.setTarget(view2);
        return ofInt;
    }

    public static void a(View view, int i, int i2, long j) {
        final View view2 = view;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), new Long(j2)}, null, f75658a, true, 87857, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), new Long(j2)}, null, f75658a, true, 87857, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Long.TYPE}, Void.TYPE);
        } else if (i != i2) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f75661a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f75661a, false, 87864, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f75661a, false, 87864, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (view2 != null) {
                        view2.setBackgroundColor(intValue);
                    }
                }
            });
            ofObject.setDuration(j2);
            ofObject.start();
        }
    }

    public static void a(View view, Drawable drawable, int i, int i2, long j) {
        final View view2 = view;
        int i3 = i2;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{view2, drawable, Integer.valueOf(i), Integer.valueOf(i2), new Long(j2)}, null, f75658a, true, 87858, new Class[]{View.class, Drawable.class, Integer.TYPE, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {view2, drawable, Integer.valueOf(i), Integer.valueOf(i2), new Long(j2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f75658a, true, 87858, new Class[]{View.class, Drawable.class, Integer.TYPE, Integer.TYPE, Long.TYPE}, Void.TYPE);
        } else if (i != i3) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            final Drawable mutate = DrawableCompat.wrap(drawable).mutate();
            if (mutate instanceof GradientDrawable) {
                ((GradientDrawable) mutate).setColor(i3);
            }
            ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f75663a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f75663a, false, 87865, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f75663a, false, 87865, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (view2 != null) {
                        view2.setBackground(c.a(mutate, intValue));
                    }
                }
            });
            ofObject.setDuration(j2);
            ofObject.start();
        }
    }
}
