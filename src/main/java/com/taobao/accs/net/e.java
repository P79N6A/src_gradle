package com.taobao.accs.net;

import android.content.Context;
import android.content.Intent;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.a.a;
import com.taobao.accs.utl.ALog;
import org.android.agoo.common.Config;

public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f78999a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f79000b;

    public void run() {
        ALog.d(this.f79000b.d(), "startChannelService", new Object[0]);
        Intent intent = new Intent("com.taobao.accs.intent.action.START_SERVICE");
        intent.putExtra("appKey", this.f79000b.i());
        intent.putExtra("ttid", this.f79000b.f78989a);
        intent.putExtra("packageName", this.f78999a.getPackageName());
        intent.putExtra("app_sercet", this.f79000b.i.getAppSecret());
        intent.putExtra("mode", AccsClientConfig.mEnv);
        intent.putExtra("agoo_app_key", Config.a(this.f78999a));
        intent.putExtra("configTag", this.f79000b.m);
        intent.setClassName(this.f78999a.getPackageName(), "com.taobao.accs.ChannelService");
        a.a(this.f78999a, intent, false);
        Intent intent2 = new Intent();
        intent2.setAction("org.agoo.android.intent.action.REPORT");
        intent2.setPackage(this.f78999a.getPackageName());
        intent2.setClassName(this.f78999a.getPackageName(), com.taobao.accs.client.a.a(this.f78999a.getPackageName()));
        a.a(this.f78999a, intent2, true);
    }

    e(b bVar, Context context) {
        this.f79000b = bVar;
        this.f78999a = context;
    }
}
