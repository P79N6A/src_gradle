package com.aweme.storage;

import a.g;
import a.i;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.Callable;

public class JobService extends Service {
    public void onCreate() {
        i.a((Callable<TResult>) new Callable<String>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public String call() throws Exception {
                c.a((Context) JobService.this);
                return null;
            }
        }).c(new g<String, String>() {
            public final /* synthetic */ Object then(i iVar) throws Exception {
                c.b(JobService.this);
                JobService.this.stopSelf();
                return null;
            }
        }, i.f1052b);
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
