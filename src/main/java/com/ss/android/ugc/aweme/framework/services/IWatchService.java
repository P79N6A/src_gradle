package com.ss.android.ugc.aweme.framework.services;

public interface IWatchService {

    public interface IWatchCallback {
        void onWatchFailed(Exception exc);

        void onWatchSuccess();
    }

    void sendRequest(String str, int i, IWatchCallback iWatchCallback);
}
