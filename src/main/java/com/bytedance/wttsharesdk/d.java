package com.bytedance.wttsharesdk;

import android.os.Bundle;
import com.bytedance.wttsharesdk.entity.RepostEntity;
import com.bytedance.wttsharesdk.entity.b;
import com.bytedance.wttsharesdk.entity.c;
import com.bytedance.wttsharesdk.entity.e;
import java.io.Serializable;

public final class d implements Serializable {
    public b mImageEntity;
    public c mMultiImageEntity;
    public RepostEntity mRepostEntity;
    public String mSchema;
    public e mTextEntity;
    public String mUrl;
    public String mUrlTitle;

    public final d withImageEntity(b bVar) {
        this.mImageEntity = bVar;
        return this;
    }

    public final d withMultiImageEntity(c cVar) {
        this.mMultiImageEntity = cVar;
        return this;
    }

    public final d withRepostEntity(RepostEntity repostEntity) {
        this.mRepostEntity = repostEntity;
        return this;
    }

    public final d withTextEntity(e eVar) {
        this.mTextEntity = eVar;
        return this;
    }

    public final d withUrl(String str) {
        this.mUrl = str;
        return this;
    }

    public final d withUrlTitle(String str) {
        this.mUrlTitle = str;
        return this;
    }

    public final d toObject(Bundle bundle) {
        this.mTextEntity = (e) bundle.getParcelable("toutiao_share_text");
        this.mImageEntity = (b) bundle.getParcelable("toutiao_share_image");
        this.mMultiImageEntity = (c) bundle.getParcelable("toutiao_share_images");
        this.mRepostEntity = (RepostEntity) bundle.getParcelable("toutiao_share_repost");
        return this;
    }

    public final Bundle toBundle(Bundle bundle) {
        if (this.mTextEntity != null) {
            bundle.putParcelable("toutiao_share_text", this.mTextEntity);
        } else {
            bundle.putParcelable("toutiao_share_text", null);
        }
        if (this.mImageEntity != null) {
            bundle.putParcelable("toutiao_share_image", this.mImageEntity);
        } else {
            bundle.putParcelable("toutiao_share_image", null);
        }
        if (this.mMultiImageEntity != null) {
            bundle.putParcelable("toutiao_share_images", this.mMultiImageEntity);
        } else {
            bundle.putParcelable("toutiao_share_images", null);
        }
        if (this.mRepostEntity != null) {
            bundle.putInt("toutiao_share_type", 1);
            bundle.putParcelable("toutiao_share_repost", this.mRepostEntity);
        } else {
            bundle.putParcelable("toutiao_share_repost", null);
        }
        if (this.mUrl != null) {
            bundle.putString("toutiao_share_url", this.mUrl);
        }
        if (this.mUrlTitle != null) {
            bundle.putString("toutiao_share_urltitle", this.mUrlTitle);
        }
        return bundle;
    }
}
