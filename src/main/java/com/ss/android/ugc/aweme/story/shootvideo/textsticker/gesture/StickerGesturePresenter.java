package com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture;

import android.arch.lifecycle.LifecycleOwner;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.gesture.IGesturePresenter;
import com.ss.android.ugc.aweme.shortvideo.gesture.a;
import com.ss.android.ugc.aweme.shortvideo.gesture.a.b;
import com.ss.android.ugc.aweme.shortvideo.gesture.defult.c;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout;
import java.util.ArrayList;
import java.util.List;

public class StickerGesturePresenter implements IGesturePresenter, VideoRecordGestureLayout.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74276a;

    /* renamed from: b  reason: collision with root package name */
    List<a> f74277b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public VideoRecordGestureLayout f74278c;

    /* renamed from: d  reason: collision with root package name */
    public float f74279d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public boolean f74280e;

    /* renamed from: f  reason: collision with root package name */
    private c f74281f;
    private int g;

    public final boolean b(MotionEvent motionEvent) {
        return false;
    }

    public final boolean a(com.ss.android.ugc.aweme.shortvideo.gesture.a.c cVar) {
        com.ss.android.ugc.aweme.shortvideo.gesture.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f74276a, false, 86285, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar2}, this, f74276a, false, 86285, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.c.class}, Boolean.TYPE)).booleanValue();
        }
        for (a next : this.f74277b) {
            if (next != null && next.a(cVar2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(b bVar, float f2, float f3) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2, Float.valueOf(f2), Float.valueOf(f3)}, this, f74276a, false, 86293, new Class[]{b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2, Float.valueOf(f2), Float.valueOf(f3)}, this, f74276a, false, 86293, new Class[]{b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        for (a next : this.f74277b) {
            if (next == null) {
                float f4 = f2;
                float f5 = f3;
            } else if (next.a(bVar2, f2, f3)) {
                return true;
            }
        }
        return false;
    }

    public void disAttachView() {
        if (PatchProxy.isSupport(new Object[0], this, f74276a, false, 86276, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74276a, false, 86276, new Class[0], Void.TYPE);
            return;
        }
        this.f74278c.setOnGestureListener(null);
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f74276a, false, 86291, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74276a, false, 86291, new Class[0], Boolean.TYPE)).booleanValue();
        }
        for (a next : this.f74277b) {
            if (next != null && next.c()) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f74276a, false, 86290, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74276a, false, 86290, new Class[0], Boolean.TYPE)).booleanValue();
        }
        for (a next : this.f74277b) {
            if (next != null && next.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f74276a, false, 86284, new Class[]{Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f74276a, false, 86284, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        this.f74281f.b(f2);
        for (a next : this.f74277b) {
            if (next != null && next.a(f2)) {
                return true;
            }
        }
        return false;
    }

    public final void b(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f74276a, false, 86294, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f74276a, false, 86294, new Class[]{b.class}, Void.TYPE);
            return;
        }
        for (a b2 : this.f74277b) {
            b2.b(bVar2);
        }
    }

    public final boolean d(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f74276a, false, 86288, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f74276a, false, 86288, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        for (a next : this.f74277b) {
            if (next != null && next.d(motionEvent2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f74276a, false, 86289, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f74276a, false, 86289, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        for (a next : this.f74277b) {
            if (next != null && next.e(motionEvent2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f74276a, false, 86280, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f74276a, false, 86280, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        for (a next : this.f74277b) {
            if (next != null && next.a(motionEvent)) {
                return true;
            }
        }
        this.f74281f.a(motionEvent);
        return true;
    }

    public final boolean c(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f74276a, false, 86287, new Class[]{Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f74276a, false, 86287, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        for (a next : this.f74277b) {
            if (next == null) {
                float f3 = f2;
            } else if (next.c(f2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f74276a, false, 86286, new Class[]{Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f74276a, false, 86286, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        for (a next : this.f74277b) {
            if (next == null) {
                float f3 = f2;
            } else if (next.b(f2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f74276a, false, 86281, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f74276a, false, 86281, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        for (a next : this.f74277b) {
            if (next != null && next.c(motionEvent)) {
                return true;
            }
        }
        this.f74281f.a();
        this.f74281f.b();
        return true;
    }

    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f74276a, false, 86282, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f74276a, false, 86282, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
        }
        for (a next : this.f74277b) {
            if (next != null && next.a(scaleGestureDetector)) {
                return true;
            }
        }
        return this.f74281f.a(scaleGestureDetector);
    }

    public final boolean a(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f74276a, false, 86292, new Class[]{b.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2}, this, f74276a, false, 86292, new Class[]{b.class}, Boolean.TYPE)).booleanValue();
        }
        for (a next : this.f74277b) {
            if (next != null && next.a(bVar2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(ScaleGestureDetector scaleGestureDetector) {
        if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f74276a, false, 86283, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f74276a, false, 86283, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
        }
        for (a next : this.f74277b) {
            if (next != null && next.b(scaleGestureDetector)) {
                return true;
            }
        }
        c cVar = this.f74281f;
        scaleGestureDetector.getScaleFactor();
        if (cVar.c()) {
            return true;
        }
        return this.f74281f.b(scaleGestureDetector);
    }

    public StickerGesturePresenter(LifecycleOwner lifecycleOwner, c cVar, View view) {
        this.f74281f = cVar;
        if (PatchProxy.isSupport(new Object[]{view}, this, f74276a, false, 86275, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f74276a, false, 86275, new Class[]{View.class}, Void.TYPE);
        } else if (view instanceof VideoRecordGestureLayout) {
            this.f74278c = (VideoRecordGestureLayout) view;
            this.f74278c.setOnGestureListener(this);
        }
        lifecycleOwner.getLifecycle().addObserver(this);
        this.g = ViewConfiguration.get(com.ss.android.ugc.aweme.port.in.a.f61119b).getScaledPagingTouchSlop();
    }

    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        MotionEvent motionEvent3 = motionEvent;
        MotionEvent motionEvent4 = motionEvent2;
        float f4 = f2;
        if (PatchProxy.isSupport(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f74276a, false, 86278, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f74276a, false, 86278, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        for (a next : this.f74277b) {
            if (next == null) {
                float f5 = f3;
            } else if (next.a(motionEvent3, motionEvent4, f4, f3)) {
                return true;
            }
        }
        int abs = (int) Math.abs(motionEvent.getX() - motionEvent2.getX());
        int abs2 = (int) Math.abs(motionEvent.getY() - motionEvent2.getY());
        if (abs <= this.g || abs <= abs2 || this.f74280e) {
            return false;
        }
        this.f74279d += f4 / ((float) this.f74278c.getWidth());
        this.f74279d = Math.min(this.f74279d, 1.0f);
        this.f74279d = Math.max(this.f74279d, -1.0f);
        this.f74281f.a(this.f74279d);
        return true;
    }

    public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        MotionEvent motionEvent3 = motionEvent;
        MotionEvent motionEvent4 = motionEvent2;
        float f4 = f2;
        if (PatchProxy.isSupport(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f74276a, false, 86279, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f74276a, false, 86279, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        for (a next : this.f74277b) {
            if (next == null) {
                float f5 = f3;
            } else if (next.b(motionEvent3, motionEvent4, f4, f3)) {
                return true;
            }
        }
        if (this.f74280e) {
            return false;
        }
        this.f74281f.a(f4, this.f74279d);
        this.f74279d = 0.0f;
        return true;
    }
}
