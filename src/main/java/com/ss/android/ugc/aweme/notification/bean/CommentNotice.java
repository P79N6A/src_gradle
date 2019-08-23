package com.ss.android.ugc.aweme.notification.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;

@Keep
public class CommentNotice {
    @SerializedName("aweme")
    public Aweme aweme;
    @SerializedName("comment")
    public Comment comment;
    @SerializedName("comment_type")
    public int commentType;
    @SerializedName("content")
    public String content;
    @SerializedName("forward_id")
    public String forwardId;
    @SerializedName("relation_label")
    public RelationDynamicLabel relationLabel;
}
