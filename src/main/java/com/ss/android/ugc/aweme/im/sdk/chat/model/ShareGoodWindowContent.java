package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import java.util.HashMap;
import java.util.Locale;

public class ShareGoodWindowContent extends BaseContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("avatar")
    private UrlModel avatar;
    @SerializedName("entrance_location")
    private String entranceLocation = "message";
    @SerializedName("name")
    private String name;
    @SerializedName("sec_user_id")
    private String secUserId = "";
    @SerializedName("title")
    private String title;
    @SerializedName("user_id")
    private String userId;

    public UrlModel getAvatar() {
        return this.avatar;
    }

    public String getEntranceLocation() {
        return this.entranceLocation;
    }

    public String getName() {
        return this.name;
    }

    public String getSecUserId() {
        return this.secUserId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUserId() {
        return this.userId;
    }

    public IShareService.ShareStruct generateShareStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51153, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51153, new Class[0], IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.itemType = "good_window";
        shareStruct.videoCover = getAvatar();
        shareStruct.extraParams = new HashMap<>();
        shareStruct.extraParams.put("user_id", getUserId());
        if (!TextUtils.isEmpty(getSecUserId())) {
            shareStruct.extraParams.put("sec_user_id", getSecUserId());
        }
        shareStruct.extraParams.put("name", getName());
        return shareStruct;
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51151, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51151, new Class[0], String.class);
        }
        return String.format(Locale.getDefault(), GlobalContext.getContext().getString(C0906R.string.ary), new Object[]{getName()});
    }

    public void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public void setEntranceLocation(String str) {
        this.entranceLocation = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSecUserId(String str) {
        this.secUserId = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public static ShareGoodWindowContent fromShareStruct(IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51152, new Class[]{IShareService.ShareStruct.class}, ShareGoodWindowContent.class)) {
            return (ShareGoodWindowContent) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51152, new Class[]{IShareService.ShareStruct.class}, ShareGoodWindowContent.class);
        }
        ShareGoodWindowContent shareGoodWindowContent = new ShareGoodWindowContent();
        shareGoodWindowContent.avatar = shareStruct2.videoCover;
        if (shareStruct2.extraParams != null) {
            shareGoodWindowContent.name = shareStruct2.extraParams.get("name");
            shareGoodWindowContent.userId = shareStruct2.extraParams.get("user_id");
            if (!TextUtils.isEmpty(shareStruct2.extraParams.get("sec_user_id"))) {
                shareGoodWindowContent.secUserId = shareStruct2.extraParams.get("sec_user_id");
            }
        }
        shareGoodWindowContent.type = 0;
        return shareGoodWindowContent;
    }
}
