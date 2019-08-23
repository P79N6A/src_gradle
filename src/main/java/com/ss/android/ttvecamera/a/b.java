package com.ss.android.ttvecamera.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.ad;
import com.ss.android.ttvecamera.hardware.TEMiCameraProxy;

@TargetApi(21)
public abstract class b extends com.ss.android.ttvecamera.c.b {

    /* renamed from: a  reason: collision with root package name */
    protected CameraManager f31316a;

    /* renamed from: b  reason: collision with root package name */
    protected CameraDevice f31317b;

    public final void a(Bundle bundle) {
    }

    public final void a(TECameraSettings.c cVar) {
    }

    public final Object a() {
        return this.f31317b;
    }

    public final void a(Object obj) throws ClassCastException {
        this.f31317b = (CameraDevice) obj;
    }

    public final String a(@TECameraSettings.CameraFacing int i) throws CameraAccessException {
        String str;
        String[] cameraIdList = this.f31316a.getCameraIdList();
        if (i != 2) {
            if (i >= cameraIdList.length || i < 0) {
                i = 1;
            }
            this.h.f31294e = i;
            str = cameraIdList[i];
        } else if (this.h.f31292c == 4) {
            str = TEMiCameraProxy.b(21);
        } else {
            str = com.ss.android.ttvecamera.hardware.b.a(cameraIdList, this.f31316a);
        }
        if (str == null) {
            ad.c("TECamera2Mode", "selectCamera: camera tag is null, set 0 for default");
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        this.k = this.f31316a.getCameraCharacteristics(str);
        return str;
    }

    public b(@NonNull com.ss.android.ttvecamera.b bVar, @NonNull Context context, @NonNull CameraManager cameraManager, Handler handler) {
        super(bVar, context, handler);
        this.f31316a = cameraManager;
    }
}
