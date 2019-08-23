package io.agora.rtc.video;

import android.hardware.Camera;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.agora.rtc.internal.Logging;
import java.util.ArrayList;
import java.util.List;

public class CameraHelper {

    public static class Capability {
        public int facing;
        public int height;
        public int id;
        public int maxFps;
        public int width;

        public Capability(int i, int i2, int i3, int i4, int i5) {
            this.id = i;
            this.facing = i2;
            this.width = i3;
            this.height = i4;
            this.maxFps = i5;
        }
    }

    public static boolean checkPermission() {
        return true;
    }

    public static synchronized List<Capability> getCameraCapability() {
        ArrayList arrayList;
        synchronized (CameraHelper.class) {
            arrayList = new ArrayList();
            int numberOfCameras = Camera.getNumberOfCameras();
            if (numberOfCameras > 0) {
                int i = 0;
                while (i < numberOfCameras) {
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    Camera.getCameraInfo(i, cameraInfo);
                    try {
                        Camera open = Camera.open(i);
                        arrayList.add(createCapability(i, cameraInfo.facing, open.getParameters()));
                        open.release();
                        i++;
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                }
            } else {
                throw new RuntimeException("no camera device");
            }
        }
        return arrayList;
    }

    public static Capability createCapability(int i, int i2, Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewSizes.isEmpty() || supportedPreviewFpsRange.isEmpty()) {
            Logging.e("CameraHelper", "failed get preview size/fps, parameters = " + parameters.flatten());
            throw new IllegalArgumentException(parameters.flatten());
        }
        Camera.Size size = supportedPreviewSizes.get(0);
        for (Camera.Size next : supportedPreviewSizes) {
            if (next.width * next.height > size.width * size.height) {
                size = next;
            }
        }
        int i3 = supportedPreviewFpsRange.get(0)[1] / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        Logging.d("CameraHelper", "creaet capability for camera " + i + " : width: " + size.width + " , height: " + size.height + " max fps: " + i3);
        Capability capability = new Capability(i, i2, size.width, size.height, i3);
        return capability;
    }
}
