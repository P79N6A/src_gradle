package com.amap.api.maps2d.model;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class TextOptions implements Parcelable {
    public static final TextOptionsCreator CREATOR = new TextOptionsCreator();

    /* renamed from: a  reason: collision with root package name */
    private String f6399a;

    /* renamed from: b  reason: collision with root package name */
    private Typeface f6400b = Typeface.DEFAULT;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6401c = true;

    /* renamed from: d  reason: collision with root package name */
    private float f6402d;

    /* renamed from: e  reason: collision with root package name */
    private LatLng f6403e;

    /* renamed from: f  reason: collision with root package name */
    private float f6404f;
    private int g;
    private Object h;
    private int i = -16777216;
    private int j = 20;
    private int k = 3;
    private int l = 6;

    public int describeContents() {
        return 0;
    }

    public int getAlignX() {
        return this.k;
    }

    public int getAlignY() {
        return this.l;
    }

    public int getBackgroundColor() {
        return this.g;
    }

    public int getFontColor() {
        return this.i;
    }

    public int getFontSize() {
        return this.j;
    }

    public Object getObject() {
        return this.h;
    }

    public LatLng getPosition() {
        return this.f6403e;
    }

    public float getRotate() {
        return this.f6404f;
    }

    public String getText() {
        return this.f6399a;
    }

    public Typeface getTypeface() {
        return this.f6400b;
    }

    public float getZIndex() {
        return this.f6402d;
    }

    public boolean isVisible() {
        return this.f6401c;
    }

    public TextOptions backgroundColor(int i2) {
        this.g = i2;
        return this;
    }

    public TextOptions fontColor(int i2) {
        this.i = i2;
        return this;
    }

    public TextOptions fontSize(int i2) {
        this.j = i2;
        return this;
    }

    public TextOptions position(LatLng latLng) {
        this.f6403e = latLng;
        return this;
    }

    public TextOptions rotate(float f2) {
        this.f6404f = f2;
        return this;
    }

    public TextOptions setObject(Object obj) {
        this.h = obj;
        return this;
    }

    public TextOptions text(String str) {
        this.f6399a = str;
        return this;
    }

    public TextOptions typeface(Typeface typeface) {
        this.f6400b = typeface;
        return this;
    }

    public TextOptions visible(boolean z) {
        this.f6401c = z;
        return this;
    }

    public TextOptions zIndex(float f2) {
        this.f6402d = f2;
        return this;
    }

    public TextOptions align(int i2, int i3) {
        this.k = i2;
        this.l = i3;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = new Bundle();
        if (this.f6403e != null) {
            bundle.putDouble("lat", this.f6403e.latitude);
            bundle.putDouble("lng", this.f6403e.longitude);
        }
        parcel.writeBundle(bundle);
        parcel.writeString(this.f6399a);
        parcel.writeInt(this.f6400b.getStyle());
        parcel.writeFloat(this.f6404f);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.g);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeFloat(this.f6402d);
        parcel.writeByte(this.f6401c ? (byte) 1 : 0);
        if (this.h instanceof Parcelable) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("obj", (Parcelable) this.h);
            parcel.writeBundle(bundle2);
        }
    }
}
