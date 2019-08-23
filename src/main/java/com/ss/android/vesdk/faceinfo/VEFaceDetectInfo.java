package com.ss.android.vesdk.faceinfo;

import android.support.annotation.Keep;

@Keep
public class VEFaceDetectInfo {
    private VEFaceDetect[] info;

    public VEFaceDetect[] getInfo() {
        return this.info;
    }

    public void setInfo(VEFaceDetect[] vEFaceDetectArr) {
        this.info = vEFaceDetectArr;
    }
}
