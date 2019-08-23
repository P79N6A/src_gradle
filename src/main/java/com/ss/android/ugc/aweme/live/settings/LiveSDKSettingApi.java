package com.ss.android.ugc.aweme.live.settings;

import a.i;
import retrofit2.http.GET;

public interface LiveSDKSettingApi {
    @GET(a = "/webcast/setting/")
    i<c> querySettings();
}
