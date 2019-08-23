package com.ss.android.ugc.aweme.commercialize.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.Keep;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0015\b\u0016\u0018\u0000 F2\u00020\u0001:\u0001FB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020)H\u0016J\u001d\u0010*\u001a\u00020+2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020+0-H\bJ?\u0010.\u001a\u00020+2\u0014\b\u0004\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t0-2\u0014\b\u0004\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t0-2\b\b\u0002\u00101\u001a\u000202H\bJ\b\u00103\u001a\u00020+H\u0004J\b\u00104\u001a\u00020+H\u0004J0\u00105\u001a\u00020+2\u0006\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\tH\u0014J0\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\tH\u0015J\u0018\u0010A\u001a\u00020+2\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH\u0014J\u0010\u0010D\u001a\u00020+2\u0006\u00106\u001a\u00020\u0015H\u0016J\u0010\u0010E\u001a\u00020+2\u0006\u00106\u001a\u00020\u0015H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8TX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8TX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R$\u0010#\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001eR\u000e\u0010&\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/views/HeaderFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animator", "Landroid/animation/Animator;", "canScaleContent", "", "getCanScaleContent", "()Z", "canScroll", "getCanScroll", "dyExceedLimit", "<set-?>", "Landroid/view/View;", "header", "getHeader", "()Landroid/view/View;", "value", "headerId", "getHeaderId", "()I", "setHeaderId", "(I)V", "initY", "lastMeasureHeightSpec", "lastMeasureWidthSpec", "lastY", "scrollOffset", "getScrollOffset", "setScrollOffset", "scrolling", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "forEachNonGoneChild", "", "block", "Lkotlin/Function1;", "headerScrollAnim", "from", "to", "delay", "", "headerScrollIn", "headerScrollOut", "layoutChild", "child", "childLeft", "childTop", "childRight", "childBottom", "onLayout", "changed", "outerLeft", "outerTop", "outerRight", "outerBottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onViewAdded", "onViewRemoved", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class HeaderFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39922a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f39923f = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public View f39924b;

    /* renamed from: c  reason: collision with root package name */
    public int f39925c;

    /* renamed from: d  reason: collision with root package name */
    public int f39926d;

    /* renamed from: e  reason: collision with root package name */
    public Animator f39927e;
    private int g = -1;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u0002H\u0004\"\u000e\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005*\u0002H\u00042\u0006\u0010\u0006\u001a\u0002H\u00042\u0006\u0010\u0007\u001a\u0002H\u0004H\u0002¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/views/HeaderFrameLayout$Companion;", "", "()V", "clamp", "T", "", "min", "max", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39928a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/commercialize/views/HeaderFrameLayout$headerScrollAnim$1"}, k = 3, mv = {1, 1, 15})
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39929a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HeaderFrameLayout f39930b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f39931c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ HeaderFrameLayout f39932d;

        public b(HeaderFrameLayout headerFrameLayout, View view, HeaderFrameLayout headerFrameLayout2) {
            this.f39930b = headerFrameLayout;
            this.f39931c = view;
            this.f39932d = headerFrameLayout2;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f39929a, false, 32897, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39929a, false, 32897, new Class[0], Void.TYPE);
                return;
            }
            if (this.f39931c.getMeasuredHeight() <= 0) {
                this.f39930b.measureChild(this.f39931c, this.f39930b.f39925c, this.f39930b.f39926d);
            }
            final ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f39930b, "scrollOffset", new int[]{this.f39932d.getScrollOffset(), this.f39931c.getMeasuredHeight()});
            Intrinsics.checkExpressionValueIsNotNull(ofInt, "anim");
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.setDuration(250);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f39933a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f39934b;

                {
                    this.f39934b = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ValueAnimator valueAnimator2 = valueAnimator;
                    if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f39933a, false, 32898, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f39933a, false, 32898, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    HeaderFrameLayout headerFrameLayout = this.f39934b.f39930b;
                    Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        headerFrameLayout.setScrollOffset(((Integer) animatedValue).intValue());
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            });
            ofInt.addListener(new AnimatorListenerAdapter(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f39935a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f39936b;

                public final void onAnimationCancel(@Nullable Animator animator) {
                    this.f39936b.f39930b.f39927e = null;
                }

                public final void onAnimationEnd(@Nullable Animator animator) {
                    this.f39936b.f39930b.f39927e = null;
                }

                {
                    this.f39936b = r1;
                }

                public final void onAnimationStart(@Nullable Animator animator, boolean z) {
                    if (PatchProxy.isSupport(new Object[]{animator, Byte.valueOf(z ? (byte) 1 : 0)}, this, f39935a, false, 32899, new Class[]{Animator.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator, Byte.valueOf(z)}, this, f39935a, false, 32899, new Class[]{Animator.class, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    Animator animator2 = this.f39936b.f39930b.f39927e;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    this.f39936b.f39930b.f39927e = ofInt;
                }
            });
            ofInt.start();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/commercialize/views/HeaderFrameLayout$headerScrollAnim$1"}, k = 3, mv = {1, 1, 15})
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39938a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HeaderFrameLayout f39939b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f39940c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ HeaderFrameLayout f39941d;

        public c(HeaderFrameLayout headerFrameLayout, View view, HeaderFrameLayout headerFrameLayout2) {
            this.f39939b = headerFrameLayout;
            this.f39940c = view;
            this.f39941d = headerFrameLayout2;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f39938a, false, 32900, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39938a, false, 32900, new Class[0], Void.TYPE);
                return;
            }
            if (this.f39940c.getMeasuredHeight() <= 0) {
                this.f39939b.measureChild(this.f39940c, this.f39939b.f39925c, this.f39939b.f39926d);
            }
            final ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f39939b, "scrollOffset", new int[]{this.f39941d.getScrollOffset(), 0});
            Intrinsics.checkExpressionValueIsNotNull(ofInt, "anim");
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.setDuration(250);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f39942a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f39943b;

                {
                    this.f39943b = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ValueAnimator valueAnimator2 = valueAnimator;
                    if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f39942a, false, 32901, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f39942a, false, 32901, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    HeaderFrameLayout headerFrameLayout = this.f39943b.f39939b;
                    Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        headerFrameLayout.setScrollOffset(((Integer) animatedValue).intValue());
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            });
            ofInt.addListener(new AnimatorListenerAdapter(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f39944a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f39945b;

                public final void onAnimationCancel(@Nullable Animator animator) {
                    this.f39945b.f39939b.f39927e = null;
                }

                public final void onAnimationEnd(@Nullable Animator animator) {
                    this.f39945b.f39939b.f39927e = null;
                }

                {
                    this.f39945b = r1;
                }

                public final void onAnimationStart(@Nullable Animator animator, boolean z) {
                    if (PatchProxy.isSupport(new Object[]{animator, Byte.valueOf(z ? (byte) 1 : 0)}, this, f39944a, false, 32902, new Class[]{Animator.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator, Byte.valueOf(z)}, this, f39944a, false, 32902, new Class[]{Animator.class, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    Animator animator2 = this.f39945b.f39939b.f39927e;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    this.f39945b.f39939b.f39927e = ofInt;
                }
            });
            ofInt.start();
        }
    }

    public boolean getCanScaleContent() {
        return true;
    }

    public boolean getCanScroll() {
        return false;
    }

    @Nullable
    public final View getHeader() {
        return this.f39924b;
    }

    public final int getHeaderId() {
        return this.g;
    }

    public final int getScrollOffset() {
        return this.h;
    }

    public HeaderFrameLayout(@Nullable Context context) {
        super(context);
    }

    public void onViewAdded(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f39922a, false, 32881, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f39922a, false, 32881, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "child");
        super.onViewAdded(view);
        if (this.g != -1 && view.getId() == this.g) {
            if (this.f39924b == null) {
                this.f39924b = view;
            } else {
                throw new RuntimeException("dup header");
            }
        }
    }

    public void onViewRemoved(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f39922a, false, 32882, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f39922a, false, 32882, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "child");
        super.onViewRemoved(view);
        if (Intrinsics.areEqual((Object) this.f39924b, (Object) view)) {
            this.f39924b = null;
        }
    }

    public final void setHeaderId(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f39922a, false, 32879, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f39922a, false, 32879, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.g != i2) {
            View findViewById = findViewById(i2);
            if (!Intrinsics.areEqual((Object) this.f39924b, (Object) findViewById)) {
                this.f39924b = findViewById;
                requestLayout();
            }
            this.g = i2;
        }
    }

    @Keep
    public final void setScrollOffset(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f39922a, false, 32880, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f39922a, false, 32880, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != i2) {
            this.h = i2;
            requestLayout();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Comparable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f39922a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 32883(0x8073, float:4.6079E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f39922a
            r3 = 0
            r4 = 32883(0x8073, float:4.6079E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003f:
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            android.view.View r0 = r7.f39924b
            int r1 = r19.getActionMasked()
            r2 = 2
            if (r1 == 0) goto L_0x005c
            if (r1 == r2) goto L_0x0050
            goto L_0x0071
        L_0x0050:
            float r1 = r19.getY()
            int r1 = (int) r1
            int r3 = r7.i
            int r3 = r1 - r3
            r7.i = r1
            goto L_0x0072
        L_0x005c:
            float r1 = r19.getY()
            int r1 = (int) r1
            r7.j = r1
            float r1 = r19.getY()
            int r1 = (int) r1
            r7.i = r1
            android.animation.Animator r1 = r7.f39927e
            if (r1 == 0) goto L_0x0071
            r1.cancel()
        L_0x0071:
            r3 = 0
        L_0x0072:
            if (r0 == 0) goto L_0x0164
            int r1 = r19.getActionMasked()
            if (r1 != r2) goto L_0x0164
            boolean r1 = r18.getCanScroll()
            if (r1 == 0) goto L_0x0164
            boolean r1 = r7.l
            if (r1 != 0) goto L_0x0098
            float r1 = r19.getY()
            int r4 = r7.j
            float r4 = (float) r4
            float r1 = r1 - r4
            float r1 = java.lang.Math.abs(r1)
            r4 = 1101004800(0x41a00000, float:20.0)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0098
            r7.l = r9
        L_0x0098:
            com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout$a r1 = f39923f
            int r4 = r7.h
            int r4 = r4 + r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r0 = r0.getMeasuredHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            r5 = 3
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r11[r10] = r3
            r11[r9] = r4
            r11[r2] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout.a.f39928a
            r14 = 0
            r15 = 32893(0x807d, float:4.6093E-41)
            java.lang.Class[] r6 = new java.lang.Class[r5]
            java.lang.Class<java.lang.Comparable> r12 = java.lang.Comparable.class
            r6[r10] = r12
            java.lang.Class<java.lang.Comparable> r12 = java.lang.Comparable.class
            r6[r9] = r12
            java.lang.Class<java.lang.Comparable> r12 = java.lang.Comparable.class
            r6[r2] = r12
            java.lang.Class<java.lang.Comparable> r17 = java.lang.Comparable.class
            r12 = r1
            r16 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r6 == 0) goto L_0x0104
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r11[r10] = r3
            r11[r9] = r4
            r11[r2] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout.a.f39928a
            r14 = 0
            r15 = 32893(0x807d, float:4.6093E-41)
            java.lang.Class[] r0 = new java.lang.Class[r5]
            java.lang.Class<java.lang.Comparable> r3 = java.lang.Comparable.class
            r0[r10] = r3
            java.lang.Class<java.lang.Comparable> r3 = java.lang.Comparable.class
            r0[r9] = r3
            java.lang.Class<java.lang.Comparable> r3 = java.lang.Comparable.class
            r0[r2] = r3
            java.lang.Class<java.lang.Comparable> r17 = java.lang.Comparable.class
            r12 = r1
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            r3 = r0
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            goto L_0x0113
        L_0x0104:
            int r1 = r3.compareTo(r4)
            if (r1 >= 0) goto L_0x010c
            r3 = r4
            goto L_0x0113
        L_0x010c:
            int r1 = r3.compareTo(r0)
            if (r1 <= 0) goto L_0x0113
            r3 = r0
        L_0x0113:
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
            boolean r1 = r7.l
            if (r1 == 0) goto L_0x0164
            boolean r1 = r7.k
            if (r1 == 0) goto L_0x0148
            int r1 = r7.h
            if (r0 != r1) goto L_0x0144
            r7.k = r10
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r19)
            java.lang.String r1 = "downEvent"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setAction(r10)
            super.dispatchTouchEvent(r0)
            r0.recycle()
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r19)
            super.dispatchTouchEvent(r0)
            r0.recycle()
            goto L_0x0147
        L_0x0144:
            r7.setScrollOffset(r0)
        L_0x0147:
            return r9
        L_0x0148:
            int r1 = r7.h
            if (r0 == r1) goto L_0x0164
            r7.k = r9
            r7.setScrollOffset(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r19)
            java.lang.String r1 = "cancelEvent"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setAction(r5)
            super.dispatchTouchEvent(r0)
            r0.recycle()
            return r9
        L_0x0164:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r19)
            boolean r1 = super.dispatchTouchEvent(r0)
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public HeaderFrameLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f39922a, false, 32884, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f39922a, false, 32884, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f39925c = i2;
        this.f39926d = i3;
        super.onMeasure(i2, i3);
    }

    public HeaderFrameLayout(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01d4  */
    @android.annotation.SuppressLint({"RtlHardcoded"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r27, int r28, int r29, int r30, int r31) {
        /*
            r26 = this;
            r7 = r26
            r8 = 5
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r27)
            r9 = 0
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
            r10 = 1
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r29)
            r11 = 2
            r0[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            r12 = 3
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            r13 = 4
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f39922a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 32885(0x8075, float:4.6082E-41)
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0092
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r27)
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r29)
            r0[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f39922a
            r3 = 0
            r4 = 32885(0x8075, float:4.6082E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0092:
            int r0 = r26.getPaddingLeft()
            int r14 = r28 + r0
            int r0 = r26.getPaddingTop()
            int r15 = r29 + r0
            int r0 = r26.getPaddingRight()
            int r16 = r30 - r0
            int r0 = r26.getPaddingBottom()
            int r17 = r31 - r0
            int r0 = r26.getChildCount()
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until((int) r9, (int) r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r18 = r0.iterator()
        L_0x00b8:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x021b
            r0 = r18
            kotlin.collections.IntIterator r0 = (kotlin.collections.IntIterator) r0
            int r0 = r0.nextInt()
            android.view.View r6 = r7.getChildAt(r0)
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r0)
            int r0 = r6.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x0216
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            if (r0 == 0) goto L_0x020e
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r6.getMeasuredWidth()
            int r2 = r6.getMeasuredHeight()
            int r3 = r0.gravity
            r4 = -1
            if (r3 != r4) goto L_0x00f0
            r3 = 8388659(0x800033, float:1.1755015E-38)
            goto L_0x00f2
        L_0x00f0:
            int r3 = r0.gravity
        L_0x00f2:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 17
            if (r4 < r5) goto L_0x0100
            int r4 = r26.getLayoutDirection()
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r4)
        L_0x0100:
            r4 = r3 & 7
            r3 = r3 & 112(0x70, float:1.57E-43)
            if (r4 == r10) goto L_0x0110
            if (r4 == r8) goto L_0x010a
            r5 = r14
            goto L_0x011c
        L_0x010a:
            int r4 = r16 - r1
            int r5 = r0.rightMargin
            int r4 = r4 - r5
            goto L_0x011b
        L_0x0110:
            int r4 = r16 - r14
            int r4 = r4 - r1
            int r4 = r4 / r11
            int r4 = r4 + r14
            int r5 = r0.leftMargin
            int r4 = r4 + r5
            int r5 = r0.rightMargin
            int r4 = r4 - r5
        L_0x011b:
            r5 = r4
        L_0x011c:
            r4 = 16
            if (r3 == r4) goto L_0x0131
            r4 = 80
            if (r3 == r4) goto L_0x012a
            int r0 = r0.topMargin
            int r0 = r0 + r15
        L_0x0127:
            r19 = r0
            goto L_0x013e
        L_0x012a:
            int r3 = r17 - r2
            int r0 = r0.bottomMargin
            int r0 = r3 - r0
            goto L_0x0127
        L_0x0131:
            int r3 = r17 - r15
            int r3 = r3 - r2
            int r3 = r3 / r11
            int r3 = r3 + r15
            int r4 = r0.topMargin
            int r3 = r3 + r4
            int r0 = r0.bottomMargin
            int r0 = r3 - r0
            goto L_0x0127
        L_0x013e:
            int r4 = r5 + r1
            int r20 = r19 + r2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r0[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f39922a
            r3 = 0
            r21 = 32886(0x8076, float:4.6083E-41)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r22 = android.view.View.class
            r1[r9] = r22
            java.lang.Class r22 = java.lang.Integer.TYPE
            r1[r10] = r22
            java.lang.Class r22 = java.lang.Integer.TYPE
            r1[r11] = r22
            java.lang.Class r22 = java.lang.Integer.TYPE
            r1[r12] = r22
            java.lang.Class r22 = java.lang.Integer.TYPE
            r1[r13] = r22
            java.lang.Class r22 = java.lang.Void.TYPE
            r23 = r1
            r1 = r26
            r24 = r4
            r4 = r21
            r25 = r5
            r5 = r23
            r13 = r6
            r6 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01d4
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r0[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r2 = 4
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f39922a
            r3 = 0
            r4 = 32886(0x8076, float:4.6083E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r21 = 4
            r5[r21] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0218
        L_0x01d4:
            r21 = 4
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r13, r0)
            android.view.View r0 = r7.f39924b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x01f7
            int r0 = r7.h
            int r1 = r13.getMeasuredHeight()
            int r0 = r0 - r1
            int r19 = r19 + r0
            int r20 = r20 + r0
        L_0x01ee:
            r0 = r19
            r1 = r20
            r5 = r24
            r4 = r25
            goto L_0x020a
        L_0x01f7:
            android.view.View r0 = r7.f39924b
            if (r0 == 0) goto L_0x01ee
            int r0 = r7.h
            int r19 = r19 + r0
            boolean r0 = r26.getCanScaleContent()
            if (r0 != 0) goto L_0x01ee
            int r0 = r7.h
            int r20 = r20 + r0
            goto L_0x01ee
        L_0x020a:
            r13.layout(r4, r0, r5, r1)
            goto L_0x0218
        L_0x020e:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x0216:
            r21 = 4
        L_0x0218:
            r13 = 4
            goto L_0x00b8
        L_0x021b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout.onLayout(boolean, int, int, int, int):void");
    }
}
