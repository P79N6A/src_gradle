package com.swmansion.gesturehandler;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class h extends b<h> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f78783a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f78784b;

    public h() {
        a(true);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        obtain.setAction(3);
        this.f78773f.onTouchEvent(obtain);
    }

    public final boolean b(b bVar) {
        return super.b(bVar);
    }

    public final boolean e(b bVar) {
        if (!this.f78784b) {
            return true;
        }
        return false;
    }

    public final boolean d(b bVar) {
        if (bVar instanceof h) {
            h hVar = (h) bVar;
            if (hVar.g == 4 && hVar.f78784b) {
                return false;
            }
        }
        boolean z = !this.f78784b;
        int i = this.g;
        int i2 = bVar.g;
        if ((i != 4 || i2 != 4 || !z) && i == 4 && z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void a(MotionEvent motionEvent) {
        View view = this.f78773f;
        int i = this.g;
        if (motionEvent.getActionMasked() == 1) {
            view.onTouchEvent(motionEvent);
            if ((i == 0 || i == 2) && view.isPressed()) {
                e();
            }
            g();
            return;
        }
        if (i == 0 || i == 2) {
            if (this.f78783a) {
                a(view, motionEvent);
                view.onTouchEvent(motionEvent);
                e();
            } else if (a(view, motionEvent)) {
                view.onTouchEvent(motionEvent);
                e();
            } else if (i != 2) {
                f();
            }
        } else if (i == 4) {
            view.onTouchEvent(motionEvent);
        }
    }

    private static boolean a(View view, MotionEvent motionEvent) {
        if (!(view instanceof ViewGroup) || !((ViewGroup) view).onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
