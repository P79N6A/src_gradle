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
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.List;

public class ShareUserContent extends BaseContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("avatar")
    private UrlModel avatar;
    @SerializedName("cover_url")
    private List<UrlModel> awemeCoverList;
    @SerializedName("desc")
    private String desc;
    @SerializedName("name")
    private String name;
    @SerializedName("push_detail")
    private String pushDetail;
    @SerializedName("uid")
    private String uid;

    public UrlModel getAvatar() {
        return this.avatar;
    }

    public List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getName() {
        return this.name;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getUid() {
        return this.uid;
    }

    public IShareService.ShareStruct generateShareStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51176, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51176, new Class[0], IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.itemType = AllStoryActivity.f73306b;
        shareStruct.videoCover = getAvatar();
        return shareStruct;
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51174, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51174, new Class[0], String.class);
        }
        return GlobalContext.getContext().getString(C0906R.string.azj, new Object[]{getName()});
    }

    public void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public static ShareUserContent fromShareStruct(IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51175, new Class[]{IShareService.ShareStruct.class}, ShareUserContent.class)) {
            return (ShareUserContent) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51175, new Class[]{IShareService.ShareStruct.class}, ShareUserContent.class);
        }
        ShareUserContent shareUserContent = new ShareUserContent();
        shareUserContent.uid = shareStruct2.extraParams.get("uid");
        shareUserContent.name = shareStruct2.extraParams.get("name");
        shareUserContent.desc = shareStruct2.extraParams.get("desc");
        shareUserContent.avatar = shareStruct2.videoCover;
        shareUserContent.pushDetail = shareUserContent.name;
        String str = shareStruct2.extraParams.get("aweme_cover_list");
        if (!TextUtils.isEmpty(str)) {
            shareUserContent.awemeCoverList = (List) JSON.parseObject(str, List.class);
        }
        return shareUserContent;
    }
}
