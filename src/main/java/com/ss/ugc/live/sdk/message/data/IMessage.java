package com.ss.ugc.live.sdk.message.data;

public interface IMessage {
    int getIntType();

    long getMessageId();

    int getPriority();

    boolean needMonitor();
}
