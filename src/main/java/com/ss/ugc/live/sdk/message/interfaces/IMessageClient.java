package com.ss.ugc.live.sdk.message.interfaces;

import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.JsonApiResult;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import java.util.Map;

public interface IMessageClient {

    public interface Callback {
        void onApiError(Exception exc);

        void onApiSuccess(JsonApiResult jsonApiResult);

        void onApiSuccess(ProtoApiResult protoApiResult);

        void onWebSocketMessage(IMessage iMessage);
    }

    void apiCall(Map<String, String> map);

    void connectToWebSocket();

    void disconnectFromWebSocket();

    long getUserId();

    void setCallback(Callback callback);
}
