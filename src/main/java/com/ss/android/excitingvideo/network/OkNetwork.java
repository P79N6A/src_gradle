package com.ss.android.excitingvideo.network;

import java.io.IOException;
import java.util.List;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkNetwork {
    private static OkNetwork sInstance = new OkNetwork();
    private final OkHttpClient okHttpClient = new OkHttpClient();

    public static OkNetwork inst() {
        return sInstance;
    }

    private OkNetwork() {
    }

    public void sendTrackUrl(List<String> list) {
        sendTrackUrl(list, true);
    }

    public void requestGet(String str, NetworkCallback networkCallback) {
        this.okHttpClient.newCall(new Request.Builder().url(str).build()).enqueue(new Callback() {
            public void onFailure(Call call, IOException iOException) {
            }

            public void onResponse(Call call, Response response) throws IOException {
                if (response != null) {
                    response.body().close();
                }
            }
        });
    }

    public void sendTrackUrl(List<String> list, boolean z) {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                requestGet(list.get(i), null);
            }
            if (z) {
                list.clear();
            }
        }
    }
}
