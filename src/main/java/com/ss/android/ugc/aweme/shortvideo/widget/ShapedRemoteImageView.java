package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.R$styleable;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import java.util.Arrays;

public class ShapedRemoteImageView extends RemoteImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71375a;

    /* renamed from: b  reason: collision with root package name */
    private int f71376b;

    /* renamed from: c  reason: collision with root package name */
    private float f71377c;

    /* renamed from: d  reason: collision with root package name */
    private int f71378d = 637534208;

    /* renamed from: e  reason: collision with root package name */
    private float f71379e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f71380f;
    private Path g;
    private Shape h;
    private Shape i;
    private Paint j;
    private Paint k;
    private Paint l;
    private Bitmap m;
    private a n;
    private PorterDuffXfermode o;

    public interface a {
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f71375a, false, 81415, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71375a, false, 81415, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null) {
            this.m.recycle();
            this.m = null;
        }
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f71375a, false, 81412, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71375a, false, 81412, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        if (this.m == null) {
            b();
        }
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f71375a, false, 81413, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71375a, false, 81413, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        c();
    }

    private Bitmap b() {
        if (PatchProxy.isSupport(new Object[0], this, f71375a, false, 81414, new Class[0], Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[0], this, f71375a, false, 81414, new Class[0], Bitmap.class);
        } else if (this.f71379e <= 0.0f) {
            return null;
        } else {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (measuredWidth == 0 || measuredHeight == 0) {
                return null;
            }
            c();
            this.m = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.m);
            Paint paint = new Paint(1);
            paint.setColor(this.f71378d);
            canvas.drawRect(new RectF(0.0f, 0.0f, (float) measuredWidth, (float) measuredHeight), paint);
            return this.m;
        }
    }

    public ShapedRemoteImageView(Context context) {
        super(context);
        a(null);
    }

    public void setExtension(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f71375a, false, 81416, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f71375a, false, 81416, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.n = aVar2;
        requestLayout();
    }

    public void setShapeMode(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71375a, false, 81421, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71375a, false, 81421, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        b(i2, this.f71377c);
    }

    public void setShapeRadius(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71375a, false, 81422, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71375a, false, 81422, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        b(this.f71376b, f2);
    }

    public void setStrokeColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71375a, false, 81418, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71375a, false, 81418, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a(i2, this.f71379e);
    }

    public void setStrokeWidth(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71375a, false, 81419, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71375a, false, 81419, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        a(this.f71378d, f2);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f71375a, false, 81411, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f71375a, false, 81411, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (!(this.f71379e <= 0.0f || this.i == null || this.m == null)) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), null, 31);
            this.k.setXfermode(null);
            canvas.drawBitmap(this.m, 0.0f, 0.0f, this.k);
            canvas.translate(this.f71379e, this.f71379e);
            if (this.o == null) {
                this.o = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            }
            this.k.setXfermode(this.o);
            this.i.draw(canvas, this.k);
            canvas.restoreToCount(saveLayer);
        }
        if (this.n != null) {
            canvas.drawPath(this.g, this.l);
        }
        switch (this.f71376b) {
            case 1:
            case 2:
                if (this.h != null) {
                    this.h.draw(canvas, this.j);
                    break;
                }
                break;
        }
    }

    private void a(AttributeSet attributeSet) {
        if (PatchProxy.isSupport(new Object[]{attributeSet}, this, f71375a, false, 81409, new Class[]{AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet}, this, f71375a, false, 81409, new Class[]{AttributeSet.class}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(2, null);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ShapedRemoteImageView);
            this.f71376b = obtainStyledAttributes.getInt(1, 0);
            this.f71377c = obtainStyledAttributes.getDimension(0, 0.0f);
            this.f71379e = obtainStyledAttributes.getDimension(3, 0.0f);
            this.f71378d = obtainStyledAttributes.getColor(2, this.f71378d);
            obtainStyledAttributes.recycle();
        }
        this.j = new Paint(1);
        this.j.setFilterBitmap(true);
        this.j.setColor(-16777216);
        this.j.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.k = new Paint(1);
        this.k.setFilterBitmap(true);
        this.k.setColor(-16777216);
        this.l = new Paint(1);
        this.l.setFilterBitmap(true);
        this.l.setColor(-16777216);
        this.l.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.g = new Path();
    }

    public ShapedRemoteImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    private void a(int i2, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f71375a, false, 81417, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f71375a, false, 81417, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE);
        } else if (this.f71379e > 0.0f) {
            if (this.f71379e != f2) {
                this.f71379e = f2;
                this.i.resize(((float) getMeasuredWidth()) - (this.f71379e * 2.0f), ((float) getMeasuredHeight()) - (this.f71379e * 2.0f));
                postInvalidate();
            }
            if (this.f71378d != i2) {
                this.f71378d = i2;
                b();
                postInvalidate();
            }
        }
    }

    private void b(int i2, float f2) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f71375a, false, 81420, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f71375a, false, 81420, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.f71376b == i2 && this.f71377c == f2)) {
            z = true;
        }
        this.f71380f = z;
        if (this.f71380f) {
            this.f71376b = i2;
            this.f71377c = f2;
            this.h = null;
            this.i = null;
            requestLayout();
        }
    }

    public ShapedRemoteImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f71375a, false, 81410, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f71375a, false, 81410, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z, i2, i3, i4, i5);
        if (z || this.f71380f) {
            this.f71380f = false;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            switch (this.f71376b) {
                case 2:
                    this.f71377c = ((float) Math.min(measuredWidth, measuredHeight)) / 2.0f;
                    break;
            }
            if (this.h == null || this.f71377c != 0.0f) {
                float[] fArr = new float[8];
                Arrays.fill(fArr, this.f71377c);
                this.h = new RoundRectShape(fArr, null, null);
                this.i = new RoundRectShape(fArr, null, null);
            }
            float f2 = (float) measuredWidth;
            float f3 = (float) measuredHeight;
            this.h.resize(f2, f3);
            this.i.resize(f2 - (this.f71379e * 2.0f), f3 - (this.f71379e * 2.0f));
            b();
        }
    }
}
