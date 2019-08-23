package com.ss.android.ttve.nativePort;

import android.support.annotation.Keep;
import java.util.Map;

@Keep
public class TEEffectUtils {

    @Keep
    public interface ImageListener {
        void onData(int[] iArr, int i, int i2, int i3);
    }

    public static native String getEffectVersion();

    private static native int nativeGetQREncodedData(String str, int[] iArr, ImageListener imageListener);

    static {
        b.a();
    }

    public static int getQREncodedData(String str, Map<Integer, Integer> map, ImageListener imageListener) {
        int[] iArr;
        if (map != null) {
            iArr = new int[(map.size() * 2)];
            int i = 0;
            for (Map.Entry next : map.entrySet()) {
                iArr[i] = ((Integer) next.getKey()).intValue();
                iArr[i + 1] = ((Integer) next.getValue()).intValue();
                i += 2;
            }
        } else {
            iArr = null;
        }
        return nativeGetQREncodedData(str, iArr, imageListener);
    }
}
