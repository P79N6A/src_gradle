package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import com.bytedance.android.livesdk.R$styleable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ap extends View implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18445a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f18446b = "ap";
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private String aj;
    private boolean ak;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f18447c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f18448d;

    /* renamed from: e  reason: collision with root package name */
    private Scroller f18449e;

    /* renamed from: f  reason: collision with root package name */
    private VelocityTracker f18450f;
    private boolean g;
    private a h;
    private b i;
    private Rect j;
    private Rect k;
    private Rect l;
    private Rect m;
    private Camera n;
    private Matrix o;
    private Matrix p;
    private List q;
    private String r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public interface a {
    }

    public interface b {
    }

    public int getCurrentItemPosition() {
        return this.K;
    }

    public int getCurtainColor() {
        return this.D;
    }

    public List getData() {
        return this.q;
    }

    public int getIndicatorColor() {
        return this.C;
    }

    public int getIndicatorSize() {
        return this.B;
    }

    public int getItemAlign() {
        return this.F;
    }

    public int getItemSpace() {
        return this.E;
    }

    public int getItemTextColor() {
        return this.x;
    }

    public int getItemTextSize() {
        return this.z;
    }

    public String getMaximumWidthText() {
        return this.r;
    }

    public int getMaximumWidthTextPosition() {
        return this.U;
    }

    public int getSelectedItemPosition() {
        return this.J;
    }

    public int getSelectedItemTextColor() {
        return this.y;
    }

    public int getVisibleItemCount() {
        return this.s;
    }

    public Typeface getTypeface() {
        if (PatchProxy.isSupport(new Object[0], this, f18445a, false, 14810, new Class[0], Typeface.class)) {
            return (Typeface) PatchProxy.accessDispatch(new Object[0], this, f18445a, false, 14810, new Class[0], Typeface.class);
        } else if (this.f18448d != null) {
            return this.f18448d.getTypeface();
        } else {
            return null;
        }
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f18445a, false, 14773, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18445a, false, 14773, new Class[0], Void.TYPE);
        } else if (this.s >= 2) {
            if (this.s % 2 == 0) {
                this.s++;
            }
            this.t = this.s + 2;
            this.u = this.t / 2;
        } else {
            throw new ArithmeticException("Wheel's visible item count can not be less than 2!");
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f18445a, false, 14775, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18445a, false, 14775, new Class[0], Void.TYPE);
            return;
        }
        switch (this.F) {
            case 1:
                this.f18448d.setTextAlign(Paint.Align.LEFT);
                return;
            case 2:
                this.f18448d.setTextAlign(Paint.Align.RIGHT);
                return;
            default:
                this.f18448d.setTextAlign(Paint.Align.CENTER);
                return;
        }
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f18445a, false, 14779, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18445a, false, 14779, new Class[0], Void.TYPE);
            return;
        }
        switch (this.F) {
            case 1:
                this.R = this.j.left;
                break;
            case 2:
                this.R = this.j.right;
                break;
            default:
                this.R = this.P;
                break;
        }
        this.S = (int) (((float) this.Q) - ((this.f18448d.ascent() + this.f18448d.descent()) / 2.0f));
    }

    private void e() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f18445a, false, 14780, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18445a, false, 14780, new Class[0], Void.TYPE);
            return;
        }
        int i3 = this.J * this.G;
        if (this.af) {
            i2 = Integer.MIN_VALUE;
        } else {
            i2 = ((-this.G) * (this.q.size() - 1)) + i3;
        }
        this.L = i2;
        if (this.af) {
            i3 = Integer.MAX_VALUE;
        }
        this.M = i3;
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f18445a, false, 14781, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18445a, false, 14781, new Class[0], Void.TYPE);
        } else if (this.ac) {
            int i2 = this.B / 2;
            int i3 = this.Q + this.H;
            int i4 = this.Q - this.H;
            this.k.set(this.j.left, i3 - i2, this.j.right, i3 + i2);
            this.l.set(this.j.left, i4 - i2, this.j.right, i4 + i2);
        }
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f18445a, false, 14782, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18445a, false, 14782, new Class[0], Void.TYPE);
        } else if (this.ad || this.y != -1) {
            this.m.set(this.j.left, this.Q - this.H, this.j.right, this.Q + this.H);
        }
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f18445a, false, 14774, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18445a, false, 14774, new Class[0], Void.TYPE);
            return;
        }
        this.v = 0;
        this.w = 0;
        if (this.ab) {
            this.v = (int) this.f18448d.measureText(String.valueOf(this.q.get(0)));
        } else if (a(this.U)) {
            this.v = (int) this.f18448d.measureText(String.valueOf(this.q.get(this.U)));
        } else if (!TextUtils.isEmpty(this.r)) {
            this.v = (int) this.f18448d.measureText(this.r);
        } else {
            for (Object valueOf : this.q) {
                String valueOf2 = String.valueOf(valueOf);
                this.v = Math.max(this.v, (int) this.f18448d.measureText(valueOf2));
            }
        }
        Paint.FontMetrics fontMetrics = this.f18448d.getFontMetrics();
        this.w = (int) (fontMetrics.bottom - fontMetrics.top);
    }

    public void run() {
        if (PatchProxy.isSupport(new Object[0], this, f18445a, false, 14789, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18445a, false, 14789, new Class[0], Void.TYPE);
        } else if (this.q != null && this.q.size() != 0) {
            if (this.f18449e.isFinished() && !this.ai) {
                if (this.G != 0) {
                    int size = (((-this.T) / this.G) + this.J) % this.q.size();
                    if (size < 0) {
                        size += this.q.size();
                    }
                    this.K = size;
                    if (this.h != null && this.g) {
                        this.q.get(size);
                    }
                } else {
                    return;
                }
            }
            if (this.f18449e.computeScrollOffset()) {
                this.T = this.f18449e.getCurrY();
                postInvalidate();
                this.f18447c.postDelayed(this, 16);
            }
        }
    }

    public void setOnItemSelectedListener(a aVar) {
        this.h = aVar;
    }

    public void setOnWheelChangeListener(b bVar) {
        this.i = bVar;
    }

    public void setSelectItemTextSize(int i2) {
        this.A = i2;
    }

    public ap(Context context) {
        this(context, null);
    }

    private int b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14788, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14788, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (Math.abs(i2) <= this.H) {
            return -i2;
        } else {
            if (this.T < 0) {
                return (-this.G) - i2;
            }
            return this.G - i2;
        }
    }

    public void setAtmospheric(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18445a, false, 14807, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f18445a, false, 14807, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.ae = z2;
        invalidate();
    }

    public void setCurtain(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18445a, false, 14805, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f18445a, false, 14805, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.ad = z2;
        g();
        invalidate();
    }

    public void setCurtainColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14806, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14806, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.D = i2;
        invalidate();
    }

    public void setCurved(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18445a, false, 14808, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f18445a, false, 14808, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.ag = z2;
        requestLayout();
        invalidate();
    }

    public void setCyclic(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18445a, false, 14791, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f18445a, false, 14791, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.af = z2;
        e();
        invalidate();
    }

    public void setData(List list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f18445a, false, 14794, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f18445a, false, 14794, new Class[]{List.class}, Void.TYPE);
        } else if (list != null) {
            this.q = list;
            if (this.J > list.size() - 1 || this.K > list.size() - 1) {
                this.K = list.size() - 1;
            }
            this.J = this.K;
            this.T = 0;
            b();
            e();
            requestLayout();
            invalidate();
        } else {
            throw new NullPointerException("WheelPicker's data can not be null!");
        }
    }

    public void setIndicator(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18445a, false, 14802, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f18445a, false, 14802, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.ac = z2;
        f();
        invalidate();
    }

    public void setIndicatorColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14804, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14804, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.C = i2;
        invalidate();
    }

    public void setIndicatorSize(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14803, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14803, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.B = i2;
        f();
        invalidate();
    }

    public void setItemAlign(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14809, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14809, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.F = i2;
        c();
        d();
        invalidate();
    }

    public void setItemSpace(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14801, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14801, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.E = i2;
        requestLayout();
        invalidate();
    }

    public void setItemTextColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14799, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14799, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.x = i2;
        invalidate();
    }

    public void setItemTextSize(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14800, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14800, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.z = i2;
        this.f18448d.setTextSize((float) this.z);
        b();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthText(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f18445a, false, 14796, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f18445a, false, 14796, new Class[]{String.class}, Void.TYPE);
        } else if (str2 != null) {
            this.r = str2;
            b();
            requestLayout();
            invalidate();
        } else {
            throw new NullPointerException("Maximum width text can not be null!");
        }
    }

    public void setMaximumWidthTextPosition(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14797, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14797, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (a(i2)) {
            this.U = i2;
            b();
            requestLayout();
            invalidate();
        } else {
            throw new ArrayIndexOutOfBoundsException("Maximum width text Position must in [0, " + this.q.size() + "), but current is " + i2);
        }
    }

    public void setSameWidth(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18445a, false, 14795, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f18445a, false, 14795, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.ab = z2;
        b();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemPosition(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14792, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14792, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a(i2, true);
    }

    public void setSelectedItemTextColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14798, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14798, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.y = i2;
        g();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (PatchProxy.isSupport(new Object[]{typeface}, this, f18445a, false, 14811, new Class[]{Typeface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{typeface}, this, f18445a, false, 14811, new Class[]{Typeface.class}, Void.TYPE);
            return;
        }
        if (this.f18448d != null) {
            this.f18448d.setTypeface(typeface);
        }
        b();
        requestLayout();
        invalidate();
    }

    public void setVisibleItemCount(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14790, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14790, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.s = i2;
        a();
        requestLayout();
    }

    private boolean a(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14784, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18445a, false, 14784, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (i3 >= 0) {
            if (i3 < this.q.size()) {
                return true;
            }
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f18445a, false, 14787, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f18445a, false, 14787, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.g = true;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (this.f18450f == null) {
                    this.f18450f = VelocityTracker.obtain();
                } else {
                    this.f18450f.clear();
                }
                this.f18450f.addMovement(motionEvent2);
                if (!this.f18449e.isFinished()) {
                    this.f18449e.abortAnimation();
                    this.ai = true;
                }
                this.V = (int) motionEvent.getY();
                this.W = this.V;
                break;
            case 1:
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                if (!this.ah || this.ai) {
                    this.f18450f.addMovement(motionEvent2);
                    if (Build.VERSION.SDK_INT >= 4) {
                        this.f18450f.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, (float) this.O);
                    } else {
                        this.f18450f.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                    }
                    this.ai = false;
                    int yVelocity = (int) this.f18450f.getYVelocity();
                    if (Math.abs(yVelocity) > this.N) {
                        this.f18449e.fling(0, this.T, 0, yVelocity, 0, 0, this.L, this.M);
                        this.f18449e.setFinalY(this.f18449e.getFinalY() + b(this.f18449e.getFinalY() % this.G));
                    } else {
                        this.f18449e.startScroll(0, this.T, 0, b(this.T % this.G));
                    }
                    if (!this.af) {
                        if (this.f18449e.getFinalY() > this.M) {
                            this.f18449e.setFinalY(this.M);
                        } else if (this.f18449e.getFinalY() < this.L) {
                            this.f18449e.setFinalY(this.L);
                        }
                    }
                    this.f18447c.post(this);
                    if (this.f18450f != null) {
                        this.f18450f.recycle();
                        this.f18450f = null;
                        break;
                    }
                }
                break;
            case 2:
                if (Math.abs(((float) this.W) - motionEvent.getY()) >= ((float) this.aa)) {
                    this.ah = false;
                    this.f18450f.addMovement(motionEvent2);
                    float y2 = motionEvent.getY() - ((float) this.V);
                    if (Math.abs(y2) >= 1.0f) {
                        this.T = (int) (((float) this.T) + y2);
                        this.V = (int) motionEvent.getY();
                        invalidate();
                        break;
                    }
                } else {
                    this.ah = true;
                    break;
                }
                break;
            case 3:
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                if (this.f18450f != null) {
                    this.f18450f.recycle();
                    this.f18450f = null;
                    break;
                }
                break;
        }
        return true;
    }

    public void onDraw(Canvas canvas) {
        int i2;
        float f2;
        int i3;
        float f3;
        int i4;
        int i5;
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f18445a, false, 14783, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f18445a, false, 14783, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        int i6 = ((-this.T) / this.G) - this.u;
        int i7 = this.J + i6;
        int i8 = -this.u;
        while (i7 < this.J + i6 + this.t) {
            String str = "";
            if (this.af) {
                int size = i7 % this.q.size();
                if (size < 0) {
                    size += this.q.size();
                }
                str = String.valueOf(this.q.get(size));
            } else if (a(i7)) {
                str = String.valueOf(this.q.get(i7));
            }
            String str2 = str;
            this.f18448d.setColor(this.x);
            this.f18448d.setTextSize((float) this.z);
            this.f18448d.setStyle(Paint.Style.FILL);
            int i9 = this.S + (this.G * i8) + (this.T % this.G);
            if (this.ag) {
                float abs = (((float) ((this.S - Math.abs(this.S - i9)) - this.j.top)) * 1.0f) / ((float) (this.S - this.j.top));
                if (i9 > this.S) {
                    i3 = 1;
                } else if (i9 < this.S) {
                    i3 = -1;
                } else {
                    i3 = 0;
                }
                float f4 = (-(1.0f - abs)) * 90.0f * ((float) i3);
                if (f4 < -90.0f) {
                    f4 = -90.0f;
                }
                if (f4 > 90.0f) {
                    f3 = 90.0f;
                } else {
                    f3 = f4;
                }
                int i10 = (int) f3;
                int i11 = i10;
                float f5 = f3;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i10)}, this, f18445a, false, 14785, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                    i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i11)}, this, f18445a, false, 14785, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                    i4 = i11;
                } else {
                    i4 = i11;
                    double sin = Math.sin(Math.toRadians((double) i4));
                    double d2 = (double) this.I;
                    Double.isNaN(d2);
                    i2 = (int) (sin * d2);
                }
                int i12 = this.P;
                switch (this.F) {
                    case 1:
                        i12 = this.j.left;
                        break;
                    case 2:
                        i12 = this.j.right;
                        break;
                }
                int i13 = this.Q - i2;
                this.n.save();
                this.n.rotateX(f5);
                this.n.getMatrix(this.o);
                this.n.restore();
                float f6 = (float) (-i12);
                float f7 = (float) (-i13);
                this.o.preTranslate(f6, f7);
                float f8 = (float) i12;
                float f9 = (float) i13;
                this.o.postTranslate(f8, f9);
                this.n.save();
                Camera camera = this.n;
                float f10 = f7;
                float f11 = f9;
                Camera camera2 = camera;
                float f12 = f8;
                float f13 = f10;
                float f14 = f6;
                int i14 = i4;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i4)}, this, f18445a, false, 14786, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                    i5 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i14)}, this, f18445a, false, 14786, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                } else {
                    double d3 = (double) this.I;
                    double cos = Math.cos(Math.toRadians((double) i14));
                    double d4 = (double) this.I;
                    Double.isNaN(d4);
                    Double.isNaN(d3);
                    i5 = (int) (d3 - (cos * d4));
                }
                f2 = 0.0f;
                camera2.translate(0.0f, 0.0f, (float) i5);
                this.n.getMatrix(this.p);
                this.n.restore();
                this.p.preTranslate(f14, f13);
                this.p.postTranslate(f12, f11);
                this.o.postConcat(this.p);
            } else {
                f2 = 0.0f;
                i2 = 0;
            }
            if (this.ae) {
                int abs2 = (int) (((((float) (this.S - Math.abs(this.S - i9))) * 1.0f) / ((float) this.S)) * 255.0f);
                if (abs2 < 0) {
                    abs2 = 0;
                }
                this.f18448d.setAlpha(abs2);
            }
            if (this.ag) {
                i9 = this.S - i2;
            }
            if (this.y != -1) {
                canvas.save();
                if (this.ag) {
                    canvas2.concat(this.o);
                }
                if (i9 < this.m.bottom) {
                    RectF rectF = new RectF(this.m);
                    rectF.bottom = rectF.top;
                    rectF.top = f2;
                    canvas2.clipRect(rectF);
                } else {
                    RectF rectF2 = new RectF(this.m);
                    rectF2.top = rectF2.bottom;
                    rectF2.bottom = (float) getBottom();
                    canvas2.clipRect(rectF2);
                }
                canvas2.clipRect(this.m, Region.Op.DIFFERENCE);
                float f15 = (float) i9;
                canvas2.drawText(str2, (float) this.R, f15, this.f18448d);
                canvas.restore();
                this.f18448d.setColor(this.y);
                this.f18448d.setTextSize((float) this.A);
                canvas.save();
                if (this.ag) {
                    canvas2.concat(this.o);
                }
                canvas2.clipRect(this.m);
                i9 = (int) (f15 + (((this.f18448d.descent() - this.f18448d.ascent()) / 2.0f) - ((float) (this.w / 2))));
            } else {
                canvas.save();
                canvas2.clipRect(this.j);
                if (this.ag) {
                    canvas2.concat(this.o);
                }
            }
            canvas2.drawText(str2, (float) this.R, (float) i9, this.f18448d);
            canvas.restore();
            if (this.ak) {
                canvas.save();
                canvas2.clipRect(this.j);
                this.f18448d.setColor(-1166541);
                int i15 = this.Q + (this.G * i8);
                float f16 = (float) i15;
                canvas.drawLine((float) this.j.left, f16, (float) this.j.right, f16, this.f18448d);
                this.f18448d.setColor(-13421586);
                this.f18448d.setStyle(Paint.Style.STROKE);
                int i16 = i15 - this.H;
                canvas.drawRect((float) this.j.left, (float) i16, (float) this.j.right, (float) (i16 + this.G), this.f18448d);
                canvas.restore();
            }
            i7++;
            i8++;
        }
        if (this.ad) {
            this.f18448d.setColor(this.D);
            this.f18448d.setStyle(Paint.Style.FILL);
            canvas2.drawRect(this.m, this.f18448d);
        }
        if (this.ac) {
            this.f18448d.setColor(this.C);
            this.f18448d.setStyle(Paint.Style.FILL);
            canvas2.drawRect(this.k, this.f18448d);
            canvas2.drawRect(this.l, this.f18448d);
        }
        if (this.ak) {
            this.f18448d.setColor(1144254003);
            this.f18448d.setStyle(Paint.Style.FILL);
            canvas.drawRect(0.0f, 0.0f, (float) getPaddingLeft(), (float) getHeight(), this.f18448d);
            canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getPaddingTop(), this.f18448d);
            canvas.drawRect((float) (getWidth() - getPaddingRight()), 0.0f, (float) getWidth(), (float) getHeight(), this.f18448d);
            canvas.drawRect(0.0f, (float) (getHeight() - getPaddingBottom()), (float) getWidth(), (float) getHeight(), this.f18448d);
        }
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f18445a, false, 14776, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f18445a, false, 14776, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int i4 = this.v;
        int i5 = (this.w * this.s) + (this.E * (this.s - 1));
        if (this.ag) {
            double d2 = (double) (i5 * 2);
            Double.isNaN(d2);
            i5 = (int) (d2 / 3.141592653589793d);
        }
        setMeasuredDimension(a(mode, size, i4 + getPaddingLeft() + getPaddingRight()), a(mode2, size2, i5 + getPaddingTop() + getPaddingBottom()));
    }

    private ap(Context context, AttributeSet attributeSet) {
        super(context, null);
        this.f18447c = new Handler();
        this.N = 50;
        this.O = 8000;
        this.aa = 8;
        this.ak = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.ttlive_WheelPicker);
        int resourceId = obtainStyledAttributes.getResourceId(7, 0);
        if (resourceId == 0) {
            this.q = new ArrayList();
        } else {
            this.q = Arrays.asList(getResources().getStringArray(resourceId));
        }
        this.s = obtainStyledAttributes.getInt(20, 7);
        this.J = obtainStyledAttributes.getInt(17, 0);
        this.ab = obtainStyledAttributes.getBoolean(16, false);
        this.U = obtainStyledAttributes.getInt(15, -1);
        this.r = obtainStyledAttributes.getString(14);
        this.y = obtainStyledAttributes.getColor(18, -1);
        this.x = obtainStyledAttributes.getColor(12, -7829368);
        this.af = obtainStyledAttributes.getBoolean(6, false);
        this.ac = obtainStyledAttributes.getBoolean(8, false);
        this.C = obtainStyledAttributes.getColor(9, -2105377);
        this.ad = obtainStyledAttributes.getBoolean(3, false);
        this.D = obtainStyledAttributes.getColor(4, -1996488705);
        this.ae = obtainStyledAttributes.getBoolean(2, false);
        this.ag = obtainStyledAttributes.getBoolean(5, false);
        this.F = obtainStyledAttributes.getInt(1, 0);
        this.aj = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        a();
        this.f18448d = new Paint(69);
        this.f18448d.setTextSize((float) this.z);
        if (this.aj != null) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), this.aj));
        }
        c();
        b();
        this.f18449e = new Scroller(getContext());
        if (Build.VERSION.SDK_INT >= 4) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            this.N = viewConfiguration.getScaledMinimumFlingVelocity();
            this.O = viewConfiguration.getScaledMaximumFlingVelocity();
            this.aa = viewConfiguration.getScaledTouchSlop();
        }
        this.j = new Rect();
        this.k = new Rect();
        this.l = new Rect();
        this.m = new Rect();
        this.n = new Camera();
        this.o = new Matrix();
        this.p = new Matrix();
    }

    public final void a(int i2, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18445a, false, 14793, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2)}, this, f18445a, false, 14793, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g = false;
        if (!z2 || !this.f18449e.isFinished()) {
            if (!this.f18449e.isFinished()) {
                this.f18449e.abortAnimation();
            }
            int max = Math.max(Math.min(i2, this.q.size() - 1), 0);
            this.J = max;
            this.K = max;
            this.T = 0;
            e();
            requestLayout();
            invalidate();
            return;
        }
        int size = getData().size();
        int i3 = i2 - this.K;
        if (i3 != 0) {
            if (this.af && Math.abs(i3) > size / 2) {
                if (i3 > 0) {
                    size = -size;
                }
                i3 += size;
            }
            this.f18449e.startScroll(0, this.f18449e.getCurrY(), 0, (-i3) * this.G);
            this.f18447c.post(this);
        }
    }

    private int a(int i2, int i3, int i4) {
        int i5;
        int i6 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f18445a, false, 14777, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f18445a, false, 14777, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (i6 == 1073741824) {
            i5 = i3;
        } else if (i6 == Integer.MIN_VALUE) {
            i5 = Math.min(i4, i3);
        } else {
            i5 = i4;
        }
        return i5;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f18445a, false, 14778, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f18445a, false, 14778, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.j.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.P = this.j.centerX();
        this.Q = this.j.centerY();
        d();
        this.I = this.j.height() / 2;
        this.G = this.j.height() / this.s;
        this.H = this.G / 2;
        e();
        f();
        g();
    }
}
