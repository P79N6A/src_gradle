package com.ss.avframework.livestreamv2.effectcamera.model;

public class ReshapeFaceBean {
    private float mCheekIntensity;
    private float mEyeIntensity;
    private String mResPath;

    public float getCheekIntensity() {
        return this.mCheekIntensity;
    }

    public float getEyeIntensity() {
        return this.mEyeIntensity;
    }

    public String getResPath() {
        return this.mResPath;
    }

    public ReshapeFaceBean() {
        this("", 0.0f, 0.0f);
    }

    public void setCheekIntensity(float f2) {
        this.mCheekIntensity = f2;
    }

    public void setEyeIntensity(float f2) {
        this.mEyeIntensity = f2;
    }

    public void setResPath(String str) {
        this.mResPath = str;
    }

    public ReshapeFaceBean(String str, float f2, float f3) {
        this.mResPath = str;
        this.mEyeIntensity = f2;
        this.mCheekIntensity = f3;
    }
}
