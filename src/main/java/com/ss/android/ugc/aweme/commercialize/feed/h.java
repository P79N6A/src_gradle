package com.ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public interface h {
    boolean clickAdTransform(Context context, Aweme aweme, int i);

    void clickAvatar(Context context, Aweme aweme, String str);

    void clickDiggContainer(Context context, Aweme aweme, boolean z);

    void clickMusic(Context context, Aweme aweme);

    void clickUserName(Context context, Aweme aweme);
}
