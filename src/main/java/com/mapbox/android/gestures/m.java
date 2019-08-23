package com.mapbox.android.gestures;

import android.content.Context;
import android.support.annotation.UiThread;
import android.support.v4.view.GestureDetectorCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;

@UiThread
public final class m extends a<b> {
    final b g = new b() {
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (!m.this.a(10) || !((b) m.this.f25946f).onDoubleTap(motionEvent)) {
                return false;
            }
            return true;
        }

        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (!m.this.a(11) || !((b) m.this.f25946f).onDoubleTapEvent(motionEvent)) {
                return false;
            }
            return true;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            if (!m.this.a(9) || !((b) m.this.f25946f).onDown(motionEvent)) {
                return false;
            }
            return true;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (m.this.a(6)) {
                ((b) m.this.f25946f).onLongPress(motionEvent);
            }
        }

        public final void onShowPress(MotionEvent motionEvent) {
            if (m.this.a(8)) {
                ((b) m.this.f25946f).onShowPress(motionEvent);
            }
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (!m.this.a(12) || !((b) m.this.f25946f).onSingleTapConfirmed(motionEvent)) {
                return false;
            }
            return true;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (!m.this.a(5) || !((b) m.this.f25946f).onSingleTapUp(motionEvent)) {
                return false;
            }
            return true;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (!m.this.a(7) || !((b) m.this.f25946f).onFling(motionEvent, motionEvent2, f2, f3)) {
                return false;
            }
            return true;
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (!m.this.a(0) || !((b) m.this.f25946f).onScroll(motionEvent, motionEvent2, f2, f3)) {
                return false;
            }
            return true;
        }
    };
    private final GestureDetectorCompat h;

    public static class a implements b {
        public boolean onDoubleTap(MotionEvent motionEvent) {
            return false;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return false;
        }

        public void onShowPress(MotionEvent motionEvent) {
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return false;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public interface b extends GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener {
    }

    /* access modifiers changed from: protected */
    public final boolean b(MotionEvent motionEvent) {
        return this.h.onTouchEvent(motionEvent);
    }

    public m(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        this.h = new GestureDetectorCompat(context, this.g);
    }
}
