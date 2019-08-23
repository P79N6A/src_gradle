package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SystemContent;
import java.io.Serializable;

@Keep
public class BaseExtra implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("status_code")
    int statusCode;
    @SerializedName("status_msg")
    StatusMessage statusMsg;

    @Keep
    public static class MessageContent {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("template")
        SystemContent.Key[] template;
        @SerializedName("tips")
        String tips;

        public SystemContent.Key[] getTemplate() {
            return this.template;
        }

        public String getTips() {
            return this.tips;
        }

        public void setTemplate(SystemContent.Key[] keyArr) {
            this.template = keyArr;
        }

        public void setTips(String str) {
            this.tips = str;
        }

        public static SystemContent toSystemContent(MessageContent messageContent) {
            MessageContent messageContent2 = messageContent;
            if (PatchProxy.isSupport(new Object[]{messageContent2}, null, changeQuickRedirect, true, 51104, new Class[]{MessageContent.class}, SystemContent.class)) {
                return (SystemContent) PatchProxy.accessDispatch(new Object[]{messageContent2}, null, changeQuickRedirect, true, 51104, new Class[]{MessageContent.class}, SystemContent.class);
            }
            SystemContent systemContent = new SystemContent();
            systemContent.setType(100);
            systemContent.tips = messageContent2.tips;
            systemContent.template = messageContent2.template;
            return systemContent;
        }
    }

    @Keep
    public static class StatusMessage {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("msg_content")
        MessageContent msgContent;
        @SerializedName("msg_type")
        int msgType;

        public MessageContent getMsgContent() {
            return this.msgContent;
        }

        public int getMsgType() {
            return this.msgType;
        }

        public void setMsgContent(MessageContent messageContent) {
            this.msgContent = messageContent;
        }

        public void setMsgType(int i) {
            this.msgType = i;
        }
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public StatusMessage getStatusMsg() {
        return this.statusMsg;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setStatusMsg(StatusMessage statusMessage) {
        this.statusMsg = statusMessage;
    }
}
