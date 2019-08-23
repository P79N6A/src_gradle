package com.taobao.accs.net;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.taobao.accs.utl.ALog;
import java.util.Calendar;

public class a extends f {

    /* renamed from: c  reason: collision with root package name */
    private PendingIntent f78987c;

    /* renamed from: d  reason: collision with root package name */
    private AlarmManager f78988d;

    public a(Context context) {
        super(context);
        try {
            this.f78988d = (AlarmManager) this.f79003a.getSystemService("alarm");
        } catch (Throwable th) {
            ALog.e("AlarmHeartBeatMgr", "AlarmHeartBeatMgr", th, new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
        if (this.f78988d == null) {
            this.f78988d = (AlarmManager) this.f79003a.getSystemService("alarm");
        }
        if (this.f78988d == null) {
            ALog.e("AlarmHeartBeatMgr", "setInner null", new Object[0]);
            return;
        }
        if (this.f78987c == null) {
            Intent intent = new Intent();
            intent.setPackage(this.f79003a.getPackageName());
            intent.setAction("com.taobao.accs.intent.action.COMMAND");
            intent.putExtra("command", 201);
            this.f78987c = PendingIntent.getBroadcast(this.f79003a, 0, intent, 0);
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.add(13, i);
        this.f78988d.set(0, instance.getTimeInMillis(), this.f78987c);
    }
}
