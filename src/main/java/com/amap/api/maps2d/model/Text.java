package com.amap.api.maps2d.model;

import android.graphics.Typeface;
import com.amap.api.a.j;
import com.amap.api.mapcore2d.aj;

public final class Text {

    /* renamed from: a  reason: collision with root package name */
    private j f6398a;

    public final int getAlignX() {
        return this.f6398a.getAlignX();
    }

    public final int getAlignY() {
        return this.f6398a.getAlignY();
    }

    public final int getBackgroundColor() {
        return this.f6398a.getBackgroundColor();
    }

    public final int getFontColor() {
        return this.f6398a.getFonrColor();
    }

    public final int getFontSize() {
        return this.f6398a.getFontSize();
    }

    public final Object getObject() {
        return this.f6398a.getObject();
    }

    public final LatLng getPosition() {
        return this.f6398a.getPosition();
    }

    public final float getRotate() {
        return this.f6398a.getRotate();
    }

    public final String getText() {
        return this.f6398a.getText();
    }

    public final Typeface getTypeface() {
        return this.f6398a.getTypeface();
    }

    public final float getZIndex() {
        return this.f6398a.getZIndex();
    }

    public final boolean isVisible() {
        return this.f6398a.isVisible();
    }

    public final void remove() {
        this.f6398a.remove();
    }

    public Text(aj ajVar) {
        this.f6398a = ajVar;
    }

    public final void setBackgroundColor(int i) {
        this.f6398a.setBackgroundColor(i);
    }

    public final void setFontColor(int i) {
        this.f6398a.setFontColor(i);
    }

    public final void setFontSize(int i) {
        this.f6398a.setFontSize(i);
    }

    public final void setObject(Object obj) {
        this.f6398a.setObject(obj);
    }

    public final void setPosition(LatLng latLng) {
        this.f6398a.setPosition(latLng);
    }

    public final void setRotate(float f2) {
        this.f6398a.setRotate(f2);
    }

    public final void setText(String str) {
        this.f6398a.setText(str);
    }

    public final void setTypeface(Typeface typeface) {
        this.f6398a.setTypeface(typeface);
    }

    public final void setVisible(boolean z) {
        this.f6398a.setVisible(z);
    }

    public final void setZIndex(float f2) {
        this.f6398a.setZIndex(f2);
    }

    public final void setAlign(int i, int i2) {
        this.f6398a.setAlign(i, i2);
    }
}
