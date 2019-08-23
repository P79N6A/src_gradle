package com.ss.android.medialib.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class EnigmaResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    Enigma[] result;
    public float zoomFactor;

    public Enigma[] getResult() {
        return this.result;
    }

    public void setResult(Enigma[] enigmaArr) {
        this.result = enigmaArr;
    }
}
