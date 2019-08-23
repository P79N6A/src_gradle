package com.ss.android.ugc.aweme.forward.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

public class c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aweme")
    Aweme aweme;
    @SerializedName("time")
    long blockFavoriteTime;
    @SerializedName("comment_list")
    List<Comment> comments;
    @SerializedName("favorite_ids")
    List<String> favoriteIds;
    @SerializedName("favorite_list")
    List<Aweme> favorites;
    @SerializedName("type")
    int itemType;
    @SerializedName("count")
    int likeCount;
    String requestId;

    public Aweme getAweme() {
        return this.aweme;
    }

    public long getBlockFavoriteTime() {
        return this.blockFavoriteTime;
    }

    public List<Comment> getComments() {
        return this.comments;
    }

    public List<String> getFavoriteIds() {
        return this.favoriteIds;
    }

    public List<Aweme> getFavorites() {
        return this.favorites;
    }

    public int getItemType() {
        return this.itemType;
    }

    public int getLikeCount() {
        return this.likeCount;
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setBlockFavoriteTime(long j) {
        this.blockFavoriteTime = j;
    }

    public void setComments(List<Comment> list) {
        this.comments = list;
    }

    public void setFavoriteIds(List<String> list) {
        this.favoriteIds = list;
    }

    public void setFavorites(List<Aweme> list) {
        this.favorites = list;
    }

    public void setItemType(int i) {
        this.itemType = i;
    }

    public void setLikeCount(int i) {
        this.likeCount = i;
    }

    public void setRequestId(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 45369, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 45369, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.requestId = str;
        if (this.aweme != null) {
            this.aweme.setRequestId(str);
        }
    }
}
