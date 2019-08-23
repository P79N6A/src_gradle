package com.taobao.accs.net;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.accs.internal.AccsJobService;

public class r extends f {
    protected r(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
        JobInfo.Builder builder = new JobInfo.Builder(2050, new ComponentName(this.f79003a.getPackageName(), AccsJobService.class.getName()));
        long j = (long) (i * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        ((JobScheduler) this.f79003a.getSystemService("jobscheduler")).schedule(builder.setMinimumLatency(j).setOverrideDeadline(j).setRequiredNetworkType(1).build());
    }
}
