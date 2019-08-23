package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class EffectLocation {
    public static ChangeQuickRedirect changeQuickRedirect;
    private float h;
    private float r;
    private float w;
    private float x;
    private float y;

    public float getH() {
        return this.h;
    }

    public float getR() {
        return this.r;
    }

    public float getW() {
        return this.w;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setH(float f2) {
        this.h = f2;
    }

    public void setR(float f2) {
        this.r = f2;
    }

    public void setW(float f2) {
        this.w = f2;
    }

    public void setX(float f2) {
        this.x = f2;
    }

    public void setY(float f2) {
        this.y = f2;
    }
}
