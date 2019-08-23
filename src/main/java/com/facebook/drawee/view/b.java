package com.facebook.drawee.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.graphics.PointF;
import android.graphics.Rect;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import javax.annotation.Nullable;

@TargetApi(19)
public final class b extends Transition {

    /* renamed from: a  reason: collision with root package name */
    public final ScalingUtils.ScaleType f23747a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final PointF f23748b;

    /* renamed from: c  reason: collision with root package name */
    private final ScalingUtils.ScaleType f23749c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private final PointF f23750d;

    public final void captureEndValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    public final void captureStartValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    private static void a(TransitionValues transitionValues) {
        if (transitionValues.view instanceof c) {
            transitionValues.values.put("draweeTransition:bounds", new Rect(0, 0, transitionValues.view.getWidth(), transitionValues.view.getHeight()));
        }
    }

    public static TransitionSet a(ScalingUtils.ScaleType scaleType, ScalingUtils.ScaleType scaleType2) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addTransition(new b(scaleType, scaleType2, null, null));
        return transitionSet;
    }

    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues.values.get("draweeTransition:bounds");
        Rect rect2 = (Rect) transitionValues2.values.get("draweeTransition:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        if (this.f23749c == this.f23747a && this.f23750d == this.f23748b) {
            return null;
        }
        final c cVar = (c) transitionValues.view;
        final ScalingUtils.b bVar = new ScalingUtils.b(this.f23749c, this.f23747a, rect, rect2, this.f23750d, this.f23748b);
        ((GenericDraweeHierarchy) cVar.getHierarchy()).setActualImageScaleType(bVar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                bVar.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                ((GenericDraweeHierarchy) cVar.getHierarchy()).setActualImageScaleType(b.this.f23747a);
                if (b.this.f23748b != null) {
                    ((GenericDraweeHierarchy) cVar.getHierarchy()).setActualImageFocusPoint(b.this.f23748b);
                }
            }
        });
        return ofFloat;
    }

    private b(ScalingUtils.ScaleType scaleType, ScalingUtils.ScaleType scaleType2, @Nullable PointF pointF, @Nullable PointF pointF2) {
        this.f23749c = scaleType;
        this.f23747a = scaleType2;
        this.f23750d = pointF;
        this.f23748b = pointF2;
    }
}
