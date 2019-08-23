package com.ss.android.ugc.aweme.feed.panel;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public interface h {
    void changePageBreak(Context context, Aweme aweme, Aweme aweme2, String str, long j, int i);

    void destroyBreak(Context context, Aweme aweme, String str, long j, int i);

    void handleVideoEventAvailable(Context context, Aweme aweme);

    void onPageSelected(Context context, Aweme aweme);

    void onPlayCompleted(Context context, Aweme aweme, long j, int i);

    void play(Context context, Aweme aweme, int i);

    void rePlay(Context context, Aweme aweme, int i);
}
