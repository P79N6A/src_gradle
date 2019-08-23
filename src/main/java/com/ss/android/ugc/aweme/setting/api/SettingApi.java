package com.ss.android.ugc.aweme.setting.api;

import a.i;
import com.google.common.util.concurrent.q;
import com.google.gson.JsonElement;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import com.ss.android.ugc.aweme.setting.model.SettingUserHasSetPwd;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SettingApi {
    @GET(a = "/aweme/v1/settings/")
    q<JsonElement> queryRawSetting(@Query(a = "oid") int i, @Query(a = "last_settings_version") String str);

    @GET(a = "/aweme/v1/settings/")
    q<IESSettings> querySetting(@Query(a = "oid") int i, @Query(a = "last_settings_version") String str);

    @GET(a = "/passport/password/has_set/")
    i<SettingUserHasSetPwd> queryUserHasSetPwd();
}
