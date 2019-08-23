package com.ss.avframework.livestreamv2.effectcamera.model;

public class BeautyBean {
    private String mResPath;
    private float mSharpIntensity;
    private float mSmoothIntensity;
    private float mWhiteIntensity;

    public String getResPath() {
        return this.mResPath;
    }

    public float getSharpIntensity() {
        return this.mSharpIntensity;
    }

    public float getSmoothIntensity() {
        return this.mSmoothIntensity;
    }

    public float getWhiteIntensity() {
        return this.mWhiteIntensity;
    }

    public BeautyBean() {
        this("", 0.0f, 0.0f, 0.0f);
    }

    public void setResPath(String str) {
        this.mResPath = str;
    }

    public void setSharpIntensity(float f2) {
        this.mSharpIntensity = f2;
    }

    public void setSmoothIntensity(float f2) {
        this.mSmoothIntensity = f2;
    }

    public void setWhiteIntensity(float f2) {
        this.mWhiteIntensity = f2;
    }

    public BeautyBean(String str, float f2, float f3, float f4) {
        this.mResPath = str;
        this.mSmoothIntensity = f2;
        this.mWhiteIntensity = f3;
        this.mSharpIntensity = f4;
    }
}
