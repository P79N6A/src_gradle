package com.loc;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import com.amap.api.location.APSServiceBase;
import com.loc.cp;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;

public class cr implements APSServiceBase {

    /* renamed from: a  reason: collision with root package name */
    cp f25698a = new cp(this.f25699b);

    /* renamed from: b  reason: collision with root package name */
    Context f25699b;

    /* renamed from: c  reason: collision with root package name */
    Messenger f25700c;

    public cr(Context context) {
        this.f25699b = context.getApplicationContext();
    }

    public void onDestroy() {
        try {
            if (this.f25698a != null) {
                this.f25698a.k.sendEmptyMessage(11);
            }
        } catch (Throwable th) {
            ce.a(th, "ApsServiceCore", "onDestroy");
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 0;
    }

    public void onCreate() {
        try {
            cp.o = false;
            this.f25698a.r = cn.b();
            this.f25698a.s = cn.a();
            cp cpVar = this.f25698a;
            cpVar.q = new cj();
            cpVar.f25692d = new cp.b("amapLocCoreThread");
            cpVar.f25692d.setPriority(5);
            cpVar.f25692d.start();
            cpVar.k = new cp.a(cpVar.f25692d.getLooper());
        } catch (Throwable th) {
            ce.a(th, "ApsServiceCore", "onCreate");
        }
    }

    public IBinder onBind(Intent intent) {
        cp cpVar = this.f25698a;
        String stringExtra = intent.getStringExtra("a");
        if (!TextUtils.isEmpty(stringExtra)) {
            cz.a(cpVar.l, stringExtra);
        }
        cpVar.f25691c = intent.getStringExtra("b");
        cy.f25731a = cpVar.f25691c;
        String stringExtra2 = intent.getStringExtra("d");
        if (!TextUtils.isEmpty(stringExtra2)) {
            dc.a(stringExtra2);
        }
        cd.f25634a = intent.getBooleanExtra("f", true);
        cp cpVar2 = this.f25698a;
        if ("true".equals(intent.getStringExtra(AdvanceSetting.ADVANCE_SETTING)) && cpVar2.k != null) {
            cpVar2.k.sendEmptyMessageDelayed(9, 100);
        }
        this.f25700c = new Messenger(this.f25698a.k);
        return this.f25700c.getBinder();
    }
}
