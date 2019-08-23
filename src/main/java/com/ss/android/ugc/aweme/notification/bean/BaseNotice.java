package com.ss.android.ugc.aweme.notification.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.notification.PoiNotice;

@Keep
public class BaseNotice {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad")
    public a adHelperNotice;
    @SerializedName("announcement")
    public AnnouncementNotice announcement;
    @SerializedName("at")
    public AtMe atMe;
    @SerializedName("audit")
    public AuditFailedNotice auditNotice;
    @SerializedName("inner_avatar_thumb")
    public UrlModel avatarUrl;
    @SerializedName("challenge")
    public ChallengeNotice challengeNotice;
    @SerializedName("comment")
    public CommentNotice commentNotice;
    @SerializedName("create_time")
    public long createTime;
    @SerializedName("digg")
    public DiggNotice diggNotice;
    @SerializedName("follow")
    public FollowNotice followNotice;
    @SerializedName("friend")
    public FriendNotice friendNotice;
    @SerializedName("group_avatar_thumb")
    public UrlModel groupAvatarUrl;
    @SerializedName("group_name")
    public String groupName;
    public transient long lastReadTime;
    @SerializedName("ad_link")
    public e linkProfitNotice;
    @SerializedName("live_assistant")
    public f liveAssistantNotice;
    public LogPbBean logPbBean;
    @SerializedName("lowest_position")
    public int lowestPosition;
    @SerializedName("luban_notice")
    public g lubanNotice;
    @SerializedName("nid")
    public String nid;
    @SerializedName("poi_notice")
    public PoiNotice poiNotice;
    @SerializedName("shop")
    public h shopNotice;
    public int showingPosition;
    @SerializedName("star_atlas_notice")
    public i starAtlasNotice;
    @SerializedName("story_notice")
    public StoryNotice storyNotice;
    @SerializedName("text")
    public UserTextNotice textNotice;
    @SerializedName("type")
    public int type;
    public int unReadCount;
    @SerializedName("user_id")
    public String userId;
    @SerializedName("vote_notice")
    public VoteNotice voteNotice;
    @SerializedName("wallet_notice")
    public WalletNotice walletNotice;

    public UrlModel getAvatarUrl() {
        if (this.avatarUrl != null) {
            return this.avatarUrl;
        }
        return this.groupAvatarUrl;
    }

    public long getTaskId() {
        if (this.type == 1 && this.announcement != null) {
            return this.announcement.taskId;
        }
        if (this.type != 2 || this.textNotice == null) {
            return 0;
        }
        return this.textNotice.taskId;
    }

    public boolean needForceInsert() {
        if ((this.type == 1 || this.type == 2 || this.type == 1002) && this.lowestPosition > 0) {
            return true;
        }
        return false;
    }
}
