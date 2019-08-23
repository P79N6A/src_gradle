package com.ss.android.ugc.aweme.common.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.p;

public class DragView extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40338a;
    private int A;
    private int B = 120;

    /* renamed from: b  reason: collision with root package name */
    public View f40339b;

    /* renamed from: c  reason: collision with root package name */
    public b f40340c;

    /* renamed from: d  reason: collision with root package name */
    public float f40341d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f40342e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f40343f = 6.0f;
    public float g = 0.3f;
    public float h = 0.3f;
    public int i = 255;
    long j = 250;
    public boolean k;
    public int l = 10;
    public a m;
    int n;
    int o;
    int p;
    int q;
    int r;
    int s;
    private int t = -1;
    private int u = -1;
    private float v;
    private float w;
    private float x;
    private float y;
    private int z;

    public interface a {
        void a();

        void b();

        void c();

        void d();

        void e();
    }

    public static class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40386a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new b[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f40386a, false, 33611, new Class[]{Parcel.class}, b.class)) {
                    return new b(parcel2);
                }
                return (b) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f40386a, false, 33611, new Class[]{Parcel.class}, b.class);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40380a;

        /* renamed from: b  reason: collision with root package name */
        public int f40381b;

        /* renamed from: c  reason: collision with root package name */
        public int f40382c;

        /* renamed from: d  reason: collision with root package name */
        public int f40383d;

        /* renamed from: e  reason: collision with root package name */
        public int f40384e;

        /* renamed from: f  reason: collision with root package name */
        public float f40385f;
        public float g;

        public int describeContents() {
            return 0;
        }

        public b(Parcel parcel) {
            this.f40385f = 0.5f;
            this.g = 1.0f;
            this.f40381b = parcel.readInt();
            this.f40382c = parcel.readInt();
            this.f40383d = parcel.readInt();
            this.f40384e = parcel.readInt();
            this.f40385f = parcel.readFloat();
            this.g = parcel.readFloat();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f40380a, false, 33610, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f40380a, false, 33610, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            parcel.writeInt(this.f40381b);
            parcel.writeInt(this.f40382c);
            parcel.writeInt(this.f40383d);
            parcel.writeInt(this.f40384e);
            parcel.writeFloat(this.f40385f);
            parcel.writeFloat(this.g);
        }

        public b(int i, int i2, int i3, int i4, float f2) {
            this(i, i2, i3, i4, f2, ((float) i3) / ((float) i4));
        }

        public b(int i, int i2, int i3, int i4, float f2, float f3) {
            this.f40385f = 0.5f;
            this.g = 1.0f;
            this.f40381b = i;
            this.f40382c = i2;
            this.f40383d = i4;
            this.f40384e = i3;
            this.f40385f = f2;
            this.g = f3;
        }
    }

    public interface c {
        void a(float f2, float f3);

        void a(float f2, float f3, float f4, float f5);
    }

    public void onGlobalLayout() {
        if (PatchProxy.isSupport(new Object[0], this, f40338a, false, 33595, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40338a, false, 33595, new Class[0], Void.TYPE);
            return;
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40348a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f40348a, false, 33599, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40348a, false, 33599, new Class[0], Void.TYPE);
                    return;
                }
                if (DragView.this.f40339b != null) {
                    DragView dragView = DragView.this;
                    if (PatchProxy.isSupport(new Object[0], dragView, DragView.f40338a, false, 33593, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], dragView, DragView.f40338a, false, 33593, new Class[0], Void.TYPE);
                        return;
                    }
                    dragView.b();
                    ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(dragView.j);
                    AnonymousClass7 r2 = new ValueAnimator.AnimatorUpdateListener(1.0f - dragView.g, 1.0f - dragView.h, (float) (dragView.p - dragView.s), (float) (dragView.q - dragView.r)) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f40366a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ float f40367b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ float f40368c;

                        /* renamed from: d  reason: collision with root package name */
                        final /* synthetic */ float f40369d;

                        /* renamed from: e  reason: collision with root package name */
                        final /* synthetic */ float f40370e;

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f40366a, false, 33605, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f40366a, false, 33605, new Class[]{ValueAnimator.class}, Void.TYPE);
                                return;
                            }
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            DragView.this.f40341d = (this.f40367b * floatValue) + DragView.this.g;
                            DragView.this.f40342e = (this.f40368c * floatValue) + DragView.this.h;
                            DragView.this.i = (int) (255.0f * floatValue);
                            DragView.this.f40343f = DragView.this.f40340c.f40385f * (1.0f - floatValue);
                            DragView.this.a(DragView.this.s + ((int) (this.f40369d * floatValue)), DragView.this.r + ((int) (floatValue * this.f40370e)));
                        }

                        {
                            this.f40367b = r2;
                            this.f40368c = r3;
                            this.f40369d = r4;
                            this.f40370e = r5;
                        }
                    };
                    duration.addUpdateListener(r2);
                    duration.addListener(new AnimatorListenerAdapter() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f40372a;

                        public final void onAnimationEnd(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f40372a, false, 33607, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f40372a, false, 33607, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            super.onAnimationEnd(animator);
                            if (DragView.this.m != null) {
                                DragView.this.m.c();
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f40372a, false, 33606, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f40372a, false, 33606, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            super.onAnimationStart(animator);
                            DragView.this.f40339b.setVisibility(0);
                            if (DragView.this.m != null) {
                                DragView.this.m.a();
                            }
                        }
                    });
                    duration.start();
                }
            }
        }, 50);
    }

    private boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f40338a, false, 33584, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40338a, false, 33584, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (p.a().e() == null || (p.a().e().getWindow().getAttributes().flags & 1024) != 1024) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f40338a, false, 33597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40338a, false, 33597, new Class[0], Void.TYPE);
            return;
        }
        if (this.f40340c != null) {
            a(this.f40340c.f40381b, this.f40340c.f40382c, this.f40340c.f40383d, this.f40340c.f40384e, this.f40340c.g);
            this.l = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40338a, false, 33591, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40338a, false, 33591, new Class[0], Void.TYPE);
            return;
        }
        this.k = c();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(this.j);
        final float f2 = this.f40341d - this.g;
        final float f3 = this.f40342e - this.h;
        final float f4 = (float) this.i;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f40339b.getLayoutParams();
        int i2 = layoutParams.leftMargin;
        int i3 = layoutParams.topMargin;
        final int i4 = i2 - this.f40340c.f40381b;
        final int i5 = i3 - this.f40340c.f40382c;
        final int c2 = com.ss.android.ugc.aweme.base.utils.p.c();
        AnonymousClass3 r3 = new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40350a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f40350a, false, 33600, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f40350a, false, 33600, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DragView.this.f40341d = (f2 * floatValue) + DragView.this.g;
                DragView.this.f40342e = (f3 * floatValue) + DragView.this.h;
                DragView.this.i = (int) (f4 * floatValue);
                int i = (int) ((((float) i4) * floatValue) + ((float) DragView.this.f40340c.f40381b));
                int i2 = (int) ((((float) i5) * floatValue) + ((float) DragView.this.f40340c.f40382c));
                if (!DragView.this.k) {
                    i2 = (int) (((float) i2) - ((1.0f - floatValue) * ((float) c2)));
                }
                DragView.this.f40343f = DragView.this.f40340c.f40385f * (1.0f - floatValue);
                DragView.this.a(i, i2);
            }
        };
        duration.addUpdateListener(r3);
        duration.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40356a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f40356a, false, 33601, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f40356a, false, 33601, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                DragView.this.f40339b.setVisibility(8);
                DragView.this.m.e();
            }

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f40356a, false, 33602, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f40356a, false, 33602, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationStart(animator);
                if (DragView.this.m != null) {
                    DragView.this.m.b();
                }
            }
        });
        duration.start();
    }

    public void setAnimatorDuration(int i2) {
        this.j = (long) i2;
    }

    public void setDragStateListener(a aVar) {
        this.m = aVar;
    }

    public void setDragThreshold(int i2) {
        this.B = i2;
    }

    public DragView(@NonNull Context context) {
        super(context);
        setBackgroundColor(-16777216);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0103, code lost:
        if (r0 != false) goto L_0x0105;
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
            com.meituan.robust.ChangeQuickRedirect r2 = f40338a
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 33586(0x8332, float:4.7064E-41)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f40338a
            r3 = 0
            r4 = 33586(0x8332, float:4.7064E-41)
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
            int r0 = r17.getActionIndex()
            int r0 = r7.getPointerId(r0)
            int r1 = r17.getActionMasked()
            r2 = 5
            r9 = 2
            if (r1 != r2) goto L_0x0055
            int r1 = r11.u
            if (r1 != 0) goto L_0x0055
            r11.t = r9
        L_0x0055:
            int r1 = r17.getActionMasked()
            r11.u = r1
            android.view.View r1 = r11.f40339b
            float r1 = r1.getScaleX()
            r10 = 255(0xff, float:3.57E-43)
            r13 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x0234
            if (r0 != 0) goto L_0x0234
            int r0 = r11.t
            if (r0 == r9) goto L_0x0234
            int r0 = r17.getAction()
            if (r0 == 0) goto L_0x01f6
            if (r0 == r9) goto L_0x0079
            goto L_0x0234
        L_0x0079:
            int r0 = r11.t
            if (r0 == r12) goto L_0x0105
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f40338a
            r3 = 0
            r4 = 33585(0x8331, float:4.7063E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00b6
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f40338a
            r3 = 0
            r4 = 33585(0x8331, float:4.7063E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r16
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0103
        L_0x00b6:
            float r0 = r17.getX()
            float r1 = r11.v
            float r0 = r0 - r1
            float r1 = r17.getY()
            float r2 = r11.w
            float r1 = r1 - r2
            float r2 = java.lang.Math.abs(r1)
            int r3 = r11.l
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x00dd
            float r2 = java.lang.Math.abs(r0)
            int r3 = r11.l
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            r0 = 0
            goto L_0x0103
        L_0x00dd:
            float r0 = java.lang.Math.abs(r0)
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00eb
            r0 = 1
            goto L_0x00ec
        L_0x00eb:
            r0 = 0
        L_0x00ec:
            if (r0 == 0) goto L_0x0101
            int r1 = r11.t
            if (r1 == r12) goto L_0x00fe
            float r1 = r17.getX()
            r11.v = r1
            float r1 = r17.getY()
            r11.w = r1
        L_0x00fe:
            r11.t = r12
            goto L_0x0103
        L_0x0101:
            r11.t = r8
        L_0x0103:
            if (r0 == 0) goto L_0x0234
        L_0x0105:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f40338a
            r3 = 0
            r4 = 33588(0x8334, float:4.7067E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0138
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f40338a
            r3 = 0
            r4 = 33588(0x8334, float:4.7067E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01f5
        L_0x0138:
            float r0 = r17.getY()
            float r1 = r17.getX()
            float r2 = r11.v
            float r1 = r1 - r2
            r11.y = r1
            float r1 = r11.w
            float r0 = r0 - r1
            r11.x = r0
            float r0 = r11.x
            int r1 = r11.B
            float r1 = (float) r1
            float r0 = r0 / r1
            float r1 = r11.f40341d
            float r2 = r11.g
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0168
            float r1 = r11.f40341d
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 > 0) goto L_0x0168
            float r1 = r11.g
            float r1 = r13 - r1
            float r1 = r1 * r0
            float r1 = r13 - r1
            r11.f40341d = r1
        L_0x0168:
            float r1 = r11.f40342e
            float r2 = r11.h
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0180
            float r1 = r11.f40342e
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 > 0) goto L_0x0180
            float r1 = r11.h
            float r1 = r13 - r1
            float r1 = r1 * r0
            float r1 = r13 - r1
            r11.f40342e = r1
        L_0x0180:
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r13 - r0
            float r0 = r0 * r1
            int r0 = (int) r0
            r11.i = r0
            int r0 = r11.i
            if (r0 <= r10) goto L_0x0190
            r11.i = r10
            goto L_0x0198
        L_0x0190:
            int r0 = r11.i
            r1 = 153(0x99, float:2.14E-43)
            if (r0 > r1) goto L_0x0198
            r11.i = r1
        L_0x0198:
            float r0 = r11.f40341d
            float r1 = r11.g
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a5
            float r0 = r11.g
            r11.f40341d = r0
            goto L_0x01ad
        L_0x01a5:
            float r0 = r11.f40341d
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ad
            r11.f40341d = r13
        L_0x01ad:
            float r0 = r11.f40342e
            float r1 = r11.h
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01ba
            float r0 = r11.h
            r11.f40342e = r0
            goto L_0x01c2
        L_0x01ba:
            float r0 = r11.f40342e
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c2
            r11.f40342e = r13
        L_0x01c2:
            float r0 = r11.y
            float r1 = r11.v
            float r2 = r11.f40341d
            float r2 = r13 - r2
            float r1 = r1 * r2
            float r0 = r0 + r1
            int r1 = r11.p
            float r1 = (float) r1
            float r2 = r11.f40341d
            float r1 = r1 * r2
            float r0 = r0 + r1
            int r0 = (int) r0
            float r1 = r11.x
            float r2 = r11.w
            float r3 = r11.f40342e
            float r13 = r13 - r3
            float r2 = r2 * r13
            float r1 = r1 + r2
            int r2 = r11.q
            float r2 = (float) r2
            float r3 = r11.f40342e
            float r2 = r2 * r3
            float r1 = r1 + r2
            int r1 = (int) r1
            com.ss.android.ugc.aweme.common.widget.DragView$a r2 = r11.m
            if (r2 == 0) goto L_0x01f2
            com.ss.android.ugc.aweme.common.widget.DragView$a r2 = r11.m
            r2.d()
        L_0x01f2:
            r11.a(r0, r1)
        L_0x01f5:
            return r12
        L_0x01f6:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f40338a
            r3 = 0
            r4 = 33587(0x8333, float:4.7065E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0228
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f40338a
            r3 = 0
            r4 = 33587(0x8333, float:4.7065E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0234
        L_0x0228:
            float r0 = r17.getX()
            r11.v = r0
            float r0 = r17.getY()
            r11.w = r0
        L_0x0234:
            int r0 = r17.getActionMasked()
            if (r0 == r12) goto L_0x0241
            int r0 = r17.getActionMasked()
            r1 = 3
            if (r0 != r1) goto L_0x025f
        L_0x0241:
            r0 = -1
            r11.t = r0
            float r0 = r11.x
            float r0 = java.lang.Math.abs(r0)
            int r1 = r11.l
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0264
            float r0 = r11.y
            float r0 = java.lang.Math.abs(r0)
            int r1 = r11.l
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x025f
            goto L_0x0264
        L_0x025f:
            boolean r0 = super.dispatchTouchEvent(r17)
            return r0
        L_0x0264:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f40338a
            r3 = 0
            r4 = 33589(0x8335, float:4.7068E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x028b
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f40338a
            r3 = 0
            r4 = 33589(0x8335, float:4.7068E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x03c0
        L_0x028b:
            float r0 = r11.x
            int r1 = r11.B
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0327
            float r0 = r11.f40342e
            float r1 = r11.h
            r2 = 1008981770(0x3c23d70a, float:0.01)
            float r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0327
            float r0 = r11.f40341d
            float r1 = r11.g
            float r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x02ab
            goto L_0x0327
        L_0x02ab:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f40338a
            r3 = 0
            r4 = 33592(0x8338, float:4.7072E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02d2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f40338a
            r3 = 0
            r4 = 33592(0x8338, float:4.7072E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x03c0
        L_0x02d2:
            float[] r0 = new float[r9]
            r0 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            long r1 = r11.j
            android.animation.ValueAnimator r14 = r0.setDuration(r1)
            float r0 = r11.f40341d
            float r2 = r13 - r0
            float r3 = r11.f40341d
            float r0 = r11.f40342e
            float r4 = r13 - r0
            float r5 = r11.f40342e
            android.view.View r0 = r11.f40339b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r0.topMargin
            int r0 = r0.leftMargin
            int r6 = r11.q
            int r1 = r1 - r6
            float r9 = (float) r1
            int r1 = r11.p
            int r0 = r0 - r1
            float r8 = (float) r0
            int r7 = r11.i
            int r0 = r11.i
            int r6 = 255 - r0
            com.ss.android.ugc.aweme.common.widget.DragView$5 r10 = new com.ss.android.ugc.aweme.common.widget.DragView$5
            r0 = r10
            r1 = r16
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r14.addUpdateListener(r10)
            com.ss.android.ugc.aweme.common.widget.DragView$6 r0 = new com.ss.android.ugc.aweme.common.widget.DragView$6
            r0.<init>()
            r14.addListener(r0)
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            r14.setInterpolator(r0)
            r14.start()
            goto L_0x03c0
        L_0x0327:
            com.ss.android.ugc.aweme.common.widget.DragView$b r0 = r11.f40340c
            if (r0 != 0) goto L_0x03bd
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f40338a
            r3 = 0
            r4 = 33594(0x833a, float:4.7075E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0351
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f40338a
            r3 = 0
            r4 = 33594(0x833a, float:4.7075E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x03c0
        L_0x0351:
            float r0 = r11.f40341d
            r1 = 1063675494(0x3f666666, float:0.9)
            float r3 = r0 * r1
            float r0 = r11.f40342e
            float r5 = r0 * r1
            float[] r0 = new float[r9]
            r0 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            long r1 = r11.j
            android.animation.ValueAnimator r13 = r0.setDuration(r1)
            float r0 = r11.f40341d
            float r2 = r0 - r3
            float r0 = r11.f40341d
            float r4 = r0 - r5
            int r0 = r11.i
            float r6 = (float) r0
            android.view.View r0 = r11.f40339b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r0.topMargin
            int r0 = r0.leftMargin
            int r7 = r16.getWidth()
            float r7 = (float) r7
            int r8 = r11.o
            float r8 = (float) r8
            float r8 = r8 * r3
            float r7 = r7 - r8
            r8 = 1073741824(0x40000000, float:2.0)
            float r9 = r7 / r8
            int r7 = r16.getHeight()
            float r7 = (float) r7
            int r10 = r11.n
            float r10 = (float) r10
            float r10 = r10 * r5
            float r7 = r7 - r10
            float r10 = r7 / r8
            float r0 = (float) r0
            float r7 = r0 - r9
            float r0 = (float) r1
            float r14 = r0 - r10
            com.ss.android.ugc.aweme.common.widget.DragView$9 r15 = new com.ss.android.ugc.aweme.common.widget.DragView$9
            r0 = r15
            r1 = r16
            r8 = r9
            r9 = r14
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r13.addUpdateListener(r15)
            r13.start()
            com.ss.android.ugc.aweme.common.widget.DragView$10 r0 = new com.ss.android.ugc.aweme.common.widget.DragView$10
            r0.<init>()
            r13.addListener(r0)
            goto L_0x03c0
        L_0x03bd:
            r16.a()
        L_0x03c0:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.DragView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public DragView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundColor(-16777216);
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40338a, false, 33590, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40338a, false, 33590, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f40339b.getLayoutParams();
        layoutParams.width = (int) (((float) this.o) * this.f40341d);
        layoutParams.height = (int) (((float) this.n) * this.f40342e);
        layoutParams.topMargin = i3;
        layoutParams.leftMargin = i2;
        if (this.f40339b instanceof c) {
            ((c) this.f40339b).a(this.f40341d, (this.f40341d - this.g) / (1.0f - this.g));
            ((c) this.f40339b).a((float) layoutParams.width, (float) layoutParams.height, (float) layoutParams.leftMargin, (float) layoutParams.topMargin);
        }
        this.f40339b.setLayoutParams(layoutParams);
        setBackgroundColor(this.i << 24);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f40339b.invalidateOutline();
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f40338a, false, 33582, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f40338a, false, 33582, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        this.z = i2;
        this.A = i3;
        b();
    }

    private void a(int i2, int i3, int i4, int i5, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Float.valueOf(f2)}, this, f40338a, false, 33596, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Float.valueOf(f2)}, this, f40338a, false, 33596, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        if (((float) getHeight()) / ((float) getWidth()) > f2) {
            this.n = (int) (((float) getWidth()) * f2);
            this.o = getWidth();
            this.p = 0;
            this.q = (getHeight() - this.n) / 2;
        } else {
            this.n = getHeight();
            this.o = (int) (((float) getHeight()) / f2);
            this.p = (getWidth() - this.o) / 2;
            this.q = 0;
        }
        this.r = i3 - iArr[1];
        this.s = i2 - iArr[0];
        this.g = ((float) i4) / ((float) this.o);
        this.h = ((float) i5) / ((float) this.n);
    }
}
