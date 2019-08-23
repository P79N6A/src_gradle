package com.ss.android.ugc.aweme.commerce.floatvideo.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.R$styleable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0014J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J$\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\bH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/floatvideo/widget/DragRelativeLayout;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dockMarginBottom", "", "dockMarginLeft", "dockMarginRight", "dockMarginTop", "dockMode", "dragView", "Landroid/view/View;", "intercepted", "", "viewDragHelper", "Landroid/support/v4/widget/ViewDragHelper;", "initDragHelper", "", "initializeAttributes", "isInside", "event", "Landroid/view/MotionEvent;", "onFinishInflate", "onInterceptTouchEvent", "onTouchEvent", "smoothViewTo", "view", "x", "y", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DragRelativeLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36935a;
    public static final a h = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public int f36936b;

    /* renamed from: c  reason: collision with root package name */
    public int f36937c;

    /* renamed from: d  reason: collision with root package name */
    public int f36938d;

    /* renamed from: e  reason: collision with root package name */
    public int f36939e;

    /* renamed from: f  reason: collision with root package name */
    public int f36940f;
    public View g;
    private ViewDragHelper i;
    private boolean j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/floatvideo/widget/DragRelativeLayout$Companion;", "", "()V", "DOCK_MODE_ALL", "", "DOCK_MODE_LEFT_RIGHT", "DOCK_MODE_NONE", "DOCK_MODE_TOP_BOTTOM", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36941a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f36942b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f36943c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f36944d;

        b(View view, int i, int i2) {
            this.f36942b = view;
            this.f36943c = i;
            this.f36944d = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f36941a, false, 28227, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f36941a, false, 28227, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                this.f36942b.layout(this.f36943c + intValue, this.f36944d, this.f36943c + intValue + this.f36942b.getWidth(), this.f36944d + this.f36942b.getHeight());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36945a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f36946b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f36947c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f36948d;

        c(View view, int i, int i2) {
            this.f36946b = view;
            this.f36947c = i;
            this.f36948d = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f36945a, false, 28228, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f36945a, false, 28228, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                this.f36946b.layout(this.f36947c, this.f36948d + intValue, this.f36947c + this.f36946b.getWidth(), this.f36948d + intValue + this.f36946b.getHeight());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public final void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f36935a, false, 28217, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36935a, false, 28217, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        this.g = getChildAt(0);
    }

    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f36935a, false, 28216, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f36935a, false, 28216, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        if (!this.j) {
            return super.onTouchEvent(motionEvent);
        }
        try {
            ViewDragHelper viewDragHelper = this.i;
            if (viewDragHelper != null) {
                viewDragHelper.processTouchEvent(motionEvent);
            }
        } catch (IllegalArgumentException unused) {
        }
        return true;
    }

    public final boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f36935a, false, 28214, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f36935a, false, 28214, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f36935a, false, 28215, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f36935a, false, 28215, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else {
            View view = this.g;
            if (view != null) {
                i2 = view.getLeft();
            } else {
                i2 = 0;
            }
            View view2 = this.g;
            if (view2 != null) {
                i3 = view2.getTop();
            } else {
                i3 = 0;
            }
            View view3 = this.g;
            if (view3 != null) {
                i4 = view3.getRight();
            } else {
                i4 = 0;
            }
            View view4 = this.g;
            if (view4 != null) {
                i5 = view4.getBottom();
            } else {
                i5 = 0;
            }
            if (motionEvent.getX() < ((float) i2) || motionEvent.getX() > ((float) i4) || motionEvent.getY() < ((float) i3) || motionEvent.getY() > ((float) i5)) {
                z = false;
            }
        }
        this.j = z;
        if (!this.j) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        ViewDragHelper viewDragHelper = this.i;
        if (viewDragHelper != null) {
            return viewDragHelper.shouldInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragRelativeLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        if (PatchProxy.isSupport(new Object[]{attributeSet}, this, f36935a, false, 28212, new Class[]{AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet}, this, f36935a, false, 28212, new Class[]{AttributeSet.class}, Void.TYPE);
        } else {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.DragRelativeLayout);
            this.f36936b = obtainStyledAttributes.getInt(4, C0906R.id.a7x);
            this.f36937c = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
            this.f36938d = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
            this.f36939e = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            this.f36940f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
            obtainStyledAttributes.recycle();
        }
        if (PatchProxy.isSupport(new Object[0], this, f36935a, false, 28213, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36935a, false, 28213, new Class[0], Void.TYPE);
            return;
        }
        this.i = ViewDragHelper.create(this, 1.0f, new DragRelativeLayout$initDragHelper$1(this));
    }

    static /* synthetic */ void a(DragRelativeLayout dragRelativeLayout, View view, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3)}, dragRelativeLayout, f36935a, false, 28218, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            DragRelativeLayout dragRelativeLayout2 = dragRelativeLayout;
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3)}, dragRelativeLayout2, f36935a, false, 28218, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int left = view.getLeft();
        int top = view.getTop();
        ValueAnimator valueAnimator = null;
        if (i2 != 0) {
            valueAnimator = ValueAnimator.ofInt(new int[]{0, i2});
            valueAnimator.addUpdateListener(new b(view, left, top));
        } else if (i3 != 0) {
            valueAnimator = ValueAnimator.ofInt(new int[]{0, i3});
            valueAnimator.addUpdateListener(new c(view, left, top));
        }
        if (valueAnimator != null) {
            valueAnimator.setDuration(250);
        }
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
