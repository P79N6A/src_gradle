package com.ss.android.ugc.aweme.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.utils.v;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0010\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0003H\u0002J\u0006\u0010$\u001a\u00020%J\b\u0010&\u001a\u00020%H\u0016J\u0010\u0010'\u001a\u00020%2\u0006\u0010 \u001a\u00020!H\u0002J\n\u0010(\u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010)\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!H\u0002J\u0012\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010!H\u0002J\u0010\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020!H\u0002J\u0010\u0010/\u001a\u00020%2\u0006\u0010.\u001a\u00020!H\u0002J\u000e\u00100\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\b\u00101\u001a\u00020%H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/ugc/aweme/main/FollowTabBubbleGuideView;", "Landroid/widget/PopupWindow;", "mContext", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "bubbleFadeInAnim", "Landroid/animation/ValueAnimator;", "getBubbleFadeInAnim", "()Landroid/animation/ValueAnimator;", "bubbleFadeOutAnim", "getBubbleFadeOutAnim", "bubbleTransDownL", "getBubbleTransDownL", "bubbleTransDownS", "getBubbleTransDownS", "bubbleTransUpL", "getBubbleTransUpL", "bubbleTransUpS", "getBubbleTransUpS", "mAvatarView", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", "mDescView", "Landroid/widget/TextView;", "mRootView", "Landroid/widget/RelativeLayout;", "set", "Landroid/animation/AnimatorSet;", "x", "", "y", "checkCanShowGuide", "", "tabView", "Landroid/view/View;", "createContentView", "context", "destroy", "", "dismiss", "doAnimator", "getContentView", "getFollowTextAnim", "getScaleUpdateListener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "targetView", "initView", "contentView", "initWindows", "show", "updateGuideShownTimesAndMob", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54669a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f54670b;

    /* renamed from: c  reason: collision with root package name */
    public AvatarImageView f54671c;

    /* renamed from: d  reason: collision with root package name */
    AnimatorSet f54672d;

    /* renamed from: e  reason: collision with root package name */
    public int f54673e;

    /* renamed from: f  reason: collision with root package name */
    public int f54674f;
    public final Activity g;
    private RelativeLayout h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/main/FollowTabBubbleGuideView$bubbleFadeInAnim$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54675a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f54676b;

        a(c cVar) {
            this.f54676b = cVar;
        }

        public final void onAnimationStart(@NotNull Animator animator) {
            Animator animator2 = animator;
            if (PatchProxy.isSupport(new Object[]{animator2}, this, f54675a, false, 57052, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator2}, this, f54675a, false, 57052, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator2, "animation");
            v.a(this.f54676b.getContentView(), 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/main/FollowTabBubbleGuideView$bubbleFadeOutAnim$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54678a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f54679b;

        b(c cVar) {
            this.f54679b = cVar;
        }

        public final void onAnimationEnd(@NotNull Animator animator) {
            Animator animator2 = animator;
            if (PatchProxy.isSupport(new Object[]{animator2}, this, f54678a, false, 57053, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator2}, this, f54678a, false, 57053, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator2, "animation");
            c cVar = this.f54679b;
            if (PatchProxy.isSupport(new Object[0], cVar, c.f54669a, false, 57049, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, c.f54669a, false, 57049, new Class[0], Void.TYPE);
                return;
            }
            if (!cVar.g.isFinishing() && cVar.isShowing()) {
                View contentView = cVar.getContentView();
                if (contentView != null) {
                    contentView.clearAnimation();
                }
                AnimatorSet animatorSet = cVar.f54672d;
                if (animatorSet == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("set");
                }
                animatorSet.cancel();
                cVar.dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.main.c$c  reason: collision with other inner class name */
    static final class C0629c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54681a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f54682b;

        C0629c(c cVar) {
            this.f54682b = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f54681a, false, 57054, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f54681a, false, 57054, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                View contentView = this.f54682b.getContentView();
                if (contentView != null) {
                    contentView.setTranslationY(floatValue);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54683a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f54684b;

        d(c cVar) {
            this.f54684b = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f54683a, false, 57055, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f54683a, false, 57055, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                View contentView = this.f54684b.getContentView();
                if (contentView != null) {
                    contentView.setTranslationY(floatValue);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54685a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f54686b;

        e(c cVar) {
            this.f54686b = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f54685a, false, 57056, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f54685a, false, 57056, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                View contentView = this.f54686b.getContentView();
                if (contentView != null) {
                    contentView.setTranslationY(floatValue);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54687a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f54688b;

        f(c cVar) {
            this.f54688b = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f54687a, false, 57057, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f54687a, false, 57057, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                View contentView = this.f54688b.getContentView();
                if (contentView != null) {
                    contentView.setTranslationY(floatValue);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54689a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f54690b;

        g(View view) {
            this.f54690b = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54689a, false, 57058, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54689a, false, 57058, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            View view = this.f54690b;
            if (view != null) {
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    view.setScaleX(((Float) animatedValue).floatValue());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
            }
            View view2 = this.f54690b;
            if (view2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 != null) {
                    view2.setScaleY(((Float) animatedValue2).floatValue());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    public static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54691a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f54692b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f54693c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View f54694d;

        public h(c cVar, View view, View view2) {
            this.f54692b = cVar;
            this.f54693c = view;
            this.f54694d = view2;
        }

        public final void run() {
            long j;
            ValueAnimator valueAnimator;
            long j2;
            ValueAnimator valueAnimator2;
            ValueAnimator valueAnimator3;
            ValueAnimator valueAnimator4;
            ValueAnimator valueAnimator5;
            ValueAnimator valueAnimator6;
            ValueAnimator valueAnimator7;
            if (PatchProxy.isSupport(new Object[0], this, f54691a, false, 57059, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54691a, false, 57059, new Class[0], Void.TYPE);
                return;
            }
            this.f54693c.setPivotX((float) (this.f54693c.getWidth() / 2));
            this.f54693c.setPivotY((float) this.f54693c.getHeight());
            c cVar = this.f54692b;
            View findViewById = this.f54694d.findViewById(C0906R.id.cz7);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "tabView.findViewById(R.id.tab_title)");
            if (PatchProxy.isSupport(new Object[]{findViewById}, cVar, c.f54669a, false, 57048, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{findViewById}, cVar, c.f54669a, false, 57048, new Class[]{View.class}, Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[0], cVar, c.f54669a, false, 57034, new Class[0], ValueAnimator.class)) {
                valueAnimator = (ValueAnimator) PatchProxy.accessDispatch(new Object[0], cVar, c.f54669a, false, 57034, new Class[0], ValueAnimator.class);
                j = 300;
            } else {
                valueAnimator = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "fadeIn");
                valueAnimator.setDuration(200);
                j = 300;
                valueAnimator.setStartDelay(300);
                valueAnimator.setInterpolator(new OvershootInterpolator(1.04f));
                valueAnimator.addUpdateListener(cVar.a(cVar.getContentView()));
                valueAnimator.addListener(new a(cVar));
            }
            long j3 = j;
            if (PatchProxy.isSupport(new Object[0], cVar, c.f54669a, false, 57035, new Class[0], ValueAnimator.class)) {
                j2 = 6150;
                valueAnimator2 = (ValueAnimator) PatchProxy.accessDispatch(new Object[0], cVar, c.f54669a, false, 57035, new Class[0], ValueAnimator.class);
            } else {
                j2 = 6150;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                Intrinsics.checkExpressionValueIsNotNull(ofFloat, "fadeOut");
                ofFloat.setDuration(640);
                ofFloat.setStartDelay(6150);
                ofFloat.setInterpolator(new OvershootInterpolator(1.04f));
                ofFloat.addUpdateListener(cVar.a(cVar.getContentView()));
                ofFloat.addListener(new b(cVar));
                valueAnimator2 = ofFloat;
            }
            if (PatchProxy.isSupport(new Object[]{findViewById}, cVar, c.f54669a, false, 57047, new Class[]{View.class}, ValueAnimator.class)) {
                valueAnimator3 = (ValueAnimator) PatchProxy.accessDispatch(new Object[]{findViewById}, cVar, c.f54669a, false, 57047, new Class[]{View.class}, ValueAnimator.class);
            } else {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 1.2f, 1.0f});
                Intrinsics.checkExpressionValueIsNotNull(ofFloat2, "textAnim");
                ofFloat2.setDuration(300);
                ofFloat2.setStartDelay(j2);
                ofFloat2.addUpdateListener(cVar.a(findViewById));
                valueAnimator3 = ofFloat2;
            }
            cVar.f54672d = new AnimatorSet();
            AnimatorSet animatorSet = cVar.f54672d;
            if (animatorSet == null) {
                Intrinsics.throwUninitializedPropertyAccessException("set");
            }
            AnimatorSet.Builder with = animatorSet.play(valueAnimator).with(valueAnimator2);
            if (PatchProxy.isSupport(new Object[0], cVar, c.f54669a, false, 57036, new Class[0], ValueAnimator.class)) {
                valueAnimator4 = (ValueAnimator) PatchProxy.accessDispatch(new Object[0], cVar, c.f54669a, false, 57036, new Class[0], ValueAnimator.class);
            } else {
                valueAnimator4 = ValueAnimator.ofFloat(new float[]{0.0f, -10.0f});
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator4, "transY");
                valueAnimator4.setDuration(200);
                valueAnimator4.setStartDelay(300);
                valueAnimator4.addUpdateListener(new e(cVar));
            }
            AnimatorSet.Builder with2 = with.with(valueAnimator4);
            if (PatchProxy.isSupport(new Object[0], cVar, c.f54669a, false, 57037, new Class[0], ValueAnimator.class)) {
                valueAnimator5 = (ValueAnimator) PatchProxy.accessDispatch(new Object[0], cVar, c.f54669a, false, 57037, new Class[0], ValueAnimator.class);
            } else {
                valueAnimator5 = ValueAnimator.ofFloat(new float[]{-10.0f, 0.0f});
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator5, "transY");
                valueAnimator5.setDuration(500);
                valueAnimator5.setStartDelay(500);
                valueAnimator5.addUpdateListener(new C0629c(cVar));
            }
            AnimatorSet.Builder with3 = with2.with(valueAnimator5);
            if (PatchProxy.isSupport(new Object[0], cVar, c.f54669a, false, 57038, new Class[0], ValueAnimator.class)) {
                valueAnimator6 = (ValueAnimator) PatchProxy.accessDispatch(new Object[0], cVar, c.f54669a, false, 57038, new Class[0], ValueAnimator.class);
            } else {
                valueAnimator6 = ValueAnimator.ofFloat(new float[]{0.0f, -10.0f});
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator6, "transY");
                valueAnimator6.setDuration(150);
                valueAnimator6.setStartDelay(6000);
                valueAnimator6.addUpdateListener(new f(cVar));
            }
            AnimatorSet.Builder with4 = with3.with(valueAnimator6);
            if (PatchProxy.isSupport(new Object[0], cVar, c.f54669a, false, 57039, new Class[0], ValueAnimator.class)) {
                valueAnimator7 = (ValueAnimator) PatchProxy.accessDispatch(new Object[0], cVar, c.f54669a, false, 57039, new Class[0], ValueAnimator.class);
            } else {
                valueAnimator7 = ValueAnimator.ofFloat(new float[]{-10.0f, 0.0f});
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator7, "transY");
                valueAnimator7.setDuration(300);
                valueAnimator7.setStartDelay(j2);
                valueAnimator7.addUpdateListener(new d(cVar));
            }
            with4.with(valueAnimator7).with(valueAnimator3);
            AnimatorSet animatorSet2 = cVar.f54672d;
            if (animatorSet2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("set");
            }
            animatorSet2.start();
            com.ss.android.ugc.aweme.main.guide.b.f54809f.a().f54812d = System.currentTimeMillis();
        }
    }

    @Nullable
    public final View getContentView() {
        return this.h;
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f54669a, false, 57050, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54669a, false, 57050, new Class[0], Void.TYPE);
            return;
        }
        try {
            d.a(this);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final ValueAnimator.AnimatorUpdateListener a(View view) {
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{view2}, this, f54669a, false, 57046, new Class[]{View.class}, ValueAnimator.AnimatorUpdateListener.class)) {
            return new g(view2);
        }
        return (ValueAnimator.AnimatorUpdateListener) PatchProxy.accessDispatch(new Object[]{view2}, this, f54669a, false, 57046, new Class[]{View.class}, ValueAnimator.AnimatorUpdateListener.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(@NotNull Activity activity) {
        super(activity);
        View inflate;
        Intrinsics.checkParameterIsNotNull(activity, "mContext");
        this.g = activity;
        Activity activity2 = this.g;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f54669a, false, 57040, new Class[]{Activity.class}, View.class)) {
            inflate = (View) PatchProxy.accessDispatch(new Object[]{activity2}, this, f54669a, false, 57040, new Class[]{Activity.class}, View.class);
        } else {
            inflate = LayoutInflater.from(activity2).inflate(C0906R.layout.abs, null, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…w_tab_guide, null, false)");
        }
        View view = inflate;
        if (PatchProxy.isSupport(new Object[]{view}, this, f54669a, false, 57042, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f54669a, false, 57042, new Class[]{View.class}, Void.TYPE);
        } else {
            setContentView(view);
            setBackgroundDrawable(new ColorDrawable(this.g.getResources().getColor(C0906R.color.ano)));
            setOutsideTouchable(false);
            update();
        }
        if (PatchProxy.isSupport(new Object[]{view}, this, f54669a, false, 57041, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f54669a, false, 57041, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.h = (RelativeLayout) view.findViewById(C0906R.id.ci4);
        this.f54670b = (TextView) view.findViewById(C0906R.id.dac);
        this.f54671c = (AvatarImageView) view.findViewById(C0906R.id.ayr);
    }
}
