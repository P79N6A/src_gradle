package com.ss.avframework.effect;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.bef.effectsdk.message.MessageCenter;
import com.ss.avframework.capture.audio.AudioCapturer;
import com.ss.avframework.engine.NativeObject;
import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
public class EffectWrapper extends NativeObject {
    public Long mDetectFlag = 0L;
    private EffectAudioSource mEffectAudioSource;
    private FaceDetectListener mFaceListener;
    private boolean mFromExtern;
    private MicrophoneDetectListener mMicrophoneListener;
    private boolean mValid;

    @JNINamespace("jni")
    class EffectAudioSource extends AudioCapturer {
        private int mChannel;
        private int mStatus;

        private native void nativeCreate(long j);

        private native void nativePause();

        private native void nativeResume();

        private native int nativeStart();

        private native void nativeStop();

        public void pause() {
            nativePause();
        }

        public void resume() {
            nativeResume();
        }

        public int status() {
            return this.mStatus;
        }

        public int updateChannel() {
            return this.mChannel;
        }

        public void stop() {
            if (this.mStatus != 0 && this.mStatus != 2) {
                nativeStop();
                this.mStatus = 2;
            }
        }

        public void start() {
            if (this.mStatus == 0 || this.mStatus == 2) {
                int nativeStart = nativeStart();
                if (nativeStart == 0) {
                    this.mStatus = 1;
                    return;
                }
                throw new IllegalStateException("EffectAudioSource.Start failure (" + nativeStart + ")");
            }
        }

        public EffectAudioSource(long j) {
            nativeCreate(j);
        }

        public void setOutputFormat(int i, int i2, int i3) {
            this.mChannel = i2;
            super.setOutputFormat(i, i2, i3);
        }
    }

    public interface FaceDetectListener {
        void onFaceDetectResultCallback(int i);
    }

    public interface MicrophoneDetectListener {
        void onMicrophoneDetectResultCallback(float f2);
    }

    private static String NonNull(String str) {
        return str == null ? "" : str;
    }

    private native int nativeComposerReloadNodes(String[] strArr, int i);

    private native int nativeComposerSetMode(int i, int i2);

    private native int nativeComposerSetNodes(String[] strArr, int i);

    private native int nativeComposerUpdateNode(String str, String str2, float f2);

    private native int nativeConfigEffect(int i, int i2, String str, String str2, boolean z, boolean z2);

    private native void nativeCreateEffectWrapper();

    private static native String nativeGetEffectVersion();

    private native String nativeName();

    private native int nativePauseEffect();

    private native int nativeProcess(int i, int i2, int i3, int i4, long j, Long l, boolean z, int i5);

    private native int nativeResumeEffect();

    private native int nativeSendEffectMsg(int i, int i2, int i3, String str);

    private native int nativeSetAssetManager(AssetManager assetManager);

    private native int nativeSetBeautify(String str, float f2, float f3);

    private native int nativeSetBeautifyWithSharp(String str, float f2, float f3, float f4);

    private native int nativeSetCustomEffect(String str, String str2);

    private native int nativeSetEffect(String str);

    private native int nativeSetFaceAttribute(boolean z);

    private native int nativeSetFilter(String str, float f2);

    private native int nativeSetReshape(String str, float f2, float f3);

    private native int nativeSetResourceFinder(Object obj);

    private native int nativeSetTwoFilters(String str, String str2, float f2);

    public AudioCapturer getEffectAudioSource() {
        return this.mEffectAudioSource;
    }

    public boolean valid() {
        return this.mValid;
    }

    public static String getEffectVersion() {
        return nativeGetEffectVersion();
    }

    public String name() {
        if (!this.mValid) {
            return "Dummy Effect";
        }
        return nativeName();
    }

    public int pauseEffect() {
        if (!this.mValid) {
            return 0;
        }
        return nativePauseEffect();
    }

    public int resumeEffect() {
        if (!this.mValid) {
            return 0;
        }
        return nativeResumeEffect();
    }

    public EffectWrapper() {
        if (checkVersion()) {
            nativeCreateEffectWrapper();
            createEffectAudioSource();
            MessageCenter.init();
        }
        this.mFromExtern = false;
    }

    private boolean checkVersion() {
        try {
            this.mValid = !TextUtils.isEmpty(getEffectVersion());
        } catch (Throwable unused) {
            this.mValid = false;
        }
        return this.mValid;
    }

    public void createEffectAudioSource() {
        if (this.mNativeObj != 0) {
            this.mEffectAudioSource = new EffectAudioSource(this.mNativeObj);
        }
    }

    public synchronized void release() {
        MessageCenter.destroy();
        this.mFaceListener = null;
        if (!this.mFromExtern) {
            super.release();
        }
        if (this.mEffectAudioSource != null) {
            this.mEffectAudioSource.release();
            this.mEffectAudioSource = null;
        }
    }

    public void setNativeObj(long j) {
        super.setNativeObj(j);
    }

    public int setAssetManager(AssetManager assetManager) {
        return nativeSetAssetManager(assetManager);
    }

    public void setFaceDetectResultListener(FaceDetectListener faceDetectListener) {
        if (this.mValid) {
            this.mFaceListener = faceDetectListener;
        }
    }

    public void setMicrophoneDetectResultListener(MicrophoneDetectListener microphoneDetectListener) {
        if (this.mValid) {
            this.mMicrophoneListener = microphoneDetectListener;
        }
    }

    public int setResourceFinder(Object obj) {
        return nativeSetResourceFinder(obj);
    }

    @CalledByNative
    public void onFaceDetectResultCallback(int i) {
        if (this.mValid && this.mFaceListener != null) {
            this.mFaceListener.onFaceDetectResultCallback(i);
        }
    }

    @CalledByNative
    public void onMicrophoneDetectResultCallback(float f2) {
        if (this.mValid && this.mMicrophoneListener != null) {
            this.mMicrophoneListener.onMicrophoneDetectResultCallback(f2);
        }
    }

    public int setEffect(String str) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetEffect(NonNull(str));
    }

    public void setEffectMsgListener(MessageCenter.a aVar) {
        if (this.mValid) {
            MessageCenter.setListener(aVar);
        }
    }

    public int setFaceAttribute(boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetFaceAttribute(z);
    }

    public EffectWrapper(long j) {
        this.mNativeObj = j;
        this.mFromExtern = true;
        if (checkVersion()) {
            createEffectAudioSource();
            MessageCenter.init();
        }
    }

    public int composerSetMode(int i, int i2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerSetMode(i, i2);
    }

    public int composerSetNodes(String[] strArr, int i) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerSetNodes(strArr, i);
    }

    public int setFilter(String str, float f2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetFilter(NonNull(str), f2);
    }

    public int composerReloadNodes(String[] strArr, int i) {
        if (!this.mValid) {
            return 0;
        }
        if (strArr == null || strArr.length == 0 || i <= 0) {
            return -1;
        }
        return nativeComposerReloadNodes(strArr, i);
    }

    public int setCustomEffect(String str, String str2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetCustomEffect(NonNull(str), NonNull(str2));
    }

    public int setBeautify(String str, float f2, float f3) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetBeautify(NonNull(str), f2, f3);
    }

    public int setReshape(String str, float f2, float f3) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetReshape(NonNull(str), f2, f3);
    }

    public int composerUpdateNode(String str, String str2, float f2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerUpdateNode(NonNull(str), NonNull(str2), f2);
    }

    public int setFilter(String str, String str2, float f2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetTwoFilters(NonNull(str), NonNull(str2), f2);
    }

    @CalledByNative
    public int onReceiveEffectMessage(int i, int i2, int i3, String str) {
        if (!this.mValid) {
            return -1;
        }
        return 0;
    }

    public int sendEffectMsg(int i, int i2, int i3, String str) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSendEffectMsg(i, i2, i3, NonNull(str));
    }

    public int setBeautify(String str, float f2, float f3, float f4) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetBeautifyWithSharp(NonNull(str), f2, f3, f4);
    }

    public void configEffect(int i, int i2, String str, String str2, boolean z, boolean z2) {
        if (this.mValid) {
            nativeConfigEffect(i, i2, NonNull(str), NonNull(str2), z, z2);
        }
    }

    public int process(int i, int i2, int i3, int i4, long j, boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcess(i, i2, i3, i4, j, this.mDetectFlag, z, 0);
    }

    public int process(int i, int i2, int i3, int i4, int i5, long j, boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcess(i, i2, i3, i4, j, this.mDetectFlag, z, i5);
    }
}
