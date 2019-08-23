package com.ss.android.ugc.aweme.im.sdk.chat.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public class ShareWebContent extends BaseContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("desc")
    private String desc;
    @SerializedName("cover_url")
    private String image;
    @SerializedName("push_detail")
    private String pushDetail;
    @SerializedName("title")
    private String title;
    @SerializedName("link_url")
    private String url;

    public String getDesc() {
        return this.desc;
    }

    public String getImage() {
        return this.image;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public IShareService.ShareStruct generateShareStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51179, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51179, new Class[0], IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.itemType = "web";
        shareStruct.thumbUrl = getImage();
        return shareStruct;
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51177, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51177, new Class[0], String.class);
        }
        return GlobalContext.getContext().getString(C0906R.string.azp, new Object[]{getTitle()});
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public static ShareWebContent fromShareStruct(IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51178, new Class[]{IShareService.ShareStruct.class}, ShareWebContent.class)) {
            return (ShareWebContent) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51178, new Class[]{IShareService.ShareStruct.class}, ShareWebContent.class);
        }
        ShareWebContent shareWebContent = new ShareWebContent();
        shareWebContent.setTitle(shareStruct2.title);
        shareWebContent.setDesc(shareStruct2.description);
        shareWebContent.setImage(shareStruct2.thumbUrl);
        shareWebContent.setUrl(shareStruct2.url);
        shareWebContent.setPushDetail(shareStruct2.title);
        return shareWebContent;
    }
}
