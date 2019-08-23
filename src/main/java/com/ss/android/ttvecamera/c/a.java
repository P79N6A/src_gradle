package com.ss.android.ttvecamera.c;

import android.hardware.camera2.CameraAccessException;
import android.os.Bundle;
import com.ss.android.ttvecamera.TECameraSettings;

public interface a {
    String a(@TECameraSettings.CameraFacing int i) throws CameraAccessException;

    void a(Bundle bundle);

    void a(TECameraSettings.c cVar);

    void a(Object obj) throws ClassCastException;

    void b(int i);
}
