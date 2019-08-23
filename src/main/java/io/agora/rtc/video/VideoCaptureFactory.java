package io.agora.rtc.video;

import android.content.Context;
import android.os.Build;
import io.agora.rtc.internal.Logging;

public class VideoCaptureFactory {

    static class AndroidCameraInfo {
        private static int sNumberOfSystemCameras = -1;

        AndroidCameraInfo() {
        }

        public static int getNumberOfCameras(Context context) {
            if (sNumberOfSystemCameras == -1) {
                if (Build.VERSION.SDK_INT >= 23 || context.getPackageManager().checkPermission("android.permission.CAMERA", context.getPackageName()) == 0) {
                    sNumberOfSystemCameras = 0;
                    if (VideoCaptureFactory.isLReleaseOrLater()) {
                        sNumberOfSystemCameras = VideoCaptureCamera2.getNumberOfCameras(context);
                    }
                    if (sNumberOfSystemCameras == 0) {
                        sNumberOfSystemCameras = VideoCaptureCamera.getNumberOfCameras();
                    }
                } else {
                    sNumberOfSystemCameras = 0;
                }
            }
            return sNumberOfSystemCameras;
        }
    }

    public static boolean isLReleaseOrLater() {
        if ("m2c".equals(Build.DEVICE) || "M578CA".equals(Build.MODEL) || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return true;
    }

    public static int getNumberOfCameras(Context context) {
        return AndroidCameraInfo.getNumberOfCameras(context);
    }

    public static String getCapabilities(int i, Context context) {
        String fetchCapability = VideoCapture.fetchCapability(i, context);
        if (fetchCapability == null) {
            Logging.e("CAM-FACTORY", "Capability hasn't been created");
        }
        return fetchCapability;
    }

    public static String getDeviceName(int i, Context context) {
        if (!isLReleaseOrLater() || VideoCaptureCamera2.isLegacyDevice(context, i)) {
            return VideoCaptureCamera.getName(i);
        }
        return VideoCaptureCamera2.getName(i, context);
    }

    public static int getDeviceOrientation(int i, Context context) {
        if (!isLReleaseOrLater() || VideoCaptureCamera2.isLegacyDevice(context, i)) {
            return VideoCaptureCamera.getSensorOrientation(i);
        }
        return VideoCaptureCamera2.getSensorOrientation(i, context);
    }

    public static VideoCapture createVideoCapture(int i, Context context, long j) {
        if (!isLReleaseOrLater() || VideoCaptureCamera2.isLegacyDevice(context, i)) {
            return new VideoCaptureCamera(context, i, j);
        }
        return new VideoCaptureCamera2(context, i, j);
    }
}
