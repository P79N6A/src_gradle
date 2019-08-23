package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewGroupCompat;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.OverScroller;
import com.bytedance.android.livesdk.R$styleable;
import com.bytedance.android.livesdk.utils.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class TTLiveResolverDrawerLayout extends ViewGroup implements NestedScrollingParent {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18344a;
    private final Rect A;
    private final ViewTreeObserver.OnTouchModeChangeListener B;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18345b;

    /* renamed from: c  reason: collision with root package name */
    private int f18346c;

    /* renamed from: d  reason: collision with root package name */
    private int f18347d;

    /* renamed from: e  reason: collision with root package name */
    private int f18348e;

    /* renamed from: f  reason: collision with root package name */
    private float f18349f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private final int p;
    private final float q;
    private final OverScroller r;
    private VelocityTracker s;
    private Drawable t;
    private b u;
    private c v;
    private float w;
    private float x;
    private float y;
    private int z;

    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f18350a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f18351b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f18352c;

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public a(a aVar) {
            super(aVar);
            this.f18350a = aVar.f18350a;
            this.f18351b = aVar.f18351b;
            this.f18352c = aVar.f18352c;
        }

        public a(int i, int i2) {
            super(-1, -2);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TTLiveResolverDrawerLayout_LayoutParams);
            this.f18350a = obtainStyledAttributes.getBoolean(0, false);
            this.f18351b = obtainStyledAttributes.getBoolean(2, false);
            this.f18352c = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
        }
    }

    public interface b {
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18353a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f18353a, false, 14756, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f18353a, false, 14756, new Class[0], Void.TYPE);
                return;
            }
            TTLiveResolverDrawerLayout.this.a();
        }

        private c() {
        }

        /* synthetic */ c(TTLiveResolverDrawerLayout tTLiveResolverDrawerLayout, byte b2) {
            this();
        }
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f18357a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new d[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f18357a, false, 14758, new Class[]{Parcel.class}, d.class)) {
                    return new d(parcel2, (byte) 0);
                }
                return (d) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f18357a, false, 14758, new Class[]{Parcel.class}, d.class);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18355a;

        /* renamed from: b  reason: collision with root package name */
        boolean f18356b;

        d(Parcelable parcelable) {
            super(parcelable);
        }

        private d(Parcel parcel) {
            super(parcel);
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f18356b = z;
        }

        /* synthetic */ d(Parcel parcel, byte b2) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2, Integer.valueOf(i)}, this, f18355a, false, 14757, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel2, Integer.valueOf(i)}, this, f18355a, false, 14757, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.writeToParcel(parcel, i);
            parcel2.writeInt(this.f18356b ? 1 : 0);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (i2 & 2) != 0;
    }

    private boolean a(int i2, boolean z2) {
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18344a, false, 14715, new Class[]{Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2)}, this, f18344a, false, 14715, new Class[]{Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i2 == this.g) {
            return false;
        } else {
            float f2 = 0.0f;
            if (ViewCompat.isLaidOut(this)) {
                boolean z4 = this.f18349f != 0.0f;
                if (!z2 || i2 >= this.g || this.f18349f != ((float) i2)) {
                    this.f18349f = Math.min(this.f18349f, (float) this.g);
                } else {
                    this.f18349f = (float) this.g;
                }
                if (this.f18349f != 0.0f) {
                    z3 = true;
                }
                if (z4 != z3) {
                    a(z3);
                }
            } else {
                if (!this.n) {
                    f2 = (float) this.g;
                }
                this.f18349f = f2;
            }
            return true;
        }
    }

    private void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18344a, false, 14725, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f18344a, false, 14725, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.t != null) {
            setWillNotDraw(!z2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, float f2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f18344a, false, 14727, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f18344a, false, 14727, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        e();
        int i4 = (int) this.f18349f;
        int i5 = i2 - i4;
        int height = getHeight();
        int i6 = height / 2;
        float f3 = (float) height;
        float f4 = (float) i6;
        float a2 = f4 + (a(Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / f3)) * f4);
        float abs = Math.abs(f2);
        if (abs > 0.0f) {
            i3 = Math.round(Math.abs(a2 / abs) * 1000.0f) * 4;
        } else {
            i3 = (int) (((((float) Math.abs(i5)) / f3) + 1.0f) * 100.0f);
        }
        this.r.startScroll(0, i4, 0, i5, Math.min(i3, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f));
        ViewCompat.postInvalidateOnAnimation(this);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view) {
        View view2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f18344a, false, 14733, new Class[]{View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f18344a, false, 14733, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        } else if (view == null) {
            return false;
        } else {
            this.A.set(0, 0, view.getWidth(), view.getHeight());
            offsetDescendantRectToMyCoords(view, this.A);
            if (view.getParent() == this) {
                view2 = view;
            } else {
                view2 = view;
                ViewParent viewParent = view.getParent();
                while (viewParent != this) {
                    view2 = (View) viewParent;
                    viewParent = view2.getParent();
                }
            }
            int height = getHeight() - getPaddingBottom();
            int childCount = getChildCount();
            for (int indexOfChild = indexOfChild(view2) + 1; indexOfChild < childCount; indexOfChild++) {
                View childAt = getChildAt(indexOfChild);
                if (childAt.getVisibility() != 8) {
                    height = Math.min(height, childAt.getTop());
                }
            }
            return this.A.bottom > height;
        }
    }

    private int getMaxCollapsedHeight() {
        int i2;
        if (this.f18345b) {
            i2 = this.f18348e;
        } else {
            i2 = this.f18347d;
        }
        return i2 + this.i;
    }

    private boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f18344a, false, 14714, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f18344a, false, 14714, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.l || ViewGroupCompat.getNestedScrollAxes(this) == 2) {
            return true;
        } else {
            return false;
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f18344a, false, 14716, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18344a, false, 14716, new Class[0], Void.TYPE);
            return;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f18344a, false, 14721, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18344a, false, 14721, new Class[0], Void.TYPE);
            return;
        }
        this.z = -1;
        this.l = false;
        this.m = false;
        this.y = 0.0f;
        this.x = 0.0f;
        this.w = 0.0f;
        if (this.s != null) {
            this.s.clear();
        }
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f18344a, false, 14723, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18344a, false, 14723, new Class[0], Void.TYPE);
            return;
        }
        this.r.abortAnimation();
        this.v = null;
        this.o = false;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f18344a, false, 14726, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18344a, false, 14726, new Class[0], Void.TYPE);
            return;
        }
        if (this.v != null) {
            removeCallbacks(this.v);
            this.v = null;
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (!PatchProxy.isSupport(new Object[0], this, f18344a, false, 14752, new Class[0], ViewGroup.LayoutParams.class)) {
            return new a(-1, -2);
        }
        return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(new Object[0], this, f18344a, false, 14752, new Class[0], ViewGroup.LayoutParams.class);
    }

    public int getNestedScrollAxes() {
        if (PatchProxy.isSupport(new Object[0], this, f18344a, false, 14745, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f18344a, false, 14745, new Class[0], Integer.TYPE)).intValue();
        } else if (!ak.a()) {
            return this.k;
        } else {
            return super.getNestedScrollAxes();
        }
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f18344a, false, 14736, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18344a, false, 14736, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        getViewTreeObserver().addOnTouchModeChangeListener(this.B);
    }

    public Parcelable onSaveInstanceState() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f18344a, false, 14753, new Class[0], Parcelable.class)) {
            return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f18344a, false, 14753, new Class[0], Parcelable.class);
        }
        d dVar = new d(super.onSaveInstanceState());
        if (this.g > 0 && this.f18349f == 0.0f) {
            z2 = true;
        }
        dVar.f18356b = z2;
        return dVar;
    }

    public void computeScroll() {
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f18344a, false, 14722, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18344a, false, 14722, new Class[0], Void.TYPE);
            return;
        }
        super.computeScroll();
        if (this.r.computeScrollOffset()) {
            z2 = !this.r.isFinished();
            a((int) (((float) this.r.getCurrY()) - this.f18349f));
            if (z2) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
        } else {
            z2 = !this.r.isFinished();
        }
        if (!z2 && this.o && this.u != null) {
            this.v = new c(this, (byte) 0);
            post(this.v);
        }
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f18344a, false, 14737, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18344a, false, 14737, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnTouchModeChangeListener(this.B);
        e();
        if (PatchProxy.isSupport(new Object[0], this, f18344a, false, 14717, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18344a, false, 14717, new Class[0], Void.TYPE);
            return;
        }
        if (this.s != null) {
            this.s.recycle();
            this.s = null;
        }
    }

    public void setOnDismissedListener(b bVar) {
        this.u = bVar;
    }

    public void onDrawForeground(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f18344a, false, 14746, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f18344a, false, 14746, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        if (this.t != null) {
            this.t.draw(canvas);
        }
        super.onDrawForeground(canvas);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, f18344a, false, 14754, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, f18344a, false, 14754, new Class[]{Parcelable.class}, Void.TYPE);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.n = dVar.f18356b;
    }

    private float a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f18344a, false, 14728, new Class[]{Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f18344a, false, 14728, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
        }
        double d2 = (double) (f2 - 0.5f);
        Double.isNaN(d2);
        return (float) Math.sin((double) ((float) (d2 * 0.4712389167638204d)));
    }

    private int b(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f18344a, false, 14748, new Class[]{View.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view2}, this, f18344a, false, 14748, new Class[]{View.class}, Integer.TYPE)).intValue();
        }
        int measuredHeight = view.getMeasuredHeight();
        if (view2 instanceof AbsListView) {
            AbsListView absListView = (AbsListView) view2;
            int paddingBottom = absListView.getPaddingBottom();
            int childCount = absListView.getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                int bottom = absListView.getChildAt(i3).getBottom() + paddingBottom;
                if (bottom > i2) {
                    i2 = bottom;
                }
            }
            if (i2 < measuredHeight) {
                measuredHeight = i2;
            }
        }
        a aVar = (a) view.getLayoutParams();
        return aVar.topMargin + measuredHeight + aVar.bottomMargin;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AttributeSet attributeSet2 = attributeSet;
        if (!PatchProxy.isSupport(new Object[]{attributeSet2}, this, f18344a, false, 14750, new Class[]{AttributeSet.class}, ViewGroup.LayoutParams.class)) {
            return new a(getContext(), attributeSet2);
        }
        return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(new Object[]{attributeSet2}, this, f18344a, false, 14750, new Class[]{AttributeSet.class}, ViewGroup.LayoutParams.class);
    }

    public void onStopNestedScroll(View view) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{view}, this, f18344a, false, 14739, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f18344a, false, 14739, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (ak.a()) {
            super.onStopNestedScroll(view);
        }
        this.k = 0;
        if (this.r.isFinished()) {
            if (this.f18349f >= ((float) (this.g / 2))) {
                i2 = this.g;
            }
            a(i2, 0.0f);
        }
    }

    public void setCollapsed(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18344a, false, 14711, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f18344a, false, 14711, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!ViewCompat.isLaidOut(this)) {
            this.n = z2;
        } else {
            if (z2) {
                i2 = this.g;
            }
            a(i2, 0.0f);
        }
    }

    public void setCollapsibleHeightReserved(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18344a, false, 14712, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18344a, false, 14712, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int i3 = this.i;
        this.i = i2;
        int i4 = this.i - i3;
        if (i4 != 0 && this.l) {
            this.y -= (float) i4;
        }
        int i5 = this.g;
        this.g = Math.max(this.g, getMaxCollapsedHeight());
        if (!a(i5, !b())) {
            invalidate();
        }
    }

    public void setSmallCollapsed(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18344a, false, 14710, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f18344a, false, 14710, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f18345b = z2;
        requestLayout();
    }

    private float a(int i2) {
        boolean z2;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18344a, false, 14724, new Class[]{Integer.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18344a, false, 14724, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
        }
        float max = Math.max(0.0f, Math.min(this.f18349f + ((float) i2), (float) (this.g + this.h)));
        if (max == this.f18349f) {
            return 0.0f;
        }
        int i3 = (int) (max - this.f18349f);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (!((a) childAt.getLayoutParams()).f18351b) {
                childAt.offsetTopAndBottom(i3);
            }
        }
        if (this.f18349f != 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f18349f = max;
        this.j += i3;
        if (max == 0.0f) {
            z3 = false;
        }
        if (z2 != z3) {
            a(z3);
        }
        ViewCompat.postInvalidateOnAnimation(this);
        return (float) i3;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (PatchProxy.isSupport(new Object[]{layoutParams2}, this, f18344a, false, 14751, new Class[]{ViewGroup.LayoutParams.class}, ViewGroup.LayoutParams.class)) {
            return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(new Object[]{layoutParams2}, this, f18344a, false, 14751, new Class[]{ViewGroup.LayoutParams.class}, ViewGroup.LayoutParams.class);
        } else if (layoutParams2 instanceof a) {
            return new a((a) layoutParams2);
        } else {
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                return new a((ViewGroup.MarginLayoutParams) layoutParams2);
            }
            return new a(layoutParams2);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f18344a, false, 14718, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f18344a, false, 14718, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        c();
        if (actionMasked == 0) {
            this.s.clear();
        }
        this.s.addMovement(motionEvent);
        if (actionMasked != 6) {
            switch (actionMasked) {
                case 0:
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    this.w = x2;
                    this.y = y2;
                    this.x = y2;
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(x2), Float.valueOf(y2)}, this, f18344a, false, 14732, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(x2), Float.valueOf(y2)}, this, f18344a, false, 14732, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                    } else {
                        View b2 = b(x2, y2);
                        if (b2 == null || !a(b2)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    }
                    if (!z2 || this.g <= 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    this.m = z3;
                    this.k = 0;
                    break;
                case 1:
                case 3:
                    d();
                    break;
                case 2:
                    float x3 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    float f2 = y3 - this.x;
                    if (Math.abs(f2) > ((float) this.p) && a(x3, y3) != null && (ViewGroupCompat.getNestedScrollAxes(this) & 2) == 0) {
                        this.z = motionEvent.getPointerId(0);
                        this.l = true;
                        this.y = Math.max(this.y - ((float) this.p), Math.min(this.y + f2, this.y + ((float) this.p)));
                        break;
                    }
            }
        } else {
            a(motionEvent);
        }
        if (this.l) {
            e();
        }
        if (this.l || this.m) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f18344a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 14719(0x397f, float:2.0626E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0037
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f18344a
            r3 = 0
            r4 = 14719(0x397f, float:2.0626E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0037:
            int r0 = r10.getActionMasked()
            r9.c()
            android.view.VelocityTracker r1 = r9.s
            r1.addMovement(r10)
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0197;
                case 1: goto L_0x00eb;
                case 2: goto L_0x0081;
                case 3: goto L_0x0068;
                case 4: goto L_0x0047;
                case 5: goto L_0x004e;
                case 6: goto L_0x0049;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x01d0
        L_0x0049:
            r9.a((android.view.MotionEvent) r10)
            goto L_0x01d0
        L_0x004e:
            int r0 = r10.getActionIndex()
            int r1 = r10.getPointerId(r0)
            r9.z = r1
            float r1 = r10.getX(r0)
            r9.w = r1
            float r0 = r10.getY(r0)
            r9.y = r0
            r9.x = r0
            goto L_0x01d0
        L_0x0068:
            boolean r0 = r9.l
            if (r0 == 0) goto L_0x007d
            float r0 = r9.f18349f
            int r2 = r9.g
            int r2 = r2 / 2
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            int r8 = r9.g
        L_0x007a:
            r9.a((int) r8, (float) r1)
        L_0x007d:
            r9.d()
            return r7
        L_0x0081:
            int r0 = r9.z
            int r0 = r10.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x009e
            int r0 = r10.getPointerId(r8)
            r9.z = r0
            float r0 = r10.getX()
            r9.w = r0
            float r0 = r10.getY()
            r9.y = r0
            r9.x = r0
            r0 = 0
        L_0x009e:
            float r1 = r10.getX(r0)
            float r0 = r10.getY(r0)
            boolean r2 = r9.l
            if (r2 != 0) goto L_0x00db
            float r2 = r9.x
            float r2 = r0 - r2
            float r3 = java.lang.Math.abs(r2)
            int r4 = r9.p
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x00db
            android.view.View r1 = r9.a((float) r1, (float) r0)
            if (r1 == 0) goto L_0x00db
            r9.l = r7
            float r1 = r9.y
            int r3 = r9.p
            float r3 = (float) r3
            float r1 = r1 - r3
            float r3 = r9.y
            float r3 = r3 + r2
            float r2 = r9.y
            int r4 = r9.p
            float r4 = (float) r4
            float r2 = r2 + r4
            float r2 = java.lang.Math.min(r3, r2)
            float r1 = java.lang.Math.max(r1, r2)
            r9.y = r1
            r8 = 1
        L_0x00db:
            boolean r1 = r9.l
            if (r1 == 0) goto L_0x00e7
            float r1 = r9.y
            float r1 = r0 - r1
            int r1 = (int) r1
            r9.a((int) r1)
        L_0x00e7:
            r9.y = r0
            goto L_0x01d0
        L_0x00eb:
            boolean r0 = r9.l
            r9.l = r8
            if (r0 != 0) goto L_0x0114
            float r0 = r9.w
            float r2 = r9.x
            android.view.View r0 = r9.a((float) r0, (float) r2)
            if (r0 != 0) goto L_0x0114
            float r0 = r10.getX()
            float r2 = r10.getY()
            android.view.View r0 = r9.a((float) r0, (float) r2)
            if (r0 != 0) goto L_0x0114
            com.bytedance.android.livesdk.widget.TTLiveResolverDrawerLayout$b r0 = r9.u
            if (r0 == 0) goto L_0x0114
            r9.a()
            r9.d()
            return r7
        L_0x0114:
            boolean r0 = r9.m
            if (r0 == 0) goto L_0x0140
            float r0 = r10.getX()
            float r2 = r9.w
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r2 = r9.p
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0140
            float r0 = r10.getY()
            float r2 = r9.x
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r2 = r9.p
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0140
            r9.a((int) r8, (float) r1)
            return r7
        L_0x0140:
            android.view.VelocityTracker r0 = r9.s
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2)
            android.view.VelocityTracker r0 = r9.s
            int r2 = r9.z
            float r0 = r0.getYVelocity(r2)
            float r2 = java.lang.Math.abs(r0)
            float r3 = r9.q
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0181
            com.bytedance.android.livesdk.widget.TTLiveResolverDrawerLayout$b r2 = r9.u
            if (r2 == 0) goto L_0x0175
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0175
            float r2 = r9.f18349f
            int r3 = r9.g
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0175
            int r1 = r9.g
            int r2 = r9.h
            int r1 = r1 + r2
            r9.a((int) r1, (float) r0)
            r9.o = r7
            goto L_0x0193
        L_0x0175:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x017b
            r1 = 0
            goto L_0x017d
        L_0x017b:
            int r1 = r9.g
        L_0x017d:
            r9.a((int) r1, (float) r0)
            goto L_0x0193
        L_0x0181:
            float r0 = r9.f18349f
            int r2 = r9.g
            int r2 = r2 / 2
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x018e
            r0 = 0
            goto L_0x0190
        L_0x018e:
            int r0 = r9.g
        L_0x0190:
            r9.a((int) r0, (float) r1)
        L_0x0193:
            r9.d()
            goto L_0x01d0
        L_0x0197:
            float r0 = r10.getX()
            float r1 = r10.getY()
            r9.w = r0
            r9.y = r1
            r9.x = r1
            int r0 = r10.getPointerId(r8)
            r9.z = r0
            float r0 = r9.w
            float r1 = r9.x
            android.view.View r0 = r9.a((float) r0, (float) r1)
            if (r0 == 0) goto L_0x01b7
            r0 = 1
            goto L_0x01b8
        L_0x01b7:
            r0 = 0
        L_0x01b8:
            com.bytedance.android.livesdk.widget.TTLiveResolverDrawerLayout$b r1 = r9.u
            if (r1 != 0) goto L_0x01c3
            int r1 = r9.g
            if (r1 <= 0) goto L_0x01c1
            goto L_0x01c3
        L_0x01c1:
            r1 = 0
            goto L_0x01c4
        L_0x01c3:
            r1 = 1
        L_0x01c4:
            if (r0 == 0) goto L_0x01c9
            if (r1 == 0) goto L_0x01c9
            goto L_0x01ca
        L_0x01c9:
            r7 = 0
        L_0x01ca:
            r9.l = r7
            r9.e()
            r8 = r1
        L_0x01d0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.TTLiveResolverDrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void a(MotionEvent motionEvent) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f18344a, false, 14720, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f18344a, false, 14720, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.z) {
            if (actionIndex != 0) {
                i2 = 0;
            }
            this.w = motionEvent.getX(i2);
            float y2 = motionEvent.getY(i2);
            this.y = y2;
            this.x = y2;
            this.z = motionEvent.getPointerId(i2);
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (PatchProxy.isSupport(new Object[]{view, view2}, this, f18344a, false, 14735, new Class[]{View.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, view2}, this, f18344a, false, 14735, new Class[]{View.class, View.class}, Void.TYPE);
            return;
        }
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && a(view2)) {
            a(0, 0.0f);
        }
    }

    private View b(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f18344a, false, 14731, new Class[]{Float.TYPE, Float.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f18344a, false, 14731, new Class[]{Float.TYPE, Float.TYPE}, View.class);
        }
        View a2 = a(f2, f3);
        float f4 = f2;
        float f5 = f3;
        while (a2 != null) {
            f4 -= a2.getX();
            f5 -= a2.getY();
            if (a2 instanceof AbsListView) {
                return a((ViewGroup) a2, f4, f5);
            }
            if (a2 instanceof ViewGroup) {
                a2 = a((ViewGroup) a2, f4, f5);
            } else {
                a2 = null;
            }
        }
        return a2;
    }

    private View a(float f2, float f3) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f18344a, false, 14729, new Class[]{Float.TYPE, Float.TYPE}, View.class)) {
            return a(this, f2, f3);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f18344a, false, 14729, new Class[]{Float.TYPE, Float.TYPE}, View.class);
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f18344a, false, 14747, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f18344a, false, 14747, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (this.f18346c >= 0) {
            i4 = Math.min(size, this.f18346c);
        } else {
            i4 = size;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i6 = 0;
        while (true) {
            i5 = 8;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (((a) childAt.getLayoutParams()).f18350a && childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, makeMeasureSpec, paddingLeft, makeMeasureSpec2, paddingTop);
                paddingTop += b(childAt);
            }
            i6++;
        }
        int i7 = paddingTop;
        int i8 = 0;
        while (i8 < childCount) {
            View childAt2 = getChildAt(i8);
            if (!((a) childAt2.getLayoutParams()).f18350a && childAt2.getVisibility() != i5) {
                measureChildWithMargins(childAt2, makeMeasureSpec, paddingLeft, makeMeasureSpec2, i7);
                i7 += b(childAt2);
            }
            i8++;
            i5 = 8;
        }
        int i9 = this.g;
        this.g = Math.max(0, (i7 - paddingTop) - getMaxCollapsedHeight());
        this.h = i7 - this.g;
        a(i9, !b());
        this.j = Math.max(0, size2 - i7) + ((int) this.f18349f);
        setMeasuredDimension(size, size2);
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        float f4 = f3;
        if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, f18344a, false, 14742, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, f18344a, false, 14742, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (f4 <= this.q || this.f18349f == 0.0f) {
            return false;
        } else {
            a(0, f4);
            return true;
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        if (PatchProxy.isSupport(new Object[]{view, view2, Integer.valueOf(i2)}, this, f18344a, false, 14738, new Class[]{View.class, View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, view2, Integer.valueOf(i2)}, this, f18344a, false, 14738, new Class[]{View.class, View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (ak.a()) {
            super.onNestedScrollAccepted(view, view2, i2);
        }
        this.k = i2;
    }

    private static View a(ViewGroup viewGroup, float f2, float f3) {
        boolean z2;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Float.valueOf(f2), Float.valueOf(f3)}, null, f18344a, true, 14730, new Class[]{ViewGroup.class, Float.TYPE, Float.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{viewGroup2, Float.valueOf(f2), Float.valueOf(f3)}, null, f18344a, true, 14730, new Class[]{ViewGroup.class, Float.TYPE, Float.TYPE}, View.class);
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup2.getChildAt(childCount);
            if (PatchProxy.isSupport(new Object[]{childAt, Float.valueOf(f2), Float.valueOf(f3)}, null, f18344a, true, 14734, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{childAt, Float.valueOf(f2), Float.valueOf(f3)}, null, f18344a, true, 14734, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            } else {
                float x2 = childAt.getX();
                float y2 = childAt.getY();
                float width = ((float) childAt.getWidth()) + x2;
                float height = ((float) childAt.getHeight()) + y2;
                if (f2 < x2 || f3 < y2 || f2 >= width || f3 >= height) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            if (z2) {
                return childAt;
            }
        }
        return null;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), iArr}, this, f18344a, false, 14741, new Class[]{View.class, Integer.TYPE, Integer.TYPE, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), iArr}, this, f18344a, false, 14741, new Class[]{View.class, Integer.TYPE, Integer.TYPE, int[].class}, Void.TYPE);
            return;
        }
        if (i4 > 0) {
            iArr[1] = (int) (-a(-i4));
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        boolean z3;
        int i2;
        View view2 = view;
        float f4 = f3;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18344a, false, 14744, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z2)}, this, f18344a, false, 14744, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z2)}, this, f18344a, false, 14743, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z2)}, this, f18344a, false, 14743, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!(view2 instanceof RecyclerView) || !z2 || f4 == 0.0f) {
            z3 = z2;
        } else {
            if (f4 < 0.0f) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            z3 = ViewCompat.canScrollVertically(view2, i2);
        }
        if (z3 || Math.abs(f3) <= this.q) {
            return false;
        }
        if (this.u == null || f4 >= 0.0f || this.f18349f <= ((float) this.g)) {
            if (f4 <= 0.0f) {
                i3 = this.g;
            }
            a(i3, f4);
        } else {
            a(this.g + this.h, f4);
            this.o = true;
        }
        return true;
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = i5;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f18344a, false, 14740, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f18344a, false, 14740, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i6 < 0) {
            a(-i6);
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f18344a, false, 14749, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f18344a, false, 14749, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int width = getWidth();
        int i6 = this.j;
        int paddingLeft = getPaddingLeft();
        int paddingRight = width - getPaddingRight();
        int childCount = getChildCount();
        int i7 = i6;
        View view = null;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            a aVar = (a) childAt.getLayoutParams();
            if (aVar.f18352c) {
                view = childAt;
            }
            if (childAt.getVisibility() != 8) {
                int i9 = i7 + aVar.topMargin;
                if (aVar.f18351b) {
                    i9 = (int) (((float) i9) - this.f18349f);
                }
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                int measuredWidth = childAt.getMeasuredWidth();
                int i10 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft;
                childAt.layout(i10, i9, measuredWidth + i10, measuredHeight);
                i7 = measuredHeight + aVar.bottomMargin;
            }
        }
        if (this.t != null) {
            if (view != null) {
                int left = view.getLeft();
                int right = view.getRight();
                int top = view.getTop();
                this.t.setBounds(left, top - this.t.getIntrinsicHeight(), right, top);
                if (this.f18349f > 0.0f) {
                    z3 = true;
                }
                setWillNotDraw(!z3);
                return;
            }
            this.t = null;
            setWillNotDraw(true);
        }
    }
}
