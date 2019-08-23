package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import com.ss.android.ugc.aweme.services.music.IMusicService;

@Keep
public interface IMainService {
    IBusinessGoodsService getBusinessGoodsService();

    ILocalVideoCacheService getLocalVideoCacheService();

    String getStoryEnterFromForMain(Activity activity);

    boolean isMainPage(Context context);

    IMusicService musicService();

    void setStartWithoutSplash(boolean z);
}
