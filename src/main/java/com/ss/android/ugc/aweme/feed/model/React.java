package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

public class React extends BaseResponse implements h, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("origin")
    Aweme origin;
    @SerializedName("can_react_origin")
    boolean originReactable;
    @SerializedName("can_react_current")
    boolean reactable;
    String requestId;

    public Aweme getOrigin() {
        return this.origin;
    }

    public boolean getOriginReactable() {
        return this.originReactable;
    }

    public boolean getReactable() {
        return this.reactable;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setOrigin(Aweme aweme) {
        this.origin = aweme;
    }

    public void setOriginReactable(boolean z) {
        this.originReactable = z;
    }

    public void setReactable(boolean z) {
        this.reactable = z;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public int getReactionPermission(Aweme aweme, Aweme aweme2) {
        if (PatchProxy.isSupport(new Object[]{aweme, aweme2}, this, changeQuickRedirect, false, 41472, new Class[]{Aweme.class, Aweme.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aweme, aweme2}, this, changeQuickRedirect, false, 41472, new Class[]{Aweme.class, Aweme.class}, Integer.TYPE)).intValue();
        } else if ((this.reactable || aweme.getAuthor().isMe()) && (this.originReactable || aweme2.getAuthor().isMe())) {
            return 3;
        } else {
            if (this.reactable || aweme.getAuthor().isMe()) {
                return 2;
            }
            if (this.originReactable || aweme2.getAuthor().isMe()) {
                return 1;
            }
            return 0;
        }
    }
}
