package com.bytedance.common.wschannel.channel;

import org.json.JSONObject;

public interface IMessageHandler {
    void onConnection(int i, JSONObject jSONObject);

    void onMessage(int i, byte[] bArr);
}
