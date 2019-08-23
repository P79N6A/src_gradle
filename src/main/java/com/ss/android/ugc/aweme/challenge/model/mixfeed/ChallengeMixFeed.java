package com.ss.android.ugc.aweme.challenge.model.mixfeed;

import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.newfollow.e.a;
import com.ss.android.ugc.aweme.newfollow.e.b;
import java.util.ArrayList;
import java.util.List;

public class ChallengeMixFeed extends b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("article_list")
    public List<a> articleList;
    @SerializedName("aweme")
    private Aweme aweme;
    @SerializedName("comment_list")
    public List<Comment> commentList;
    @SerializedName("type")
    private int feedType;

    interface IChallengeMixFeedType {
    }

    public List<a> getArticleList() {
        return this.articleList;
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public int getFeedType() {
        int i = this.feedType;
        if (i == 1) {
            return 65280;
        }
        if (i != 5) {
            return this.feedType;
        }
        return 65285;
    }

    public List<Comment> getCommentList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 25840, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 25840, new Class[0], List.class);
        }
        if (this.commentList == null || this.aweme == null || !this.aweme.getAwemeControl().canShowComment()) {
            this.commentList = new ArrayList();
        }
        return this.commentList;
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setFeedType(int i) {
        this.feedType = i;
    }

    public void addComment(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, changeQuickRedirect, false, 25839, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, changeQuickRedirect, false, 25839, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        if (this.commentList == null) {
            this.commentList = new ArrayList();
        }
        this.commentList.add(0, comment);
    }

    public int deleteComment(String str) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 25843, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 25843, new Class[]{String.class}, Integer.TYPE)).intValue();
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
        if (PatchProxy.isSupport(new Object[]{comment}, this, changeQuickRedirect, false, 25838, new Class[]{Comment.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{comment}, this, changeQuickRedirect, false, 25838, new Class[]{Comment.class}, Integer.TYPE)).intValue();
        } else if (this.commentList != null) {
            return this.commentList.indexOf(comment);
        } else {
            return -1;
        }
    }

    public void setRequestId(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 25841, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 25841, new Class[]{String.class}, Void.TYPE);
            return;
        }
        super.setRequestId(str);
        if (this.aweme != null) {
            this.aweme.setRequestId(str);
        }
        if (!CollectionUtils.isEmpty(this.articleList)) {
            for (a next : this.articleList) {
                if (next != null) {
                    next.f57095a = str;
                }
            }
        }
    }

    public int updateComment(String str, int i) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 25842, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 25842, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
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
