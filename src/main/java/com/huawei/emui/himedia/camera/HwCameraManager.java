package com.huawei.emui.himedia.camera;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Handler;
import android.os.RemoteException;
import com.huawei.emui.himedia.camera.HwCameraDevice;

public abstract class HwCameraManager {

    public static abstract class AvailabilityCallback {
        public void onCameraAvailable(String str) {
        }

        public void onCameraUnavailable(String str) {
        }
    }

    public static abstract class TorchCallback {
        public void onTorchModeChanged(String str, boolean z) {
        }

        public void onTorchModeUnavailable(String str) {
        }
    }

    public abstract CameraCharacteristics getCameraCharacteristics(String str) throws CameraAccessException;

    public abstract String[] getCameraIdList() throws CameraAccessException;

    public abstract int getSupportedApertureLevels(String str);

    public abstract String[] getSupportedFeature(int i) throws RemoteException, CameraAccessException;

    public abstract byte isFeatureSupported(int i, int i2) throws RemoteException, CameraAccessException;

    public abstract boolean isModeSupport(String str, int i) throws RemoteException, CameraAccessException;

    public abstract void openCamera(String str, HwCameraDevice.StateCallback stateCallback, Handler handler, int i) throws CameraAccessException;

    public abstract void registerAvailabilityCallback(AvailabilityCallback availabilityCallback, Handler handler);

    public abstract void registerTorchCallback(TorchCallback torchCallback, Handler handler);

    public abstract void setTorchMode(String str, boolean z) throws CameraAccessException;

    public abstract void unregisterAvailabilityCallback(AvailabilityCallback availabilityCallback);

    public abstract void unregisterTorchCallback(TorchCallback torchCallback);

    static HwCameraManager createImpl(Context context) {
        return new HwCameraManagerImpl(context);
    }
}
