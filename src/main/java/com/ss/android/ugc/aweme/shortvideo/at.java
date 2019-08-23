package com.ss.android.ugc.aweme.shortvideo;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.video.b;

public class at extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("save_model")
    public AVUploadSaveModel mSaveModel;
    public transient String materialId;
    @SerializedName("open_platform_name")
    public String openPlatformName;
    public String videoCoverPath;

    @Nullable
    public String getVideoCoverPath() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 74049, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 74049, new Class[0], String.class);
        } else if (b.b(this.videoCoverPath)) {
            return this.videoCoverPath;
        } else {
            return null;
        }
    }
}
