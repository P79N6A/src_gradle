package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.ies.framework.R$styleable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class CircleImageView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    private static final ImageView.ScaleType f70502a = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f70503b;

    /* renamed from: c  reason: collision with root package name */
    private static final Bitmap.Config f70504c = Bitmap.Config.ARGB_8888;

    /* renamed from: d  reason: collision with root package name */
    private final RectF f70505d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f70506e;

    /* renamed from: f  reason: collision with root package name */
    private final Matrix f70507f;
    private final Paint g;
    private final Paint h;
    private int i;
    private int j;
    private Bitmap k;
    private BitmapShader l;
    private int m;
    private int n;
    private float o;
    private float p;
    private boolean q;
    private boolean r;

    public int getBorderColor() {
        return this.i;
    }

    public int getBorderWidth() {
        return this.j;
    }

    public ImageView.ScaleType getScaleType() {
        return f70502a;
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f70503b, false, 80196, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70503b, false, 80196, new Class[0], Void.TYPE);
        } else if (!this.q) {
            this.r = true;
        } else if (this.k != null) {
            Bitmap bitmap = this.k;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.l = new BitmapShader(bitmap, tileMode, tileMode);
            this.g.setAntiAlias(true);
            this.g.setShader(this.l);
            this.h.setStyle(Paint.Style.STROKE);
            this.h.setAntiAlias(true);
            this.h.setColor(this.i);
            this.h.setStrokeWidth((float) this.j);
            this.n = this.k.getHeight();
            this.m = this.k.getWidth();
            this.f70506e.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.p = Math.min((this.f70506e.height() - ((float) this.j)) / 2.0f, (this.f70506e.width() - ((float) this.j)) / 2.0f);
            this.f70505d.set((float) this.j, (float) this.j, this.f70506e.width() - ((float) this.j), this.f70506e.height() - ((float) this.j));
            this.o = Math.min(this.f70505d.height() / 2.0f, this.f70505d.width() / 2.0f);
            b();
            invalidate();
        }
    }

    private void b() {
        float f2;
        float f3;
        if (PatchProxy.isSupport(new Object[0], this, f70503b, false, 80197, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70503b, false, 80197, new Class[0], Void.TYPE);
            return;
        }
        this.f70507f.set(null);
        float f4 = 0.0f;
        if (((float) this.m) * this.f70505d.height() > this.f70505d.width() * ((float) this.n)) {
            f3 = this.f70505d.height() / ((float) this.n);
            f2 = (this.f70505d.width() - (((float) this.m) * f3)) * 0.5f;
        } else {
            f3 = this.f70505d.width() / ((float) this.m);
            f4 = (this.f70505d.height() - (((float) this.n) * f3)) * 0.5f;
            f2 = 0.0f;
        }
        this.f70507f.setScale(f3, f3);
        this.f70507f.postTranslate((float) (((int) (f2 + 0.5f)) + this.j), (float) (((int) (f4 + 0.5f)) + this.j));
        this.l.setLocalMatrix(this.f70507f);
    }

    public CircleImageView(Context context) {
        super(context);
        this.f70505d = new RectF();
        this.f70506e = new RectF();
        this.f70507f = new Matrix();
        this.g = new Paint();
        this.h = new Paint();
        this.i = -16777216;
        this.j = 0;
    }

    private Bitmap a(Drawable drawable) {
        Bitmap bitmap;
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f70503b, false, 80195, new Class[]{Drawable.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{drawable2}, this, f70503b, false, 80195, new Class[]{Drawable.class}, Bitmap.class);
        } else if (drawable2 == null) {
            return null;
        } else {
            if (drawable2 instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable2).getBitmap();
            }
            try {
                if (drawable2 instanceof ColorDrawable) {
                    bitmap = Bitmap.createBitmap(1, 1, f70504c);
                } else {
                    bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f70504c);
                }
                Canvas canvas = new Canvas(bitmap);
                drawable2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable2.draw(canvas);
                return bitmap;
            } catch (OutOfMemoryError unused) {
                return null;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f70503b, false, 80188, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f70503b, false, 80188, new Class[]{Canvas.class}, Void.TYPE);
        } else if (getDrawable() != null) {
            canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), this.o, this.g);
            canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), this.p, this.h);
        }
    }

    public void setBorderColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70503b, false, 80190, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70503b, false, 80190, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 != this.i) {
            this.i = i2;
            this.h.setColor(this.i);
            invalidate();
        }
    }

    public void setBorderWidth(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70503b, false, 80191, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70503b, false, 80191, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 != this.j) {
            this.j = i2;
            a();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2}, this, f70503b, false, 80192, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2}, this, f70503b, false, 80192, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        super.setImageBitmap(bitmap);
        this.k = bitmap2;
        a();
    }

    public void setImageDrawable(Drawable drawable) {
        if (PatchProxy.isSupport(new Object[]{drawable}, this, f70503b, false, 80193, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable}, this, f70503b, false, 80193, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        super.setImageDrawable(drawable);
        this.k = a(drawable);
        a();
    }

    public void setImageResource(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70503b, false, 80194, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70503b, false, 80194, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setImageResource(i2);
        this.k = a(getDrawable());
        a();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        ImageView.ScaleType scaleType2 = scaleType;
        if (PatchProxy.isSupport(new Object[]{scaleType2}, this, f70503b, false, 80187, new Class[]{ImageView.ScaleType.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{scaleType2}, this, f70503b, false, 80187, new Class[]{ImageView.ScaleType.class}, Void.TYPE);
        } else if (scaleType2 != f70502a) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[]{scaleType2}));
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f70505d = new RectF();
        this.f70506e = new RectF();
        this.f70507f = new Matrix();
        this.g = new Paint();
        this.h = new Paint();
        this.i = -16777216;
        this.j = 0;
        super.setScaleType(f70502a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CircleImageView, i2, 0);
        this.j = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.i = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        this.q = true;
        if (this.r) {
            a();
            this.r = false;
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f70503b, false, 80189, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f70503b, false, 80189, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        a();
    }
}
