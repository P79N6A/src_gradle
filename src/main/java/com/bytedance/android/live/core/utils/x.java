package com.bytedance.android.live.core.utils;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.android.live.uikit.d.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;

public final class x extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8328a;

    /* renamed from: b  reason: collision with root package name */
    public final PublishSubject<Object> f8329b = PublishSubject.create();

    /* renamed from: c  reason: collision with root package name */
    public final PublishSubject<Object> f8330c = PublishSubject.create();

    /* renamed from: d  reason: collision with root package name */
    GestureDetector f8331d = new GestureDetector(this);

    /* renamed from: e  reason: collision with root package name */
    private boolean f8332e;

    /* renamed from: f  reason: collision with root package name */
    private float f8333f;
    private float g;

    public final boolean onDown(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f8328a, false, 1203, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f8328a, false, 1203, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        this.f8332e = false;
        this.f8333f = 0.0f;
        this.g = 0.0f;
        return super.onDown(motionEvent);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        PublishSubject<Object> publishSubject;
        PublishSubject<Object> publishSubject2;
        MotionEvent motionEvent3 = motionEvent2;
        if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent3, Float.valueOf(f2), Float.valueOf(f3)}, this, f8328a, false, 1204, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent3, Float.valueOf(f2), Float.valueOf(f3)}, this, f8328a, false, 1204, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (motionEvent == null || motionEvent3 == null || this.f8332e) {
            return false;
        } else {
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(motionEvent2.getY() - motionEvent.getY()) >= 100.0f || Math.abs(x) <= 100.0f || Math.abs(f2) <= 100.0f) {
                return false;
            }
            this.f8332e = true;
            if (this.f8333f < 0.0f) {
                if (c.a(ac.e())) {
                    publishSubject2 = this.f8329b;
                } else {
                    publishSubject2 = this.f8330c;
                }
                publishSubject2.onNext(motionEvent3);
            } else {
                if (c.a(ac.e())) {
                    publishSubject = this.f8330c;
                } else {
                    publishSubject = this.f8329b;
                }
                publishSubject.onNext(motionEvent3);
            }
            return true;
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        PublishSubject<Object> publishSubject;
        PublishSubject<Object> publishSubject2;
        MotionEvent motionEvent3 = motionEvent2;
        if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent3, Float.valueOf(f2), Float.valueOf(f3)}, this, f8328a, false, 1205, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent3, Float.valueOf(f2), Float.valueOf(f3)}, this, f8328a, false, 1205, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (motionEvent == null || motionEvent3 == null || this.f8332e) {
            return false;
        } else {
            this.f8333f += f2;
            this.g += f3;
            if (Math.abs(this.f8333f) <= Math.abs(this.g) * 2.0f || Math.abs(this.f8333f) <= 250.0f) {
                return false;
            }
            this.f8332e = true;
            if (this.f8333f < 0.0f) {
                if (c.a(ac.e())) {
                    publishSubject2 = this.f8329b;
                } else {
                    publishSubject2 = this.f8330c;
                }
                publishSubject2.onNext(motionEvent3);
            } else {
                if (c.a(ac.e())) {
                    publishSubject = this.f8330c;
                } else {
                    publishSubject = this.f8329b;
                }
                publishSubject.onNext(motionEvent3);
            }
            return true;
        }
    }
}
