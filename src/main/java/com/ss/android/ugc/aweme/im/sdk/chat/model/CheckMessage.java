package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class CheckMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int status_code;
    public StatusMsg status_msg;

    public static class StatusMsg {
        public SystemContent msg_content;
    }

    public static SystemContent getContent(CheckMessage checkMessage) {
        if (checkMessage == null || checkMessage.status_msg == null || checkMessage.status_msg.msg_content == null) {
            return null;
        }
        return checkMessage.status_msg.msg_content;
    }
}
