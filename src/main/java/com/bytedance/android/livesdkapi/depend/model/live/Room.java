package com.bytedance.android.livesdkapi.depend.model.live;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.d;
import com.bytedance.android.live.base.model.live.RoomStats;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.livesdkapi.depend.model.live.f;
import com.bytedance.android.livesdkapi.k.a.e;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import java.util.Map;

@Keep
public class Room implements d {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("admin_user_ids")
    private List<Long> adminUserIds;
    @SerializedName("anchor_share_text")
    private String anchorShareText;
    @SerializedName("burst")
    private JsonObject burstInfoGson;
    @SerializedName("cell_style")
    private long cellStyle;
    @SerializedName("client_version")
    private String clientVersion;
    @SerializedName("cover")
    private ImageModel cover;
    @SerializedName("create_time")
    private long createTime;
    @SerializedName("sun_daily_icon_content")
    private String dailyRankContent;
    @SerializedName("deco_list")
    private List<c> decorationList;
    @SerializedName("distance")
    private String distance;
    @SerializedName("distance_city")
    private String distanceCity;
    @SerializedName("dynamic_cover")
    private ImageModel dynamicCover;
    @SerializedName("dynamic_cover_dict")
    private Map<Long, String> dynamicCoverDict;
    @SerializedName("dynamic_cover_low")
    private ImageModel dynamicCoverLow;
    @SerializedName("dynamic_cover_uri")
    private String dynamicCoverUri;
    @SerializedName("enable_room_perspective")
    private boolean enableRoomPerspective;
    @SerializedName("feed_room_label")
    private ImageModel feedRoomLabel;
    @SerializedName("finish_time")
    private long finishTime;
    @SerializedName("has_commerce_goods")
    public boolean hasCommerceGoods;
    @SerializedName("health_score")
    private i healthScoreInfo;
    @SerializedName("hide_nickname")
    private boolean hideNickName;
    @SerializedName("hide_status_tag")
    private boolean hideStatusTag;
    @SerializedName("hide_title")
    private boolean hideTitle;
    @SerializedName("hide_user_count")
    private boolean hideUserCount;
    @SerializedName("id")
    private long id;
    @SerializedName("id_str")
    private String idStr;
    @SerializedName("introduction")
    public String introduction;
    public boolean isDouPlusPromotion;
    @SerializedName("live_type_screenshot")
    @Deprecated
    public boolean isScreenshot;
    @SerializedName("live_type_third_party")
    @Deprecated
    public boolean isThirdParty;
    @SerializedName("common_label_list")
    private String labels;
    @SerializedName("last_ping_time")
    private long lastPingTime;
    private String linkMicInfoFastJson;
    @SerializedName("link_mic")
    private JsonObject linkMicInfoGson;
    @SerializedName("linkmic_layout")
    private long linkMicLayout;
    private int linkmicLayout;
    @SerializedName("live_id")
    private long liveId;
    @SerializedName("live_type_audio")
    @Deprecated
    private boolean liveTypeAudio;
    @SerializedName("live_type_linkmic")
    private boolean liveTypeLinkmic;
    @SerializedName("live_type_normal")
    private boolean liveTypeNormal;
    @SerializedName("live_type_sandbox")
    private boolean liveTypeSandbox;
    @SerializedName("living_room_attrs")
    private d livingRoomAttrs;
    @SerializedName("location")
    private String location;
    private String logPb;
    private String mRequestId;
    @SerializedName("room_auth")
    public RoomAuthStatus mRoomAuthStatus;
    @SerializedName("room_tabs")
    public List<Object> mRoomTabs;
    private long mUserFrom;
    @SerializedName("message")
    public String message;
    @SerializedName("mosaic_status")
    private int mosaicStatus;
    @SerializedName("mosaic_tip")
    private String mosaicTip;
    @SerializedName("new_cell_style")
    private int newCellStyle;
    @IgnoreStyleCheck
    public long nowTime;
    @SerializedName("orientation")
    private int orientation;
    @SerializedName("owner")
    private User owner;
    @SerializedName("owner_user_id")
    private long ownerUserId;
    @SerializedName("os_type")
    private int platform;
    @SerializedName("popularity_str")
    public String popularityStr;
    @SerializedName("private_info")
    private String privateInfo;
    @SerializedName("prompts")
    public String prompts;
    @SerializedName("real_distance")
    private String realDistance;
    @SerializedName("luckymoney_num")
    public int redEnvelopeNumber;
    @SerializedName("share_url")
    private String shareUrl;
    @SerializedName("source_type")
    private String sourceType;
    @SerializedName("stats")
    private RoomStats stats;
    @SerializedName("status")
    private int status;
    @SerializedName("stream_id")
    private long streamId;
    @SerializedName("stream_id_str")
    private String streamIdStr;
    @SerializedName("stream_provider")
    private long streamProvider;
    @SerializedName("stream_url")
    private StreamUrl streamUrl;
    @SerializedName("title")
    private String title;
    @SerializedName("top_fans")
    private List<g> topFanTickets;
    @SerializedName("top_users")
    private List<User> topUsers;
    @SerializedName("user_count")
    private int userCount;
    @SerializedName("user_share_text")
    private String userShareText;
    @SerializedName("with_linkmic")
    private boolean withLinkMic;

    public List<Object> getDislikeReason() {
        return null;
    }

    public String getVideoUrl() {
        return "";
    }

    public String subtitle() {
        return "";
    }

    public i author() {
        return this.owner;
    }

    public ImageModel cover() {
        return this.cover;
    }

    public List<Long> getAdminUserIds() {
        return this.adminUserIds;
    }

    public String getAnchorShareText() {
        return this.anchorShareText;
    }

    public long getCellStyle() {
        return this.cellStyle;
    }

    public String getClientVersion() {
        return this.clientVersion;
    }

    public ImageModel getCover() {
        return this.cover;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getDailyRankContent() {
        return this.dailyRankContent;
    }

    public List<c> getDecorationList() {
        return this.decorationList;
    }

    public String getDistance() {
        return this.distance;
    }

    public String getDistanceCity() {
        return this.distanceCity;
    }

    public ImageModel getDynamicCover() {
        return this.dynamicCover;
    }

    public Map<Long, String> getDynamicCoverDict() {
        return this.dynamicCoverDict;
    }

    public ImageModel getDynamicCoverLow() {
        return this.dynamicCoverLow;
    }

    public String getDynamicCoverUri() {
        return this.dynamicCoverUri;
    }

    public ImageModel getFeedRoomLabel() {
        return this.feedRoomLabel;
    }

    public long getFinishTime() {
        return this.finishTime;
    }

    public i getHealthScoreInfo() {
        return this.healthScoreInfo;
    }

    public long getId() {
        return this.id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public String getLabels() {
        return this.labels;
    }

    public long getLastPingTime() {
        return this.lastPingTime;
    }

    public long getLinkMicLayout() {
        return this.linkMicLayout;
    }

    public int getLinkmicLayout() {
        return this.linkmicLayout;
    }

    public long getLiveId() {
        return this.liveId;
    }

    public d getLivingRoomAttrs() {
        return this.livingRoomAttrs;
    }

    public String getLocation() {
        return this.location;
    }

    public String getLog_pb() {
        return this.logPb;
    }

    public int getMosaicStatus() {
        return this.mosaicStatus;
    }

    public String getMosaicTip() {
        return this.mosaicTip;
    }

    public int getNewCellStyle() {
        return this.newCellStyle;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public User getOwner() {
        return this.owner;
    }

    public long getOwnerUserId() {
        return this.ownerUserId;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getPrivateInfo() {
        return this.privateInfo;
    }

    public String getRealDistance() {
        return this.realDistance;
    }

    public String getRequestId() {
        return this.mRequestId;
    }

    public RoomAuthStatus getRoomAuthStatus() {
        return this.mRoomAuthStatus;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getSourceType() {
        return this.sourceType;
    }

    public RoomStats getStats() {
        return this.stats;
    }

    public int getStatus() {
        return this.status;
    }

    public long getStreamId() {
        return this.streamId;
    }

    public String getStreamIdStr() {
        return this.streamIdStr;
    }

    public long getStreamProvider() {
        return this.streamProvider;
    }

    public StreamUrl getStreamUrl() {
        return this.streamUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public List<g> getTopFanTickets() {
        return this.topFanTickets;
    }

    public List<User> getTopUsers() {
        return this.topUsers;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getUserFrom() {
        return this.mUserFrom;
    }

    public String getUserShareText() {
        return this.userShareText;
    }

    public boolean hasCommerceGoods() {
        return this.hasCommerceGoods;
    }

    public boolean isEnableRoomPerspective() {
        return this.enableRoomPerspective;
    }

    public boolean isHideNickName() {
        return this.hideNickName;
    }

    public boolean isHideStatusTag() {
        return this.hideStatusTag;
    }

    public boolean isHideTitle() {
        return this.hideTitle;
    }

    public boolean isHideUserCount() {
        return this.hideUserCount;
    }

    public boolean isLiveTypeAudio() {
        return this.liveTypeAudio;
    }

    public boolean isLiveTypeLinkmic() {
        return this.liveTypeLinkmic;
    }

    public boolean isLiveTypeNormal() {
        return this.liveTypeNormal;
    }

    public boolean isLiveTypeSandbox() {
        return this.liveTypeSandbox;
    }

    public boolean isWithLinkMic() {
        return this.withLinkMic;
    }

    public String title() {
        return this.title;
    }

    @Nullable
    public f getStreamUrlExtra() {
        if (this.streamUrl == null) {
            return null;
        }
        return this.streamUrl.j;
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

    public String buildPullUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 14989, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 14989, new Class[0], String.class);
        } else if (this.streamUrl == null) {
            return null;
        } else {
            return buildPullUrl(this.streamUrl.n);
        }
    }

    public String getBurstInfo() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 14985, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 14985, new Class[0], String.class);
        } else if (this.burstInfoGson == null) {
            return null;
        } else {
            return this.burstInfoGson.toString();
        }
    }

    public String getLinkMicInfo() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 14986, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 14986, new Class[0], String.class);
        } else if (this.linkMicInfoFastJson != null) {
            return this.linkMicInfoFastJson;
        } else {
            if (this.linkMicInfoGson == null) {
                return null;
            }
            return this.linkMicInfoGson.toString();
        }
    }

    public String getMixId() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 14982, new Class[0], String.class)) {
            return String.valueOf(this.id);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 14982, new Class[0], String.class);
    }

    public String getSdkParams() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 14991, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 14991, new Class[0], String.class);
        } else if (this.streamUrl == null) {
            return null;
        } else {
            return getSdkParams(this.streamUrl.n);
        }
    }

    @Nullable
    public f.a getStreamSrConfig() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 14984, new Class[0], f.a.class)) {
            return (f.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 14984, new Class[0], f.a.class);
        }
        f streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return null;
        }
        return streamUrlExtra.o;
    }

    @NonNull
    public f getStreamUrlExtraSafely() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 14983, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 14983, new Class[0], f.class);
        }
        f streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            streamUrlExtra = new f();
        }
        return streamUrlExtra;
    }

    public void init() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 14993, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 14993, new Class[0], Void.TYPE);
            return;
        }
        if (this.streamUrl != null) {
            this.streamUrl.b();
        }
    }

    public boolean isPullUrlValid() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 14988, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 14988, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.streamUrl != null) {
            StreamUrl streamUrl2 = this.streamUrl;
            if (PatchProxy.isSupport(new Object[0], streamUrl2, StreamUrl.f18706a, false, 14999, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], streamUrl2, StreamUrl.f18706a, false, 14999, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                streamUrl2.b();
                if (!streamUrl2.qualityMap.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public void setAdminUserIds(List<Long> list) {
        this.adminUserIds = list;
    }

    public void setAnchorShareText(String str) {
        this.anchorShareText = str;
    }

    @SerializedName("burst")
    public void setBurstInfo(JsonObject jsonObject) {
        this.burstInfoGson = jsonObject;
    }

    public void setCellStyle(long j) {
        this.cellStyle = j;
    }

    public void setClientVersion(String str) {
        this.clientVersion = str;
    }

    @SerializedName("cover")
    public void setCover(ImageModel imageModel) {
        this.cover = imageModel;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDailyRankContent(String str) {
        this.dailyRankContent = str;
    }

    public void setDecorationList(List<c> list) {
        this.decorationList = list;
    }

    public void setDistance(String str) {
        this.distance = str;
    }

    public void setDistanceCity(String str) {
        this.distanceCity = str;
    }

    public void setDynamicCover(ImageModel imageModel) {
        this.dynamicCover = imageModel;
    }

    public void setDynamicCoverDict(Map<Long, String> map) {
        this.dynamicCoverDict = map;
    }

    public void setDynamicCoverLow(ImageModel imageModel) {
        this.dynamicCoverLow = imageModel;
    }

    public void setDynamicCoverUri(String str) {
        this.dynamicCoverUri = str;
    }

    public void setEnableRoomPerspective(boolean z) {
        this.enableRoomPerspective = z;
    }

    public void setFeedRoomLabel(ImageModel imageModel) {
        this.feedRoomLabel = imageModel;
    }

    public void setFinishTime(long j) {
        this.finishTime = j;
    }

    public void setHealthScoreInfo(i iVar) {
        this.healthScoreInfo = iVar;
    }

    public void setHideNickName(boolean z) {
        this.hideNickName = z;
    }

    public void setHideStatusTag(boolean z) {
        this.hideStatusTag = z;
    }

    public void setHideTitle(boolean z) {
        this.hideTitle = z;
    }

    public void setHideUserCount(boolean z) {
        this.hideUserCount = z;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setLabels(String str) {
        this.labels = str;
    }

    public void setLastPingTime(long j) {
        this.lastPingTime = j;
    }

    public void setLinkMicInfo(String str) {
        this.linkMicInfoFastJson = str;
    }

    public void setLinkMicLayout(long j) {
        this.linkMicLayout = j;
    }

    public void setLiveId(long j) {
        this.liveId = j;
    }

    public void setLiveTypeAudio(boolean z) {
        this.liveTypeAudio = z;
    }

    public void setLiveTypeLinkmic(boolean z) {
        this.liveTypeLinkmic = z;
    }

    public void setLiveTypeNormal(boolean z) {
        this.liveTypeNormal = z;
    }

    public void setLiveTypeSandbox(boolean z) {
        this.liveTypeSandbox = z;
    }

    public void setLivingRoomAttrs(d dVar) {
        this.livingRoomAttrs = dVar;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setLog_pb(String str) {
        this.logPb = str;
    }

    public void setMosaicStatus(int i) {
        this.mosaicStatus = i;
    }

    public void setMosaicTip(String str) {
        this.mosaicTip = str;
    }

    public void setNewCellStyle(int i) {
        this.newCellStyle = i;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public void setOwner(User user) {
        this.owner = user;
    }

    public void setOwnerUserId(long j) {
        this.ownerUserId = j;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public void setPrivateInfo(String str) {
        this.privateInfo = str;
    }

    public void setRealDistance(String str) {
        this.realDistance = str;
    }

    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void setRoomAuthStatus(RoomAuthStatus roomAuthStatus) {
        this.mRoomAuthStatus = roomAuthStatus;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setSourceType(String str) {
        this.sourceType = str;
    }

    public void setStats(RoomStats roomStats) {
        this.stats = roomStats;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStreamId(long j) {
        this.streamId = j;
    }

    public void setStreamIdStr(String str) {
        this.streamIdStr = str;
    }

    public void setStreamProvider(long j) {
        this.streamProvider = j;
    }

    @SerializedName("stream_url")
    public void setStreamUrl(StreamUrl streamUrl2) {
        this.streamUrl = streamUrl2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTopFanTickets(List<g> list) {
        this.topFanTickets = list;
    }

    public void setTopUsers(List<User> list) {
        this.topUsers = list;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public void setUserFrom(long j) {
        this.mUserFrom = j;
    }

    public void setUserShareText(String str) {
        this.userShareText = str;
    }

    public void setWithLinkMic(boolean z) {
        this.withLinkMic = z;
    }

    public static boolean isValid(Room room) {
        if (PatchProxy.isSupport(new Object[]{room}, null, changeQuickRedirect, true, 14987, new Class[]{Room.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{room}, null, changeQuickRedirect, true, 14987, new Class[]{Room.class}, Boolean.TYPE)).booleanValue();
        } else if (room == null || room.getId() <= 0 || room.getOwner() == null) {
            return false;
        } else {
            return true;
        }
    }

    public String buildPullUrl(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 14990, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 14990, new Class[]{String.class}, String.class);
        } else if (this.streamUrl == null) {
            return null;
        } else {
            String str2 = this.streamUrl.qualityMap.get(str);
            if (str2 == null) {
                return null;
            }
            e eVar = new e(str2);
            eVar.a("anchor_device_platform", this.platform);
            eVar.a("anchor_version", this.clientVersion);
            eVar.a("room_id", this.id);
            eVar.a("anchor_id", this.ownerUserId);
            return eVar.a();
        }
    }

    public String getSdkParams(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 14992, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 14992, new Class[]{String.class}, String.class);
        } else if (this.streamUrl == null) {
            return null;
        } else {
            return this.streamUrl.sdkParamsMap.get(str);
        }
    }
}
