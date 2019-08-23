package com.facebook.react.views.art;

import com.facebook.react.bridge.ReadableArray;
import javax.annotation.Nullable;

public class PropHelper {
    PropHelper() {
    }

    @Nullable
    static float[] toFloatArray(@Nullable ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        float[] fArr = new float[readableArray.size()];
        toFloatArray(readableArray, fArr);
        return fArr;
    }

    static int toFloatArray(ReadableArray readableArray, float[] fArr) {
        int i;
        if (readableArray.size() > fArr.length) {
            i = fArr.length;
        } else {
            i = readableArray.size();
        }
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = (float) readableArray.getDouble(i2);
        }
        return readableArray.size();
    }
}
