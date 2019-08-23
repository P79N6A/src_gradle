package com.sina.weibo.sdk.api.share;

import android.content.Context;
import android.os.Bundle;
import com.sina.weibo.sdk.api.WeiboMessage;

public class ProvideMessageForWeiboResponse extends BaseResponse {
    public WeiboMessage message;

    public int getType() {
        return 2;
    }

    public ProvideMessageForWeiboResponse() {
    }

    public ProvideMessageForWeiboResponse(Bundle bundle) {
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
    public final boolean check(Context context, VersionCheckHandler versionCheckHandler) {
        if (this.message == null) {
            return false;
        }
        if (versionCheckHandler == null || versionCheckHandler.checkResponse(context, this.reqPackageName, this.message)) {
            return this.message.checkArgs();
        }
        return false;
    }
}
