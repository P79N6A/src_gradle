package com.ss.android.ugc.aweme.theme;

import com.bytedance.retrofit2.http.GET;
import com.google.common.util.concurrent.q;
import com.ss.android.ugc.aweme.theme.model.Theme;

public interface ThemeApi {
    @GET("/aweme/v1/theme/package/")
    q<Theme> queryTheme();
}
