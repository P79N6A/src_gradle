package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class bb {
    static float j = 1.0f;
    /* access modifiers changed from: private */
    public static Method p;
    /* access modifiers changed from: private */
    public static Method q;
    /* access modifiers changed from: private */
    public static boolean r;
    private static boolean s;

    /* renamed from: a  reason: collision with root package name */
    b f5717a;

    /* renamed from: b  reason: collision with root package name */
    int f5718b;

    /* renamed from: c  reason: collision with root package name */
    Matrix f5719c = new Matrix();

    /* renamed from: d  reason: collision with root package name */
    Matrix f5720d = new Matrix();

    /* renamed from: e  reason: collision with root package name */
    PointF f5721e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    PointF f5722f = new PointF();
    PointF g = new PointF();
    float h = 1.0f;
    float i = 1.0f;
    boolean k = false;
    boolean l = false;
    boolean m = false;
    public int n = 0;
    public long o = 0;

    protected static class a extends bb {
        float p;
        float q;
        float r;
        float s;
        long t;
        int u;
        int v;
        private long w;

        protected a() {
        }

        private float b(MotionEvent motionEvent) {
            float f2;
            float f3 = 0.0f;
            try {
                f2 = ((Float) bb.p.invoke(motionEvent, new Object[]{0})).floatValue() - ((Float) bb.p.invoke(motionEvent, new Object[]{1})).floatValue();
            } catch (IllegalArgumentException e2) {
                cm.a(e2, "MutiTouchGestureDetector", "distance");
                f2 = 0.0f;
                f3 = ((Float) bb.q.invoke(motionEvent, new Object[]{0})).floatValue() - ((Float) bb.q.invoke(motionEvent, new Object[]{1})).floatValue();
                return (float) Math.sqrt((double) ((f2 * f2) + (f3 * f3)));
            } catch (IllegalAccessException e3) {
                cm.a(e3, "MutiTouchGestureDetector", "distance");
                f2 = 0.0f;
                f3 = ((Float) bb.q.invoke(motionEvent, new Object[]{0})).floatValue() - ((Float) bb.q.invoke(motionEvent, new Object[]{1})).floatValue();
                return (float) Math.sqrt((double) ((f2 * f2) + (f3 * f3)));
            } catch (InvocationTargetException e4) {
                cm.a(e4, "MutiTouchGestureDetector", "distance");
                f2 = 0.0f;
                f3 = ((Float) bb.q.invoke(motionEvent, new Object[]{0})).floatValue() - ((Float) bb.q.invoke(motionEvent, new Object[]{1})).floatValue();
                return (float) Math.sqrt((double) ((f2 * f2) + (f3 * f3)));
            }
            try {
                f3 = ((Float) bb.q.invoke(motionEvent, new Object[]{0})).floatValue() - ((Float) bb.q.invoke(motionEvent, new Object[]{1})).floatValue();
            } catch (IllegalArgumentException e5) {
                cm.a(e5, "MutiTouchGestureDetector", "distance");
            } catch (IllegalAccessException e6) {
                cm.a(e6, "MutiTouchGestureDetector", "distance");
            } catch (InvocationTargetException e7) {
                cm.a(e7, "MutiTouchGestureDetector", "distance");
            }
            return (float) Math.sqrt((double) ((f2 * f2) + (f3 * f3)));
        }

        private void a(PointF pointF, MotionEvent motionEvent) {
            float f2;
            float f3 = 0.0f;
            try {
                f2 = ((Float) bb.p.invoke(motionEvent, new Object[]{0})).floatValue() + ((Float) bb.p.invoke(motionEvent, new Object[]{1})).floatValue();
            } catch (IllegalArgumentException e2) {
                cm.a(e2, "MutiTouchGestureDetector", "midPoint");
                f2 = 0.0f;
                f3 = ((Float) bb.q.invoke(motionEvent, new Object[]{0})).floatValue() + ((Float) bb.q.invoke(motionEvent, new Object[]{1})).floatValue();
                f2 = (float) this.u;
                f3 = (float) this.v;
                pointF.set(f2 / 2.0f, f3 / 2.0f);
            } catch (IllegalAccessException e3) {
                cm.a(e3, "MutiTouchGestureDetector", "midPoint");
                f2 = 0.0f;
                f3 = ((Float) bb.q.invoke(motionEvent, new Object[]{0})).floatValue() + ((Float) bb.q.invoke(motionEvent, new Object[]{1})).floatValue();
                f2 = (float) this.u;
                f3 = (float) this.v;
                pointF.set(f2 / 2.0f, f3 / 2.0f);
            } catch (InvocationTargetException e4) {
                cm.a(e4, "MutiTouchGestureDetector", "midPoint");
                f2 = 0.0f;
                f3 = ((Float) bb.q.invoke(motionEvent, new Object[]{0})).floatValue() + ((Float) bb.q.invoke(motionEvent, new Object[]{1})).floatValue();
                f2 = (float) this.u;
                f3 = (float) this.v;
                pointF.set(f2 / 2.0f, f3 / 2.0f);
            }
            try {
                f3 = ((Float) bb.q.invoke(motionEvent, new Object[]{0})).floatValue() + ((Float) bb.q.invoke(motionEvent, new Object[]{1})).floatValue();
            } catch (IllegalArgumentException e5) {
                cm.a(e5, "MutiTouchGestureDetector", "midPoint");
            } catch (IllegalAccessException e6) {
                cm.a(e6, "MutiTouchGestureDetector", "midPoint");
            } catch (InvocationTargetException e7) {
                cm.a(e7, "MutiTouchGestureDetector", "midPoint");
            }
            if (!(this.u == 0 || this.v == 0)) {
                f2 = (float) this.u;
                f3 = (float) this.v;
            }
            pointF.set(f2 / 2.0f, f3 / 2.0f);
        }

        public boolean a(MotionEvent motionEvent, int i, int i2) {
            this.u = i;
            this.v = i2;
            bb.b(motionEvent);
            boolean z = false;
            if (!bb.r) {
                return false;
            }
            switch (motionEvent.getAction() & 255) {
                case 0:
                    this.t = motionEvent.getEventTime();
                    this.p = motionEvent.getX();
                    this.q = motionEvent.getY();
                    this.f5720d.set(this.f5719c);
                    this.f5721e.set(this.p, this.q);
                    this.f5718b = 1;
                    break;
                case 1:
                    this.o = motionEvent.getEventTime();
                    this.k = false;
                    this.f5718b = 0;
                    break;
                case 2:
                    if (this.f5718b != 1) {
                        if (this.f5718b == 2) {
                            float b2 = b(motionEvent);
                            this.i = 1.0f;
                            long eventTime = motionEvent.getEventTime();
                            if (b2 > 10.0f && Math.abs(b2 - this.h) > 5.0f && eventTime - this.w > 10) {
                                this.w = eventTime;
                                this.i = b2 / this.h;
                                j = 1.0f;
                                this.h = b2;
                                a(this.g, motionEvent);
                                this.r = this.g.x;
                                this.s = this.g.y;
                                z = this.f5717a.a(this.g.x - this.r, this.g.y - this.s) | false | this.f5717a.a(this.i, this.f5722f);
                                this.l = true;
                                break;
                            }
                        }
                    } else {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        this.f5719c.set(this.f5720d);
                        this.f5719c.postTranslate(motionEvent.getX() - this.f5721e.x, motionEvent.getY() - this.f5721e.y);
                        this.p = x;
                        this.q = y;
                        boolean a2 = this.f5717a.a(this.f5719c) | false | this.f5717a.a(x - this.p, y - this.q);
                        if (motionEvent.getEventTime() - this.t >= 30) {
                            z = a2;
                            break;
                        } else {
                            z = true;
                            break;
                        }
                    }
                    break;
                case 3:
                case 6:
                    this.n--;
                    if (this.n == 1) {
                        this.m = true;
                        this.f5718b = 2;
                    }
                    if (this.n == 0) {
                        a(this.f5722f, motionEvent);
                        this.l = false;
                        this.m = false;
                        if (this.k) {
                            this.f5718b = 0;
                            z = this.f5717a.b(this.i, this.f5722f) | false;
                            break;
                        }
                    }
                    break;
                case 5:
                    this.n++;
                    if (this.n == 1) {
                        this.m = true;
                        j = 1.0f;
                        this.h = b(motionEvent);
                        if (this.h > 10.0f) {
                            this.f5719c.reset();
                            this.f5720d.reset();
                            this.f5720d.set(this.f5719c);
                            a(this.f5722f, motionEvent);
                            this.f5718b = 2;
                            this.k = true;
                            z = false | this.f5717a.a(this.f5721e);
                            this.r = this.f5722f.x;
                            this.s = this.f5722f.y;
                            break;
                        }
                    }
                    break;
            }
            return z;
        }
    }

    public interface b {
        boolean a(float f2, float f3);

        boolean a(float f2, PointF pointF);

        boolean a(Matrix matrix);

        boolean a(PointF pointF);

        boolean b(float f2, PointF pointF);
    }

    bb() {
    }

    /* access modifiers changed from: private */
    public static void b(MotionEvent motionEvent) {
        if (!s) {
            s = true;
            try {
                p = motionEvent.getClass().getMethod("getX", new Class[]{Integer.TYPE});
                q = motionEvent.getClass().getMethod("getY", new Class[]{Integer.TYPE});
                if (!(p == null || q == null)) {
                    r = true;
                }
            } catch (Exception e2) {
                cm.a(e2, "MutiTouchGestureDetector", "checkSDKForMuti");
            }
        }
    }

    public static a a(Context context, b bVar) {
        a aVar = new a();
        aVar.f5717a = bVar;
        return aVar;
    }
}
