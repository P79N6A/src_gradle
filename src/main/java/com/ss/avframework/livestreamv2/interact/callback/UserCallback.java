package com.ss.avframework.livestreamv2.interact.callback;

import android.view.SurfaceView;

public interface UserCallback {
    void onFirstRemoteAudioFrame(int i);

    void onFirstRemoteVideoFrame(int i, SurfaceView surfaceView);

    void onTalkStateUpdated(String[] strArr, boolean[] zArr);

    void onUserJoined(int i);

    void onUserLeaved(int i);
}
