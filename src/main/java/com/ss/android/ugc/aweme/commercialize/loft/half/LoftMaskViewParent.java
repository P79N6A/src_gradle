package com.ss.android.ugc.aweme.commercialize.loft.half;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.os.Build;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u001e\n\u0002\u0010\u0015\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u0001H\u0002J\u0012\u00107\u001a\u0004\u0018\u00010,2\u0006\u00106\u001a\u00020\u0001H\u0002J\b\u00108\u001a\u00020\bH\u0016J\u0016\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\bJ\u0010\u0010<\u001a\u00020\u00172\u0006\u0010=\u001a\u000200H\u0002J0\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\b2\u0006\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\b2\u0006\u0010C\u001a\u00020\bH\u0014J\u0018\u0010D\u001a\u00020\u00172\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\bH\u0014J(\u0010G\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010H\u001a\u0002002\u0006\u0010I\u001a\u0002002\u0006\u0010J\u001a\u00020\u000bH\u0016J \u0010K\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010H\u001a\u0002002\u0006\u0010I\u001a\u000200H\u0016J(\u0010L\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\b2\u0006\u0010J\u001a\u00020OH\u0016J0\u0010P\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\b2\u0006\u0010T\u001a\u00020\bH\u0016J \u0010U\u001a\u00020\u00172\u0006\u0010V\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\bH\u0016J \u0010X\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\bH\u0016J\u0010\u0010Z\u001a\u00020\u00172\u0006\u0010V\u001a\u00020\u000eH\u0016J\u000e\u0010[\u001a\u00020\u00172\u0006\u0010\\\u001a\u00020\u000bR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010#\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b@BX\u000e¢\u0006\b\n\u0000\"\u0004\b$\u0010!R\u000e\u0010%\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R \u0010.\u001a\b\u0012\u0004\u0012\u0002000/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006]"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/half/LoftMaskViewParent;", "Landroid/view/ViewGroup;", "Landroid/support/v4/view/NestedScrollingParent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "alreadyExpand", "", "backing", "bottomMask", "Landroid/view/View;", "getBottomMask", "()Landroid/view/View;", "setBottomMask", "(Landroid/view/View;)V", "currentAnim", "Landroid/animation/ValueAnimator;", "dismissListener", "Lkotlin/Function0;", "", "getDismissListener", "()Lkotlin/jvm/functions/Function0;", "setDismissListener", "(Lkotlin/jvm/functions/Function0;)V", "value", "expand", "getExpand", "()Z", "setExpand", "(Z)V", "expandDistance", "expandHalf", "setExpandHalf", "expanding", "nestedScrolling", "nestedScrollingParentHelper", "Landroid/support/v4/view/NestedScrollingParentHelper;", "rnHeader", "showToExpandFullScreen", "target", "Landroid/support/v7/widget/RecyclerView;", "topDistance", "totalMoveRate", "Landroid/arch/lifecycle/MutableLiveData;", "", "getTotalMoveRate", "()Landroid/arch/lifecycle/MutableLiveData;", "setTotalMoveRate", "(Landroid/arch/lifecycle/MutableLiveData;)V", "checkSafeChildCount", "group", "ensureTarget", "getNestedScrollAxes", "loadContent", "topView", "contentHeight", "moveContainer", "offset", "onLayout", "changed", "l", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onNestedFling", "velocityX", "velocityY", "consumed", "onNestedPreFling", "onNestedPreScroll", "dx", "dy", "", "onNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "onNestedScrollAccepted", "child", "axes", "onStartNestedScroll", "nestedScrollAxes", "onStopNestedScroll", "show", "expandFullScreen", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LoftMaskViewParent extends ViewGroup implements NestedScrollingParent {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39204a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f39205b;

    /* renamed from: c  reason: collision with root package name */
    int f39206c;

    /* renamed from: d  reason: collision with root package name */
    int f39207d;

    /* renamed from: e  reason: collision with root package name */
    int f39208e;

    /* renamed from: f  reason: collision with root package name */
    boolean f39209f;
    public boolean g;
    @NotNull
    public View h;
    public boolean i;
    public boolean j;
    private final NestedScrollingParentHelper k;
    private boolean l;
    private ValueAnimator m;
    @NotNull
    private MutableLiveData<Float> n;
    @Nullable
    private Function0<Unit> o;
    private boolean p;
    private boolean q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/ugc/aweme/commercialize/loft/half/LoftMaskViewParent$expand$1$1"}, k = 3, mv = {1, 1, 15})
    static final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39210a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ValueAnimator f39211b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LoftMaskViewParent f39212c;

        a(ValueAnimator valueAnimator, LoftMaskViewParent loftMaskViewParent) {
            this.f39211b = valueAnimator;
            this.f39212c = loftMaskViewParent;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f39210a, false, 31260, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f39210a, false, 31260, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            LoftMaskViewParent loftMaskViewParent = this.f39212c;
            Object animatedValue = this.f39211b.getAnimatedValue();
            if (animatedValue != null) {
                loftMaskViewParent.a(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/half/LoftMaskViewParent$expand$1$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LoftMaskViewParent f39213a;

        b(LoftMaskViewParent loftMaskViewParent) {
            this.f39213a = loftMaskViewParent;
        }

        public final void onAnimationStart(@Nullable Animator animator) {
            this.f39213a.i = true;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            this.f39213a.i = false;
            this.f39213a.g = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/ugc/aweme/commercialize/loft/half/LoftMaskViewParent$expand$2$1"}, k = 3, mv = {1, 1, 15})
    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39214a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ValueAnimator f39215b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LoftMaskViewParent f39216c;

        c(ValueAnimator valueAnimator, LoftMaskViewParent loftMaskViewParent) {
            this.f39215b = valueAnimator;
            this.f39216c = loftMaskViewParent;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f39214a, false, 31261, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f39214a, false, 31261, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            LoftMaskViewParent loftMaskViewParent = this.f39216c;
            Object animatedValue = this.f39215b.getAnimatedValue();
            if (animatedValue != null) {
                loftMaskViewParent.a(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/half/LoftMaskViewParent$expand$2$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39217a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoftMaskViewParent f39218b;

        d(LoftMaskViewParent loftMaskViewParent) {
            this.f39218b = loftMaskViewParent;
        }

        public final void onAnimationStart(@Nullable Animator animator) {
            this.f39218b.j = true;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f39217a, false, 31262, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f39217a, false, 31262, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f39218b.j = false;
            RecyclerView recyclerView = this.f39218b.f39205b;
            if (recyclerView != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.scrollToPosition(0);
                }
            }
            ViewParent parent = this.f39218b.getParent();
            if (parent != null) {
                ViewGroup viewGroup = (ViewGroup) parent;
                ViewParent parent2 = this.f39218b.getParent();
                if (parent2 != null) {
                    viewGroup.setTranslationY((float) ((ViewGroup) parent2).getMeasuredHeight());
                    Function0<Unit> dismissListener = this.f39218b.getDismissListener();
                    if (dismissListener != null) {
                        dismissListener.invoke();
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/ugc/aweme/commercialize/loft/half/LoftMaskViewParent$expandHalf$1$1"}, k = 3, mv = {1, 1, 15})
    static final class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39219a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ValueAnimator f39220b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LoftMaskViewParent f39221c;

        e(ValueAnimator valueAnimator, LoftMaskViewParent loftMaskViewParent) {
            this.f39220b = valueAnimator;
            this.f39221c = loftMaskViewParent;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f39219a, false, 31263, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f39219a, false, 31263, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            LoftMaskViewParent loftMaskViewParent = this.f39221c;
            Object animatedValue = this.f39220b.getAnimatedValue();
            if (animatedValue != null) {
                loftMaskViewParent.a(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/half/LoftMaskViewParent$expandHalf$1$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LoftMaskViewParent f39222a;

        f(LoftMaskViewParent loftMaskViewParent) {
            this.f39222a = loftMaskViewParent;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            this.f39222a.i = false;
        }

        public final void onAnimationStart(@Nullable Animator animator) {
            this.f39222a.i = true;
        }
    }

    @JvmOverloads
    public LoftMaskViewParent(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public LoftMaskViewParent(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final boolean onNestedFling(@NotNull View view, float f2, float f3, boolean z) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z ? (byte) 1 : 0)}, this, f39204a, false, 31256, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z)}, this, f39204a, false, 31256, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(view2, "target");
        return true;
    }

    public final boolean onNestedPreFling(@NotNull View view, float f2, float f3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f39204a, false, 31257, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f39204a, false, 31257, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(view2, "target");
        return true;
    }

    public final boolean onStartNestedScroll(@NotNull View view, @NotNull View view2, int i2) {
        View view3 = view;
        View view4 = view2;
        if (PatchProxy.isSupport(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f39204a, false, 31248, new Class[]{View.class, View.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f39204a, false, 31248, new Class[]{View.class, View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(view3, "child");
        Intrinsics.checkParameterIsNotNull(view4, "target");
        return (i2 & 2) != 0;
    }

    @Nullable
    public final Function0<Unit> getDismissListener() {
        return this.o;
    }

    public final boolean getExpand() {
        return this.p;
    }

    @NotNull
    public final MutableLiveData<Float> getTotalMoveRate() {
        return this.n;
    }

    @NotNull
    public final View getBottomMask() {
        if (PatchProxy.isSupport(new Object[0], this, f39204a, false, 31239, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f39204a, false, 31239, new Class[0], View.class);
        }
        View view = this.h;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomMask");
        }
        return view;
    }

    public final int getNestedScrollAxes() {
        if (PatchProxy.isSupport(new Object[0], this, f39204a, false, 31247, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f39204a, false, 31247, new Class[0], Integer.TYPE)).intValue();
        } else if (Build.VERSION.SDK_INT >= 21) {
            return super.getNestedScrollAxes();
        } else {
            return this.k.getNestedScrollAxes();
        }
    }

    public final void setDismissListener(@Nullable Function0<Unit> function0) {
        this.o = function0;
    }

    public final void setBottomMask(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f39204a, false, 31240, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f39204a, false, 31240, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "<set-?>");
        this.h = view2;
    }

    public final void setTotalMoveRate(@NotNull MutableLiveData<Float> mutableLiveData) {
        MutableLiveData<Float> mutableLiveData2 = mutableLiveData;
        if (PatchProxy.isSupport(new Object[]{mutableLiveData2}, this, f39204a, false, 31241, new Class[]{MutableLiveData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mutableLiveData2}, this, f39204a, false, 31241, new Class[]{MutableLiveData.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(mutableLiveData2, "<set-?>");
        this.n = mutableLiveData2;
    }

    private final RecyclerView a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f39204a, false, 31244, new Class[]{ViewGroup.class}, RecyclerView.class)) {
            return (RecyclerView) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f39204a, false, 31244, new Class[]{ViewGroup.class}, RecyclerView.class);
        }
        int childCount = viewGroup.getChildCount();
        if (childCount >= 0) {
            while (!(viewGroup2.getChildAt(i2) instanceof RecyclerView)) {
                if (i2 != childCount) {
                    i2++;
                }
            }
            View childAt = viewGroup2.getChildAt(i2);
            if (childAt != null) {
                return (RecyclerView) childAt;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
        }
        return null;
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f39204a, false, 31250, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f39204a, false, 31250, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        setTranslationY(f2);
        float abs = Math.abs(f2);
        View view = this.h;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomMask");
        }
        if (abs < ((float) view.getMeasuredHeight())) {
            View view2 = this.h;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomMask");
            }
            view2.setTranslationY(f2);
        }
        MutableLiveData<Float> mutableLiveData = this.n;
        float abs2 = Math.abs(getTranslationY());
        View view3 = this.h;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomMask");
        }
        float abs3 = abs2 - Math.abs(view3.getTranslationY());
        ViewParent parent = getParent();
        if (parent != null) {
            int measuredHeight = ((ViewGroup) parent).getMeasuredHeight();
            View view4 = this.h;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomMask");
            }
            mutableLiveData.setValue(Float.valueOf(abs3 / ((float) ((measuredHeight - (view4.getMeasuredHeight() - this.f39206c)) - this.f39208e))));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final void onStopNestedScroll(@NotNull View view) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f39204a, false, 31253, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f39204a, false, 31253, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "child");
        this.k.onStopNestedScroll(view);
        if (this.l) {
            this.l = false;
            if (this.g) {
                i2 = this.f39207d - this.f39206c;
            } else {
                i2 = this.f39207d;
            }
            if (getY() < ((float) i2)) {
                setExpand(true);
                return;
            }
            ViewParent parent = getParent();
            if (parent == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            } else if (((ViewGroup) parent).getMeasuredHeight() - getMeasuredHeight() < this.f39207d) {
                setExpand(false);
            } else if (((float) getMeasuredHeight()) - Math.abs(getTranslationY()) > ((float) (this.f39207d - this.f39206c))) {
                setExpand(false);
            } else {
                setExpandHalf(true);
            }
        }
    }

    public final void setExpand(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39204a, false, 31254, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39204a, false, 31254, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.p = z;
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{getTranslationY(), -((float) getMeasuredHeight())});
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new a(ofFloat, this));
            ofFloat.addListener(new b(this));
            ofFloat.start();
            this.m = ofFloat;
            return;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{getTranslationY(), 0.0f});
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new c(ofFloat2, this));
        ofFloat2.addListener(new d(this));
        ofFloat2.start();
        this.m = ofFloat2;
    }

    /* access modifiers changed from: package-private */
    public final void setExpandHalf(boolean z) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39204a, false, 31255, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39204a, false, 31255, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.q = z;
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z) {
            ViewParent parent = getParent();
            if (parent != null) {
                if (((ViewGroup) parent).getMeasuredHeight() - this.f39207d > getMeasuredHeight()) {
                    f2 = (float) getMeasuredHeight();
                } else {
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        f2 = (float) (((ViewGroup) parent2).getMeasuredHeight() - this.f39207d);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{getTranslationY(), -f2});
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.addUpdateListener(new e(ofFloat, this));
                ofFloat.addListener(new f(this));
                ofFloat.start();
                this.m = ofFloat;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        setExpand(false);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39204a, false, 31243, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39204a, false, 31243, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g = false;
        setTranslationY(0.0f);
        View view = this.h;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomMask");
        }
        view.setTranslationY(0.0f);
        this.f39209f = z;
        if (z) {
            setExpand(true);
        } else {
            setExpandHalf(true);
        }
    }

    public final void onMeasure(int i2, int i3) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f39204a, false, 31246, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f39204a, false, 31246, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        if (this.f39205b == null) {
            this.f39205b = a((ViewGroup) this);
        }
        ViewGroup viewGroup = this;
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f39204a, false, 31245, new Class[]{ViewGroup.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f39204a, false, 31245, new Class[]{ViewGroup.class}, Boolean.TYPE)).booleanValue();
        } else if (viewGroup.getChildCount() != 1 || !(this.f39205b instanceof RecyclerView)) {
            z = true;
        }
        if (!z) {
            measureChildren(i2, i3);
            return;
        }
        throw new RuntimeException("Can not have more than one view.");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoftMaskViewParent(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.k = new NestedScrollingParentHelper(this);
        this.f39206c = u.a(114.0d);
        this.f39207d = u.a(103.0d) + this.f39206c;
        MutableLiveData<Float> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Float.valueOf(0.0f));
        this.n = mutableLiveData;
    }

    public final void onNestedScrollAccepted(@NotNull View view, @NotNull View view2, int i2) {
        View view3 = view;
        View view4 = view2;
        if (PatchProxy.isSupport(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f39204a, false, 31252, new Class[]{View.class, View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f39204a, false, 31252, new Class[]{View.class, View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view3, "child");
        Intrinsics.checkParameterIsNotNull(view4, "target");
        if (Build.VERSION.SDK_INT >= 21) {
            super.onNestedScrollAccepted(view, view2, i2);
        } else {
            this.k.onNestedScrollAccepted(view3, view4, i2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedPreScroll(@org.jetbrains.annotations.NotNull android.view.View r17, int r18, int r19, @org.jetbrains.annotations.NotNull int[] r20) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            r9 = r19
            r10 = r20
            r11 = 4
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r13 = 1
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r14 = 2
            r0[r14] = r1
            r15 = 3
            r0[r15] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f39204a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 31249(0x7a11, float:4.3789E-41)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0071
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r0[r14] = r1
            r0[r15] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f39204a
            r3 = 0
            r4 = 31249(0x7a11, float:4.3789E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0071:
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.lang.String r0 = "consumed"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            r7.l = r13
            if (r9 <= 0) goto L_0x00a1
            boolean r0 = r7.i
            if (r0 != 0) goto L_0x00a1
            boolean r0 = r7.j
            if (r0 != 0) goto L_0x00a1
            float r0 = r16.getTranslationY()
            float r1 = (float) r9
            float r0 = r0 - r1
            int r2 = r16.getMeasuredHeight()
            int r2 = -r2
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a1
            float r0 = r16.getTranslationY()
            float r0 = r0 - r1
            r7.a((float) r0)
            r10[r13] = r9
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.loft.half.LoftMaskViewParent.onNestedPreScroll(android.view.View, int, int, int[]):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoftMaskViewParent(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f39204a, false, 31238, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f39204a, false, 31238, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        RecyclerView recyclerView = this.f39205b;
        if (recyclerView != null) {
            int measuredWidth = getMeasuredWidth();
            RecyclerView recyclerView2 = this.f39205b;
            if (recyclerView2 == null) {
                Intrinsics.throwNpe();
            }
            recyclerView.layout(0, 0, measuredWidth, recyclerView2.getMeasuredHeight());
        }
    }

    public final void onNestedScroll(@NotNull View view, int i2, int i3, int i4, int i5) {
        View view2 = view;
        int i6 = i5;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f39204a, false, 31251, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f39204a, false, 31251, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "target");
        this.l = true;
        if (i6 < 0 && !this.i && !this.j) {
            a(getTranslationY() - ((float) i6));
        }
    }
}
