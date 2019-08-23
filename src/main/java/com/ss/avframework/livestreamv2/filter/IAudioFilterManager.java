package com.ss.avframework.livestreamv2.filter;

public abstract class IAudioFilterManager extends AudioEffectProcessor {
    protected boolean mEnable;

    public abstract String name();

    public boolean isEnable() {
        return this.mEnable;
    }

    public void setEnable(boolean z) {
        this.mEnable = z;
    }
}
