package com.swmansion.gesturehandler;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public final class d {
    private static final PointF g = new PointF();
    private static final float[] h = new float[2];
    private static final Matrix i = new Matrix();
    private static final float[] j = new float[2];
    private static final Comparator<b> k = new Comparator<b>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            b bVar = (b) obj;
            b bVar2 = (b) obj2;
            if ((bVar.s && bVar2.s) || (bVar.t && bVar2.t)) {
                return Integer.signum(bVar2.r - bVar.r);
            }
            if (bVar.s) {
                return -1;
            }
            if (bVar2.s) {
                return 1;
            }
            if (bVar.t) {
                return -1;
            }
            if (bVar2.t) {
                return 1;
            }
            return 0;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    final b[] f78774a = new b[20];

    /* renamed from: b  reason: collision with root package name */
    int f78775b;

    /* renamed from: c  reason: collision with root package name */
    boolean f78776c;

    /* renamed from: d  reason: collision with root package name */
    int f78777d;

    /* renamed from: e  reason: collision with root package name */
    boolean f78778e;

    /* renamed from: f  reason: collision with root package name */
    public float f78779f;
    private final ViewGroup l;
    private final e m;
    private final p n;
    private final b[] o = new b[20];
    private final b[] p = new b[20];
    private final b[] q = new b[20];
    private int r;
    private int s;

    static boolean a(int i2) {
        return i2 == 3 || i2 == 1 || i2 == 5;
    }

    public final boolean a(MotionEvent motionEvent) {
        this.f78776c = true;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            j[0] = motionEvent.getX(actionIndex);
            j[1] = motionEvent.getY(actionIndex);
            b(this.l, j, pointerId);
            a(this.l, j, pointerId);
        } else if (actionMasked == 3) {
            for (int i2 = this.f78775b - 1; i2 >= 0; i2--) {
                this.f78774a[i2].c();
            }
            int i3 = this.r;
            for (int i4 = 0; i4 < i3; i4++) {
                this.p[i4] = this.o[i4];
            }
            for (int i5 = i3 - 1; i5 >= 0; i5--) {
                this.p[i5].c();
            }
        }
        int i6 = this.r;
        for (int i7 = 0; i7 < i6; i7++) {
            this.p[i7] = this.o[i7];
        }
        Arrays.sort(this.p, 0, i6, k);
        for (int i8 = 0; i8 < i6; i8++) {
            b bVar = this.p[i8];
            if ((!bVar.k || bVar.g == 1 || bVar.g == 3 || bVar.g == 5 || bVar.f78771d <= 0) ? false : true) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (!bVar.t || actionMasked2 != 2) {
                    float[] fArr = j;
                    a(bVar.f78773f, motionEvent, fArr);
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    motionEvent.setLocation(fArr[0], fArr[1]);
                    bVar.b(motionEvent);
                    if (bVar.s && bVar.p != null) {
                        bVar.p.a(bVar, motionEvent);
                    }
                    motionEvent.setLocation(x, y);
                    if (actionMasked2 == 1 || actionMasked2 == 6) {
                        int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (bVar.f78770c[pointerId2] != -1) {
                            bVar.f78770c[pointerId2] = -1;
                            bVar.f78771d--;
                        }
                    }
                }
            }
        }
        this.f78776c = false;
        if (this.f78778e && this.f78777d == 0) {
            a();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f78775b; i3++) {
            if (this.f78774a[i3].t) {
                this.f78774a[i2] = this.f78774a[i3];
                i2++;
            }
        }
        this.f78775b = i2;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        boolean z = false;
        for (int i2 = this.r - 1; i2 >= 0; i2--) {
            b bVar = this.o[i2];
            if (a(bVar.g) && !bVar.t) {
                this.o[i2] = null;
                bVar.i();
                bVar.s = false;
                bVar.t = false;
                bVar.r = Integer.MAX_VALUE;
                z = true;
            }
        }
        if (z) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.r; i4++) {
                if (this.o[i4] != null) {
                    this.o[i3] = this.o[i4];
                    i3++;
                }
            }
            this.r = i3;
        }
        this.f78778e = false;
    }

    private static boolean a(View view) {
        if (!(view instanceof ViewGroup) || view.getBackground() != null) {
            return true;
        }
        return false;
    }

    private boolean b(View view) {
        if (view.getVisibility() != 0 || view.getAlpha() < this.f78779f) {
            return false;
        }
        return true;
    }

    private boolean b(b bVar) {
        for (int i2 = 0; i2 < this.r; i2++) {
            b bVar2 = this.o[i2];
            if (!a(bVar2.g) && a(bVar, bVar2)) {
                return true;
            }
        }
        return false;
    }

    private void d(b bVar) {
        int i2 = 0;
        while (i2 < this.f78775b) {
            if (this.f78774a[i2] != bVar) {
                i2++;
            } else {
                return;
            }
        }
        if (this.f78775b < this.f78774a.length) {
            b[] bVarArr = this.f78774a;
            int i3 = this.f78775b;
            this.f78775b = i3 + 1;
            bVarArr[i3] = bVar;
            bVar.t = true;
            int i4 = this.s;
            this.s = i4 + 1;
            bVar.r = i4;
            return;
        }
        throw new IllegalStateException("Too many recognizers");
    }

    private void c(b bVar) {
        int i2 = bVar.g;
        bVar.t = false;
        bVar.s = true;
        int i3 = this.s;
        this.s = i3 + 1;
        bVar.r = i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.r; i5++) {
            b bVar2 = this.o[i5];
            if (c(bVar2, bVar)) {
                this.q[i4] = bVar2;
                i4++;
            }
        }
        for (int i6 = i4 - 1; i6 >= 0; i6--) {
            this.q[i6].c();
        }
        for (int i7 = this.f78775b - 1; i7 >= 0; i7--) {
            b bVar3 = this.f78774a[i7];
            if (c(bVar3, bVar)) {
                bVar3.c();
                bVar3.t = false;
            }
        }
        b();
        bVar.a(4, 2);
        if (i2 != 4) {
            bVar.a(5, 4);
            if (i2 != 5) {
                bVar.a(0, 5);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar) {
        if (b(bVar)) {
            d(bVar);
            return;
        }
        c(bVar);
        bVar.t = false;
    }

    private static boolean c(b bVar, b bVar2) {
        if (!bVar.a(bVar2) || b(bVar, bVar2)) {
            return false;
        }
        if (bVar == bVar2 || (!bVar.t && bVar.g != 4)) {
            return true;
        }
        return bVar.e(bVar2);
    }

    private static boolean b(b bVar, b bVar2) {
        if (bVar == bVar2 || bVar.d(bVar2) || bVar2.d(bVar)) {
            return true;
        }
        return false;
    }

    static boolean a(b bVar, b bVar2) {
        if (bVar == bVar2 || (!bVar.c(bVar2) && !bVar2.b(bVar))) {
            return false;
        }
        return true;
    }

    public d(ViewGroup viewGroup, e eVar, p pVar) {
        this.l = viewGroup;
        this.m = eVar;
        this.n = pVar;
    }

    private boolean a(ViewGroup viewGroup, float[] fArr, int i2) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View a2 = this.n.a(viewGroup, childCount);
            PointF pointF = g;
            if (b(a2)) {
                if (a(fArr[0], fArr[1], viewGroup, a2, pointF)) {
                    float f2 = fArr[0];
                    float f3 = fArr[1];
                    fArr[0] = pointF.x;
                    fArr[1] = pointF.y;
                    boolean b2 = b(a2, fArr, i2);
                    fArr[0] = f2;
                    fArr[1] = f3;
                    if (b2) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    private void a(View view, MotionEvent motionEvent, float[] fArr) {
        if (view == this.l) {
            fArr[0] = motionEvent.getX();
            fArr[1] = motionEvent.getY();
        } else if (view == null || !(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Parent is null? View is no longer in the tree");
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            a((View) viewGroup, motionEvent, fArr);
            PointF pointF = g;
            a(fArr[0], fArr[1], viewGroup, view, pointF);
            fArr[0] = pointF.x;
            fArr[1] = pointF.y;
        }
    }

    private boolean b(View view, float[] fArr, int i2) {
        boolean z;
        l a2 = this.n.a(view);
        if (a2 == l.NONE) {
            return false;
        }
        if (a2 == l.BOX_ONLY) {
            if (a(view, fArr, i2) || a(view)) {
                return true;
            }
            return false;
        } else if (a2 == l.BOX_NONE) {
            if (view instanceof ViewGroup) {
                return a((ViewGroup) view, fArr, i2);
            }
            return false;
        } else if (a2 == l.AUTO) {
            if (view instanceof ViewGroup) {
                z = a((ViewGroup) view, fArr, i2);
            } else {
                z = false;
            }
            if (a(view, fArr, i2) || z || a(view)) {
                return true;
            }
            return false;
        } else {
            throw new IllegalArgumentException("Unknown pointer event type: " + a2.toString());
        }
    }

    private boolean a(View view, float[] fArr, int i2) {
        ArrayList a2 = this.m.a(view);
        if (a2 == null) {
            return false;
        }
        int size = a2.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = (b) a2.get(i3);
            if (bVar.k && bVar.a(view, fArr[0], fArr[1])) {
                int i4 = 0;
                while (true) {
                    if (i4 < this.r) {
                        if (this.o[i4] == bVar) {
                            break;
                        }
                        i4++;
                    } else if (this.r < this.o.length) {
                        b[] bVarArr = this.o;
                        int i5 = this.r;
                        this.r = i5 + 1;
                        bVarArr[i5] = bVar;
                        bVar.s = false;
                        bVar.t = false;
                        bVar.r = Integer.MAX_VALUE;
                        if (bVar.f78773f == null && bVar.o == null) {
                            Arrays.fill(bVar.f78770c, -1);
                            bVar.f78771d = 0;
                            bVar.g = 0;
                            bVar.f78773f = view;
                            bVar.o = this;
                        } else {
                            throw new IllegalStateException("Already prepared or hasn't been reset");
                        }
                    } else {
                        throw new IllegalStateException("Too many recognizers");
                    }
                }
                bVar.a(i2);
                z = true;
            }
        }
        return z;
    }

    private boolean a(float f2, float f3, ViewGroup viewGroup, View view, PointF pointF) {
        boolean z;
        float scrollX = (f2 + ((float) viewGroup.getScrollX())) - ((float) view.getLeft());
        float scrollY = (f3 + ((float) viewGroup.getScrollY())) - ((float) view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = h;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = i;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            scrollX = fArr[0];
            scrollY = fArr[1];
        }
        pointF.set(scrollX, scrollY);
        ArrayList a2 = this.m.a(view);
        if (a2 != null) {
            int size = a2.size();
            z = false;
            int i2 = 0;
            while (!z && i2 < size) {
                z = ((b) a2.get(i2)).a(view, scrollX, scrollY);
                i2++;
            }
        } else {
            z = false;
        }
        if (z) {
            return z;
        }
        if (scrollX < 0.0f || scrollX > ((float) view.getWidth()) || scrollY < 0.0f || scrollY >= ((float) view.getHeight())) {
            return false;
        }
        return true;
    }
}
