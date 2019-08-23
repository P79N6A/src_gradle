package com.sina.weibo.sdk.api.share;

import android.content.Context;
import android.os.Bundle;
import com.sina.weibo.sdk.WeiboAppManager;
import com.sina.weibo.sdk.api.WeiboMessage;

public class SendMessageToWeiboRequest extends BaseRequest {
    public WeiboMessage message;

    public int getType() {
        return 1;
    }

    public SendMessageToWeiboRequest() {
    }

    public SendMessageToWeiboRequest(Bundle bundle) {
        fromBundle(bundle);
    }

    public void fromBundle(Bundle bundle) {
        super.fromBundle(bundle);
        this.message = new WeiboMessage(bundle);
    }

    public void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        bundle.putAll(this.message.toBundle(bundle));
    }

    /* access modifiers changed from: package-private */
    public final boolean check(Context context, WeiboAppManager.WeiboInfo weiboInfo, VersionCheckHandler versionCheckHandler) {
        if (this.message == null || weiboInfo == null || !weiboInfo.isLegal()) {
            return false;
        }
        if (versionCheckHandler == null || versionCheckHandler.checkRequest(context, weiboInfo, this.message)) {
            return this.message.checkArgs();
        }
        return false;
    }
}
