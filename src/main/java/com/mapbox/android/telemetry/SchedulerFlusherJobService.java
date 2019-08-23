package com.mapbox.android.telemetry;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.support.annotation.RequiresApi;
import android.support.v4.content.LocalBroadcastManager;

@RequiresApi(api = 21)
public class SchedulerFlusherJobService extends JobService {
    SchedulerFlusherJobService() {
    }

    public boolean onStartJob(JobParameters jobParameters) {
        Intent intent = new Intent("com.mapbox.scheduler_flusher");
        intent.putExtra("start_job", "onStart");
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        return false;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        Intent intent = new Intent("com.mapbox.scheduler_flusher");
        intent.putExtra("stop_job", "onError");
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        return true;
    }
}
