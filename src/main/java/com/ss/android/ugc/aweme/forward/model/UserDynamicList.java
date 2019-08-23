package com.ss.android.ugc.aweme.forward.model;

import android.support.annotation.Keep;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

@Keep
public class UserDynamicList extends BaseResponse implements h {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("dongtai_list")
    private List<c> dynamicList;
    @SerializedName("has_more")
    private int hasMore;
    @SerializedName("max_cursor")
    private long maxCursor;
    @SerializedName("min_cursor")
    private long minCursor;
    String requestId;

    public List<c> getDynamicList() {
        return this.dynamicList;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setDynamicList(List<c> list) {
        this.dynamicList = list;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public void setMinCursor(long j) {
        this.minCursor = j;
    }

    public void setRequestId(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 45374, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 45374, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.requestId = str;
        if (!CollectionUtils.isEmpty(this.dynamicList)) {
            for (c next : this.dynamicList) {
                if (next != null) {
                    next.setRequestId(str);
                }
            }
        }
    }
}
