package com.ss.android.ugc.aweme.newfollow.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public abstract class b extends BaseResponse implements h {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean mIsMomentStyle;
    String requestId;

    public void addComment(Comment comment) {
    }

    public int deleteComment(String str) {
        return -1;
    }

    public List<a> getArticleList() {
        return null;
    }

    public Aweme getAweme() {
        return null;
    }

    public List<Comment> getCommentList() {
        return null;
    }

    public int getCommentPosition(Comment comment) {
        return -1;
    }

    public abstract int getFeedType();

    public List<User> getLikeList() {
        return null;
    }

    public void setAweme(Aweme aweme) {
    }

    public abstract void setFeedType(int i);

    public int updateComment(String str, int i) {
        return -1;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getAwemeAuthorId() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 61201, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 61201, new Class[0], String.class);
        } else if (getAweme() != null) {
            return getAweme().getAuthorUid();
        } else {
            return null;
        }
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }
}
