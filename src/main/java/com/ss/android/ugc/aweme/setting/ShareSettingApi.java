package com.ss.android.ugc.aweme.setting;

import com.google.common.util.concurrent.q;
import com.ss.android.ugc.aweme.setting.model.ShareSettings;
import retrofit2.http.GET;

public interface ShareSettingApi {
    @GET(a = "/aweme/v2/platform/share/settings/")
    q<ShareSettings> queryRawSetting();
}
