package com.huawei.emui.himedia.camera;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.hardware.camera2.CaptureRequest;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.huawei.emui.himedia.camera.ICamera;
import com.huawei.emui.himedia.camera.ICommon;
import com.huawei.emui.himedia.camera.IHiMediaEngineService;
import java.util.HashMap;

public class HwCameraEngineUtils {
    public static String mCallingPackName;
    static ServiceConnection mConnection = new ServiceConnection() {
        public final void onServiceDisconnected(ComponentName componentName) {
            HwCameraEngineUtils.mICamera = null;
            HwCameraEngineUtils.mICommon = null;
            HwCameraEngineUtils.mIHiMediaEngineService = null;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IHiMediaEngineService asInterface = IHiMediaEngineService.Stub.asInterface(iBinder);
            HwCameraEngineUtils.mIHiMediaEngineService = asInterface;
            if (asInterface != null) {
                try {
                    HwCameraEngineUtils.mICamera = ICamera.Stub.asInterface(HwCameraEngineUtils.mIHiMediaEngineService.getService("ICAMERA"));
                    ICommon asInterface2 = ICommon.Stub.asInterface(HwCameraEngineUtils.mIHiMediaEngineService.getService("ICOMMON"));
                    HwCameraEngineUtils.mICommon = asInterface2;
                    if (asInterface2 != null) {
                        HwCameraEngineUtils.mICommon.setClientInfo(new Binder(), HwCameraEngineUtils.mCallingPackName, "himediaSDK", "9.0.0.100");
                    }
                    HwCameraEngineUtils.mService = iBinder;
                    iBinder.linkToDeath(HwCameraEngineUtils.mDeathRecipient, 0);
                    HwCamera.mIsInitialized = true;
                    if (HwCamera.mInitCallback != null) {
                        new Handler(Looper.myLooper()).post(new Runnable() {
                            public void run() {
                                HwCamera.mInitCallback.onInitSuccess();
                            }
                        });
                    }
                } catch (RemoteException unused) {
                }
            }
        }
    };
    static IBinder.DeathRecipient mDeathRecipient = new IBinder.DeathRecipient() {
        public final void binderDied() {
            HwCameraEngineUtils.mService.unlinkToDeath(HwCameraEngineUtils.mDeathRecipient, 0);
            HwCameraEngineUtils.mICamera = null;
            HwCameraEngineUtils.mICommon = null;
            HwCameraEngineUtils.mIHiMediaEngineService = null;
            if (HwCameraEngineUtils.mDieCallBack != null) {
                HwCameraEngineUtils.mDieCallBack.onEngineDie();
            }
        }
    };
    public static HwCameraEngineDieRecipient mDieCallBack;
    public static String mFucName;
    public static HashMap<Integer, String> mFuncNameMap;
    public static ICamera mICamera;
    public static ICommon mICommon;
    public static IHiMediaEngineService mIHiMediaEngineService;
    static IBinder mService = null;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        mFuncNameMap = hashMap;
        hashMap.put(1, "superNight");
        mFuncNameMap.put(6, "highSlowMotion");
        mFuncNameMap.put(5, "normalSlowMotion");
        mFuncNameMap.put(4, "superSlowMotion");
        mFuncNameMap.put(2, "aperture");
        mFuncNameMap.put(3, "smartCapture");
        mFuncNameMap.put(7, "beautyBody");
    }

    static void setOnDieCallBack(HwCameraEngineDieRecipient hwCameraEngineDieRecipient) {
        mDieCallBack = hwCameraEngineDieRecipient;
    }

    static void unbindService(Context context) {
        if (context != null) {
            context.unbindService(mConnection);
        }
    }

    static String getCaptureResultKeyName(int i) {
        if (mICamera != null) {
            try {
                return mICamera.getCaptureResultKeyName(i);
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    static byte[] getSupportApertureValue(String str) {
        if (!(mICamera == null || str == null)) {
            try {
                return mICamera.getSupportApertureValue(str);
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    static void setFuncName(int i) {
        mFucName = mFuncNameMap.get(Integer.valueOf(i));
    }

    static void bindService(Context context) {
        Intent className = new Intent().setClassName("com.android.huawei.HiMediaEngine", "com.android.huawei.HiMediaEngine.HiMediaEngineService");
        if (context != null) {
            mCallingPackName = context.getPackageName();
        }
        context.bindService(className, mConnection, 1);
    }

    static int getCaptureRequestKeyIndex(CaptureRequest captureRequest, int i) {
        if (!(mICamera == null || captureRequest == null)) {
            try {
                return mICamera.getCaptureRequestKeyIndex(captureRequest, i);
            } catch (RemoteException unused) {
            }
        }
        return -1;
    }

    static byte isFeatureSupported(int i, int i2) {
        if (mICamera != null) {
            try {
                return mICamera.isFeatureSupported(i, i2);
            } catch (RemoteException unused) {
            }
        }
        return 0;
    }

    static void reportFunc(String str, int i, String str2, long j) {
        if (!(mICommon == null || mFucName == null || str == null)) {
            try {
                mICommon.reportFunc("hiMediaSDK", "9.0.0.100", str, mFucName, i, str2, j);
            } catch (RemoteException unused) {
            }
        }
    }

    static void reportFunc(String str, String str2, int i, String str3, long j) {
        if (!(mICommon == null || str2 == null || str == null)) {
            try {
                mICommon.reportFunc("hiMediaSDK", "9.0.0.100", str, str2, i, str3, j);
            } catch (RemoteException unused) {
            }
        }
    }
}
