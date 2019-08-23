package com.ss.android.message;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.reflect.Reflect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.pushmanager.app.c;
import com.ss.android.pushmanager.setting.b;

public class PushJobService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29840a;

    /* renamed from: b  reason: collision with root package name */
    private IBinder f29841b;

    @TargetApi(21)
    static class InnerJobService extends JobService implements WeakHandler.IHandler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29842a;

        /* renamed from: b  reason: collision with root package name */
        public IBinder f29843b = onBind(null);

        /* renamed from: c  reason: collision with root package name */
        private WeakHandler f29844c;

        public InnerJobService(Service service) {
            Reflect.on((Object) this).call("attachBaseContext", new Class[]{Context.class}, service);
            c.a(this);
        }

        public boolean onStopJob(JobParameters jobParameters) {
            if (PatchProxy.isSupport(new Object[]{jobParameters}, this, f29842a, false, 17914, new Class[]{JobParameters.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{jobParameters}, this, f29842a, false, 17914, new Class[]{JobParameters.class}, Boolean.TYPE)).booleanValue();
            }
            Logger.debug();
            return false;
        }

        public void handleMsg(Message message) {
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f29842a, false, 17915, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f29842a, false, 17915, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            try {
                if (message2.what == 1) {
                    JobParameters jobParameters = (JobParameters) message2.obj;
                    Logger.debug();
                    try {
                        jobFinished(jobParameters, false);
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }

        public boolean onStartJob(JobParameters jobParameters) {
            if (PatchProxy.isSupport(new Object[]{jobParameters}, this, f29842a, false, 17913, new Class[]{JobParameters.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{jobParameters}, this, f29842a, false, 17913, new Class[]{JobParameters.class}, Boolean.TYPE)).booleanValue();
            }
            Logger.debug();
            try {
                Intent intent = new Intent(this, NotifyService.class);
                intent.setAction("com.ss.android.message.action.PUSH_SERVICE");
                intent.setPackage(getPackageName());
                startService(intent);
                Intent intent2 = new Intent();
                intent2.setPackage(getPackageName());
                intent2.setClassName(getPackageName(), "com.taobao.accs.ChannelService");
                startService(intent2);
            } catch (Throwable unused) {
            }
            if (this.f29844c == null) {
                this.f29844c = new WeakHandler(this);
            }
            this.f29844c.sendMessage(Message.obtain(this.f29844c, 1, jobParameters));
            return true;
        }
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f29840a, false, 17908, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29840a, false, 17908, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                this.f29841b = new InnerJobService(this).f29843b;
            } catch (Throwable unused) {
            }
        }
        Logger.debug();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f29840a, false, 17910, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29840a, false, 17910, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    @TargetApi(21)
    static void b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f29840a, true, 17907, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f29840a, true, 17907, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        try {
            ((JobScheduler) context2.getSystemService("jobscheduler")).cancel(1);
        } catch (Throwable unused) {
        }
    }

    public boolean onUnbind(Intent intent) {
        if (!PatchProxy.isSupport(new Object[]{intent}, this, f29840a, false, 17911, new Class[]{Intent.class}, Boolean.TYPE)) {
            return super.onUnbind(intent);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{intent}, this, f29840a, false, 17911, new Class[]{Intent.class}, Boolean.TYPE)).booleanValue();
    }

    @TargetApi(21)
    static void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f29840a, true, 17906, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f29840a, true, 17906, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        try {
            JobScheduler jobScheduler = (JobScheduler) context2.getSystemService("jobscheduler");
            jobScheduler.cancel(1);
            JobInfo.Builder builder = new JobInfo.Builder(1, new ComponentName(context.getPackageName(), PushJobService.class.getName()));
            builder.setPeriodic((long) (b.a().t() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
            builder.setPersisted(true);
            builder.setRequiredNetworkType(0);
            if (jobScheduler.schedule(builder.build()) <= 0) {
                Logger.debug();
            }
        } catch (Throwable unused) {
        }
    }

    public IBinder onBind(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f29840a, false, 17912, new Class[]{Intent.class}, IBinder.class)) {
            return (IBinder) PatchProxy.accessDispatch(new Object[]{intent}, this, f29840a, false, 17912, new Class[]{Intent.class}, IBinder.class);
        }
        Logger.debug();
        if (this.f29841b != null) {
            return this.f29841b;
        }
        return new Binder();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (!PatchProxy.isSupport(new Object[]{intent, Integer.valueOf(i), Integer.valueOf(i2)}, this, f29840a, false, 17909, new Class[]{Intent.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return super.onStartCommand(intent, i, i2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{intent, Integer.valueOf(i), Integer.valueOf(i2)}, this, f29840a, false, 17909, new Class[]{Intent.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
    }
}
