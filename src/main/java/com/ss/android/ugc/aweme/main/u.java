package com.ss.android.ugc.aweme.main;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public interface u {
    void flingToIndexChange(Context context, Aweme aweme);

    void onEnd(Context context, Aweme aweme);

    void onVideoPageChange(Context context, Aweme aweme);
}
