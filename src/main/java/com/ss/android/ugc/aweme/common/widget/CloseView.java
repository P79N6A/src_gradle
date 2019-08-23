package com.ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.R$styleable;
import com.ss.android.ugc.aweme.base.utils.u;

public class CloseView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40321a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f40322b;

    /* renamed from: c  reason: collision with root package name */
    private Path f40323c;

    /* renamed from: d  reason: collision with root package name */
    private int f40324d;

    /* renamed from: e  reason: collision with root package name */
    private int f40325e;

    /* renamed from: f  reason: collision with root package name */
    private int f40326f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    public CloseView(Context context) {
        this(context, null);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f40321a, false, 33576, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f40321a, false, 33576, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        this.f40323c.reset();
        if (this.f40326f == 0 || this.g == 0) {
            this.f40326f = getWidth();
            this.g = getHeight();
        }
        this.h = getPaddingLeft();
        this.i = getPaddingRight();
        this.j = getPaddingTop();
        this.k = getPaddingBottom();
        this.f40323c.moveTo((float) this.h, (float) this.j);
        this.f40323c.lineTo((float) (this.f40326f - this.i), (float) (this.g - this.k));
        this.f40323c.moveTo((float) this.h, (float) (this.g - this.k));
        this.f40323c.lineTo((float) (this.f40326f - this.i), (float) this.j);
        canvas.save();
        canvas.drawPath(this.f40323c, this.f40322b);
        canvas.restore();
    }

    public CloseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CloseView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (PatchProxy.isSupport(new Object[]{attributeSet}, this, f40321a, false, 33573, new Class[]{AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet}, this, f40321a, false, 33573, new Class[]{AttributeSet.class}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CloseView);
        this.f40324d = obtainStyledAttributes.getColor(0, -16777216);
        this.f40325e = obtainStyledAttributes.getDimensionPixelSize(1, u.a(1.0d));
        obtainStyledAttributes.recycle();
        if (PatchProxy.isSupport(new Object[0], this, f40321a, false, 33574, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40321a, false, 33574, new Class[0], Void.TYPE);
        } else {
            this.f40322b = new Paint();
            this.f40322b.setColor(this.f40324d);
            this.f40322b.setStrokeWidth((float) this.f40325e);
            this.f40322b.setAntiAlias(true);
            this.f40322b.setStyle(Paint.Style.STROKE);
            this.f40322b.setStrokeJoin(Paint.Join.ROUND);
            this.f40322b.setStrokeCap(Paint.Cap.ROUND);
        }
        if (PatchProxy.isSupport(new Object[0], this, f40321a, false, 33575, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40321a, false, 33575, new Class[0], Void.TYPE);
            return;
        }
        this.f40323c = new Path();
    }
}
