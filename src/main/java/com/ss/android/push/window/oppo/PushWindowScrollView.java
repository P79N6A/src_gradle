package com.ss.android.push.window.oppo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class PushWindowScrollView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    protected VelocityTracker f30429a;

    /* renamed from: b  reason: collision with root package name */
    protected int f30430b = -1;

    /* renamed from: c  reason: collision with root package name */
    boolean f30431c;

    /* renamed from: d  reason: collision with root package name */
    private a f30432d;

    /* renamed from: e  reason: collision with root package name */
    private int f30433e;

    /* renamed from: f  reason: collision with root package name */
    private int f30434f;
    private int g;
    private float h;
    private float i;
    private float j;
    private float k;
    private boolean l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;

    public interface a {
        void a();

        void a(float f2);

        void a(boolean z);
    }

    private void b() {
        this.n = true;
        this.o = false;
        this.f30431c = false;
    }

    private void c() {
        this.o = false;
        this.n = false;
        this.l = false;
        this.f30430b = -1;
        if (this.f30429a != null) {
            this.f30429a.recycle();
            this.f30429a = null;
        }
    }

    private void a() {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f30433e = viewConfiguration.getScaledTouchSlop();
        this.f30434f = viewConfiguration.getScaledMinimumFlingVelocity();
        this.g = viewConfiguration.getScaledMaximumFlingVelocity();
        this.m = (int) (getContext().getResources().getDisplayMetrics().density * 25.0f);
    }

    public void setOnScrollListener(a aVar) {
        this.f30432d = aVar;
    }

    public PushWindowScrollView(Context context) {
        super(context);
        a();
    }

    private void a(MotionEvent motionEvent) {
        int i2 = this.f30430b;
        int a2 = a(motionEvent, i2);
        if (i2 != -1 && a2 != -1) {
            float x = motionEvent.getX(a2);
            float abs = Math.abs(x - this.h);
            float y = motionEvent.getY(a2);
            float abs2 = Math.abs(y - this.i);
            if (abs2 <= ((float) this.f30433e) || abs2 <= abs) {
                if (abs > ((float) this.f30433e)) {
                    this.l = true;
                }
                return;
            }
            b();
            this.h = x;
            this.i = y;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 1 || (action != 0 && this.l)) {
            c();
            return false;
        }
        int i2 = action & 255;
        if (i2 == 0) {
            int actionIndex = motionEvent.getActionIndex();
            this.f30430b = motionEvent.getPointerId(actionIndex);
            if (this.f30430b != -1) {
                float x = motionEvent.getX(actionIndex);
                this.k = x;
                this.h = x;
                float y = motionEvent.getY(actionIndex);
                this.i = y;
                this.j = y;
                this.n = false;
                this.l = false;
            }
        } else if (i2 == 2) {
            int a2 = a(motionEvent, this.f30430b);
            if (this.f30430b != -1) {
                motionEvent.getY(a2);
                a(motionEvent);
            }
        }
        if (!this.n) {
            if (this.f30429a == null) {
                this.f30429a = VelocityTracker.obtain();
            }
            this.f30429a.addMovement(motionEvent);
        }
        if (this.n || this.o) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f30429a == null) {
            this.f30429a = VelocityTracker.obtain();
        }
        this.f30429a.addMovement(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.f30430b = motionEvent.getPointerId(motionEvent.getActionIndex());
                float y = motionEvent.getY();
                this.j = y;
                this.i = y;
                float x = motionEvent.getX();
                this.k = x;
                this.h = x;
                break;
            case 1:
            case 3:
                if (this.n) {
                    VelocityTracker velocityTracker = this.f30429a;
                    velocityTracker.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, (float) this.g);
                    int yVelocity = (int) velocityTracker.getYVelocity(this.f30430b);
                    int a2 = a(motionEvent, this.f30430b);
                    if (this.f30430b != -1) {
                        int y2 = (int) (motionEvent.getY(a2) - this.j);
                        if (Math.abs(y2) <= this.m || Math.abs(yVelocity) <= this.f30434f) {
                            if (this.f30432d != null) {
                                this.f30432d.a();
                            }
                        } else if (yVelocity <= 0 || y2 <= 0) {
                            if (yVelocity >= 0 || y2 >= 0) {
                                if (this.f30432d != null) {
                                    this.f30432d.a();
                                }
                            } else if (this.f30432d != null) {
                                this.f30432d.a(true);
                            }
                        } else if (this.f30432d != null) {
                            this.f30432d.a(false);
                        }
                    }
                    this.f30430b = -1;
                    c();
                    break;
                }
                break;
            case 2:
                if (!this.n) {
                    a(motionEvent);
                    if (this.l) {
                        return false;
                    }
                }
                if (this.n) {
                    int a3 = a(motionEvent, this.f30430b);
                    if (this.f30430b != -1) {
                        float y3 = motionEvent.getY(a3);
                        float f2 = this.i - y3;
                        this.i = y3;
                        float f3 = ((float) this.p) + f2;
                        int i2 = (int) f3;
                        this.h += f3 - ((float) i2);
                        this.p = i2;
                        if (this.f30432d != null) {
                            this.f30432d.a(f2);
                            break;
                        }
                    }
                }
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.i = motionEvent.getY(actionIndex);
                this.h = motionEvent.getX(actionIndex);
                this.f30430b = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                int a4 = a(motionEvent, this.f30430b);
                if (this.f30430b != -1) {
                    this.i = motionEvent.getY(a4);
                    this.h = motionEvent.getX(a4);
                    break;
                }
                break;
        }
        return true;
    }

    private int a(MotionEvent motionEvent, int i2) {
        int findPointerIndex = motionEvent.findPointerIndex(i2);
        if (findPointerIndex == -1) {
            this.f30430b = -1;
        }
        return findPointerIndex;
    }

    public PushWindowScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public PushWindowScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }
}
