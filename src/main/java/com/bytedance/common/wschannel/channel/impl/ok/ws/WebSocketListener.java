package com.bytedance.common.wschannel.channel.impl.ok.ws;

import android.support.annotation.Nullable;
import okhttp3.Response;
import okio.ByteString;

public abstract class WebSocketListener {
    public void onClosed(CustomHeartBeatWebSocket customHeartBeatWebSocket, int i, String str) {
    }

    public void onClosing(CustomHeartBeatWebSocket customHeartBeatWebSocket, int i, String str) {
    }

    public void onFailure(CustomHeartBeatWebSocket customHeartBeatWebSocket, Throwable th, @Nullable Response response) {
    }

    public void onMessage(CustomHeartBeatWebSocket customHeartBeatWebSocket, String str) {
    }

    public void onMessage(CustomHeartBeatWebSocket customHeartBeatWebSocket, ByteString byteString) {
    }

    public void onOpen(CustomHeartBeatWebSocket customHeartBeatWebSocket, Response response) {
    }

    public void onPong(CustomHeartBeatWebSocket customHeartBeatWebSocket, ByteString byteString) {
    }
}
