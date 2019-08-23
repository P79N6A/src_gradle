package com.mapbox.android.telemetry;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.support.annotation.RequiresApi;
import android.support.v4.content.LocalBroadcastManager;

public final class ad implements bb {

    /* renamed from: a  reason: collision with root package name */
    public final ba f25984a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f25985b;

    /* renamed from: c  reason: collision with root package name */
    private BroadcastReceiver f25986c;

    public final void b() {
        LocalBroadcastManager.getInstance(this.f25985b).unregisterReceiver(this.f25986c);
    }

    public final void a() {
        this.f25986c = new JobSchedulerFlusher$1(this);
        LocalBroadcastManager.getInstance(this.f25985b).registerReceiver(this.f25986c, new IntentFilter("com.mapbox.scheduler_flusher"));
    }

    @RequiresApi(api = 21)
    public final void a(long j) {
        ((JobScheduler) this.f25985b.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(0, new ComponentName(this.f25985b, SchedulerFlusherJobService.class)).setPeriodic(bc.f26053a).build());
    }
}
