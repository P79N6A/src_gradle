package com.ss.android.ugc.aweme.comment.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class CommentItemList extends BaseCommentResponse {
    @SerializedName("cursor")
    public long cursor;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("comments")
    public List<Comment> items;
    @SerializedName("reply_style")
    public int replyStyle;
    @SerializedName("total")
    public int total;
}
