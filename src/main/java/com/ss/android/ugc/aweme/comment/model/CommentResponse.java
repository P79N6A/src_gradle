package com.ss.android.ugc.aweme.comment.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.Required;

public class CommentResponse extends BaseCommentResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("comment")
    @Required
    public Comment comment;
    @SerializedName("label_info")
    public String starFakeLabel;

    public void setStarFakeLabel(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 27318, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 27318, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.starFakeLabel = str;
        this.comment.setLabelInfo(str);
    }
}
