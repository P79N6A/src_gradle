package com.ss.avframework.livestreamv2.effectcamera.model;

public class FilterBean {
    private float mIntensity;
    private String mLeftResPath;
    private float mPosition;
    private String mRightResPath;

    public float getIntensity() {
        return this.mIntensity;
    }

    public String getLeftResPath() {
        return this.mLeftResPath;
    }

    public float getPosition() {
        return this.mPosition;
    }

    public String getRightResPath() {
        return this.mRightResPath;
    }

    public FilterBean() {
        this("", 0.0f);
    }

    public void setIntensity(float f2) {
        this.mIntensity = f2;
    }

    public void setLeftResPath(String str) {
        this.mLeftResPath = str;
    }

    public void setPosition(float f2) {
        this.mPosition = f2;
    }

    public void setRightResPath(String str) {
        this.mRightResPath = str;
    }

    public FilterBean(String str, float f2) {
        this(str, str, 0.0f, f2);
    }

    public FilterBean(String str, String str2, float f2, float f3) {
        this.mIntensity = f3;
        this.mLeftResPath = str;
        this.mRightResPath = str2;
        this.mPosition = f2;
    }
}
