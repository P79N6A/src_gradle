package com.ss.android.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;

public class DownloadReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    s f28408a;

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null && k.a(context)) {
            try {
                if (k.a()) {
                    String action = intent.getAction();
                    if (!TextUtils.isEmpty(action) && !"android.intent.action.BOOT_COMPLETED".equals(action)) {
                        if (this.f28408a == null) {
                            this.f28408a = o.a(context);
                        }
                        if (action.equals("android.intent.action.BOOT_COMPLETED")) {
                            DownloadService.a(context);
                        } else if (action.equals("android.intent.action.MEDIA_MOUNTED")) {
                            DownloadService.a(context);
                        } else if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                                DownloadService.a(context);
                            }
                        } else {
                            if (action.equals("android.intent.action.PACKAGE_ADDED") || action.equals("android.intent.action.PACKAGE_REPLACED")) {
                                Uri data = intent.getData();
                                if (data != null) {
                                    data.getSchemeSpecificPart();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
