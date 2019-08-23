package com.ss.avframework.livestreamv2.effectcamera.render;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.bef.effectsdk.message.MessageCenter;
import com.ss.avframework.livestreamv2.effectcamera.render.IAudioPlayer;
import com.ss.avframework.livestreamv2.effectcamera.utils.LogUtils;

public class EffectRender {
    private static String TAG = "EffectRender";
    private int mFaceDetectModel = 33;
    private boolean mForceDetectFace;
    private boolean mInited;
    private long mNativePtr;
    private OnMicrophoneDetectResultListener mOnMicrophoneDetectResultListener;
    private OnRefreshFaceDataListener mOnRefreshFaceDataListener;
    private boolean mROIDetect;

    public enum CameraPosition {
        camera_position_front(0),
        camera_position_back(1);
        
        public int id;

        public static CameraPosition valueOf(int i) {
            switch (i) {
                case 0:
                    return camera_position_front;
                case 1:
                    return camera_position_back;
                default:
                    return null;
            }
        }

        private CameraPosition(int i) {
            this.id = i;
        }
    }

    public enum EffectGameNtfType {
        EFFECT_GAME_NTF_START(1),
        EFFECT_GAME_NTF_STOP(2),
        EFFECT_GAME_NTF_PAUSE(4),
        EFFECT_GAME_NTF_RESUME(5),
        EFFECT_GAME_NTF_RESTART(6),
        EFFECT_GAME_NTF_CHALLENGE(7);
        
        public int id;

        private EffectGameNtfType(int i) {
            this.id = i;
        }
    }

    public enum FaceDetectModel {
        FACE_DETECT_NEVER(0),
        FACE_DETECT_DEMAND(1),
        FACE_DETECT_ALWAYS(2);
        
        public int id;

        private FaceDetectModel(int i) {
            this.id = i;
        }
    }

    public interface OnMicrophoneDetectResultListener {
        void onMicrophoneDetectResult(float f2);
    }

    public interface OnRefreshFaceDataListener {
        void onRefreshFaceData(int i);
    }

    public enum Rotation {
        CLOCKWISE_ROTATE_0(0),
        CLOCKWISE_ROTATE_90(1),
        CLOCKWISE_ROTATE_180(2),
        CLOCKWISE_ROTATE_270(3);
        
        public int id;

        private Rotation(int i) {
            this.id = i;
        }
    }

    private native int nativeComposerReloadNodes(long j, String[] strArr, int i);

    private native int nativeComposerSetMode(long j, int i, int i2);

    private native int nativeComposerSetNodes(long j, String[] strArr, int i);

    private native int nativeComposerUpdateNode(long j, String str, String str2, float f2);

    private native long nativeCreate();

    private native int nativeEnableMockFace(long j, boolean z);

    private native int nativeInit(long j, String str, String str2, int i, int i2, boolean z, AssetManager assetManager, boolean z2);

    private native int nativeOnPause(long j);

    private native int nativeOnResume(long j);

    private native int nativeProcess(long j, int i, int i2, int i3, double d2);

    private native void nativeRelease(long j);

    private native int nativeSendMessage(long j, int i, int i2, int i3, String str);

    private native int nativeSetAudioPlayerFactory(long j, IAudioPlayer.IFactory iFactory);

    private native int nativeSetCameraPosition(long j, int i);

    private native int nativeSetDeviceRotation(long j, float[] fArr);

    private native int nativeSetFaceBeauty(long j, String str, float f2, float f3, float f4);

    private native int nativeSetFilter(long j, String str, float f2);

    private native int nativeSetForceDetectFace(long j, boolean z);

    private native int nativeSetMaxMemCache(long j, int i);

    private native int nativeSetMusicEffect(long j, String str, float f2);

    private native int nativeSetROIDetect(long j, boolean z);

    private native int nativeSetReshape(long j, String str, float f2, float f3);

    private native int nativeSetWidthHeight(long j, int i, int i2);

    private native int nativeSwitchCustomResource(long j, String str, String str2, boolean z);

    private native int nativeSwitchFilter(long j, String str, String str2, float f2);

    private native int nativeSwitchResource(long j, String str, boolean z);

    private native int nativeUpdateMusicEffectTempo(long j, float f2);

    public boolean isEnableMockFace() {
        return this.mForceDetectFace;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            release();
        } finally {
            super.finalize();
        }
    }

    public long getHandler() {
        if (!this.mInited) {
            return 0;
        }
        return this.mNativePtr;
    }

    public int onPause() {
        if (!this.mInited) {
            return -105;
        }
        return nativeOnPause(this.mNativePtr);
    }

    public int onResume() {
        if (!this.mInited) {
            return -105;
        }
        return nativeOnResume(this.mNativePtr);
    }

    public void release() {
        if (this.mInited && this.mNativePtr != 0) {
            MessageCenter.destroy();
            nativeRelease(this.mNativePtr);
            this.mNativePtr = 0;
            this.mInited = false;
        }
    }

    public void setOnMicrophoneDetectResultListener(OnMicrophoneDetectResultListener onMicrophoneDetectResultListener) {
        this.mOnMicrophoneDetectResultListener = onMicrophoneDetectResultListener;
    }

    public void setOnRefreshFaceDataListener(OnRefreshFaceDataListener onRefreshFaceDataListener) {
        this.mOnRefreshFaceDataListener = onRefreshFaceDataListener;
    }

    private void onNativeCallBack_microphoneDetectResult(float f2) {
        if (this.mOnMicrophoneDetectResultListener != null) {
            this.mOnMicrophoneDetectResultListener.onMicrophoneDetectResult(f2);
        }
    }

    private void onNativeCallBack_refreshFace(int i) {
        if (this.mOnRefreshFaceDataListener != null) {
            this.mOnRefreshFaceDataListener.onRefreshFaceData(i);
        }
    }

    public int setAudioPlayerFactory(IAudioPlayer.IFactory iFactory) {
        if (!this.mInited) {
            return -105;
        }
        return nativeSetAudioPlayerFactory(this.mNativePtr, iFactory);
    }

    public int setCameraPosition(CameraPosition cameraPosition) {
        if (!this.mInited) {
            return -105;
        }
        return nativeSetCameraPosition(this.mNativePtr, cameraPosition.id);
    }

    public int setDeviceRotation(float[] fArr) {
        if (!this.mInited) {
            return -105;
        }
        return nativeSetDeviceRotation(this.mNativePtr, fArr);
    }

    public int setForceDetectFace(boolean z) {
        this.mForceDetectFace = z;
        if (!this.mInited) {
            return -105;
        }
        return nativeSetForceDetectFace(this.mNativePtr, z);
    }

    public int setMaxMemCache(int i) {
        if (!this.mInited) {
            return -105;
        }
        return nativeSetMaxMemCache(this.mNativePtr, i);
    }

    public int setMessageListener(MessageCenter.a aVar) {
        if (!this.mInited) {
            return -105;
        }
        MessageCenter.setListener(aVar);
        return 0;
    }

    public int setROIDetect(boolean z) {
        this.mROIDetect = z;
        if (!this.mInited) {
            return 0;
        }
        return nativeSetROIDetect(this.mNativePtr, z);
    }

    public int updateMusicEffectTempo(float f2) {
        if (!this.mInited) {
            return -105;
        }
        return nativeUpdateMusicEffectTempo(this.mNativePtr, f2);
    }

    public int enableMockFace(boolean z) {
        if (!this.mInited) {
            return -105;
        }
        int nativeEnableMockFace = nativeEnableMockFace(this.mNativePtr, z);
        if (nativeEnableMockFace >= 0) {
            this.mForceDetectFace = z;
        }
        return nativeEnableMockFace;
    }

    public int setMusicEffect(String str) {
        if (!this.mInited) {
            return -105;
        }
        long j = this.mNativePtr;
        if (str == null) {
            str = "";
        }
        return nativeSetMusicEffect(j, str, 1.0f);
    }

    public int composerReloadNodes(String[] strArr, int i) {
        if (!this.mInited) {
            return -105;
        }
        if (strArr == null || i <= 0) {
            return -100;
        }
        if (strArr == null || i <= strArr.length) {
            return nativeComposerReloadNodes(this.mNativePtr, strArr, i);
        }
        return -100;
    }

    public int composerSetMode(int i, int i2) {
        if (!this.mInited) {
            return -105;
        }
        if (i < 0 || i2 < 0) {
            return -100;
        }
        return nativeComposerSetMode(this.mNativePtr, i, i2);
    }

    public int composerSetNodes(String[] strArr, int i) {
        if (!this.mInited) {
            return -105;
        }
        if (strArr == null || i <= 0) {
            i = 0;
            strArr = null;
        }
        if (strArr == null || i <= strArr.length) {
            return nativeComposerSetNodes(this.mNativePtr, strArr, i);
        }
        return -105;
    }

    public int setEffect(String str, boolean z) {
        if (!this.mInited) {
            return -105;
        }
        long j = this.mNativePtr;
        if (str == null) {
            str = "";
        }
        return nativeSwitchResource(j, str, z);
    }

    public int setFilter(String str, float f2) {
        if (!this.mInited) {
            return -105;
        }
        long j = this.mNativePtr;
        if (str == null) {
            str = "";
        }
        return nativeSetFilter(j, str, f2);
    }

    public int setCustomEffect(String str, String str2, boolean z) {
        if (!this.mInited) {
            return -105;
        }
        long j = this.mNativePtr;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        if (str2 == null) {
            str2 = "";
        }
        return nativeSwitchCustomResource(j, str3, str2, z);
    }

    public int setReshape(String str, float f2, float f3) {
        if (!this.mInited) {
            return -105;
        }
        long j = this.mNativePtr;
        if (str == null) {
            str = "";
        }
        return nativeSetReshape(j, str, f2, f3);
    }

    public int composerUpdateNode(String str, String str2, float f2) {
        if (!this.mInited) {
            return -105;
        }
        if (TextUtils.isEmpty(str)) {
            str = new String("");
        }
        String str3 = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = new String("");
        }
        return nativeComposerUpdateNode(this.mNativePtr, str3, str2, f2);
    }

    public int switchFilter(String str, String str2, float f2) {
        if (!this.mInited) {
            return -105;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -100;
        }
        return nativeSwitchFilter(this.mNativePtr, str, str2, f2);
    }

    public int sendMessage(int i, int i2, int i3, String str) {
        if (!this.mInited) {
            return -105;
        }
        long j = this.mNativePtr;
        if (str == null) {
            str = "";
        }
        return nativeSendMessage(j, i, i2, i3, str);
    }

    public int setFaceBeauty(String str, float f2, float f3, float f4) {
        if (!this.mInited) {
            return -105;
        }
        int nativeSetFaceBeauty = nativeSetFaceBeauty(this.mNativePtr, str, f2, f3, f4);
        if (nativeSetFaceBeauty != 0) {
            LogUtils.e("EffectRender", "setFaceBeauty fail ret: " + nativeSetFaceBeauty, new Object[0]);
        }
        return nativeSetFaceBeauty;
    }

    public int process(int i, int i2, int i3, int i4, Rotation rotation, double d2) {
        if (!this.mInited) {
            return -105;
        }
        int i5 = i3;
        int i6 = i4;
        nativeSetWidthHeight(this.mNativePtr, i3, i4);
        return nativeProcess(this.mNativePtr, i, i2, rotation.id, d2);
    }

    public int init(String str, String str2, int i, int i2, boolean z, AssetManager assetManager, boolean z2) {
        if (this.mInited) {
            return 1;
        }
        MessageCenter.init();
        if (TextUtils.isEmpty(str)) {
            return -111;
        }
        this.mNativePtr = nativeCreate();
        if (this.mNativePtr == 0) {
            return -112;
        }
        int nativeInit = nativeInit(this.mNativePtr, str, str2, i, i2, z, assetManager, z2);
        String str3 = TAG;
        LogUtils.d(str3, "nativeInit: " + nativeInit, new Object[0]);
        if (nativeInit == 0) {
            this.mInited = true;
            nativeSetForceDetectFace(this.mNativePtr, this.mForceDetectFace);
            nativeSetROIDetect(this.mNativePtr, this.mROIDetect);
        }
        return nativeInit;
    }
}
