package com.ss.android.ugc.aweme.message.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

@Keep
public class StrangerNoticeMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("client_msg_id")
    public long clientMsgId;
    @SerializedName("content")
    public String content;
    @SerializedName("create_time")
    public long createTime;
    @SerializedName("device_id")
    public long deviceId;
    @SerializedName("ext")
    public String ext;
    @SerializedName("from_user")
    public SimpleUser fromUser;
    @SerializedName("msg_type")
    public int msgType;
    @SerializedName("to_user")
    public SimpleUser toUser;

    public boolean isRecalled() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58740, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58740, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.ext)) {
            try {
                if (TextUtils.equals("true", (CharSequence) ((HashMap) new Gson().fromJson(this.ext, HashMap.class)).get("s:is_recalled"))) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
