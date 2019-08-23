package com.ss.android.ugc.aweme.commercialize.loft;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.os.Build;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.NestedScrollingParentHelper;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0010\u0015\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020&J\b\u0010D\u001a\u00020\rH\u0002J\b\u0010E\u001a\u00020BH\u0002J\b\u0010F\u001a\u00020BH\u0002J\u0010\u0010G\u001a\u00020B2\u0006\u0010H\u001a\u00020\rH\u0002J\b\u0010I\u001a\u00020\bH\u0016J\u0010\u0010J\u001a\u00020B2\u0006\u0010K\u001a\u00020\u0017H\u0002J0\u0010L\u001a\u00020B2\u0006\u0010M\u001a\u00020\r2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\b2\u0006\u0010P\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\bH\u0014J\u0018\u0010R\u001a\u00020B2\u0006\u0010S\u001a\u00020\b2\u0006\u0010T\u001a\u00020\bH\u0014J(\u0010U\u001a\u00020\r2\u0006\u00108\u001a\u0002092\u0006\u0010V\u001a\u00020\u00172\u0006\u0010W\u001a\u00020\u00172\u0006\u0010X\u001a\u00020\rH\u0016J \u0010Y\u001a\u00020\r2\u0006\u00108\u001a\u0002092\u0006\u0010V\u001a\u00020\u00172\u0006\u0010W\u001a\u00020\u0017H\u0016J(\u0010Z\u001a\u00020B2\u0006\u00108\u001a\u0002092\u0006\u0010[\u001a\u00020\b2\u0006\u0010\\\u001a\u00020\b2\u0006\u0010X\u001a\u00020]H\u0016J0\u0010^\u001a\u00020B2\u0006\u00108\u001a\u0002092\u0006\u0010_\u001a\u00020\b2\u0006\u0010`\u001a\u00020\b2\u0006\u0010a\u001a\u00020\b2\u0006\u0010b\u001a\u00020\bH\u0016J \u0010c\u001a\u00020B2\u0006\u0010d\u001a\u0002092\u0006\u00108\u001a\u0002092\u0006\u0010e\u001a\u00020\bH\u0016J \u0010f\u001a\u00020\r2\u0006\u0010d\u001a\u0002092\u0006\u00108\u001a\u0002092\u0006\u0010g\u001a\u00020\bH\u0016J\u0010\u0010h\u001a\u00020B2\u0006\u0010d\u001a\u000209H\u0016J\u000e\u0010i\u001a\u00020B2\u0006\u0010C\u001a\u00020&J\b\u0010j\u001a\u00020BH\u0002J\u0010\u0010k\u001a\u00020B2\u0006\u0010l\u001a\u00020\rH\u0016J\u000e\u0010m\u001a\u00020B2\u0006\u0010n\u001a\u000209R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0001X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000f\"\u0004\b/\u0010\u0011R\u000e\u00100\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u001a\u00105\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u000f\"\u0004\b7\u0010\u0011R\u0010\u00108\u001a\u0004\u0018\u000109X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u000109X\u000e¢\u0006\u0002\n\u0000R \u0010;\u001a\b\u0012\u0004\u0012\u00020\u00170<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006o"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/LoftNestedRefreshLayout;", "Landroid/view/ViewGroup;", "Landroid/support/v4/view/NestedScrollingParent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentAnim", "Landroid/animation/ValueAnimator;", "enableExpand", "", "getEnableExpand", "()Z", "setEnableExpand", "(Z)V", "value", "expand", "getExpand", "setExpand", "expandDistance", "", "expanding", "headerView", "getHeaderView", "()Landroid/view/ViewGroup;", "setHeaderView", "(Landroid/view/ViewGroup;)V", "iDamping", "Lcom/ss/android/ugc/aweme/commercialize/loft/listener/IDamping;", "getIDamping", "()Lcom/ss/android/ugc/aweme/commercialize/loft/listener/IDamping;", "setIDamping", "(Lcom/ss/android/ugc/aweme/commercialize/loft/listener/IDamping;)V", "iExpand", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/commercialize/loft/listener/IExpand;", "Lkotlin/collections/ArrayList;", "iRefresh", "Lcom/ss/android/ugc/aweme/commercialize/loft/listener/IRefresh;", "getIRefresh", "()Lcom/ss/android/ugc/aweme/commercialize/loft/listener/IRefresh;", "setIRefresh", "(Lcom/ss/android/ugc/aweme/commercialize/loft/listener/IRefresh;)V", "isRefreshing", "setRefreshing", "nestedScrollInProgress", "nestedScrollingParentHelper", "Landroid/support/v4/view/NestedScrollingParentHelper;", "refreshDistance", "refreshingBackFlag", "returningToStart", "getReturningToStart", "setReturningToStart", "target", "Landroid/view/View;", "topView", "totalConsume", "Landroid/arch/lifecycle/MutableLiveData;", "getTotalConsume", "()Landroid/arch/lifecycle/MutableLiveData;", "setTotalConsume", "(Landroid/arch/lifecycle/MutableLiveData;)V", "addExpandListener", "", "listener", "checkChildCountSafe", "ensureTarget", "ensureTopView", "finishSpinner", "goToExpand", "getNestedScrollAxes", "moveSpinner", "moveDistance", "onLayout", "changed", "l", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onNestedFling", "velocityX", "velocityY", "consumed", "onNestedPreFling", "onNestedPreScroll", "dx", "dy", "", "onNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "onNestedScrollAccepted", "child", "axes", "onStartNestedScroll", "nestedScrollAxes", "onStopNestedScroll", "removeExpandListener", "setDefaultHeader", "setEnabled", "enabled", "setHeader", "view", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LoftNestedRefreshLayout extends ViewGroup implements NestedScrollingParent {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39074a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f39075b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f39076c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f39077d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f39078e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<com.ss.android.ugc.aweme.commercialize.loft.b.b> f39079f;
    private final NestedScrollingParentHelper g;
    private View h;
    private View i;
    private boolean j;
    @NotNull
    private MutableLiveData<Float> k;
    private boolean l;
    private ValueAnimator m;
    private boolean n;
    private float o;
    private float p;
    private boolean q;
    @NotNull
    private com.ss.android.ugc.aweme.commercialize.loft.b.a r;
    @Nullable
    private com.ss.android.ugc.aweme.commercialize.loft.b.d s;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/ugc/aweme/commercialize/loft/LoftNestedRefreshLayout$expand$2$1"}, k = 3, mv = {1, 1, 15})
    static final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39080a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoftNestedRefreshLayout f39081b;

        a(LoftNestedRefreshLayout loftNestedRefreshLayout) {
            this.f39081b = loftNestedRefreshLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f39080a, false, 31036, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f39080a, false, 31036, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            LoftNestedRefreshLayout loftNestedRefreshLayout = this.f39081b;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                loftNestedRefreshLayout.a(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/LoftNestedRefreshLayout$expand$2$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39082a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoftNestedRefreshLayout f39083b;

        b(LoftNestedRefreshLayout loftNestedRefreshLayout) {
            this.f39083b = loftNestedRefreshLayout;
        }

        public final void onAnimationStart(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f39082a, false, 31037, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f39082a, false, 31037, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f39083b.setReturningToStart(true);
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f39082a, false, 31038, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f39082a, false, 31038, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f39083b.setReturningToStart(false);
            if (this.f39083b.f39077d) {
                this.f39083b.f39077d = false;
                if (this.f39083b.getIRefresh() == null) {
                }
            } else {
                for (com.ss.android.ugc.aweme.commercialize.loft.b.b d2 : this.f39083b.f39079f) {
                    d2.d();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/ugc/aweme/commercialize/loft/LoftNestedRefreshLayout$expand$4$1"}, k = 3, mv = {1, 1, 15})
    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39084a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoftNestedRefreshLayout f39085b;

        c(LoftNestedRefreshLayout loftNestedRefreshLayout) {
            this.f39085b = loftNestedRefreshLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f39084a, false, 31039, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f39084a, false, 31039, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            LoftNestedRefreshLayout loftNestedRefreshLayout = this.f39085b;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                loftNestedRefreshLayout.a(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/LoftNestedRefreshLayout$expand$4$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39086a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoftNestedRefreshLayout f39087b;

        d(LoftNestedRefreshLayout loftNestedRefreshLayout) {
            this.f39087b = loftNestedRefreshLayout;
        }

        public final void onAnimationStart(@Nullable Animator animator) {
            this.f39087b.f39076c = true;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f39086a, false, 31040, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f39086a, false, 31040, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f39087b.f39076c = false;
            for (com.ss.android.ugc.aweme.commercialize.loft.b.b b2 : this.f39087b.f39079f) {
                b2.b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/LoftNestedRefreshLayout$iDamping$1", "Lcom/ss/android/ugc/aweme/commercialize/loft/listener/IDamping;", "getChangedY", "", "diffX", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements com.ss.android.ugc.aweme.commercialize.loft.b.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39088a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoftNestedRefreshLayout f39089b;

        e(LoftNestedRefreshLayout loftNestedRefreshLayout) {
            this.f39089b = loftNestedRefreshLayout;
        }

        public final float a(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f39088a, false, 31041, new Class[]{Float.TYPE}, Float.TYPE)) {
                return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f39088a, false, 31041, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
            }
            Object value = this.f39089b.getTotalConsume().getValue();
            if (value == null) {
                Intrinsics.throwNpe();
            }
            return ((float) Math.pow(0.9950248756218907d, (double) ((Number) value).floatValue())) * f2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/ugc/aweme/commercialize/loft/LoftNestedRefreshLayout$isRefreshing$1$1"}, k = 3, mv = {1, 1, 15})
    static final class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39090a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoftNestedRefreshLayout f39091b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f39092c;

        f(LoftNestedRefreshLayout loftNestedRefreshLayout, boolean z) {
            this.f39091b = loftNestedRefreshLayout;
            this.f39092c = z;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f39090a, false, 31042, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f39090a, false, 31042, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            LoftNestedRefreshLayout loftNestedRefreshLayout = this.f39091b;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                loftNestedRefreshLayout.a(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/LoftNestedRefreshLayout$isRefreshing$1$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39093a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoftNestedRefreshLayout f39094b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f39095c;

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f39093a, false, 31044, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f39093a, false, 31044, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            if (!this.f39094b.f39078e) {
                this.f39094b.f39078e = this.f39095c;
                com.ss.android.ugc.aweme.commercialize.loft.b.d iRefresh = this.f39094b.getIRefresh();
                if (iRefresh != null) {
                    iRefresh.f();
                }
            }
        }

        public final void onAnimationStart(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f39093a, false, 31043, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f39093a, false, 31043, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commercialize.loft.b.d iRefresh = this.f39094b.getIRefresh();
            if (iRefresh != null) {
                iRefresh.e();
            }
        }

        g(LoftNestedRefreshLayout loftNestedRefreshLayout, boolean z) {
            this.f39094b = loftNestedRefreshLayout;
            this.f39095c = z;
        }
    }

    @JvmOverloads
    public LoftNestedRefreshLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public LoftNestedRefreshLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final boolean getEnableExpand() {
        return this.n;
    }

    public final boolean getExpand() {
        return this.q;
    }

    @NotNull
    public final com.ss.android.ugc.aweme.commercialize.loft.b.a getIDamping() {
        return this.r;
    }

    @Nullable
    public final com.ss.android.ugc.aweme.commercialize.loft.b.d getIRefresh() {
        return this.s;
    }

    public final boolean getReturningToStart() {
        return this.j;
    }

    @NotNull
    public final MutableLiveData<Float> getTotalConsume() {
        return this.k;
    }

    @NotNull
    public final ViewGroup getHeaderView() {
        if (PatchProxy.isSupport(new Object[0], this, f39074a, false, 31009, new Class[0], ViewGroup.class)) {
            return (ViewGroup) PatchProxy.accessDispatch(new Object[0], this, f39074a, false, 31009, new Class[0], ViewGroup.class);
        }
        ViewGroup viewGroup = this.f39075b;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        return viewGroup;
    }

    public final int getNestedScrollAxes() {
        if (PatchProxy.isSupport(new Object[0], this, f39074a, false, 31018, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f39074a, false, 31018, new Class[0], Integer.TYPE)).intValue();
        } else if (Build.VERSION.SDK_INT >= 21) {
            return super.getNestedScrollAxes();
        } else {
            return this.g.getNestedScrollAxes();
        }
    }

    private final void a() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f39074a, false, 31019, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39074a, false, 31019, new Class[0], Void.TYPE);
            return;
        }
        if (this.i == null) {
            int childCount = getChildCount();
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                ViewGroup viewGroup = this.f39075b;
                if (viewGroup == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                if (!(!Intrinsics.areEqual((Object) childAt, (Object) viewGroup)) || !(!Intrinsics.areEqual((Object) childAt, (Object) this.h))) {
                    i2++;
                } else {
                    this.i = childAt;
                    return;
                }
            }
        }
    }

    private final void b() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f39074a, false, 31020, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39074a, false, 31020, new Class[0], Void.TYPE);
            return;
        }
        if (this.h == null) {
            int childCount = getChildCount();
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                ViewGroup viewGroup = this.f39075b;
                if (viewGroup == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                if (!(!Intrinsics.areEqual((Object) childAt, (Object) viewGroup)) || !(!Intrinsics.areEqual((Object) childAt, (Object) this.i))) {
                    i2++;
                } else {
                    this.h = childAt;
                    return;
                }
            }
        }
    }

    private final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f39074a, false, 31024, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f39074a, false, 31024, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (getChildCount() > 3 || getChildCount() != 3) {
            return false;
        } else {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                ViewGroup viewGroup = this.f39075b;
                if (viewGroup == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                if (Intrinsics.areEqual((Object) childAt, (Object) viewGroup) || Intrinsics.areEqual((Object) getChildAt(i3), (Object) this.i) || Intrinsics.areEqual((Object) getChildAt(i3), (Object) this.h)) {
                    i2++;
                }
            }
            if (i2 == 3) {
                z = true;
            }
            return z;
        }
    }

    public final void setEnableExpand(boolean z) {
        this.n = z;
    }

    public final void setIRefresh(@Nullable com.ss.android.ugc.aweme.commercialize.loft.b.d dVar) {
        this.s = dVar;
    }

    public final void setReturningToStart(boolean z) {
        this.j = z;
    }

    public final void setHeaderView(@NotNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f39074a, false, 31010, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f39074a, false, 31010, new Class[]{ViewGroup.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "<set-?>");
        this.f39075b = viewGroup2;
    }

    public final void setIDamping(@NotNull com.ss.android.ugc.aweme.commercialize.loft.b.a aVar) {
        com.ss.android.ugc.aweme.commercialize.loft.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f39074a, false, 31017, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f39074a, false, 31017, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.b.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "<set-?>");
        this.r = aVar2;
    }

    public final void setTotalConsume(@NotNull MutableLiveData<Float> mutableLiveData) {
        MutableLiveData<Float> mutableLiveData2 = mutableLiveData;
        if (PatchProxy.isSupport(new Object[]{mutableLiveData2}, this, f39074a, false, 31015, new Class[]{MutableLiveData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mutableLiveData2}, this, f39074a, false, 31015, new Class[]{MutableLiveData.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(mutableLiveData2, "<set-?>");
        this.k = mutableLiveData2;
    }

    public final void setEnabled(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39074a, false, 31008, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39074a, false, 31008, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setEnabled(z);
        e.a aVar = com.ss.android.ugc.aweme.commercialize.loft.model.e.m;
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        ((com.ss.android.ugc.aweme.commercialize.loft.model.e) aVar.a(context)).f39243e = z;
    }

    public final void setHeader(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f39074a, false, 31011, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f39074a, false, 31011, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        ViewGroup viewGroup = this.f39075b;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        viewGroup.removeAllViews();
        ViewGroup viewGroup2 = this.f39075b;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        viewGroup2.addView(view);
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f39074a, false, 31022, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f39074a, false, 31022, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (f2 >= 0.0f) {
            ViewGroup viewGroup = this.f39075b;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            viewGroup.setTranslationY(f2);
            View view = this.i;
            if (view != null) {
                view.setTranslationY(f2);
            }
            this.k.setValue(Float.valueOf(f2));
        }
    }

    public final void onStopNestedScroll(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f39074a, false, 31028, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f39074a, false, 31028, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "child");
        this.g.onStopNestedScroll(view);
        if (this.l) {
            this.l = false;
            if (!Intrinsics.areEqual((Float) this.k.getValue(), 0.0f)) {
                boolean z = this.n;
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39074a, false, 31023, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39074a, false, 31023, new Class[]{Boolean.TYPE}, Void.TYPE);
                    return;
                }
                if (!this.f39078e) {
                    Object value = this.k.getValue();
                    if (value == null) {
                        Intrinsics.throwNpe();
                    }
                    if (((Number) value).floatValue() < this.o) {
                        Object value2 = this.k.getValue();
                        if (value2 == null) {
                            Intrinsics.throwNpe();
                        }
                        if (((Number) value2).floatValue() >= this.p) {
                            Object value3 = this.k.getValue();
                            if (value3 == null) {
                                Intrinsics.throwNpe();
                            }
                            if (((Number) value3).floatValue() < this.o) {
                                setRefreshing(true);
                                return;
                            }
                        }
                        setExpand(false);
                    } else if (z) {
                        setExpand(true);
                    } else {
                        setRefreshing(true);
                    }
                }
            }
        }
    }

    public final void setRefreshing(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39074a, false, 31012, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39074a, false, 31012, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            ValueAnimator valueAnimator = this.m;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.m;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
            }
            float[] fArr = new float[2];
            Object value = this.k.getValue();
            if (value == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(value, "totalConsume.value!!");
            fArr[0] = ((Number) value).floatValue();
            fArr[1] = this.p;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.setDuration(50);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new f(this, z));
            ofFloat.addListener(new g(this, z));
            ofFloat.start();
            this.m = ofFloat;
        } else {
            if (this.f39078e) {
                this.f39078e = z;
                this.f39077d = true;
                setExpand(false);
            }
        }
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.commercialize.loft.b.b bVar) {
        com.ss.android.ugc.aweme.commercialize.loft.b.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f39074a, false, 31013, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f39074a, false, 31013, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.b.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "listener");
        this.f39079f.add(bVar2);
    }

    public final void setExpand(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39074a, false, 31016, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39074a, false, 31016, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.q = z;
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.m;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
        }
        if (!z) {
            for (com.ss.android.ugc.aweme.commercialize.loft.b.b c2 : this.f39079f) {
                c2.c();
            }
            float[] fArr = new float[2];
            Object value = this.k.getValue();
            if (value == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(value, "totalConsume.value!!");
            fArr[0] = ((Number) value).floatValue();
            fArr[1] = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new a(this));
            ofFloat.addListener(new b(this));
            ofFloat.start();
            this.m = ofFloat;
            return;
        }
        if (z) {
            for (com.ss.android.ugc.aweme.commercialize.loft.b.b a2 : this.f39079f) {
                a2.a();
            }
            float[] fArr2 = new float[2];
            Object value2 = this.k.getValue();
            if (value2 == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(value2, "totalConsume.value!!");
            fArr2[0] = ((Number) value2).floatValue();
            int measuredHeight = getMeasuredHeight();
            View view = this.h;
            if (view == null) {
                Intrinsics.throwNpe();
            }
            fArr2[1] = (float) (measuredHeight - view.getMeasuredHeight());
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.addUpdateListener(new c(this));
            ofFloat2.addListener(new d(this));
            ofFloat2.start();
            this.m = ofFloat2;
        }
    }

    public final void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f39074a, false, 31025, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f39074a, false, 31025, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        if (this.h == null) {
            b();
        }
        if (this.i == null) {
            a();
        }
        if (c()) {
            ViewGroup viewGroup = this.f39075b;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            measureChild(viewGroup, i2, i3);
            measureChild(this.h, i2, i3);
            int size = View.MeasureSpec.getSize(i3);
            View view = this.h;
            if (view == null) {
                Intrinsics.throwNpe();
            }
            measureChild(this.i, i2, View.MeasureSpec.makeMeasureSpec(size - view.getMeasuredHeight(), View.MeasureSpec.getMode(i3)));
            return;
        }
        throw new AndroidRuntimeException("Only can have one child view");
    }

    public final void onNestedScrollAccepted(@NotNull View view, @NotNull View view2, int i2) {
        View view3 = view;
        View view4 = view2;
        if (PatchProxy.isSupport(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f39074a, false, 31027, new Class[]{View.class, View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f39074a, false, 31027, new Class[]{View.class, View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view3, "child");
        Intrinsics.checkParameterIsNotNull(view4, "target");
        if (Build.VERSION.SDK_INT >= 21) {
            super.onNestedScrollAccepted(view, view2, i2);
        } else {
            this.g.onNestedScrollAccepted(view3, view4, i2);
        }
    }

    public final boolean onStartNestedScroll(@NotNull View view, @NotNull View view2, int i2) {
        View view3 = view;
        View view4 = view2;
        if (PatchProxy.isSupport(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f39074a, false, 31029, new Class[]{View.class, View.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f39074a, false, 31029, new Class[]{View.class, View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(view3, "child");
        Intrinsics.checkParameterIsNotNull(view4, "target");
        if (!isEnabled() || (i2 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoftNestedRefreshLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.g = new NestedScrollingParentHelper(this);
        if (PatchProxy.isSupport(new Object[0], this, f39074a, false, 31021, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39074a, false, 31021, new Class[0], Void.TYPE);
        } else {
            this.f39075b = new LinearLayout(getContext());
            ViewGroup viewGroup = this.f39075b;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            viewGroup.setBackgroundResource(C0906R.color.yx);
            ViewGroup viewGroup2 = this.f39075b;
            if (viewGroup2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            viewGroup2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            ViewGroup viewGroup3 = this.f39075b;
            if (viewGroup3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            addView(viewGroup3, 0);
        }
        setEnabled(false);
        this.f39079f = new ArrayList<>();
        MutableLiveData<Float> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Float.valueOf(0.0f));
        this.k = mutableLiveData;
        this.o = (float) u.a(120.0d);
        this.p = (float) u.a(60.0d);
        this.r = new e(this);
    }

    public final boolean onNestedPreFling(@NotNull View view, float f2, float f3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f39074a, false, 31033, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f39074a, false, 31033, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(view2, "target");
        Float f4 = (Float) this.k.getValue();
        if (f4 == null) {
            f4 = Float.valueOf(0.0f);
        }
        if (f4.floatValue() > 0.0f) {
            return true;
        }
        return false;
    }

    public final boolean onNestedFling(@NotNull View view, float f2, float f3, boolean z) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z ? (byte) 1 : 0)}, this, f39074a, false, 31032, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z)}, this, f39074a, false, 31032, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(view2, "target");
        Float f4 = (Float) this.k.getValue();
        if (f4 == null) {
            f4 = Float.valueOf(0.0f);
        }
        if (f4.floatValue() > 0.0f) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedPreScroll(@org.jetbrains.annotations.NotNull android.view.View r16, int r17, int r18, @org.jetbrains.annotations.NotNull int[] r19) {
        /*
            r15 = this;
            r7 = r15
            r8 = r16
            r9 = r19
            r10 = 4
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r12 = 1
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r13 = 2
            r0[r13] = r1
            r14 = 3
            r0[r14] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f39074a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 31030(0x7936, float:4.3482E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x006c
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r13] = r1
            r0[r14] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f39074a
            r3 = 0
            r4 = 31030(0x7936, float:4.3482E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x006c:
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.lang.String r0 = "consumed"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            r7.l = r12
            if (r18 <= 0) goto L_0x00b4
            android.arch.lifecycle.MutableLiveData<java.lang.Float> r0 = r7.k
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x0085
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0085:
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r1 = 0
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 <= 0) goto L_0x00b4
            android.arch.lifecycle.MutableLiveData<java.lang.Float> r0 = r7.k
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x009d
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x009d:
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            com.ss.android.ugc.aweme.commercialize.loft.b.a r1 = r7.r
            int r2 = java.lang.Math.abs(r18)
            float r2 = (float) r2
            float r1 = r1.a(r2)
            float r0 = r0 - r1
            r9[r12] = r18
            r15.a((float) r0)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout.onNestedPreScroll(android.view.View, int, int, int[]):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoftNestedRefreshLayout(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    public final void onNestedScroll(@NotNull View view, int i2, int i3, int i4, int i5) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f39074a, false, 31031, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f39074a, false, 31031, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "target");
        this.l = true;
        if (i5 < 0) {
            Object value = this.k.getValue();
            if (value == null) {
                Intrinsics.throwNpe();
            }
            float floatValue = ((Number) value).floatValue() + this.r.a((float) Math.abs(i5));
            if ((this.f39078e && floatValue <= this.p) || !this.f39078e) {
                a(floatValue);
            }
        }
    }

    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f39074a, false, 31026, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f39074a, false, 31026, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        ViewGroup viewGroup = this.f39075b;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        int paddingLeft = getPaddingLeft();
        View view = this.h;
        if (view == null) {
            Intrinsics.throwNpe();
        }
        int measuredHeight = view.getMeasuredHeight();
        ViewGroup viewGroup2 = this.f39075b;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        int measuredHeight2 = measuredHeight - viewGroup2.getMeasuredHeight();
        int paddingLeft2 = getPaddingLeft();
        ViewGroup viewGroup3 = this.f39075b;
        if (viewGroup3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        int measuredWidth = paddingLeft2 + viewGroup3.getMeasuredWidth();
        View view2 = this.h;
        if (view2 == null) {
            Intrinsics.throwNpe();
        }
        viewGroup.layout(paddingLeft, measuredHeight2, measuredWidth, view2.getMeasuredHeight());
        View view3 = this.h;
        if (view3 == null) {
            Intrinsics.throwNpe();
        }
        int paddingLeft3 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingLeft4 = getPaddingLeft();
        View view4 = this.h;
        if (view4 == null) {
            Intrinsics.throwNpe();
        }
        int measuredWidth2 = paddingLeft4 + view4.getMeasuredWidth();
        int paddingTop2 = getPaddingTop();
        View view5 = this.h;
        if (view5 == null) {
            Intrinsics.throwNpe();
        }
        view3.layout(paddingLeft3, paddingTop, measuredWidth2, paddingTop2 + view5.getMeasuredHeight());
        View view6 = this.i;
        if (view6 == null) {
            Intrinsics.throwNpe();
        }
        int paddingLeft5 = getPaddingLeft();
        int paddingTop3 = getPaddingTop();
        View view7 = this.h;
        if (view7 == null) {
            Intrinsics.throwNpe();
        }
        int measuredHeight3 = paddingTop3 + view7.getMeasuredHeight();
        int paddingLeft6 = getPaddingLeft();
        View view8 = this.i;
        if (view8 == null) {
            Intrinsics.throwNpe();
        }
        int measuredWidth3 = paddingLeft6 + view8.getMeasuredWidth();
        int paddingTop4 = getPaddingTop();
        View view9 = this.h;
        if (view9 == null) {
            Intrinsics.throwNpe();
        }
        int measuredHeight4 = paddingTop4 + view9.getMeasuredHeight();
        View view10 = this.i;
        if (view10 == null) {
            Intrinsics.throwNpe();
        }
        view6.layout(paddingLeft5, measuredHeight3, measuredWidth3, measuredHeight4 + view10.getMeasuredHeight());
    }
}
