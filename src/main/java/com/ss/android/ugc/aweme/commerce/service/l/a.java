package com.ss.android.ugc.aweme.commerce.service.l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Animation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ*\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J.\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014J.\u0010\u0015\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/utils/AnimationUtils;", "", "()V", "BREATH_ANIM_DURATION", "", "popDown", "", "view", "Landroid/view/View;", "popUp", "startBreath", "zoomView", "pivotXValue", "", "pivotYValue", "repeatCount", "", "startBreathIn", "targetView", "callback", "Lkotlin/Function0;", "startBreathOut", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37977a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f37978b = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.service.l.a$a  reason: collision with other inner class name */
    public static final class C0498a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37979a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f37980b;

        public C0498a(View view) {
            this.f37980b = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f37979a, false, 29955, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f37979a, false, 29955, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            View view = this.f37980b;
            if (view != null) {
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    view.setTranslationY(((Float) animatedValue).floatValue());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37981a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f37982b;

        public b(View view) {
            this.f37982b = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f37981a, false, 29956, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f37981a, false, 29956, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            View view = this.f37982b;
            if (view != null) {
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    view.setTranslationY(((Float) animatedValue).floatValue());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/commerce/service/utils/AnimationUtils$startBreathIn$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class c implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37983a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function0 f37984b;

        public final void onAnimationRepeat(@Nullable Animation animation) {
        }

        public final void onAnimationStart(@Nullable Animation animation) {
        }

        public c(Function0 function0) {
            this.f37984b = function0;
        }

        public final void onAnimationEnd(@Nullable Animation animation) {
            if (PatchProxy.isSupport(new Object[]{animation}, this, f37983a, false, 29957, new Class[]{Animation.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animation}, this, f37983a, false, 29957, new Class[]{Animation.class}, Void.TYPE);
                return;
            }
            this.f37984b.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/commerce/service/utils/AnimationUtils$startBreathOut$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class d implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37985a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function0 f37986b;

        public final void onAnimationRepeat(@Nullable Animation animation) {
        }

        public final void onAnimationStart(@Nullable Animation animation) {
        }

        public d(Function0 function0) {
            this.f37986b = function0;
        }

        public final void onAnimationEnd(@Nullable Animation animation) {
            if (PatchProxy.isSupport(new Object[]{animation}, this, f37985a, false, 29958, new Class[]{Animation.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animation}, this, f37985a, false, 29958, new Class[]{Animation.class}, Void.TYPE);
                return;
            }
            this.f37986b.invoke();
        }
    }

    private a() {
    }
}
