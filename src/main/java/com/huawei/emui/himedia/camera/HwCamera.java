package com.huawei.emui.himedia.camera;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import com.huawei.emui.himedia.BuildConfig;
import com.huawei.emui.himedia.utils.SystemUtils;
import java.util.List;

public class HwCamera {
    static int SDK_USAGE_FALG = 1;
    static HwCameraInitSuccessCallback mInitCallback = null;
    static boolean mIsInitialized = false;
    private static HwCameraManager mManager;
    private static final Object sLock = new Object();
    private Context mContext;
    private boolean mSCameraManagerLogged;

    public int getVersionCode() {
        return 90000100;
    }

    public String getVersionName() {
        return "9.0.0.100";
    }

    private void checkInitialized() {
        if (!mIsInitialized) {
            throw new IllegalStateException("Call initialize() first.");
        }
    }

    private void invokeInitSuccessCallback() {
        if (mInitCallback != null) {
            new Handler(Looper.myLooper()).post(new Runnable() {
                public void run() {
                    HwCamera.mInitCallback.onInitSuccess();
                }
            });
        }
    }

    public void deInitialize() {
        checkInitialized();
        if (this.mContext != null && SDK_USAGE_FALG == 2) {
            HwCameraEngineUtils.unbindService(this.mContext);
        }
    }

    public HwCameraManager getHwCameraManager() {
        HwCameraManager hwCameraManager;
        checkInitialized();
        synchronized (sLock) {
            if (mManager == null) {
                mManager = HwCameraManager.createImpl(this.mContext);
            }
            hwCameraManager = mManager;
        }
        return hwCameraManager;
    }

    public void setHwCameraEngineDieCallBack(HwCameraEngineDieRecipient hwCameraEngineDieRecipient) {
        HwCameraEngineUtils.setOnDieCallBack(hwCameraEngineDieRecipient);
    }

    public void setInitSuccessCallback(HwCameraInitSuccessCallback hwCameraInitSuccessCallback) {
        mInitCallback = hwCameraInitSuccessCallback;
    }

    public boolean isFeatureEnabled(int i) {
        checkInitialized();
        return true;
    }

    public static byte isDeviceSupported(Context context) {
        if (!SystemUtils.isHwaweiDevice() && !BuildConfig.DEBUG) {
            return 3;
        }
        if (SystemUtils.isEngineMatched(context)) {
            SDK_USAGE_FALG = 2;
            return 0;
        } else if (Build.VERSION.SDK_INT > 27) {
            return 2;
        } else {
            return 0;
        }
    }

    public void initialize(Context context) {
        if (isDeviceSupported(context) == 0) {
            this.mContext = context;
            if (SDK_USAGE_FALG == 2) {
                HwCameraEngineUtils.bindService(context);
                return;
            }
            mIsInitialized = true;
            invokeInitSuccessCallback();
            return;
        }
        throw new UnsupportedOperationException("himedia sdk for camera do not support on this device.");
    }

    static Size getOptimalPreviewSize(List<Size> list, int i, int i2, int i3, boolean z) {
        if (i == (i2 * 4) / 3) {
            return new Size(1280, 960);
        }
        if (i == (i2 * 16) / 9) {
            return new Size(1280, 720);
        }
        return new Size(1280, 960);
    }
}
