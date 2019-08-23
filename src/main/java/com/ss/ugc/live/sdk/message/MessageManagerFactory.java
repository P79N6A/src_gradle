package com.ss.ugc.live.sdk.message;

import com.ss.ugc.live.sdk.message.data.Configuration;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;

public class MessageManagerFactory {
    public static IMessageManager get(Configuration configuration) {
        return new MessageManager(configuration);
    }
}
