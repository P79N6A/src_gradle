package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class StickerHelpBoxView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67308a;
    private Paint A;
    private PointF[] B;
    private a C;

    /* renamed from: b  reason: collision with root package name */
    RectF f67309b;

    /* renamed from: c  reason: collision with root package name */
    RectF f67310c;

    /* renamed from: d  reason: collision with root package name */
    RectF f67311d;

    /* renamed from: e  reason: collision with root package name */
    float f67312e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f67313f;
    private Context g;
    private Rect h;
    private RectF i;
    private RectF j;
    private RectF k;
    private Bitmap l;
    private Bitmap m;
    private Bitmap n;
    private RectF o;
    private RectF p;
    private Paint q;
    private RectF r;
    private Paint s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private float y;
    private boolean z;

    public interface a {
        void a(boolean z);
    }

    public PointF[] getFourAnglePoint() {
        return this.B;
    }

    public RectF getHelpBoxRect() {
        return this.p;
    }

    public RectF getRotateRect() {
        return this.f67310c;
    }

    public RectF getViewBoxRect() {
        return this.r;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f67308a, false, 77108, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67308a, false, 77108, new Class[0], Void.TYPE);
        } else if (this.f67313f) {
            this.f67313f = false;
            invalidate();
            if (this.C != null) {
                this.C.a(false);
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f67308a, false, 77109, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67308a, false, 77109, new Class[0], Void.TYPE);
        } else if (!this.f67313f) {
            this.f67313f = true;
            invalidate();
            if (this.C != null) {
                this.C.a(true);
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f67308a, false, 77103, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67308a, false, 77103, new Class[0], Void.TYPE);
            return;
        }
        RectF rectF = new RectF(this.o);
        com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(rectF, this.y);
        if (this.z) {
            this.r.set(rectF.left - ((float) this.u), rectF.top - ((float) this.v), rectF.right + ((float) this.u), rectF.bottom + ((float) this.v));
        } else {
            this.r.set(rectF);
        }
        this.p.set(this.r.left - ((float) this.t), this.r.top - ((float) this.t), this.r.right + ((float) this.t), this.r.bottom + ((float) this.t));
        float width = (float) (((int) this.f67309b.width()) >> 1);
        this.f67309b.offsetTo(this.p.left - width, this.p.top - width);
        this.f67310c.offsetTo(this.p.right - width, this.p.bottom - width);
        this.f67311d.offsetTo(this.p.left - width, this.p.bottom - width);
        this.i.set(this.f67309b);
        this.j.set(this.f67310c);
        this.k.set(this.f67311d);
        com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(this.f67309b, this.p.centerX(), this.p.centerY(), this.f67312e);
        com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(this.f67310c, this.p.centerX(), this.p.centerY(), this.f67312e);
        com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(this.f67311d, this.p.centerX(), this.p.centerY(), this.f67312e);
        this.B[0].x = this.r.left;
        this.B[0].y = this.r.top;
        this.B[1].x = this.r.right;
        this.B[1].y = this.r.top;
        this.B[2].x = this.r.left;
        this.B[2].y = this.r.bottom;
        this.B[3].x = this.r.right;
        this.B[3].y = this.r.bottom;
        for (PointF a2 : this.B) {
            com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(a2, this.p.centerX(), this.p.centerY(), (float) Math.toRadians((double) this.f67312e));
        }
    }

    public void setStickerShowHelpboxCallback(a aVar) {
        this.C = aVar;
    }

    public StickerHelpBoxView(Context context) {
        this(context, null);
    }

    public final void a(Rect rect) {
        Rect rect2 = rect;
        if (PatchProxy.isSupport(new Object[]{rect2}, this, f67308a, false, 77099, new Class[]{Rect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2}, this, f67308a, false, 77099, new Class[]{Rect.class}, Void.TYPE);
            return;
        }
        this.o.set(rect2);
    }

    public void setShowBg(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f67308a, false, 77110, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f67308a, false, 77110, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.z = z2;
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f67308a, false, 77100, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f67308a, false, 77100, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        a();
        canvas.save();
        canvas.rotate(this.f67312e, this.o.centerX(), this.o.centerY());
        if (this.z) {
            canvas.drawRoundRect(this.r, (float) this.w, (float) this.w, this.s);
        }
        if (this.f67313f) {
            canvas.drawRect(this.p, this.q);
            canvas.drawBitmap(this.l, this.h, this.i, null);
            canvas.drawBitmap(this.m, this.h, this.j, null);
            canvas.drawBitmap(this.n, this.h, this.k, null);
        }
        canvas.restore();
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67308a, false, 77101, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67308a, false, 77101, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.y = f2;
        this.f67312e = f3;
        invalidate();
    }

    public final void b(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67308a, false, 77102, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67308a, false, 77102, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.o.offset(f2, f3);
        invalidate();
    }

    public final boolean c(float f2, float f3) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67308a, false, 77104, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.shortvideo.edit.b.a.b(this.p, f2, f3, this.f67312e);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67308a, false, 77104, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public StickerHelpBoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67309b = new RectF();
        this.f67310c = new RectF();
        this.f67311d = new RectF();
        this.h = new Rect();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.o = new RectF();
        this.p = new RectF();
        this.q = new Paint();
        this.r = new RectF();
        this.s = new Paint();
        this.t = 10;
        this.u = 10;
        this.v = 10;
        this.w = 10;
        this.x = 30;
        this.f67313f = false;
        this.z = false;
        this.B = new PointF[]{new PointF(), new PointF(), new PointF(), new PointF()};
        this.g = context;
        this.x = (int) UIUtils.dip2Px(context, 14.0f);
        if (PatchProxy.isSupport(new Object[0], this, f67308a, false, 77098, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67308a, false, 77098, new Class[0], Void.TYPE);
            return;
        }
        this.l = BitmapFactory.decodeResource(this.g.getResources(), 2130839332);
        this.m = BitmapFactory.decodeResource(this.g.getResources(), 2130839334);
        this.n = BitmapFactory.decodeResource(this.g.getResources(), 2130838830);
        this.f67309b = new RectF(0.0f, 0.0f, (float) (this.x << 1), (float) (this.x << 1));
        this.f67310c = new RectF(0.0f, 0.0f, (float) (this.x << 1), (float) (this.x << 1));
        this.f67311d = new RectF(0.0f, 0.0f, (float) (this.x << 1), (float) (this.x << 1));
        this.h.set(0, 0, this.l.getWidth(), this.l.getHeight());
        this.q.setColor(-2130706433);
        this.q.setStyle(Paint.Style.STROKE);
        this.q.setAntiAlias(true);
        this.q.setStrokeWidth(2.0f);
        this.s = new Paint(this.q);
        this.s.setColor(-1);
        this.s.setStyle(Paint.Style.FILL);
        this.t = (int) UIUtils.dip2Px(this.g, 10.0f);
        this.u = (int) UIUtils.dip2Px(this.g, 16.0f);
        this.v = (int) UIUtils.dip2Px(this.g, 8.0f);
        this.w = (int) UIUtils.dip2Px(this.g, 5.0f);
        this.A = new Paint();
        this.A.setColor(-65536);
    }
}
