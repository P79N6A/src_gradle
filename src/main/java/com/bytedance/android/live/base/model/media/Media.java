package com.bytedance.android.live.base.model.media;

import android.support.annotation.Keep;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.media.VideoModel;
import com.bytedance.android.live.base.model.share.ShareSourceInfo;
import com.bytedance.android.live.base.model.user.User;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

@Keep
public class Media implements IPlayable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad_info")
    private MediaAdInfo adInfo;
    @SerializedName("at_users")
    private List<TextExtraStruct> aiteUserItems;
    @SerializedName("allow_comment")
    private boolean allowComment;
    @SerializedName("allow_dislike")
    private boolean allowDislike;
    @SerializedName("allow_share")
    private boolean allowShare;
    private long apiTime;
    @SerializedName("author")
    private User author;
    @SerializedName("auto_play")
    private int autoPlay;
    @SerializedName("cell_height")
    private int cellHeight;
    @SerializedName("cell_style")
    private int cellStyle;
    @SerializedName("cell_width")
    private int cellWidth;
    @SerializedName("comment_delay")
    private int commentDelay;
    @SerializedName("comment_prompts")
    private String commentPrompts;
    @SerializedName("commerce")
    private a commerce;
    @SerializedName("create_time")
    private long createTime;
    private long danmakuShowTime;
    @SerializedName("private_info")
    private MediaDebugInfo debugInfo;
    @SerializedName("description")
    private String description;
    @SerializedName("display_style")
    private int displayStyle;
    @SerializedName("enable_send_flame")
    private boolean enableSendFlame;
    @SerializedName("feed_tips")
    private String feedTips;
    @SerializedName("feed_tips_type")
    private int feedTipsType;
    @SerializedName("from_ad")
    private boolean fromAd;
    @SerializedName("guide_card_id")
    private int guideCardId;
    @SerializedName("has_free_flame")
    private boolean hasFreeFlame;
    @SerializedName("has_sync_aweme")
    private boolean hasSyncAweme;
    @SerializedName("hashtag")
    private b hashTag;
    @SerializedName("hide_nickname")
    private boolean hideNickName;
    @SerializedName("id")
    private long id;
    private boolean isDeleted;
    @SerializedName("is_rich")
    private int isRich;
    @SerializedName("stats")
    private MediaItemStats itemStats;
    @SerializedName("location")
    private String location;
    private int mDetailType;
    @SerializedName("mark")
    private VideoMark mark;
    @SerializedName("recommend_reason")
    private MediaRecommendReason mediaRecommendReason;
    @SerializedName("media_type")
    private int mediaType;
    @SerializedName("song")
    private c music;
    @SerializedName("new_cell_style")
    private int newCellStyle;
    private boolean noNeedQuery;
    @SerializedName("position")
    private String position;
    @SerializedName("share_description")
    private String shareDesc;
    @SerializedName("share_enable")
    private boolean shareEnable;
    @SerializedName("share_prompts")
    private String sharePrompts;
    @SerializedName("share_source_info")
    private ShareSourceInfo shareSourceInfo;
    @SerializedName("share_strong_guide")
    private int shareStrongGuide;
    @SerializedName("share_text")
    private String shareText;
    @SerializedName("share_tips")
    private String shareTips;
    @SerializedName("share_title")
    private String shareTitle;
    @SerializedName("share_url")
    private String shareUrl;
    @SerializedName("status")
    private int status;
    @SerializedName("title")
    private String text;
    @SerializedName("tips")
    private String tips;
    @SerializedName("tips_url")
    private String tipsUrl;
    @SerializedName("user_bury")
    private int userBury;
    @SerializedName("user_digg")
    private int userDigg;
    @SerializedName("video")
    private VideoModel videoModel;
    @SerializedName("video_pic_num")
    private int videoPicNum;
    @SerializedName("weibo_share_title")
    private String weiboShareTitle;

    public @interface MediaDetailType {
    }

    public String getPlayKey() {
        return null;
    }

    public boolean isNativeAd() {
        return false;
    }

    public MediaAdInfo getAdInfo() {
        return this.adInfo;
    }

    public List<TextExtraStruct> getAiteUserItems() {
        return this.aiteUserItems;
    }

    public long getApiTime() {
        return this.apiTime;
    }

    public User getAuthor() {
        return this.author;
    }

    public int getAutoPlay() {
        return this.autoPlay;
    }

    public int getCellHeight() {
        return this.cellHeight;
    }

    public int getCellStyle() {
        return this.cellStyle;
    }

    public int getCellWidth() {
        return this.cellWidth;
    }

    public int getCommentDelay() {
        return this.commentDelay;
    }

    public String getCommentPrompts() {
        return this.commentPrompts;
    }

    public a getCommerce() {
        return this.commerce;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDanmakuShowTime() {
        return this.danmakuShowTime;
    }

    public MediaDebugInfo getDebugInfo() {
        return this.debugInfo;
    }

    public String getDescription() {
        return this.description;
    }

    @MediaDetailType
    public int getDetailType() {
        return this.mDetailType;
    }

    public int getDisplayStyle() {
        return this.displayStyle;
    }

    public String getFeedTips() {
        return this.feedTips;
    }

    public int getFeedTipsType() {
        return this.feedTipsType;
    }

    public int getGuideCardId() {
        return this.guideCardId;
    }

    public b getHashTag() {
        return this.hashTag;
    }

    public long getId() {
        return this.id;
    }

    public int getIsRich() {
        return this.isRich;
    }

    public MediaItemStats getItemStats() {
        return this.itemStats;
    }

    public String getLocation() {
        return this.location;
    }

    public VideoMark getMark() {
        return this.mark;
    }

    public MediaRecommendReason getMediaRecommendReason() {
        return this.mediaRecommendReason;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public c getMusic() {
        return this.music;
    }

    public int getNewCellStyle() {
        return this.newCellStyle;
    }

    public String getPosition() {
        return this.position;
    }

    public String getShareDesc() {
        return this.shareDesc;
    }

    public boolean getShareEnable() {
        return this.shareEnable;
    }

    public String getSharePrompts() {
        return this.sharePrompts;
    }

    public ShareSourceInfo getShareSourceInfo() {
        return this.shareSourceInfo;
    }

    public int getShareStrongGuide() {
        return this.shareStrongGuide;
    }

    public String getShareText() {
        return this.shareText;
    }

    public String getShareTips() {
        return this.shareTips;
    }

    public String getShareTitle() {
        return this.shareTitle;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public int getStatus() {
        return this.status;
    }

    public String getText() {
        return this.text;
    }

    public String getTips() {
        return this.tips;
    }

    public String getTipsUrl() {
        return this.tipsUrl;
    }

    public int getUserBury() {
        return this.userBury;
    }

    public int getUserDigg() {
        return this.userDigg;
    }

    public VideoModel getVideoModel() {
        return this.videoModel;
    }

    public int getVideoPicNum() {
        return this.videoPicNum;
    }

    public String getWeiboShareTitle() {
        return this.weiboShareTitle;
    }

    public boolean isAllowComment() {
        return this.allowComment;
    }

    public boolean isAllowDislike() {
        return this.allowDislike;
    }

    public boolean isAllowShare() {
        return this.allowShare;
    }

    public boolean isDeleted() {
        return this.isDeleted;
    }

    public boolean isEnableSendFlame() {
        return this.enableSendFlame;
    }

    public boolean isFromAd() {
        return this.fromAd;
    }

    public boolean isHasFreeFlame() {
        return this.hasFreeFlame;
    }

    public boolean isHasSyncAweme() {
        return this.hasSyncAweme;
    }

    public boolean isHideNickName() {
        return this.hideNickName;
    }

    public boolean isNoNeedQuery() {
        return this.noNeedQuery;
    }

    public boolean isShareEnable() {
        return this.shareEnable;
    }

    public String getAdStatus() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 64, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 64, new Class[0], String.class);
        } else if (isNativeAd()) {
            return "ad";
        } else {
            if (isFromAd()) {
                return "normal";
            }
            return "";
        }
    }

    public ImageModel getVideoCoverImage() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 60, new Class[0], ImageModel.class)) {
            return (ImageModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 60, new Class[0], ImageModel.class);
        } else if (this.videoModel == null) {
            return null;
        } else {
            if (this.videoModel.getCoverType() != VideoModel.a.MEDIUM) {
                return this.videoModel.getCoverModel();
            }
            return this.videoModel.getCoverMediumModel();
        }
    }

    public boolean isBitRate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (getVideoModel() == null || getVideoModel().getQualityInfo() == null || getVideoModel().getQualityInfo().size() <= 1) {
            return false;
        } else {
            return true;
        }
    }

    public void setAdInfo(MediaAdInfo mediaAdInfo) {
        this.adInfo = mediaAdInfo;
    }

    public void setAiteUserItems(List<TextExtraStruct> list) {
        this.aiteUserItems = list;
    }

    public void setAllowComment(boolean z) {
        this.allowComment = z;
    }

    public void setAllowDislike(boolean z) {
        this.allowDislike = z;
    }

    public void setAllowShare(boolean z) {
        this.allowShare = z;
    }

    public void setApiTime(long j) {
        this.apiTime = j;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setAutoPlay(int i) {
        this.autoPlay = i;
    }

    public void setCellHeight(int i) {
        this.cellHeight = i;
    }

    public void setCellWidth(int i) {
        this.cellWidth = i;
    }

    public void setCommentDelay(int i) {
        this.commentDelay = i;
    }

    public void setCommentPrompts(String str) {
        this.commentPrompts = str;
    }

    public void setCommerce(a aVar) {
        this.commerce = aVar;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDanmakuShowTime(long j) {
        this.danmakuShowTime = j;
    }

    public void setDebugInfo(MediaDebugInfo mediaDebugInfo) {
        this.debugInfo = mediaDebugInfo;
    }

    public void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDetailType(@MediaDetailType int i) {
        this.mDetailType = i;
    }

    public void setDisplayStyle(int i) {
        this.displayStyle = i;
    }

    public void setEnableSendFlame(boolean z) {
        this.enableSendFlame = z;
    }

    public void setFeedTips(String str) {
        this.feedTips = str;
    }

    public void setFeedTipsType(int i) {
        this.feedTipsType = i;
    }

    public void setFromAd(boolean z) {
        this.fromAd = z;
    }

    public void setGuideCardId(int i) {
        this.guideCardId = i;
    }

    public void setHasFreeFlame(boolean z) {
        this.hasFreeFlame = z;
    }

    public void setHasSyncAweme(boolean z) {
        this.hasSyncAweme = z;
    }

    public void setHashTag(b bVar) {
        this.hashTag = bVar;
    }

    public void setHideNickName(boolean z) {
        this.hideNickName = z;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIsRich(int i) {
        this.isRich = i;
    }

    public void setItemStats(MediaItemStats mediaItemStats) {
        this.itemStats = mediaItemStats;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setMark(VideoMark videoMark) {
        this.mark = videoMark;
    }

    public void setMediaRecommendReason(MediaRecommendReason mediaRecommendReason2) {
        this.mediaRecommendReason = mediaRecommendReason2;
    }

    public void setMediaType(int i) {
        this.mediaType = i;
    }

    public void setMusic(c cVar) {
        this.music = cVar;
    }

    public void setNewCellStyle(int i) {
        this.newCellStyle = i;
    }

    public void setNoNeedQuery(boolean z) {
        this.noNeedQuery = z;
    }

    public void setPosition(String str) {
        this.position = str;
    }

    public void setShareDesc(String str) {
        this.shareDesc = str;
    }

    public void setShareEnable(boolean z) {
        this.shareEnable = z;
    }

    public void setSharePrompts(String str) {
        this.sharePrompts = str;
    }

    public void setShareSourceInfo(ShareSourceInfo shareSourceInfo2) {
        this.shareSourceInfo = shareSourceInfo2;
    }

    public void setShareStrongGuide(int i) {
        this.shareStrongGuide = i;
    }

    public void setShareText(String str) {
        this.shareText = str;
    }

    public void setShareTips(String str) {
        this.shareTips = str;
    }

    public void setShareTitle(String str) {
        this.shareTitle = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTips(String str) {
        this.tips = str;
    }

    public void setTipsUrl(String str) {
        this.tipsUrl = str;
    }

    public void setUserBury(int i) {
        this.userBury = i;
    }

    public void setUserDigg(int i) {
        this.userDigg = i;
    }

    public void setVideoModel(VideoModel videoModel2) {
        this.videoModel = videoModel2;
    }

    public void setVideoPicNum(int i) {
        this.videoPicNum = i;
    }

    public void setWeiboShareTitle(String str) {
        this.weiboShareTitle = str;
    }

    public void setCellStyle(int i) {
        if (!(i == 1 || i == 2 || i == 3)) {
            i = 1;
        }
        this.cellStyle = i;
    }

    public void updateItemStats(MediaItemStats mediaItemStats) {
        if (PatchProxy.isSupport(new Object[]{mediaItemStats}, this, changeQuickRedirect, false, 62, new Class[]{MediaItemStats.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mediaItemStats}, this, changeQuickRedirect, false, 62, new Class[]{MediaItemStats.class}, Void.TYPE);
        } else if (mediaItemStats != null) {
            if (this.itemStats == null) {
                this.itemStats = mediaItemStats;
                return;
            }
            this.itemStats.setCommentCount(mediaItemStats.getCommentCount());
            this.itemStats.setDiggCount(Math.max(mediaItemStats.getDiggCount(), this.itemStats.getDiggCount()));
            this.itemStats.setPlayCount(Math.max(mediaItemStats.getPlayCount(), this.itemStats.getPlayCount()));
            this.itemStats.setShareCount(Math.max(mediaItemStats.getShareCount(), this.itemStats.getShareCount()));
        }
    }

    public void update(Media media) {
        if (PatchProxy.isSupport(new Object[]{media}, this, changeQuickRedirect, false, 61, new Class[]{Media.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{media}, this, changeQuickRedirect, false, 61, new Class[]{Media.class}, Void.TYPE);
        } else if (media != null && media.getId() == this.id) {
            this.text = media.text;
            this.createTime = media.createTime;
            this.userDigg = media.userDigg;
            this.userBury = media.userBury;
            this.mediaType = media.mediaType;
            this.status = media.status;
            updateItemStats(media.itemStats);
            if (media.author != null) {
                this.author = media.author;
            }
            if (media.videoModel != null) {
                this.videoModel = media.videoModel;
            }
            this.shareUrl = media.shareUrl;
            this.shareTitle = media.shareTitle;
            this.shareDesc = media.shareDesc;
            this.shareEnable = media.shareEnable;
            this.allowShare = media.allowShare;
            this.allowComment = media.allowComment;
            this.allowDislike = media.allowDislike;
            this.cellStyle = media.cellStyle;
            this.tips = media.tips;
            this.tipsUrl = media.tipsUrl;
            if (media.debugInfo != null) {
                this.debugInfo = media.debugInfo;
            }
            if (media.mark != null) {
                this.mark = media.mark;
            }
            this.shareText = media.shareText;
            this.cellHeight = media.cellHeight;
            this.cellWidth = media.cellWidth;
            this.feedTipsType = media.feedTipsType;
            this.feedTips = media.feedTips;
            this.location = media.location;
            this.displayStyle = media.displayStyle;
            this.commentDelay = media.commentDelay;
            this.guideCardId = media.guideCardId;
            this.sharePrompts = media.sharePrompts;
            this.commentPrompts = media.commentPrompts;
            this.weiboShareTitle = media.weiboShareTitle;
            this.shareTips = media.shareTips;
            this.enableSendFlame = media.enableSendFlame;
            this.hideNickName = media.hideNickName;
            this.music = media.music;
            this.videoPicNum = media.videoPicNum;
            this.apiTime = media.getApiTime();
            this.noNeedQuery = media.noNeedQuery;
            if (media.commerce != null) {
                this.commerce = media.commerce;
            }
        }
    }
}
