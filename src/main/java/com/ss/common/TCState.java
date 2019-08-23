package com.ss.common;

public class TCState {

    public interface StateListener {
        void onError(TCStateType tCStateType, int i, String str);

        void onInfo(TCStateType tCStateType, int i, String str);
    }

    public enum TCStateType {
        CameraOpenFail,
        PreProcessFail,
        EffectInitFail,
        EffectProcessFail,
        NotConfigEffect,
        EffectInitSucceed
    }
}
