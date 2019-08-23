package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import java.util.List;

public class SharePoiContent extends BaseContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cover_url")
    private List<UrlModel> coverUrl;
    @SerializedName("map_url")
    private UrlModel mapUrl;
    @SerializedName("poi_icon_url")
    private UrlModel poiIconUrl;
    @SerializedName("poi_id")
    private String poiId;
    @SerializedName("push_detail")
    private String pushDetail;
    @SerializedName("title")
    private String title;
    @SerializedName("user_count")
    private int userCount;

    public List<UrlModel> getCoverUrl() {
        return this.coverUrl;
    }

    public UrlModel getMapUrl() {
        return this.mapUrl;
    }

    public UrlModel getPoiIconUrl() {
        return this.poiIconUrl;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getTitle() {
        return this.title;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public IShareService.ShareStruct generateShareStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51169, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51169, new Class[0], IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.itemType = "poi";
        shareStruct.videoCover = getMapUrl();
        return shareStruct;
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51167, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51167, new Class[0], String.class);
        }
        return GlobalContext.getContext().getResources().getString(C0906R.string.awa, new Object[]{this.pushDetail});
    }

    public void setCoverUrl(List<UrlModel> list) {
        this.coverUrl = list;
    }

    public void setMapUrl(UrlModel urlModel) {
        this.mapUrl = urlModel;
    }

    public void setPoiIconUrl(UrlModel urlModel) {
        this.poiIconUrl = urlModel;
    }

    public void setPoiId(String str) {
        this.poiId = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public static SharePoiContent fromShareStruct(IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51168, new Class[]{IShareService.ShareStruct.class}, SharePoiContent.class)) {
            return (SharePoiContent) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51168, new Class[]{IShareService.ShareStruct.class}, SharePoiContent.class);
        }
        SharePoiContent sharePoiContent = new SharePoiContent();
        sharePoiContent.poiId = shareStruct2.poiId;
        sharePoiContent.title = shareStruct2.extraParams.get("poi_name");
        sharePoiContent.pushDetail = shareStruct2.extraParams.get("simple_addr");
        sharePoiContent.userCount = Integer.parseInt(shareStruct2.extraParams.get("user_count"));
        String str = shareStruct2.extraParams.get("map_url");
        if (!TextUtils.isEmpty(str)) {
            sharePoiContent.mapUrl = (UrlModel) JSON.parseObject(str, UrlModel.class);
        }
        String str2 = shareStruct2.extraParams.get("cover_url");
        if (!TextUtils.isEmpty(str2)) {
            sharePoiContent.coverUrl = (List) JSON.parseObject(str2, List.class);
        }
        String str3 = shareStruct2.extraParams.get("poi_icon_url");
        if (!TextUtils.isEmpty(str3)) {
            sharePoiContent.poiIconUrl = (UrlModel) JSON.parseObject(str3, UrlModel.class);
        }
        sharePoiContent.type = 0;
        return sharePoiContent;
    }
}
