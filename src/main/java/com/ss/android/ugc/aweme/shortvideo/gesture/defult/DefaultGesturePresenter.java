package com.ss.android.ugc.aweme.shortvideo.gesture.defult;

import android.arch.lifecycle.LifecycleOwner;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.gesture.IGesturePresenter;
import com.ss.android.ugc.aweme.shortvideo.gesture.a;
import com.ss.android.ugc.aweme.shortvideo.gesture.a.b;
import com.ss.android.ugc.aweme.shortvideo.gesture.a.c;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout;

public class DefaultGesturePresenter implements IGesturePresenter, VideoRecordGestureLayout.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67904a;

    /* renamed from: b  reason: collision with root package name */
    public a f67905b = new a.C0715a();

    /* renamed from: c  reason: collision with root package name */
    VideoRecordGestureLayout f67906c;

    /* renamed from: d  reason: collision with root package name */
    public float f67907d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public boolean f67908e;

    /* renamed from: f  reason: collision with root package name */
    boolean f67909f = true;
    private c g;
    private int h;

    public final boolean b(ScaleGestureDetector scaleGestureDetector) {
        if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f67904a, false, 77380, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f67904a, false, 77380, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f67905b != null && this.f67905b.b(scaleGestureDetector)) {
            return true;
        } else {
            c cVar = this.g;
            scaleGestureDetector.getScaleFactor();
            if (cVar.c()) {
                return true;
            }
            return this.g.b(scaleGestureDetector);
        }
    }

    public final boolean a(c cVar) {
        if (!PatchProxy.isSupport(new Object[]{cVar}, this, f67904a, false, 77382, new Class[]{c.class}, Boolean.TYPE)) {
            return this.f67905b != null && this.f67905b.a(cVar);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar}, this, f67904a, false, 77382, new Class[]{c.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(b bVar) {
        if (!PatchProxy.isSupport(new Object[]{bVar}, this, f67904a, false, 77389, new Class[]{b.class}, Boolean.TYPE)) {
            return this.f67905b != null && this.f67905b.a(bVar);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar}, this, f67904a, false, 77389, new Class[]{b.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(b bVar, float f2, float f3) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2, Float.valueOf(f2), Float.valueOf(f3)}, this, f67904a, false, 77390, new Class[]{b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2, Float.valueOf(f2), Float.valueOf(f3)}, this, f67904a, false, 77390, new Class[]{b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (this.f67905b != null) {
            float f4 = f2;
            if (this.f67905b.a(bVar, f2, f3)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f67904a, false, 77388, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f67904a, false, 77388, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f67905b != null && this.f67905b.c()) {
            z = true;
        }
        return z;
    }

    public void disAttachView() {
        if (PatchProxy.isSupport(new Object[0], this, f67904a, false, 77371, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67904a, false, 77371, new Class[0], Void.TYPE);
            return;
        }
        this.f67906c.setOnGestureListener(null);
    }

    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f67904a, false, 77387, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f67904a, false, 77387, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f67905b != null && this.f67905b.b()) {
            z = true;
        }
        return z;
    }

    public final void b(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f67904a, false, 77391, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f67904a, false, 77391, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (this.f67905b != null) {
            this.f67905b.b(bVar);
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f67904a, false, 77370, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f67904a, false, 77370, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view instanceof VideoRecordGestureLayout) {
            this.f67906c = (VideoRecordGestureLayout) view;
            this.f67906c.setOnGestureListener(this);
        }
    }

    public final void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f67904a, false, 77372, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f67904a, false, 77372, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (!(view == null || this.f67906c == null)) {
            this.f67906c.post(new a(this, view));
        }
    }

    public final boolean c(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67904a, false, 77384, new Class[]{Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67904a, false, 77384, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f67905b == null || !this.f67905b.c(f2)) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean d(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f67904a, false, 77385, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f67904a, false, 77385, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f67905b == null || !this.f67905b.d(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean e(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f67904a, false, 77386, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f67904a, false, 77386, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f67905b == null || !this.f67905b.e(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67904a, false, 77381, new Class[]{Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67904a, false, 77381, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        this.g.b(f2);
        if (this.f67905b == null || !this.f67905b.a(f2)) {
            return false;
        }
        return true;
    }

    public final boolean c(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f67904a, false, 77377, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f67904a, false, 77377, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.f67909f) {
            this.f67909f = false;
            new Handler().postDelayed(new b(this), 300);
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f67904a, false, 77378, new Class[]{MotionEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f67904a, false, 77378, new Class[]{MotionEvent.class}, Void.TYPE);
            } else if (this.f67905b == null || !this.f67905b.c(motionEvent)) {
                this.g.a();
                this.g.b();
            }
        }
        return true;
    }

    public final boolean a(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f67904a, false, 77375, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f67904a, false, 77375, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f67905b != null && this.f67905b.a(motionEvent)) {
            return true;
        } else {
            this.g.a(motionEvent);
            return true;
        }
    }

    public final boolean b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67904a, false, 77383, new Class[]{Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67904a, false, 77383, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f67905b == null || !this.f67905b.b(f2)) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean b(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f67904a, false, 77376, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f67904a, false, 77376, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f67905b == null || !this.f67905b.b(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f67904a, false, 77379, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f67904a, false, 77379, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f67905b == null || !this.f67905b.a(scaleGestureDetector)) {
            return this.g.a(scaleGestureDetector);
        } else {
            return true;
        }
    }

    public DefaultGesturePresenter(LifecycleOwner lifecycleOwner, c cVar, View view) {
        this.g = cVar;
        a(view);
        lifecycleOwner.getLifecycle().addObserver(this);
        this.h = ViewConfiguration.get(com.ss.android.ugc.aweme.port.in.a.f61119b).getScaledPagingTouchSlop();
    }

    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        MotionEvent motionEvent3 = motionEvent;
        MotionEvent motionEvent4 = motionEvent2;
        float f4 = f2;
        if (PatchProxy.isSupport(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f67904a, false, 77373, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f67904a, false, 77373, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f67905b != null && this.f67905b.a(motionEvent3, motionEvent4, f4, f3)) {
            return true;
        } else {
            int abs = (int) Math.abs(motionEvent.getX() - motionEvent2.getX());
            int abs2 = (int) Math.abs(motionEvent.getY() - motionEvent2.getY());
            if (abs <= this.h || abs <= abs2 || this.f67908e) {
                return false;
            }
            this.f67907d += f4 / ((float) this.f67906c.getWidth());
            this.f67907d = Math.min(this.f67907d, 1.0f);
            this.f67907d = Math.max(this.f67907d, -1.0f);
            this.g.a(this.f67907d);
            return true;
        }
    }

    public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        MotionEvent motionEvent3 = motionEvent;
        MotionEvent motionEvent4 = motionEvent2;
        float f4 = f2;
        if (PatchProxy.isSupport(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f67904a, false, 77374, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f67904a, false, 77374, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f67905b != null && this.f67905b.b(motionEvent3, motionEvent4, f4, f3)) {
            return true;
        } else {
            if (this.f67908e) {
                return false;
            }
            this.g.a(f4, this.f67907d);
            this.f67907d = 0.0f;
            return true;
        }
    }
}
