package com.ss.android.ugc.aweme.services.recording;

import android.arch.lifecycle.Lifecycle;
import android.support.v4.app.FragmentManager;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.shortvideo.j.b;
import com.ss.android.ugc.aweme.shortvideo.j.d;

public interface IRecordingOperationPanel {
    RemoteImageView backgroundView();

    void closeRecording();

    b filterModule();

    FragmentManager fragmentManager();

    int getCameraPos();

    Lifecycle getLifecycle();

    void setCameraPos(int i);

    d videoRecorder();
}
