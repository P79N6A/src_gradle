package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
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
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.R$styleable;
import java.util.Arrays;
import java.util.List;

public class WheelPicker extends View implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62434a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f62435b = "WheelPicker";
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
    private boolean W;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private boolean ah;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f62436c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f62437d;

    /* renamed from: e  reason: collision with root package name */
    private Scroller f62438e;

    /* renamed from: f  reason: collision with root package name */
    private VelocityTracker f62439f;
    private a g;
    private b h;
    private Rect i;
    private Rect j;
    private Rect k;
    private Rect l;
    private Camera m;
    private Matrix n;
    private Matrix o;
    private List p;
    private String q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public interface a {
        void a(WheelPicker wheelPicker, Object obj, int i);
    }

    public interface b {
    }

    public int getCurrentItemPosition() {
        return this.I;
    }

    public int getCurtainColor() {
        return this.B;
    }

    public List getData() {
        return this.p;
    }

    public int getIndicatorColor() {
        return this.A;
    }

    public int getIndicatorSize() {
        return this.z;
    }

    public int getItemAlign() {
        return this.D;
    }

    public int getItemSpace() {
        return this.C;
    }

    public int getItemTextColor() {
        return this.w;
    }

    public int getItemTextSize() {
        return this.y;
    }

    public String getMaximumWidthText() {
        return this.q;
    }

    public int getMaximumWidthTextPosition() {
        return this.S;
    }

    public int getSelectedItemPosition() {
        return this.H;
    }

    public int getSelectedItemTextColor() {
        return this.x;
    }

    public int getVisibleItemCount() {
        return this.r;
    }

    public Typeface getTypeface() {
        if (PatchProxy.isSupport(new Object[0], this, f62434a, false, 69312, new Class[0], Typeface.class)) {
            return (Typeface) PatchProxy.accessDispatch(new Object[0], this, f62434a, false, 69312, new Class[0], Typeface.class);
        } else if (this.f62437d != null) {
            return this.f62437d.getTypeface();
        } else {
            return null;
        }
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f62434a, false, 69276, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62434a, false, 69276, new Class[0], Void.TYPE);
        } else if (this.r >= 2) {
            if (this.r % 2 == 0) {
                this.r++;
            }
            this.s = this.r + 2;
            this.t = this.s / 2;
        } else {
            throw new ArithmeticException("Wheel's visible item count can not be less than 2!");
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f62434a, false, 69278, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62434a, false, 69278, new Class[0], Void.TYPE);
            return;
        }
        switch (this.D) {
            case 1:
                this.f62437d.setTextAlign(Paint.Align.LEFT);
                return;
            case 2:
                this.f62437d.setTextAlign(Paint.Align.RIGHT);
                return;
            default:
                this.f62437d.setTextAlign(Paint.Align.CENTER);
                return;
        }
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f62434a, false, 69282, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62434a, false, 69282, new Class[0], Void.TYPE);
            return;
        }
        switch (this.D) {
            case 1:
                this.P = this.i.left;
                break;
            case 2:
                this.P = this.i.right;
                break;
            default:
                this.P = this.N;
                break;
        }
        this.Q = (int) (((float) this.O) - ((this.f62437d.ascent() + this.f62437d.descent()) / 2.0f));
    }

    private void e() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f62434a, false, 69283, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62434a, false, 69283, new Class[0], Void.TYPE);
            return;
        }
        int i3 = this.H * this.E;
        if (this.ad) {
            i2 = Integer.MIN_VALUE;
        } else {
            i2 = ((-this.E) * (this.p.size() - 1)) + i3;
        }
        this.J = i2;
        if (this.ad) {
            i3 = Integer.MAX_VALUE;
        }
        this.K = i3;
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f62434a, false, 69284, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62434a, false, 69284, new Class[0], Void.TYPE);
        } else if (this.aa) {
            int i2 = this.z / 2;
            int i3 = this.O + this.F;
            int i4 = this.O - this.F;
            this.j.set(this.i.left, i3 - i2, this.i.right, i3 + i2);
            this.k.set(this.i.left, i4 - i2, this.i.right, i4 + i2);
        }
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f62434a, false, 69285, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62434a, false, 69285, new Class[0], Void.TYPE);
        } else if (this.ab || this.x != -1) {
            this.l.set(this.i.left, this.O - this.F, this.i.right, this.O + this.F);
        }
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f62434a, false, 69277, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62434a, false, 69277, new Class[0], Void.TYPE);
            return;
        }
        this.v = 0;
        this.u = this.v;
        if (this.W) {
            this.u = (int) this.f62437d.measureText(String.valueOf(this.p.get(0)));
        } else if (a(this.S)) {
            this.u = (int) this.f62437d.measureText(String.valueOf(this.p.get(this.S)));
        } else if (!TextUtils.isEmpty(this.q)) {
            this.u = (int) this.f62437d.measureText(this.q);
        } else {
            for (Object valueOf : this.p) {
                String valueOf2 = String.valueOf(valueOf);
                this.u = Math.max(this.u, (int) this.f62437d.measureText(valueOf2));
            }
        }
        Paint.FontMetrics fontMetrics = this.f62437d.getFontMetrics();
        this.v = (int) (fontMetrics.bottom - fontMetrics.top);
    }

    public void run() {
        if (PatchProxy.isSupport(new Object[0], this, f62434a, false, 69292, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62434a, false, 69292, new Class[0], Void.TYPE);
        } else if (this.p != null && this.p.size() != 0) {
            if (this.f62438e.isFinished() && !this.ag) {
                if (this.E != 0) {
                    int size = (((-this.R) / this.E) + this.H) % this.p.size();
                    if (size < 0) {
                        size += this.p.size();
                    }
                    this.I = size;
                    if (this.g != null) {
                        this.g.a(this, this.p.get(size), size);
                    }
                } else {
                    return;
                }
            }
            if (this.f62438e.computeScrollOffset()) {
                this.R = this.f62438e.getCurrY();
                postInvalidate();
                this.f62436c.postDelayed(this, 16);
            }
        }
    }

    public void setDebug(boolean z2) {
        this.ah = z2;
    }

    public void setOnItemSelectedListener(a aVar) {
        this.g = aVar;
    }

    public void setOnWheelChangeListener(b bVar) {
        this.h = bVar;
    }

    public WheelPicker(Context context) {
        this(context, null);
    }

    private int b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69291, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69291, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (Math.abs(i2) <= this.F) {
            return -i2;
        } else {
            if (this.R < 0) {
                return (-this.E) - i2;
            }
            return this.E - i2;
        }
    }

    public void setAtmospheric(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f62434a, false, 69309, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f62434a, false, 69309, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.ac = z2;
        invalidate();
    }

    public void setCurtain(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f62434a, false, 69307, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f62434a, false, 69307, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.ab = z2;
        g();
        invalidate();
    }

    public void setCurtainColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69308, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69308, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.B = i2;
        invalidate();
    }

    public void setCurved(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f62434a, false, 69310, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f62434a, false, 69310, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.ae = z2;
        requestLayout();
        invalidate();
    }

    public void setCyclic(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f62434a, false, 69294, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f62434a, false, 69294, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.ad = z2;
        e();
        invalidate();
    }

    public void setData(List list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f62434a, false, 69296, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f62434a, false, 69296, new Class[]{List.class}, Void.TYPE);
        } else if (list != null) {
            this.p = list;
            if (this.H > list.size() - 1 || this.I > list.size() - 1) {
                this.I = list.size() - 1;
            }
            this.H = this.I;
            this.R = 0;
            b();
            e();
            requestLayout();
            invalidate();
        } else {
            throw new NullPointerException("WheelPicker's data can not be null!");
        }
    }

    public void setIndicator(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f62434a, false, 69304, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f62434a, false, 69304, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.aa = z2;
        f();
        invalidate();
    }

    public void setIndicatorColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69306, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69306, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.A = i2;
        invalidate();
    }

    public void setIndicatorSize(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69305, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69305, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.z = i2;
        f();
        invalidate();
    }

    public void setItemAlign(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69311, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69311, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.D = i2;
        c();
        d();
        invalidate();
    }

    public void setItemSpace(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69303, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69303, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.C = i2;
        requestLayout();
        invalidate();
    }

    public void setItemTextColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69301, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69301, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.w = i2;
        invalidate();
    }

    public void setItemTextSize(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69302, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69302, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.y = i2;
        this.f62437d.setTextSize((float) this.y);
        b();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthText(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f62434a, false, 69298, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f62434a, false, 69298, new Class[]{String.class}, Void.TYPE);
        } else if (str2 != null) {
            this.q = str2;
            b();
            requestLayout();
            invalidate();
        } else {
            throw new NullPointerException("Maximum width text can not be null!");
        }
    }

    public void setMaximumWidthTextPosition(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69299, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69299, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (a(i2)) {
            this.S = i2;
            b();
            requestLayout();
            invalidate();
        } else {
            throw new ArrayIndexOutOfBoundsException("Maximum width text Position must in [0, " + this.p.size() + "), but current is " + i2);
        }
    }

    public void setSameWidth(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f62434a, false, 69297, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f62434a, false, 69297, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.W = z2;
        b();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemPosition(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69295, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69295, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int max = Math.max(Math.min(i2, this.p.size() - 1), 0);
        this.H = max;
        this.I = max;
        this.R = 0;
        e();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemTextColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69300, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69300, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.x = i2;
        g();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (PatchProxy.isSupport(new Object[]{typeface}, this, f62434a, false, 69313, new Class[]{Typeface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{typeface}, this, f62434a, false, 69313, new Class[]{Typeface.class}, Void.TYPE);
            return;
        }
        if (this.f62437d != null) {
            this.f62437d.setTypeface(typeface);
        }
        b();
        requestLayout();
        invalidate();
    }

    public void setVisibleItemCount(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69293, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69293, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.r = i2;
        a();
        requestLayout();
    }

    private boolean a(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69287, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f62434a, false, 69287, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (i3 >= 0) {
            if (i3 < this.p.size()) {
                return true;
            }
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f62434a, false, 69290, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f62434a, false, 69290, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (this.f62439f == null) {
                    this.f62439f = VelocityTracker.obtain();
                } else {
                    this.f62439f.clear();
                }
                this.f62439f.addMovement(motionEvent2);
                if (!this.f62438e.isFinished()) {
                    this.f62438e.abortAnimation();
                    this.ag = true;
                }
                this.T = (int) motionEvent.getY();
                this.U = this.T;
                break;
            case 1:
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                if (!this.af) {
                    this.f62439f.addMovement(motionEvent2);
                    if (Build.VERSION.SDK_INT >= 4) {
                        this.f62439f.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, (float) this.M);
                    } else {
                        this.f62439f.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                    }
                    this.ag = false;
                    int yVelocity = (int) this.f62439f.getYVelocity();
                    if (Math.abs(yVelocity) > this.L) {
                        this.f62438e.fling(0, this.R, 0, yVelocity, 0, 0, this.J, this.K);
                        this.f62438e.setFinalY(this.f62438e.getFinalY() + b(this.f62438e.getFinalY() % this.E));
                    } else {
                        this.f62438e.startScroll(0, this.R, 0, b(this.R % this.E));
                    }
                    if (!this.ad) {
                        if (this.f62438e.getFinalY() > this.K) {
                            this.f62438e.setFinalY(this.K);
                        } else if (this.f62438e.getFinalY() < this.J) {
                            this.f62438e.setFinalY(this.J);
                        }
                    }
                    this.f62436c.post(this);
                    if (this.f62439f != null) {
                        this.f62439f.recycle();
                        this.f62439f = null;
                        break;
                    }
                }
                break;
            case 2:
                if (Math.abs(((float) this.U) - motionEvent.getY()) >= ((float) this.V)) {
                    this.af = false;
                    this.f62439f.addMovement(motionEvent2);
                    float y2 = motionEvent.getY() - ((float) this.T);
                    if (Math.abs(y2) >= 1.0f) {
                        this.R = (int) (((float) this.R) + y2);
                        this.T = (int) motionEvent.getY();
                        invalidate();
                        break;
                    }
                } else {
                    this.af = true;
                    break;
                }
                break;
            case 3:
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                if (this.f62439f != null) {
                    this.f62439f.recycle();
                    this.f62439f = null;
                    break;
                }
                break;
        }
        return true;
    }

    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        float f2;
        int i4;
        int i5;
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f62434a, false, 69286, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f62434a, false, 69286, new Class[]{Canvas.class}, Void.TYPE);
        } else if (this.p != null && !this.p.isEmpty()) {
            int i6 = ((-this.R) / this.E) - this.t;
            int i7 = this.H + i6;
            int i8 = -this.t;
            while (i7 < this.H + i6 + this.s) {
                String str = "";
                if (this.ad) {
                    int size = i7 % this.p.size();
                    if (size < 0) {
                        size += this.p.size();
                    }
                    str = String.valueOf(this.p.get(size));
                } else if (a(i7)) {
                    str = String.valueOf(this.p.get(i7));
                }
                String str2 = str;
                this.f62437d.setColor(this.w);
                this.f62437d.setStyle(Paint.Style.FILL);
                int i9 = this.Q + (this.E * i8) + (this.R % this.E);
                if (this.ae) {
                    float abs = (((float) ((this.Q - Math.abs(this.Q - i9)) - this.i.top)) * 1.0f) / ((float) (this.Q - this.i.top));
                    if (i9 > this.Q) {
                        i3 = 1;
                    } else if (i9 < this.Q) {
                        i3 = -1;
                    } else {
                        i3 = 0;
                    }
                    float f3 = (-(1.0f - abs)) * 90.0f * ((float) i3);
                    if (f3 < -90.0f) {
                        f3 = -90.0f;
                    }
                    if (f3 > 90.0f) {
                        f2 = 90.0f;
                    } else {
                        f2 = f3;
                    }
                    int i10 = (int) f2;
                    int i11 = i10;
                    float f4 = f2;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i10)}, this, f62434a, false, 69288, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                        i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i11)}, this, f62434a, false, 69288, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                        i4 = i11;
                    } else {
                        i4 = i11;
                        double sin = Math.sin(Math.toRadians((double) i4));
                        double d2 = (double) this.G;
                        Double.isNaN(d2);
                        i2 = (int) (sin * d2);
                    }
                    int i12 = this.N;
                    switch (this.D) {
                        case 1:
                            i12 = this.i.left;
                            break;
                        case 2:
                            i12 = this.i.right;
                            break;
                    }
                    int i13 = this.O - i2;
                    this.m.save();
                    this.m.rotateX(f4);
                    this.m.getMatrix(this.n);
                    this.m.restore();
                    float f5 = (float) (-i12);
                    float f6 = (float) (-i13);
                    this.n.preTranslate(f5, f6);
                    float f7 = (float) i12;
                    float f8 = (float) i13;
                    this.n.postTranslate(f7, f8);
                    this.m.save();
                    Camera camera = this.m;
                    float f9 = f6;
                    float f10 = f8;
                    Camera camera2 = camera;
                    float f11 = f7;
                    float f12 = f9;
                    float f13 = f5;
                    int i14 = i4;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i4)}, this, f62434a, false, 69289, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                        i5 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i14)}, this, f62434a, false, 69289, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                    } else {
                        double d3 = (double) this.G;
                        double cos = Math.cos(Math.toRadians((double) i14));
                        double d4 = (double) this.G;
                        Double.isNaN(d4);
                        Double.isNaN(d3);
                        i5 = (int) (d3 - (cos * d4));
                    }
                    camera2.translate(0.0f, 0.0f, (float) i5);
                    this.m.getMatrix(this.o);
                    this.m.restore();
                    this.o.preTranslate(f13, f12);
                    this.o.postTranslate(f11, f10);
                    this.n.postConcat(this.o);
                } else {
                    i2 = 0;
                }
                if (this.ac) {
                    int abs2 = (int) (((((float) (this.Q - Math.abs(this.Q - i9))) * 1.0f) / ((float) this.Q)) * 255.0f);
                    if (abs2 < 0) {
                        abs2 = 0;
                    }
                    this.f62437d.setAlpha(abs2);
                }
                if (this.ae) {
                    i9 = this.Q - i2;
                }
                if (this.x != -1) {
                    canvas.save();
                    if (this.ae) {
                        canvas2.concat(this.n);
                    }
                    canvas2.clipRect(this.l, Region.Op.DIFFERENCE);
                    canvas2.drawText(str2, (float) this.P, (float) i9, this.f62437d);
                    canvas.restore();
                    this.f62437d.setColor(this.x);
                    canvas.save();
                    if (this.ae) {
                        canvas2.concat(this.n);
                    }
                    canvas2.clipRect(this.l);
                } else {
                    canvas.save();
                    canvas2.clipRect(this.i);
                    if (this.ae) {
                        canvas2.concat(this.n);
                    }
                }
                canvas2.drawText(str2, (float) this.P, (float) i9, this.f62437d);
                canvas.restore();
                if (this.ah) {
                    canvas.save();
                    canvas2.clipRect(this.i);
                    this.f62437d.setColor(-1166541);
                    int i15 = this.O + (this.E * i8);
                    float f14 = (float) i15;
                    canvas.drawLine((float) this.i.left, f14, (float) this.i.right, f14, this.f62437d);
                    this.f62437d.setColor(-13421586);
                    this.f62437d.setStyle(Paint.Style.STROKE);
                    int i16 = i15 - this.F;
                    canvas.drawRect((float) this.i.left, (float) i16, (float) this.i.right, (float) (i16 + this.E), this.f62437d);
                    canvas.restore();
                }
                i7++;
                i8++;
            }
            if (this.ab) {
                this.f62437d.setColor(this.B);
                this.f62437d.setStyle(Paint.Style.FILL);
                canvas2.drawRect(this.l, this.f62437d);
            }
            if (this.aa) {
                this.f62437d.setColor(this.A);
                this.f62437d.setStyle(Paint.Style.FILL);
                canvas2.drawRect(this.j, this.f62437d);
                canvas2.drawRect(this.k, this.f62437d);
            }
            if (this.ah) {
                this.f62437d.setColor(1144254003);
                this.f62437d.setStyle(Paint.Style.FILL);
                canvas.drawRect(0.0f, 0.0f, (float) getPaddingLeft(), (float) getHeight(), this.f62437d);
                canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getPaddingTop(), this.f62437d);
                canvas.drawRect((float) (getWidth() - getPaddingRight()), 0.0f, (float) getWidth(), (float) getHeight(), this.f62437d);
                canvas.drawRect(0.0f, (float) (getHeight() - getPaddingBottom()), (float) getWidth(), (float) getHeight(), this.f62437d);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f62434a, false, 69279, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f62434a, false, 69279, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int i4 = this.u;
        int i5 = (this.v * this.r) + (this.C * (this.r - 1));
        if (this.ae) {
            double d2 = (double) (i5 * 2);
            Double.isNaN(d2);
            i5 = (int) (d2 / 3.141592653589793d);
        }
        setMeasuredDimension(a(mode, size, i4 + getPaddingLeft() + getPaddingRight()), a(mode2, size2, i5 + getPaddingTop() + getPaddingBottom()));
    }

    public WheelPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62436c = new Handler();
        this.L = 50;
        this.M = 8000;
        this.V = 8;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WheelPicker);
        this.p = Arrays.asList(getResources().getStringArray(obtainStyledAttributes.getResourceId(5, 0) == 0 ? C0906R.array.f4406a : obtainStyledAttributes.getResourceId(5, 0)));
        this.y = obtainStyledAttributes.getDimensionPixelSize(12, getResources().getDimensionPixelSize(C0906R.dimen.f4451c));
        this.r = obtainStyledAttributes.getInt(18, 7);
        this.H = obtainStyledAttributes.getInt(16, 0);
        this.W = obtainStyledAttributes.getBoolean(15, false);
        this.S = obtainStyledAttributes.getInt(14, -1);
        this.q = obtainStyledAttributes.getString(13);
        this.x = obtainStyledAttributes.getColor(17, -1);
        this.w = obtainStyledAttributes.getColor(11, -7829368);
        this.C = obtainStyledAttributes.getDimensionPixelSize(10, getResources().getDimensionPixelSize(C0906R.dimen.f4450b));
        this.ad = obtainStyledAttributes.getBoolean(4, false);
        this.aa = obtainStyledAttributes.getBoolean(6, false);
        this.A = obtainStyledAttributes.getColor(7, -1166541);
        this.z = obtainStyledAttributes.getDimensionPixelSize(8, getResources().getDimensionPixelSize(C0906R.dimen.f4449a));
        this.ab = obtainStyledAttributes.getBoolean(1, false);
        this.B = obtainStyledAttributes.getColor(2, -1996488705);
        this.ac = obtainStyledAttributes.getBoolean(0, false);
        this.ae = obtainStyledAttributes.getBoolean(3, false);
        this.D = obtainStyledAttributes.getInt(9, 0);
        obtainStyledAttributes.recycle();
        a();
        this.f62437d = new Paint(69);
        this.f62437d.setTextSize((float) this.y);
        c();
        b();
        this.f62438e = new Scroller(getContext());
        if (Build.VERSION.SDK_INT >= 4) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            this.L = viewConfiguration.getScaledMinimumFlingVelocity();
            this.M = viewConfiguration.getScaledMaximumFlingVelocity();
            this.V = viewConfiguration.getScaledTouchSlop();
        }
        this.i = new Rect();
        this.j = new Rect();
        this.k = new Rect();
        this.l = new Rect();
        this.m = new Camera();
        this.n = new Matrix();
        this.o = new Matrix();
    }

    private int a(int i2, int i3, int i4) {
        int i5;
        int i6 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f62434a, false, 69280, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f62434a, false, 69280, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
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
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f62434a, false, 69281, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f62434a, false, 69281, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.i.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.N = this.i.centerX();
        this.O = this.i.centerY();
        d();
        this.G = this.i.height() / 2;
        this.E = this.i.height() / this.r;
        this.F = this.E / 2;
        e();
        f();
        g();
    }
}
