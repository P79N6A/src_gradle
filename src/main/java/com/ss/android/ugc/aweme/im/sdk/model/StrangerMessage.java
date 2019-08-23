package com.ss.android.ugc.aweme.im.sdk.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.d.n;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.HashMap;
import java.util.UUID;

@Keep
public class StrangerMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("client_msg_id")
    long clientMsgId;
    @SerializedName("content")
    String content;
    @SerializedName("create_time")
    long createTime;
    @SerializedName("device_id")
    long deviceId;
    @SerializedName("ext")
    String ext;
    @SerializedName("from_user")
    IMUser fromUser;
    @SerializedName("msg_type")
    int msgType;
    @SerializedName("to_user")
    IMUser toUser;

    public long getClientMsgId() {
        return this.clientMsgId;
    }

    public String getContent() {
        return this.content;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDeviceId() {
        return this.deviceId;
    }

    public String getExt() {
        return this.ext;
    }

    public IMUser getFromUser() {
        return this.fromUser;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public IMUser getToUser() {
        return this.toUser;
    }

    public boolean isRecalled() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52360, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52360, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.ext)) {
            try {
                if (TextUtils.equals("true", (CharSequence) ((HashMap) l.a(this.ext, HashMap.class)).get("s:is_recalled"))) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void setClientMsgId(long j) {
        this.clientMsgId = j;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDeviceId(long j) {
        this.deviceId = j;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public void setFromUser(IMUser iMUser) {
        this.fromUser = iMUser;
    }

    public void setMsgType(int i) {
        this.msgType = i;
    }

    public void setToUser(IMUser iMUser) {
        this.toUser = iMUser;
    }

    public static n toChatMessage(StrangerMessage strangerMessage) {
        long j;
        StrangerMessage strangerMessage2 = strangerMessage;
        if (PatchProxy.isSupport(new Object[]{strangerMessage2}, null, changeQuickRedirect, true, 52361, new Class[]{StrangerMessage.class}, n.class)) {
            return (n) PatchProxy.accessDispatch(new Object[]{strangerMessage2}, null, changeQuickRedirect, true, 52361, new Class[]{StrangerMessage.class}, n.class);
        }
        n nVar = new n();
        nVar.setUuid(UUID.randomUUID().toString());
        nVar.setMsgStatus(5);
        nVar.setContent(strangerMessage.getContent());
        nVar.setMsgType(strangerMessage.getMsgType());
        nVar.setCreatedAt(strangerMessage.getCreateTime() * 1000);
        nVar.setMsgId(strangerMessage2.clientMsgId);
        if (!TextUtils.isEmpty(strangerMessage.getExt())) {
            try {
                nVar.setExt((HashMap) l.a(strangerMessage.getExt(), HashMap.class));
            } catch (Exception unused) {
            }
        }
        nVar.addExt("old_client_message_id", String.valueOf(strangerMessage2.clientMsgId));
        nVar.setConversationType(d.a.f20886a);
        if (strangerMessage.getFromUser().getUid() == null) {
            j = 0;
        } else {
            j = Long.parseLong(strangerMessage.getFromUser().getUid());
        }
        nVar.setSender(j);
        return nVar;
    }
}
