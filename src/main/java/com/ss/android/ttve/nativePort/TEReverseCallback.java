package com.ss.android.ttve.nativePort;

import android.support.annotation.Keep;
import com.ss.android.vesdk.VEListener;

@Keep
public class TEReverseCallback {
    private VEListener.h listener;

    public void onProgressChanged(double d2) {
    }

    public void setListener(Object obj) {
        this.listener = (VEListener.h) obj;
    }
}
