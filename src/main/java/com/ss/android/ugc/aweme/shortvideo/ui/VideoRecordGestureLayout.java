package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.GestureDetectorCompat;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.gesture.a.b;
import com.ss.android.ugc.aweme.shortvideo.gesture.a.c;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.utils.dh;
import java.lang.reflect.Field;

public class VideoRecordGestureLayout extends FrameLayout implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f70624b;

    /* renamed from: a  reason: collision with root package name */
    private float f70625a;

    /* renamed from: c  reason: collision with root package name */
    a f70626c;

    /* renamed from: d  reason: collision with root package name */
    GestureDetectorCompat f70627d;

    /* renamed from: e  reason: collision with root package name */
    ScaleGestureDetector f70628e;

    /* renamed from: f  reason: collision with root package name */
    c f70629f;
    com.ss.android.ugc.aweme.shortvideo.gesture.a.b g;
    float h;
    float i;
    float j;
    float k;
    boolean l;
    private c.b m;
    private b.a n;

    public interface a {
        boolean a(float f2);

        boolean a(MotionEvent motionEvent);

        boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3);

        boolean a(ScaleGestureDetector scaleGestureDetector);

        boolean a(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar);

        boolean a(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar, float f2, float f3);

        boolean a(c cVar);

        void b(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar);

        boolean b();

        boolean b(float f2);

        boolean b(MotionEvent motionEvent);

        boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3);

        boolean b(ScaleGestureDetector scaleGestureDetector);

        boolean c();

        boolean c(float f2);

        boolean c(MotionEvent motionEvent);

        boolean d(MotionEvent motionEvent);

        boolean e(MotionEvent motionEvent);
    }

    public static abstract class b implements a {
        public boolean a(float f2) {
            return false;
        }

        public boolean a(MotionEvent motionEvent) {
            return false;
        }

        public boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return false;
        }

        public boolean a(ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        public boolean a(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar) {
            return false;
        }

        public boolean a(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar, float f2, float f3) {
            return false;
        }

        public boolean a(c cVar) {
            return false;
        }

        public void b(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar) {
        }

        public boolean b() {
            return false;
        }

        public boolean b(float f2) {
            return false;
        }

        public boolean b(MotionEvent motionEvent) {
            return false;
        }

        public boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return false;
        }

        public boolean b(ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        public boolean c() {
            return false;
        }

        public boolean c(float f2) {
            return false;
        }

        public boolean c(MotionEvent motionEvent) {
            return false;
        }

        public boolean d(MotionEvent motionEvent) {
            return false;
        }

        public boolean e(MotionEvent motionEvent) {
            return false;
        }
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public float getProtectY() {
        return this.f70625a;
    }

    public ScaleGestureDetector getScaleGestureDetector() {
        return this.f70628e;
    }

    public void setOnGestureListener(a aVar) {
        this.f70626c = aVar;
    }

    public VideoRecordGestureLayout(@NonNull Context context) {
        this(context, null);
    }

    public void setSloppyExtra(int i2) {
        this.f70629f.q = i2;
    }

    public void setProtectY(float f2) {
        this.f70625a = (f2 * 17.0f) / 20.0f;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!PatchProxy.isSupport(new Object[]{motionEvent}, this, f70624b, false, 80500, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f70624b, false, 80500, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f70624b, false, 80506, new Class[]{ScaleGestureDetector.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f70624b, false, 80506, new Class[]{ScaleGestureDetector.class}, Void.TYPE);
            return;
        }
        if (this.f70626c != null) {
            this.f70626c.a(this.h);
        }
    }

    public void dispatchDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f70624b, false, 80512, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f70624b, false, 80512, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.dispatchDraw(canvas);
        if (PatchProxy.isSupport(new Object[0], null, dh.f75749a, true, 88516, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, dh.f75749a, true, 88516, new Class[0], Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - dh.f75750b;
        ai.d("open camera to view visible cost = " + currentTimeMillis);
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f70624b, false, 80504, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f70624b, false, 80504, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f70626c == null) {
            return false;
        } else {
            boolean b2 = this.f70626c.b(scaleGestureDetector);
            if (b2) {
                this.h = scaleGestureDetector.getScaleFactor();
            }
            return b2;
        }
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f70624b, false, 80505, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f70624b, false, 80505, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f70626c == null || !this.f70626c.a(scaleGestureDetector)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f70624b, false, 80507, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f70624b, false, 80507, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f70626c == null || !this.f70626c.a(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f70624b, false, 80501, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f70624b, false, 80501, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        this.j = motionEvent.getX();
        this.k = motionEvent.getY();
        if (this.f70626c == null || !this.f70626c.b(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f70624b, false, 80499, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f70624b, false, 80499, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        this.f70628e.onTouchEvent(motionEvent);
        this.f70629f.a(motionEvent);
        this.g.a(motionEvent);
        if ((motionEvent.getAction() & 255) == 0) {
            this.l = false;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.l = true;
        }
        if (!this.l) {
            this.f70627d.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f70624b, false, 80508, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f70624b, false, 80508, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (motionEvent.getAction() != 1) {
            return false;
        } else {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int i2 = measuredWidth / 10;
            int i3 = measuredHeight / 10;
            if (this.f70626c == null) {
                return false;
            }
            if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f70624b, false, 80510, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f70624b, false, 80510, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else {
                float x = motionEvent.getX() - this.j;
                float y = motionEvent.getY() - this.k;
                if ((x * x) + (y * y) < this.i) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                return false;
            }
            if (PatchProxy.isSupport(new Object[]{motionEvent2, Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f70624b, false, 80509, new Class[]{MotionEvent.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2, Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f70624b, false, 80509, new Class[]{MotionEvent.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else {
                float f2 = (float) i2;
                if (motionEvent.getX() >= f2 && ((float) measuredWidth) - motionEvent.getX() >= f2) {
                    float f3 = (float) i3;
                    if (motionEvent.getY() >= f3 && ((float) measuredHeight) - motionEvent.getY() >= f3) {
                        z2 = false;
                    }
                }
            }
            if (z2) {
                return false;
            }
            return this.f70626c.c(motionEvent2);
        }
    }

    public VideoRecordGestureLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f70624b, false, 80511, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f70624b, false, 80511, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f70626c == null) {
            return false;
        } else {
            switch (motionEvent.getAction()) {
                case 0:
                    this.f70626c.d(motionEvent);
                    break;
                case 1:
                    this.f70626c.e(motionEvent);
                    break;
                case 3:
                    this.f70626c.e(motionEvent);
                    break;
                case 5:
                    this.f70626c.b();
                    break;
                case 6:
                    this.f70626c.c();
                    break;
            }
            return false;
        }
    }

    public VideoRecordGestureLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2) {
        super(context, attributeSet, i2);
        this.h = 1.0f;
        this.f70625a = 1000.0f;
        this.m = new c.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70630a;

            public final boolean a(c cVar) {
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f70630a, false, 80513, new Class[]{c.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar}, this, f70630a, false, 80513, new Class[]{c.class}, Boolean.TYPE)).booleanValue();
                }
                float b2 = cVar.b();
                if (VideoRecordGestureLayout.this.f70626c != null) {
                    VideoRecordGestureLayout.this.f70626c.b(b2);
                }
                return true;
            }

            public final boolean b(c cVar) {
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f70630a, false, 80515, new Class[]{c.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar}, this, f70630a, false, 80515, new Class[]{c.class}, Boolean.TYPE)).booleanValue();
                }
                if (VideoRecordGestureLayout.this.f70626c != null) {
                    VideoRecordGestureLayout.this.f70626c.a(cVar);
                }
                return true;
            }

            public final void c(c cVar) {
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f70630a, false, 80514, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f70630a, false, 80514, new Class[]{c.class}, Void.TYPE);
                    return;
                }
                float b2 = cVar.b();
                if (VideoRecordGestureLayout.this.f70626c != null) {
                    VideoRecordGestureLayout.this.f70626c.c(b2);
                }
            }
        };
        this.n = new b.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70632a;

            public final void b(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar) {
                if (PatchProxy.isSupport(new Object[]{bVar}, this, f70632a, false, 80518, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar}, this, f70632a, false, 80518, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class}, Void.TYPE);
                    return;
                }
                if (VideoRecordGestureLayout.this.f70626c != null) {
                    VideoRecordGestureLayout.this.f70626c.b(bVar);
                }
            }

            public final boolean a(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar) {
                if (PatchProxy.isSupport(new Object[]{bVar}, this, f70632a, false, 80516, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar}, this, f70632a, false, 80516, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class}, Boolean.TYPE)).booleanValue();
                }
                if (VideoRecordGestureLayout.this.f70626c != null) {
                    VideoRecordGestureLayout.this.f70626c.a(bVar);
                }
                return true;
            }

            public final boolean a(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar, float f2, float f3) {
                com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar2 = bVar;
                if (PatchProxy.isSupport(new Object[]{bVar2, Float.valueOf(f2), Float.valueOf(f3)}, this, f70632a, false, 80517, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2, Float.valueOf(f2), Float.valueOf(f3)}, this, f70632a, false, 80517, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                }
                if (VideoRecordGestureLayout.this.f70626c != null) {
                    float f4 = f2;
                    VideoRecordGestureLayout.this.f70626c.a(bVar, f2, f3);
                }
                return true;
            }
        };
        if (PatchProxy.isSupport(new Object[]{context}, this, f70624b, false, 80498, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f70624b, false, 80498, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f70629f = new c(context, this.m);
        this.g = new com.ss.android.ugc.aweme.shortvideo.gesture.a.b(context, this.n);
        this.f70627d = new GestureDetectorCompat(context, this);
        this.f70627d.setOnDoubleTapListener(this);
        this.f70628e = new ScaleGestureDetector(context, this);
        float scaledDoubleTapSlop = (float) ViewConfiguration.get(getContext()).getScaledDoubleTapSlop();
        this.i = scaledDoubleTapSlop * scaledDoubleTapSlop;
        setOnTouchListener(this);
        try {
            Field declaredField = this.f70628e.getClass().getDeclaredField("mSpanSlop");
            declaredField.setAccessible(true);
            int intValue = ((Integer) declaredField.get(this.f70628e)).intValue();
            Field declaredField2 = this.f70628e.getClass().getDeclaredField("mMinSpan");
            declaredField2.setAccessible(true);
            declaredField2.set(this.f70628e, Integer.valueOf(intValue * 6));
        } catch (Throwable unused) {
        }
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        MotionEvent motionEvent3 = motionEvent;
        MotionEvent motionEvent4 = motionEvent2;
        if (PatchProxy.isSupport(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f70624b, false, 80503, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f70624b, false, 80503, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f70626c == null || !this.f70626c.b(motionEvent3, motionEvent4, f2, f3)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        MotionEvent motionEvent3 = motionEvent;
        MotionEvent motionEvent4 = motionEvent2;
        if (PatchProxy.isSupport(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f70624b, false, 80502, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f70624b, false, 80502, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (motionEvent3 == null || motionEvent4 == null || this.f70626c == null) {
            return false;
        } else {
            this.f70626c.a(motionEvent3, motionEvent4, f2, f3);
            return true;
        }
    }
}
