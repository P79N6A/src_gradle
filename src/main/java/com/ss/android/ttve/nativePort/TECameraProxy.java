package com.ss.android.ttve.nativePort;

import android.graphics.SurfaceTexture;
import android.support.annotation.Keep;
import com.ss.android.ttve.utils.CameraInstance;
import com.ss.android.vesdk.y;

@Keep
public class TECameraProxy extends CameraInstance {
    private static final String TAG = "TECameraProxy";
    public static long mNativeAddr;
    private CameraInstance.a mCameraOpenCallback = new CameraInstance.a() {
        public final void a() {
            TECameraProxy.this.nativeOnCameraCreate(TECameraProxy.mNativeAddr, 0);
        }
    };
    private int mCameraTextureID;
    private SurfaceTexture mSurfaceTexture;
    public boolean mbSurfaceTextureReleased;

    public native int nativeOnCameraCreate(long j, int i);

    public native int nativeOnFrameAvailable(long j, SurfaceTexture surfaceTexture);

    static {
        b.a();
    }

    public synchronized void getNextFrame() {
        this.mSurfaceTexture.updateTexImage();
    }

    public synchronized void startPreview() {
        startPreview(this.mSurfaceTexture);
        this.mbSurfaceTextureReleased = false;
    }

    public synchronized void stopCamera() {
        this.mbSurfaceTextureReleased = true;
        this.mSurfaceTexture.setOnFrameAvailableListener(null);
        super.stopCamera();
    }

    public static TECameraProxy create(long j) {
        mNativeAddr = j;
        return new TECameraProxy();
    }

    public synchronized boolean open(int i) {
        return tryOpenCamera(this.mCameraOpenCallback, i);
    }

    public synchronized boolean switchCamera(int i) {
        if (!tryOpenCamera(this.mCameraOpenCallback, i)) {
            return false;
        }
        startPreview(this.mSurfaceTexture);
        return true;
    }

    public int setSurfaceTexture(Object obj, int i) {
        y.b(TAG, "setSurfaceTexture...");
        if (i == 0) {
            y.d(TAG, "Invalid Texture ID!");
            return -100;
        } else if (obj instanceof SurfaceTexture) {
            this.mSurfaceTexture = (SurfaceTexture) obj;
            this.mSurfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                public final synchronized void onFrameAvailable(SurfaceTexture surfaceTexture) {
                    if (!TECameraProxy.this.mbSurfaceTextureReleased) {
                        TECameraProxy.this.nativeOnFrameAvailable(TECameraProxy.mNativeAddr, surfaceTexture);
                    }
                }
            });
            return 0;
        } else {
            y.d(TAG, "Invalid SurfaceTexture!");
            return -100;
        }
    }
}
