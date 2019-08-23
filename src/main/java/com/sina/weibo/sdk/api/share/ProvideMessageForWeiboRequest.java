package com.sina.weibo.sdk.api.share;

import android.content.Context;
import android.os.Bundle;
import com.sina.weibo.sdk.WeiboAppManager;

public class ProvideMessageForWeiboRequest extends BaseRequest {
    /* access modifiers changed from: package-private */
    public final boolean check(Context context, WeiboAppManager.WeiboInfo weiboInfo, VersionCheckHandler versionCheckHandler) {
        return true;
    }

    public int getType() {
        return 2;
    }

    public ProvideMessageForWeiboRequest() {
    }

    public ProvideMessageForWeiboRequest(Bundle bundle) {
        fromBundle(bundle);
    }
}
