package com.ss.android.ttve.nativePort;

import android.support.annotation.Keep;
import com.ss.android.vesdk.aa;

@Keep
public class TEAudioUtilsCallback {
    private aa listener;

    public void onProgressChanged(double d2) {
    }

    public void setListener(Object obj) {
        this.listener = (aa) obj;
    }
}
