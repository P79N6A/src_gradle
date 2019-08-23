package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class VideoCreation extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String mCoverUri;
    public UploadUrlBean mCurrentUrl;
    @SerializedName("material_id")
    public String materialId;
    private int position;
    @SerializedName("upload_url")
    public String uploadUrl;
    @SerializedName("url_list")
    public List<UploadUrlBean> uploadUrllistBean;
    public int videoHeight;
    public int videoWidth;

    public UploadUrlBean getCurrentUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77699, new Class[0], UploadUrlBean.class)) {
            return (UploadUrlBean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77699, new Class[0], UploadUrlBean.class);
        }
        if (!CollectionUtils.isEmpty(this.uploadUrllistBean)) {
            this.mCurrentUrl = this.uploadUrllistBean.get(0);
        }
        return this.mCurrentUrl;
    }

    public boolean hasNext() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77700, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77700, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.position < this.uploadUrllistBean.size()) {
            z = true;
        }
        return z;
    }

    public UploadUrlBean nextUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77701, new Class[0], UploadUrlBean.class)) {
            return (UploadUrlBean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77701, new Class[0], UploadUrlBean.class);
        } else if (CollectionUtils.isEmpty(this.uploadUrllistBean)) {
            return null;
        } else {
            List<UploadUrlBean> list = this.uploadUrllistBean;
            int i = this.position + 1;
            this.position = i;
            this.mCurrentUrl = list.get(i % this.uploadUrllistBean.size());
            return this.mCurrentUrl;
        }
    }

    public VideoCreation setCoverUri(String str) {
        this.mCoverUri = str;
        return this;
    }

    public VideoCreation setMaterialId(String str) {
        this.materialId = str;
        return this;
    }

    public VideoCreation setVideoHeight(int i) {
        this.videoHeight = i;
        return this;
    }

    public VideoCreation setVideoWidth(int i) {
        this.videoWidth = i;
        return this;
    }
}
