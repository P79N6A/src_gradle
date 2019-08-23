package com.sina.weibo.sdk.api.share;

import android.content.Context;
import android.os.Bundle;
import com.sina.weibo.sdk.WeiboAppManager;
import com.sina.weibo.sdk.api.WeiboMultiMessage;

public class SendMultiMessageToWeiboRequest extends BaseRequest {
    public WeiboMultiMessage multiMessage;

    public int getType() {
        return 1;
    }

    public SendMultiMessageToWeiboRequest() {
    }

    public SendMultiMessageToWeiboRequest(Bundle bundle) {
        fromBundle(bundle);
    }

    public void fromBundle(Bundle bundle) {
        super.fromBundle(bundle);
        this.multiMessage = new WeiboMultiMessage(bundle);
    }

    public void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        bundle.putAll(this.multiMessage.toBundle(bundle));
    }

    /* access modifiers changed from: package-private */
    public final boolean check(Context context, WeiboAppManager.WeiboInfo weiboInfo, VersionCheckHandler versionCheckHandler) {
        if (this.multiMessage == null || weiboInfo == null || !weiboInfo.isLegal()) {
            return false;
        }
        if (versionCheckHandler == null || versionCheckHandler.checkRequest(context, weiboInfo, this.multiMessage)) {
            return this.multiMessage.checkArgs();
        }
        return false;
    }
}
