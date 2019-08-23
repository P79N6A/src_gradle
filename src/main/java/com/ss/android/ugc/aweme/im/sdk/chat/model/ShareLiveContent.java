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

public class ShareLiveContent extends BaseContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("push_detail")
    private String pushDetail;
    @SerializedName("cover_url")
    private UrlModel roomCover;
    @SerializedName("room_description")
    private String roomDesc;
    @SerializedName("room_id")
    private String roomId;
    @SerializedName("room_owner_avatar")
    private UrlModel roomOwnerAvatar;
    @SerializedName("room_owner_id")
    private String roomOwnerId;
    @SerializedName("room_owner_name")
    private String roomOwnerName;

    public String getPushDetail() {
        return this.pushDetail;
    }

    public UrlModel getRoomCover() {
        return this.roomCover;
    }

    public String getRoomDesc() {
        return this.roomDesc;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public UrlModel getRoomOwnerAvatar() {
        return this.roomOwnerAvatar;
    }

    public String getRoomOwnerId() {
        return this.roomOwnerId;
    }

    public String getRoomOwnerName() {
        return this.roomOwnerName;
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51155, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51155, new Class[0], String.class);
        }
        return GlobalContext.getContext().getString(C0906R.string.auj, new Object[]{getRoomOwnerName()});
    }

    public IShareService.ShareStruct generateShareStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51156, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51156, new Class[0], IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.identifier = getRoomId();
        shareStruct.liveId = getRoomOwnerId();
        shareStruct.videoCover = getRoomCover();
        shareStruct.authorName = getRoomOwnerName();
        shareStruct.thumb4Share = getRoomOwnerAvatar();
        shareStruct.itemType = "live";
        if (!TextUtils.isEmpty(getRoomDesc())) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("room_title", getRoomDesc());
            shareStruct.extraParams = hashMap;
        }
        return shareStruct;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setRoomCover(UrlModel urlModel) {
        this.roomCover = urlModel;
    }

    public void setRoomDesc(String str) {
        this.roomDesc = str;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setRoomOwnerAvatar(UrlModel urlModel) {
        this.roomOwnerAvatar = urlModel;
    }

    public void setRoomOwnerId(String str) {
        this.roomOwnerId = str;
    }

    public void setRoomOwnerName(String str) {
        this.roomOwnerName = str;
    }

    public static ShareLiveContent fromShareStruct(IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51154, new Class[]{IShareService.ShareStruct.class}, ShareLiveContent.class)) {
            return (ShareLiveContent) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51154, new Class[]{IShareService.ShareStruct.class}, ShareLiveContent.class);
        }
        ShareLiveContent shareLiveContent = new ShareLiveContent();
        shareLiveContent.setRoomId(shareStruct2.identifier);
        shareLiveContent.setRoomOwnerId(shareStruct2.liveId);
        shareLiveContent.setRoomOwnerName(shareStruct2.authorName);
        shareLiveContent.setRoomOwnerAvatar(shareStruct2.thumb4Share);
        shareLiveContent.setPushDetail(shareStruct2.authorName);
        if (shareStruct2.extraParams != null && shareStruct2.extraParams.containsKey("room_title")) {
            shareLiveContent.setRoomDesc(shareStruct2.extraParams.get("room_title"));
        }
        if (shareStruct2.videoCover != null) {
            shareLiveContent.setRoomCover(shareStruct2.videoCover);
        } else if (shareStruct2.thumb4Share != null) {
            shareLiveContent.setRoomCover(shareStruct2.thumb4Share);
        } else {
            shareLiveContent.setRoomCover(null);
        }
        return shareLiveContent;
    }
}
