package com.sina.weibo.sdk.api;

import android.os.Bundle;
import com.sina.weibo.sdk.utils.LogUtil;

public final class WeiboMultiMessage {
    public ImageObject imageObject;
    public BaseMediaObject mediaObject;
    public TextObject textObject;

    public WeiboMultiMessage() {
    }

    public final boolean checkArgs() {
        if (this.textObject != null && !this.textObject.checkArgs()) {
            LogUtil.e("WeiboMultiMessage", "checkArgs fail, textObject is invalid");
            return false;
        } else if (this.imageObject != null && !this.imageObject.checkArgs()) {
            LogUtil.e("WeiboMultiMessage", "checkArgs fail, imageObject is invalid");
            return false;
        } else if (this.mediaObject != null && !this.mediaObject.checkArgs()) {
            LogUtil.e("WeiboMultiMessage", "checkArgs fail, mediaObject is invalid");
            return false;
        } else if (this.textObject != null || this.imageObject != null || this.mediaObject != null) {
            return true;
        } else {
            LogUtil.e("WeiboMultiMessage", "checkArgs fail, textObject and imageObject and mediaObject is null");
            return false;
        }
    }

    public WeiboMultiMessage(Bundle bundle) {
        toBundle(bundle);
    }

    public final Bundle toBundle(Bundle bundle) {
        if (this.textObject != null) {
            bundle.putParcelable("_weibo_message_text", this.textObject);
            bundle.putString("_weibo_message_text_extra", this.textObject.toExtraMediaString());
        }
        if (this.imageObject != null) {
            bundle.putParcelable("_weibo_message_image", this.imageObject);
            bundle.putString("_weibo_message_image_extra", this.imageObject.toExtraMediaString());
        }
        if (this.mediaObject != null) {
            bundle.putParcelable("_weibo_message_media", this.mediaObject);
            bundle.putString("_weibo_message_media_extra", this.mediaObject.toExtraMediaString());
        }
        return bundle;
    }

    public final WeiboMultiMessage toObject(Bundle bundle) {
        this.textObject = (TextObject) bundle.getParcelable("_weibo_message_text");
        if (this.textObject != null) {
            this.textObject.toExtraMediaObject(bundle.getString("_weibo_message_text_extra"));
        }
        this.imageObject = (ImageObject) bundle.getParcelable("_weibo_message_image");
        if (this.imageObject != null) {
            this.imageObject.toExtraMediaObject(bundle.getString("_weibo_message_image_extra"));
        }
        this.mediaObject = (BaseMediaObject) bundle.getParcelable("_weibo_message_media");
        if (this.mediaObject != null) {
            this.mediaObject.toExtraMediaObject(bundle.getString("_weibo_message_media_extra"));
        }
        return this;
    }
}
