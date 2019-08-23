package com.ss.android.ugc.aweme.tools;

import android.support.annotation.Keep;

@Keep
public interface AVApi {
    <T> T executeGetJSONObject(String str, Class<T> cls, String str2) throws Exception;

    String getAPI_URL_PREFIX_SI();
}
