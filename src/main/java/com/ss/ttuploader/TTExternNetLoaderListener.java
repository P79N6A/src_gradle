package com.ss.ttuploader;

public interface TTExternNetLoaderListener {
    void onComplete(TTExternResponseInfo tTExternResponseInfo);

    void onFailed(String str, Throwable th);
}
