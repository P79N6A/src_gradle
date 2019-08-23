package com.ss.android.medialib.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class TdPoint {
    public static ChangeQuickRedirect changeQuickRedirect;
    float x;
    float y;

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setX(float f2) {
        this.x = f2;
    }

    public void setY(float f2) {
        this.y = f2;
    }
}
