package com.ss.android.ugc.aweme.framework.services;

public interface IFollowService {

    public interface IFollowCallback {
        void onFollowFailed(Exception exc);

        void onFollowSuccess();
    }

    void sendRequest(String str, int i, IFollowCallback iFollowCallback);
}
