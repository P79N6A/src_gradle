package com.vivo.push.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import com.vivo.push.PushClient;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.p;
import com.vivo.push.util.o;

public class PushServiceReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static HandlerThread f81634a;

    /* renamed from: b  reason: collision with root package name */
    private static Handler f81635b;

    /* renamed from: c  reason: collision with root package name */
    private static a f81636c = new a();

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Context f81637a;

        /* renamed from: b  reason: collision with root package name */
        private String f81638b;

        a() {
        }

        public final void run() {
            boolean z;
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f81637a.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                z = activeNetworkInfo.isConnectedOrConnecting();
            } else {
                z = false;
            }
            if (!z) {
                o.d("PushServiceReceiver", this.f81637a.getPackageName() + ": 无网络  by " + this.f81638b);
                Context context = this.f81637a;
                o.a(context, "触发静态广播:无网络(" + this.f81638b + "," + this.f81637a.getPackageName() + ")");
                return;
            }
            o.d("PushServiceReceiver", this.f81637a.getPackageName() + ": 执行开始出发动作: " + this.f81638b);
            Context context2 = this.f81637a;
            o.a(context2, "触发静态广播(" + this.f81638b + "," + this.f81637a.getPackageName() + ")");
            p.a().a(this.f81637a);
            if (!ClientConfigManagerImpl.getInstance(this.f81637a).isCancleBroadcastReceiver()) {
                PushClient.getInstance(this.f81637a).initialize();
            }
        }

        static /* synthetic */ void a(a aVar, Context context, String str) {
            aVar.f81637a = context.getApplicationContext();
            aVar.f81638b = str;
        }
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action) || "android.intent.action.ACTION_POWER_CONNECTED".equals(action) || "android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
            if (f81634a == null) {
                HandlerThread handlerThread = new HandlerThread("PushServiceReceiver");
                f81634a = handlerThread;
                handlerThread.start();
                f81635b = new Handler(f81634a.getLooper());
            }
            o.d("PushServiceReceiver", context.getPackageName() + ": start PushSerevice for by " + action + "  ; handler : " + f81635b);
            a.a(f81636c, context, action);
            f81635b.removeCallbacks(f81636c);
            f81635b.postDelayed(f81636c, 2000);
        }
    }
}
