package com.ss.ugc.live.sdk.message.data;

import java.util.List;

public class ProtoApiResult {
    public String cursor;
    public long delayTimeBeforeDispatch;
    public long fetchInterval;
    public List<IMessage> messages;
    public long now;
}
