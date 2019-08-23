package com.ss.ttvideoengine.net;

import com.ss.ttvideoengine.utils.Error;

public interface DNSCompletionListener {
    void onCancelled();

    void onCompletion(String str, Error error);

    void onRetry(Error error);
}
