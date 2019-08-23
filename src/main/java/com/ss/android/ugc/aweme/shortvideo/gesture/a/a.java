package com.ss.android.ugc.aweme.shortvideo.gesture.a;

import android.content.Context;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67898a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f67899b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f67900c;

    /* renamed from: d  reason: collision with root package name */
    protected MotionEvent f67901d;

    /* renamed from: e  reason: collision with root package name */
    protected MotionEvent f67902e;

    /* renamed from: f  reason: collision with root package name */
    protected float f67903f;
    protected float g;
    public long h;

    public abstract void a(int i, MotionEvent motionEvent);

    public abstract void b(int i, MotionEvent motionEvent);

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f67898a, false, 77396, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67898a, false, 77396, new Class[0], Void.TYPE);
            return;
        }
        if (this.f67901d != null) {
            this.f67901d.recycle();
            this.f67901d = null;
        }
        if (this.f67902e != null) {
            this.f67902e.recycle();
            this.f67902e = null;
        }
        this.f67900c = false;
    }

    public a(Context context) {
        this.f67899b = context;
    }

    public final boolean a(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f67898a, false, 77394, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f67898a, false, 77394, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int action = motionEvent.getAction() & 255;
        if (!this.f67900c) {
            a(action, motionEvent);
        } else {
            b(action, motionEvent);
        }
        return true;
    }

    public void b(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f67898a, false, 77395, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f67898a, false, 77395, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        MotionEvent motionEvent2 = this.f67901d;
        if (this.f67902e != null) {
            this.f67902e.recycle();
            this.f67902e = null;
        }
        this.f67902e = MotionEvent.obtain(motionEvent);
        this.h = motionEvent.getEventTime() - motionEvent2.getEventTime();
        this.f67903f = motionEvent.getPressure(motionEvent.getActionIndex());
        this.g = motionEvent2.getPressure(motionEvent2.getActionIndex());
    }
}
