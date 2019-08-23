package com.ss.android.excitingvideo.model;

public class ExcitingAdEventModel {
    private long mAdId;
    private String mAdUnitId;
    private String mLabel;
    private String mLogExtra;
    private String mRefer;
    private String mTag;

    public static class Builder {
        public long mAdId;
        public String mAdUnitId;
        public String mLabel;
        public String mLogExtra;
        public String mRefer;
        public String mTag;

        public ExcitingAdEventModel build() {
            return new ExcitingAdEventModel(this);
        }

        public Builder setAdId(long j) {
            this.mAdId = j;
            return this;
        }

        public Builder setAdUnitId(String str) {
            this.mAdUnitId = str;
            return this;
        }

        public Builder setLabel(String str) {
            this.mLabel = str;
            return this;
        }

        public Builder setLogExtra(String str) {
            this.mLogExtra = str;
            return this;
        }

        public Builder setRefer(String str) {
            this.mRefer = str;
            return this;
        }

        public Builder setTag(String str) {
            this.mTag = str;
            return this;
        }
    }

    public long getAdId() {
        return this.mAdId;
    }

    public String getAdUnitId() {
        return this.mAdUnitId;
    }

    public String getLabel() {
        return this.mLabel;
    }

    public String getLogExtra() {
        return this.mLogExtra;
    }

    public String getRefer() {
        return this.mRefer;
    }

    public String getTag() {
        return this.mTag;
    }

    public ExcitingAdEventModel(Builder builder) {
        this.mTag = builder.mTag;
        this.mLabel = builder.mLabel;
        this.mAdId = builder.mAdId;
        this.mLogExtra = builder.mLogExtra;
        this.mAdUnitId = builder.mAdUnitId;
        this.mRefer = builder.mRefer;
    }
}
