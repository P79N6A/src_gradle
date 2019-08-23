package com.aweme.storage;

import a.g;
import a.i;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import java.util.concurrent.Callable;

@TargetApi(21)
public class CompatJobService extends JobService {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f7355a;

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public boolean onStartJob(final JobParameters jobParameters) {
        i.a((Callable<TResult>) new Callable<String>() {
            public final /* synthetic */ Object call() throws Exception {
                c.a((Context) CompatJobService.this);
                return null;
            }
        }).c(new g<String, String>() {
            public final /* synthetic */ Object then(i iVar) throws Exception {
                c.b(CompatJobService.this);
                CompatJobService.this.jobFinished(jobParameters, false);
                CompatJobService.f7355a = false;
                return null;
            }
        }, i.f1052b);
        return true;
    }
}
