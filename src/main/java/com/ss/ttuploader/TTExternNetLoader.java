package com.ss.ttuploader;

public interface TTExternNetLoader {
    void cancelTask();

    int sendRequest(TTExternRequestInfo tTExternRequestInfo, TTExternNetLoaderListener tTExternNetLoaderListener);
}
