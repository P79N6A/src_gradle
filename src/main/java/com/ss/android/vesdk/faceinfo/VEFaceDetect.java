package com.ss.android.vesdk.faceinfo;

import android.graphics.PointF;
import android.graphics.Rect;
import android.support.annotation.Keep;

@Keep
public class VEFaceDetect {
    private PointF[] points;
    private Rect rect;

    public PointF[] getPoints() {
        return this.points;
    }

    public Rect getRect() {
        return this.rect;
    }

    public void setPoints(PointF[] pointFArr) {
        this.points = pointFArr;
    }

    public void setRect(Rect rect2) {
        this.rect = rect2;
    }
}
