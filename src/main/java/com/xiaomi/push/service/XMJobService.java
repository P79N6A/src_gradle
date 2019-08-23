package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.ss.android.push.PushDependManager;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.au;
import com.xiaomi.push.ga;

public class XMJobService extends Service {

    /* renamed from: a  reason: collision with root package name */
    static Service f82455a;

    /* renamed from: b  reason: collision with root package name */
    private IBinder f82456b;

    @TargetApi(21)
    static class a extends JobService {

        /* renamed from: a  reason: collision with root package name */
        Binder f82457a = ((Binder) au.a((Object) this, "onBind", new Intent()));

        /* renamed from: b  reason: collision with root package name */
        private Handler f82458b;

        static class a_ extends Handler {

            /* renamed from: a  reason: collision with root package name */
            JobService f82459a;

            a_(JobService jobService) {
                super(jobService.getMainLooper());
                this.f82459a = jobService;
            }

            public void handleMessage(Message message) {
                if (message.what == 1) {
                    JobParameters jobParameters = (JobParameters) message.obj;
                    b.a("Job finished " + jobParameters.getJobId());
                    this.f82459a.jobFinished(jobParameters, false);
                    if (jobParameters.getJobId() == 1) {
                        ga.a(false);
                    }
                }
            }
        }

        public boolean onStopJob(JobParameters jobParameters) {
            b.a("Job stop " + jobParameters.getJobId());
            return false;
        }

        a(Service service) {
            au.a((Object) this, "attachBaseContext", service);
            PushDependManager.inst().hackJobHandler(this);
        }

        public boolean onStartJob(JobParameters jobParameters) {
            try {
                b.a("Job started " + jobParameters.getJobId());
                Intent intent = new Intent(this, XMPushService.class);
                intent.setAction("com.xiaomi.push.timer");
                intent.setPackage(getPackageName());
                startService(intent);
                if (this.f82458b == null) {
                    this.f82458b = new a_(this);
                }
                this.f82458b.sendMessage(Message.obtain(this.f82458b, 1, jobParameters));
            } catch (Exception unused) {
            }
            return true;
        }
    }

    static Service a() {
        return f82455a;
    }

    public void onDestroy() {
        super.onDestroy();
        f82455a = null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f82456b = new a(this).f82457a;
        }
        f82455a = this;
    }

    public IBinder onBind(Intent intent) {
        if (this.f82456b != null) {
            return this.f82456b;
        }
        return new Binder();
    }
}
