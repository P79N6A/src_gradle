package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.b.a;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.b;
import com.ss.android.vesdk.aj;

public class c extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f67326f;

    /* renamed from: a  reason: collision with root package name */
    private PointF f67327a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f67328b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f67329c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f67330d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f67331e;
    protected Context g;
    protected float h;
    protected float i;
    protected int j;
    protected int k;
    protected StickerHelpBoxView l;
    protected View m;
    protected b n;
    public boolean o;
    public boolean p;
    public boolean q;
    public long r;
    public int s;
    public boolean t;
    public boolean u;
    public long v;
    public boolean w;
    public boolean x;
    private boolean y;
    private int z;

    public boolean g() {
        return false;
    }

    public View getContentView() {
        return this.m;
    }

    public boolean getLockMode() {
        return this.f67331e;
    }

    public float getRotateAngle() {
        return this.i;
    }

    public float getScale() {
        return this.h;
    }

    public final boolean a(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f67326f, false, 77068, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar}, this, f67326f, false, 77068, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class}, Boolean.TYPE)).booleanValue();
        } else if (!c()) {
            return false;
        } else {
            if (Math.abs(bVar.j.x) + Math.abs(bVar.j.y) < 1.0f) {
                return true;
            }
            if (e()) {
                this.w = true;
            }
            this.z = (int) (Math.abs(bVar.j.x) + Math.abs(bVar.j.y));
            if (!f()) {
                a(bVar.j.x, bVar.j.y);
                float x2 = this.m.getX();
                float y2 = this.m.getY();
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(x2), Float.valueOf(y2)}, this, f67326f, false, 77065, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(x2), Float.valueOf(y2)}, this, f67326f, false, 77065, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                } else {
                    f(x2 + ((float) (this.m.getWidth() / 2)), y2 + ((float) (this.m.getHeight() / 2)));
                    this.f67327a.x += (float) this.j;
                    if (c() && this.n != null) {
                        this.n.a(this, this.f67327a.x, this.f67327a.y, new RectF(this.l.getHelpBoxRect()), false);
                    }
                }
            } else if (this.f67329c) {
                float f2 = bVar.j.x;
                float f3 = bVar.j.y;
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67326f, false, 77058, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67326f, false, 77058, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                } else {
                    float centerX = this.l.getHelpBoxRect().centerX();
                    float centerY = this.l.getHelpBoxRect().centerY();
                    float centerX2 = this.l.getRotateRect().centerX();
                    float centerY2 = this.l.getRotateRect().centerY();
                    float f4 = f2 + centerX2;
                    float f5 = f3 + centerY2;
                    float f6 = centerX2 - centerX;
                    float f7 = centerY2 - centerY;
                    float f8 = f4 - centerX;
                    float f9 = f5 - centerY;
                    float sqrt = (float) Math.sqrt((double) ((f6 * f6) + (f7 * f7)));
                    float sqrt2 = (float) Math.sqrt((double) ((f8 * f8) + (f9 * f9)));
                    b(sqrt2 / sqrt);
                    double d2 = (double) (((f6 * f8) + (f7 * f9)) / (sqrt * sqrt2));
                    if (d2 <= 1.0d && d2 >= -1.0d) {
                        a(-(((float) ((f6 * f9) - (f8 * f7) > 0.0f ? 1 : -1)) * ((float) Math.toDegrees(Math.acos(d2)))));
                    }
                }
            }
            if (!this.f67329c) {
                this.f67329c = e();
            }
            h();
            return true;
        }
    }

    private boolean j() {
        if (this.s == 1) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        return this.l.f67313f;
    }

    public final boolean f() {
        if (this.s == 2) {
            return true;
        }
        return false;
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f67326f, false, 77082, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67326f, false, 77082, new Class[0], Void.TYPE);
            return;
        }
        this.l.c();
        if (this.f67328b != null) {
            this.l.removeCallbacks(this.f67328b);
        }
        this.l.postDelayed(this.f67328b, 3000);
    }

    /* renamed from: d */
    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f67326f, false, 77081, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67326f, false, 77081, new Class[0], Void.TYPE);
            return;
        }
        this.l.b();
    }

    public int getContentViewHeight() {
        if (!PatchProxy.isSupport(new Object[0], this, f67326f, false, 77087, new Class[0], Integer.TYPE)) {
            return (int) (((float) this.m.getMeasuredHeight()) * this.h);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67326f, false, 77087, new Class[0], Integer.TYPE)).intValue();
    }

    public PointF getContentViewPoint() {
        if (!PatchProxy.isSupport(new Object[0], this, f67326f, false, 77084, new Class[0], PointF.class)) {
            return new PointF(this.m.getX(), this.m.getY());
        }
        return (PointF) PatchProxy.accessDispatch(new Object[0], this, f67326f, false, 77084, new Class[0], PointF.class);
    }

    public int getContentViewWidth() {
        if (!PatchProxy.isSupport(new Object[0], this, f67326f, false, 77086, new Class[0], Integer.TYPE)) {
            return (int) (((float) this.m.getMeasuredWidth()) * this.h);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67326f, false, 77086, new Class[0], Integer.TYPE)).intValue();
    }

    public PointF[] getFourAnglePoint() {
        if (!PatchProxy.isSupport(new Object[0], this, f67326f, false, 77083, new Class[0], PointF[].class)) {
            return this.l.getFourAnglePoint();
        }
        return (PointF[]) PatchProxy.accessDispatch(new Object[0], this, f67326f, false, 77083, new Class[0], PointF[].class);
    }

    public RectF getViewPositionRect() {
        if (!PatchProxy.isSupport(new Object[0], this, f67326f, false, 77088, new Class[0], RectF.class)) {
            return this.l.getViewBoxRect();
        }
        return (RectF) PatchProxy.accessDispatch(new Object[0], this, f67326f, false, 77088, new Class[0], RectF.class);
    }

    public final void b() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, f67326f, false, 77054, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67326f, false, 77054, new Class[0], Void.TYPE);
            return;
        }
        a();
        this.l.a();
        float f3 = 0.0f;
        if (this.n != null) {
            PointF a2 = this.n.a(0.0f, 0.0f);
            f3 = a2.x;
            f2 = a2.y;
        } else {
            f2 = 0.0f;
        }
        float x2 = this.m.getX() + f3;
        float y2 = this.m.getY() + f2;
        if (this.n == null || !this.f67331e || this.n.b(f3, f2)) {
            this.m.setX(x2);
            this.m.setY(y2);
            this.l.b(f3, f2);
        }
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f67326f, false, 77063, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f67326f, false, 77063, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.o || this.p || this.q || f()) {
            return true;
        } else {
            return false;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f67326f, false, 77053, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67326f, false, 77053, new Class[0], Void.TYPE);
            return;
        }
        Rect rect = new Rect();
        int measuredWidth = this.m.getMeasuredWidth();
        int measuredHeight = this.m.getMeasuredHeight();
        int x2 = (int) this.m.getX();
        int y2 = (int) this.m.getY();
        rect.set(x2, y2, measuredWidth + x2, measuredHeight + y2);
        this.l.a(rect);
        this.l.a(this.h, this.i);
        this.l.setStickerShowHelpboxCallback(new e(this));
    }

    public void setLockMode(boolean z2) {
        this.f67331e = z2;
    }

    public void setStickerEditListener(b bVar) {
        this.n = bVar;
    }

    public c(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z2) {
        if (this.n != null) {
            this.n.a(z2);
        }
    }

    public final PointF a(aj ajVar) {
        if (PatchProxy.isSupport(new Object[]{ajVar}, this, f67326f, false, 77085, new Class[]{aj.class}, PointF.class)) {
            return (PointF) PatchProxy.accessDispatch(new Object[]{ajVar}, this, f67326f, false, 77085, new Class[]{aj.class}, PointF.class);
        }
        Rect rect = new Rect();
        this.m.getHitRect(rect);
        rect.centerX();
        return new PointF(rect.exactCenterX(), rect.exactCenterY());
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67326f, false, 77057, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67326f, false, 77057, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.n == null || !this.f67331e || this.n.c(f2)) {
            this.h *= f2;
            if (this.h > 11.0f) {
                this.h = 11.0f;
            } else if (this.h < 0.4f) {
                this.h = 0.4f;
            } else {
                this.m.setScaleX(this.h);
                this.m.setScaleY(this.h);
                this.l.a(this.h, this.i);
            }
        }
    }

    public final void a(float f2) {
        float f3;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67326f, false, 77056, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67326f, false, 77056, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.n != null) {
            int a2 = this.n.a(false, true, g());
            if (this.f67331e && !this.n.b(f2)) {
                return;
            }
            if (4 == a2) {
                f3 = this.n.a(f2).floatValue();
                this.i -= f3;
                this.m.setRotation(this.i);
                this.l.a(this.h, this.i);
            }
        }
        f3 = f2;
        this.i -= f3;
        this.m.setRotation(this.i);
        this.l.a(this.h, this.i);
    }

    public final boolean a(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f67326f, false, 77074, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f67326f, false, 77074, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        f(motionEvent.getX(), motionEvent.getY());
        this.f67330d = this.l.c(this.f67327a.x, this.f67327a.y);
        float x2 = this.m.getX();
        float y2 = this.m.getY();
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(x2), Float.valueOf(y2)}, this, f67326f, false, 77066, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(x2), Float.valueOf(y2)}, this, f67326f, false, 77066, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else {
            f(x2 + ((float) (this.m.getWidth() / 2)), y2 + ((float) (this.m.getHeight() / 2)));
            this.f67327a.x += (float) this.j;
            if (this.s != -1) {
                if (this.n != null) {
                    this.n.a(this, this.f67327a.x, this.f67327a.y, new RectF(this.l.getHelpBoxRect()), true);
                }
                if (System.currentTimeMillis() - this.r > 300 && this.f67329c) {
                    i();
                    this.f67329c = false;
                }
                if (System.currentTimeMillis() - this.r < 300) {
                    if (!j()) {
                        if (this.s == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (this.n != null) {
                                this.n.a();
                            }
                        } else if (!e() && (!this.w || this.z >= 2)) {
                            i();
                        } else if (this.n != null && this.f67330d) {
                            this.n.a();
                        }
                    } else if (this.n != null) {
                        this.n.a(this);
                    }
                }
                if (this.n != null) {
                    this.n.a(true, false, g());
                }
                z2 = true;
            } else {
                if (this.p && this.n != null) {
                    this.n.a(this, this.f67327a.x, this.f67327a.y, new RectF(this.l.getHelpBoxRect()), true);
                    this.n.a(true, true, g());
                }
                z2 = false;
            }
        }
        if (j()) {
            this.u = true;
        }
        if (this.o) {
            this.v = System.currentTimeMillis();
        }
        this.x = !this.t;
        this.o = false;
        this.q = false;
        this.p = false;
        this.t = false;
        this.s = -1;
        return z2;
    }

    public final void a(int i2, int i3) {
        this.j = i2;
        this.k = i3;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = 1.0f;
        this.f67327a = new PointF();
        this.f67328b = new d(this);
        this.s = -1;
        this.f67330d = false;
        this.f67331e = false;
        this.y = false;
        this.v = 0;
        this.z = 0;
        this.w = false;
        this.x = false;
    }

    public final void f(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67326f, false, 77080, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67326f, false, 77080, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f67327a.set(f2, f3);
        this.f67327a.offset((float) (-this.j), (float) (-this.k));
    }

    public final boolean c(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67326f, false, 77060, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67326f, false, 77060, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        f(f2, f3);
        StickerHelpBoxView stickerHelpBoxView = this.l;
        float f4 = this.f67327a.x;
        float f5 = this.f67327a.y;
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f4), Float.valueOf(f5)}, stickerHelpBoxView, StickerHelpBoxView.f67308a, false, 77105, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return a.b(stickerHelpBoxView.f67310c, f4, f5, stickerHelpBoxView.f67312e);
        }
        Object[] objArr = {Float.valueOf(f4), Float.valueOf(f5)};
        ChangeQuickRedirect changeQuickRedirect = StickerHelpBoxView.f67308a;
        return ((Boolean) PatchProxy.accessDispatch(objArr, stickerHelpBoxView, changeQuickRedirect, false, 77105, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final boolean d(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67326f, false, 77061, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67326f, false, 77061, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        f(f2, f3);
        StickerHelpBoxView stickerHelpBoxView = this.l;
        float f4 = this.f67327a.x;
        float f5 = this.f67327a.y;
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f4), Float.valueOf(f5)}, stickerHelpBoxView, StickerHelpBoxView.f67308a, false, 77106, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return a.b(stickerHelpBoxView.f67309b, f4, f5, stickerHelpBoxView.f67312e);
        }
        Object[] objArr = {Float.valueOf(f4), Float.valueOf(f5)};
        ChangeQuickRedirect changeQuickRedirect = StickerHelpBoxView.f67308a;
        return ((Boolean) PatchProxy.accessDispatch(objArr, stickerHelpBoxView, changeQuickRedirect, false, 77106, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final boolean e(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67326f, false, 77062, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67326f, false, 77062, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        f(f2, f3);
        StickerHelpBoxView stickerHelpBoxView = this.l;
        float f4 = this.f67327a.x;
        float f5 = this.f67327a.y;
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f4), Float.valueOf(f5)}, stickerHelpBoxView, StickerHelpBoxView.f67308a, false, 77107, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return a.b(stickerHelpBoxView.f67311d, f4, f5, stickerHelpBoxView.f67312e);
        }
        Object[] objArr = {Float.valueOf(f4), Float.valueOf(f5)};
        ChangeQuickRedirect changeQuickRedirect = StickerHelpBoxView.f67308a;
        return ((Boolean) PatchProxy.accessDispatch(objArr, stickerHelpBoxView, changeQuickRedirect, false, 77107, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final boolean b(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67326f, false, 77059, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67326f, false, 77059, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        f(f2, f3);
        return this.l.c(this.f67327a.x, this.f67327a.y);
    }

    public final void a(float f2, float f3) {
        float f4;
        float f5;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67326f, false, 77055, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67326f, false, 77055, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.n != null) {
            int a2 = this.n.a(false, false, g());
            if (-1 != a2) {
                PointF a3 = this.n.a(f2, f3, g());
                if (3 == a2) {
                    f5 = a3.x;
                    f4 = a3.y;
                    float x2 = this.m.getX() + f5;
                    float y2 = this.m.getY() + f4;
                    if (this.n != null || !this.f67331e || this.n.b(f5, f4)) {
                        this.m.setX(x2);
                        this.m.setY(y2);
                        this.l.b(f5, f4);
                    }
                    return;
                }
            }
        }
        f5 = f2;
        f4 = f3;
        float x22 = this.m.getX() + f5;
        float y22 = this.m.getY() + f4;
        if (this.n != null) {
        }
        this.m.setX(x22);
        this.m.setY(y22);
        this.l.b(f5, f4);
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3 = z2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f67326f, false, 77052, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f67326f, false, 77052, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.y != z3) {
            this.y = z3;
            a();
        }
    }
}
