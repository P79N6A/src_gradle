package com.ss.android.medialib.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class FaceAttributeInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    FaceAttribute[] info;

    public FaceAttribute[] getInfo() {
        return this.info;
    }

    public void setInfo(FaceAttribute[] faceAttributeArr) {
        this.info = faceAttributeArr;
    }
}
