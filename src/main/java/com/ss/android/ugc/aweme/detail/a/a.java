package com.ss.android.ugc.aweme.detail.a;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/animator/DetailFragmentAnimationUtils;", "", "()V", "F_CONSTANTS_N_05", "", "createRecordBtnHideAnimation", "Landroid/view/animation/AnimationSet;", "createRecordBtnShowAnimation", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41091a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f41092b = new a();

    private a() {
    }

    @JvmStatic
    @NotNull
    public static final AnimationSet a() {
        if (PatchProxy.isSupport(new Object[0], null, f41091a, true, 34658, new Class[0], AnimationSet.class)) {
            return (AnimationSet) PatchProxy.accessDispatch(new Object[0], null, f41091a, true, 34658, new Class[0], AnimationSet.class);
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(-0.5f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(300);
        animationSet.setFillAfter(false);
        return animationSet;
    }

    @JvmStatic
    @NotNull
    public static final AnimationSet b() {
        if (PatchProxy.isSupport(new Object[0], null, f41091a, true, 34659, new Class[0], AnimationSet.class)) {
            return (AnimationSet) PatchProxy.accessDispatch(new Object[0], null, f41091a, true, 34659, new Class[0], AnimationSet.class);
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(300);
        animationSet.setFillAfter(false);
        return animationSet;
    }
}
