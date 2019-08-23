package com.ss.android.ugc.aweme.services;

import android.support.annotation.Keep;

@Keep
public interface IMicroAppService {
    boolean enableJssdkCheck();

    boolean isMiniAppPluginInstalled();
}
