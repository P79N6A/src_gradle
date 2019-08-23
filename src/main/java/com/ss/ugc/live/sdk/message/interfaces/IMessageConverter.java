package com.ss.ugc.live.sdk.message.interfaces;

import com.ss.ugc.live.sdk.message.data.IMessage;

public interface IMessageConverter {
    IMessage convert(String str, String str2, long j);
}
