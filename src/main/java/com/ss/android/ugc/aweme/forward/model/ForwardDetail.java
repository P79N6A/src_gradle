package com.ss.android.ugc.aweme.forward.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

@Keep
public class ForwardDetail extends BaseResponse implements h {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aweme_info")
    private Aweme aweme;
    @SerializedName("comment_info")
    private Comment comment;
    @SerializedName("label_info")
    private String labelInfo;
    String requestId;

    public Aweme getAweme() {
        return this.aweme;
    }

    public Comment getComment() {
        return this.comment;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setComment(Comment comment2) {
        this.comment = comment2;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    public void setRequestId(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 45370, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 45370, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.aweme != null) {
            this.aweme.setRequestId(str);
        }
        this.requestId = str;
    }
}
