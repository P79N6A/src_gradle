package com.bytedance.android.live.uikit.b.a;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8463a;

    /* renamed from: b  reason: collision with root package name */
    protected ScaleGestureDetector f8464b;

    /* renamed from: c  reason: collision with root package name */
    protected GestureDetector f8465c;

    /* renamed from: d  reason: collision with root package name */
    protected float f8466d;

    /* renamed from: e  reason: collision with root package name */
    protected float f8467e;

    /* renamed from: f  reason: collision with root package name */
    protected int f8468f;
    protected boolean g;
    protected boolean h;
    protected boolean i;
    public b j;
    protected boolean k;
    protected View.OnClickListener l;

    /* renamed from: com.bytedance.android.live.uikit.b.a.a$a  reason: collision with other inner class name */
    public class C0066a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8469a;

        public C0066a() {
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f8469a, false, 1878, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f8469a, false, 1878, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            if (a.this.g) {
                float min = Math.min(a.this.getMaxZoom(), Math.max(a.this.a(a.this.getScale(), a.this.getMaxZoom()), a.this.getMinZoom()));
                a.this.f8466d = min;
                a.this.a(min, motionEvent.getX(), motionEvent.getY(), 200.0f);
                a.this.invalidate();
            }
            return super.onDoubleTap(motionEvent);
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f8469a, false, 1879, new Class[]{MotionEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f8469a, false, 1879, new Class[]{MotionEvent.class}, Void.TYPE);
                return;
            }
            if (a.this.isLongClickable() && !a.this.f8464b.isInProgress()) {
                a.this.setPressed(true);
                a.this.performLongClick();
            }
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f8469a, false, 1882, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f8469a, false, 1882, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (a.this.l == null || !a.this.k) {
                return super.onSingleTapConfirmed(motionEvent);
            } else {
                a.this.l.onClick(a.this);
                return true;
            }
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            MotionEvent motionEvent3 = motionEvent;
            MotionEvent motionEvent4 = motionEvent2;
            if (!PatchProxy.isSupport(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f8469a, false, 1881, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return a.this.b(motionEvent3, motionEvent4, f2, f3);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f8469a, false, 1881, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            MotionEvent motionEvent3 = motionEvent;
            MotionEvent motionEvent4 = motionEvent2;
            if (!PatchProxy.isSupport(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f8469a, false, 1880, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return a.this.a(motionEvent3, motionEvent4, f2, f3);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f8469a, false, 1880, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
    }

    public interface b {
    }

    public class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8471a;

        public c() {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f8471a, false, 1883, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f8471a, false, 1883, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
            }
            scaleGestureDetector.getCurrentSpan();
            scaleGestureDetector.getPreviousSpan();
            float scaleFactor = a.this.f8466d * scaleGestureDetector.getScaleFactor();
            if (!a.this.h) {
                return false;
            }
            float min = Math.min(a.this.getMaxZoom(), Math.max(scaleFactor, a.this.getMinZoom() - 0.1f));
            a.this.a(min, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            a.this.f8466d = Math.min(a.this.getMaxZoom(), Math.max(min, a.this.getMinZoom() - 1.0f));
            a.this.f8468f = 1;
            a.this.invalidate();
            return true;
        }
    }

    public final boolean getDoubleTapEnabled() {
        return this.g;
    }

    public final GestureDetector.OnGestureListener getGestureListener() {
        if (!PatchProxy.isSupport(new Object[0], this, f8463a, false, 1868, new Class[0], GestureDetector.OnGestureListener.class)) {
            return new C0066a();
        }
        return (GestureDetector.OnGestureListener) PatchProxy.accessDispatch(new Object[0], this, f8463a, false, 1868, new Class[0], GestureDetector.OnGestureListener.class);
    }

    public final ScaleGestureDetector.OnScaleGestureListener getScaleListener() {
        if (!PatchProxy.isSupport(new Object[0], this, f8463a, false, 1869, new Class[0], ScaleGestureDetector.OnScaleGestureListener.class)) {
            return new c();
        }
        return (ScaleGestureDetector.OnScaleGestureListener) PatchProxy.accessDispatch(new Object[0], this, f8463a, false, 1869, new Class[0], ScaleGestureDetector.OnScaleGestureListener.class);
    }

    public final void setDoubleTapEnabled(boolean z) {
        this.g = z;
    }

    public final void setDoubleTapListener(b bVar) {
        this.j = bVar;
    }

    public final void setMyOnClickListener(View.OnClickListener onClickListener) {
        this.l = onClickListener;
    }

    public final void setScaleEnabled(boolean z) {
        this.h = z;
    }

    public final void setScrollEnabled(boolean z) {
        this.i = z;
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8463a, false, 1873, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8463a, false, 1873, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        super.a(f2);
        if (!this.f8464b.isInProgress()) {
            this.f8466d = f2;
        }
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8463a, false, 1874, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8463a, false, 1874, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        super.b(f2);
        if (!this.f8464b.isInProgress()) {
            this.f8466d = f2;
        }
        if (f2 < getMinZoom()) {
            b(getMinZoom(), 50.0f);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f8463a, false, 1872, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f8463a, false, 1872, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.k = true;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.k = false;
        }
        this.f8464b.onTouchEvent(motionEvent);
        if (!this.f8464b.isInProgress()) {
            this.f8465c.onTouchEvent(motionEvent);
        }
        switch (action) {
            case 0:
                this.D = false;
                break;
            case 1:
                if (getScale() < getMinZoom()) {
                    b(getMinZoom(), 50.0f);
                    break;
                }
                break;
        }
        return true;
    }

    public final void a(Drawable drawable) {
        if (PatchProxy.isSupport(new Object[]{drawable}, this, f8463a, false, 1870, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable}, this, f8463a, false, 1870, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        super.a(drawable);
        float[] fArr = new float[9];
        this.p.getValues(fArr);
        this.f8466d = fArr[0];
    }

    public final boolean a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8463a, false, 1877, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8463a, false, 1877, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (getDrawable() == null) {
            return false;
        } else {
            RectF bitmapRect = getBitmapRect();
            if (bitmapRect == null) {
                return false;
            }
            a(bitmapRect, this.C);
            Rect rect = new Rect();
            getGlobalVisibleRect(rect);
            if (bitmapRect.right < ((float) rect.right) || i2 >= 0) {
                if (((double) Math.abs(bitmapRect.left - this.C.left)) > 1.0d) {
                    return true;
                }
                return false;
            } else if (Math.abs(bitmapRect.right - ((float) rect.right)) > 1.0f) {
                return true;
            } else {
                return false;
            }
        }
    }

    public final float a(float f2, float f3) {
        if (this.f8468f != 1) {
            this.f8468f = 1;
            return 1.0f;
        } else if ((this.f8467e * 2.0f) + f2 <= f3) {
            return f2 + this.f8467e;
        } else {
            this.f8468f = -1;
            return f3;
        }
    }

    public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f8463a, false, 1876, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f8463a, false, 1876, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!this.i) {
            return false;
        } else {
            Logger.debug();
            if (motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || this.f8464b.isInProgress()) {
                return false;
            }
            float x = motionEvent2.getX() - motionEvent.getX();
            float y = motionEvent2.getY() - motionEvent.getY();
            if (Math.abs(f2) <= 800.0f && Math.abs(f3) <= 800.0f) {
                return false;
            }
            a(x / 2.0f, y / 2.0f, 300.0d);
            invalidate();
            return true;
        }
    }

    public final void a(Drawable drawable, boolean z, Matrix matrix, float f2) {
        if (PatchProxy.isSupport(new Object[]{drawable, Byte.valueOf(z ? (byte) 1 : 0), matrix, Float.valueOf(f2)}, this, f8463a, false, 1871, new Class[]{Drawable.class, Boolean.TYPE, Matrix.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable, Byte.valueOf(z), matrix, Float.valueOf(f2)}, this, f8463a, false, 1871, new Class[]{Drawable.class, Boolean.TYPE, Matrix.class, Float.TYPE}, Void.TYPE);
            return;
        }
        super.a(drawable, z, matrix, f2);
        this.f8467e = getMaxZoom() / 3.0f;
    }

    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f8463a, false, 1875, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f8463a, false, 1875, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!this.i || motionEvent == null || motionEvent2 == null || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || this.f8464b.isInProgress()) {
            return false;
        } else {
            float scale = getScale();
            Logger.debug();
            if (scale == 1.0f && !this.y) {
                return false;
            }
            c(-f2, -f3);
            invalidate();
            return true;
        }
    }
}
