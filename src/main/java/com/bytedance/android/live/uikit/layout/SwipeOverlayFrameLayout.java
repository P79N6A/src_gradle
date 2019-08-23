package com.bytedance.android.live.uikit.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SwipeOverlayFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8555a;

    /* renamed from: b  reason: collision with root package name */
    a f8556b;

    /* renamed from: c  reason: collision with root package name */
    float f8557c;

    /* renamed from: d  reason: collision with root package name */
    float f8558d;

    /* renamed from: e  reason: collision with root package name */
    private GestureDetector f8559e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f8560f = true;
    private boolean g;
    private boolean h;

    public interface a {
        boolean a();

        boolean b();
    }

    public void setDisllowInterceptEnabled(boolean z) {
        this.g = z;
    }

    public void setOnSwipeListener(a aVar) {
        this.f8556b = aVar;
    }

    public void setSwipeEnabled(boolean z) {
        this.f8560f = z;
    }

    public SwipeOverlayFrameLayout(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f8555a, false, 1940, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f8555a, false, 1940, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        AnonymousClass1 r0 = new GestureDetector.SimpleOnGestureListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8561a;

            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                boolean z = false;
                if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f8561a, false, 1944, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f8561a, false, 1944, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                }
                SwipeOverlayFrameLayout swipeOverlayFrameLayout = SwipeOverlayFrameLayout.this;
                if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, swipeOverlayFrameLayout, SwipeOverlayFrameLayout.f8555a, false, 1941, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, swipeOverlayFrameLayout, SwipeOverlayFrameLayout.f8555a, false, 1941, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                } else if (swipeOverlayFrameLayout.f8556b == null || Math.abs(motionEvent2.getY() - motionEvent.getY()) > swipeOverlayFrameLayout.f8557c) {
                    return false;
                } else {
                    float abs = Math.abs(f2);
                    float abs2 = Math.abs(f3);
                    float abs3 = Math.abs(motionEvent2.getX() - motionEvent.getX());
                    float abs4 = Math.abs(motionEvent2.getY() - motionEvent.getY());
                    if (abs2 >= abs || abs4 >= abs3) {
                        return false;
                    }
                    if (abs3 > swipeOverlayFrameLayout.f8558d) {
                        if (f2 > 0.0f) {
                            z = swipeOverlayFrameLayout.f8556b.b();
                        } else if (f2 < 0.0f) {
                            z = swipeOverlayFrameLayout.f8556b.a();
                        }
                    }
                    return z;
                }
            }
        };
        this.f8557c = UIUtils.dip2Px(context, 45.0f);
        this.f8558d = UIUtils.dip2Px(context, 65.0f);
        this.f8559e = new GestureDetector(context.getApplicationContext(), r0);
        this.f8559e.setOnDoubleTapListener(null);
        this.f8559e.setIsLongpressEnabled(false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f8555a, false, 1943, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f8555a, false, 1943, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (motionEvent.getAction() == 0) {
                this.h = false;
            }
            if (this.h && this.g) {
                z = true;
            }
            if (!this.f8560f || this.f8559e == null || z || !this.f8559e.onTouchEvent(motionEvent)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            motionEvent.setAction(3);
            super.dispatchTouchEvent(motionEvent);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f8555a, false, 1942, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f8555a, false, 1942, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.requestDisallowInterceptTouchEvent(z);
        this.h = z;
    }

    public SwipeOverlayFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public SwipeOverlayFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
