package com.ss.android.ugc.aweme.setting.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001&B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\nJ\u001a\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u001a\u0010\u001f\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u00102\b\u0010!\u001a\u0004\u0018\u00010\u0010J\u0012\u0010\"\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010\u0015H\u0016J\u000e\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u0017R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eXD¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/ui/ExpandSettingItem;", "Lcom/bytedance/ies/dmt/ui/widget/setting/SettingItem;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "", "isExpand", "()Z", "mArrowDuration", "", "mDividerView", "Landroid/view/View;", "mExpandDuration", "mExpandHeight", "mExpandView", "mOnClickListener", "Landroid/view/View$OnClickListener;", "mOnExpandListener", "Lcom/ss/android/ugc/aweme/setting/ui/ExpandSettingItem$OnExpandListener;", "mValueAnimator", "Landroid/animation/ValueAnimator;", "expand", "", "fold", "anim", "getCustomStyle", "setExpandView", "view", "divider", "setOnClickListener", "l", "setOnExpandListener", "onExpandListener", "OnExpandListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ExpandSettingItem extends SettingItem {
    public static ChangeQuickRedirect q;
    public View r;
    public View s;
    public int t;
    public boolean u;
    public View.OnClickListener v;
    private final long w;
    private final long x;
    private ValueAnimator y;
    private a z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/ui/ExpandSettingItem$OnExpandListener;", "", "onExpand", "", "isExpand", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64163a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpandSettingItem f64164b;

        b(ExpandSettingItem expandSettingItem) {
            this.f64164b = expandSettingItem;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f64163a, false, 72534, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f64163a, false, 72534, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                View view = this.f64164b.r;
                if (view == null) {
                    Intrinsics.throwNpe();
                }
                view.setAlpha(floatValue);
                View view2 = this.f64164b.s;
                if (view2 == null) {
                    Intrinsics.throwNpe();
                }
                view2.setAlpha(1.0f - floatValue);
                View view3 = this.f64164b.r;
                if (view3 == null) {
                    Intrinsics.throwNpe();
                }
                view3.getLayoutParams().height = (int) (floatValue * ((float) this.f64164b.t));
                View view4 = this.f64164b.r;
                if (view4 == null) {
                    Intrinsics.throwNpe();
                }
                view4.requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64165a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpandSettingItem f64166b;

        c(ExpandSettingItem expandSettingItem) {
            this.f64166b = expandSettingItem;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f64165a, false, 72535, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f64165a, false, 72535, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                View view = this.f64166b.r;
                if (view == null) {
                    Intrinsics.throwNpe();
                }
                view.setAlpha(floatValue);
                View view2 = this.f64166b.s;
                if (view2 == null) {
                    Intrinsics.throwNpe();
                }
                view2.setAlpha(1.0f - floatValue);
                View view3 = this.f64166b.r;
                if (view3 == null) {
                    Intrinsics.throwNpe();
                }
                view3.getLayoutParams().height = (int) (floatValue * ((float) this.f64166b.t));
                View view4 = this.f64166b.r;
                if (view4 == null) {
                    Intrinsics.throwNpe();
                }
                view4.requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/setting/ui/ExpandSettingItem$fold$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64167a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpandSettingItem f64168b;

        d(ExpandSettingItem expandSettingItem) {
            this.f64168b = expandSettingItem;
        }

        public final void onAnimationEnd(@NotNull Animator animator) {
            Animator animator2 = animator;
            if (PatchProxy.isSupport(new Object[]{animator2}, this, f64167a, false, 72536, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator2}, this, f64167a, false, 72536, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator2, "animation");
            View view = this.f64168b.r;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64169a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpandSettingItem f64170b;

        e(ExpandSettingItem expandSettingItem) {
            this.f64170b = expandSettingItem;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f64169a, false, 72537, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f64169a, false, 72537, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            View.OnClickListener onClickListener = this.f64170b.v;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            if (this.f64170b.u) {
                this.f64170b.a(true);
            } else {
                this.f64170b.a();
            }
        }
    }

    @JvmOverloads
    public ExpandSettingItem(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public ExpandSettingItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a() {
        Context context;
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, q, false, 72530, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 72530, new Class[0], Void.TYPE);
        } else if (!this.u) {
            ValueAnimator valueAnimator = this.y;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                this.y = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ValueAnimator valueAnimator2 = this.y;
                if (valueAnimator2 == null) {
                    Intrinsics.throwNpe();
                }
                valueAnimator2.setDuration(this.w);
                View view = this.r;
                if (view == null) {
                    Intrinsics.throwNpe();
                }
                view.setVisibility(0);
                View view2 = this.r;
                if (view2 != null) {
                    View view3 = this.f20517f;
                    if (view3 != null) {
                        context = view3.getContext();
                    } else {
                        context = null;
                    }
                    view2.measure(View.MeasureSpec.makeMeasureSpec(UIUtils.getScreenWidth(context), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE));
                }
                View view4 = this.r;
                if (view4 != null) {
                    i = view4.getMeasuredHeight();
                }
                this.t = i;
                this.f20509b.animate().rotation(180.0f).setDuration(this.x).start();
                ValueAnimator valueAnimator3 = this.y;
                if (valueAnimator3 == null) {
                    Intrinsics.throwNpe();
                }
                valueAnimator3.addUpdateListener(new b(this));
                ValueAnimator valueAnimator4 = this.y;
                if (valueAnimator4 == null) {
                    Intrinsics.throwNpe();
                }
                valueAnimator4.start();
                this.u = true;
                a aVar = this.z;
                if (aVar != null) {
                    aVar.a(true);
                }
            }
        }
    }

    public final void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.v = onClickListener;
    }

    public final void setOnExpandListener(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, q, false, 72527, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, q, false, 72527, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "onExpandListener");
        this.z = aVar2;
    }

    public final void a(boolean z2) {
        int i;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, q, false, 72531, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, q, false, 72531, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.u) {
            ValueAnimator valueAnimator = this.y;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return;
            }
            if (!z2) {
                View view = this.s;
                if (view != null) {
                    view.setAlpha(1.0f);
                }
                ImageView imageView = this.f20509b;
                Intrinsics.checkExpressionValueIsNotNull(imageView, "ivRightIcon");
                imageView.setRotation(0.0f);
                View view2 = this.r;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                this.u = false;
                return;
            }
            View view3 = this.r;
            if (view3 != null) {
                i = view3.getMeasuredHeight();
            } else {
                i = 0;
            }
            this.t = i;
            this.y = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ValueAnimator valueAnimator2 = this.y;
            if (valueAnimator2 == null) {
                Intrinsics.throwNpe();
            }
            valueAnimator2.setDuration(this.w);
            this.f20509b.animate().rotation(0.0f).setDuration(this.x).start();
            ValueAnimator valueAnimator3 = this.y;
            if (valueAnimator3 == null) {
                Intrinsics.throwNpe();
            }
            valueAnimator3.addUpdateListener(new c(this));
            ValueAnimator valueAnimator4 = this.y;
            if (valueAnimator4 == null) {
                Intrinsics.throwNpe();
            }
            valueAnimator4.addListener(new d(this));
            ValueAnimator valueAnimator5 = this.y;
            if (valueAnimator5 == null) {
                Intrinsics.throwNpe();
            }
            valueAnimator5.start();
            this.u = false;
            a aVar = this.z;
            if (aVar != null) {
                aVar.a(false);
            }
        }
    }

    public final void a(@Nullable View view, @Nullable View view2) {
        float f2;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{view, view2}, this, q, false, 72528, new Class[]{View.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, view2}, this, q, false, 72528, new Class[]{View.class, View.class}, Void.TYPE);
            return;
        }
        this.r = view;
        this.s = view2;
        View view3 = this.r;
        if (view3 != null && view3.getVisibility() == 0) {
            z2 = true;
        }
        this.u = z2;
        ImageView imageView = this.f20509b;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ivRightIcon");
        if (this.u) {
            f2 = 180.0f;
        } else {
            f2 = 0.0f;
        }
        imageView.setRotation(f2);
    }

    public final void a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        if (PatchProxy.isSupport(new Object[]{context, attributeSet}, this, q, false, 72529, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet}, this, q, false, 72529, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context, "context");
        super.a(context, attributeSet);
        FrameLayout frameLayout = this.f20508a;
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "rightLayout");
        frameLayout.getLayoutParams().width = -2;
        this.f20508a.requestLayout();
        ImageView imageView = this.f20509b;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ivRightIcon");
        imageView.getLayoutParams().height = (int) UIUtils.dip2Px(context, 10.0f);
        ImageView imageView2 = this.f20509b;
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "ivRightIcon");
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        ImageView imageView3 = this.f20509b;
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "ivRightIcon");
        layoutParams.width = imageView3.getLayoutParams().height;
        this.f20509b.setImageResource(2130839474);
        super.setOnClickListener(new e(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ExpandSettingItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.w = 300;
        this.x = 100;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExpandSettingItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
