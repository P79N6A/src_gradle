package com.ss.android.ugc.aweme.im.sdk.model;

import android.support.annotation.Keep;
import com.bytedance.im.core.d.n;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.List;

@Keep
public class StrangerMessageList extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("message_list")
    List<StrangerMessage> mDatas;

    public List<StrangerMessage> getmDatas() {
        return this.mDatas;
    }

    public List<n> toChatMessages() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52362, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52362, new Class[0], List.class);
        } else if (this.mDatas == null || this.mDatas.isEmpty()) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList(this.mDatas.size());
            for (StrangerMessage chatMessage : this.mDatas) {
                arrayList.add(StrangerMessage.toChatMessage(chatMessage));
            }
            return arrayList;
        }
    }

    public void setmDatas(List<StrangerMessage> list) {
        this.mDatas = list;
    }
}
