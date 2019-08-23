package com.bytedance.ies.dmt.ui.sliding;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.Px;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class DmtSlidingPaneLayout extends ViewGroup {
    private static int x = 1920;

    /* renamed from: a  reason: collision with root package name */
    int f20428a = -858993460;

    /* renamed from: b  reason: collision with root package name */
    public boolean f20429b;

    /* renamed from: c  reason: collision with root package name */
    View f20430c;

    /* renamed from: d  reason: collision with root package name */
    float f20431d;

    /* renamed from: e  reason: collision with root package name */
    int f20432e;

    /* renamed from: f  reason: collision with root package name */
    boolean f20433f;
    int g;
    public c h;
    final ViewDragHelper i;
    boolean j;
    final ArrayList<a> k = new ArrayList<>();
    private int l;
    private Drawable m;
    private Drawable n;
    private final int o;
    private float p;
    private float q;
    private float r;
    private boolean s = true;
    private final Rect t = new Rect();
    private Method u;
    private Field v;
    private boolean w;

    class AccessibilityDelegate extends AccessibilityDelegateCompat {

        /* renamed from: b  reason: collision with root package name */
        private final Rect f20435b = new Rect();

        private boolean a(View view) {
            return DmtSlidingPaneLayout.this.c(view);
        }

        AccessibilityDelegate() {
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DmtSlidingPaneLayout.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
            super.onInitializeAccessibilityNodeInfo(view, obtain);
            Rect rect = this.f20435b;
            obtain.getBoundsInParent(rect);
            accessibilityNodeInfoCompat.setBoundsInParent(rect);
            obtain.getBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setVisibleToUser(obtain.isVisibleToUser());
            accessibilityNodeInfoCompat.setPackageName(obtain.getPackageName());
            accessibilityNodeInfoCompat.setClassName(obtain.getClassName());
            accessibilityNodeInfoCompat.setContentDescription(obtain.getContentDescription());
            accessibilityNodeInfoCompat.setEnabled(obtain.isEnabled());
            accessibilityNodeInfoCompat.setClickable(obtain.isClickable());
            accessibilityNodeInfoCompat.setFocusable(obtain.isFocusable());
            accessibilityNodeInfoCompat.setFocused(obtain.isFocused());
            accessibilityNodeInfoCompat.setAccessibilityFocused(obtain.isAccessibilityFocused());
            accessibilityNodeInfoCompat.setSelected(obtain.isSelected());
            accessibilityNodeInfoCompat.setLongClickable(obtain.isLongClickable());
            accessibilityNodeInfoCompat.addAction(obtain.getActions());
            accessibilityNodeInfoCompat.setMovementGranularities(obtain.getMovementGranularities());
            obtain.recycle();
            accessibilityNodeInfoCompat.setClassName(DmtSlidingPaneLayout.class.getName());
            accessibilityNodeInfoCompat.setSource(view);
            ViewParent parentForAccessibility = ViewCompat.getParentForAccessibility(view);
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfoCompat.setParent((View) parentForAccessibility);
            }
            int childCount = DmtSlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = DmtSlidingPaneLayout.this.getChildAt(i);
                if (!a(childAt) && childAt.getVisibility() == 0) {
                    ViewCompat.setImportantForAccessibility(childAt, 1);
                    accessibilityNodeInfoCompat.addChild(childAt);
                }
            }
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!a(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    class DragHelperCallback extends ViewDragHelper.Callback {
        DragHelperCallback() {
        }

        public int getViewHorizontalDragRange(View view) {
            return DmtSlidingPaneLayout.this.f20432e;
        }

        public void onViewDragStateChanged(int i) {
            if (DmtSlidingPaneLayout.this.i.getViewDragState() == 0) {
                if (DmtSlidingPaneLayout.this.f20431d == 0.0f) {
                    DmtSlidingPaneLayout.this.a(DmtSlidingPaneLayout.this.f20430c);
                    DmtSlidingPaneLayout dmtSlidingPaneLayout = DmtSlidingPaneLayout.this;
                    View view = DmtSlidingPaneLayout.this.f20430c;
                    if (!(dmtSlidingPaneLayout.h == null || view == null)) {
                        dmtSlidingPaneLayout.h.b(view);
                    }
                    dmtSlidingPaneLayout.sendAccessibilityEvent(32);
                    DmtSlidingPaneLayout.this.j = false;
                    return;
                }
                DmtSlidingPaneLayout dmtSlidingPaneLayout2 = DmtSlidingPaneLayout.this;
                View view2 = DmtSlidingPaneLayout.this.f20430c;
                if (!(dmtSlidingPaneLayout2.h == null || view2 == null)) {
                    dmtSlidingPaneLayout2.h.a(view2);
                }
                dmtSlidingPaneLayout2.sendAccessibilityEvent(32);
                DmtSlidingPaneLayout.this.j = true;
            }
        }

        public void onEdgeDragStarted(int i, int i2) {
            DmtSlidingPaneLayout.this.i.captureChildView(DmtSlidingPaneLayout.this.f20430c, i2);
        }

        public void onViewCaptured(View view, int i) {
            DmtSlidingPaneLayout.this.a();
            DmtSlidingPaneLayout.this.h.c(view);
        }

        public boolean tryCaptureView(View view, int i) {
            if (DmtSlidingPaneLayout.this.f20433f) {
                return false;
            }
            return ((b) view.getLayoutParams()).f20442b;
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            b bVar = (b) DmtSlidingPaneLayout.this.f20430c.getLayoutParams();
            if (DmtSlidingPaneLayout.this.c()) {
                int width = DmtSlidingPaneLayout.this.getWidth() - ((DmtSlidingPaneLayout.this.getPaddingRight() + bVar.rightMargin) + DmtSlidingPaneLayout.this.f20430c.getWidth());
                return Math.max(Math.min(i, width), width - DmtSlidingPaneLayout.this.f20432e);
            }
            int paddingLeft = DmtSlidingPaneLayout.this.getPaddingLeft() + bVar.leftMargin;
            return Math.min(Math.max(i, paddingLeft), DmtSlidingPaneLayout.this.f20432e + paddingLeft);
        }

        public void onViewReleased(View view, float f2, float f3) {
            int i;
            b bVar = (b) view.getLayoutParams();
            if (DmtSlidingPaneLayout.this.c()) {
                int paddingRight = DmtSlidingPaneLayout.this.getPaddingRight() + bVar.rightMargin;
                if (f2 < 0.0f || (f2 == 0.0f && DmtSlidingPaneLayout.this.f20431d > 0.5f)) {
                    paddingRight += DmtSlidingPaneLayout.this.f20432e;
                }
                i = (DmtSlidingPaneLayout.this.getWidth() - paddingRight) - DmtSlidingPaneLayout.this.f20430c.getWidth();
            } else {
                i = bVar.leftMargin + DmtSlidingPaneLayout.this.getPaddingLeft();
                if (f2 > 0.0f || (f2 == 0.0f && DmtSlidingPaneLayout.this.f20431d > 0.5f)) {
                    i += DmtSlidingPaneLayout.this.f20432e;
                }
            }
            DmtSlidingPaneLayout.this.i.settleCapturedViewAt(i, view.getTop());
            DmtSlidingPaneLayout.this.invalidate();
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            DmtSlidingPaneLayout dmtSlidingPaneLayout = DmtSlidingPaneLayout.this;
            if (dmtSlidingPaneLayout.f20430c == null) {
                dmtSlidingPaneLayout.f20431d = 0.0f;
            } else {
                boolean c2 = dmtSlidingPaneLayout.c();
                b bVar = (b) dmtSlidingPaneLayout.f20430c.getLayoutParams();
                int width = dmtSlidingPaneLayout.f20430c.getWidth();
                if (c2) {
                    i = (dmtSlidingPaneLayout.getWidth() - i) - width;
                }
                if (c2) {
                    i5 = dmtSlidingPaneLayout.getPaddingRight();
                } else {
                    i5 = dmtSlidingPaneLayout.getPaddingLeft();
                }
                if (c2) {
                    i6 = bVar.rightMargin;
                } else {
                    i6 = bVar.leftMargin;
                }
                dmtSlidingPaneLayout.f20431d = ((float) (i - (i5 + i6))) / ((float) dmtSlidingPaneLayout.f20432e);
                if (dmtSlidingPaneLayout.g != 0) {
                    dmtSlidingPaneLayout.a(dmtSlidingPaneLayout.f20431d);
                }
                if (bVar.f20443c) {
                    dmtSlidingPaneLayout.a(dmtSlidingPaneLayout.f20430c, dmtSlidingPaneLayout.f20431d, dmtSlidingPaneLayout.f20428a);
                }
                View view2 = dmtSlidingPaneLayout.f20430c;
                if (!(dmtSlidingPaneLayout.h == null || view2 == null)) {
                    dmtSlidingPaneLayout.h.a(view2, dmtSlidingPaneLayout.f20431d);
                }
            }
            DmtSlidingPaneLayout.this.invalidate();
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        boolean f20437a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, null);
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f20437a = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f20437a ? 1 : 0);
        }
    }

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final View f20438a;

        public final void run() {
            if (this.f20438a.getParent() == DmtSlidingPaneLayout.this) {
                this.f20438a.setLayerType(0, null);
                DmtSlidingPaneLayout.this.b(this.f20438a);
            }
            DmtSlidingPaneLayout.this.k.remove(this);
        }

        a(View view) {
            this.f20438a = view;
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: e  reason: collision with root package name */
        private static final int[] f20440e = {16843137};

        /* renamed from: a  reason: collision with root package name */
        public float f20441a;

        /* renamed from: b  reason: collision with root package name */
        boolean f20442b;

        /* renamed from: c  reason: collision with root package name */
        boolean f20443c;

        /* renamed from: d  reason: collision with root package name */
        Paint f20444d;

        public b() {
            super(-1, -1);
        }

        public b(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f20440e);
            this.f20441a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public interface c {
        void a(@NonNull View view);

        void a(@NonNull View view, float f2);

        void b(@NonNull View view);

        void c(@NonNull View view);
    }

    @ColorInt
    public int getCoveredFadeColor() {
        return this.l;
    }

    @Px
    public int getParallaxDistance() {
        return this.g;
    }

    @ColorInt
    public int getSliderFadeColor() {
        return this.f20428a;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s = true;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (!this.f20429b || this.f20431d == 1.0f) {
            return true;
        }
        return false;
    }

    public void computeScroll() {
        if (this.i.continueSettling(true)) {
            if (!this.f20429b) {
                this.i.abort();
                return;
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f20429b) {
            z = b();
        } else {
            z = this.j;
        }
        savedState.f20437a = z;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s = true;
        int size = this.k.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.k.get(i2).run();
        }
        this.k.clear();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    public static void setHeight(int i2) {
        x = i2;
    }

    public void setCoveredFadeColor(@ColorInt int i2) {
        this.l = i2;
    }

    public void setPanelSlideListener(@Nullable c cVar) {
        this.h = cVar;
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable) {
        this.m = drawable;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable) {
        this.n = drawable;
    }

    public void setSliderFadeColor(@ColorInt int i2) {
        this.f20428a = i2;
    }

    public void setParallaxDistance(@Px int i2) {
        this.g = i2;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof b) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int i2) {
        setShadowDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), i2));
    }

    public void setShadowResourceLeft(int i2) {
        setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), i2));
    }

    public void setShadowResourceRight(int i2) {
        setShadowDrawableRight(ContextCompat.getDrawable(getContext(), i2));
    }

    private static int a(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    /* access modifiers changed from: package-private */
    public final boolean c(View view) {
        if (view == null) {
            return false;
        }
        b bVar = (b) view.getLayoutParams();
        if (!this.f20429b || !bVar.f20443c || this.f20431d <= 0.0f) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    private boolean a(int i2) {
        if (!this.s && !b(0.0f)) {
            return false;
        }
        this.j = false;
        return true;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f20437a) {
            a(0);
        } else if (this.s || b(1.0f)) {
            this.j = true;
        }
        this.j = savedState.f20437a;
    }

    private boolean b(float f2) {
        int i2;
        if (!this.f20429b) {
            return false;
        }
        boolean c2 = c();
        b bVar = (b) this.f20430c.getLayoutParams();
        if (c2) {
            i2 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + bVar.rightMargin)) + (f2 * ((float) this.f20432e))) + ((float) this.f20430c.getWidth())));
        } else {
            i2 = (int) (((float) (getPaddingLeft() + bVar.leftMargin)) + (f2 * ((float) this.f20432e)));
        }
        if (!this.i.smoothSlideViewTo(this.f20430c, i2, this.f20430c.getTop())) {
            return false;
        }
        a();
        ViewCompat.postInvalidateOnAnimation(this);
        return true;
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        View view;
        int i2;
        int i3;
        super.draw(canvas);
        if (c()) {
            drawable = this.n;
        } else {
            drawable = this.m;
        }
        if (getChildCount() > 1) {
            view = getChildAt(1);
        } else {
            view = null;
        }
        if (view != null && drawable != null) {
            int top = view.getTop();
            int bottom = view.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (c()) {
                i3 = view.getRight();
                i2 = intrinsicWidth + i3;
            } else {
                int left = view.getLeft();
                int i4 = left - intrinsicWidth;
                i2 = left;
                i3 = i4;
            }
            drawable.setBounds(i3, top, i2, bottom);
            drawable.draw(canvas);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f20429b) {
            return super.onTouchEvent(motionEvent);
        }
        this.i.processTouchEvent(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x2 = motionEvent.getX();
                float y = motionEvent.getY();
                this.q = x2;
                this.r = y;
                break;
            case 1:
                if (c(this.f20430c)) {
                    float x3 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float f2 = x3 - this.q;
                    float f3 = y2 - this.r;
                    int touchSlop = this.i.getTouchSlop();
                    if ((f2 * f2) + (f3 * f3) < ((float) (touchSlop * touchSlop)) && this.i.isViewUnder(this.f20430c, (int) x3, (int) y2)) {
                        a(0);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.c()
            android.view.View r1 = r9.f20430c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$b r1 = (com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout.b) r1
            boolean r2 = r1.f20443c
            r3 = 0
            if (r2 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0016
            int r1 = r1.rightMargin
            goto L_0x0018
        L_0x0016:
            int r1 = r1.leftMargin
        L_0x0018:
            if (r1 > 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            int r2 = r9.getChildCount()
        L_0x0021:
            if (r3 >= r2) goto L_0x005c
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.f20430c
            if (r4 == r5) goto L_0x0059
            float r5 = r9.p
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.g
            float r7 = (float) r7
            float r5 = r5 * r7
            int r5 = (int) r5
            r9.p = r10
            float r7 = r6 - r10
            int r8 = r9.g
            float r8 = (float) r8
            float r7 = r7 * r8
            int r7 = (int) r7
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0045
            int r5 = -r5
        L_0x0045:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L_0x0059
            if (r0 == 0) goto L_0x0050
            float r5 = r9.p
            float r5 = r5 - r6
            goto L_0x0054
        L_0x0050:
            float r5 = r9.p
            float r5 = r6 - r5
        L_0x0054:
            int r6 = r9.l
            r9.a(r4, r5, r6)
        L_0x0059:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout.a(float):void");
    }

    /* access modifiers changed from: package-private */
    public final void b(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            ViewCompat.setLayerPaint(view, ((b) view.getLayoutParams()).f20444d);
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            if (!this.w) {
                try {
                    this.u = View.class.getDeclaredMethod("getDisplayList", null);
                } catch (NoSuchMethodException unused) {
                }
                try {
                    this.v = View.class.getDeclaredField("mRecreateDisplayList");
                    this.v.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                this.w = true;
            }
            if (this.u == null || this.v == null) {
                view.invalidate();
                return;
            } else {
                try {
                    this.v.setBoolean(view, true);
                    this.u.invoke(view, null);
                } catch (Exception unused3) {
                }
            }
        }
        ViewCompat.postInvalidateOnAnimation(this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f20429b && actionMasked == 0 && getChildCount() > 1) {
            View childAt = getChildAt(1);
            if (childAt != null) {
                this.j = !this.i.isViewUnder(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
            }
        }
        if (!this.f20429b || (this.f20433f && actionMasked != 0)) {
            this.i.cancel();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.i.cancel();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f20433f = false;
                float x2 = motionEvent.getX();
                float y = motionEvent.getY();
                this.q = x2;
                this.r = y;
                if (this.i.isViewUnder(this.f20430c, (int) x2, (int) y) && c(this.f20430c)) {
                    z = true;
                    if (!this.i.shouldInterceptTouchEvent(motionEvent) || z) {
                        return true;
                    }
                    return false;
                }
            } else if (actionMasked == 2) {
                float x3 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x3 - this.q);
                float abs2 = Math.abs(y2 - this.r);
                if (abs > ((float) this.i.getTouchSlop()) && abs2 > abs) {
                    this.i.cancel();
                    this.f20433f = true;
                    return false;
                }
            }
            z = false;
            if (!this.i.shouldInterceptTouchEvent(motionEvent)) {
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r7.getOpacity() == -1) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r18) {
        /*
            r17 = this;
            r0 = r18
            boolean r1 = r17.c()
            if (r1 == 0) goto L_0x0012
            int r2 = r17.getWidth()
            int r3 = r17.getPaddingRight()
            int r2 = r2 - r3
            goto L_0x0016
        L_0x0012:
            int r2 = r17.getPaddingLeft()
        L_0x0016:
            if (r1 == 0) goto L_0x001d
            int r3 = r17.getPaddingLeft()
            goto L_0x0026
        L_0x001d:
            int r3 = r17.getWidth()
            int r4 = r17.getPaddingRight()
            int r3 = r3 - r4
        L_0x0026:
            int r4 = r17.getPaddingTop()
            int r5 = r17.getHeight()
            int r6 = r17.getPaddingBottom()
            int r5 = r5 - r6
            if (r0 == 0) goto L_0x0065
            boolean r7 = r18.isOpaque()
            r8 = 1
            if (r7 == 0) goto L_0x003d
            goto L_0x0052
        L_0x003d:
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 18
            if (r7 >= r9) goto L_0x0051
            android.graphics.drawable.Drawable r7 = r18.getBackground()
            if (r7 == 0) goto L_0x0051
            int r7 = r7.getOpacity()
            r9 = -1
            if (r7 != r9) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r8 = 0
        L_0x0052:
            if (r8 == 0) goto L_0x0065
            int r7 = r18.getLeft()
            int r8 = r18.getRight()
            int r9 = r18.getTop()
            int r10 = r18.getBottom()
            goto L_0x0069
        L_0x0065:
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0069:
            int r11 = r17.getChildCount()
            r12 = 0
        L_0x006e:
            if (r12 >= r11) goto L_0x00c6
            r13 = r17
            android.view.View r14 = r13.getChildAt(r12)
            if (r14 == r0) goto L_0x00c8
            int r15 = r14.getVisibility()
            r6 = 8
            if (r15 == r6) goto L_0x00bd
            if (r1 == 0) goto L_0x0084
            r6 = r3
            goto L_0x0085
        L_0x0084:
            r6 = r2
        L_0x0085:
            int r15 = r14.getLeft()
            int r6 = java.lang.Math.max(r6, r15)
            int r15 = r14.getTop()
            int r15 = java.lang.Math.max(r4, r15)
            if (r1 == 0) goto L_0x009b
            r16 = r1
            r0 = r2
            goto L_0x009e
        L_0x009b:
            r16 = r1
            r0 = r3
        L_0x009e:
            int r1 = r14.getRight()
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r14.getBottom()
            int r1 = java.lang.Math.min(r5, r1)
            if (r6 < r7) goto L_0x00b8
            if (r15 < r9) goto L_0x00b8
            if (r0 > r8) goto L_0x00b8
            if (r1 > r10) goto L_0x00b8
            r6 = 4
            goto L_0x00b9
        L_0x00b8:
            r6 = 0
        L_0x00b9:
            r14.setVisibility(r6)
            goto L_0x00bf
        L_0x00bd:
            r16 = r1
        L_0x00bf:
            int r12 = r12 + 1
            r1 = r16
            r0 = r18
            goto L_0x006e
        L_0x00c6:
            r13 = r17
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout.a(android.view.View):void");
    }

    public void requestChildFocus(View view, View view2) {
        boolean z;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f20429b) {
            if (view == this.f20430c) {
                z = true;
            } else {
                z = false;
            }
            this.j = z;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r1 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0233  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            android.content.Context r1 = r20.getContext()
        L_0x0006:
            r2 = 0
            if (r1 == 0) goto L_0x001b
            boolean r3 = r1 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0010
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x001c
        L_0x0010:
            boolean r3 = r1 instanceof android.content.ContextWrapper
            if (r3 == 0) goto L_0x001b
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L_0x0006
        L_0x001b:
            r1 = r2
        L_0x001c:
            int r3 = a((android.app.Activity) r1)
            if (r3 != 0) goto L_0x0025
            int r3 = x
            goto L_0x0029
        L_0x0025:
            int r3 = a((android.app.Activity) r1)
        L_0x0029:
            int r4 = android.view.View.MeasureSpec.getMode(r21)
            int r5 = android.view.View.MeasureSpec.getSize(r21)
            int r6 = android.view.View.MeasureSpec.getMode(r22)
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r7 = "status_bar_height"
            java.lang.String r8 = "dimen"
            java.lang.String r9 = "android"
            int r7 = r1.getIdentifier(r7, r8, r9)
            r8 = 0
            if (r7 <= 0) goto L_0x004b
            int r1 = r1.getDimensionPixelSize(r7)
            goto L_0x004c
        L_0x004b:
            r1 = 0
        L_0x004c:
            int r3 = r3 + r1
            r1 = 300(0x12c, float:4.2E-43)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1073741824(0x40000000, float:2.0)
            if (r4 == r9) goto L_0x006a
            boolean r10 = r20.isInEditMode()
            if (r10 == 0) goto L_0x0062
            if (r4 == r7) goto L_0x0081
            if (r4 != 0) goto L_0x0081
            r5 = 300(0x12c, float:4.2E-43)
            goto L_0x0081
        L_0x0062:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Width must have an exact value or MATCH_PARENT"
            r1.<init>(r2)
            throw r1
        L_0x006a:
            if (r6 != 0) goto L_0x0081
            boolean r4 = r20.isInEditMode()
            if (r4 == 0) goto L_0x0079
            if (r6 != 0) goto L_0x0081
            r3 = 300(0x12c, float:4.2E-43)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0081
        L_0x0079:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Height must not be UNSPECIFIED"
            r1.<init>(r2)
            throw r1
        L_0x0081:
            if (r6 == r7) goto L_0x0095
            if (r6 == r9) goto L_0x0088
            r1 = 0
            r3 = 0
            goto L_0x00a2
        L_0x0088:
            int r1 = r20.getPaddingTop()
            int r3 = r3 - r1
            int r1 = r20.getPaddingBottom()
            int r1 = r3 - r1
            r3 = r1
            goto L_0x00a2
        L_0x0095:
            int r1 = r20.getPaddingTop()
            int r3 = r3 - r1
            int r1 = r20.getPaddingBottom()
            int r1 = r3 - r1
            r3 = r1
            r1 = 0
        L_0x00a2:
            int r4 = r20.getPaddingLeft()
            int r4 = r5 - r4
            int r10 = r20.getPaddingRight()
            int r4 = r4 - r10
            int r10 = r20.getChildCount()
            r0.f20430c = r2
            r13 = r1
            r14 = r4
            r1 = 0
            r11 = 0
            r12 = 0
        L_0x00b8:
            r15 = 8
            r16 = 1
            if (r1 >= r10) goto L_0x015b
            android.view.View r7 = r0.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r18 = r7.getLayoutParams()
            r9 = r18
            com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$b r9 = (com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout.b) r9
            int r2 = r7.getVisibility()
            if (r2 != r15) goto L_0x00d4
            r9.f20443c = r8
            goto L_0x0152
        L_0x00d4:
            float r2 = r9.f20441a
            r15 = 0
            int r2 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x00e2
            float r2 = r9.f20441a
            float r12 = r12 + r2
            int r2 = r9.width
            if (r2 == 0) goto L_0x0152
        L_0x00e2:
            int r2 = r9.leftMargin
            int r15 = r9.rightMargin
            int r2 = r2 + r15
            int r15 = r9.width
            r8 = -2
            if (r15 != r8) goto L_0x00f7
            int r2 = r4 - r2
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r8)
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x010d
        L_0x00f7:
            int r8 = r9.width
            r15 = -1
            if (r8 != r15) goto L_0x0105
            int r2 = r4 - r2
            r8 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r8)
            goto L_0x010d
        L_0x0105:
            r8 = 1073741824(0x40000000, float:2.0)
            int r2 = r9.width
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r8)
        L_0x010d:
            int r15 = r9.height
            r8 = -2
            if (r15 != r8) goto L_0x0119
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            goto L_0x012d
        L_0x0119:
            int r8 = r9.height
            r15 = -1
            if (r8 != r15) goto L_0x0125
            r8 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            goto L_0x012d
        L_0x0125:
            r8 = 1073741824(0x40000000, float:2.0)
            int r15 = r9.height
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r8)
        L_0x012d:
            r7.measure(r2, r15)
            int r2 = r7.getMeasuredWidth()
            int r8 = r7.getMeasuredHeight()
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != r15) goto L_0x0142
            if (r8 <= r13) goto L_0x0142
            int r13 = java.lang.Math.min(r8, r3)
        L_0x0142:
            int r14 = r14 - r2
            if (r14 >= 0) goto L_0x0147
            r2 = 1
            goto L_0x0148
        L_0x0147:
            r2 = 0
        L_0x0148:
            r9.f20442b = r2
            r2 = r2 | r11
            boolean r8 = r9.f20442b
            if (r8 == 0) goto L_0x0151
            r0.f20430c = r7
        L_0x0151:
            r11 = r2
        L_0x0152:
            int r1 = r1 + 1
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 0
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x00b8
        L_0x015b:
            if (r11 != 0) goto L_0x0162
            r1 = 0
            int r2 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0259
        L_0x0162:
            int r1 = r0.o
            int r1 = r4 - r1
            r2 = 0
        L_0x0167:
            if (r2 >= r10) goto L_0x0259
            android.view.View r6 = r0.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 == r15) goto L_0x024c
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$b r7 = (com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout.b) r7
            int r8 = r6.getVisibility()
            if (r8 == r15) goto L_0x024c
            int r8 = r7.width
            if (r8 != 0) goto L_0x018c
            float r8 = r7.f20441a
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x018c
            r8 = 1
            goto L_0x018d
        L_0x018c:
            r8 = 0
        L_0x018d:
            if (r8 == 0) goto L_0x0191
            r9 = 0
            goto L_0x0195
        L_0x0191:
            int r9 = r6.getMeasuredWidth()
        L_0x0195:
            if (r11 == 0) goto L_0x01e0
            android.view.View r15 = r0.f20430c
            if (r6 == r15) goto L_0x01e0
            int r15 = r7.width
            if (r15 >= 0) goto L_0x024c
            if (r9 > r1) goto L_0x01a8
            float r9 = r7.f20441a
            r15 = 0
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 <= 0) goto L_0x024c
        L_0x01a8:
            if (r8 == 0) goto L_0x01cd
            int r8 = r7.height
            r9 = -2
            if (r8 != r9) goto L_0x01b8
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x01d7
        L_0x01b8:
            int r8 = r7.height
            r9 = -1
            if (r8 != r9) goto L_0x01c4
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            goto L_0x01d7
        L_0x01c4:
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = r7.height
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            goto L_0x01d7
        L_0x01cd:
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = r6.getMeasuredHeight()
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
        L_0x01d7:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            r6.measure(r9, r7)
            goto L_0x024c
        L_0x01e0:
            float r8 = r7.f20441a
            r15 = 0
            int r8 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r8 <= 0) goto L_0x024c
            int r8 = r7.width
            if (r8 != 0) goto L_0x0210
            int r8 = r7.height
            r15 = -2
            if (r8 != r15) goto L_0x01fb
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            r15 = r17
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x021c
        L_0x01fb:
            int r8 = r7.height
            r15 = -1
            if (r8 != r15) goto L_0x0207
            r8 = 1073741824(0x40000000, float:2.0)
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            goto L_0x021a
        L_0x0207:
            r8 = 1073741824(0x40000000, float:2.0)
            int r15 = r7.height
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r8)
            goto L_0x021a
        L_0x0210:
            r8 = 1073741824(0x40000000, float:2.0)
            int r15 = r6.getMeasuredHeight()
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r8)
        L_0x021a:
            r15 = r17
        L_0x021c:
            if (r11 == 0) goto L_0x0233
            int r8 = r7.leftMargin
            int r7 = r7.rightMargin
            int r8 = r8 + r7
            int r7 = r4 - r8
            r19 = r1
            r8 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            if (r9 == r7) goto L_0x024e
            r6.measure(r1, r15)
            goto L_0x024e
        L_0x0233:
            r19 = r1
            r1 = 0
            int r8 = java.lang.Math.max(r1, r14)
            float r7 = r7.f20441a
            float r8 = (float) r8
            float r7 = r7 * r8
            float r7 = r7 / r12
            int r7 = (int) r7
            int r9 = r9 + r7
            r7 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
            r6.measure(r8, r15)
            goto L_0x0251
        L_0x024c:
            r19 = r1
        L_0x024e:
            r1 = 0
            r7 = 1073741824(0x40000000, float:2.0)
        L_0x0251:
            int r2 = r2 + 1
            r1 = r19
            r15 = 8
            goto L_0x0167
        L_0x0259:
            int r1 = r20.getPaddingTop()
            int r13 = r13 + r1
            int r1 = r20.getPaddingBottom()
            int r13 = r13 + r1
            r0.setMeasuredDimension(r5, r13)
            r0.f20429b = r11
            android.support.v4.widget.ViewDragHelper r1 = r0.i
            int r1 = r1.getViewDragState()
            if (r1 == 0) goto L_0x0277
            if (r11 != 0) goto L_0x0277
            android.support.v4.widget.ViewDragHelper r1 = r0.i
            r1.abort()
        L_0x0277:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout.onMeasure(int, int):void");
    }

    public DmtSlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.o = 0;
        setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate());
        ViewCompat.setImportantForAccessibility(this, 1);
        this.i = ViewDragHelper.create(this, 0.5f, new DragHelperCallback());
        this.i.setMinVelocity(f2 * 400.0f);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        b bVar = (b) view.getLayoutParams();
        int save = canvas.save();
        if (this.f20429b && !bVar.f20442b && this.f20430c != null) {
            canvas.getClipBounds(this.t);
            if (c()) {
                this.t.left = Math.max(this.t.left, this.f20430c.getRight());
            } else {
                this.t.right = Math.min(this.t.right, this.f20430c.getLeft());
            }
            canvas.clipRect(this.t);
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* access modifiers changed from: package-private */
    public void a(View view, float f2, int i2) {
        b bVar = (b) view.getLayoutParams();
        if (f2 <= 0.0f || i2 == 0) {
            if (view.getLayerType() != 0) {
                if (bVar.f20444d != null) {
                    bVar.f20444d.setColorFilter(null);
                }
                a aVar = new a(view);
                this.k.add(aVar);
                ViewCompat.postOnAnimation(this, aVar);
            }
            return;
        }
        int i3 = (((int) (((float) ((-16777216 & i2) >>> 24)) * f2)) << 24) | (i2 & 16777215);
        if (bVar.f20444d == null) {
            bVar.f20444d = new Paint();
        }
        bVar.f20444d.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_OVER));
        if (view.getLayerType() != 2) {
            view.setLayerType(2, bVar.f20444d);
        }
        b(view);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            this.s = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        float f2;
        boolean c2 = c();
        if (c2) {
            this.i.setEdgeTrackingEnabled(2);
        } else {
            this.i.setEdgeTrackingEnabled(1);
        }
        int i14 = i4 - i2;
        if (c2) {
            i6 = getPaddingRight();
        } else {
            i6 = getPaddingLeft();
        }
        if (c2) {
            i7 = getPaddingLeft();
        } else {
            i7 = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.s) {
            if (!this.f20429b || !this.j) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            this.f20431d = f2;
        }
        int i15 = i6;
        int i16 = i15;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (bVar.f20442b) {
                    int i18 = i14 - i7;
                    int min = (Math.min(i15, i18 - this.o) - i16) - (bVar.leftMargin + bVar.rightMargin);
                    this.f20432e = min;
                    if (c2) {
                        i13 = bVar.rightMargin;
                    } else {
                        i13 = bVar.leftMargin;
                    }
                    if (i16 + i13 + min + (measuredWidth / 2) > i18) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bVar.f20443c = z2;
                    int i19 = (int) (((float) min) * this.f20431d);
                    i9 = i13 + i19 + i16;
                    this.f20431d = ((float) i19) / ((float) this.f20432e);
                    i8 = 0;
                } else {
                    if (!this.f20429b || this.g == 0) {
                        i12 = 0;
                    } else {
                        i12 = (int) ((1.0f - this.f20431d) * ((float) this.g));
                    }
                    i8 = i12;
                    i9 = i15;
                }
                if (c2) {
                    i10 = (i14 - i9) + i8;
                    i11 = i10 - measuredWidth;
                } else {
                    i11 = i9 - i8;
                    i10 = i11 + measuredWidth;
                }
                childAt.layout(i11, paddingTop, i10, childAt.getMeasuredHeight() + paddingTop);
                i15 += childAt.getWidth();
                i16 = i9;
            }
        }
        if (this.s) {
            if (this.f20429b) {
                if (this.g != 0) {
                    a(this.f20431d);
                }
                if (((b) this.f20430c.getLayoutParams()).f20443c) {
                    a(this.f20430c, this.f20431d, this.f20428a);
                }
            } else {
                for (int i20 = 0; i20 < childCount; i20++) {
                    a(getChildAt(i20), 0.0f, this.f20428a);
                }
            }
            a(this.f20430c);
        }
        this.s = false;
    }

    /* access modifiers changed from: protected */
    public final boolean a(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight()) {
                    int i7 = i4 + scrollY;
                    if (i7 >= childAt.getTop() && i7 < childAt.getBottom()) {
                        if (a(childAt, true, i2, i6 - childAt.getLeft(), i7 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (z) {
            if (c()) {
                i5 = i2;
            } else {
                i5 = -i2;
            }
            if (view.canScrollHorizontally(i5)) {
                return true;
            }
        }
        return false;
    }
}
