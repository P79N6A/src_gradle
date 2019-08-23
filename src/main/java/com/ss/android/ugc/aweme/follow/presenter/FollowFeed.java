package com.ss.android.ugc.aweme.follow.presenter;

import android.support.annotation.Keep;
import com.bytedance.common.utility.StringUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.c;
import com.ss.android.ugc.aweme.newfollow.e.b;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

@Keep
public class FollowFeed extends b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aweme")
    private Aweme aweme;
    long blockFavoriteTime;
    @SerializedName("comment_list")
    private List<Comment> commentList;
    List<String> favoriteIds;
    @SerializedName("favorite_list")
    List<Aweme> favorites;
    @SerializedName("feed_type")
    private int feedType;
    @SerializedName("recommend_total_num")
    private int hasMoreRecommendFeed;
    private boolean isFirstEmptyRecFollowFeed;
    c lastViewData;
    @SerializedName("count")
    int likeCount;
    @SerializedName("like_list")
    private List<User> likeList;
    User mRecommendUser;
    @SerializedName("recommend_reason")
    private String recommendReason;
    @SerializedName("cell_room")
    private h roomStruct;
    @SerializedName("user")
    private List<User> user;

    public FollowFeed() {
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public long getBlockFavoriteTime() {
        return this.blockFavoriteTime;
    }

    public List<String> getFavoriteIds() {
        return this.favoriteIds;
    }

    public List<Aweme> getFavorites() {
        return this.favorites;
    }

    public int getHasMoreRecommendFeed() {
        return this.hasMoreRecommendFeed;
    }

    public c getLastViewData() {
        return this.lastViewData;
    }

    public int getLikeCount() {
        return this.likeCount;
    }

    public List<User> getLikeList() {
        return this.likeList;
    }

    public String getRecommendReason() {
        return this.recommendReason;
    }

    public User getRecommendUser() {
        return this.mRecommendUser;
    }

    public h getRoomStruct() {
        return this.roomStruct;
    }

    public List<User> getUser() {
        return this.user;
    }

    public boolean isFirstEmptyRecFollowFeed() {
        return this.isFirstEmptyRecFollowFeed;
    }

    public int getFeedType() {
        int i = this.feedType;
        if (i == -1) {
            return 65288;
        }
        switch (i) {
            case 1:
                return 65280;
            case 2:
                return 65281;
            case 3:
                return 65298;
            default:
                return this.feedType;
        }
    }

    public List<Comment> getCommentList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44634, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44634, new Class[0], List.class);
        }
        if (this.commentList == null || this.aweme == null || !this.aweme.getAwemeControl().canShowComment()) {
            this.commentList = new ArrayList();
        }
        return this.commentList;
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setBlockFavoriteTime(long j) {
        this.blockFavoriteTime = j;
    }

    public void setFavoriteIds(List<String> list) {
        this.favoriteIds = list;
    }

    public void setFavorites(List<Aweme> list) {
        this.favorites = list;
    }

    public void setFeedType(int i) {
        this.feedType = i;
    }

    public void setFirstEmptyRecFollowFeed(boolean z) {
        this.isFirstEmptyRecFollowFeed = z;
    }

    public void setHasMoreRecommendFeed(int i) {
        this.hasMoreRecommendFeed = i;
    }

    public void setLastViewData(c cVar) {
        this.lastViewData = cVar;
    }

    public void setLikeCount(int i) {
        this.likeCount = i;
    }

    public void setLikeList(List<User> list) {
        this.likeList = list;
    }

    public void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public void setRecommendUser(User user2) {
        this.mRecommendUser = user2;
    }

    public void setRoomStruct(h hVar) {
        this.roomStruct = hVar;
    }

    public void setUser(List<User> list) {
        this.user = list;
    }

    public FollowFeed(Aweme aweme2) {
        this.feedType = 65280;
        this.aweme = aweme2;
        this.commentList = new ArrayList();
    }

    public void setRequestId(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 44633, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 44633, new Class[]{String.class}, Void.TYPE);
            return;
        }
        super.setRequestId(str);
        if (this.aweme != null) {
            this.aweme.setRequestId(str);
        }
    }

    public static FollowFeed createLastWatchHistoryItem(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, null, changeQuickRedirect, true, 44632, new Class[]{c.class}, FollowFeed.class)) {
            return (FollowFeed) PatchProxy.accessDispatch(new Object[]{cVar2}, null, changeQuickRedirect, true, 44632, new Class[]{c.class}, FollowFeed.class);
        }
        FollowFeed followFeed = new FollowFeed();
        followFeed.setFeedType(65297);
        followFeed.setLastViewData(cVar2);
        return followFeed;
    }

    public void addComment(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, changeQuickRedirect, false, 44637, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, changeQuickRedirect, false, 44637, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        if (this.commentList == null) {
            this.commentList = new ArrayList();
        }
        if (this.mIsMomentStyle) {
            this.commentList.add(comment);
        } else {
            this.commentList.add(0, comment);
        }
    }

    public int deleteComment(String str) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 44639, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 44639, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        if (this.commentList != null) {
            while (i < this.commentList.size()) {
                Comment comment = this.commentList.get(i);
                if (comment == null || !StringUtils.equal(comment.getCid(), str)) {
                    i++;
                } else {
                    this.commentList.remove(i);
                    return i;
                }
            }
        }
        return -1;
    }

    public int getCommentPosition(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, changeQuickRedirect, false, 44635, new Class[]{Comment.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{comment}, this, changeQuickRedirect, false, 44635, new Class[]{Comment.class}, Integer.TYPE)).intValue();
        } else if (this.commentList != null) {
            return this.commentList.indexOf(comment);
        } else {
            return -1;
        }
    }

    public void setCommentList(List<Comment> list) {
        ArrayList arrayList;
        FollowFeed followFeed;
        if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 44636, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 44636, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (list == null) {
            arrayList = new ArrayList();
            followFeed = this;
        } else {
            followFeed = this;
            arrayList = list;
        }
        followFeed.commentList = arrayList;
    }

    public int updateComment(String str, int i) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 44638, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 44638, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.commentList != null) {
            while (i2 < this.commentList.size()) {
                Comment comment = this.commentList.get(i2);
                if (comment == null || !StringUtils.equal(comment.getCid(), str)) {
                    i2++;
                } else {
                    com.ss.android.ugc.aweme.comment.a.b.a(comment, getAwemeAuthorId());
                    if (i >= 0) {
                        comment.setDiggCount(i);
                    }
                    return i2;
                }
            }
        }
        return -1;
    }
}
