package com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002:\u0001#B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016J\u0012\u0010\u001e\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0013J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0013H\u0002R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/view/SkuPanelCouponFoldButton;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "arrowImageView", "Landroid/widget/ImageView;", "buttonBgDrawable", "Landroid/graphics/drawable/Drawable;", "buttonTextView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "buttonUnfold", "", "inAnimation", "onClickListener", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/view/SkuPanelCouponFoldButton$OnButtonClickListener;", "init", "", "onClick", "p0", "Landroid/view/View;", "setOnButtonClickListener", "l", "setOnClickListener", "setViewState", "isShow", "toggleState", "btnUnfold", "OnButtonClickListener", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class SkuPanelCouponFoldButton extends LinearLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37879a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f37880b;

    /* renamed from: c  reason: collision with root package name */
    public DmtTextView f37881c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f37882d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f37883e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f37884f;
    private a g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/view/SkuPanelCouponFoldButton$OnButtonClickListener;", "", "onClickCouponButton", "", "view", "Landroid/view/View;", "buttonUnfold", "", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a(@NotNull View view, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/commerce/sdk/live/skupanel/view/SkuPanelCouponFoldButton$toggleState$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37885a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuPanelCouponFoldButton f37886b;

        b(SkuPanelCouponFoldButton skuPanelCouponFoldButton) {
            this.f37886b = skuPanelCouponFoldButton;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f37885a, false, 29473, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f37885a, false, 29473, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            SkuPanelCouponFoldButton.a(this.f37886b).setText(C0906R.string.a9y);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37887a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuPanelCouponFoldButton f37888b;

        c(SkuPanelCouponFoldButton skuPanelCouponFoldButton) {
            this.f37888b = skuPanelCouponFoldButton;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f37887a, false, 29474, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f37887a, false, 29474, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                SkuPanelCouponFoldButton.b(this.f37888b).setAlpha((int) (((Float) animatedValue).floatValue() * 255.0f));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/commerce/sdk/live/skupanel/view/SkuPanelCouponFoldButton$toggleState$3", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SkuPanelCouponFoldButton f37889a;

        d(SkuPanelCouponFoldButton skuPanelCouponFoldButton) {
            this.f37889a = skuPanelCouponFoldButton;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            this.f37889a.f37880b = false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/commerce/sdk/live/skupanel/view/SkuPanelCouponFoldButton$toggleState$4", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37890a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuPanelCouponFoldButton f37891b;

        e(SkuPanelCouponFoldButton skuPanelCouponFoldButton) {
            this.f37891b = skuPanelCouponFoldButton;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f37890a, false, 29475, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f37890a, false, 29475, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            SkuPanelCouponFoldButton.a(this.f37891b).setText(C0906R.string.a9z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37892a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuPanelCouponFoldButton f37893b;

        f(SkuPanelCouponFoldButton skuPanelCouponFoldButton) {
            this.f37893b = skuPanelCouponFoldButton;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f37892a, false, 29476, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f37892a, false, 29476, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                SkuPanelCouponFoldButton.b(this.f37893b).setAlpha((int) (((Float) animatedValue).floatValue() * 255.0f));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/commerce/sdk/live/skupanel/view/SkuPanelCouponFoldButton$toggleState$6", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public static final class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SkuPanelCouponFoldButton f37894a;

        g(SkuPanelCouponFoldButton skuPanelCouponFoldButton) {
            this.f37894a = skuPanelCouponFoldButton;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            this.f37894a.f37880b = false;
        }
    }

    public final void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
    }

    public final void setOnButtonClickListener(@Nullable a aVar) {
        this.g = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SkuPanelCouponFoldButton(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        a(context);
    }

    public static final /* synthetic */ DmtTextView a(SkuPanelCouponFoldButton skuPanelCouponFoldButton) {
        DmtTextView dmtTextView = skuPanelCouponFoldButton.f37881c;
        if (dmtTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
        }
        return dmtTextView;
    }

    public static final /* synthetic */ Drawable b(SkuPanelCouponFoldButton skuPanelCouponFoldButton) {
        Drawable drawable = skuPanelCouponFoldButton.f37882d;
        if (drawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonBgDrawable");
        }
        return drawable;
    }

    public final void setViewState(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f37879a, false, 29468, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f37879a, false, 29468, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            this.f37883e = true;
            DmtTextView dmtTextView = this.f37881c;
            if (dmtTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
            }
            dmtTextView.setText(C0906R.string.a9y);
            DmtTextView dmtTextView2 = this.f37881c;
            if (dmtTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
            }
            dmtTextView2.setAlpha(1.0f);
            ImageView imageView = this.f37884f;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("arrowImageView");
            }
            imageView.setRotation(0.0f);
            ImageView imageView2 = this.f37884f;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("arrowImageView");
            }
            imageView2.setAlpha(1.0f);
            Drawable drawable = this.f37882d;
            if (drawable == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buttonBgDrawable");
            }
            drawable.setAlpha(255);
        } else {
            this.f37883e = false;
            DmtTextView dmtTextView3 = this.f37881c;
            if (dmtTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
            }
            dmtTextView3.setText(C0906R.string.a9z);
            DmtTextView dmtTextView4 = this.f37881c;
            if (dmtTextView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
            }
            dmtTextView4.setAlpha(0.5f);
            ImageView imageView3 = this.f37884f;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("arrowImageView");
            }
            imageView3.setRotation(-180.0f);
            ImageView imageView4 = this.f37884f;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("arrowImageView");
            }
            imageView4.setAlpha(0.5f);
            Drawable drawable2 = this.f37882d;
            if (drawable2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buttonBgDrawable");
            }
            drawable2.setAlpha(0);
        }
    }

    private final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f37879a, false, 29467, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f37879a, false, 29467, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        setClickable(true);
        setGravity(16);
        Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), 2130838411);
        Intrinsics.checkExpressionValueIsNotNull(a2, "context.resources.getDra…ner_get_coupon_button_bg)");
        this.f37882d = a2;
        Drawable drawable = this.f37882d;
        if (drawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonBgDrawable");
        }
        drawable.setAlpha(0);
        Drawable drawable2 = this.f37882d;
        if (drawable2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonBgDrawable");
        }
        setBackgroundDrawable(drawable2);
        int dip2Px = (int) UIUtils.dip2Px(context, 2.0f);
        setPadding((int) UIUtils.dip2Px(context, 8.0f), dip2Px, (int) UIUtils.dip2Px(context, 4.0f), dip2Px);
        this.f37881c = new DmtTextView(context);
        DmtTextView dmtTextView = this.f37881c;
        if (dmtTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
        }
        dmtTextView.setTextSize(11.0f);
        DmtTextView dmtTextView2 = this.f37881c;
        if (dmtTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
        }
        dmtTextView2.setText(C0906R.string.a9z);
        DmtTextView dmtTextView3 = this.f37881c;
        if (dmtTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
        }
        dmtTextView3.setTextColor(context.getResources().getColor(C0906R.color.g9));
        DmtTextView dmtTextView4 = this.f37881c;
        if (dmtTextView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
        }
        dmtTextView4.setAlpha(0.5f);
        DmtTextView dmtTextView5 = this.f37881c;
        if (dmtTextView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
        }
        dmtTextView5.setIncludeFontPadding(false);
        this.f37884f = new ImageView(context);
        ImageView imageView = this.f37884f;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arrowImageView");
        }
        imageView.setImageResource(2130838440);
        ImageView imageView2 = this.f37884f;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arrowImageView");
        }
        imageView2.setAlpha(0.5f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = (int) UIUtils.dip2Px(context, 2.0f);
        ImageView imageView3 = this.f37884f;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arrowImageView");
        }
        imageView3.setLayoutParams(layoutParams);
        DmtTextView dmtTextView6 = this.f37881c;
        if (dmtTextView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
        }
        addView(dmtTextView6);
        ImageView imageView4 = this.f37884f;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arrowImageView");
        }
        addView(imageView4);
        super.setOnClickListener(this);
    }

    public final void onClick(@Nullable View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f37879a, false, 29469, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f37879a, false, 29469, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (!this.f37880b) {
            boolean z = !this.f37883e;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f37879a, false, 29470, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f37879a, false, 29470, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (this.f37883e != z) {
                this.f37880b = true;
                if (z) {
                    DmtTextView dmtTextView = this.f37881c;
                    if (dmtTextView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dmtTextView, "alpha", new float[]{0.5f, 0.0f});
                    Intrinsics.checkExpressionValueIsNotNull(ofFloat, "textAnim1");
                    ofFloat.setDuration(140);
                    ofFloat.addListener(new b(this));
                    DmtTextView dmtTextView2 = this.f37881c;
                    if (dmtTextView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dmtTextView2, "alpha", new float[]{0.0f, 1.0f});
                    Intrinsics.checkExpressionValueIsNotNull(ofFloat2, "textAnim2");
                    ofFloat2.setDuration(130);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
                    ImageView imageView = this.f37884f;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("arrowImageView");
                    }
                    float rotation = imageView.getRotation();
                    ImageView imageView2 = this.f37884f;
                    if (imageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("arrowImageView");
                    }
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView2, "alpha", new float[]{0.5f, 1.0f});
                    ImageView imageView3 = this.f37884f;
                    if (imageView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("arrowImageView");
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView3, "rotation", new float[]{rotation, rotation + 180.0f});
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat5.addUpdateListener(new c(this));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(new Animator[]{ofFloat3, ofFloat4, ofFloat5});
                    animatorSet2.setDuration(270);
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.playTogether(new Animator[]{animatorSet, animatorSet2});
                    animatorSet3.addListener(new d(this));
                    animatorSet3.start();
                } else {
                    DmtTextView dmtTextView3 = this.f37881c;
                    if (dmtTextView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
                    }
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(dmtTextView3, "alpha", new float[]{1.0f, 0.0f});
                    Intrinsics.checkExpressionValueIsNotNull(ofFloat6, "textAnim1");
                    ofFloat6.setDuration(140);
                    ofFloat6.addListener(new e(this));
                    DmtTextView dmtTextView4 = this.f37881c;
                    if (dmtTextView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("buttonTextView");
                    }
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(dmtTextView4, "alpha", new float[]{0.0f, 0.5f});
                    Intrinsics.checkExpressionValueIsNotNull(ofFloat7, "textAnim2");
                    ofFloat7.setDuration(130);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playSequentially(new Animator[]{ofFloat6, ofFloat7});
                    ImageView imageView4 = this.f37884f;
                    if (imageView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("arrowImageView");
                    }
                    float rotation2 = imageView4.getRotation();
                    ImageView imageView5 = this.f37884f;
                    if (imageView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("arrowImageView");
                    }
                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(imageView5, "alpha", new float[]{1.0f, 0.5f});
                    ImageView imageView6 = this.f37884f;
                    if (imageView6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("arrowImageView");
                    }
                    ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(imageView6, "rotation", new float[]{rotation2, rotation2 - 180.0f});
                    ValueAnimator ofFloat10 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                    ofFloat10.addUpdateListener(new f(this));
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(new Animator[]{ofFloat8, ofFloat9, ofFloat10});
                    animatorSet5.setDuration(270);
                    AnimatorSet animatorSet6 = new AnimatorSet();
                    animatorSet6.playTogether(new Animator[]{animatorSet4, animatorSet5});
                    animatorSet6.addListener(new g(this));
                    animatorSet6.start();
                }
                this.f37883e = z;
            }
            a aVar = this.g;
            if (aVar != null) {
                aVar.a(this, this.f37883e);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SkuPanelCouponFoldButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        a(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SkuPanelCouponFoldButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        a(context);
    }
}
