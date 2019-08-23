package com.ss.android.ugc.aweme.forward.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

public final class b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Aweme mAweme;
    private Comment mComment;
    private int mType;

    public final Aweme getAweme() {
        return this.mAweme;
    }

    public final Comment getComment() {
        return this.mComment;
    }

    public final int getType() {
        return this.mType;
    }

    public final int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 45368, new Class[0], Integer.TYPE)) {
            return super.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 45368, new Class[0], Integer.TYPE)).intValue();
    }

    public final void setAweme(Aweme aweme) {
        this.mAweme = aweme;
    }

    public final void setComment(Comment comment) {
        this.mComment = comment;
    }

    public final void setType(int i) {
        this.mType = i;
    }

    public b(int i) {
        this.mType = i;
    }

    public b(Comment comment) {
        this.mType = 1;
        this.mComment = comment;
    }

    public b(Aweme aweme) {
        this.mAweme = aweme;
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 45367, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 45367, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this.mType != 1 || this.mComment == null || !(obj instanceof b)) {
            return super.equals(obj);
        } else {
            return this.mComment.equals(((b) obj).getComment());
        }
    }
}
