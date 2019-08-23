package com.ss.android.ugc.aweme.sticker.data;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class NormalTrackTimeStamp extends BaseTrackTimeStamp {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("h")
    private float height;
    @SerializedName("r")
    private float rotation;
    private Float scale;
    @SerializedName("s")
    private Float scaleForIos;
    @SerializedName("w")
    private float width;
    private float x;
    private float y;

    public NormalTrackTimeStamp() {
    }

    public float getHeight() {
        return this.height;
    }

    public float getRotation() {
        return this.rotation;
    }

    public Float getScaleForIos() {
        return this.scaleForIos;
    }

    public float getWidth() {
        return this.width;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public Float getScale() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81965, new Class[0], Float.class)) {
            return (Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81965, new Class[0], Float.class);
        } else if (this.scale != null) {
            return this.scale;
        } else {
            if (this.scaleForIos != null) {
                return this.scaleForIos;
            }
            return Float.valueOf(1.0f);
        }
    }

    public void setHeight(float f2) {
        this.height = f2;
    }

    public void setRotation(float f2) {
        this.rotation = f2;
    }

    public void setScale(Float f2) {
        this.scaleForIos = f2;
    }

    public void setScaleForIos(Float f2) {
        this.scaleForIos = f2;
    }

    public void setWidth(float f2) {
        this.width = f2;
    }

    public void setX(float f2) {
        this.x = f2;
    }

    public void setY(float f2) {
        this.y = f2;
    }

    public NormalTrackTimeStamp(int i) {
        super(i);
    }
}
