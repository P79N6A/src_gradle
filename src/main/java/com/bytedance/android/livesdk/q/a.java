package com.bytedance.android.livesdk.q;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.g;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/android/livesdk/promotioncard/OfficialPromotionHotValueDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "isAnchor", "", "(Landroid/content/Context;Z)V", "bgOfficialPromotionHotValue", "Landroid/view/View;", "bgRotateAnimator", "Landroid/view/animation/Animation;", "hotValue", "", "ivHotValueAnimation", "Lcom/facebook/drawee/view/SimpleDraweeView;", "tvOfficialPromotionHotValue", "Landroid/widget/TextView;", "valueAnimator", "Landroid/animation/ValueAnimator;", "onAttachedToWindow", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDetachedFromWindow", "setHotValue", "Companion", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16858a;

    /* renamed from: d  reason: collision with root package name */
    public static final C0116a f16859d = new C0116a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public int f16860b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f16861c;

    /* renamed from: e  reason: collision with root package name */
    private ValueAnimator f16862e;

    /* renamed from: f  reason: collision with root package name */
    private Animation f16863f;
    private View g;
    private SimpleDraweeView h;
    private final boolean i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/android/livesdk/promotioncard/OfficialPromotionHotValueDialog$Companion;", "", "()V", "HOT_VALUE_ANIMATION_DURATION", "", "HOT_VALUE_ANIMATION_PATH", "", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.android.livesdk.q.a$a  reason: collision with other inner class name */
    public static final class C0116a {
        private C0116a() {
        }

        public /* synthetic */ C0116a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 13})
    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f16864a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f16865b;

        b(a aVar) {
            this.f16865b = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f16864a, false, 12844, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f16864a, false, 12844, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                TextView textView = this.f16865b.f16861c;
                if (textView != null) {
                    textView.setText(ac.a((int) C0906R.string.dg9, Integer.valueOf(intValue)));
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f16866a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f16867b;

        c(a aVar) {
            this.f16867b = aVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f16866a, false, 12845, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f16866a, false, 12845, new Class[]{View.class}, Void.TYPE);
                return;
            }
            this.f16867b.dismiss();
        }
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f16858a, false, 12843, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16858a, false, 12843, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator valueAnimator = this.f16862e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        SimpleDraweeView simpleDraweeView = this.h;
        if (simpleDraweeView != null) {
            simpleDraweeView.setController(null);
        }
        SimpleDraweeView simpleDraweeView2 = this.h;
        if (simpleDraweeView2 != null) {
            simpleDraweeView2.setVisibility(8);
        }
        View view = this.g;
        if (view != null) {
            view.clearAnimation();
        }
        super.onDetachedFromWindow();
    }

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f16858a, false, 12842, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16858a, false, 12842, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.f16862e = ValueAnimator.ofInt(new int[]{0, this.f16860b});
        ValueAnimator valueAnimator = this.f16862e;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        }
        ValueAnimator valueAnimator2 = this.f16862e;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(3000);
        }
        ValueAnimator valueAnimator3 = this.f16862e;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new b(this));
        }
        ValueAnimator valueAnimator4 = this.f16862e;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
        View view = this.g;
        if (view != null) {
            view.startAnimation(this.f16863f);
        }
        AbstractDraweeController build = ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setUri("asset://com.ss.android.ies.live.sdk/official_promotion_hot_value.webp").setAutoPlayAnimations(true)).build();
        SimpleDraweeView simpleDraweeView = this.h;
        if (simpleDraweeView != null) {
            simpleDraweeView.setVisibility(0);
        }
        SimpleDraweeView simpleDraweeView2 = this.h;
        if (simpleDraweeView2 != null) {
            simpleDraweeView2.setController(build);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f16858a, false, 12841, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f16858a, false, 12841, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.ah2, null);
        setContentView(inflate);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        if (this.i || g.a(getContext())) {
            Window window2 = getWindow();
            if (window2 != null) {
                window2.clearFlags(1024);
            }
        } else {
            Window window3 = getWindow();
            if (window3 != null) {
                window3.addFlags(1024);
            }
        }
        this.g = inflate.findViewById(C0906R.id.kl);
        this.f16861c = (TextView) inflate.findViewById(C0906R.id.dfn);
        this.h = (SimpleDraweeView) inflate.findViewById(C0906R.id.b28);
        inflate.setOnClickListener(new c(this));
        this.f16863f = AnimationUtils.loadAnimation(getContext(), C0906R.anim.e4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, boolean z) {
        super(context, C0906R.style.w_);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.i = z;
    }
}
