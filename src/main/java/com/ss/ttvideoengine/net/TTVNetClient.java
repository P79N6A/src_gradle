package com.ss.ttvideoengine.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.ttvideoengine.utils.Error;
import org.json.JSONObject;

public abstract class TTVNetClient {
    public static ChangeQuickRedirect changeQuickRedirect;

    public interface CompletionListener {
        void onCompletion(JSONObject jSONObject, Error error);
    }

    public void cancel() {
    }

    public void startTask(String str, CompletionListener completionListener) {
    }
}
