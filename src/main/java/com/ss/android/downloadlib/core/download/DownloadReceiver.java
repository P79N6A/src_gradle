package com.ss.android.downloadlib.core.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.downloadad.api.a.a;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.addownload.j;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.c.c;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.ugc.aweme.C0906R;

public class DownloadReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    q f28917a;

    public void onReceive(Context context, Intent intent) {
        long j;
        Context context2 = context;
        if (context2 != null && intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action) && !"android.intent.action.BOOT_COMPLETED".equals(action)) {
                if (this.f28917a == null) {
                    this.f28917a = n.a(context);
                }
                if (action.equals("android.intent.action.BOOT_COMPLETED")) {
                    DownloadService.a(context);
                } else if (action.equals("android.intent.action.MEDIA_MOUNTED")) {
                    DownloadService.a(context);
                } else {
                    if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                        NetworkInfo b2 = this.f28917a.b();
                        if (b2 != null && b2.isConnected()) {
                            DownloadService.a(context);
                            if (b2.getType() == 1) {
                                b a2 = b.a();
                                c.a(b.f28733a, "executeWifiTasks start", null);
                                if (!a2.f28737d.isEmpty() && !a2.f28738e) {
                                    a2.f28738e = true;
                                    String str = b.f28733a;
                                    c.a(str, "executeWifiTasks mIsExecuting:" + a2.f28738e, null);
                                    boolean z = false;
                                    for (b.a next : a2.f28737d.values()) {
                                        if (next != null) {
                                            a.C0339a c2 = new a.C0339a().a(next.f28744f).b(next.f28741c).c(next.f28742d);
                                            c2.f28625f = next.f28743e;
                                            a a3 = c2.a(next.g ? 1 : 0).a();
                                            a2.f28736c.a((com.ss.android.download.api.b.c) next.f28739a);
                                            a2.f28736c.a((com.ss.android.download.api.b.a) a3);
                                            if (k.a(next.f28740b, next.f28739a.o())) {
                                                j = a2.f28736c.a(context2);
                                            } else {
                                                j = (long) a2.f28736c.a(context2, (IDownloadListener) null);
                                            }
                                            if (j > 0) {
                                                a2.f28736c.a();
                                                a2.f28735b.sendMessageDelayed(a2.f28735b.obtainMessage(201, next.f28739a.a()), 500);
                                                k.c();
                                                com.ss.android.downloadlib.a.a().a(new com.ss.android.downloadad.api.b.a((com.ss.android.download.api.b.c) next.f28739a, j));
                                                j.a(k.l(), "delay_download_start", true, next.f28739a.b(), next.f28739a.p(), next.f28739a.c(), next.f28739a.t(), 2);
                                                z = true;
                                            }
                                        }
                                    }
                                    if (z) {
                                        k.d().a(k.a(), k.a().getResources().getString(C0906R.string.abz), null, 1);
                                    }
                                    a2.f28737d.clear();
                                    com.ss.android.downloadlib.addownload.c.a("sp_delay_operation_info", "key_waiting_wifi_download_list", a2.f28737d);
                                    a2.f28738e = false;
                                }
                            }
                        }
                    } else if (action.equals("android.intent.action.PACKAGE_ADDED") || action.equals("android.intent.action.PACKAGE_REPLACED")) {
                        Uri data = intent.getData();
                        if (data != null) {
                            String schemeSpecificPart = data.getSchemeSpecificPart();
                            l a4 = k.a();
                            if (a4 != null) {
                                a4.a(context2, schemeSpecificPart);
                            }
                        }
                    }
                }
            }
        }
    }
}
