package com.ss.ugc.live.sdk.message.interceptor;

import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.LimitedSizeHashMap;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import java.util.Map;

public class DeduplicateInterceptor implements IInterceptor {
    private Map<Long, Object> mBufferMap = new LimitedSizeHashMap(512);

    public void clear() {
        this.mBufferMap.clear();
    }

    public boolean onMessage(IMessage iMessage) {
        if (this.mBufferMap.containsKey(Long.valueOf(iMessage.getMessageId()))) {
            return true;
        }
        this.mBufferMap.put(Long.valueOf(iMessage.getMessageId()), null);
        return false;
    }
}
