package com.umeng.commonsdk.internal.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import org.json.JSONObject;

public class c {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f80766b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static Context f80767c;

    /* renamed from: d  reason: collision with root package name */
    private BroadcastReceiver f80768d;

    static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final c f80770a = new c();

        private a() {
        }
    }

    public synchronized boolean a() {
        return f80766b;
    }

    private c() {
        this.f80768d = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                try {
                    if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("le", intent.getIntExtra("level", 0));
                        } catch (Exception unused) {
                        }
                        try {
                            jSONObject.put("vol", intent.getIntExtra("voltage", 0));
                        } catch (Exception unused2) {
                        }
                        try {
                            jSONObject.put("temp", intent.getIntExtra("temperature", 0));
                            jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
                        } catch (Exception unused3) {
                        }
                        int i = 2;
                        int i2 = -1;
                        switch (intent.getIntExtra("status", 0)) {
                            case 2:
                                i2 = 1;
                                break;
                            case 4:
                                i2 = 0;
                                break;
                            case 5:
                                i2 = 2;
                                break;
                        }
                        try {
                            jSONObject.put(TimeDisplaySetting.START_SHOW_TIME, i2);
                        } catch (Exception unused4) {
                        }
                        switch (intent.getIntExtra("plugged", 0)) {
                            case 1:
                                i = 1;
                                break;
                            case 2:
                                break;
                            default:
                                i = 0;
                                break;
                        }
                        try {
                            jSONObject.put("ct", i);
                            jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
                        } catch (Exception unused5) {
                        }
                        ULog.i("BatteryUtils", jSONObject.toString());
                        UMWorkDispatch.sendEvent(context, 32771, b.a(c.f80767c).a(), jSONObject.toString());
                        c.this.c();
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(c.f80767c, th);
                }
            }
        };
    }

    public synchronized void c() {
        try {
            f80767c.unregisterReceiver(this.f80768d);
            f80766b = false;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f80767c, th);
        }
    }

    public synchronized void b() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            f80767c.registerReceiver(this.f80768d, intentFilter);
            f80766b = true;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f80767c, th);
        }
    }

    public static c a(Context context) {
        if (f80767c == null && context != null) {
            f80767c = context.getApplicationContext();
        }
        return a.f80770a;
    }
}
