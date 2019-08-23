package com.ss.android.ugc.aweme.comment.widget;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.support.v4.util.Pools;
import android.support.v4.view.NestedScrollingChild;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.ScrollingView;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.views.FpsRecyclerView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0015\n\u0002\b\u0012*\u0002\u00127\u0018\u0000 2\u00020\u00012\u00020\u0002:\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001a\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020\u000b2\b\b\u0002\u0010S\u001a\u00020\u000bH\u0002J\u0006\u0010T\u001a\u00020PJ\u000e\u0010U\u001a\u00020P2\u0006\u0010V\u001a\u00020\u000bJ\u0010\u0010W\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020YH\u0016J\u0012\u0010Z\u001a\u0004\u0018\u00010)2\u0006\u0010[\u001a\u00020)H\u0002J\b\u0010\\\u001a\u00020\bH\u0016J\u0010\u0010]\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020YH\u0002J\u0010\u0010_\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020YH\u0002J\u0018\u0010`\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020)2\u0006\u0010^\u001a\u00020YH\u0002J\u0010\u0010a\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020YH\u0016J\u0018\u0010b\u001a\u00020P2\u0006\u0010c\u001a\u00020\b2\u0006\u0010d\u001a\u00020\bH\u0014J(\u0010e\u001a\u00020\u000b2\u0006\u0010f\u001a\u00020)2\u0006\u0010g\u001a\u00020\u00102\u0006\u0010h\u001a\u00020\u00102\u0006\u0010i\u001a\u00020\u000bH\u0016J \u0010j\u001a\u00020\u000b2\u0006\u0010f\u001a\u00020)2\u0006\u0010g\u001a\u00020\u00102\u0006\u0010h\u001a\u00020\u0010H\u0016J(\u0010k\u001a\u00020P2\u0006\u0010f\u001a\u00020)2\u0006\u0010l\u001a\u00020\b2\u0006\u0010m\u001a\u00020\b2\u0006\u0010i\u001a\u00020nH\u0016J0\u0010o\u001a\u00020P2\u0006\u0010f\u001a\u00020)2\u0006\u0010p\u001a\u00020\b2\u0006\u0010q\u001a\u00020\b2\u0006\u0010r\u001a\u00020\b2\u0006\u0010s\u001a\u00020\bH\u0016J \u0010t\u001a\u00020P2\u0006\u0010u\u001a\u00020)2\u0006\u0010f\u001a\u00020)2\u0006\u0010v\u001a\u00020\bH\u0016J \u0010w\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020)2\u0006\u0010f\u001a\u00020)2\u0006\u0010x\u001a\u00020\bH\u0016J\u0010\u0010y\u001a\u00020P2\u0006\u0010u\u001a\u00020)H\u0016J\u0010\u0010z\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020YH\u0017J\b\u0010{\u001a\u00020PH\u0002J\u001c\u0010|\u001a\u00020P2\u0014\u0010}\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020P\u0018\u00010OJ\u0006\u0010~\u001a\u00020PR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0014\u0010\r\u001a\u00020\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001b\u0010%\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b&\u0010\"R#\u0010(\u001a\n **\u0004\u0018\u00010)0)8BX\u0002¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b+\u0010,R\u000e\u0010.\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R#\u00100\u001a\n **\u0004\u0018\u000101018BX\u0002¢\u0006\f\n\u0004\b4\u0010$\u001a\u0004\b2\u00103R\u000e\u00105\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u000207X\u0004¢\u0006\u0004\n\u0002\u00108R\u000e\u00109\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R+\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b8B@BX\u0002¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b<\u0010\f\"\u0004\b=\u0010\u001cR\u001b\u0010@\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\bC\u0010$\u001a\u0004\bA\u0010BR#\u0010D\u001a\n **\u0004\u0018\u00010E0E8BX\u0002¢\u0006\f\n\u0004\bH\u0010$\u001a\u0004\bF\u0010GR#\u0010I\u001a\n **\u0004\u0018\u00010J0J8BX\u0002¢\u0006\f\n\u0004\bM\u0010$\u001a\u0004\bK\u0010LR\u001c\u0010N\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020P\u0018\u00010OX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/ss/android/ugc/aweme/comment/widget/CommentNestedLayout;", "Landroid/widget/LinearLayout;", "Landroid/support/v4/view/NestedScrollingParent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isVisible", "", "()Z", "mAnimating", "getMAnimating", "mDeltaY", "", "mDismissAnimationListener", "com/ss/android/ugc/aweme/comment/widget/CommentNestedLayout$mDismissAnimationListener$1", "Lcom/ss/android/ugc/aweme/comment/widget/CommentNestedLayout$mDismissAnimationListener$1;", "mDownWhenAnimating", "mDownX", "mDownY", "mHeight", "mIsClosing", "value", "mIsFocus", "setMIsFocus", "(Z)V", "mIsOpening", "mLastX", "mLastY", "mMaximumVelocity", "getMMaximumVelocity", "()F", "mMaximumVelocity$delegate", "Lkotlin/Lazy;", "mMinimumVelocity", "getMMinimumVelocity", "mMinimumVelocity$delegate", "mPlaceholder", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getMPlaceholder", "()Landroid/view/View;", "mPlaceholder$delegate", "mRawLastY", "mScrolling", "mScrollingChild", "Lcom/ss/android/ugc/aweme/views/FpsRecyclerView;", "getMScrollingChild", "()Lcom/ss/android/ugc/aweme/views/FpsRecyclerView;", "mScrollingChild$delegate", "mScrollingChildAllShown", "mShowAnimationListener", "com/ss/android/ugc/aweme/comment/widget/CommentNestedLayout$mShowAnimationListener$1", "Lcom/ss/android/ugc/aweme/comment/widget/CommentNestedLayout$mShowAnimationListener$1;", "mTouchPlaceholderChild", "<set-?>", "mTouchScrollingChild", "getMTouchScrollingChild", "setMTouchScrollingChild", "mTouchScrollingChild$delegate", "Lkotlin/properties/ReadWriteProperty;", "mTouchSlop", "getMTouchSlop", "()I", "mTouchSlop$delegate", "mVelocityTracker", "Landroid/view/VelocityTracker;", "getMVelocityTracker", "()Landroid/view/VelocityTracker;", "mVelocityTracker$delegate", "mViewConfiguration", "Landroid/view/ViewConfiguration;", "getMViewConfiguration", "()Landroid/view/ViewConfiguration;", "mViewConfiguration$delegate", "mVisibleChangedListener", "Lkotlin/Function1;", "", "animateToVisible", "visible", "completeAnimate", "dismiss", "dismissImmediately", "needCallback", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "findScrollingChild", "view", "getNestedScrollAxes", "isInPlaceholderChild", "event", "isInScrollingChild", "isInView", "onInterceptTouchEvent", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onNestedFling", "target", "velocityX", "velocityY", "consumed", "onNestedPreFling", "onNestedPreScroll", "dx", "dy", "", "onNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "onNestedScrollAccepted", "child", "axis", "onStartNestedScroll", "nestedScrollAxes", "onStopNestedScroll", "onTouchEvent", "reset", "setVisibleChangedListener", "listener", "show", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CommentNestedLayout extends LinearLayout implements NestedScrollingParent {
    private static final Pools.SynchronizedPool<Rect> C = new Pools.SynchronizedPool<>(12);

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36636a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f36637b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommentNestedLayout.class), "mViewConfiguration", "getMViewConfiguration()Landroid/view/ViewConfiguration;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommentNestedLayout.class), "mTouchSlop", "getMTouchSlop()I")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommentNestedLayout.class), "mMinimumVelocity", "getMMinimumVelocity()F")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommentNestedLayout.class), "mMaximumVelocity", "getMMaximumVelocity()F")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommentNestedLayout.class), "mVelocityTracker", "getMVelocityTracker()Landroid/view/VelocityTracker;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommentNestedLayout.class), "mTouchScrollingChild", "getMTouchScrollingChild()Z")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommentNestedLayout.class), "mPlaceholder", "getMPlaceholder()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommentNestedLayout.class), "mScrollingChild", "getMScrollingChild()Lcom/ss/android/ugc/aweme/views/FpsRecyclerView;"))};
    public static final b i = new b((byte) 0);
    private final h A;
    private final c B;

    /* renamed from: c  reason: collision with root package name */
    public float f36638c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f36639d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f36640e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f36641f;
    public boolean g;
    public Function1<? super Boolean, Unit> h;
    private final Lazy j;
    private final Lazy k;
    private final Lazy l;
    private final Lazy m;
    private final Lazy n;
    private boolean o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private boolean v;
    private final ReadWriteProperty w;
    private final Lazy x;
    private boolean y;
    private final Lazy z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class a extends ObservableProperty<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f36645b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CommentNestedLayout f36646c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, CommentNestedLayout commentNestedLayout) {
            super(obj2);
            this.f36645b = obj;
            this.f36646c = commentNestedLayout;
        }

        public final void afterChange(@NotNull KProperty<?> kProperty, Boolean bool, Boolean bool2) {
            KProperty<?> kProperty2 = kProperty;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{kProperty2, bool, bool2}, this, f36644a, false, 27835, new Class[]{KProperty.class, Object.class, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{kProperty2, bool, bool2}, this, f36644a, false, 27835, new Class[]{KProperty.class, Object.class, Object.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(kProperty, "property");
            if (bool2.booleanValue() ^ bool.booleanValue()) {
                CommentNestedLayout commentNestedLayout = this.f36646c;
                if (this.f36646c.getMScrollingChild().computeVerticalScrollExtent() >= this.f36646c.getMScrollingChild().computeVerticalScrollRange()) {
                    z = true;
                }
                commentNestedLayout.f36639d = z;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/comment/widget/CommentNestedLayout$Companion;", "", "()V", "DURATION", "", "HEIGHT_DEFAULT", "", "VELOCITY_UNIT", "", "sRectPool", "Landroid/support/v4/util/Pools$SynchronizedPool;", "Landroid/graphics/Rect;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/comment/widget/CommentNestedLayout$mDismissAnimationListener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36647a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentNestedLayout f36648b;

        public final void onAnimationCancel(@Nullable Animator animator) {
        }

        public final void onAnimationRepeat(@Nullable Animator animator) {
        }

        c(CommentNestedLayout commentNestedLayout) {
            this.f36648b = commentNestedLayout;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f36647a, false, 27837, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f36647a, false, 27837, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f36648b.f36640e = false;
            this.f36648b.setVisibility(8);
            this.f36648b.b();
            this.f36648b.setMIsFocus(false);
        }

        public final void onAnimationStart(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f36647a, false, 27838, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f36647a, false, 27838, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            if (this.f36648b.f36641f || (!this.f36648b.f36640e && this.f36648b.getTranslationY() <= this.f36648b.f36638c)) {
                Function1<? super Boolean, Unit> function1 = this.f36648b.h;
                if (function1 != null) {
                    function1.invoke(Boolean.FALSE);
                }
            }
            this.f36648b.f36640e = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<Float> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ CommentNestedLayout this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(CommentNestedLayout commentNestedLayout) {
            super(0);
            this.this$0 = commentNestedLayout;
        }

        public final float invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27839, new Class[0], Float.TYPE)) {
                return ((Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27839, new Class[0], Float.TYPE)).floatValue();
            }
            ViewConfiguration mViewConfiguration = this.this$0.getMViewConfiguration();
            Intrinsics.checkExpressionValueIsNotNull(mViewConfiguration, "mViewConfiguration");
            return (float) mViewConfiguration.getScaledMaximumFlingVelocity();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<Float> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ CommentNestedLayout this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(CommentNestedLayout commentNestedLayout) {
            super(0);
            this.this$0 = commentNestedLayout;
        }

        public final float invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27840, new Class[0], Float.TYPE)) {
                return ((Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27840, new Class[0], Float.TYPE)).floatValue();
            }
            ViewConfiguration mViewConfiguration = this.this$0.getMViewConfiguration();
            Intrinsics.checkExpressionValueIsNotNull(mViewConfiguration, "mViewConfiguration");
            return (float) mViewConfiguration.getScaledMinimumFlingVelocity();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ CommentNestedLayout this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/comment/widget/CommentNestedLayout$mPlaceholder$2$1$1"}, k = 3, mv = {1, 1, 15})
        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36649a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f36650b;

            a(f fVar) {
                this.f36650b = fVar;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f36649a, false, 27842, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f36649a, false, 27842, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                this.f36650b.this$0.dismiss();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(CommentNestedLayout commentNestedLayout) {
            super(0);
            this.this$0 = commentNestedLayout;
        }

        public final View invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27841, new Class[0], View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27841, new Class[0], View.class);
            }
            View findViewById = this.this$0.findViewById(C0906R.id.vh);
            findViewById.setOnClickListener(new a(this));
            return findViewById;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/views/FpsRecyclerView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<FpsRecyclerView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ CommentNestedLayout this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(CommentNestedLayout commentNestedLayout) {
            super(0);
            this.this$0 = commentNestedLayout;
        }

        public final FpsRecyclerView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27843, new Class[0], FpsRecyclerView.class)) {
                return (FpsRecyclerView) this.this$0.findViewById(C0906R.id.cc5);
            }
            return (FpsRecyclerView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27843, new Class[0], FpsRecyclerView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/comment/widget/CommentNestedLayout$mShowAnimationListener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36651a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentNestedLayout f36652b;

        public final void onAnimationCancel(@Nullable Animator animator) {
        }

        public final void onAnimationRepeat(@Nullable Animator animator) {
        }

        h(CommentNestedLayout commentNestedLayout) {
            this.f36652b = commentNestedLayout;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f36651a, false, 27844, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f36651a, false, 27844, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f36652b.f36641f = false;
            this.f36652b.b();
            this.f36652b.setMIsFocus(true);
        }

        public final void onAnimationStart(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f36651a, false, 27845, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f36651a, false, 27845, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            if (!this.f36652b.a()) {
                Function1<? super Boolean, Unit> function1 = this.f36652b.h;
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                }
            }
            this.f36652b.setVisibility(0);
            this.f36652b.f36641f = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function0<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ CommentNestedLayout this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(CommentNestedLayout commentNestedLayout) {
            super(0);
            this.this$0 = commentNestedLayout;
        }

        public final int invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27846, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27846, new Class[0], Integer.TYPE)).intValue();
            }
            ViewConfiguration mViewConfiguration = this.this$0.getMViewConfiguration();
            Intrinsics.checkExpressionValueIsNotNull(mViewConfiguration, "mViewConfiguration");
            return mViewConfiguration.getScaledTouchSlop();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/VelocityTracker;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function0<VelocityTracker> {
        public static final j INSTANCE = new j();
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
            super(0);
        }

        public final VelocityTracker invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27847, new Class[0], VelocityTracker.class)) {
                return VelocityTracker.obtain();
            }
            return (VelocityTracker) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27847, new Class[0], VelocityTracker.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/ViewConfiguration;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function0<ViewConfiguration> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(Context context) {
            super(0);
            this.$context = context;
        }

        public final ViewConfiguration invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27848, new Class[0], ViewConfiguration.class)) {
                return ViewConfiguration.get(this.$context);
            }
            return (ViewConfiguration) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27848, new Class[0], ViewConfiguration.class);
        }
    }

    @JvmOverloads
    public CommentNestedLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public CommentNestedLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final float getMMaximumVelocity() {
        if (!PatchProxy.isSupport(new Object[0], this, f36636a, false, 27806, new Class[0], Float.TYPE)) {
            return ((Number) this.m.getValue()).floatValue();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f36636a, false, 27806, new Class[0], Float.TYPE)).floatValue();
    }

    private final float getMMinimumVelocity() {
        if (!PatchProxy.isSupport(new Object[0], this, f36636a, false, 27805, new Class[0], Float.TYPE)) {
            return ((Number) this.l.getValue()).floatValue();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f36636a, false, 27805, new Class[0], Float.TYPE)).floatValue();
    }

    private final View getMPlaceholder() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f36636a, false, 27810, new Class[0], View.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f36636a, false, 27810, new Class[0], View.class);
        } else {
            value = this.x.getValue();
        }
        return (View) value;
    }

    private final boolean getMTouchScrollingChild() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f36636a, false, 27808, new Class[0], Boolean.TYPE)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f36636a, false, 27808, new Class[0], Boolean.TYPE);
        } else {
            value = this.w.getValue(this, f36637b[5]);
        }
        return ((Boolean) value).booleanValue();
    }

    private final int getMTouchSlop() {
        if (!PatchProxy.isSupport(new Object[0], this, f36636a, false, 27804, new Class[0], Integer.TYPE)) {
            return ((Number) this.k.getValue()).intValue();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f36636a, false, 27804, new Class[0], Integer.TYPE)).intValue();
    }

    private final VelocityTracker getMVelocityTracker() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f36636a, false, 27807, new Class[0], VelocityTracker.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f36636a, false, 27807, new Class[0], VelocityTracker.class);
        } else {
            value = this.n.getValue();
        }
        return (VelocityTracker) value;
    }

    private final void setMTouchScrollingChild(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f36636a, false, 27809, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f36636a, false, 27809, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.w.setValue(this, f36637b[5], Boolean.valueOf(z2));
    }

    public final FpsRecyclerView getMScrollingChild() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f36636a, false, 27811, new Class[0], FpsRecyclerView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f36636a, false, 27811, new Class[0], FpsRecyclerView.class);
        } else {
            value = this.z.getValue();
        }
        return (FpsRecyclerView) value;
    }

    public final ViewConfiguration getMViewConfiguration() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f36636a, false, 27803, new Class[0], ViewConfiguration.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f36636a, false, 27803, new Class[0], ViewConfiguration.class);
        } else {
            value = this.j.getValue();
        }
        return (ViewConfiguration) value;
    }

    public final int getNestedScrollAxes() {
        return 0;
    }

    public final boolean onNestedFling(@NotNull View view, float f2, float f3, boolean z2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f36636a, false, 27826, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z2)}, this, f36636a, false, 27826, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(view2, "target");
        return false;
    }

    public final void onNestedScroll(@NotNull View view, int i2, int i3, int i4, int i5) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f36636a, false, 27825, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f36636a, false, 27825, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "target");
    }

    public final void onNestedScrollAccepted(@NotNull View view, @NotNull View view2, int i2) {
        View view3 = view;
        View view4 = view2;
        if (PatchProxy.isSupport(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f36636a, false, 27824, new Class[]{View.class, View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f36636a, false, 27824, new Class[]{View.class, View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view3, "child");
        Intrinsics.checkParameterIsNotNull(view4, "target");
    }

    private final boolean getMAnimating() {
        if (this.f36640e || this.f36641f) {
            return true;
        }
        return false;
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f36636a, false, 27802, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f36636a, false, 27802, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f36641f || (!this.f36640e && getTranslationY() < this.f36638c)) {
            return true;
        } else {
            return false;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f36636a, false, 27827, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36636a, false, 27827, new Class[0], Void.TYPE);
            return;
        }
        this.v = false;
        setMTouchScrollingChild(false);
        this.y = false;
        this.u = 0.0f;
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f36636a, false, 27814, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36636a, false, 27814, new Class[0], Void.TYPE);
            return;
        }
        a(false, true);
    }

    public final void setVisibleChangedListener(@Nullable Function1<? super Boolean, Unit> function1) {
        this.h = function1;
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f36636a, false, 27815, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f36636a, false, 27815, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2 && a()) {
            Function1<? super Boolean, Unit> function1 = this.h;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
        }
        setVisibility(8);
        b();
    }

    public final boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f36636a, false, 27816, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f36636a, false, 27816, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        if (motionEvent.getActionMasked() == 0) {
            this.o = getMAnimating();
        }
        if (this.o && !getMAnimating() && motionEvent.getActionMasked() == 2) {
            motionEvent.setAction(0);
            this.o = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void onStopNestedScroll(@NotNull View view) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, f36636a, false, 27821, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f36636a, false, 27821, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "child");
        if (getTranslationY() * 2.0f >= this.f36638c) {
            z2 = false;
        }
        a(z2, false);
    }

    public final void setMIsFocus(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f36636a, false, 27812, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f36636a, false, 27812, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.g ^ z2) {
            setFocusable(z2);
            setFocusableInTouchMode(z2);
            if (z2) {
                requestFocus();
            } else {
                clearFocus();
            }
            this.g = z2;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        boolean z2;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f36636a, false, 27819, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f36636a, false, 27819, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        switch (motionEvent.getActionMasked()) {
            case 1:
                VelocityTracker mVelocityTracker = getMVelocityTracker();
                mVelocityTracker.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, getMMaximumVelocity());
                if (Math.abs(mVelocityTracker.getYVelocity()) > getMMinimumVelocity() && !getMAnimating()) {
                    if (this.u < 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    a(z2, false);
                    z3 = true;
                }
                if (!z3) {
                    onStopNestedScroll(this);
                }
                b();
                break;
            case 2:
                if (!getMTouchScrollingChild()) {
                    getMVelocityTracker().addMovement(motionEvent);
                    float x2 = this.p - motionEvent.getX();
                    float y2 = this.q - motionEvent.getY();
                    if (this.v || Math.abs(y2) > ((float) getMTouchSlop())) {
                        this.v = true;
                        FpsRecyclerView mScrollingChild = getMScrollingChild();
                        Intrinsics.checkExpressionValueIsNotNull(mScrollingChild, "mScrollingChild");
                        onNestedPreScroll(mScrollingChild, (int) x2, (int) y2, new int[]{0, 0});
                    }
                    this.u = motionEvent.getRawY() - this.t;
                    this.t = motionEvent.getRawY();
                    break;
                }
                break;
            case 3:
                onStopNestedScroll(this);
                b();
                break;
        }
        return true;
    }

    public final boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f36636a, false, 27818, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f36636a, false, 27818, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        if (motionEvent.getActionMasked() == 0) {
            b();
            this.p = motionEvent.getX();
            this.r = this.p;
            this.q = motionEvent.getY();
            this.s = this.q;
            this.t = motionEvent.getRawY();
            getMVelocityTracker().clear();
            getMVelocityTracker().addMovement(motionEvent);
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f36636a, false, 27830, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f36636a, false, 27830, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else {
                View mPlaceholder = getMPlaceholder();
                Intrinsics.checkExpressionValueIsNotNull(mPlaceholder, "mPlaceholder");
                z2 = a(mPlaceholder, motionEvent);
            }
            this.y = z2;
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f36636a, false, 27831, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f36636a, false, 27831, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else {
                FpsRecyclerView mScrollingChild = getMScrollingChild();
                Intrinsics.checkExpressionValueIsNotNull(mScrollingChild, "mScrollingChild");
                z3 = a((View) mScrollingChild, motionEvent);
            }
            setMTouchScrollingChild(z3);
        }
        if (getMAnimating()) {
            return true;
        }
        if (getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 3) {
            b();
        }
        if (motionEvent.getActionMasked() == 1) {
            b();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                if (this.y) {
                    return false;
                }
                float y2 = this.s - motionEvent.getY();
                if (!getMTouchScrollingChild() && (this.v || Math.abs(y2) > ((float) getMTouchSlop()))) {
                    this.v = true;
                    return true;
                }
            }
        } else if (this.y) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f36636a, false, 27817, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f36636a, false, 27817, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        View mPlaceholder = getMPlaceholder();
        Intrinsics.checkExpressionValueIsNotNull(mPlaceholder, "mPlaceholder");
        this.f36638c = ((float) getMeasuredHeight()) - ((float) mPlaceholder.getMeasuredHeight());
    }

    private final boolean a(View view, MotionEvent motionEvent) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, motionEvent}, this, f36636a, false, 27832, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent}, this, f36636a, false, 27832, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (view.getVisibility() != 0) {
            return false;
        } else {
            Rect rect = (Rect) C.acquire();
            if (rect == null) {
                rect = new Rect();
            }
            Rect rect2 = rect;
            com.ss.android.ugc.aweme.poi.ui.detail.widget.e.a((ViewGroup) this, view2, rect2);
            try {
                return rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            } finally {
                rect2.setEmpty();
                C.release(rect2);
            }
        }
    }

    public final void a(boolean z2, boolean z3) {
        float f2;
        Animator.AnimatorListener animatorListener;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f36636a, false, 27828, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f36636a, false, 27828, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (!getMAnimating()) {
            float f3 = 0.0f;
            if (z2) {
                f2 = 0.0f;
            } else {
                f2 = this.f36638c;
            }
            if (getTranslationY() == f2) {
                if (!z2 || getVisibility() != 0) {
                    int i2 = 8;
                    if (z2 || getVisibility() != 8) {
                        if (z2) {
                            i2 = 0;
                        }
                        setVisibility(i2);
                        b();
                        if (z3) {
                            if (z2) {
                                if (this.f36638c <= 0.0f) {
                                    f3 = com.bytedance.ad.symphony.g.c.a(com.ss.android.ugc.aweme.base.utils.d.a(), 500.0f);
                                } else {
                                    f3 = this.f36638c;
                                }
                            }
                            setTranslationY(f3);
                        }
                    }
                }
                return;
            }
            ViewPropertyAnimator interpolator = animate().translationY(f2).setDuration(150).setInterpolator(new AccelerateDecelerateInterpolator());
            if (z2) {
                animatorListener = this.A;
            } else {
                animatorListener = this.B;
            }
            interpolator.setListener(animatorListener).start();
        }
    }

    public final boolean onStartNestedScroll(@NotNull View view, @NotNull View view2, int i2) {
        View view3 = view;
        View view4 = view2;
        if (PatchProxy.isSupport(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f36636a, false, 27820, new Class[]{View.class, View.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f36636a, false, 27820, new Class[]{View.class, View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(view3, "child");
        Intrinsics.checkParameterIsNotNull(view4, "target");
        if (!(view4 instanceof NestedScrollingChild) || (i2 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CommentNestedLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.j = LazyKt.lazy(new k(context));
        this.k = LazyKt.lazy(new i(this));
        this.l = LazyKt.lazy(new e(this));
        this.m = LazyKt.lazy(new d(this));
        this.n = LazyKt.lazy(j.INSTANCE);
        Boolean bool = Boolean.FALSE;
        this.w = new a(bool, bool, this);
        this.x = LazyKt.lazy(new f(this));
        this.z = LazyKt.lazy(new g(this));
        this.A = new h(this);
        this.B = new c(this);
        setMIsFocus(true);
        setOnKeyListener(new View.OnKeyListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36642a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CommentNestedLayout f36643b;

            {
                this.f36643b = r1;
            }

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                KeyEvent keyEvent2 = keyEvent;
                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), keyEvent2}, this, f36642a, false, 27836, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), keyEvent2}, this, f36642a, false, 27836, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                } else if (!this.f36643b.a() || i != 4) {
                    return false;
                } else {
                    Intrinsics.checkExpressionValueIsNotNull(keyEvent2, "event");
                    if (keyEvent.getAction() == 1) {
                        this.f36643b.dismiss();
                    }
                    return true;
                }
            }
        });
    }

    public final boolean onNestedPreFling(@NotNull View view, float f2, float f3) {
        int i2;
        boolean z2;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f36636a, false, 27823, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f36636a, false, 27823, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(view2, "target");
        if (view2 instanceof ScrollingView) {
            i2 = ((ScrollingView) view2).computeVerticalScrollOffset();
        } else {
            i2 = 0;
        }
        if (i2 == 0) {
            if (f3 > 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            a(z2, false);
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object[]} */
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
            com.meituan.robust.ChangeQuickRedirect r2 = f36636a
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
            r4 = 27822(0x6cae, float:3.8987E-41)
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
            com.meituan.robust.ChangeQuickRedirect r2 = f36636a
            r3 = 0
            r4 = 27822(0x6cae, float:3.8987E-41)
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
            float r0 = r16.getTranslationY()
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x00a6
            float r2 = (float) r9
            float r0 = r0 - r2
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x008b
            r0 = 0
        L_0x008b:
            float r1 = r7.f36638c
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0093
            float r0 = r7.f36638c
        L_0x0093:
            r7.setTranslationY(r0)
            boolean r0 = r16.getMTouchScrollingChild()
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r7.f36639d
            if (r0 != 0) goto L_0x00cc
            r0 = r10[r13]
            int r0 = r0 + r9
            r10[r13] = r0
            return
        L_0x00a6:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00cc
            boolean r1 = r8 instanceof android.support.v4.view.ScrollingView
            if (r1 == 0) goto L_0x00b5
            r1 = r8
            android.support.v4.view.ScrollingView r1 = (android.support.v4.view.ScrollingView) r1
            int r12 = r1.computeVerticalScrollOffset()
        L_0x00b5:
            if (r9 >= 0) goto L_0x00cc
            if (r12 == 0) goto L_0x00bf
            boolean r1 = r16.getMTouchScrollingChild()
            if (r1 != 0) goto L_0x00cc
        L_0x00bf:
            float r1 = (float) r9
            float r0 = r0 - r1
            float r1 = r7.f36638c
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c9
            float r0 = r7.f36638c
        L_0x00c9:
            r7.setTranslationY(r0)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout.onNestedPreScroll(android.view.View, int, int, int[]):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommentNestedLayout(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
