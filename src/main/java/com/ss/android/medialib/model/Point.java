package com.ss.android.medialib.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class Point {
    public static ChangeQuickRedirect changeQuickRedirect;
    long left;
    long right;

    public long getLeft() {
        return this.left;
    }

    public long getRight() {
        return this.right;
    }

    public void setLeft(long j) {
        this.left = j;
    }

    public void setRight(long j) {
        this.right = j;
    }

    public Point(long j, long j2) {
        this.left = j;
        this.right = j2;
    }
}
