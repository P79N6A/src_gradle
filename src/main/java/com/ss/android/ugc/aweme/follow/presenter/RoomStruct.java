package com.ss.android.ugc.aweme.follow.presenter;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.api.Required;
import com.ss.android.ugc.aweme.base.api.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.CreateRoomResponse;
import com.ss.android.ugc.aweme.profile.model.User;

@Keep
public class RoomStruct extends c implements h {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("additional_stream_url")
    public CreateRoomResponse.StreamUrlStruct additional_stream_url;
    @SerializedName("coins")
    public int coins;
    @SerializedName("create_time")
    public long create_time;
    @SerializedName("digg_count")
    public int digg_count;
    public String errorMsg;
    @SerializedName("finish_time")
    public long finish_time;
    @SerializedName("room_id")
    public long id;
    @SerializedName("in_sandbox")
    public boolean inSandbox;
    @SerializedName("live_type_official")
    public boolean isOfficialType;
    @SerializedName("live_type_screenshot")
    @Deprecated
    public boolean isScreenshot;
    @SerializedName("live_type_third_party")
    @Deprecated
    public boolean isThirdParty;
    @SerializedName("source_count")
    public LiveEnterSource liveEnterSource;
    @SerializedName("live_total_time")
    public long liveTotalTime;
    @SerializedName("live_type_audio")
    @Deprecated
    private boolean liveTypeAudio;
    private String mRequestId;
    private long mUserFrom;
    public String message;
    @SerializedName("new_fans_count")
    public int newFansCount;
    @SerializedName("owner")
    @Required
    public User owner;
    public String prompts;
    @SerializedName("activity")
    public RoomBuilding roomActivity;
    @SerializedName(alternate = {"cover"}, value = "room_cover")
    public UrlModel roomCover;
    @SerializedName("extra")
    public RoomExtra roomExtra;
    public int roomType = 3;
    @SerializedName("room_type_tag")
    public String roomTypeTag;
    @SerializedName("share_info")
    public ShareStruct share_info;
    @SerializedName("status")
    public int status;
    public int status_code;
    public String status_msg;
    @SerializedName("stream_id")
    public long stream_id;
    @SerializedName("stream_url")
    public CreateRoomResponse.StreamUrlStruct stream_url;
    @SerializedName("title")
    public String title;
    @SerializedName("total_user_count")
    public int total_user_count;
    public long userId;
    @SerializedName("user_count")
    public int user_count;

    @Keep
    public static class LiveEnterSource {
        @SerializedName("follow")
        public int liveFollowNumber;
        @SerializedName("recommend")
        public int liveRecommendNumber;
        @SerializedName("live_square")
        public int liveSquareNumber;
    }

    public String getRequestId() {
        return this.mRequestId;
    }

    public RoomExtra getRoomExtra() {
        return this.roomExtra;
    }

    public String getRoomTypeTag() {
        return this.roomTypeTag;
    }

    public long getUserFrom() {
        return this.mUserFrom;
    }

    public int getLiveFollowNumber() {
        if (this.liveEnterSource == null) {
            return 0;
        }
        return this.liveEnterSource.liveFollowNumber;
    }

    public int getLiveRecommendNumber() {
        if (this.liveEnterSource == null) {
            return 0;
        }
        return this.liveEnterSource.liveRecommendNumber;
    }

    public int getLiveSquareNumber() {
        if (this.liveEnterSource == null) {
            return 0;
        }
        return this.liveEnterSource.liveSquareNumber;
    }

    public boolean isFinish() {
        if (this.status == 4) {
            return true;
        }
        return false;
    }

    public a getStreamType() {
        if (this.isScreenshot) {
            return a.SCREEN_RECORD;
        }
        if (this.isThirdParty) {
            return a.THIRD_PARTY;
        }
        if (this.liveTypeAudio) {
            return a.AUDIO;
        }
        return a.VIDEO;
    }

    public boolean isPullUrlValid() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44699, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44699, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.stream_url != null && !TextUtils.isEmpty(this.stream_url.rtmp_pull_url)) {
            z = true;
        }
        return z;
    }

    public long getAnchorId() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44701, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44701, new Class[0], Long.TYPE)).longValue();
        } else if (this.owner == null || TextUtils.isEmpty(this.owner.getUid())) {
            return 0;
        } else {
            return Long.parseLong(this.owner.getUid());
        }
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44700, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44700, new Class[0], String.class);
        }
        return "RoomStruct{mUserFrom=" + this.mUserFrom + ", mRequestId='" + this.mRequestId + '\'' + ", id=" + this.id + ", status=" + this.status + ", owner=" + this.owner + ", title='" + this.title + '\'' + ", user_count=" + this.user_count + ", create_time=" + this.create_time + ", finish_time=" + this.finish_time + ", stream_id=" + this.stream_id + ", stream_url=" + this.stream_url + ", share_info=" + this.share_info + ", digg_count=" + this.digg_count + ", coins=" + this.coins + ", inSandbox=" + this.inSandbox + ", total_user_count=" + this.total_user_count + ", roomActivity=" + this.roomActivity + ", roomCover=" + this.roomCover + ", roomTypeTag=" + this.roomTypeTag + ", extra=" + this.roomExtra + ", errorMsg='" + this.errorMsg + '\'' + '}';
    }

    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void setUserFrom(long j) {
        this.mUserFrom = j;
    }

    public static boolean isValid(RoomStruct roomStruct) {
        if (roomStruct == null || roomStruct.id <= 0 || roomStruct.owner == null) {
            return false;
        }
        return true;
    }

    public static RoomStruct fromAweme(Aweme aweme) {
        UrlModel urlModel;
        if (PatchProxy.isSupport(new Object[]{aweme}, null, changeQuickRedirect, true, 44702, new Class[]{Aweme.class}, RoomStruct.class)) {
            return (RoomStruct) PatchProxy.accessDispatch(new Object[]{aweme}, null, changeQuickRedirect, true, 44702, new Class[]{Aweme.class}, RoomStruct.class);
        }
        RoomStruct roomStruct = new RoomStruct();
        roomStruct.owner = aweme.getAuthor();
        if (roomStruct.owner != null) {
            roomStruct.id = roomStruct.owner.roomId;
        }
        if (aweme.getRoom() != null) {
            roomStruct.id = aweme.getRoom().roomId;
        }
        if (aweme.getAuthor() != null) {
            if (aweme.getAuthor().roomCover != null) {
                urlModel = aweme.getAuthor().roomCover;
            } else {
                urlModel = aweme.getAuthor().getAvatarThumb();
            }
            roomStruct.roomCover = urlModel;
        }
        roomStruct.stream_url = new CreateRoomResponse.StreamUrlStruct();
        roomStruct.stream_url.rtmp_pull_url = aweme.getStreamUrlModel().rtmpPullUrl;
        roomStruct.isOfficialType = false;
        roomStruct.isScreenshot = false;
        roomStruct.isThirdParty = false;
        roomStruct.liveTypeAudio = false;
        return roomStruct;
    }
}
