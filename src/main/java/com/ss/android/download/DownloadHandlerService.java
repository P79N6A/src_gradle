package com.ss.android.download;

import android.app.Service;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.uikit.base.AppHooks;
import com.ss.android.download.b.c;

public class DownloadHandlerService extends Service {

    /* renamed from: a  reason: collision with root package name */
    s f28407a;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        AppHooks.InitHook initHook = AppHooks.getInitHook();
        if (initHook != null) {
            initHook.tryInit(this);
        }
    }

    private static void a(Context context, long j) {
        if (!n.a(context, j, 268435456, true)) {
            c.a(Toast.makeText(context, "Open Fail!", 0));
        }
    }

    private void a(Context context, Intent intent) {
        String action = intent.getAction();
        try {
            if ("android.ss.intent.action.DOWNLOAD_DELETE".equals(action)) {
                Uri data = intent.getData();
                Intent intent2 = new Intent(context, b.class);
                intent2.setData(data);
                intent2.addFlags(268435456);
                context.startActivity(intent2);
                f.a(context).a(context, ContentUris.parseId(intent.getData()));
            } else if ("android.ss.intent.action.DOWNLOAD_OPEN".equals(action)) {
                long parseId = ContentUris.parseId(intent.getData());
                a(context, parseId);
                f.a(context).a(context, parseId);
            } else {
                if ("android.ss.intent.action.DOWNLOAD_HIDE".equals(action)) {
                    f.a(context).a(context, ContentUris.parseId(intent.getData()));
                }
            }
        } catch (Exception unused) {
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        Logger.debug();
        if (this.f28407a == null) {
            this.f28407a = o.a((Context) this);
        }
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            if (action.equals("android.ss.intent.action.DOWNLOAD_WAKEUP")) {
                DownloadService.a((Context) this);
            } else if (action.equals("android.ss.intent.action.DOWNLOAD_OPEN") || action.equals("android.ss.intent.action.DOWNLOAD_DELETE") || action.equals("android.ss.intent.action.DOWNLOAD_HIDE")) {
                a((Context) this, intent);
            } else if (action.equals("android.ss.intent.action.DOWNLOAD_CLICK")) {
                long parseId = ContentUris.parseId(intent.getData());
                String stringExtra = intent.getStringExtra("extra_notification_tag");
                int a2 = e.a((Context) this).a(parseId);
                if (a2 >= 0) {
                    e.a(this, e.a(a2), parseId);
                    if (c.a.c(a2)) {
                        f.a((Context) this).a((Context) this, parseId);
                        f.a((Context) this).a(stringExtra);
                    }
                }
            } else if (action.equals("android.ss.intent.action.DOWNLOAD_COMPLETE")) {
                long longExtra = intent.getLongExtra("extra_download_id", -1);
                if (!f.a((Context) this).a(longExtra)) {
                    int intExtra = intent.getIntExtra("extra_download_visibility", 1);
                    if (longExtra > -1 && intExtra != 2) {
                        n.a(this, longExtra, 268435456, false);
                    }
                }
            }
        }
        stopSelf();
        return 2;
    }
}
