package com.sina.weibo.sdk.api.share;

import android.content.Context;
import android.os.Bundle;

public class SendMessageToWeiboResponse extends BaseResponse {
    /* access modifiers changed from: package-private */
    public final boolean check(Context context, VersionCheckHandler versionCheckHandler) {
        return true;
    }

    public int getType() {
        return 1;
    }

    public SendMessageToWeiboResponse() {
    }

    public SendMessageToWeiboResponse(Bundle bundle) {
        fromBundle(bundle);
    }
}
