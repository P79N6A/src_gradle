package com.bytedance.apm.perf;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.bytedance.apm.c;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private BroadcastReceiver f2062a;

    /* renamed from: d  reason: collision with root package name */
    private IntentFilter f2063d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2064e;

    /* access modifiers changed from: protected */
    public final boolean c() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final long d() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f2062a = new BatteryTemperatureCollector$1(this);
        this.f2063d = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    public final void a(Activity activity) {
        super.a(activity);
        if (this.f2064e) {
            try {
                c.a().unregisterReceiver(this.f2062a);
                this.f2064e = false;
            } catch (Exception unused) {
            }
        }
    }

    public final void b(Activity activity) {
        super.b(activity);
        if (!this.f2064e) {
            try {
                c.a().registerReceiver(this.f2062a, this.f2063d);
                this.f2064e = true;
            } catch (Exception unused) {
            }
        }
    }
}
