package com.ss.android.ttve.model;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;

@Keep
public class VEMusicWaveBean {
    private float[] waveBean;

    @NonNull
    public float[] getWaveBean() {
        return this.waveBean;
    }

    public void setWaveBean(@NonNull float[] fArr) {
        this.waveBean = fArr;
    }
}
