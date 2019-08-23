package com.ss.android.medialib.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class FaceDetectInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    FaceDetect[] info;

    public FaceDetect[] getInfo() {
        return this.info;
    }

    public void setInfo(FaceDetect[] faceDetectArr) {
        this.info = faceDetectArr;
    }
}
