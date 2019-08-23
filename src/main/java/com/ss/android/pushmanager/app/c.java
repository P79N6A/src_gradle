package com.ss.android.pushmanager.app;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobService;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.b.k;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30501a;

    static class a implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30502a;

        /* renamed from: b  reason: collision with root package name */
        Handler f30503b;

        /* renamed from: c  reason: collision with root package name */
        Handler.Callback f30504c;

        public final boolean handleMessage(Message message) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{message}, this, f30502a, false, 19000, new Class[]{Message.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{message}, this, f30502a, false, 19000, new Class[]{Message.class}, Boolean.TYPE)).booleanValue();
            }
            if (message != null) {
                try {
                    Logger.debug();
                    if (this.f30504c != null) {
                        z = this.f30504c.handleMessage(message);
                    } else {
                        z = false;
                    }
                    if (!z && this.f30503b != null) {
                        this.f30503b.handleMessage(message);
                    }
                    return true;
                } catch (Throwable unused) {
                }
            }
            if (this.f30504c != null) {
                return this.f30504c.handleMessage(message);
            }
            return false;
        }

        public a(Handler handler, Handler.Callback callback) {
            this.f30503b = handler;
            this.f30504c = callback;
        }
    }

    @TargetApi(21)
    public static void a(Service service) {
        Service service2 = service;
        if (PatchProxy.isSupport(new Object[]{service2}, null, f30501a, true, 18999, new Class[]{Service.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{service2}, null, f30501a, true, 18999, new Class[]{Service.class}, Void.TYPE);
        } else if (service2 instanceof JobService) {
            try {
                JobService jobService = (JobService) service2;
                if (!k.d(jobService) && Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT < 26) {
                    Reflect on = Reflect.on((Object) jobService);
                    if (on != null) {
                        on.call("ensureHandler");
                        Handler handler = (Handler) on.field("mHandler", Class.forName("android.app.job.JobService$JobHandler")).get();
                        if (handler != null) {
                            Reflect on2 = Reflect.on((Object) handler);
                            on2.set("mCallback", new a(handler, (Handler.Callback) on2.field("mCallback", Handler.Callback.class).get()));
                            Logger.debug();
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
