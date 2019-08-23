package com.sina.weibo.sdk.api.share;

import android.content.Context;
import android.os.Bundle;
import com.sina.weibo.sdk.WeiboAppManager;

public abstract class BaseRequest extends Base {
    public String packageName;

    /* access modifiers changed from: package-private */
    public abstract boolean check(Context context, WeiboAppManager.WeiboInfo weiboInfo, VersionCheckHandler versionCheckHandler);

    public void fromBundle(Bundle bundle) {
        this.transaction = bundle.getString("_weibo_transaction");
        this.packageName = bundle.getString("_weibo_appPackage");
    }

    public void toBundle(Bundle bundle) {
        bundle.putInt("_weibo_command_type", getType());
        bundle.putString("_weibo_transaction", this.transaction);
    }
}
