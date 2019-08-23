package com.ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.ui.webview.SSWebView;
import com.ss.android.ugc.aweme.R$styleable;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public class CornersWebView extends SSWebView {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f39905c = null;

    /* renamed from: d  reason: collision with root package name */
    private static final String f39906d = "CornersWebView";

    /* renamed from: e  reason: collision with root package name */
    private boolean f39907e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f39908f;
    private float g;
    private int h;
    private int i;
    private Paint j;
    private Paint k;
    private int l;
    private int m;
    private Bitmap n;
    private Canvas o;
    private Path p;
    private Path q;
    private Path r;
    private Path s;

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f39905c, false, 32859, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39905c, false, 32859, new Class[0], Void.TYPE);
            return;
        }
        this.j = new Paint();
        this.j.setColor(-1);
        this.j.setAntiAlias(true);
        this.j.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.k = new Paint();
        this.k.setXfermode(null);
    }

    public CornersWebView(Context context) {
        super(context);
    }

    public void setCanScrollVertically(boolean z) {
        this.f39908f = z;
    }

    public void setCanTouch(boolean z) {
        this.f39907e = z;
    }

    public boolean canScrollVertically(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f39905c, false, 32857, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f39905c, false, 32857, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!this.f39907e || !this.f39908f || !super.canScrollVertically(i2)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f39905c, false, 32856, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f39905c, false, 32856, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.f39907e) {
            return false;
        } else {
            if (this.f39908f) {
                requestDisallowInterceptTouchEvent(true);
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public void draw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f39905c, false, 32860, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f39905c, false, 32860, new Class[]{Canvas.class}, Void.TYPE);
        } else if (this.g <= 0.0f || this.n == null || this.o == null) {
            super.draw(canvas);
        } else {
            super.draw(this.o);
            if (PatchProxy.isSupport(new Object[0], this, f39905c, false, 32861, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39905c, false, 32861, new Class[0], Void.TYPE);
            } else {
                this.o.drawPath(this.p, this.j);
                this.o.drawPath(this.q, this.j);
                this.o.drawPath(this.r, this.j);
                this.o.drawPath(this.s, this.j);
            }
            canvas.drawBitmap(this.n, 0.0f, 0.0f, this.k);
        }
    }

    public CornersWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (PatchProxy.isSupport(new Object[]{context, attributeSet}, this, f39905c, false, 32854, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet}, this, f39905c, false, 32854, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        b(context, attributeSet);
        b();
    }

    private void b(Context context, AttributeSet attributeSet) {
        if (PatchProxy.isSupport(new Object[]{context, attributeSet}, this, f39905c, false, 32855, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet}, this, f39905c, false, 32855, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CornersWebView);
        if (obtainStyledAttributes != null) {
            this.g = (float) (((int) UIUtils.dip2Px(context, (float) obtainStyledAttributes.getInt(0, 2))) * 2);
            obtainStyledAttributes.recycle();
        } else {
            this.g = (float) (((int) UIUtils.dip2Px(context, 2.0f)) * 2);
        }
        if (AbTestManager.a().bg() != 1) {
            this.g = 0.0f;
        }
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f39905c, false, 32858, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f39905c, false, 32858, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        if (this.g > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if ((measuredWidth > 0 && measuredHeight > 0 && this.l != measuredWidth) || this.m != measuredHeight) {
                this.l = measuredWidth;
                this.m = measuredHeight;
                if (this.n != null) {
                    this.n.recycle();
                }
                this.n = Bitmap.createBitmap(this.l, this.m, Bitmap.Config.ARGB_8888);
                this.o = new Canvas(this.n);
                if (PatchProxy.isSupport(new Object[0], this, f39905c, false, 32862, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f39905c, false, 32862, new Class[0], Void.TYPE);
                    return;
                }
                this.p = new Path();
                this.p.moveTo((float) this.h, this.g);
                this.p.lineTo((float) this.h, (float) this.i);
                this.p.lineTo(this.g, (float) this.i);
                this.p.arcTo(new RectF((float) this.h, (float) this.i, ((float) this.h) + this.g, ((float) this.i) + this.g), -90.0f, -90.0f);
                this.p.close();
                this.q = new Path();
                this.q.moveTo((float) this.h, ((float) (this.i + this.m)) - this.g);
                this.q.lineTo((float) this.h, (float) (this.i + this.m));
                this.q.lineTo(((float) this.h) + this.g, (float) (this.i + this.m));
                this.q.arcTo(new RectF((float) this.h, ((float) (this.i + this.m)) - this.g, ((float) this.h) + this.g, (float) (this.i + this.m)), 90.0f, 90.0f);
                this.q.close();
                this.r = new Path();
                this.r.moveTo(((float) (this.h + this.l)) - this.g, (float) (this.i + this.m));
                this.r.lineTo((float) (this.h + this.l), (float) (this.i + this.m));
                this.r.lineTo((float) (this.h + this.l), ((float) (this.i + this.m)) - this.g);
                this.r.arcTo(new RectF(((float) (this.h + this.l)) - this.g, ((float) (this.i + this.m)) - this.g, (float) (this.h + this.l), (float) (this.i + this.m)), 0.0f, 90.0f);
                this.r.close();
                this.s = new Path();
                this.s.moveTo((float) (this.h + this.l), ((float) this.i) + this.g);
                this.s.lineTo((float) (this.h + this.l), (float) this.i);
                this.s.lineTo(((float) (this.h + this.l)) - this.g, (float) this.i);
                this.s.arcTo(new RectF(((float) (this.h + this.l)) - this.g, (float) this.i, (float) (this.h + this.l), ((float) this.i) + this.g), -90.0f, 90.0f);
                this.s.close();
            }
        }
    }

    public CornersWebView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context, attributeSet);
    }
}
