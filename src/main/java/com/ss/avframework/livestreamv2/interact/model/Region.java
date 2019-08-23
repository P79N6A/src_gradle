package com.ss.avframework.livestreamv2.interact.model;

public class Region {
    private double mHeight;
    private int mInteractId;
    private int mMediaType;
    private boolean mNeedWriteToSei = true;
    private int mStatus;
    private boolean mTalking;
    private long mUserId;
    private double mWidth;
    private double mX;
    private double mY;

    public double getHeight() {
        return this.mHeight;
    }

    public int getInteractId() {
        return this.mInteractId;
    }

    public int getMediaType() {
        return this.mMediaType;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public long getUserId() {
        return this.mUserId;
    }

    public double getWidth() {
        return this.mWidth;
    }

    public double getX() {
        return this.mX;
    }

    public double getY() {
        return this.mY;
    }

    public boolean isTalking() {
        return this.mTalking;
    }

    public boolean needWriteToSei() {
        return this.mNeedWriteToSei;
    }

    public Region interactId(int i) {
        this.mInteractId = i;
        return this;
    }

    public Region mediaType(int i) {
        this.mMediaType = i;
        return this;
    }

    public Region status(int i) {
        this.mStatus = i;
        return this;
    }

    public Region talking(boolean z) {
        this.mTalking = z;
        return this;
    }

    public Region userId(long j) {
        this.mUserId = j;
        return this;
    }

    public Region writeToSei(boolean z) {
        this.mNeedWriteToSei = z;
        return this;
    }

    public Region position(double d2, double d3) {
        this.mX = d2;
        this.mY = d3;
        return this;
    }

    public Region size(double d2, double d3) {
        this.mWidth = d2;
        this.mHeight = d3;
        return this;
    }
}
