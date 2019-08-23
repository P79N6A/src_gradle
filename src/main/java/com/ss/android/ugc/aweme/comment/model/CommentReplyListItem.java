package com.ss.android.ugc.aweme.comment.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public class CommentReplyListItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    public CommentReplyButtonStruct mButtonStruct;
    public Comment mComment;
    public List<Comment> mReplyComments = new ArrayList();

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27317, new Class[0], Integer.TYPE)) {
            return super.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27317, new Class[0], Integer.TYPE)).intValue();
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 27316, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 27316, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (!(obj instanceof CommentReplyListItem) || this.mComment == null) {
            return super.equals(obj);
        } else {
            return this.mComment.equals(((CommentReplyListItem) obj).mComment);
        }
    }
}
