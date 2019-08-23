package com.ss.android.ugc.aweme.services.story;

import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;

@Keep
public interface IStoryRecordService {

    public interface IStoryRecordFragment {
        Fragment asFragment();

        boolean keyDown(int i, KeyEvent keyEvent);
    }

    IStoryRecordFragment convertFragment(Fragment fragment);

    IStoryRecordFragment create(Bundle bundle);

    boolean isStoryRecording();
}
