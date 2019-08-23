package io.agora.rtc.video;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class VideoCapture {
    protected int mCameraNativeOrientation;
    protected final Context mContext;
    protected final int mId;
    protected long mNativeVideoCaptureDeviceAndroid;

    public static int translateToAndroidFormat(int i) {
        if (i == 12) {
            return 17;
        }
        switch (i) {
            case 0:
                return 35;
            case 1:
                return 842094169;
            case 2:
                return 20;
            default:
                return 0;
        }
    }

    public static int translateToEngineFormat(int i) {
        if (i == 17) {
            return 12;
        }
        if (i == 20) {
            return 2;
        }
        if (i != 35) {
            return i != 842094169 ? 99 : 1;
        }
        return 0;
    }

    public native void ProvideCameraFrame(byte[] bArr, int i, long j);

    public native void ProvideCameraTexture(byte[] bArr, int i, long j);

    public abstract int allocate();

    public abstract void deallocate();

    public abstract float getMaxZoom();

    public abstract boolean isAutoFaceFocusSupported();

    public abstract boolean isFocusSupported();

    public abstract boolean isTorchSupported();

    public abstract boolean isZoomSupported();

    public native void onCameraError(long j, String str);

    public abstract int setAutoFaceFocus(boolean z);

    public abstract int setCaptureFormat(int i);

    public abstract int setFocus(float f2, float f3, int i, int i2, int i3, int i4, boolean z);

    public abstract int setTorchMode(boolean z);

    public abstract int setZoom(float f2);

    public abstract int startCapture(int i, int i2, int i3);

    public abstract int stopCapture();

    public static boolean isEmulator() {
        try {
            Process start = new ProcessBuilder(new String[]{"/system/bin/cat", "/proc/cpuinfo"}).start();
            StringBuffer stringBuffer = new StringBuffer();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream(), "utf-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            bufferedReader.close();
            String lowerCase = stringBuffer.toString().toLowerCase();
            if (lowerCase.contains("intel") || lowerCase.contains("amd")) {
                return true;
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    public static String fetchCapability(int i, Context context) {
        SharedPreferences a2 = c.a(context, "CamCaps", 0);
        return a2.getString("Cam_" + i, null);
    }

    VideoCapture(Context context, int i, long j) {
        this.mContext = context;
        this.mId = i;
        this.mNativeVideoCaptureDeviceAndroid = j;
    }

    public static void cacheCapability(int i, Context context, String str) {
        SharedPreferences.Editor edit = c.a(context, "CamCaps", 0).edit();
        edit.putString("Cam_" + i, str);
        edit.commit();
    }
}
