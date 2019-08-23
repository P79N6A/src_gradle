package com.amap.api.mapcore2d;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.TextOptions;

public class bp implements aj {

    /* renamed from: a  reason: collision with root package name */
    private b f5769a;

    /* renamed from: b  reason: collision with root package name */
    private at f5770b;

    /* renamed from: c  reason: collision with root package name */
    private String f5771c;

    /* renamed from: d  reason: collision with root package name */
    private int f5772d;

    /* renamed from: e  reason: collision with root package name */
    private int f5773e;

    /* renamed from: f  reason: collision with root package name */
    private LatLng f5774f;
    private float g;
    private int h;
    private Typeface i;
    private boolean j;
    private float k;
    private int l;
    private int m;
    private Object n;
    private int o;

    public int getAddIndex() {
        return this.o;
    }

    public int getAlignX() {
        return this.l;
    }

    public int getAlignY() {
        return this.m;
    }

    public int getBackgroundColor() {
        return this.h;
    }

    public int getFonrColor() {
        return this.f5773e;
    }

    public int getFontSize() {
        return this.f5772d;
    }

    public Object getObject() {
        return this.n;
    }

    public LatLng getPosition() {
        return this.f5774f;
    }

    public float getRotate() {
        return this.g;
    }

    public String getText() {
        return this.f5771c;
    }

    public Typeface getTypeface() {
        return this.i;
    }

    public float getZIndex() {
        return this.k;
    }

    public boolean isVisible() {
        return this.j;
    }

    public void remove() {
        if (this.f5770b != null) {
            this.f5770b.b((aj) this);
        }
    }

    public void setAddIndex(int i2) {
        this.o = i2;
    }

    public void setObject(Object obj) {
        this.n = obj;
    }

    public void setBackgroundColor(int i2) {
        this.h = i2;
        this.f5769a.postInvalidate();
    }

    public void setFontColor(int i2) {
        this.f5773e = i2;
        this.f5769a.postInvalidate();
    }

    public void setFontSize(int i2) {
        this.f5772d = i2;
        this.f5769a.postInvalidate();
    }

    public void setPosition(LatLng latLng) {
        this.f5774f = latLng;
        this.f5769a.postInvalidate();
    }

    public void setRotate(float f2) {
        this.g = f2;
        this.f5769a.postInvalidate();
    }

    public void setText(String str) {
        this.f5771c = str;
        this.f5769a.postInvalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.i = typeface;
        this.f5769a.postInvalidate();
    }

    public void setVisible(boolean z) {
        this.j = z;
        this.f5769a.postInvalidate();
    }

    public void setZIndex(float f2) {
        this.k = f2;
        this.f5770b.d();
    }

    public void draw(Canvas canvas) {
        int i2;
        if (!TextUtils.isEmpty(this.f5771c) && this.f5774f != null) {
            TextPaint textPaint = new TextPaint();
            if (this.i == null) {
                this.i = Typeface.DEFAULT;
            }
            textPaint.setTypeface(this.i);
            textPaint.setAntiAlias(true);
            textPaint.setTextSize((float) this.f5772d);
            float measureText = textPaint.measureText(this.f5771c);
            float f2 = (float) this.f5772d;
            textPaint.setColor(this.h);
            w wVar = new w((int) (this.f5774f.latitude * 1000000.0d), (int) (this.f5774f.longitude * 1000000.0d));
            Point point = new Point();
            this.f5769a.d().a(wVar, point);
            canvas.save();
            canvas.rotate(-(this.g % 360.0f), (float) point.x, (float) point.y);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            if (this.l <= 0 || this.l > 3) {
                this.l = 3;
            }
            if (this.m < 4 || this.m > 6) {
                this.m = 6;
            }
            int i3 = 0;
            switch (this.l) {
                case 1:
                    i2 = point.x;
                    break;
                case 2:
                    i2 = (int) (((float) point.x) - measureText);
                    break;
                case 3:
                    i2 = (int) (((float) point.x) - (measureText / 2.0f));
                    break;
                default:
                    i2 = 0;
                    break;
            }
            switch (this.m) {
                case 4:
                    i3 = point.y;
                    break;
                case 5:
                    i3 = (int) (((float) point.y) - f2);
                    break;
                case 6:
                    i3 = (int) (((float) point.y) - (f2 / 2.0f));
                    break;
            }
            float f3 = (float) i2;
            float f4 = f3 + measureText + 2.0f;
            float f5 = ((float) i3) + f2 + 2.0f;
            canvas.drawRect((float) (i2 - 1), (float) (i3 - 1), f4, f5, textPaint);
            textPaint.setColor(this.f5773e);
            canvas.drawText(this.f5771c, f3, f5 - fontMetrics.bottom, textPaint);
            canvas.restore();
        }
    }

    public void setAlign(int i2, int i3) {
        this.l = i2;
        this.m = i3;
        this.f5769a.postInvalidate();
    }

    public bp(y yVar, TextOptions textOptions, at atVar) {
        this.f5770b = atVar;
        this.f5771c = textOptions.getText();
        this.f5772d = textOptions.getFontSize();
        this.f5773e = textOptions.getFontColor();
        this.f5774f = textOptions.getPosition();
        this.g = textOptions.getRotate();
        this.h = textOptions.getBackgroundColor();
        this.i = textOptions.getTypeface();
        this.j = textOptions.isVisible();
        this.k = textOptions.getZIndex();
        this.l = textOptions.getAlignX();
        this.m = textOptions.getAlignY();
        this.n = textOptions.getObject();
        this.f5769a = (b) yVar;
    }
}
