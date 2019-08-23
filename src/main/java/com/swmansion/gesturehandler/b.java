package com.swmansion.gesturehandler;

import android.view.MotionEvent;
import android.view.View;
import com.swmansion.gesturehandler.b;
import java.util.Arrays;

public class b<T extends b> {

    /* renamed from: a  reason: collision with root package name */
    private static int f78768a = 11;

    /* renamed from: b  reason: collision with root package name */
    private static MotionEvent.PointerProperties[] f78769b;
    private static MotionEvent.PointerCoords[] u;

    /* renamed from: c  reason: collision with root package name */
    final int[] f78770c = new int[f78768a];

    /* renamed from: d  reason: collision with root package name */
    int f78771d;

    /* renamed from: e  reason: collision with root package name */
    public int f78772e;

    /* renamed from: f  reason: collision with root package name */
    public View f78773f;
    public int g;
    public float h;
    public float i;
    public boolean j;
    public boolean k = true;
    public float l;
    public float m;
    public int n;
    d o;
    public i<T> p;
    public c q;
    int r;
    boolean s;
    boolean t;
    private float[] v;
    private float w;
    private float x;
    private boolean y;

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public void h() {
    }

    public final float j() {
        return this.l - this.w;
    }

    public final float k() {
        return this.m - this.x;
    }

    public final void e() {
        if (this.g == 0 || this.g == 2) {
            b(4);
        }
    }

    public final void f() {
        if (this.g == 0) {
            b(2);
        }
    }

    public final void g() {
        if (this.g == 2 || this.g == 4) {
            b(5);
        }
    }

    public final void c() {
        if (this.g == 4 || this.g == 0 || this.g == 2) {
            a();
            b(3);
        }
    }

    public final void d() {
        if (this.g == 4 || this.g == 0 || this.g == 2) {
            b(1);
        }
    }

    public final void i() {
        this.f78773f = null;
        this.o = null;
        Arrays.fill(this.f78770c, -1);
        this.f78771d = 0;
        b();
    }

    public String toString() {
        String str;
        if (this.f78773f == null) {
            str = null;
        } else {
            str = this.f78773f.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "@[" + this.f78772e + "]:" + str;
    }

    public final T a(boolean z) {
        this.y = z;
        return this;
    }

    private static boolean a(float f2) {
        if (!Float.isNaN(f2)) {
            return true;
        }
        return false;
    }

    public final T b(boolean z) {
        if (this.f78773f != null) {
            c();
        }
        this.k = z;
        return this;
    }

    public final boolean c(b bVar) {
        if (bVar == this || this.q == null) {
            return false;
        }
        return this.q.a(this, bVar);
    }

    public boolean b(b bVar) {
        return (bVar == this || this.q != null) ? false : false;
    }

    public boolean e(b bVar) {
        return (bVar == this || this.q == null) ? false : false;
    }

    public final void a(int i2) {
        if (this.f78770c[i2] == -1) {
            int[] iArr = this.f78770c;
            int i3 = 0;
            while (i3 < this.f78771d) {
                int i4 = 0;
                while (i4 < this.f78770c.length && this.f78770c[i4] != i3) {
                    i4++;
                }
                if (i4 == this.f78770c.length) {
                    break;
                }
                i3++;
            }
            iArr[i2] = i3;
            this.f78771d++;
        }
    }

    public boolean d(b bVar) {
        if (bVar == this) {
            return true;
        }
        if (this.q != null) {
            return this.q.b(this, bVar);
        }
        return false;
    }

    private void b(int i2) {
        if (this.g != i2) {
            int i3 = this.g;
            this.g = i2;
            d dVar = this.o;
            dVar.f78777d++;
            if (d.a(i2)) {
                for (int i4 = 0; i4 < dVar.f78775b; i4++) {
                    b bVar = dVar.f78774a[i4];
                    if (d.a(bVar, this)) {
                        if (i2 == 5) {
                            bVar.c();
                            bVar.t = false;
                        } else {
                            dVar.a(bVar);
                        }
                    }
                }
                dVar.b();
            }
            if (i2 == 4) {
                dVar.a(this);
            } else if (!(i3 == 4 || i3 == 5) || this.s) {
                a(i2, i3);
            }
            dVar.f78777d--;
            if (dVar.f78776c || dVar.f78777d != 0) {
                dVar.f78778e = true;
            } else {
                dVar.a();
            }
            h();
        }
    }

    /* access modifiers changed from: protected */
    public void a(MotionEvent motionEvent) {
        b(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.view.MotionEvent r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            boolean r2 = r0.k
            if (r2 == 0) goto L_0x0192
            int r2 = r0.g
            r3 = 3
            if (r2 == r3) goto L_0x0192
            int r2 = r0.g
            r3 = 1
            if (r2 == r3) goto L_0x0192
            int r2 = r0.g
            r4 = 5
            if (r2 == r4) goto L_0x0192
            int r2 = r0.f78771d
            if (r2 > 0) goto L_0x001d
            goto L_0x0192
        L_0x001d:
            int r2 = r28.getPointerCount()
            int r5 = r0.f78771d
            r6 = 0
            r7 = -1
            if (r2 == r5) goto L_0x0029
        L_0x0027:
            r2 = 1
            goto L_0x0040
        L_0x0029:
            r2 = 0
        L_0x002a:
            int[] r5 = r0.f78770c
            int r5 = r5.length
            if (r2 >= r5) goto L_0x003f
            int[] r5 = r0.f78770c
            r5 = r5[r2]
            if (r5 == r7) goto L_0x003c
            int[] r5 = r0.f78770c
            r5 = r5[r2]
            if (r5 == r2) goto L_0x003c
            goto L_0x0027
        L_0x003c:
            int r2 = r2 + 1
            goto L_0x002a
        L_0x003f:
            r2 = 0
        L_0x0040:
            r5 = 2
            if (r2 != 0) goto L_0x0046
            r2 = r1
            goto L_0x0130
        L_0x0046:
            int r2 = r28.getActionMasked()
            if (r2 == 0) goto L_0x006c
            if (r2 != r4) goto L_0x004f
            goto L_0x006c
        L_0x004f:
            r4 = 6
            if (r2 == r3) goto L_0x0058
            if (r2 != r4) goto L_0x0055
            goto L_0x0058
        L_0x0055:
            r4 = r2
            r2 = -1
            goto L_0x0081
        L_0x0058:
            int r2 = r28.getActionIndex()
            int r8 = r1.getPointerId(r2)
            int[] r9 = r0.f78770c
            r8 = r9[r8]
            if (r8 == r7) goto L_0x0080
            int r8 = r0.f78771d
            if (r8 != r3) goto L_0x0081
            r4 = 1
            goto L_0x0081
        L_0x006c:
            int r2 = r28.getActionIndex()
            int r8 = r1.getPointerId(r2)
            int[] r9 = r0.f78770c
            r8 = r9[r8]
            if (r8 == r7) goto L_0x0080
            int r8 = r0.f78771d
            if (r8 != r3) goto L_0x0081
            r4 = 0
            goto L_0x0081
        L_0x0080:
            r4 = 2
        L_0x0081:
            int r8 = r0.f78771d
            android.view.MotionEvent$PointerProperties[] r9 = f78769b
            if (r9 != 0) goto L_0x0093
            int r9 = f78768a
            android.view.MotionEvent$PointerProperties[] r9 = new android.view.MotionEvent.PointerProperties[r9]
            f78769b = r9
            int r9 = f78768a
            android.view.MotionEvent$PointerCoords[] r9 = new android.view.MotionEvent.PointerCoords[r9]
            u = r9
        L_0x0093:
            if (r8 <= 0) goto L_0x00b2
            android.view.MotionEvent$PointerProperties[] r9 = f78769b
            int r10 = r8 + -1
            r9 = r9[r10]
            if (r9 != 0) goto L_0x00b2
            android.view.MotionEvent$PointerProperties[] r9 = f78769b
            android.view.MotionEvent$PointerProperties r11 = new android.view.MotionEvent$PointerProperties
            r11.<init>()
            r9[r10] = r11
            android.view.MotionEvent$PointerCoords[] r9 = u
            android.view.MotionEvent$PointerCoords r11 = new android.view.MotionEvent$PointerCoords
            r11.<init>()
            r9[r10] = r11
            int r8 = r8 + -1
            goto L_0x0093
        L_0x00b2:
            float r8 = r28.getX()
            float r9 = r28.getY()
            float r10 = r28.getRawX()
            float r11 = r28.getRawY()
            r1.setLocation(r10, r11)
            int r10 = r28.getPointerCount()
            r15 = r4
            r16 = 0
        L_0x00cc:
            if (r6 >= r10) goto L_0x00fa
            int r4 = r1.getPointerId(r6)
            int[] r11 = r0.f78770c
            r11 = r11[r4]
            if (r11 == r7) goto L_0x00f7
            android.view.MotionEvent$PointerProperties[] r11 = f78769b
            r11 = r11[r16]
            r1.getPointerProperties(r6, r11)
            android.view.MotionEvent$PointerProperties[] r11 = f78769b
            r11 = r11[r16]
            int[] r12 = r0.f78770c
            r4 = r12[r4]
            r11.id = r4
            android.view.MotionEvent$PointerCoords[] r4 = u
            r4 = r4[r16]
            r1.getPointerCoords(r6, r4)
            if (r6 != r2) goto L_0x00f5
            int r4 = r16 << 8
            r15 = r15 | r4
        L_0x00f5:
            int r16 = r16 + 1
        L_0x00f7:
            int r6 = r6 + 1
            goto L_0x00cc
        L_0x00fa:
            long r11 = r28.getDownTime()
            long r13 = r28.getEventTime()
            android.view.MotionEvent$PointerProperties[] r17 = f78769b
            android.view.MotionEvent$PointerCoords[] r18 = u
            int r19 = r28.getMetaState()
            int r20 = r28.getButtonState()
            float r21 = r28.getXPrecision()
            float r22 = r28.getYPrecision()
            int r23 = r28.getDeviceId()
            int r24 = r28.getEdgeFlags()
            int r25 = r28.getSource()
            int r26 = r28.getFlags()
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r11, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1.setLocation(r8, r9)
            r2.setLocation(r8, r9)
        L_0x0130:
            float r4 = r2.getX()
            r0.h = r4
            float r4 = r2.getY()
            r0.i = r4
            int r4 = r2.getPointerCount()
            r0.n = r4
            android.view.View r4 = r0.f78773f
            float r6 = r0.h
            float r7 = r0.i
            boolean r4 = r0.a(r4, r6, r7)
            r0.j = r4
            boolean r4 = r0.y
            if (r4 == 0) goto L_0x0167
            boolean r4 = r0.j
            if (r4 != 0) goto L_0x0167
            int r1 = r0.g
            r2 = 4
            if (r1 != r2) goto L_0x015f
            r27.c()
            return
        L_0x015f:
            int r1 = r0.g
            if (r1 != r5) goto L_0x0166
            r27.d()
        L_0x0166:
            return
        L_0x0167:
            float r4 = com.swmansion.gesturehandler.f.a(r2, r3)
            r0.l = r4
            float r3 = com.swmansion.gesturehandler.f.b(r2, r3)
            r0.m = r3
            float r3 = r2.getRawX()
            float r4 = r2.getX()
            float r3 = r3 - r4
            r0.w = r3
            float r3 = r2.getRawY()
            float r4 = r2.getY()
            float r3 = r3 - r4
            r0.x = r3
            r0.a((android.view.MotionEvent) r2)
            if (r2 == r1) goto L_0x0191
            r2.recycle()
        L_0x0191:
            return
        L_0x0192:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.b.b(android.view.MotionEvent):void");
    }

    public final boolean a(b bVar) {
        for (int i2 = 0; i2 < this.f78770c.length; i2++) {
            if (this.f78770c[i2] != -1 && bVar.f78770c[i2] != -1) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        if (this.p != null) {
            this.p.a(this, i2, i3);
        }
    }

    public final boolean a(View view, float f2, float f3) {
        float f4;
        float width = (float) view.getWidth();
        float height = (float) view.getHeight();
        float f5 = 0.0f;
        if (this.v != null) {
            float f6 = this.v[0];
            float f7 = this.v[1];
            float f8 = this.v[2];
            float f9 = this.v[3];
            if (a(f6)) {
                f4 = 0.0f - f6;
            } else {
                f4 = 0.0f;
            }
            if (a(f7)) {
                f5 = 0.0f - f9;
            }
            if (a(f8)) {
                width += f8;
            }
            if (a(f9)) {
                height += f9;
            }
            float f10 = this.v[4];
            float f11 = this.v[5];
            if (a(f10)) {
                if (!a(f6)) {
                    f4 = f8 - f10;
                } else if (!a(f8)) {
                    width = f6 + f10;
                }
            }
            if (a(f11)) {
                if (!a(f5)) {
                    f5 = height - f11;
                } else if (!a(height)) {
                    height = f5 + f11;
                }
            }
        } else {
            f4 = 0.0f;
        }
        if (f2 < f4 || f2 > width || f3 < f5 || f3 > height) {
            return false;
        }
        return true;
    }

    public final T a(float f2, float f3, float f4, float f5, float f6, float f7) {
        if (this.v == null) {
            this.v = new float[6];
        }
        this.v[0] = f2;
        this.v[1] = f3;
        this.v[2] = f4;
        this.v[3] = f5;
        this.v[4] = f6;
        this.v[5] = f7;
        if (a(f6) && a(f2) && a(f4)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        } else if (a(f6) && !a(f2) && !a(f4)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        } else if (a(f7) && a(f5) && a(f3)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        } else if (!a(f7) || a(f5) || a(f3)) {
            return this;
        } else {
            throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
        }
    }
}
