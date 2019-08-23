package com.ss.android.ugc.aweme.shortvideo.ar.a;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.medialib.f;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.gesture.a.c;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;

public final class a extends com.ss.android.ugc.aweme.shortvideo.gesture.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65662a;

    /* renamed from: b  reason: collision with root package name */
    private FaceStickerBean f65663b;

    /* renamed from: c  reason: collision with root package name */
    private MediaRecordPresenter f65664c;

    /* renamed from: d  reason: collision with root package name */
    private int f65665d;

    /* renamed from: e  reason: collision with root package name */
    private int f65666e;

    /* renamed from: f  reason: collision with root package name */
    private float f65667f = 1.0f;
    private float g = 1.0f;
    private float h;
    private boolean i;
    private PointF j = new PointF(-2.0f, -2.0f);
    private int k;
    private int l;
    private int m;
    private int n;
    private PointF o = new PointF();

    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public final boolean a(c cVar) {
        return true;
    }

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        return false;
    }

    public final boolean c(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f65662a, false, 75104, new Class[]{Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f65662a, false, 75104, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        f.a().a(-f2, 6.0f);
        r.onEvent(MobClick.obtain().setEventName("ar_prop_spin").setLabelName("shoot_page").setExtValueLong(this.f65663b.getStickerId()));
        return true;
    }

    public final boolean d(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f65662a, false, 75105, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f65662a, false, 75105, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        a(motionEvent.getX(), motionEvent.getY());
        f.a().a(0, this.o.x / ((float) this.f65665d), this.o.y / ((float) this.f65666e), 0);
        this.i = true;
        return false;
    }

    public final boolean e(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f65662a, false, 75106, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f65662a, false, 75106, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        a(motionEvent.getX(), motionEvent.getY());
        f.a().a(2, this.o.x / ((float) this.f65665d), this.o.y / ((float) this.f65666e), 0);
        this.i = false;
        return false;
    }

    public final boolean a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f65662a, false, 75102, new Class[]{Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f65662a, false, 75102, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        r.onEvent(MobClick.obtain().setEventName("ar_prop_scale").setLabelName("shoot_page").setExtValueLong(this.f65663b.getStickerId()));
        this.f65667f = 1.0f;
        this.g = 1.0f;
        return true;
    }

    public final boolean b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f65662a, false, 75103, new Class[]{Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f65662a, false, 75103, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        f.a().a(-f2, 6.0f);
        return true;
    }

    public final boolean c(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f65662a, false, 75100, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f65662a, false, 75100, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        a(motionEvent.getX(), motionEvent.getY());
        PointF b2 = b(this.o.x, this.o.y);
        if (this.f65664c != null) {
            MediaRecordPresenter mediaRecordPresenter = this.f65664c;
            float f2 = b2.x;
            float f3 = b2.y;
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17671, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)) {
                MediaRecordPresenter mediaRecordPresenter2 = mediaRecordPresenter;
                ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, mediaRecordPresenter2, MediaRecordPresenter.f29728a, false, 17671, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
            } else {
                mediaRecordPresenter.j.slamProcessDoubleClickEvent(f2, f3);
            }
        }
        return true;
    }

    public final boolean b(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f65662a, false, 75099, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f65662a, false, 75099, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        a(motionEvent.getX(), motionEvent.getY());
        PointF b2 = b(this.o.x, this.o.y);
        f a2 = f.a();
        float f2 = b2.x;
        float f3 = b2.y;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, a2, f.f29650a, false, 16493, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)) {
            f fVar = a2;
            ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, fVar, f.f29650a, false, 16493, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (a2.f29653b != null) {
            a2.f29653b.slamProcessTouchEvent(f2, f3);
        }
        r.onEvent(MobClick.obtain().setEventName("ar_prop_click").setLabelName("shoot_page").setExtValueLong(this.f65663b.getStickerId()));
        return true;
    }

    public final boolean b(ScaleGestureDetector scaleGestureDetector) {
        if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f65662a, false, 75101, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f65662a, false, 75101, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
        }
        this.g *= scaleGestureDetector.getScaleFactor();
        float f2 = this.g / this.f65667f;
        f a2 = f.a();
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(3.0f)}, a2, f.f29650a, false, 16497, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)) {
            ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(3.0f)}, a2, f.f29650a, false, 16497, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (a2.f29653b != null) {
            a2.f29653b.slamProcessScaleEvent(f2, 3.0f);
        }
        this.f65667f = this.g;
        return true;
    }

    public final a a(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return this;
        }
        this.m = i2;
        this.n = i3;
        return this;
    }

    public a(FaceStickerBean faceStickerBean, MediaRecordPresenter mediaRecordPresenter) {
        int i2;
        this.f65663b = faceStickerBean;
        this.f65664c = mediaRecordPresenter;
        this.f65665d = p.b();
        WindowManager windowManager = (WindowManager) GlobalContext.getContext().getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            if (defaultDisplay == null) {
                i2 = 0;
            } else {
                defaultDisplay.getSize(point);
                i2 = point.y;
            }
        } else {
            i2 = GlobalContext.getContext().getResources().getDisplayMetrics().heightPixels;
        }
        this.f65666e = i2;
        this.k = com.ss.android.ugc.aweme.port.in.a.q.getVideoWidth();
        this.l = com.ss.android.ugc.aweme.port.in.a.q.getVideoHeight();
        this.m = this.k;
        this.n = this.l;
    }

    private void a(float f2, float f3) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f65662a, false, 75107, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f65662a, false, 75107, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (fc.a() && fb.a()) {
            i2 = fb.f67664c;
        }
        this.o.set(f2, f3);
        this.o.offset(0.0f, (float) (-i2));
    }

    private PointF b(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f65662a, false, 75108, new Class[]{Float.TYPE, Float.TYPE}, PointF.class)) {
            return (PointF) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f65662a, false, 75108, new Class[]{Float.TYPE, Float.TYPE}, PointF.class);
        }
        PointF pointF = new PointF();
        pointF.x = (((float) ((this.m - this.f65665d) / 2)) + f2) / ((float) this.m);
        pointF.y = f3 / ((float) this.n);
        return pointF;
    }

    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f65662a, false, 75097, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f65662a, false, 75097, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (this.i) {
            this.j.x = motionEvent.getX();
            this.j.y = motionEvent.getY();
            this.i = false;
        }
        f.a().a(motionEvent2.getX() / ((float) this.f65665d), motionEvent2.getY() / ((float) this.f65666e), (motionEvent2.getX() - this.j.x) / ((float) this.f65665d), (motionEvent2.getY() - this.j.y) / ((float) this.f65666e), 1.0f);
        this.j.x = motionEvent2.getX();
        this.j.y = motionEvent2.getY();
        if (!(motionEvent == null || motionEvent.getX() == this.h)) {
            this.h = motionEvent.getX();
            r.onEvent(MobClick.obtain().setEventName("ar_prop_drag").setLabelName("shoot_page").setExtValueLong(this.f65663b.getStickerId()));
        }
        return true;
    }

    public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f65662a, false, 75098, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f65662a, false, 75098, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        r.onEvent(MobClick.obtain().setEventName("ar_prop_control_alert").setLabelName("shoot_page"));
        return true;
    }
}
