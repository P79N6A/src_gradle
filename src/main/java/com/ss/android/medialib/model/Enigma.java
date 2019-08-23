package com.ss.android.medialib.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class Enigma {
    public static ChangeQuickRedirect changeQuickRedirect;
    TdPoint[] points;
    String text;
    int type;

    public TdPoint[] getPoints() {
        return this.points;
    }

    public String getText() {
        return this.text;
    }

    public int getType() {
        return this.type;
    }

    public void setPoints(TdPoint[] tdPointArr) {
        this.points = tdPointArr;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
