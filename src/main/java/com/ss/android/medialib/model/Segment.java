package com.ss.android.medialib.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

@Keep
public class Segment {
    public static ChangeQuickRedirect changeQuickRedirect;
    String path;
    List<Point> points;
    int rotateAngle;
    float speed;

    public Segment() {
    }

    public String getPath() {
        return this.path;
    }

    public List<Point> getPoints() {
        return this.points;
    }

    public int getRotateAngle() {
        return this.rotateAngle;
    }

    public float getSpeed() {
        return this.speed;
    }

    public Point[] getPointsArray() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17471, new Class[0], Point[].class)) {
            return (Point[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17471, new Class[0], Point[].class);
        } else if (this.points == null || this.points.isEmpty()) {
            return null;
        } else {
            Point[] pointArr = new Point[this.points.size()];
            this.points.toArray(pointArr);
            return pointArr;
        }
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPoints(List<Point> list) {
        this.points = list;
    }

    public void setRotateAngle(int i) {
        this.rotateAngle = i;
    }

    public void setSpeed(float f2) {
        this.speed = f2;
    }

    public Segment(String str, float f2, List<Point> list, int i) {
        this.path = str;
        this.speed = f2;
        this.points = list;
        this.rotateAngle = i;
    }
}
