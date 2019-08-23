package com.ss.android.websocket.internal;

public interface a {
    int getMethod();

    byte[] getPayload();

    String getPayloadEncoding();

    String getPayloadType();

    long getSeqId();

    int getService();
}
