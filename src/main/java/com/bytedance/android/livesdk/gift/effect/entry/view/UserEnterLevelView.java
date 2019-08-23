package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.gift.effect.a.a;
import com.bytedance.android.livesdk.gift.effect.normal.e.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public class UserEnterLevelView extends View implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14859a;

    /* renamed from: b  reason: collision with root package name */
    public float f14860b;

    /* renamed from: c  reason: collision with root package name */
    public Matrix f14861c;

    /* renamed from: d  reason: collision with root package name */
    public Shader f14862d;

    /* renamed from: e  reason: collision with root package name */
    public Shader f14863e;

    /* renamed from: f  reason: collision with root package name */
    public Shader f14864f;
    public ComposeShader g;
    public Bitmap h;
    public Canvas i;
    public Matrix j;
    public float k;
    public Matrix l;
    public Paint m;
    public Paint n;
    public float o;
    public float p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    private a v;
    private Bitmap w;
    private RectF x;
    private Paint y;

    public UserEnterLevelView(Context context) {
        this(context, null);
    }

    public void updateDrawingCache(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f14859a, false, 9500, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f14859a, false, 9500, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.w = b.a(view);
        invalidate();
    }

    public void setUI(com.bytedance.android.livesdk.gift.effect.entry.e.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f14859a, false, 9494, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f14859a, false, 9494, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class}, Void.TYPE);
            return;
        }
        this.u = aVar.j;
        this.v.setUI(aVar);
        this.w = b.a((View) this.v);
        this.o = (float) this.v.getWidth();
        this.p = (float) this.v.getHeight();
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f14859a, false, 9496, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f14859a, false, 9496, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (!this.r) {
            this.y.reset();
            canvas.drawBitmap(this.w, 0.0f, 0.0f, this.y);
            if (this.s) {
                if (this.q) {
                    this.f14860b -= 60.0f;
                } else {
                    this.f14860b += 60.0f;
                }
                this.f14861c.setTranslate(this.f14860b, 0.0f);
                this.f14862d.setLocalMatrix(this.f14861c);
                this.y.setAlpha(240);
                this.y.setShader(this.f14862d);
                canvas.drawRoundRect(this.x, 10.0f, 10.0f, this.y);
                if (this.f14860b >= this.o * 4.0f) {
                    this.s = false;
                    this.f14860b = -this.o;
                }
            }
            if (this.t) {
                this.i.drawPaint(this.n);
                if (this.q) {
                    this.k -= 30.0f;
                } else {
                    this.k += 30.0f;
                }
                this.j.setTranslate(this.k, 0.0f);
                this.f14864f.setLocalMatrix(this.j);
                this.g = new ComposeShader(this.f14863e, this.f14864f, PorterDuff.Mode.DST_ATOP);
                this.g.setLocalMatrix(this.l);
                this.y.setShader(this.g);
                this.i.drawRoundRect(this.x, 10.0f, 10.0f, this.y);
                this.y.setAlpha(SearchJediMixFeedAdapter.f42517f);
                canvas.drawBitmap(this.h, 0.0f, 0.0f, this.y);
                if (this.k >= this.o * 1.5f) {
                    this.t = false;
                    this.k = (-this.o) / 2.0f;
                }
            }
            if ((this.t || this.s) && (this.k <= this.o * 1.5f || this.f14860b <= this.o * 4.0f)) {
                postInvalidateDelayed(20);
            }
        }
    }

    public UserEnterLevelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f14859a, false, 9495, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f14859a, false, 9495, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        this.o = (float) this.v.getWidth();
        this.p = (float) this.v.getHeight();
        this.x = new RectF(0.0f, 0.0f, this.o, this.p);
        setMeasuredDimension((int) this.o, (int) this.p);
    }

    public UserEnterLevelView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (PatchProxy.isSupport(new Object[]{context}, this, f14859a, false, 9493, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f14859a, false, 9493, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.v = new a(context);
        this.v.setDrawingCacheListener(this);
        this.w = b.a((View) this.v);
        this.y = new Paint();
        this.y.setAntiAlias(true);
        this.m = new Paint();
        this.m.setAntiAlias(true);
        this.n = new Paint();
        this.n.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.l = new Matrix();
        this.l.setTranslate(1.0f, 0.0f);
    }
}
