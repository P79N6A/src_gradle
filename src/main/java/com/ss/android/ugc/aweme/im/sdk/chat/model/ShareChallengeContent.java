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

public class ShareChallengeContent extends BaseContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("challenge_id")
    private String challengeId;
    @SerializedName("cover_url")
    private List<UrlModel> coverUrl;
    @SerializedName("push_detail")
    private String pushDetail;
    @SerializedName("title")
    private String title;
    @SerializedName("user_count")
    private long userCount;

    public String getChallengeId() {
        return this.challengeId;
    }

    public List<UrlModel> getCoverUrl() {
        return this.coverUrl;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getTitle() {
        return this.title;
    }

    public long getUserCount() {
        return this.userCount;
    }

    public IShareService.ShareStruct generateShareStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51144, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51144, new Class[0], IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.itemType = "challenge";
        return shareStruct;
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51142, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51142, new Class[0], String.class);
        }
        return GlobalContext.getContext().getResources().getString(C0906R.string.apq, new Object[]{this.pushDetail});
    }

    public void setChallengeId(String str) {
        this.challengeId = str;
    }

    public void setCoverUrl(List<UrlModel> list) {
        this.coverUrl = list;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUserCount(int i) {
        this.userCount = (long) i;
    }

    public static ShareChallengeContent fromShareStruct(IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51143, new Class[]{IShareService.ShareStruct.class}, ShareChallengeContent.class)) {
            return (ShareChallengeContent) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51143, new Class[]{IShareService.ShareStruct.class}, ShareChallengeContent.class);
        }
        ShareChallengeContent shareChallengeContent = new ShareChallengeContent();
        shareChallengeContent.challengeId = shareStruct2.extraParams.get("challenge_id");
        shareChallengeContent.title = shareStruct2.extraParams.get("challenge_name");
        shareChallengeContent.userCount = Long.parseLong(shareStruct2.extraParams.get("view_count"));
        shareChallengeContent.pushDetail = "#" + shareChallengeContent.title;
        String str = shareStruct2.extraParams.get("cover_thumb");
        if (!TextUtils.isEmpty(str)) {
            shareChallengeContent.coverUrl = (List) JSON.parseObject(str, List.class);
        }
        return shareChallengeContent;
    }
}
