package com.huawei.emui.himedia.camera;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.ArrayMap;
import com.huawei.android.sdk.camera.HwCameraCharacteristicsEx;
import com.huawei.emui.himedia.camera.HwCameraDevice;
import com.huawei.emui.himedia.camera.HwCameraManager;
import com.huawei.emui.himedia.camera.internal.Constants;
import com.huawei.emui.himedia.camera.internal.Util;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class HwCameraManagerImpl extends HwCameraManager {
    private static List<String> sBackLogicalCameraIds = new ArrayList();
    private static List<String> sBackPhysicalCameraIds = new ArrayList();
    protected final ArrayMap<HwCameraManager.AvailabilityCallback, CameraManager.AvailabilityCallback> mAvailabilityCallbackMap = new ArrayMap<>();
    protected String[] mCameraIdList;
    protected CameraManager mCameraManager;
    ServiceConnection mConnection = new ServiceConnection() {
        public void onServiceDisconnected(ComponentName componentName) {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            iBinder.isBinderAlive();
        }
    };
    protected Context mContext;
    public int mCurrentMode = 0;
    protected final Object mLock = new Object();

    public String[] getCameraIdList() throws CameraAccessException {
        return this.mCameraManager.getCameraIdList();
    }

    public void unregisterTorchCallback(HwCameraManager.TorchCallback torchCallback) {
        throw new UnsupportedOperationException("This device does not support the torch mode control");
    }

    public CameraCharacteristics getCameraCharacteristics(String str) throws CameraAccessException {
        if (str != null) {
            return this.mCameraManager.getCameraCharacteristics(str);
        }
        throw new IllegalArgumentException(String.format("Unknown camera ID %s", new Object[]{str}));
    }

    public void unregisterAvailabilityCallback(HwCameraManager.AvailabilityCallback availabilityCallback) {
        CameraManager.AvailabilityCallback remove;
        synchronized (this.mLock) {
            remove = this.mAvailabilityCallbackMap.remove(availabilityCallback);
        }
        if (remove != null) {
            this.mCameraManager.unregisterAvailabilityCallback(remove);
        }
    }

    HwCameraManagerImpl(Context context) {
        this.mContext = context;
        this.mCameraManager = (CameraManager) this.mContext.getSystemService("camera");
        try {
            this.mCameraIdList = this.mCameraManager.getCameraIdList();
            Util.setCameraID(this.mCameraIdList);
        } catch (CameraAccessException unused) {
        }
    }

    public String[] getSupportedFeature(int i) throws RemoteException, CameraAccessException {
        if (i > this.mCameraIdList.length) {
            return new String[0];
        }
        if (HwCamera.SDK_USAGE_FALG == 1) {
            if (i == 0) {
                return Constants.Camera.CAMERA_BACK_FEATURE;
            }
            return Constants.Camera.CAMERA_FRONT_FEATURE;
        } else if (HwCameraEngineUtils.mICamera != null) {
            return HwCameraEngineUtils.mICamera.getSupportedFeature(i);
        } else {
            return new String[0];
        }
    }

    public int getSupportedApertureLevels(String str) {
        byte[] bArr;
        int i = 0;
        while (true) {
            if (i >= this.mCameraIdList.length) {
                i = -1;
                break;
            } else if (this.mCameraIdList[i].equals(str)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return 0;
        }
        try {
            if (isFeatureSupported(i, 4) == 0) {
                return 0;
            }
            if (HwCamera.SDK_USAGE_FALG == 1) {
                bArr = (byte[]) this.mCameraManager.getCameraCharacteristics(str).get(HwCameraCharacteristicsEx.HUAWEI_APERTURE_VALUE_SUPPORTED);
            } else if (HwCameraEngineUtils.mICamera == null) {
                return 0;
            } else {
                bArr = HwCameraEngineUtils.mICamera.getSupportApertureValue(str);
            }
            if (bArr != null) {
                if (bArr.length != 0) {
                    if (bArr[bArr.length - 1] == 0) {
                        byte[] bArr2 = new byte[(bArr.length - 1)];
                        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
                        bArr = bArr2;
                    }
                    return split(new String(bArr, "UTF-8"), ",").size();
                }
            }
            return 0;
        } catch (CameraAccessException | RemoteException | UnsupportedEncodingException unused) {
            return 0;
        }
    }

    public void registerTorchCallback(HwCameraManager.TorchCallback torchCallback, Handler handler) {
        throw new UnsupportedOperationException("This device does not support the torch mode control");
    }

    public void setTorchMode(String str, boolean z) throws CameraAccessException {
        throw new UnsupportedOperationException("This device does not support the torch mode control");
    }

    private List<String> split(String str, String str2) {
        if (str == null) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreElements()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public boolean isTargetfpsSupported(CameraCharacteristics cameraCharacteristics, int i) {
        int[] iArr = (int[]) cameraCharacteristics.get(HwCameraCharacteristicsEx.HUAWEI_AVAILABLE_VIDEO_FPS);
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public void registerAvailabilityCallback(final HwCameraManager.AvailabilityCallback availabilityCallback, Handler handler) {
        AnonymousClass1 r4;
        synchronized (this.mLock) {
            if (!this.mAvailabilityCallbackMap.containsKey(availabilityCallback)) {
                AnonymousClass1 r1 = new CameraManager.AvailabilityCallback() {
                    public void onCameraAvailable(String str) {
                        availabilityCallback.onCameraAvailable(str);
                    }

                    public void onCameraUnavailable(String str) {
                        availabilityCallback.onCameraUnavailable(str);
                    }
                };
                CameraManager cameraManager = this.mCameraManager;
                if (availabilityCallback == null) {
                    r4 = null;
                } else {
                    r4 = r1;
                }
                cameraManager.registerAvailabilityCallback(r4, handler);
                ArrayMap<HwCameraManager.AvailabilityCallback, CameraManager.AvailabilityCallback> arrayMap = this.mAvailabilityCallbackMap;
                if (availabilityCallback == null) {
                    r1 = null;
                }
                arrayMap.put(availabilityCallback, r1);
            }
        }
    }

    @TargetApi(28)
    public boolean isModeSupport(String str, int i) throws RemoteException, CameraAccessException {
        byte b2;
        int i2 = 0;
        while (true) {
            if (i2 >= this.mCameraIdList.length) {
                i2 = -1;
                break;
            } else if (this.mCameraIdList[i2].equals(str)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return false;
        }
        switch (i) {
            case 0:
                return true;
            case 1:
                b2 = isFeatureSupported(i2, 7);
                break;
            case 2:
                b2 = isFeatureSupported(i2, 4);
                break;
            case 3:
                b2 = isFeatureSupported(i2, 6);
                break;
            case 4:
                b2 = isFeatureSupported(i2, 1);
                break;
            case 5:
                b2 = isFeatureSupported(i2, 2);
                break;
            case 6:
                b2 = isFeatureSupported(i2, 3);
                break;
            case e.l /*?: ONE_ARG  (7 int)*/:
                b2 = isFeatureSupported(i2, 9);
                break;
            default:
                b2 = 0;
                break;
        }
        if (((i == 3 || i == 2) && Build.VERSION.SDK_INT > 27 && getCameraCharacteristics(str).getPhysicalCameraIds().isEmpty()) || b2 == 0) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte isFeatureSupported(int r8, int r9) throws android.os.RemoteException, android.hardware.camera2.CameraAccessException {
        /*
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            java.lang.Byte r3 = java.lang.Byte.valueOf(r2)
            java.lang.String[] r4 = r7.mCameraIdList
            int r4 = r4.length
            if (r8 <= r4) goto L_0x0013
            byte r8 = r3.byteValue()
            return r8
        L_0x0013:
            java.lang.String[] r4 = r7.mCameraIdList
            r4 = r4[r8]
            android.hardware.camera2.CameraManager r5 = r7.mCameraManager
            android.hardware.camera2.CameraCharacteristics r4 = r5.getCameraCharacteristics(r4)
            int r5 = com.huawei.emui.himedia.camera.HwCamera.SDK_USAGE_FALG
            r6 = 1
            if (r5 != r6) goto L_0x00a7
            switch(r9) {
                case 1: goto L_0x007c;
                case 2: goto L_0x0071;
                case 3: goto L_0x0066;
                case 4: goto L_0x005c;
                case 5: goto L_0x0025;
                case 6: goto L_0x0052;
                case 7: goto L_0x0034;
                case 8: goto L_0x002a;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r2)
            goto L_0x0085
        L_0x002a:
            android.hardware.camera2.CameraCharacteristics$Key<java.lang.Byte> r8 = com.huawei.android.sdk.camera.HwCameraCharacteristicsEx.HUAWEI_PORTRAIT_MODE_SUPPORTED
            java.lang.Object r8 = r4.get(r8)
            r3 = r8
            java.lang.Byte r3 = (java.lang.Byte) r3
            goto L_0x0085
        L_0x0034:
            boolean r8 = com.huawei.emui.himedia.utils.ConfigurationUtil.isQcomEmuiLite()
            if (r8 != 0) goto L_0x0085
            android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r8 = r4.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 == 0) goto L_0x0085
            boolean r8 = com.huawei.emui.himedia.utils.ConfigurationUtil.isSupportedSupperNight()
            byte r8 = (byte) r8
            java.lang.Byte r3 = java.lang.Byte.valueOf(r8)
            goto L_0x0085
        L_0x0052:
            android.hardware.camera2.CameraCharacteristics$Key<java.lang.Byte> r8 = com.huawei.android.sdk.camera.HwCameraCharacteristicsEx.HAUWEI_SMART_SUGGEST_SUPPORT
            java.lang.Object r8 = r4.get(r8)
            r3 = r8
            java.lang.Byte r3 = (java.lang.Byte) r3
            goto L_0x0085
        L_0x005c:
            android.hardware.camera2.CameraCharacteristics$Key<java.lang.Byte> r8 = com.huawei.android.sdk.camera.HwCameraCharacteristicsEx.HUAWEI_BIG_APERTURE_SUPPORTED
            java.lang.Object r8 = r4.get(r8)
            r3 = r8
            java.lang.Byte r3 = (java.lang.Byte) r3
            goto L_0x0085
        L_0x0066:
            r8 = 120(0x78, float:1.68E-43)
            boolean r8 = r7.isTargetfpsSupported(r4, r8)
            java.lang.Byte r3 = java.lang.Byte.valueOf(r8)
            goto L_0x0085
        L_0x0071:
            r8 = 60
            boolean r8 = r7.isTargetfpsSupported(r4, r8)
            java.lang.Byte r3 = java.lang.Byte.valueOf(r8)
            goto L_0x0085
        L_0x007c:
            android.hardware.camera2.CameraCharacteristics$Key<java.lang.Byte> r8 = com.huawei.android.sdk.camera.HwCameraCharacteristicsEx.HUAWEI_SUPER_SLOW_MOTION_SUPPORTED
            java.lang.Object r8 = r4.get(r8)
            r3 = r8
            java.lang.Byte r3 = (java.lang.Byte) r3
        L_0x0085:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "isFeatureSupported by sdk: check code:"
            r8.<init>(r0)
            r8.append(r9)
            java.lang.String r9 = " (1-superslow) (2-60fps) (3-120fps) return: "
            r8.append(r9)
            if (r3 != 0) goto L_0x0098
            r9 = 0
            goto L_0x009c
        L_0x0098:
            byte r9 = r3.byteValue()
        L_0x009c:
            r8.append(r9)
            if (r3 != 0) goto L_0x00a2
            return r2
        L_0x00a2:
            byte r8 = r3.byteValue()
            return r8
        L_0x00a7:
            com.huawei.emui.himedia.camera.ICamera r4 = com.huawei.emui.himedia.camera.HwCameraEngineUtils.mICamera
            if (r4 == 0) goto L_0x00b2
            com.huawei.emui.himedia.camera.ICamera r0 = com.huawei.emui.himedia.camera.HwCameraEngineUtils.mICamera
            byte r8 = r0.isFeatureSupported(r8, r9)
            return r8
        L_0x00b2:
            java.lang.String r8 = "isFeatureSupported"
            java.lang.String r9 = "EngDie"
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r0
            com.huawei.emui.himedia.camera.HwCameraEngineUtils.reportFunc(r8, r2, r9, r4)
            byte r8 = r3.byteValue()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.emui.himedia.camera.HwCameraManagerImpl.isFeatureSupported(int, int):byte");
    }

    public void openCamera(String str, final HwCameraDevice.StateCallback stateCallback, Handler handler, int i) throws CameraAccessException {
        this.mCurrentMode = i;
        if (HwCamera.SDK_USAGE_FALG == 2) {
            HwCameraEngineUtils.setFuncName(i);
        }
        final CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(str);
        AnonymousClass3 r0 = new CameraDevice.StateCallback() {
            HwCameraDevice mDevice;

            public void onClosed(CameraDevice cameraDevice) {
                if (this.mDevice == null) {
                    this.mDevice = HwCameraDevice.createImpl(cameraDevice, HwCameraManagerImpl.this.mContext);
                }
                stateCallback.onClosed(this.mDevice);
            }

            public void onDisconnected(CameraDevice cameraDevice) {
                if (this.mDevice == null) {
                    this.mDevice = HwCameraDevice.createImpl(cameraDevice, HwCameraManagerImpl.this.mContext);
                }
                stateCallback.onDisconnected(this.mDevice);
            }

            public void onOpened(CameraDevice cameraDevice) {
                if (this.mDevice == null) {
                    this.mDevice = HwCameraDevice.createImpl(cameraDevice, HwCameraManagerImpl.this.mContext);
                    this.mDevice.setMode(HwCameraManagerImpl.this.mCurrentMode);
                    this.mDevice.setCharacteristics(cameraCharacteristics);
                }
                stateCallback.onOpened(this.mDevice);
            }

            public void onError(CameraDevice cameraDevice, int i) {
                if (this.mDevice == null) {
                    this.mDevice = HwCameraDevice.createImpl(cameraDevice, HwCameraManagerImpl.this.mContext);
                }
                stateCallback.onError(this.mDevice, i);
            }
        };
        try {
            CameraManager cameraManager = this.mCameraManager;
            if (stateCallback == null) {
                r0 = null;
            }
            cameraManager.openCamera(str, r0, handler);
        } catch (CameraAccessException unused) {
        } catch (SecurityException unused2) {
        }
    }
}
