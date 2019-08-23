package com.ss.avframework.livestreamv2.filter;

import android.content.res.AssetManager;

public interface ITTVideoEffectProcessor {

    public interface EffectMsgListener {
        void onMessage(int i, int i2, int i3, String str);
    }

    public interface FaceDetectListener {
        void onFaceDetectResultCallback(int i);
    }

    public interface MicrophoneDetectListener {
        void onMicrophoneDetectResultCallback(float f2);
    }

    int composerReloadNodes(String[] strArr, int i);

    int composerSetMode(int i, int i2);

    int composerSetNodes(String[] strArr, int i);

    int composerUpdateNode(String str, String str2, float f2);

    void configEffect(int i, int i2, String str, String str2, boolean z);

    void configEffect(int i, int i2, String str, String str2, boolean z, AssetManager assetManager);

    void configEffect(int i, int i2, String str, String str2, boolean z, Object obj);

    int enableMockFace(boolean z);

    int pauseEffect();

    int resumeEffect();

    int sendEffectMsg(int i, int i2, int i3, String str);

    int setBeautify(String str, float f2, float f3);

    int setBeautify(String str, float f2, float f3, float f4);

    int setCustomEffect(String str, String str2);

    int setEffect(String str);

    int setEffect(String str, boolean z);

    void setEffectMsgListener(EffectMsgListener effectMsgListener);

    int setFaceAttribute(boolean z);

    void setFaceDetectListener(FaceDetectListener faceDetectListener);

    int setFilter(String str, float f2);

    int setFilter(String str, String str2, float f2);

    void setMicrophoneDetectListener(MicrophoneDetectListener microphoneDetectListener);

    int setReshape(String str, float f2, float f3);

    int startEffectAudio();

    int stopEffectAudio();
}
