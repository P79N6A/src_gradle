package com.bytedance.android.livesdk.widget;

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
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class CircleImageView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18202a;

    /* renamed from: b  reason: collision with root package name */
    private static final ImageView.ScaleType f18203b = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: c  reason: collision with root package name */
    private static final Bitmap.Config f18204c = Bitmap.Config.ARGB_8888;

    /* renamed from: d  reason: collision with root package name */
    private Bitmap f18205d;

    /* renamed from: e  reason: collision with root package name */
    private BitmapShader f18206e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f18207f;
    private int g;
    private int h;
    private float i;
    private RectF j;
    private Matrix k;
    private boolean l;
    private boolean m;

    public ImageView.ScaleType getScaleType() {
        return f18203b;
    }

    private void a() {
        float f2;
        float f3;
        if (PatchProxy.isSupport(new Object[0], this, f18202a, false, 14334, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18202a, false, 14334, new Class[0], Void.TYPE);
        } else if (!this.l) {
            this.m = true;
        } else if (this.f18205d != null) {
            Bitmap bitmap = this.f18205d;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f18206e = new BitmapShader(bitmap, tileMode, tileMode);
            this.f18207f.setAntiAlias(true);
            this.f18207f.setShader(this.f18206e);
            this.g = this.f18205d.getWidth();
            this.h = this.f18205d.getHeight();
            float f4 = 0.0f;
            this.j.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.i = Math.min(this.j.width() / 2.0f, this.j.height() / 2.0f);
            this.k.set(null);
            if (((float) this.g) * this.j.height() > ((float) this.h) * this.j.width()) {
                f3 = this.j.height() / ((float) this.h);
                f2 = (this.j.width() - (((float) this.g) * f3)) * 0.5f;
            } else {
                f3 = this.j.width() / ((float) this.g);
                f4 = (this.j.height() - (((float) this.h) * f3)) * 0.5f;
                f2 = 0.0f;
            }
            this.k.setScale(f3, f3);
            this.k.postTranslate(((float) ((int) (f2 + 0.5f))) + this.j.left, ((float) ((int) (f4 + 0.5f))) + this.j.top);
            this.f18206e.setLocalMatrix(this.k);
            invalidate();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2}, this, f18202a, false, 14329, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2}, this, f18202a, false, 14329, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        super.setImageBitmap(bitmap);
        this.f18205d = bitmap2;
        a();
    }

    private Bitmap a(Drawable drawable) {
        Bitmap bitmap;
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f18202a, false, 14333, new Class[]{Drawable.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{drawable2}, this, f18202a, false, 14333, new Class[]{Drawable.class}, Bitmap.class);
        } else if (drawable2 == null) {
            return null;
        } else {
            if (drawable2 instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable2).getBitmap();
            }
            try {
                if (drawable2 instanceof ColorDrawable) {
                    bitmap = Bitmap.createBitmap(2, 2, f18204c);
                } else {
                    bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f18204c);
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
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f18202a, false, 14327, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f18202a, false, 14327, new Class[]{Canvas.class}, Void.TYPE);
        } else if (getDrawable() != null) {
            canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), this.i, this.f18207f);
        }
    }

    public void setImageDrawable(@Nullable Drawable drawable) {
        if (PatchProxy.isSupport(new Object[]{drawable}, this, f18202a, false, 14330, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable}, this, f18202a, false, 14330, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        super.setImageDrawable(drawable);
        this.f18205d = a(drawable);
        a();
    }

    public void setImageResource(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18202a, false, 14331, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18202a, false, 14331, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setImageResource(i2);
        this.f18205d = a(getDrawable());
        a();
    }

    public void setImageURI(@Nullable Uri uri) {
        if (PatchProxy.isSupport(new Object[]{uri}, this, f18202a, false, 14332, new Class[]{Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uri}, this, f18202a, false, 14332, new Class[]{Uri.class}, Void.TYPE);
            return;
        }
        super.setImageURI(uri);
        this.f18205d = a(getDrawable());
        a();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        ImageView.ScaleType scaleType2 = scaleType;
        if (PatchProxy.isSupport(new Object[]{scaleType2}, this, f18202a, false, 14328, new Class[]{ImageView.ScaleType.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{scaleType2}, this, f18202a, false, 14328, new Class[]{ImageView.ScaleType.class}, Void.TYPE);
        } else if (scaleType2 != f18203b) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[]{scaleType2}));
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f18202a, false, 14326, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f18202a, false, 14326, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        a();
    }
}
