package com.ss.android.ugc.aweme.notification.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

@Keep
public class DiggNotice implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aweme")
    Aweme aweme;
    @SerializedName("cid")
    String cid;
    @SerializedName("comment")
    Comment comment;
    @SerializedName("content")
    String content;
    @SerializedName("digg_type")
    int diggType;
    @SerializedName("forward_id")
    String forwardId;
    @SerializedName("merge_count")
    int mergeCount;
    @SerializedName("relation_label")
    RelationDynamicLabel relationLabel;
    @SerializedName("from_user")
    List<User> users;

    public Aweme getAweme() {
        return this.aweme;
    }

    public String getCid() {
        return this.cid;
    }

    public Comment getComment() {
        return this.comment;
    }

    public String getContent() {
        return this.content;
    }

    public int getDiggType() {
        return this.diggType;
    }

    public String getForwardId() {
        return this.forwardId;
    }

    public int getMergeCount() {
        return this.mergeCount;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setComment(Comment comment2) {
        this.comment = comment2;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDiggType(int i) {
        this.diggType = i;
    }

    public void setForwardId(String str) {
        this.forwardId = str;
    }

    public void setMergeCount(int i) {
        this.mergeCount = i;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setUsers(List<User> list) {
        this.users = list;
    }

    public DiggNotice(DiggNotice diggNotice) {
        this.aweme = diggNotice.aweme;
        this.users = diggNotice.users;
        this.content = diggNotice.content;
        this.mergeCount = diggNotice.mergeCount;
        this.diggType = diggNotice.diggType;
        this.cid = diggNotice.cid;
        this.relationLabel = diggNotice.relationLabel;
        this.forwardId = diggNotice.forwardId;
    }
}
