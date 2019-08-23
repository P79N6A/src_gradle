package com.ss.android.ugc.aweme.utils;

import android.support.annotation.Keep;
import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.app.api.BaseResponseObjectTypeAdapterFactory;
import com.ss.android.ugc.aweme.app.api.CollectionTypeAdapterFactory;
import com.ss.android.ugc.aweme.app.api.ModelCheckerTypeAdapterFactory;
import com.ss.android.ugc.aweme.app.api.UserTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.MusicTypeAdapterFactory;

@Keep
public class GsonHolder implements GsonProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Gson gson;
    private final Gson settingGson = this.gson;

    public Gson getGson() {
        return this.gson;
    }

    public Gson getSettingGson() {
        return this.settingGson;
    }

    private GsonHolder() {
        GsonBuilder createAdapterGsonBuilder = JSON.createAdapterGsonBuilder();
        createAdapterGsonBuilder.registerTypeAdapterFactory(new ModelCheckerTypeAdapterFactory());
        createAdapterGsonBuilder.registerTypeAdapterFactory(new CollectionTypeAdapterFactory());
        createAdapterGsonBuilder.registerTypeAdapterFactory(new MusicTypeAdapterFactory());
        createAdapterGsonBuilder.registerTypeAdapterFactory(new UserTypeAdapterFactory());
        createAdapterGsonBuilder.registerTypeAdapterFactory(new BaseResponseObjectTypeAdapterFactory());
        this.gson = createAdapterGsonBuilder.create();
    }
}
