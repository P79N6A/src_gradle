package com.ss.ugc.live.sdk.message.interfaces;

import com.ss.ugc.live.sdk.message.data.IMessage;

public interface IMessageManager {
    void addInterceptor(IInterceptor iInterceptor);

    void addMessageListener(int i, OnMessageListener onMessageListener);

    void addOnInterceptListener(OnInterceptListener onInterceptListener);

    void insertMessage(IMessage iMessage);

    void insertMessage(IMessage iMessage, boolean z);

    void release();

    void removeInterceptor(IInterceptor iInterceptor);

    void removeMessageListener(int i, OnMessageListener onMessageListener);

    void removeMessageListener(OnMessageListener onMessageListener);

    void removeOnInterceptListener(OnInterceptListener onInterceptListener);

    void startMessage();

    void stopMessage(boolean z);
}
