package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.R$styleable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class RedEnvelopeProgressBar extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18322a;

    /* renamed from: b  reason: collision with root package name */
    private int f18323b;

    /* renamed from: c  reason: collision with root package name */
    private int f18324c;

    /* renamed from: d  reason: collision with root package name */
    private int f18325d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f18326e;

    /* renamed from: f  reason: collision with root package name */
    private RectF f18327f;

    public RedEnvelopeProgressBar(Context context) {
        this(context, null);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f18322a, false, 14639, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f18322a, false, 14639, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        canvas.drawArc(this.f18327f, -90.0f, (float) ((int) (((((float) this.f18324c) * 1.0f) / ((float) this.f18325d)) * 360.0f)), false, this.f18326e);
    }

    public void setProgress(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f18322a, false, 14637, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f18322a, false, 14637, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i < 0) {
            this.f18324c = 0;
        } else if (i > this.f18325d) {
            this.f18324c = this.f18325d;
        } else if (i == this.f18324c) {
            return;
        }
        this.f18324c = i;
        invalidate();
    }

    public RedEnvelopeProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RedEnvelopeProgressBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        int i4 = 100;
        this.f18325d = 100;
        int i5 = 16183767;
        if (attributeSet != null) {
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.RedEnvelopeProgressBar);
            if (obtainAttributes.hasValue(4)) {
                i2 = obtainAttributes.getDimensionPixelSize(4, 106);
            } else {
                i2 = 106;
            }
            if (obtainAttributes.hasValue(2)) {
                i3 = obtainAttributes.getDimensionPixelSize(2, 100);
            } else {
                i3 = 100;
            }
            if (obtainAttributes.hasValue(3)) {
                this.f18325d = obtainAttributes.getInt(3, 100);
            }
            if (obtainAttributes.hasValue(0)) {
                this.f18324c = obtainAttributes.getInt(0, 0);
            }
            i5 = obtainAttributes.hasValue(1) ? obtainAttributes.getColor(1, 16183767) : i5;
            obtainAttributes.recycle();
        } else {
            i2 = 106;
            i3 = 100;
        }
        if (i2 <= i3 || i2 <= 0 || i3 <= 0) {
            i2 = 106;
        } else {
            i4 = i3;
        }
        this.f18323b = i2 - i4;
        this.f18326e = new Paint();
        this.f18326e.setColor(i5);
        this.f18326e.setAntiAlias(true);
        this.f18326e.setStrokeWidth((float) this.f18323b);
        this.f18326e.setStyle(Paint.Style.STROKE);
        this.f18327f = new RectF();
        setProgress(this.f18324c);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f18322a, false, 14638, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f18322a, false, 14638, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 > i6) {
            i5 = i6;
        } else if (i5 < i6) {
            i6 = i5;
        }
        this.f18327f.set((float) (this.f18323b / 2), (float) (this.f18323b / 2), (float) (i5 - (this.f18323b / 2)), (float) (i6 - (this.f18323b / 2)));
    }
}
