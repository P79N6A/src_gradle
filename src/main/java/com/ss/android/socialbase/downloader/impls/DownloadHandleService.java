package com.ss.android.socialbase.downloader.impls;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.b;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.l;

public class DownloadHandleService extends Service {
    private static final String TAG = "DownloadHandleService";

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        b.a((Context) this);
    }

    private void handleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                final int intExtra = intent.getIntExtra("extra_download_id", 0);
                if (intExtra != 0) {
                    if (action.equals("com.ss.android.downloader.action.DOWNLOAD_WAKEUP")) {
                        b.f().execute(new Runnable() {
                            public final void run() {
                                try {
                                    c a2 = c.a();
                                    int i = intExtra;
                                    l c2 = a2.c(i);
                                    if (c2 != null) {
                                        c2.n(i);
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        });
                    } else if (action.equals("com.ss.android.downloader.action.PROCESS_NOTIFY")) {
                        c a2 = c.a();
                        if (intExtra != 0) {
                            a2.b(intExtra, true);
                            l a3 = l.a(true);
                            if (a3 != null) {
                                a3.c();
                            }
                        }
                    } else {
                        if (action.equals("com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY")) {
                            b.a();
                        }
                    }
                }
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        handleIntent(intent);
        return 2;
    }
}
