package com.ss.android.ugc.aweme.shortvideo;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.http.a.b.f;
import com.ss.android.ugc.aweme.app.api.a;
import com.ss.android.ugc.aweme.tools.AVApi;

@Keep
public class AVApiImpl implements AVApi {
    public static ChangeQuickRedirect changeQuickRedirect;

    public String getAPI_URL_PREFIX_SI() {
        return "https://aweme.snssdk.com";
    }

    @Deprecated
    public <T> T executeGetJSONObject(String str, Class<T> cls, String str2) throws Exception {
        return a.a(0, str, cls, str2, (f) null);
    }
}
