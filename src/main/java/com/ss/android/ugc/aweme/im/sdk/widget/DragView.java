package com.ss.android.ugc.aweme.im.sdk.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class DragView extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52729a;
    private boolean A = true;

    /* renamed from: b  reason: collision with root package name */
    View f52730b;

    /* renamed from: c  reason: collision with root package name */
    public View f52731c;

    /* renamed from: d  reason: collision with root package name */
    b f52732d;

    /* renamed from: e  reason: collision with root package name */
    float f52733e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    float f52734f = 1.0f;
    public float g = 6.0f;
    float h = 0.3f;
    float i = 0.3f;
    int j = 255;
    long k = 250;
    boolean l;
    public int m = 10;
    public a n;
    int o;
    int p;
    int q;
    int r;
    int s;
    int t;
    private int u = -1;
    private float v;
    private float w;
    private float x;
    private float y;
    private int z = 120;

    public interface a {
        void a();

        void a(ValueAnimator valueAnimator);

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    public static class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52751a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new b[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f52751a, false, 54085, new Class[]{Parcel.class}, b.class)) {
                    return new b(parcel2);
                }
                return (b) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f52751a, false, 54085, new Class[]{Parcel.class}, b.class);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52745a;

        /* renamed from: b  reason: collision with root package name */
        public int f52746b;

        /* renamed from: c  reason: collision with root package name */
        public int f52747c;

        /* renamed from: d  reason: collision with root package name */
        public int f52748d;

        /* renamed from: e  reason: collision with root package name */
        public int f52749e;

        /* renamed from: f  reason: collision with root package name */
        public float f52750f = 0.5f;
        public float g = 1.0f;

        public int describeContents() {
            return 0;
        }

        public b(Parcel parcel) {
            this.f52746b = parcel.readInt();
            this.f52747c = parcel.readInt();
            this.f52748d = parcel.readInt();
            this.f52749e = parcel.readInt();
            this.f52750f = parcel.readFloat();
            this.g = parcel.readFloat();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f52745a, false, 54084, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f52745a, false, 54084, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            parcel.writeInt(this.f52746b);
            parcel.writeInt(this.f52747c);
            parcel.writeInt(this.f52748d);
            parcel.writeInt(this.f52749e);
            parcel.writeFloat(this.f52750f);
            parcel.writeFloat(this.g);
        }

        public b(int i, int i2, int i3, int i4, float f2, float f3) {
            this.f52746b = i;
            this.f52747c = i2;
            this.f52748d = i4;
            this.f52749e = i3;
            this.f52750f = f2;
            this.g = f3;
        }
    }

    public int getFullHeight() {
        return this.o;
    }

    public int getFullWidth() {
        return this.p;
    }

    public void onGlobalLayout() {
        if (PatchProxy.isSupport(new Object[0], this, f52729a, false, 54069, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52729a, false, 54069, new Class[0], Void.TYPE);
            return;
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        postDelayed(new e(this), 50);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f52729a, false, 54065, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52729a, false, 54065, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(this.k);
        float f2 = this.f52733e - this.h;
        float f3 = this.f52734f - this.i;
        float f4 = (float) this.j;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f52731c.getLayoutParams();
        a aVar = new a(this, f2, f3, f4, layoutParams.leftMargin - this.f52732d.f52746b, layoutParams.topMargin - this.f52732d.f52747c);
        duration.addUpdateListener(aVar);
        duration.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52737a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f52737a, false, 54078, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f52737a, false, 54078, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                DragView.this.f52731c.setVisibility(8);
                if (DragView.this.n != null) {
                    DragView.this.n.f();
                }
            }

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f52737a, false, 54079, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f52737a, false, 54079, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationStart(animator);
                if (DragView.this.n != null) {
                    DragView.this.n.b();
                }
            }
        });
        duration.start();
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f52729a, false, 54071, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52729a, false, 54071, new Class[0], Void.TYPE);
            return;
        }
        if (this.f52732d != null) {
            a(this.f52732d.f52746b, this.f52732d.f52747c, this.f52732d.f52748d, this.f52732d.f52749e, this.f52732d.g);
            this.m = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        }
    }

    public void setAnimatorDuration(int i2) {
        this.k = (long) i2;
    }

    public void setDragStateListener(a aVar) {
        this.n = aVar;
    }

    public void setDragThreshold(int i2) {
        this.z = i2;
    }

    public void setFullScreenWindow(boolean z2) {
        this.l = z2;
    }

    public DragView(@NonNull Context context) {
        super(context);
        setBackgroundColor(-16777216);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f9, code lost:
        if (r0 != false) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r11 = r16
            r7 = r17
            r12 = 1
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r8 = 0
            r0[r8] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f52729a
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 54060(0xd32c, float:7.5754E-41)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f52729a
            r3 = 0
            r4 = 54060(0xd32c, float:7.5754E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r16
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003f:
            int r0 = r17.getActionMasked()
            r1 = 5
            r9 = 2
            if (r0 != r1) goto L_0x0049
            r11.u = r9
        L_0x0049:
            int r0 = r17.getActionIndex()
            int r0 = r7.getPointerId(r0)
            android.view.View r1 = r11.f52731c
            float r1 = r1.getScaleX()
            r10 = 255(0xff, float:3.57E-43)
            r13 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x0271
            if (r0 != 0) goto L_0x0271
            int r0 = r11.u
            if (r0 == r9) goto L_0x0271
            int r0 = r17.getAction()
            if (r0 == 0) goto L_0x0233
            if (r0 == r9) goto L_0x006f
            goto L_0x0271
        L_0x006f:
            int r0 = r11.u
            if (r0 == r12) goto L_0x00fb
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f52729a
            r3 = 0
            r4 = 54059(0xd32b, float:7.5753E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00ac
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f52729a
            r3 = 0
            r4 = 54059(0xd32b, float:7.5753E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r16
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x00f9
        L_0x00ac:
            float r0 = r17.getX()
            float r1 = r11.v
            float r0 = r0 - r1
            float r1 = r17.getY()
            float r2 = r11.w
            float r1 = r1 - r2
            float r2 = java.lang.Math.abs(r1)
            int r3 = r11.m
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x00d3
            float r2 = java.lang.Math.abs(r0)
            int r3 = r11.m
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r0 = 0
            goto L_0x00f9
        L_0x00d3:
            float r0 = java.lang.Math.abs(r0)
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e1
            r0 = 1
            goto L_0x00e2
        L_0x00e1:
            r0 = 0
        L_0x00e2:
            if (r0 == 0) goto L_0x00f7
            int r1 = r11.u
            if (r1 == r12) goto L_0x00f4
            float r1 = r17.getX()
            r11.v = r1
            float r1 = r17.getY()
            r11.w = r1
        L_0x00f4:
            r11.u = r12
            goto L_0x00f9
        L_0x00f7:
            r11.u = r8
        L_0x00f9:
            if (r0 == 0) goto L_0x0271
        L_0x00fb:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f52729a
            r3 = 0
            r4 = 54062(0xd32e, float:7.5757E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x012e
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f52729a
            r3 = 0
            r4 = 54062(0xd32e, float:7.5757E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0232
        L_0x012e:
            boolean r0 = r11.A
            if (r0 == 0) goto L_0x013d
            r11.A = r8
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$a r0 = r11.n
            if (r0 == 0) goto L_0x013d
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$a r0 = r11.n
            r0.d()
        L_0x013d:
            float r0 = r17.getY()
            float r1 = r17.getX()
            float r2 = r11.v
            float r1 = r1 - r2
            r11.y = r1
            float r1 = r11.w
            float r0 = r0 - r1
            r11.x = r0
            float r0 = r11.x
            int r1 = r11.z
            float r1 = (float) r1
            float r0 = r0 / r1
            float r1 = r11.f52733e
            float r2 = r11.h
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x016d
            float r1 = r11.f52733e
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 > 0) goto L_0x016d
            float r1 = r11.h
            float r1 = r13 - r1
            float r1 = r1 * r0
            float r1 = r13 - r1
            r11.f52733e = r1
        L_0x016d:
            float r1 = r11.f52734f
            float r2 = r11.i
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0185
            float r1 = r11.f52734f
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 > 0) goto L_0x0185
            float r1 = r11.i
            float r1 = r13 - r1
            float r1 = r1 * r0
            float r1 = r13 - r1
            r11.f52734f = r1
        L_0x0185:
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r13 - r0
            float r0 = r0 * r1
            int r0 = (int) r0
            r11.j = r0
            int r0 = r11.j
            if (r0 <= r10) goto L_0x0195
            r11.j = r10
            goto L_0x019d
        L_0x0195:
            int r0 = r11.j
            r1 = 26
            if (r0 > r1) goto L_0x019d
            r11.j = r1
        L_0x019d:
            float r0 = r11.h
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b9
            float r0 = r11.f52733e
            float r1 = r11.h
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b0
            float r0 = r11.h
            r11.f52733e = r0
            goto L_0x01ce
        L_0x01b0:
            float r0 = r11.f52733e
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ce
            r11.f52733e = r13
            goto L_0x01ce
        L_0x01b9:
            float r0 = r11.f52733e
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x01c2
            r11.f52733e = r13
            goto L_0x01ce
        L_0x01c2:
            float r0 = r11.f52733e
            float r1 = r11.h
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ce
            float r0 = r11.h
            r11.f52733e = r0
        L_0x01ce:
            float r0 = r11.i
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x01ea
            float r0 = r11.f52734f
            float r1 = r11.i
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01e1
            float r0 = r11.i
            r11.f52734f = r0
            goto L_0x01ff
        L_0x01e1:
            float r0 = r11.f52734f
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ff
            r11.f52734f = r13
            goto L_0x01ff
        L_0x01ea:
            float r0 = r11.f52734f
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x01f3
            r11.f52734f = r13
            goto L_0x01ff
        L_0x01f3:
            float r0 = r11.f52734f
            float r1 = r11.i
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ff
            float r0 = r11.i
            r11.f52734f = r0
        L_0x01ff:
            float r0 = r11.y
            float r1 = r11.v
            float r2 = r11.f52733e
            float r2 = r13 - r2
            float r1 = r1 * r2
            float r0 = r0 + r1
            int r1 = r11.q
            float r1 = (float) r1
            float r2 = r11.f52733e
            float r1 = r1 * r2
            float r0 = r0 + r1
            int r0 = (int) r0
            float r1 = r11.x
            float r2 = r11.w
            float r3 = r11.f52734f
            float r13 = r13 - r3
            float r2 = r2 * r13
            float r1 = r1 + r2
            int r2 = r11.r
            float r2 = (float) r2
            float r3 = r11.f52734f
            float r2 = r2 * r3
            float r1 = r1 + r2
            int r1 = (int) r1
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$a r2 = r11.n
            if (r2 == 0) goto L_0x022f
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$a r2 = r11.n
            r2.e()
        L_0x022f:
            r11.a(r0, r1)
        L_0x0232:
            return r12
        L_0x0233:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f52729a
            r3 = 0
            r4 = 54061(0xd32d, float:7.5756E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0265
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f52729a
            r3 = 0
            r4 = 54061(0xd32d, float:7.5756E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0271
        L_0x0265:
            float r0 = r17.getX()
            r11.v = r0
            float r0 = r17.getY()
            r11.w = r0
        L_0x0271:
            int r0 = r17.getActionMasked()
            if (r0 == r12) goto L_0x027e
            int r0 = r17.getActionMasked()
            r1 = 3
            if (r0 != r1) goto L_0x029e
        L_0x027e:
            r11.A = r12
            r0 = -1
            r11.u = r0
            float r0 = r11.x
            float r0 = java.lang.Math.abs(r0)
            int r1 = r11.m
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x02a3
            float r0 = r11.y
            float r0 = java.lang.Math.abs(r0)
            int r1 = r11.m
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x029e
            goto L_0x02a3
        L_0x029e:
            boolean r0 = super.dispatchTouchEvent(r17)
            return r0
        L_0x02a3:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f52729a
            r3 = 0
            r4 = 54063(0xd32f, float:7.5758E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02ca
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f52729a
            r3 = 0
            r4 = 54063(0xd32f, float:7.5758E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0404
        L_0x02ca:
            float r0 = r11.x
            int r1 = r11.z
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0366
            float r0 = r11.f52734f
            float r1 = r11.i
            r2 = 1008981770(0x3c23d70a, float:0.01)
            float r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0366
            float r0 = r11.f52733e
            float r1 = r11.h
            float r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x02ea
            goto L_0x0366
        L_0x02ea:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f52729a
            r3 = 0
            r4 = 54066(0xd332, float:7.5763E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0311
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f52729a
            r3 = 0
            r4 = 54066(0xd332, float:7.5763E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x03ff
        L_0x0311:
            float[] r0 = new float[r9]
            r0 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            long r1 = r11.k
            android.animation.ValueAnimator r14 = r0.setDuration(r1)
            float r0 = r11.f52733e
            float r2 = r13 - r0
            float r3 = r11.f52733e
            float r0 = r11.f52734f
            float r4 = r13 - r0
            float r5 = r11.f52734f
            android.view.View r0 = r11.f52731c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r0.topMargin
            int r0 = r0.leftMargin
            int r6 = r11.r
            int r1 = r1 - r6
            float r9 = (float) r1
            int r1 = r11.q
            int r0 = r0 - r1
            float r8 = (float) r0
            int r7 = r11.j
            int r0 = r11.j
            int r6 = 255 - r0
            com.ss.android.ugc.aweme.im.sdk.widget.b r10 = new com.ss.android.ugc.aweme.im.sdk.widget.b
            r0 = r10
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r14.addUpdateListener(r10)
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$3 r0 = new com.ss.android.ugc.aweme.im.sdk.widget.DragView$3
            r0.<init>()
            r14.addListener(r0)
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            r14.setInterpolator(r0)
            r14.start()
            goto L_0x03ff
        L_0x0366:
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$b r0 = r11.f52732d
            if (r0 != 0) goto L_0x03fc
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f52729a
            r3 = 0
            r4 = 54068(0xd334, float:7.5765E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0390
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f52729a
            r3 = 0
            r4 = 54068(0xd334, float:7.5765E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x03ff
        L_0x0390:
            float r0 = r11.f52733e
            r1 = 1063675494(0x3f666666, float:0.9)
            float r3 = r0 * r1
            float r0 = r11.f52734f
            float r5 = r0 * r1
            float[] r0 = new float[r9]
            r0 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            long r1 = r11.k
            android.animation.ValueAnimator r13 = r0.setDuration(r1)
            float r0 = r11.f52733e
            float r2 = r0 - r3
            float r0 = r11.f52733e
            float r4 = r0 - r5
            int r0 = r11.j
            float r6 = (float) r0
            android.view.View r0 = r11.f52731c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r0.topMargin
            int r0 = r0.leftMargin
            int r7 = r16.getWidth()
            float r7 = (float) r7
            int r8 = r11.p
            float r8 = (float) r8
            float r8 = r8 * r3
            float r7 = r7 - r8
            r8 = 1073741824(0x40000000, float:2.0)
            float r9 = r7 / r8
            int r7 = r16.getHeight()
            float r7 = (float) r7
            int r10 = r11.o
            float r10 = (float) r10
            float r10 = r10 * r5
            float r7 = r7 - r10
            float r10 = r7 / r8
            float r0 = (float) r0
            float r7 = r0 - r9
            float r0 = (float) r1
            float r14 = r0 - r10
            com.ss.android.ugc.aweme.im.sdk.widget.d r15 = new com.ss.android.ugc.aweme.im.sdk.widget.d
            r0 = r15
            r1 = r16
            r8 = r9
            r9 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r13.addUpdateListener(r15)
            r13.start()
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$5 r0 = new com.ss.android.ugc.aweme.im.sdk.widget.DragView$5
            r0.<init>()
            r13.addListener(r0)
            goto L_0x03ff
        L_0x03fc:
            r16.a()
        L_0x03ff:
            r0 = 0
            r11.y = r0
            r11.x = r0
        L_0x0404:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.widget.DragView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public DragView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundColor(-16777216);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f52729a, false, 54064, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f52729a, false, 54064, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f52731c.getLayoutParams();
        layoutParams.width = (int) (((float) this.p) * this.f52733e);
        layoutParams.height = (int) (((float) this.o) * this.f52734f);
        layoutParams.topMargin = i3;
        layoutParams.leftMargin = i2;
        this.f52731c.setLayoutParams(layoutParams);
        setBackgroundColor(this.j << 24);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f52731c.invalidateOutline();
        }
    }

    public final void a(View view, View view2, b bVar) {
        View view3 = view;
        View view4 = view2;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{view3, view4, bVar2}, this, f52729a, false, 54058, new Class[]{View.class, View.class, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view3, view4, bVar2}, this, f52729a, false, 54058, new Class[]{View.class, View.class, b.class}, Void.TYPE);
            return;
        }
        if (!(view3 == null || view4 == null || bVar2 == null)) {
            this.f52731c = view4;
            this.f52730b = view3;
            this.f52732d = bVar2;
            this.g = bVar2.f52750f;
            getViewTreeObserver().addOnGlobalLayoutListener(this);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f52731c.getLayoutParams();
            marginLayoutParams.height = bVar2.f52749e;
            marginLayoutParams.width = bVar2.f52748d;
            marginLayoutParams.leftMargin = bVar2.f52746b;
            marginLayoutParams.topMargin = bVar2.f52747c;
            this.f52731c.setLayoutParams(marginLayoutParams);
            if (Build.VERSION.SDK_INT >= 21) {
                this.f52731c.setOutlineProvider(new ViewOutlineProvider() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f52735a;

                    @RequiresApi(api = 21)
                    public final void getOutline(View view, Outline outline) {
                        if (PatchProxy.isSupport(new Object[]{view, outline}, this, f52735a, false, 54077, new Class[]{View.class, Outline.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view, outline}, this, f52735a, false, 54077, new Class[]{View.class, Outline.class}, Void.TYPE);
                            return;
                        }
                        float max = Math.max(DragView.this.g, 0.5f);
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), max);
                    }
                });
                this.f52731c.setClipToOutline(true);
                this.f52731c.setVisibility(4);
            }
            addView(this.f52730b);
            this.j = 0;
            setBackgroundColor(this.j << 24);
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f52729a, false, 54057, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f52729a, false, 54057, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        b();
    }

    private void a(int i2, int i3, int i4, int i5, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Float.valueOf(f2)}, this, f52729a, false, 54070, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Float.valueOf(f2)}, this, f52729a, false, 54070, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        float f3 = 1.0f / f2;
        int width = getWidth();
        int height = getHeight();
        if (f3 > 0.625f) {
            this.p = width;
            this.o = (int) ((((float) width) / f3) + 0.5f);
            this.r = (height - this.o) / 2;
            this.q = 0;
        } else {
            this.o = height;
            this.p = (int) ((((float) height) * f3) + 0.5f);
            this.q = (width - this.p) / 2;
            this.r = 0;
        }
        this.s = i3 - iArr[1];
        this.t = i2 - iArr[0];
        this.h = ((float) i4) / ((float) this.p);
        this.i = ((float) i5) / ((float) this.o);
    }
}
