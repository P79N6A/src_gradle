package com.mapbox.mapboxsdk.annotations;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.mapbox.mapboxsdk.R$styleable;

public class BubbleLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    b f26412a;

    /* renamed from: b  reason: collision with root package name */
    float f26413b;

    /* renamed from: c  reason: collision with root package name */
    float f26414c;

    /* renamed from: d  reason: collision with root package name */
    float f26415d;

    /* renamed from: e  reason: collision with root package name */
    float f26416e;

    /* renamed from: f  reason: collision with root package name */
    private float f26417f;
    private d g;
    private int h;
    private int i;

    public b getArrowDirection() {
        return this.f26412a;
    }

    public float getArrowHeight() {
        return this.f26414c;
    }

    public float getArrowPosition() {
        return this.f26415d;
    }

    public float getArrowWidth() {
        return this.f26413b;
    }

    public int getBubbleColor() {
        return this.h;
    }

    public float getCornersRadius() {
        return this.f26417f;
    }

    public int getStrokeColor() {
        return this.i;
    }

    public float getStrokeWidth() {
        return this.f26416e;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        switch (this.f26412a.f26424a) {
            case 0:
                paddingLeft = (int) (((float) paddingLeft) + this.f26413b);
                break;
            case 1:
                paddingRight = (int) (((float) paddingRight) + this.f26413b);
                break;
            case 2:
                paddingTop = (int) (((float) paddingTop) + this.f26414c);
                break;
            case 3:
                paddingBottom = (int) (((float) paddingBottom) + this.f26414c);
                break;
        }
        if (this.f26416e > 0.0f) {
            paddingLeft = (int) (((float) paddingLeft) + this.f26416e);
            paddingRight = (int) (((float) paddingRight) + this.f26416e);
            paddingTop = (int) (((float) paddingTop) + this.f26416e);
            paddingBottom = (int) (((float) paddingBottom) + this.f26416e);
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public BubbleLayout(Context context) {
        this(context, null, 0);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.g != null) {
            this.g.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public BubbleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static float a(float f2, Context context) {
        return f2 * ((float) (context.getResources().getDisplayMetrics().densityDpi / 160));
    }

    public BubbleLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.mapbox_BubbleLayout);
        this.f26412a = new b(obtainStyledAttributes.getInt(0, 0));
        this.f26413b = obtainStyledAttributes.getDimension(3, a(8.0f, context));
        this.f26414c = obtainStyledAttributes.getDimension(1, a(8.0f, context));
        this.f26415d = obtainStyledAttributes.getDimension(2, a(12.0f, context));
        this.f26417f = obtainStyledAttributes.getDimension(5, 0.0f);
        this.h = obtainStyledAttributes.getColor(4, -1);
        this.f26416e = obtainStyledAttributes.getDimension(7, -1.0f);
        this.i = obtainStyledAttributes.getColor(6, -7829368);
        obtainStyledAttributes.recycle();
        a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int width = getWidth();
        int height = getHeight();
        if (width >= 0 && height >= 0) {
            d dVar = new d(new RectF(0.0f, 0.0f, (float) width, (float) height), this.f26412a, this.f26413b, this.f26414c, this.f26415d, this.f26417f, this.h, this.f26416e, this.i);
            this.g = dVar;
        }
    }
}
