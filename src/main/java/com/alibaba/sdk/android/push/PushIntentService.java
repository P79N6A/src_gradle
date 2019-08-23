package com.alibaba.sdk.android.push;

import android.app.IntentService;
import android.content.Intent;

@Deprecated
public class PushIntentService extends IntentService {
    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
    }

    public PushIntentService() {
        this("MPS:PushIntentService");
    }

    public PushIntentService(String str) {
        super(str);
    }
}
