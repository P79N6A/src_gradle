package com.sina.weibo.sdk.api;

import android.os.Bundle;
import com.sina.weibo.sdk.utils.LogUtil;

public final class WeiboMessage {
    public BaseMediaObject mediaObject;

    public WeiboMessage() {
    }

    public final boolean checkArgs() {
        if (this.mediaObject == null) {
            LogUtil.e("Weibo.WeiboMessage", "checkArgs fail, mediaObject is null");
            return false;
        } else if (this.mediaObject == null || this.mediaObject.checkArgs()) {
            return true;
        } else {
            LogUtil.e("Weibo.WeiboMessage", "checkArgs fail, mediaObject is invalid");
            return false;
        }
    }

    public WeiboMessage(Bundle bundle) {
        toBundle(bundle);
    }

    public final Bundle toBundle(Bundle bundle) {
        if (this.mediaObject != null) {
            bundle.putParcelable("_weibo_message_media", this.mediaObject);
            bundle.putString("_weibo_message_media_extra", this.mediaObject.toExtraMediaString());
        }
        return bundle;
    }

    public final WeiboMessage toObject(Bundle bundle) {
        this.mediaObject = (BaseMediaObject) bundle.getParcelable("_weibo_message_media");
        if (this.mediaObject != null) {
            this.mediaObject.toExtraMediaObject(bundle.getString("_weibo_message_media_extra"));
        }
        return this;
    }
}
