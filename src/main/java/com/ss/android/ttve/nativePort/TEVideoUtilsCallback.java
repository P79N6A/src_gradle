package com.ss.android.ttve.nativePort;

import android.support.annotation.Keep;
import com.ss.android.vesdk.t;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@Keep
public class TEVideoUtilsCallback {
    private t listener;

    public void setListener(Object obj) {
        this.listener = (t) obj;
    }

    public static ByteBuffer allocateFrame(int i, int i2) {
        return ByteBuffer.allocateDirect(i * i2 * 4).order(ByteOrder.LITTLE_ENDIAN);
    }

    public boolean onFrameAvailable(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (this.listener == null || !this.listener.a(byteBuffer, i, i2, i3)) {
            return false;
        }
        return true;
    }

    public static boolean onFrameAvailable(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (!(obj instanceof TEVideoUtilsCallback)) {
            return false;
        }
        TEVideoUtilsCallback tEVideoUtilsCallback = (TEVideoUtilsCallback) obj;
        if (tEVideoUtilsCallback == null || tEVideoUtilsCallback.listener == null || !tEVideoUtilsCallback.listener.a(byteBuffer, i, i2, i3)) {
            return false;
        }
        return true;
    }
}
