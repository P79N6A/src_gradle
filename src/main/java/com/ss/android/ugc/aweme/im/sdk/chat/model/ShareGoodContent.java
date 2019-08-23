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

public class ShareGoodContent extends BaseContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("avatar")
    private UrlModel avatar;
    @SerializedName("enter_method")
    private String enterMethod = "click_message";
    @SerializedName("product_id")
    private String productId;
    @SerializedName("promotion_id")
    private String promotionId;
    @SerializedName("sec_user_id")
    private String secUserId = "";
    @SerializedName("title")
    private String title;
    @SerializedName("user_count")
    private long userCount;
    @SerializedName("user_id")
    private String userId;

    public UrlModel getAvatar() {
        return this.avatar;
    }

    public String getEnterMethod() {
        return this.enterMethod;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getPromotionId() {
        return this.promotionId;
    }

    public String getSecUserId() {
        return this.secUserId;
    }

    public String getTitle() {
        return this.title;
    }

    public long getUserCount() {
        return this.userCount;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51148, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51148, new Class[0], String.class);
        }
        return String.format(Locale.getDefault(), GlobalContext.getContext().getString(C0906R.string.aru), new Object[]{getTitle()});
    }

    public IShareService.ShareStruct generateShareStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51150, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51150, new Class[0], IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.itemType = "good";
        shareStruct.title = getTitle();
        shareStruct.videoCover = getAvatar();
        shareStruct.extraParams = new HashMap<>();
        shareStruct.extraParams.put("user_id", getUserId());
        shareStruct.extraParams.put("user_count", String.valueOf(getUserCount()));
        shareStruct.extraParams.put("promotion_id", getPromotionId());
        shareStruct.extraParams.put("product_id", getProductId());
        if (!TextUtils.isEmpty(getSecUserId())) {
            shareStruct.extraParams.put("sec_user_id", getSecUserId());
        }
        return shareStruct;
    }

    public void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setPromotionId(String str) {
        this.promotionId = str;
    }

    public void setSecUserId(String str) {
        this.secUserId = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUserCount(long j) {
        this.userCount = j;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public static ShareGoodContent fromShareStruct(IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51149, new Class[]{IShareService.ShareStruct.class}, ShareGoodContent.class)) {
            return (ShareGoodContent) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51149, new Class[]{IShareService.ShareStruct.class}, ShareGoodContent.class);
        }
        ShareGoodContent shareGoodContent = new ShareGoodContent();
        shareGoodContent.title = shareStruct2.title;
        shareGoodContent.avatar = shareStruct2.videoCover;
        if (shareStruct2.extraParams != null) {
            shareGoodContent.userId = shareStruct2.extraParams.get("user_id");
            if (!TextUtils.isEmpty(shareStruct2.extraParams.get("sec_user_id"))) {
                shareGoodContent.secUserId = shareStruct2.extraParams.get("sec_user_id");
            }
            if (shareStruct2.extraParams.containsKey("user_count")) {
                shareGoodContent.userCount = Long.valueOf(shareStruct2.extraParams.get("user_count")).longValue();
            }
            shareGoodContent.promotionId = shareStruct2.extraParams.get("promotion_id");
            shareGoodContent.productId = shareStruct2.extraParams.get("product_id");
        }
        shareGoodContent.type = 0;
        return shareGoodContent;
    }
}
