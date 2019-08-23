package com.ss.android.ugc.aweme.shortvideo.edit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0002J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0006H\u0016R\u000e\u0010\n\u001a\u00020\u000bXD¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/EditToolbarModuleB;", "Lcom/ss/android/ugc/aweme/shortvideo/edit/EditToolbarModule;", "toolBarContainer", "Landroid/view/ViewGroup;", "editToolbarList", "", "Landroid/view/View;", "context", "Landroid/app/Activity;", "(Landroid/view/ViewGroup;Ljava/util/List;Landroid/app/Activity;)V", "animDuration", "", "isFold", "", "moreHeight", "", "addMarginForItem", "", "itemView", "createAlphaAnim", "Landroid/animation/ObjectAnimator;", "view", "start", "", "end", "createTranslateAnim", "Landroid/animation/ValueAnimator;", "getToolbarLayout", "hideMore", "initFixedViews", "initMoreContainer", "rotateArrow", "showMore", "moreView", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class j extends h {
    public static ChangeQuickRedirect j;
    public boolean k = true;
    private final long l = 250;
    private int m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67437a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f67438b;

        a(View view) {
            this.f67438b = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f67437a, false, 76262, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f67437a, false, 76262, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ViewGroup.LayoutParams layoutParams = this.f67438b.getLayoutParams();
                layoutParams.height = intValue;
                this.f67438b.setLayoutParams(layoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/EditToolbarModuleB$hideMore$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67439a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinearLayout f67440b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f67441c;

        public final void onAnimationCancel(@Nullable Animator animator) {
            this.f67441c.k = false;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f67439a, false, 76263, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f67439a, false, 76263, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f67440b.setVisibility(8);
            this.f67441c.k = true;
        }

        b(LinearLayout linearLayout, j jVar) {
            this.f67440b = linearLayout;
            this.f67441c = jVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67442a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f67443b;

        c(j jVar) {
            this.f67443b = jVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f67442a, false, 76264, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f67442a, false, 76264, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f67443b.k) {
                j jVar = this.f67443b;
                Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                jVar.b(view);
                return;
            }
            this.f67443b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/EditToolbarModuleB$showMore$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationStart", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67444a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinearLayout f67445b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f67446c;

        public final void onAnimationCancel(@Nullable Animator animator) {
            this.f67446c.k = true;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            this.f67446c.k = false;
        }

        public final void onAnimationStart(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f67444a, false, 76265, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f67444a, false, 76265, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.f67445b.getLayoutParams();
            layoutParams.height = 0;
            this.f67445b.setLayoutParams(layoutParams);
            this.f67445b.setVisibility(0);
        }

        d(LinearLayout linearLayout, j jVar) {
            this.f67445b = linearLayout;
            this.f67446c = jVar;
        }
    }

    public final int e() {
        return C0906R.layout.lv;
    }

    private final void f() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 76260, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 76260, new Class[0], Void.TYPE);
        } else if (this.k) {
            View view = this.f67179e;
            if (view != null) {
                view.setRotation(180.0f);
            }
        } else {
            View view2 = this.f67179e;
            if (view2 != null) {
                view2.setRotation(0.0f);
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 76255, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 76255, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        View view = this.f67179e;
        if (view != null) {
            view.setOnClickListener(new c(this));
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 76258, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 76258, new Class[0], Void.TYPE);
        } else if (!this.k) {
            LinearLayout linearLayout = this.f67178d;
            if (linearLayout != null) {
                f();
                View view = linearLayout;
                ValueAnimator a2 = a(view, this.m, 0);
                a2.addListener(new b(linearLayout, this));
                ObjectAnimator a3 = a(view, 1.0f, 0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{a2, a3});
                animatorSet.start();
            }
        }
    }

    public final void d() {
        View view;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 76256, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 76256, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, h.f67175a, false, 76239, new Class[0], View.class)) {
            view = (View) PatchProxy.accessDispatch(new Object[0], this, h.f67175a, false, 76239, new Class[0], View.class);
        } else {
            view = this.f67177c;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbarRootView");
            }
        }
        this.f67178d = (LinearLayout) view.findViewById(C0906R.id.agh);
    }

    public final void b(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, j, false, 76257, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, j, false, 76257, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "moreView");
        super.b(view);
        if (this.k) {
            LinearLayout linearLayout = this.f67178d;
            if (linearLayout != null) {
                f();
                linearLayout.measure(0, 0);
                this.m = linearLayout.getMeasuredHeight();
                View view2 = linearLayout;
                ValueAnimator a2 = a(view2, 0, this.m);
                a2.addListener(new d(linearLayout, this));
                ObjectAnimator a3 = a(view2, 0.0f, 1.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{a2, a3});
                animatorSet.start();
            }
        }
    }

    public final void a(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, j, false, 76254, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, j, false, 76254, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "itemView");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ((LinearLayout.LayoutParams) layoutParams).topMargin = (int) UIUtils.dip2Px(this.h, 12.0f);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(@NotNull ViewGroup viewGroup, @NotNull List<? extends View> list, @NotNull Activity activity) {
        super(viewGroup, list, activity);
        Intrinsics.checkParameterIsNotNull(viewGroup, "toolBarContainer");
        Intrinsics.checkParameterIsNotNull(list, "editToolbarList");
        Intrinsics.checkParameterIsNotNull(activity, "context");
    }

    private final ObjectAnimator a(View view, float f2, float f3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, j, false, 76261, new Class[]{View.class, Float.TYPE, Float.TYPE}, ObjectAnimator.class)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, j, false, 76261, new Class[]{View.class, Float.TYPE, Float.TYPE}, ObjectAnimator.class);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{f2, f3});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "alphaAnimator");
        ofFloat.setDuration(this.l);
        return ofFloat;
    }

    private final ValueAnimator a(View view, int i, int i2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, j, false, 76259, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, ValueAnimator.class)) {
            return (ValueAnimator) PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, j, false, 76259, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, ValueAnimator.class);
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "heightAnimator");
        ofInt.setDuration(this.l);
        ofInt.addUpdateListener(new a(view2));
        return ofInt;
    }
}
