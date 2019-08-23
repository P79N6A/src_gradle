package com.ss.android.ugc.aweme.commerce.preview.refresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.R$styleable;

public class PtrFrameLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37601a;

    /* renamed from: b  reason: collision with root package name */
    protected View f37602b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f37603c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f37604d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f37605e;

    /* renamed from: f  reason: collision with root package name */
    public c f37606f;
    private byte g;
    private int h;
    private int i;
    private int j;
    private int k;
    private View l;
    private d m;
    private com.ss.android.ugc.aweme.commerce.preview.refresh.a.a n;
    private c o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private MotionEvent t;
    private e u;
    private int v;
    private long w;
    private boolean x;
    private Runnable y;

    public static class a extends ViewGroup.MarginLayoutParams {
        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i, int i2) {
            super(-1, i2);
        }
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37609a;

        /* renamed from: b  reason: collision with root package name */
        long f37610b;

        /* renamed from: c  reason: collision with root package name */
        long f37611c;

        /* renamed from: d  reason: collision with root package name */
        int f37612d;

        /* renamed from: e  reason: collision with root package name */
        int f37613e;

        /* renamed from: f  reason: collision with root package name */
        int f37614f;
        public boolean g;

        public final void a() {
            this.f37610b = 0;
            this.f37611c = 0;
            this.f37612d = 0;
            this.f37613e = 0;
            this.f37614f = 0;
            this.g = false;
        }

        private b() {
        }

        /* synthetic */ b(PtrFrameLayout ptrFrameLayout, byte b2) {
            this();
        }

        public final void a(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f37609a, false, 29153, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f37609a, false, 29153, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f37612d = i;
            this.f37613e = i2;
            this.f37610b = System.currentTimeMillis();
            this.f37611c = this.f37610b;
            this.f37614f = this.f37612d;
            this.g = false;
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37615a;

        /* renamed from: b  reason: collision with root package name */
        b f37616b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f37617c;

        /* renamed from: e  reason: collision with root package name */
        private int f37619e;

        /* access modifiers changed from: package-private */
        public void a() {
            if (PatchProxy.isSupport(new Object[0], this, f37615a, false, 29157, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37615a, false, 29157, new Class[0], Void.TYPE);
                return;
            }
            this.f37617c = false;
            PtrFrameLayout.this.removeCallbacks(this);
        }

        public final void run() {
            int i;
            if (PatchProxy.isSupport(new Object[0], this, f37615a, false, 29155, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37615a, false, 29155, new Class[0], Void.TYPE);
            } else if (!this.f37616b.g) {
                b bVar = this.f37616b;
                if (PatchProxy.isSupport(new Object[0], bVar, b.f37609a, false, 29154, new Class[0], Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[0], bVar, b.f37609a, false, 29154, new Class[0], Integer.TYPE)).intValue();
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis >= bVar.f37610b + ((long) bVar.f37613e)) {
                        bVar.g = true;
                        i = bVar.f37614f;
                    } else {
                        bVar.f37611c = currentTimeMillis;
                        int i2 = (int) (((((float) (currentTimeMillis - bVar.f37611c)) * 1.0f) / ((float) bVar.f37613e)) * ((float) bVar.f37612d));
                        bVar.f37614f -= i2;
                        i = i2;
                    }
                }
                PtrFrameLayout.this.a((float) i);
                PtrFrameLayout.this.post(this);
            } else {
                if (PatchProxy.isSupport(new Object[0], this, f37615a, false, 29156, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f37615a, false, 29156, new Class[0], Void.TYPE);
                    return;
                }
                a();
                PtrFrameLayout ptrFrameLayout = PtrFrameLayout.this;
                if (PatchProxy.isSupport(new Object[0], ptrFrameLayout, PtrFrameLayout.f37601a, false, 29132, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], ptrFrameLayout, PtrFrameLayout.f37601a, false, 29132, new Class[0], Void.TYPE);
                    return;
                }
                if (ptrFrameLayout.f37606f.c() && ptrFrameLayout.c()) {
                    ptrFrameLayout.a(true);
                }
            }
        }

        private c() {
            this.f37616b = new b(PtrFrameLayout.this, (byte) 0);
        }

        /* synthetic */ c(PtrFrameLayout ptrFrameLayout, byte b2) {
            this();
        }

        public final void a(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f37615a, false, 29160, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f37615a, false, 29160, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (!PtrFrameLayout.this.f37606f.b(i)) {
                this.f37619e = PtrFrameLayout.this.f37606f.f37634f;
                PtrFrameLayout.this.removeCallbacks(this);
                this.f37616b.a();
                this.f37616b.a(i - this.f37619e, i2);
                PtrFrameLayout.this.post(this);
                this.f37617c = true;
            }
        }
    }

    @Deprecated
    public void setInterceptEventWhileWorking(boolean z) {
    }

    public float getDurationToClose() {
        return (float) this.j;
    }

    public long getDurationToCloseHeader() {
        return (long) this.k;
    }

    public View getContentView() {
        return this.f37602b;
    }

    public int getHeaderHeight() {
        return this.q;
    }

    public View getHeaderView() {
        return this.l;
    }

    private void k() {
        this.r &= -4;
    }

    public int getOffsetToRefresh() {
        return this.f37606f.f37630b;
    }

    public float getRatioOfHeaderToHeightRefresh() {
        return this.f37606f.j;
    }

    public float getResistance() {
        return this.f37606f.k;
    }

    private boolean l() {
        if ((this.r & 3) == 2) {
            return true;
        }
        return false;
    }

    private boolean m() {
        if ((this.r & 4) > 0) {
            return true;
        }
        return false;
    }

    private boolean n() {
        if ((this.r & 8) > 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if ((this.r & 3) > 0) {
            return true;
        }
        return false;
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f37601a, false, 29124, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37601a, false, 29124, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f37606f.l) {
            this.o.a(0, this.k);
        }
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f37601a, false, 29125, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37601a, false, 29125, new Class[0], Void.TYPE);
            return;
        }
        d();
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f37601a, false, 29126, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37601a, false, 29126, new Class[0], Void.TYPE);
            return;
        }
        d();
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f37601a, false, 29127, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37601a, false, 29127, new Class[0], Void.TYPE);
            return;
        }
        d();
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f37601a, false, 29129, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37601a, false, 29129, new Class[0], Void.TYPE);
            return;
        }
        this.w = System.currentTimeMillis();
        if (this.m.a()) {
            this.m.c(this);
        }
        if (this.n != null) {
            this.n.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f37601a, false, 29134, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37601a, false, 29134, new Class[0], Void.TYPE);
            return;
        }
        this.g = 4;
        if (!this.o.f37617c || !c()) {
            b(false);
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (!PatchProxy.isSupport(new Object[0], this, f37601a, false, 29146, new Class[0], ViewGroup.LayoutParams.class)) {
            return new a(-1, -1);
        }
        return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(new Object[0], this, f37601a, false, 29146, new Class[0], ViewGroup.LayoutParams.class);
    }

    public int getOffsetToKeepHeaderWhileLoading() {
        if (!PatchProxy.isSupport(new Object[0], this, f37601a, false, 29144, new Class[0], Integer.TYPE)) {
            return this.f37606f.l();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f37601a, false, 29144, new Class[0], Integer.TYPE)).intValue();
    }

    private boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f37601a, false, 29128, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f37601a, false, 29128, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.g != 2) {
            return false;
        } else {
            if ((this.f37606f.k() && c()) || this.f37606f.f()) {
                this.g = 3;
                i();
            }
            return false;
        }
    }

    private boolean j() {
        if (PatchProxy.isSupport(new Object[0], this, f37601a, false, 29130, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f37601a, false, 29130, new Class[0], Boolean.TYPE)).booleanValue();
        } else if ((this.g != 4 && this.g != 2) || !this.f37606f.h()) {
            return false;
        } else {
            if (this.m.a()) {
                this.m.a(this);
            }
            this.g = 1;
            k();
            return true;
        }
    }

    private void o() {
        if (PatchProxy.isSupport(new Object[0], this, f37601a, false, 29149, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37601a, false, 29149, new Class[0], Void.TYPE);
        } else if (this.t != null) {
            MotionEvent motionEvent = this.t;
            a(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime() + ((long) ViewConfiguration.getLongPressTimeout()), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
        }
    }

    private void p() {
        if (PatchProxy.isSupport(new Object[0], this, f37601a, false, 29150, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37601a, false, 29150, new Class[0], Void.TYPE);
            return;
        }
        MotionEvent motionEvent = this.t;
        a(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f37601a, false, 29133, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37601a, false, 29133, new Class[0], Void.TYPE);
            return;
        }
        if (this.u != null) {
            this.u.f37640c = 0;
        }
        int currentTimeMillis = (int) (((long) this.v) - (System.currentTimeMillis() - this.w));
        if (currentTimeMillis <= 0) {
            b();
        } else {
            postDelayed(this.y, (long) currentTimeMillis);
        }
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f37601a, false, 29113, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37601a, false, 29113, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        if (this.o != null) {
            c cVar = this.o;
            if (PatchProxy.isSupport(new Object[0], cVar, c.f37615a, false, 29158, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, c.f37615a, false, 29158, new Class[0], Void.TYPE);
            } else {
                cVar.a();
                cVar.f37616b.a();
            }
        }
        if (this.y != null) {
            removeCallbacks(this.y);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0084, code lost:
        if (r9.l == r0) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFinishInflate() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f37601a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 29112(0x71b8, float:4.0795E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f37601a
            r5 = 0
            r6 = 29112(0x71b8, float:4.0795E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            int r1 = r9.getChildCount()
            r2 = 2
            if (r1 > r2) goto L_0x00d0
            r3 = 1
            if (r1 != r2) goto L_0x008a
            int r1 = r9.h
            if (r1 == 0) goto L_0x003d
            android.view.View r1 = r9.l
            if (r1 != 0) goto L_0x003d
            int r1 = r9.h
            android.view.View r1 = r9.findViewById(r1)
            r9.l = r1
        L_0x003d:
            int r1 = r9.i
            if (r1 == 0) goto L_0x004d
            android.view.View r1 = r9.f37602b
            if (r1 != 0) goto L_0x004d
            int r1 = r9.i
            android.view.View r1 = r9.findViewById(r1)
            r9.f37602b = r1
        L_0x004d:
            android.view.View r1 = r9.f37602b
            if (r1 == 0) goto L_0x0055
            android.view.View r1 = r9.l
            if (r1 != 0) goto L_0x00c3
        L_0x0055:
            android.view.View r0 = r9.getChildAt(r0)
            android.view.View r1 = r9.getChildAt(r3)
            boolean r2 = r0 instanceof com.ss.android.ugc.aweme.commerce.preview.refresh.a.b
            if (r2 == 0) goto L_0x0064
            r9.l = r0
            goto L_0x0086
        L_0x0064:
            boolean r2 = r1 instanceof com.ss.android.ugc.aweme.commerce.preview.refresh.a.b
            if (r2 == 0) goto L_0x006b
            r9.l = r1
            goto L_0x0087
        L_0x006b:
            android.view.View r2 = r9.f37602b
            if (r2 != 0) goto L_0x0076
            android.view.View r2 = r9.l
            if (r2 != 0) goto L_0x0076
            r9.l = r0
            goto L_0x0086
        L_0x0076:
            android.view.View r2 = r9.l
            if (r2 != 0) goto L_0x0082
            android.view.View r2 = r9.f37602b
            if (r2 != r0) goto L_0x007f
            r0 = r1
        L_0x007f:
            r9.l = r0
            goto L_0x00c3
        L_0x0082:
            android.view.View r2 = r9.l
            if (r2 != r0) goto L_0x0087
        L_0x0086:
            r0 = r1
        L_0x0087:
            r9.f37602b = r0
            goto L_0x00c3
        L_0x008a:
            if (r1 != r3) goto L_0x0093
            android.view.View r0 = r9.getChildAt(r0)
            r9.f37602b = r0
            goto L_0x00c3
        L_0x0093:
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r9.getContext()
            r0.<init>(r1)
            r0.setClickable(r3)
            android.content.res.Resources r1 = r9.getResources()
            r2 = 2131624214(0x7f0e0116, float:1.8875601E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            r1 = 17
            r0.setGravity(r1)
            r1 = 1101004800(0x41a00000, float:20.0)
            r0.setTextSize(r1)
            java.lang.String r1 = "The content view in PtrFrameLayout is empty. Do you forget to specify its id in xml layout file?"
            r0.setText(r1)
            r9.f37602b = r0
            android.view.View r0 = r9.f37602b
            r9.addView(r0)
        L_0x00c3:
            android.view.View r0 = r9.l
            if (r0 == 0) goto L_0x00cc
            android.view.View r0 = r9.l
            r0.bringToFront()
        L_0x00cc:
            super.onFinishInflate()
            return
        L_0x00d0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "PtrFrameLayout can only contains 2 children"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.refresh.PtrFrameLayout.onFinishInflate():void");
    }

    public void setDurationToClose(int i2) {
        this.j = i2;
    }

    public void setDurationToCloseHeader(int i2) {
        this.k = i2;
    }

    public void setKeepHeaderWhenRefresh(boolean z) {
        this.f37603c = z;
    }

    public void setLoadingMinTime(int i2) {
        this.v = i2;
    }

    public void setPtrHandler(com.ss.android.ugc.aweme.commerce.preview.refresh.a.a aVar) {
        this.n = aVar;
    }

    public void setPullToRefresh(boolean z) {
        this.f37604d = z;
    }

    public PtrFrameLayout(Context context) {
        this(context, null);
    }

    public void setOffsetToKeepHeaderWhileLoading(int i2) {
        this.f37606f.m = i2;
    }

    public void setResistance(float f2) {
        this.f37606f.k = f2;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null || !(layoutParams instanceof a)) {
            return false;
        }
        return true;
    }

    public void setEnabledNextPtrAtOnce(boolean z) {
        if (z) {
            this.r |= 4;
        } else {
            this.r &= -5;
        }
    }

    public void setPinContent(boolean z) {
        if (z) {
            this.r |= 8;
        } else {
            this.r &= -9;
        }
    }

    private boolean a(MotionEvent motionEvent) {
        if (!PatchProxy.isSupport(new Object[]{motionEvent}, this, f37601a, false, 29118, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f37601a, false, 29118, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (!PatchProxy.isSupport(new Object[]{layoutParams2}, this, f37601a, false, 29147, new Class[]{ViewGroup.LayoutParams.class}, ViewGroup.LayoutParams.class)) {
            return new a(layoutParams2);
        }
        return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(new Object[]{layoutParams2}, this, f37601a, false, 29147, new Class[]{ViewGroup.LayoutParams.class}, ViewGroup.LayoutParams.class);
    }

    public void setRefreshCompleteHook(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f37601a, false, 29123, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f37601a, false, 29123, new Class[]{e.class}, Void.TYPE);
            return;
        }
        this.u = eVar;
        eVar.f37639b = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37607a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f37607a, false, 29152, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f37607a, false, 29152, new Class[0], Void.TYPE);
                    return;
                }
                PtrFrameLayout.this.b(true);
            }
        };
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f37601a, false, 29135, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f37601a, false, 29135, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!this.f37606f.c() || z || this.u == null) {
            if (this.m.a()) {
                this.m.d(this);
            }
            this.f37606f.a();
            f();
            j();
        } else {
            this.u.a();
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AttributeSet attributeSet2 = attributeSet;
        if (!PatchProxy.isSupport(new Object[]{attributeSet2}, this, f37601a, false, 29148, new Class[]{AttributeSet.class}, ViewGroup.LayoutParams.class)) {
            return new a(getContext(), attributeSet2);
        }
        return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(new Object[]{attributeSet2}, this, f37601a, false, 29148, new Class[]{AttributeSet.class}, ViewGroup.LayoutParams.class);
    }

    public void setHeaderView(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f37601a, false, 29145, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f37601a, false, 29145, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (!(this.l == null || view == null || this.l == view)) {
            removeView(this.l);
        }
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new a(-1, -2));
        }
        this.l = view;
        addView(view);
    }

    public void setOffsetToRefresh(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f37601a, false, 29143, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f37601a, false, 29143, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        c cVar = this.f37606f;
        cVar.j = (((float) cVar.h) * 1.0f) / ((float) i3);
        cVar.f37630b = i3;
    }

    public void setPtrIndicator(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f37601a, false, 29141, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f37601a, false, 29141, new Class[]{c.class}, Void.TYPE);
            return;
        }
        if (!(this.f37606f == null || this.f37606f == cVar)) {
            c cVar2 = this.f37606f;
            cVar.f37634f = cVar2.f37634f;
            cVar.g = cVar2.g;
            cVar.h = cVar2.h;
        }
        this.f37606f = cVar;
    }

    public void setRatioOfHeaderHeightToRefresh(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f37601a, false, 29142, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f37601a, false, 29142, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f37606f.a(f2);
    }

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f37601a, false, 29121, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f37601a, false, 29121, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 != 0) {
            boolean z = this.f37606f.l;
            if (z && !this.x && this.f37606f.g()) {
                this.x = true;
                o();
            }
            if ((this.f37606f.d() && this.g == 1) || (this.f37606f.b() && this.g == 4 && m())) {
                this.g = 2;
                this.m.b(this);
            }
            if (this.f37606f.e()) {
                j();
                if (z) {
                    p();
                }
            }
            if (this.g == 2) {
                if (z && !c() && this.f37604d && this.f37606f.i()) {
                    h();
                }
                if (l() && this.f37606f.j()) {
                    h();
                }
            }
            this.l.offsetTopAndBottom(i2);
            if (!n()) {
                this.f37602b.offsetTopAndBottom(i2);
            }
            invalidate();
            if (this.m.a()) {
                this.m.a(this, z, this.g, this.f37606f);
            }
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f37601a, false, 29120, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f37601a, false, 29120, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (f2 >= 0.0f || !this.f37606f.h()) {
            int i2 = this.f37606f.f37634f + ((int) f2);
            if (c.c(i2)) {
                i2 = 0;
            }
            this.f37606f.a(i2);
            a(i2 - this.f37606f.g);
        }
    }

    public final void a(com.ss.android.ugc.aweme.commerce.preview.refresh.a.b bVar) {
        boolean z;
        com.ss.android.ugc.aweme.commerce.preview.refresh.a.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f37601a, false, 29139, new Class[]{com.ss.android.ugc.aweme.commerce.preview.refresh.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f37601a, false, 29139, new Class[]{com.ss.android.ugc.aweme.commerce.preview.refresh.a.b.class}, Void.TYPE);
            return;
        }
        d dVar = this.m;
        if (PatchProxy.isSupport(new Object[]{dVar, bVar2}, null, d.f37635a, true, 29169, new Class[]{d.class, com.ss.android.ugc.aweme.commerce.preview.refresh.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar, bVar2}, null, d.f37635a, true, 29169, new Class[]{d.class, com.ss.android.ugc.aweme.commerce.preview.refresh.a.b.class}, Void.TYPE);
            return;
        }
        if (bVar2 != null && dVar != null) {
            if (dVar.f37636b != null) {
                while (true) {
                    if (dVar.f37636b == null || dVar.f37636b != bVar2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        if (dVar.f37637c == null) {
                            d dVar2 = new d();
                            dVar2.f37636b = bVar2;
                            dVar.f37637c = dVar2;
                            break;
                        }
                        dVar = dVar.f37637c;
                    } else {
                        break;
                    }
                }
            } else {
                dVar.f37636b = bVar2;
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f37601a, false, 29119, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f37601a, false, 29119, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!isEnabled() || this.f37602b == null || this.l == null) {
            return a(motionEvent);
        } else {
            switch (motionEvent.getAction()) {
                case 0:
                    this.x = false;
                    c cVar = this.f37606f;
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(x2), Float.valueOf(y2)}, cVar, c.f37629a, false, 29162, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(x2), Float.valueOf(y2)}, cVar, c.f37629a, false, 29162, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                    } else {
                        cVar.l = true;
                        cVar.i = cVar.f37634f;
                        cVar.f37631c.set(x2, y2);
                    }
                    c cVar2 = this.o;
                    if (PatchProxy.isSupport(new Object[0], cVar2, c.f37615a, false, 29159, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], cVar2, c.f37615a, false, 29159, new Class[0], Void.TYPE);
                    } else if (cVar2.f37617c) {
                        cVar2.f37616b.a();
                        PtrFrameLayout ptrFrameLayout = PtrFrameLayout.this;
                        if (PatchProxy.isSupport(new Object[0], ptrFrameLayout, f37601a, false, 29131, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], ptrFrameLayout, f37601a, false, 29131, new Class[0], Void.TYPE);
                        } else if (ptrFrameLayout.f37606f.c() && ptrFrameLayout.c()) {
                            ptrFrameLayout.a(true);
                        }
                        cVar2.a();
                    }
                    this.s = false;
                    a(motionEvent);
                    return true;
                case 1:
                case 3:
                    this.f37606f.l = false;
                    if (!this.f37606f.c()) {
                        return a(motionEvent);
                    }
                    a(false);
                    if (!this.f37606f.g()) {
                        return a(motionEvent);
                    }
                    o();
                    return true;
                case 2:
                    this.t = motionEvent2;
                    c cVar3 = this.f37606f;
                    float x3 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(x3), Float.valueOf(y3)}, cVar3, c.f37629a, false, 29163, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(x3), Float.valueOf(y3)}, cVar3, c.f37629a, false, 29163, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                    } else {
                        float f2 = x3 - cVar3.f37631c.x;
                        float f3 = y3 - cVar3.f37631c.y;
                        if (PatchProxy.isSupport(new Object[]{Float.valueOf(x3), Float.valueOf(y3), Float.valueOf(f2), Float.valueOf(f3)}, cVar3, c.f37629a, false, 29161, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Float.valueOf(x3), Float.valueOf(y3), Float.valueOf(f2), Float.valueOf(f3)}, cVar3, c.f37629a, false, 29161, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
                        } else {
                            cVar3.f37632d = f2;
                            cVar3.f37633e = f3 / cVar3.k;
                        }
                        cVar3.f37631c.set(x3, y3);
                    }
                    float f4 = this.f37606f.f37632d;
                    float f5 = this.f37606f.f37633e;
                    if (this.f37605e && !this.s && Math.abs(f4) > ((float) this.p) && Math.abs(f4) > Math.abs(f5) && this.f37606f.h()) {
                        this.s = true;
                    }
                    if (this.s) {
                        return a(motionEvent);
                    }
                    if (f5 > 0.0f) {
                        z = true;
                    }
                    boolean z2 = !z;
                    boolean c2 = this.f37606f.c();
                    if (z && this.n != null && !this.n.a(this, this.f37602b, this.l)) {
                        return a(motionEvent);
                    }
                    if ((z2 && c2) || z) {
                        a(f5);
                        return true;
                    }
                    break;
            }
            return a(motionEvent);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f37601a, false, 29122, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f37601a, false, 29122, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        h();
        if (this.g == 3) {
            if (!this.f37603c) {
                e();
            } else if (this.f37606f.k() && !z) {
                this.o.a(this.f37606f.l(), this.j);
            }
        } else if (this.g == 4) {
            b(false);
        } else {
            g();
        }
    }

    public PtrFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f37601a, false, 29114, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f37601a, false, 29114, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        if (this.l != null) {
            measureChildWithMargins(this.l, i2, 0, i3, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
            this.q = this.l.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            c cVar = this.f37606f;
            int i4 = this.q;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i4)}, cVar, c.f37629a, false, 29165, new Class[]{Integer.TYPE}, Void.TYPE)) {
                c cVar2 = cVar;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i4)}, cVar2, c.f37629a, false, 29165, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                cVar.h = i4;
                cVar.f37630b = (int) (cVar.j * ((float) cVar.h));
            }
        }
        if (this.f37602b != null) {
            View view = this.f37602b;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f37601a, false, 29115, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f37601a, false, 29115, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin, marginLayoutParams2.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams2.topMargin, marginLayoutParams2.height));
        }
    }

    public PtrFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        d dVar;
        this.g = 1;
        this.j = 200;
        this.k = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        this.f37603c = true;
        if (PatchProxy.isSupport(new Object[0], null, d.f37635a, true, 29170, new Class[0], d.class)) {
            dVar = (d) PatchProxy.accessDispatch(new Object[0], null, d.f37635a, true, 29170, new Class[0], d.class);
        } else {
            dVar = new d();
        }
        this.m = dVar;
        this.f37605e = false;
        this.r = 0;
        this.s = false;
        this.v = 500;
        this.w = 0;
        this.x = false;
        this.y = new b(this);
        this.f37606f = new c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PtrFrameLayout, 0, 0);
        if (obtainStyledAttributes != null) {
            this.h = obtainStyledAttributes.getResourceId(3, this.h);
            this.i = obtainStyledAttributes.getResourceId(0, this.i);
            this.f37606f.k = obtainStyledAttributes.getFloat(7, this.f37606f.k);
            this.j = obtainStyledAttributes.getInt(1, this.j);
            this.k = obtainStyledAttributes.getInt(2, this.k);
            this.f37606f.a(obtainStyledAttributes.getFloat(6, this.f37606f.j));
            this.f37603c = obtainStyledAttributes.getBoolean(4, this.f37603c);
            this.f37604d = obtainStyledAttributes.getBoolean(5, this.f37604d);
            obtainStyledAttributes.recycle();
        }
        this.o = new c(this, (byte) 0);
        this.p = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f37601a, false, 29116, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f37601a, false, 29116, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f37601a, false, 29117, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37601a, false, 29117, new Class[0], Void.TYPE);
            return;
        }
        int i6 = this.f37606f.f37634f;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (this.l != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
            int i7 = marginLayoutParams.leftMargin + paddingLeft;
            int i8 = -(((this.q - paddingTop) - marginLayoutParams.topMargin) - i6);
            this.l.layout(i7, i8, this.l.getMeasuredWidth() + i7, this.l.getMeasuredHeight() + i8);
        }
        if (this.f37602b != null) {
            if (n()) {
                i6 = 0;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f37602b.getLayoutParams();
            int i9 = paddingLeft + marginLayoutParams2.leftMargin;
            int i10 = paddingTop + marginLayoutParams2.topMargin + i6;
            this.f37602b.layout(i9, i10, this.f37602b.getMeasuredWidth() + i9, this.f37602b.getMeasuredHeight() + i10);
        }
    }
}
