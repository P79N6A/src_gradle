package com.ss.android.ugc.aweme.services;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import com.ss.android.ugc.aweme.shortvideo.cut.gif.a.a;

public interface IVideo2GifService {

    public interface ConvertListener {
        void onConfigured(@NonNull a aVar);

        void onDone(boolean z);

        void onStart();

        void onUpdateProgress(int i);
    }

    void convert2Gif(@NonNull com.ss.android.ugc.aweme.share.b.a aVar, @NonNull ConvertListener convertListener);

    Fragment getGifCutVideoFragment(@NonNull com.ss.android.ugc.aweme.share.b.a aVar);
}
