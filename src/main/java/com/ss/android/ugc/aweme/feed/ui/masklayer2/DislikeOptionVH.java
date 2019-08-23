package com.ss.android.ugc.aweme.feed.ui.masklayer2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.d;
import com.ss.android.ugc.aweme.shortvideo.au;
import com.ss.android.ugc.aweme.u.aa;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeOptionVH;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mArrowView", "mDescLayout", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/OptionDescItemLayout;", "mExpandAnimatorSet", "Landroid/animation/AnimatorSet;", "mExpandLayout", "Landroid/view/ViewGroup;", "mExpanded", "", "expand", "", "item", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeItem;", "shrink", "update", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DislikeOptionVH extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46706a;
    static final float g = (-UIUtils.dip2Px(com.ss.android.ugc.aweme.base.utils.d.a(), 25.0f));
    static final au h = new au(0.25f, 0.1f, 0.25f, 1.0f);
    public static final a i = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    OptionDescItemLayout f46707b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f46708c;

    /* renamed from: d  reason: collision with root package name */
    public View f46709d;

    /* renamed from: e  reason: collision with root package name */
    public AnimatorSet f46710e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f46711f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeOptionVH$Companion;", "", "()V", "DURATION", "", "INTERPOLATOR", "Lcom/ss/android/ugc/aweme/shortvideo/CubicBezierInterpolator;", "TRANSLATION_Y", "", "newInstance", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeOptionVH;", "parent", "Landroid/view/ViewGroup;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46712a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeOptionVH$expand$1$1"}, k = 3, mv = {1, 1, 15})
    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46713a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DislikeOptionVH f46714b;

        b(DislikeOptionVH dislikeOptionVH) {
            this.f46714b = dislikeOptionVH;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f46713a, false, 43427, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f46713a, false, 43427, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f46714b.f46708c.getLayoutParams().height = ((Integer) animatedValue).intValue();
                this.f46714b.f46708c.requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeOptionVH$expand$2$1"}, k = 3, mv = {1, 1, 15})
    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46715a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DislikeOptionVH f46716b;

        c(DislikeOptionVH dislikeOptionVH) {
            this.f46716b = dislikeOptionVH;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f46715a, false, 43428, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f46715a, false, 43428, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f46716b.f46709d.setRotation(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeOptionVH$expand$3$1"}, k = 3, mv = {1, 1, 15})
    static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46717a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DislikeOptionVH f46718b;

        d(DislikeOptionVH dislikeOptionVH) {
            this.f46718b = dislikeOptionVH;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f46717a, false, 43429, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f46717a, false, 43429, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f46718b.f46708c.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeOptionVH$expand$4$1"}, k = 3, mv = {1, 1, 15})
    static final class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46719a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DislikeOptionVH f46720b;

        e(DislikeOptionVH dislikeOptionVH) {
            this.f46720b = dislikeOptionVH;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f46719a, false, 43430, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f46719a, false, 43430, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f46720b.f46708c.setTranslationY(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeOptionVH$shrink$1$1"}, k = 3, mv = {1, 1, 15})
    static final class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46721a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DislikeOptionVH f46722b;

        f(DislikeOptionVH dislikeOptionVH) {
            this.f46722b = dislikeOptionVH;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f46721a, false, 43431, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f46721a, false, 43431, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f46722b.f46708c.getLayoutParams().height = ((Integer) animatedValue).intValue();
                this.f46722b.f46708c.requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeOptionVH$shrink$2$1"}, k = 3, mv = {1, 1, 15})
    static final class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46723a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DislikeOptionVH f46724b;

        g(DislikeOptionVH dislikeOptionVH) {
            this.f46724b = dislikeOptionVH;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f46723a, false, 43432, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f46723a, false, 43432, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f46724b.f46709d.setRotation(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeOptionVH$shrink$3$1"}, k = 3, mv = {1, 1, 15})
    static final class h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46725a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DislikeOptionVH f46726b;

        h(DislikeOptionVH dislikeOptionVH) {
            this.f46726b = dislikeOptionVH;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f46725a, false, 43433, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f46725a, false, 43433, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f46726b.f46708c.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeOptionVH$shrink$4$1"}, k = 3, mv = {1, 1, 15})
    static final class i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46727a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DislikeOptionVH f46728b;

        i(DislikeOptionVH dislikeOptionVH) {
            this.f46728b = dislikeOptionVH;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f46727a, false, 43434, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f46727a, false, 43434, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f46728b.f46708c.setTranslationY(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeOptionVH$shrink$5$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class j extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46729a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DislikeOptionVH f46730b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ValueAnimator f46731c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ValueAnimator f46732d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ValueAnimator f46733e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ValueAnimator f46734f;

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f46729a, false, 43435, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f46729a, false, 43435, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f46730b.f46708c.removeAllViews();
        }

        j(DislikeOptionVH dislikeOptionVH, ValueAnimator valueAnimator, ValueAnimator valueAnimator2, ValueAnimator valueAnimator3, ValueAnimator valueAnimator4) {
            this.f46730b = dislikeOptionVH;
            this.f46731c = valueAnimator;
            this.f46732d = valueAnimator2;
            this.f46733e = valueAnimator3;
            this.f46734f = valueAnimator4;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46735a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DislikeOptionVH f46736b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f46737c;

        k(DislikeOptionVH dislikeOptionVH, b bVar) {
            this.f46736b = dislikeOptionVH;
            this.f46737c = bVar;
        }

        public final void onClick(View view) {
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f46735a, false, 43436, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f46735a, false, 43436, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            c cVar = this.f46737c.f46759c;
            if (PatchProxy.isSupport(new Object[0], cVar, c.f46760a, false, 43439, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, c.f46760a, false, 43439, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.app.d.d a2 = new com.ss.android.ugc.aweme.app.d.d().a("enter_from", cVar.f46761b.f46753d);
                Aweme aweme = cVar.f46761b.f46752c;
                String str2 = null;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.app.d.d a3 = a2.a("group_id", str);
                Aweme aweme2 = cVar.f46761b.f46752c;
                if (aweme2 != null) {
                    str2 = aweme2.getAuthorUid();
                }
                r.a("click_block_videos", (Map) a3.a("author_id", str2).a("log_pb", ai.a().a(aa.c(cVar.f46761b.f46752c))).a("enter_method", "long_press").f34114b);
            }
            AnimatorSet animatorSet = this.f46736b.f46710e;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            if (this.f46736b.f46711f) {
                DislikeOptionVH dislikeOptionVH = this.f46736b;
                if (PatchProxy.isSupport(new Object[0], dislikeOptionVH, DislikeOptionVH.f46706a, false, 43425, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], dislikeOptionVH, DislikeOptionVH.f46706a, false, 43425, new Class[0], Void.TYPE);
                } else {
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{dislikeOptionVH.f46708c.getHeight(), 0});
                    Intrinsics.checkExpressionValueIsNotNull(ofInt, "ValueAnimator.ofInt(mExpandLayout.height, 0)");
                    ofInt.addUpdateListener(new f(dislikeOptionVH));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{dislikeOptionVH.f46709d.getRotation(), 0.0f});
                    Intrinsics.checkExpressionValueIsNotNull(ofFloat, "ValueAnimator.ofFloat(mArrowView.rotation, 0f)");
                    ofFloat.addUpdateListener(new g(dislikeOptionVH));
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{dislikeOptionVH.f46708c.getAlpha(), 0.0f});
                    Intrinsics.checkExpressionValueIsNotNull(ofFloat2, "ValueAnimator.ofFloat(mExpandLayout.alpha, 0f)");
                    ofFloat2.addUpdateListener(new h(dislikeOptionVH));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{dislikeOptionVH.f46708c.getTranslationY(), DislikeOptionVH.g});
                    Intrinsics.checkExpressionValueIsNotNull(ofFloat3, "ValueAnimator.ofFloat(mE…nslationY, TRANSLATION_Y)");
                    ofFloat3.addUpdateListener(new i(dislikeOptionVH));
                    dislikeOptionVH.f46710e = new AnimatorSet();
                    AnimatorSet animatorSet2 = dislikeOptionVH.f46710e;
                    if (animatorSet2 == null) {
                        Intrinsics.throwNpe();
                    }
                    animatorSet2.setDuration(300);
                    animatorSet2.setInterpolator(DislikeOptionVH.h);
                    j jVar = new j(dislikeOptionVH, ofInt, ofFloat, ofFloat2, ofFloat3);
                    animatorSet2.addListener(jVar);
                    animatorSet2.playTogether(new Animator[]{ofInt, ofFloat, ofFloat2, ofFloat3});
                    animatorSet2.start();
                }
            } else {
                this.f46736b.a(this.f46737c);
            }
            this.f46736b.f46711f = !this.f46736b.f46711f;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DislikeOptionVH(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        View findViewById = view.findViewById(C0906R.id.a3q);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.desc_layout)");
        this.f46707b = (OptionDescItemLayout) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.ab3);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.expand_layout)");
        this.f46708c = (ViewGroup) findViewById2;
        View findViewById3 = view.findViewById(C0906R.id.fv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.arrow)");
        this.f46709d = findViewById3;
        this.f46709d.setVisibility(0);
        this.f46708c.setTranslationY(g);
        this.f46708c.setAlpha(0.0f);
    }

    public final void a(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f46706a, false, 43424, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f46706a, false, 43424, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.f46708c.removeAllViews();
        for (g next : bVar2.f46758b) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            d dVar = new d(view.getContext());
            c cVar = bVar2.f46759c;
            if (PatchProxy.isSupport(new Object[]{next, cVar}, dVar, d.f46762a, false, 43442, new Class[]{g.class, c.class}, Void.TYPE)) {
                d dVar2 = dVar;
                PatchProxy.accessDispatch(new Object[]{next, cVar}, dVar2, d.f46762a, false, 43442, new Class[]{g.class, c.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(next, "vo");
                TextView textView = dVar.f46763b;
                if (textView != null) {
                    String str = next.f46773c;
                    if (str == null) {
                        str = "";
                    }
                    textView.setText(str);
                }
                dVar.setOnClickListener(new d.a(cVar, next));
            }
            this.f46708c.addView(dVar);
        }
        this.f46708c.measure(View.MeasureSpec.makeMeasureSpec(this.f46708c.getWidth(), Integer.MIN_VALUE), 0);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f46708c.getHeight(), this.f46708c.getMeasuredHeight()});
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "ValueAnimator.ofInt(mExp…andLayout.measuredHeight)");
        ofInt.addUpdateListener(new b(this));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f46709d.getRotation(), 180.0f});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "ValueAnimator.ofFloat(mArrowView.rotation, 180f)");
        ofFloat.addUpdateListener(new c(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{this.f46708c.getAlpha(), 1.0f});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat2, "ValueAnimator.ofFloat(mExpandLayout.alpha, 1f)");
        ofFloat2.addUpdateListener(new d(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{this.f46708c.getTranslationY(), 0.0f});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat3, "ValueAnimator.ofFloat(mE…dLayout.translationY, 0f)");
        ofFloat3.addUpdateListener(new e(this));
        this.f46710e = new AnimatorSet();
        AnimatorSet animatorSet = this.f46710e;
        if (animatorSet == null) {
            Intrinsics.throwNpe();
        }
        animatorSet.setDuration(300);
        animatorSet.setInterpolator(h);
        animatorSet.playTogether(new Animator[]{ofInt, ofFloat, ofFloat2, ofFloat3});
        animatorSet.start();
    }
}
