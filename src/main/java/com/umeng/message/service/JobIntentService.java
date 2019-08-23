package com.umeng.message.service;

import android.annotation.SuppressLint;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class JobIntentService extends Service {
    static final Object m = new Object();
    static final HashMap<ComponentName, f> n = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    CompatJobEngine f81333f;
    f g;
    a h;
    boolean i;
    boolean j;
    boolean k;
    final ArrayList<c> l;

    interface CompatJobEngine {
        IBinder compatGetBinder();

        GenericWorkItem dequeueWork();
    }

    interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void onCancelled(Void voidR) {
            try {
                JobIntentService.this.b();
            } catch (Throwable unused) {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void onPostExecute(Void voidR) {
            try {
                JobIntentService.this.b();
            } catch (Throwable unused) {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Void doInBackground(Void... voidArr) {
            while (true) {
                try {
                    GenericWorkItem c2 = JobIntentService.this.c();
                    if (c2 == null) {
                        break;
                    }
                    JobIntentService.this.a(c2.getIntent());
                    c2.complete();
                } catch (Throwable unused) {
                }
            }
            return null;
        }
    }

    static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        boolean f81335a;

        /* renamed from: b  reason: collision with root package name */
        boolean f81336b;

        /* renamed from: f  reason: collision with root package name */
        private final Context f81337f;
        private final PowerManager.WakeLock g;
        private final PowerManager.WakeLock h;

        public final void a() {
            synchronized (this) {
                this.f81335a = false;
            }
        }

        public final void b() {
            try {
                synchronized (this) {
                    if (!this.f81336b) {
                        this.f81336b = true;
                        this.h.acquire(600000);
                        this.g.release();
                    }
                }
            } catch (Throwable unused) {
            }
        }

        public final void c() {
            try {
                synchronized (this) {
                    if (this.f81336b) {
                        if (this.f81335a) {
                            this.g.acquire(60000);
                        }
                        this.f81336b = false;
                        this.h.release();
                    }
                }
            } catch (Throwable unused) {
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(Intent intent) {
            try {
                Intent intent2 = new Intent(intent);
                intent2.setComponent(this.f81348c);
                if (this.f81337f.startService(intent2) != null) {
                    synchronized (this) {
                        if (!this.f81335a) {
                            this.f81335a = true;
                            if (!this.f81336b) {
                                this.g.acquire(60000);
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }

        b(Context context, ComponentName componentName) {
            super(context, componentName);
            this.f81337f = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            this.g = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.g.setReferenceCounted(false);
            this.h = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.h.setReferenceCounted(false);
        }
    }

    final class c implements GenericWorkItem {

        /* renamed from: a  reason: collision with root package name */
        final Intent f81338a;

        /* renamed from: b  reason: collision with root package name */
        final int f81339b;

        public final Intent getIntent() {
            return this.f81338a;
        }

        public final void complete() {
            try {
                JobIntentService.this.stopSelf(this.f81339b);
            } catch (Throwable unused) {
            }
        }

        c(Intent intent, int i) {
            this.f81338a = intent;
            this.f81339b = i;
        }
    }

    static final class d extends JobServiceEngine implements CompatJobEngine {

        /* renamed from: c  reason: collision with root package name */
        final JobIntentService f81341c;

        /* renamed from: d  reason: collision with root package name */
        final Object f81342d = new Object();

        /* renamed from: e  reason: collision with root package name */
        JobParameters f81343e;

        final class a implements GenericWorkItem {

            /* renamed from: a  reason: collision with root package name */
            final JobWorkItem f81344a;

            public final Intent getIntent() {
                return this.f81344a.getIntent();
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(5:3|4|(2:6|7)|8|9) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0014 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void complete() {
                /*
                    r3 = this;
                    com.umeng.message.service.JobIntentService$d r0 = com.umeng.message.service.JobIntentService.d.this     // Catch:{ Throwable -> 0x0019 }
                    java.lang.Object r0 = r0.f81342d     // Catch:{ Throwable -> 0x0019 }
                    monitor-enter(r0)     // Catch:{ Throwable -> 0x0019 }
                    com.umeng.message.service.JobIntentService$d r1 = com.umeng.message.service.JobIntentService.d.this     // Catch:{ all -> 0x0016 }
                    android.app.job.JobParameters r1 = r1.f81343e     // Catch:{ all -> 0x0016 }
                    if (r1 == 0) goto L_0x0014
                    com.umeng.message.service.JobIntentService$d r1 = com.umeng.message.service.JobIntentService.d.this     // Catch:{ Throwable -> 0x0014 }
                    android.app.job.JobParameters r1 = r1.f81343e     // Catch:{ Throwable -> 0x0014 }
                    android.app.job.JobWorkItem r2 = r3.f81344a     // Catch:{ Throwable -> 0x0014 }
                    r1.completeWork(r2)     // Catch:{ Throwable -> 0x0014 }
                L_0x0014:
                    monitor-exit(r0)     // Catch:{ all -> 0x0016 }
                    goto L_0x0019
                L_0x0016:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0016 }
                    throw r1     // Catch:{ Throwable -> 0x0019 }
                L_0x0019:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.service.JobIntentService.d.a.complete():void");
            }

            a(JobWorkItem jobWorkItem) {
                this.f81344a = jobWorkItem;
            }
        }

        public final IBinder compatGetBinder() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0011, code lost:
            if (r2 == null) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            r2.getIntent().setExtrasClassLoader(r4.f81341c.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            return new com.umeng.message.service.JobIntentService.d.a(r4, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.umeng.message.service.JobIntentService.GenericWorkItem dequeueWork() {
            /*
                r4 = this;
                r0 = 0
                java.lang.Object r1 = r4.f81342d     // Catch:{ Throwable -> 0x002a }
                monitor-enter(r1)     // Catch:{ Throwable -> 0x002a }
                android.app.job.JobParameters r2 = r4.f81343e     // Catch:{ all -> 0x0027 }
                if (r2 != 0) goto L_0x000a
                monitor-exit(r1)     // Catch:{ all -> 0x0027 }
                return r0
            L_0x000a:
                android.app.job.JobParameters r2 = r4.f81343e     // Catch:{ all -> 0x0027 }
                android.app.job.JobWorkItem r2 = r2.dequeueWork()     // Catch:{ all -> 0x0027 }
                monitor-exit(r1)     // Catch:{ all -> 0x0027 }
                if (r2 == 0) goto L_0x0026
                android.content.Intent r1 = r2.getIntent()     // Catch:{ Throwable -> 0x002a }
                com.umeng.message.service.JobIntentService r3 = r4.f81341c     // Catch:{ Throwable -> 0x002a }
                java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ Throwable -> 0x002a }
                r1.setExtrasClassLoader(r3)     // Catch:{ Throwable -> 0x002a }
                com.umeng.message.service.JobIntentService$d$a r1 = new com.umeng.message.service.JobIntentService$d$a     // Catch:{ Throwable -> 0x002a }
                r1.<init>(r2)     // Catch:{ Throwable -> 0x002a }
                return r1
            L_0x0026:
                return r0
            L_0x0027:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0027 }
                throw r2     // Catch:{ Throwable -> 0x002a }
            L_0x002a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.service.JobIntentService.d.dequeueWork():com.umeng.message.service.JobIntentService$GenericWorkItem");
        }

        d(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f81341c = jobIntentService;
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            this.f81343e = jobParameters;
            this.f81341c.a(false);
            return true;
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            boolean a2 = this.f81341c.a();
            synchronized (this.f81342d) {
                this.f81343e = null;
            }
            return a2;
        }
    }

    static final class e extends f {

        /* renamed from: a  reason: collision with root package name */
        private final JobInfo f81346a;

        /* renamed from: b  reason: collision with root package name */
        private final JobScheduler f81347b;

        /* access modifiers changed from: package-private */
        public final void a(Intent intent) {
            try {
                this.f81347b.enqueue(this.f81346a, new JobWorkItem(intent));
            } catch (Throwable unused) {
            }
        }

        e(Context context, ComponentName componentName, int i) {
            super(context, componentName);
            a(i);
            this.f81346a = new JobInfo.Builder(i, this.f81348c).setOverrideDeadline(0).build();
            this.f81347b = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }
    }

    static abstract class f {

        /* renamed from: c  reason: collision with root package name */
        final ComponentName f81348c;

        /* renamed from: d  reason: collision with root package name */
        boolean f81349d;

        /* renamed from: e  reason: collision with root package name */
        int f81350e;

        public void a() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a(Intent intent);

        public void b() {
        }

        public void c() {
        }

        /* access modifiers changed from: package-private */
        public void a(int i) {
            if (!this.f81349d) {
                this.f81349d = true;
                this.f81350e = i;
            } else if (this.f81350e != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f81350e);
            }
        }

        f(Context context, ComponentName componentName) {
            this.f81348c = componentName;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(Intent intent);

    public boolean onStopCurrentWork() {
        return true;
    }

    public boolean isStopped() {
        return this.j;
    }

    public void onCreate() {
        super.onCreate();
        d();
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.l = null;
        } else {
            this.l = new ArrayList<>();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        if (this.h != null) {
            this.h.cancel(this.i);
        }
        this.j = true;
        return onStopCurrentWork();
    }

    public void onDestroy() {
        try {
            super.onDestroy();
            if (this.l != null) {
                synchronized (this.l) {
                    this.k = true;
                    this.g.c();
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void d() {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f81333f = new d(this);
                this.g = null;
                return;
            }
            this.f81333f = null;
            this.g = a(this, new ComponentName(this, getClass()), false, 0);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        try {
            if (this.l != null) {
                synchronized (this.l) {
                    this.h = null;
                    if (this.l != null && this.l.size() > 0) {
                        a(false);
                    } else if (!this.k) {
                        this.g.c();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public GenericWorkItem c() {
        GenericWorkItem genericWorkItem;
        if (this.f81333f != null) {
            return this.f81333f.dequeueWork();
        }
        synchronized (this.l) {
            if (this.l.size() > 0) {
                genericWorkItem = this.l.remove(0);
            } else {
                genericWorkItem = null;
            }
        }
        return genericWorkItem;
    }

    public void setInterruptIfStopped(boolean z) {
        this.i = z;
    }

    public IBinder onBind(Intent intent) {
        if (intent != null) {
            try {
                if (this.f81333f != null) {
                    return this.f81333f.compatGetBinder();
                }
                return null;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        try {
            if (this.h == null) {
                this.h = new a();
                if (this.g != null && z) {
                    this.g.b();
                }
                this.h.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        } catch (Throwable unused) {
        }
    }

    @SuppressLint({"WrongConstant"})
    public int onStartCommand(Intent intent, int i2, int i3) {
        if (intent != null) {
            try {
                if (this.l == null) {
                    return 2;
                }
                if (this.g == null) {
                    d();
                }
                this.g.a();
                synchronized (this.l) {
                    ArrayList<c> arrayList = this.l;
                    if (intent == null) {
                        intent = new Intent();
                    }
                    arrayList.add(new c(intent, i3));
                    a(true);
                }
                return 3;
            } catch (Throwable unused) {
            }
        }
        return 2;
    }

    public static void enqueueWork(Context context, Class cls, int i2, Intent intent) {
        if (!(context == null || cls == null || intent == null)) {
            try {
                enqueueWork(context, new ComponentName(context, cls), i2, intent);
            } catch (Throwable unused) {
            }
        }
    }

    static f a(Context context, ComponentName componentName, boolean z, int i2) {
        f fVar;
        f fVar2 = n.get(componentName);
        if (fVar2 != null) {
            return fVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            fVar = new b(context, componentName);
        } else if (z) {
            fVar = new e(context, componentName, i2);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        f fVar3 = fVar;
        n.put(componentName, fVar3);
        return fVar3;
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i2, Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        } else if (context != null && componentName != null) {
            try {
                synchronized (m) {
                    f a2 = a(context, componentName, true, i2);
                    a2.a(i2);
                    a2.a(intent);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
