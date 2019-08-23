package com.ss.android.ugc.aweme.services.videochoose;

import android.support.v4.app.Fragment;

public interface IVideoChoose {

    public interface Callback {
        void onData(String str);
    }

    Fragment fragment();

    void loadData();
}
