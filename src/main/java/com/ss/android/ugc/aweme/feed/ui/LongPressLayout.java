package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class LongPressLayout extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46218a;

    /* renamed from: b  reason: collision with root package name */
    public float f46219b;

    /* renamed from: c  reason: collision with root package name */
    public float f46220c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f46221d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f46222e;

    /* renamed from: f  reason: collision with root package name */
    public a f46223f;
    public long g;
    View.OnClickListener h;
    View.OnClickListener i;
    boolean j;
    private Context k;
    private float l;
    private float m;
    private int n;
    private View.OnTouchListener o;
    private Runnable p;

    public interface a {
        void a(float f2, float f3);
    }

    public void setInLongPressMode(boolean z) {
        this.f46221d = z;
    }

    public void setListener(a aVar) {
        this.f46223f = aVar;
    }

    public void setScrollMode(boolean z) {
        this.f46222e = z;
    }

    public void setTapListener(View.OnTouchListener onTouchListener) {
        this.o = onTouchListener;
    }

    public LongPressLayout(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!PatchProxy.isSupport(new Object[]{motionEvent}, this, f46218a, false, 42877, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f46218a, false, 42877, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }

    public void setDisabilityOnClickListener(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f46218a, false, 42881, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f46218a, false, 42881, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        this.i = onClickListener;
        super.setOnClickListener(new ap(this));
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f46218a, false, 42880, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f46218a, false, 42880, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        if (this.i == null) {
            super.setOnClickListener(onClickListener);
        }
        this.h = onClickListener;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f46218a, false, 42878, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f46218a, false, 42878, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        this.j = true;
        switch (motionEvent.getAction()) {
            case 0:
                this.f46219b = motionEvent.getX();
                this.f46220c = motionEvent.getY();
                this.g = SystemClock.elapsedRealtime();
                com.ss.android.b.a.a.a.a(this.p, 500);
                if (this.o != null) {
                    this.o.onTouch(this, motionEvent);
                    break;
                }
                break;
            case 1:
            case 3:
                com.ss.android.b.a.a.a.c(this.p);
                if (SystemClock.elapsedRealtime() - this.g < 500 && this.o != null) {
                    this.o.onTouch(this, motionEvent);
                    break;
                }
            case 2:
                this.l = motionEvent.getX();
                this.m = motionEvent.getY();
                float abs = Math.abs(this.f46219b - this.l);
                float abs2 = Math.abs(this.f46220c - this.m);
                if (abs > ((float) this.n) || abs2 > ((float) this.n)) {
                    z = true;
                }
                if (z) {
                    com.ss.android.b.a.a.a.c(this.p);
                }
                if (this.o != null) {
                    this.o.onTouch(this, motionEvent);
                    break;
                }
                break;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public LongPressLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LongPressLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.n = -1;
        this.p = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46226a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f46226a, false, 42884, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f46226a, false, 42884, new Class[0], Void.TYPE);
                    return;
                }
                if (LongPressLayout.this.f46223f != null) {
                    LongPressLayout longPressLayout = LongPressLayout.this;
                    if (PatchProxy.isSupport(new Object[]{(byte) 1}, longPressLayout, LongPressLayout.f46218a, false, 42879, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        LongPressLayout longPressLayout2 = longPressLayout;
                        PatchProxy.accessDispatch(new Object[]{(byte) 1}, longPressLayout2, LongPressLayout.f46218a, false, 42879, new Class[]{Boolean.TYPE}, Void.TYPE);
                    } else {
                        ViewParent parent = longPressLayout.getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    LongPressLayout.this.f46223f.a(LongPressLayout.this.f46219b, LongPressLayout.this.f46220c);
                }
            }
        };
        this.k = context;
        this.n = ViewConfiguration.get(this.k).getScaledTouchSlop();
        setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46224a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f46224a, false, 42883, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f46224a, false, 42883, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
            }
        });
    }
}
