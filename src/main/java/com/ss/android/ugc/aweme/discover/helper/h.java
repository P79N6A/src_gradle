package com.ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J*\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/helper/SearchSlide;", "Landroid/transition/Visibility;", "()V", "onAppear", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "startValues", "Landroid/transition/TransitionValues;", "endValues", "onDisappear", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@TargetApi(19)
public final class h extends Visibility {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42341a;

    @Nullable
    public final Animator onDisappear(@NotNull ViewGroup viewGroup, @NotNull View view, @NotNull TransitionValues transitionValues, @NotNull TransitionValues transitionValues2) {
        ViewGroup viewGroup2 = viewGroup;
        View view2 = view;
        TransitionValues transitionValues3 = transitionValues;
        TransitionValues transitionValues4 = transitionValues2;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, view2, transitionValues3, transitionValues4}, this, f42341a, false, 36365, new Class[]{ViewGroup.class, View.class, TransitionValues.class, TransitionValues.class}, Animator.class)) {
            Object[] objArr = {viewGroup2, view2, transitionValues3, transitionValues4};
            return (Animator) PatchProxy.accessDispatch(objArr, this, f42341a, false, 36365, new Class[]{ViewGroup.class, View.class, TransitionValues.class, TransitionValues.class}, Animator.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "sceneRoot");
        Intrinsics.checkParameterIsNotNull(view2, "view");
        Intrinsics.checkParameterIsNotNull(transitionValues3, "startValues");
        Intrinsics.checkParameterIsNotNull(transitionValues4, "endValues");
        return null;
    }

    @NotNull
    public final Animator onAppear(@NotNull ViewGroup viewGroup, @NotNull View view, @NotNull TransitionValues transitionValues, @NotNull TransitionValues transitionValues2) {
        ViewGroup viewGroup2 = viewGroup;
        View view2 = view;
        TransitionValues transitionValues3 = transitionValues;
        TransitionValues transitionValues4 = transitionValues2;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, view2, transitionValues3, transitionValues4}, this, f42341a, false, 36364, new Class[]{ViewGroup.class, View.class, TransitionValues.class, TransitionValues.class}, Animator.class)) {
            Object[] objArr = {viewGroup2, view2, transitionValues3, transitionValues4};
            return (Animator) PatchProxy.accessDispatch(objArr, this, f42341a, false, 36364, new Class[]{ViewGroup.class, View.class, TransitionValues.class, TransitionValues.class}, Animator.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "sceneRoot");
        Intrinsics.checkParameterIsNotNull(view2, "view");
        Intrinsics.checkParameterIsNotNull(transitionValues3, "startValues");
        Intrinsics.checkParameterIsNotNull(transitionValues4, "endValues");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationY", new float[]{(float) u.a(20.0d), 0.0f});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "translationY");
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }
}
