package it.sephiroth.android.library.imagezoom;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;

public class ImageViewTouch extends a {

    /* renamed from: a  reason: collision with root package name */
    protected ScaleGestureDetector f83383a;

    /* renamed from: b  reason: collision with root package name */
    protected GestureDetector f83384b;

    /* renamed from: c  reason: collision with root package name */
    protected int f83385c;

    /* renamed from: d  reason: collision with root package name */
    protected float f83386d;

    /* renamed from: e  reason: collision with root package name */
    protected int f83387e;

    /* renamed from: f  reason: collision with root package name */
    protected GestureDetector.OnGestureListener f83388f;
    protected ScaleGestureDetector.OnScaleGestureListener g;
    protected boolean h;
    protected boolean i;
    protected boolean j;
    public b k;
    public c l;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }

        public a() {
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (ImageViewTouch.this.l != null) {
                ImageViewTouch.this.l.a();
            }
            return true;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (ImageViewTouch.this.isLongClickable() && !ImageViewTouch.this.f83383a.isInProgress()) {
                ImageViewTouch.this.setPressed(true);
                ImageViewTouch.this.performLongClick();
            }
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (ImageViewTouch.this.h) {
                ImageViewTouch.this.s = true;
                ImageViewTouch.this.a(Math.min(ImageViewTouch.this.getMaxScale(), Math.max(ImageViewTouch.this.a(ImageViewTouch.this.getScale(), ImageViewTouch.this.getMaxScale()), ImageViewTouch.this.getMinScale())), motionEvent.getX(), motionEvent.getY(), 200.0f);
                ImageViewTouch.this.invalidate();
            }
            return super.onDoubleTap(motionEvent);
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (ImageViewTouch.this.j && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1 && !ImageViewTouch.this.f83383a.isInProgress() && ImageViewTouch.this.getScale() != 1.0f) {
                return ImageViewTouch.this.a(motionEvent, motionEvent2, f2, f3);
            }
            return false;
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (ImageViewTouch.this.j && motionEvent != null && motionEvent2 != null && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1 && !ImageViewTouch.this.f83383a.isInProgress()) {
                return ImageViewTouch.this.b(f2, f3);
            }
            return false;
        }
    }

    public interface b {
    }

    public interface c {
        void a();
    }

    public class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        /* renamed from: a  reason: collision with root package name */
        protected boolean f83390a;

        public d() {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
            float scale = ImageViewTouch.this.getScale() * scaleGestureDetector.getScaleFactor();
            if (ImageViewTouch.this.i) {
                if (this.f83390a && currentSpan != 0.0f) {
                    ImageViewTouch.this.s = true;
                    ImageViewTouch.this.a(Math.min(ImageViewTouch.this.getMaxScale(), Math.max(scale, ImageViewTouch.this.getMinScale() - 0.1f)), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    ImageViewTouch.this.f83387e = 1;
                    ImageViewTouch.this.invalidate();
                    return true;
                } else if (!this.f83390a) {
                    this.f83390a = true;
                }
            }
            return true;
        }
    }

    public boolean getDoubleTapEnabled() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public GestureDetector.OnGestureListener getGestureListener() {
        return new a();
    }

    /* access modifiers changed from: protected */
    public ScaleGestureDetector.OnScaleGestureListener getScaleListener() {
        return new d();
    }

    public void setDoubleTapEnabled(boolean z) {
        this.h = z;
    }

    public void setDoubleTapListener(b bVar) {
        this.k = bVar;
    }

    public void setScaleEnabled(boolean z) {
        this.i = z;
    }

    public void setScrollEnabled(boolean z) {
        this.j = z;
    }

    public void setSingleTapListener(c cVar) {
        this.l = cVar;
    }

    public ImageViewTouch(Context context) {
        super(context);
        this.h = true;
        this.i = true;
        this.j = true;
    }

    /* access modifiers changed from: protected */
    public final void a(float f2) {
        if (f2 < getMinScale()) {
            c(getMinScale(), 50.0f);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f83383a.onTouchEvent(motionEvent);
        if (!this.f83383a.isInProgress()) {
            this.f83384b.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1 && getScale() < getMinScale()) {
            c(getMinScale(), 50.0f);
        }
        return true;
    }

    public final boolean a(int i2) {
        RectF bitmapRect = getBitmapRect();
        a(bitmapRect, this.z);
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        if (bitmapRect == null) {
            return false;
        }
        if (bitmapRect.right < ((float) rect.right) || i2 >= 0) {
            if (((double) Math.abs(bitmapRect.left - this.z.left)) > 1.0d) {
                return true;
            }
            return false;
        } else if (Math.abs(bitmapRect.right - ((float) rect.right)) > 1.0f) {
            return true;
        } else {
            return false;
        }
    }

    public ImageViewTouch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public final float a(float f2, float f3) {
        if (this.f83387e != 1) {
            this.f83387e = 1;
            return 1.0f;
        } else if ((this.f83386d * 2.0f) + f2 <= f3) {
            return f2 + this.f83386d;
        } else {
            this.f83387e = -1;
            return f3;
        }
    }

    public final boolean b(float f2, float f3) {
        if (getScale() == 1.0f) {
            return false;
        }
        this.s = true;
        d(-f2, -f3);
        invalidate();
        return true;
    }

    public ImageViewTouch(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = true;
        this.i = true;
        this.j = true;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, AttributeSet attributeSet, int i2) {
        super.a(context, attributeSet, i2);
        this.f83385c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f83388f = getGestureListener();
        this.g = getScaleListener();
        this.f83383a = new ScaleGestureDetector(getContext(), this.g);
        this.f83384b = new GestureDetector(getContext(), this.f83388f, null, true);
        this.f83387e = 1;
    }

    /* access modifiers changed from: protected */
    public final void a(Drawable drawable, Matrix matrix, float f2, float f3) {
        super.a(drawable, matrix, f2, f3);
        this.f83386d = getMaxScale() / 3.0f;
    }

    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        if (Math.abs(f2) <= 800.0f && Math.abs(f3) <= 800.0f) {
            return false;
        }
        this.s = true;
        a(x / 2.0f, y / 2.0f, 300.0d);
        invalidate();
        return true;
    }
}
