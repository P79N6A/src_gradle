package com.ss.ugc.live.sdk.message.interfaces;

import com.ss.ugc.live.sdk.message.data.IMessage;

public interface IInterceptor {
    boolean onMessage(IMessage iMessage);
}
