package com.xiaomi.push;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ga;
import com.xiaomi.push.service.XMJobService;

@TargetApi(21)
public class gc implements ga.a {

    /* renamed from: a  reason: collision with root package name */
    JobScheduler f82084a;

    /* renamed from: a  reason: collision with other field name */
    Context f410a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f411a;

    gc(Context context) {
        this.f410a = context;
        this.f82084a = (JobScheduler) context.getSystemService("jobscheduler");
    }

    public void a() {
        this.f411a = false;
        this.f82084a.cancel(1);
    }

    /* access modifiers changed from: package-private */
    public void a(long j) {
        JobInfo.Builder builder = new JobInfo.Builder(1, new ComponentName(this.f410a.getPackageName(), XMJobService.class.getName()));
        builder.setMinimumLatency(j);
        builder.setOverrideDeadline(j);
        builder.setRequiredNetworkType(1);
        builder.setPersisted(false);
        JobInfo build = builder.build();
        b.c("schedule Job = " + build.getId() + " in " + j);
        this.f82084a.schedule(builder.build());
    }

    public void a(boolean z) {
        if (z || this.f411a) {
            long b2 = (long) gw.b();
            if (z) {
                a();
                b2 -= SystemClock.elapsedRealtime() % b2;
            }
            this.f411a = true;
            a(b2);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m322a() {
        return this.f411a;
    }
}
