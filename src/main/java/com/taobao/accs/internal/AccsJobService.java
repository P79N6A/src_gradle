package com.taobao.accs.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.taobao.accs.a.a;
import com.taobao.accs.utl.ALog;

@TargetApi(21)
public class AccsJobService extends JobService {
    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        ALog.d("AccsJobService", "onStartJob", new Object[0]);
        try {
            String packageName = getPackageName();
            Intent intent = new Intent();
            intent.setPackage(packageName);
            intent.setAction("com.taobao.accs.intent.action.COMMAND");
            intent.putExtra("command", 201);
            intent.setClassName(packageName, "com.taobao.accs.ChannelService");
            a.a(getApplicationContext(), intent, false);
        } catch (Throwable th) {
            ALog.e("AccsJobService", "onStartJob", th, new Object[0]);
        }
        return false;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        try {
            Intent intent = new Intent();
            intent.setPackage(getPackageName());
            intent.setAction("com.taobao.accs.intent.action.COMMAND");
            intent.putExtra("command", 201);
            intent.setClassName(getPackageName(), "com.taobao.accs.ChannelService");
            a.a(getApplicationContext(), intent, false);
        } catch (Throwable th) {
            ALog.e("AccsJobService", "onStopJob", th, new Object[0]);
        }
        return false;
    }
}
