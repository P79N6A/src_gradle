package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.R$styleable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class VHeadView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18358a;

    /* renamed from: b  reason: collision with root package name */
    private int f18359b;

    /* renamed from: c  reason: collision with root package name */
    private int f18360c;

    /* renamed from: d  reason: collision with root package name */
    private Bitmap f18361d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f18362e = Boolean.FALSE;

    /* renamed from: f  reason: collision with root package name */
    private int f18363f;
    private Bitmap g;
    private boolean h = false;
    private Paint i = new Paint();

    public VHeadView(Context context) {
        super(context);
        a(context, null);
    }

    public void setAuthor(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f18358a, false, 14763, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f18358a, false, 14763, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.h != z) {
            this.h = z;
            invalidate();
        }
    }

    public void setVAble(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f18358a, false, 14762, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f18358a, false, 14762, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f18362e.booleanValue() != z) {
            this.f18362e = Boolean.valueOf(z);
            invalidate();
        }
    }

    public void setVResId(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18358a, false, 14761, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18358a, false, 14761, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f18360c != i2) {
            this.f18360c = i2;
            this.f18361d = null;
            invalidate();
        }
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f18358a, false, 14764, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f18358a, false, 14764, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.f18362e.booleanValue() || this.h) {
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(width, height);
            if (this.f18362e.booleanValue()) {
                if (this.f18361d == null) {
                    Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), this.f18360c);
                    if (decodeResource != null) {
                        this.f18361d = decodeResource;
                    }
                }
                if (this.f18361d != null) {
                    int width2 = (min - this.f18361d.getWidth()) - this.f18359b;
                    int height2 = min - this.f18361d.getHeight();
                    if (width > height) {
                        width2 += (width - height) / 2;
                    } else {
                        height2 += (height - width) / 2;
                    }
                    canvas.drawBitmap(this.f18361d, (float) width2, (float) height2, this.i);
                }
            }
            if (this.h) {
                if (this.g == null) {
                    Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), this.f18363f);
                    if (decodeResource2 != null) {
                        this.g = decodeResource2;
                    }
                }
                if (this.g != null) {
                    Bitmap bitmap = this.g;
                    canvas.drawBitmap(bitmap, (float) ((min - bitmap.getWidth()) / 2), (float) (min - this.g.getHeight()), this.i);
                }
            }
        }
    }

    public VHeadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (PatchProxy.isSupport(new Object[]{context, attributeSet}, this, f18358a, false, 14759, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet}, this, f18358a, false, 14759, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.VHeadView);
        this.f18360c = obtainStyledAttributes.getResourceId(2, 2130841464);
        this.f18362e = Boolean.valueOf(obtainStyledAttributes.getBoolean(1, false));
        this.f18363f = obtainStyledAttributes.getResourceId(0, 2130840615);
        obtainStyledAttributes.recycle();
    }

    public VHeadView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context, attributeSet);
    }
}
