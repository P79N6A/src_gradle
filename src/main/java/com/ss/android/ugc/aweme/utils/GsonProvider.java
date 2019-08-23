package com.ss.android.ugc.aweme.utils;

import android.support.annotation.Keep;
import com.google.gson.Gson;

@Keep
public interface GsonProvider {
    Gson getGson();

    Gson getSettingGson();
}
