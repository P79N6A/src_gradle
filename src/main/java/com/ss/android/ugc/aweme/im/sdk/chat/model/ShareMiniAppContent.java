package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import java.io.Serializable;

public class ShareMiniAppContent extends BaseContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("app_id")
    private String appId;
    @SerializedName("app_name")
    private String appName;
    @SerializedName("extra")
    private Extra extra;
    @SerializedName("image_url")
    private String imageUrl;
    @SerializedName("is_game")
    private boolean isGame;
    @SerializedName("push_detail")
    private String pushDetail;
    @SerializedName("query")
    private String query;
    @SerializedName("title")
    private String title;
    @SerializedName("token")
    private String token;

    public static class Extra implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("channel")
        String channel;

        public String getChannel() {
            return this.channel;
        }

        public void setChannel(String str) {
            this.channel = str;
        }
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppName() {
        return this.appName;
    }

    public Extra getExtra() {
        return this.extra;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getQuery() {
        return this.query;
    }

    public String getTitle() {
        return this.title;
    }

    public String getToken() {
        return this.token;
    }

    public boolean isGame() {
        return this.isGame;
    }

    public String getExtraStr() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51157, new Class[0], String.class)) {
            return new Gson().toJson((Object) this.extra);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51157, new Class[0], String.class);
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51158, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51158, new Class[0], String.class);
        } else if (this.isGame) {
            return GlobalContext.getContext().getResources().getString(C0906R.string.av3, new Object[]{this.appName});
        } else {
            return GlobalContext.getContext().getResources().getString(C0906R.string.av1, new Object[]{this.appName});
        }
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setExtra(Extra extra2) {
        this.extra = extra2;
    }

    public void setGame(boolean z) {
        this.isGame = z;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public static ShareMiniAppContent fromShareStruct(IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51159, new Class[]{IShareService.ShareStruct.class}, ShareMiniAppContent.class)) {
            return (ShareMiniAppContent) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51159, new Class[]{IShareService.ShareStruct.class}, ShareMiniAppContent.class);
        }
        ShareMiniAppContent shareMiniAppContent = new ShareMiniAppContent();
        shareMiniAppContent.appName = shareStruct2.appName;
        shareMiniAppContent.title = shareStruct2.title;
        shareMiniAppContent.imageUrl = shareStruct2.thumbUrl;
        shareMiniAppContent.pushDetail = shareStruct2.appName;
        if (shareStruct2.extraParams != null) {
            String str = shareStruct2.extraParams.get("isGame");
            if (!TextUtils.isEmpty(str)) {
                shareMiniAppContent.isGame = Boolean.valueOf(str).booleanValue();
            }
            shareMiniAppContent.query = shareStruct2.extraParams.get("query");
            shareMiniAppContent.appId = shareStruct2.extraParams.get("app_id");
            shareMiniAppContent.token = shareStruct2.extraParams.get("token");
            shareMiniAppContent.extra = (Extra) new Gson().fromJson(shareStruct2.extraParams.get(PushConstants.EXTRA), Extra.class);
        }
        if (shareMiniAppContent.isGame) {
            shareMiniAppContent.setType(2401);
        } else {
            shareMiniAppContent.setType(2402);
        }
        return shareMiniAppContent;
    }
}
