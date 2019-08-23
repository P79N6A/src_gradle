package com.ss.android.ugc.aweme.im.sdk.chat.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.c;

public class CommentContent extends BaseContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aweme_id")
    private String awemeId;
    @SerializedName("comment")
    private String comment;
    @SerializedName("comment_id")
    private String commentId;
    @SerializedName("cover_url")
    private UrlModel coverUrl;
    @SerializedName("media_type")
    private int mediaType;

    public String getAwemeId() {
        return this.awemeId;
    }

    public String getComment() {
        return this.comment;
    }

    public String getCommentId() {
        return this.commentId;
    }

    public UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public String getMsgHint() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51110, new Class[0], String.class)) {
            return GlobalContext.getContext().getResources().getString(C0906R.string.av6);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51110, new Class[0], String.class);
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setCommentId(String str) {
        this.commentId = str;
    }

    public void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public void setMediaType(int i) {
        this.mediaType = i;
    }

    public static CommentContent obtain(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, null, changeQuickRedirect, true, 51109, new Class[]{c.class}, CommentContent.class)) {
            return (CommentContent) PatchProxy.accessDispatch(new Object[]{cVar2}, null, changeQuickRedirect, true, 51109, new Class[]{c.class}, CommentContent.class);
        }
        CommentContent commentContent = new CommentContent();
        commentContent.setAwemeId(cVar2.f52874c);
        commentContent.setMediaType(cVar2.f52877f);
        commentContent.setComment(cVar2.g);
        commentContent.setCommentId(cVar2.f52873b);
        commentContent.setType(200);
        commentContent.setCoverUrl(cVar2.f52872a);
        return commentContent;
    }
}
