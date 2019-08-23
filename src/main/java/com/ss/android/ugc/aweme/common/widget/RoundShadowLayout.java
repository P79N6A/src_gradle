package com.ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.R$styleable;

public class RoundShadowLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40474a;

    /* renamed from: b  reason: collision with root package name */
    private float[] f40475b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f40476c;

    /* renamed from: d  reason: collision with root package name */
    private RectF f40477d;

    /* renamed from: e  reason: collision with root package name */
    private Path f40478e;

    /* renamed from: f  reason: collision with root package name */
    private float f40479f;
    private int g;
    private float h;
    private float i;

    public float getShadowDx() {
        return this.h;
    }

    public float getShadowDy() {
        return this.i;
    }

    public float getShadowRadius() {
        return this.f40479f;
    }

    public RoundShadowLayout(@NonNull Context context) {
        this(context, null);
    }

    public RoundShadowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundShadowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        float f2;
        float f3;
        float f4;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f40474a, false, 33768, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f40474a, false, 33768, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        float f5 = 0.0f;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, R$styleable.RoundShadowLayout);
            float dimension = obtainStyledAttributes.getDimension(2, 0.0f);
            f4 = obtainStyledAttributes.getDimension(7, dimension);
            f3 = obtainStyledAttributes.getDimension(8, dimension);
            f2 = obtainStyledAttributes.getDimension(0, dimension);
            float dimension2 = obtainStyledAttributes.getDimension(1, dimension);
            this.f40479f = (float) obtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.g = obtainStyledAttributes.getColor(3, -2005568139);
            this.h = obtainStyledAttributes.getDimension(5, 0.0f);
            this.i = obtainStyledAttributes.getDimension(6, 0.0f);
            obtainStyledAttributes.recycle();
            f5 = dimension2;
        } else {
            f4 = 0.0f;
            f3 = 0.0f;
            f2 = 0.0f;
        }
        this.f40475b = new float[8];
        this.f40475b[0] = f4;
        this.f40475b[1] = f4;
        this.f40475b[2] = f3;
        this.f40475b[3] = f3;
        this.f40475b[4] = f5;
        this.f40475b[5] = f5;
        this.f40475b[6] = f2;
        this.f40475b[7] = f2;
        this.f40477d = new RectF();
        this.f40478e = new Path();
        this.f40476c = new Paint();
        int abs = (int) (this.f40479f + Math.abs(this.h));
        int abs2 = (int) (this.f40479f + Math.abs(this.i));
        setPadding(abs, abs2, abs, abs2);
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        Bitmap bitmap;
        int i6 = i2;
        int i7 = i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f40474a, false, 33769, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f40474a, false, 33769, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        if (i6 > 0 && i7 > 0 && this.f40479f > 0.0f) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40474a, false, 33770, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40474a, false, 33770, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            float f2 = this.f40479f;
            float f3 = this.h;
            float f4 = this.i;
            int i8 = this.g;
            int i9 = i8;
            float f5 = f4;
            float f6 = f3;
            float f7 = f2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i8)}, this, f40474a, false, 33771, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Integer.TYPE}, Bitmap.class)) {
                bitmap = (Bitmap) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f7), Float.valueOf(f6), Float.valueOf(f5), Integer.valueOf(i9)}, this, f40474a, false, 33771, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Integer.TYPE}, Bitmap.class);
            } else {
                bitmap = Bitmap.createBitmap(i6, i7, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                float f8 = f7;
                this.f40477d.set(f8, f8, ((float) i6) - f8, ((float) i7) - f8);
                float f9 = f5;
                if (f9 > 0.0f) {
                    this.f40477d.top += f9;
                    this.f40477d.bottom -= f9;
                } else if (f9 < 0.0f) {
                    this.f40477d.top += Math.abs(f9);
                    this.f40477d.bottom -= Math.abs(f9);
                }
                float f10 = f6;
                if (f10 > 0.0f) {
                    this.f40477d.left += f10;
                    this.f40477d.right -= f10;
                } else if (f10 < 0.0f) {
                    this.f40477d.left += Math.abs(f10);
                    this.f40477d.right -= Math.abs(f10);
                }
                this.f40476c.setAntiAlias(true);
                this.f40476c.setStyle(Paint.Style.FILL);
                int i10 = i9;
                this.f40476c.setColor(i10);
                if (!isInEditMode()) {
                    this.f40476c.setShadowLayer(f8, f10, f9, i10);
                }
                this.f40478e.reset();
                this.f40478e.addRoundRect(this.f40477d, this.f40475b, Path.Direction.CW);
                canvas.drawPath(this.f40478e, this.f40476c);
            }
            setBackground(new BitmapDrawable(getResources(), bitmap));
        }
    }
}
