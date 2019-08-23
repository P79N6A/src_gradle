package com.ss.android.ugc.aweme.poi.model;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

public class al implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("pic_large")
    public UrlModel picLarge;
    @SerializedName("pic_medium")
    public UrlModel picMedium;
    @SerializedName("tag_list")
    public List<at> poiTagList;
    @SerializedName("title")
    public String title;
    @SerializedName("upload_image_watermark")
    public String uploadImageWaterMark;

    public UrlModel getPicMedium() {
        return this.picMedium;
    }

    public String getLarge() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65136, new Class[0], String.class)) {
            return this.picLarge.getUrlList().get(0);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65136, new Class[0], String.class);
    }

    public String getMedium() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65135, new Class[0], String.class)) {
            return this.picMedium.getUrlList().get(0);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65135, new Class[0], String.class);
    }

    public String getTagName() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65137, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65137, new Class[0], String.class);
        } else if (CollectionUtils.isEmpty(this.poiTagList)) {
            return "";
        } else {
            return this.poiTagList.get(0).f59891b;
        }
    }

    public int getTagType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65138, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65138, new Class[0], Integer.TYPE)).intValue();
        } else if (CollectionUtils.isEmpty(this.poiTagList)) {
            return 0;
        } else {
            return this.poiTagList.get(0).f59892c;
        }
    }
}
