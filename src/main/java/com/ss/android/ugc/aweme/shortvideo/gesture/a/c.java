package com.ss.android.ugc.aweme.shortvideo.gesture.a;

import android.content.Context;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class c extends d {
    public static ChangeQuickRedirect i;
    public float j;
    public float k;
    private final a r;
    private boolean s;

    public interface a {
        boolean a(c cVar);

        boolean b(c cVar);

        void c(c cVar);
    }

    public static class b implements a {
        public boolean a(c cVar) {
            return false;
        }

        public boolean b(c cVar) {
            return true;
        }

        public void c(c cVar) {
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 77408, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 77408, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.s = false;
    }

    public final float b() {
        if (!PatchProxy.isSupport(new Object[0], this, i, false, 77409, new Class[0], Float.TYPE)) {
            return (float) (Math.atan2((double) this.n, (double) this.m) - Math.atan2((double) this.p, (double) this.o));
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, i, false, 77409, new Class[0], Float.TYPE)).floatValue();
    }

    public final void b(MotionEvent motionEvent) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, i, false, 77405, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, i, false, 77405, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        super.b(motionEvent);
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, i, false, 77406, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, i, false, 77406, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        int pointerCount = motionEvent.getPointerCount();
        if ((motionEvent.getAction() & 255) == 6) {
            i2 = motionEvent.getActionIndex();
        } else {
            i2 = -1;
        }
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (i2 != i3) {
                f2 += motionEvent.getX(i3);
                f3 += motionEvent.getY(i3);
            }
        }
        float f4 = (float) pointerCount;
        this.j = f2 / f4;
        this.k = f3 / f4;
    }

    public c(Context context, a aVar) {
        super(context);
        this.r = aVar;
    }

    public final void a(int i2, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), motionEvent}, this, i, false, 77404, new Class[]{Integer.TYPE, MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), motionEvent}, this, i, false, 77404, new Class[]{Integer.TYPE, MotionEvent.class}, Void.TYPE);
            return;
        }
        if (i2 != 2) {
            if (i2 == 5) {
                a();
                this.f67901d = MotionEvent.obtain(motionEvent);
                this.h = 0;
                b(motionEvent);
                this.s = c(motionEvent);
                if (!this.s) {
                    this.f67900c = this.r.b(this);
                }
            }
        } else if (this.s) {
            this.s = c(motionEvent);
            if (!this.s) {
                this.f67900c = this.r.b(this);
            }
        }
    }

    public final void b(int i2, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), motionEvent}, this, i, false, 77407, new Class[]{Integer.TYPE, MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), motionEvent}, this, i, false, 77407, new Class[]{Integer.TYPE, MotionEvent.class}, Void.TYPE);
        } else if (i2 != 6) {
            switch (i2) {
                case 2:
                    b(motionEvent);
                    if (this.f67903f / this.g > 0.67f && this.r.a(this)) {
                        this.f67901d.recycle();
                        this.f67901d = MotionEvent.obtain(motionEvent);
                        break;
                    }
                case 3:
                    if (!this.s) {
                        this.r.c(this);
                    }
                    a();
                    return;
            }
        } else {
            b(motionEvent);
            if (!this.s) {
                this.r.c(this);
            }
            a();
        }
    }
}
