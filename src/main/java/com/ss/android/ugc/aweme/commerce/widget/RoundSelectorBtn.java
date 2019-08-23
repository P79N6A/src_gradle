package com.ss.android.ugc.aweme.commerce.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/widget/RoundSelectorBtn;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "downAnimator", "Landroid/animation/ValueAnimator;", "isDown", "", "stateChangeListener", "Lcom/ss/android/ugc/aweme/commerce/widget/RoundSelectorBtn$StateChangeListener;", "upAnimator", "init", "", "initAnimator", "setOnStateChangeListener", "listener", "setState", "StateChangeListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RoundSelectorBtn extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38384a;

    /* renamed from: b  reason: collision with root package name */
    public a f38385b;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f38386c;

    /* renamed from: d  reason: collision with root package name */
    public ValueAnimator f38387d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f38388e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/widget/RoundSelectorBtn$StateChangeListener;", "", "onStateChange", "", "isDown", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38389a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RoundSelectorBtn f38390b;

        b(RoundSelectorBtn roundSelectorBtn) {
            this.f38390b = roundSelectorBtn;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f38389a, false, 30232, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f38389a, false, 30232, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f38390b.setState(!this.f38390b.f38388e);
            a aVar = this.f38390b.f38385b;
            if (aVar != null) {
                aVar.a(this.f38390b.f38388e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38391a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RoundSelectorBtn f38392b;

        c(RoundSelectorBtn roundSelectorBtn) {
            this.f38392b = roundSelectorBtn;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f38391a, false, 30233, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f38391a, false, 30233, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f38392b.setScrollY(Math.round(((Float) animatedValue).floatValue()));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38393a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RoundSelectorBtn f38394b;

        d(RoundSelectorBtn roundSelectorBtn) {
            this.f38394b = roundSelectorBtn;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f38393a, false, 30234, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f38393a, false, 30234, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f38394b.setScrollY(Math.round(((Float) animatedValue).floatValue()));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    private final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38384a, false, 30227, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38384a, false, 30227, new Class[0], Void.TYPE);
            return;
        }
        setOnClickListener(new b(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundSelectorBtn(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        a();
    }

    public final void setOnStateChangeListener(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f38384a, false, 30226, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f38384a, false, 30226, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "listener");
        this.f38385b = aVar2;
    }

    public final void setState(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38384a, false, 30228, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38384a, false, 30228, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f38388e != z) {
            RoundSelectorBtn roundSelectorBtn = this;
            if (roundSelectorBtn.f38386c == null || roundSelectorBtn.f38387d == null) {
                if (PatchProxy.isSupport(new Object[0], this, f38384a, false, 30229, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f38384a, false, 30229, new Class[0], Void.TYPE);
                } else if (getChildCount() == 2) {
                    View childAt = getChildAt(0);
                    Intrinsics.checkExpressionValueIsNotNull(childAt, "getChildAt(0)");
                    float height = ((float) childAt.getHeight()) + 0.0f;
                    View childAt2 = getChildAt(1);
                    Intrinsics.checkExpressionValueIsNotNull(childAt2, "getChildAt(1)");
                    ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                    if (layoutParams != null) {
                        float f2 = height + ((float) ((LinearLayout.LayoutParams) layoutParams).topMargin);
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, f2});
                        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "ValueAnimator.ofFloat(0f, scrollY)");
                        this.f38386c = ofFloat;
                        ValueAnimator valueAnimator = this.f38386c;
                        if (valueAnimator == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("downAnimator");
                        }
                        valueAnimator.setTarget(this);
                        ValueAnimator valueAnimator2 = this.f38386c;
                        if (valueAnimator2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("downAnimator");
                        }
                        valueAnimator2.setDuration(500);
                        ValueAnimator valueAnimator3 = this.f38386c;
                        if (valueAnimator3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("downAnimator");
                        }
                        valueAnimator3.setInterpolator(new AccelerateDecelerateInterpolator());
                        ValueAnimator valueAnimator4 = this.f38386c;
                        if (valueAnimator4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("downAnimator");
                        }
                        valueAnimator4.addUpdateListener(new c(this));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{f2, 0.0f});
                        Intrinsics.checkExpressionValueIsNotNull(ofFloat2, "ValueAnimator.ofFloat(scrollY, 0f)");
                        this.f38387d = ofFloat2;
                        ValueAnimator valueAnimator5 = this.f38387d;
                        if (valueAnimator5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("upAnimator");
                        }
                        valueAnimator5.setTarget(this);
                        ValueAnimator valueAnimator6 = this.f38387d;
                        if (valueAnimator6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("upAnimator");
                        }
                        valueAnimator6.setDuration(500);
                        ValueAnimator valueAnimator7 = this.f38387d;
                        if (valueAnimator7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("upAnimator");
                        }
                        valueAnimator7.setInterpolator(new AccelerateDecelerateInterpolator());
                        ValueAnimator valueAnimator8 = this.f38387d;
                        if (valueAnimator8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("upAnimator");
                        }
                        valueAnimator8.addUpdateListener(new d(this));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                }
            }
            this.f38388e = z;
            if (!z || roundSelectorBtn.f38386c == null) {
                if (roundSelectorBtn.f38387d != null) {
                    ValueAnimator valueAnimator9 = this.f38387d;
                    if (valueAnimator9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("upAnimator");
                    }
                    valueAnimator9.start();
                }
                return;
            }
            ValueAnimator valueAnimator10 = this.f38386c;
            if (valueAnimator10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("downAnimator");
            }
            valueAnimator10.start();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundSelectorBtn(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundSelectorBtn(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        a();
    }
}
