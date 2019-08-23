package com.ss.android.http;

import android.app.IntentService;
import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.ss.android.pushmanager.app.g;
import com.ss.android.ugc.aweme.app.f;

public class OpenUrlService extends IntentService {
    public OpenUrlService() {
        super("OpenUrlService");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            Logger.debug();
            try {
                if ("com.ss.android.action.openurl".equals(action)) {
                    String stringExtra = intent.getStringExtra(f.f34168b);
                    Logger.debug();
                    if (g.a() != null) {
                        g.a().a(stringExtra);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
