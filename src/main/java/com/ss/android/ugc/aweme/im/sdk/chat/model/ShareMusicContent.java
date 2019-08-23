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

public class ShareMusicContent extends BaseContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cover_url")
    private List<UrlModel> awemeCoverList;
    @SerializedName("music_cover")
    private UrlModel coverThumb;
    @SerializedName("music_id")
    private String musicId;
    @SerializedName("title")
    private String musicName;
    @SerializedName("push_detail")
    private String pushDetail;
    @SerializedName("user_count")
    private int userCount;

    public List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public UrlModel getCoverThumb() {
        return this.coverThumb;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getMusicName() {
        return this.musicName;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public IShareService.ShareStruct generateShareStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51162, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51162, new Class[0], IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.itemType = "music";
        shareStruct.videoCover = getCoverThumb();
        return shareStruct;
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51161, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51161, new Class[0], String.class);
        }
        return GlobalContext.getContext().getString(C0906R.string.av_, new Object[]{getMusicName()});
    }

    public void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public void setCoverThumb(UrlModel urlModel) {
        this.coverThumb = urlModel;
    }

    public void setMusicId(String str) {
        this.musicId = str;
    }

    public void setMusicName(String str) {
        this.musicName = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public static ShareMusicContent fromShareStruct(IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51160, new Class[]{IShareService.ShareStruct.class}, ShareMusicContent.class)) {
            return (ShareMusicContent) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51160, new Class[]{IShareService.ShareStruct.class}, ShareMusicContent.class);
        }
        ShareMusicContent shareMusicContent = new ShareMusicContent();
        shareMusicContent.musicId = shareStruct2.extraParams.get("music_id");
        shareMusicContent.musicName = shareStruct2.extraParams.get("music_name");
        shareMusicContent.pushDetail = shareMusicContent.musicName;
        String str = shareStruct2.extraParams.get("user_count");
        if (!TextUtils.isEmpty(str)) {
            shareMusicContent.userCount = Integer.parseInt(str);
        }
        if (shareStruct2.videoCover != null) {
            shareMusicContent.coverThumb = shareStruct2.videoCover;
        } else {
            String str2 = shareStruct2.extraParams.get("cover_thumb");
            if (!TextUtils.isEmpty(str2)) {
                shareMusicContent.coverThumb = (UrlModel) JSON.parseObject(str2, UrlModel.class);
            }
        }
        String str3 = shareStruct2.extraParams.get("aweme_cover_list");
        if (!TextUtils.isEmpty(str3)) {
            shareMusicContent.awemeCoverList = (List) JSON.parseObject(str3, List.class);
        }
        return shareMusicContent;
    }
}
