package f.a.a.a.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

@TargetApi(8)
public final class c extends b {

    /* renamed from: f  reason: collision with root package name */
    protected final ScaleGestureDetector f83099f;

    public final boolean a() {
        return this.f83099f.isInProgress();
    }

    public c(Context context) {
        super(context);
        this.f83099f = new ScaleGestureDetector(context, new ScaleGestureDetector.OnScaleGestureListener() {
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }

            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                c.this.f83092a.b(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                return true;
            }
        });
    }

    public final boolean c(MotionEvent motionEvent) {
        this.f83099f.onTouchEvent(motionEvent);
        return super.c(motionEvent);
    }
}
