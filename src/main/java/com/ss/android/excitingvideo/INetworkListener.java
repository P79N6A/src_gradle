package com.ss.android.excitingvideo;

public interface INetworkListener {

    public interface NetworkCallback {
        void onFail(int i, String str);

        void onSuccess(String str);
    }

    void requestGet(String str, NetworkCallback networkCallback);
}
