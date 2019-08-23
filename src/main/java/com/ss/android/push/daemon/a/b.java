package com.ss.android.push.daemon.a;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.ss.android.push.daemon.nativ.NativeDaemonAPI;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    private IBinder f30406c;

    /* renamed from: d  reason: collision with root package name */
    private Parcel f30407d;

    private boolean c() {
        try {
            if (this.f30406c != null) {
                if (this.f30407d != null) {
                    this.f30406c.transact(34, this.f30407d, null, 0);
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void a() {
        if (c() && this.f30403b != null && this.f30403b.f30412c != null) {
            this.f30403b.f30412c.a();
        }
    }

    private void b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityManagerNative");
            Object invoke = cls.getMethod("getDefault", new Class[0]).invoke(cls, new Object[0]);
            Field declaredField = invoke.getClass().getDeclaredField("mRemote");
            declaredField.setAccessible(true);
            this.f30406c = (IBinder) declaredField.get(invoke);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
        } catch (Throwable unused2) {
        }
    }

    @SuppressLint({"Recycle"})
    private void a(Context context, String str) {
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(context.getPackageName(), str);
        intent.setAction("start_by_daemon_action");
        intent.setComponent(componentName);
        this.f30407d = Parcel.obtain();
        this.f30407d.writeInterfaceToken("android.app.IActivityManager");
        this.f30407d.writeStrongBinder(null);
        intent.writeToParcel(this.f30407d, 0);
        this.f30407d.writeString(null);
        this.f30407d.writeInt(0);
    }

    public final void a(Context context, com.ss.android.push.daemon.b bVar) {
        super.a(context, bVar);
        try {
            b();
            a(context, bVar.f30411b.f30414b);
            c();
            try {
                File dir = context.getDir("indicators", 0);
                new NativeDaemonAPI(context).doDaemon(new File(dir, "indicator_p").getAbsolutePath(), new File(dir, "indicator_d").getAbsolutePath(), new File(dir, "observer_p").getAbsolutePath(), new File(dir, "observer_d").getAbsolutePath());
            } catch (Throwable unused) {
            }
            if (bVar != null) {
                if (bVar.f30412c != null) {
                    this.f30403b = bVar;
                    bVar.f30412c.b(context);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public final void b(Context context, com.ss.android.push.daemon.b bVar) {
        super.b(context, bVar);
        try {
            b();
            a(context, bVar.f30410a.f30414b);
            c();
            try {
                File dir = context.getDir("indicators", 0);
                new NativeDaemonAPI(context).doDaemon(new File(dir, "indicator_d").getAbsolutePath(), new File(dir, "indicator_p").getAbsolutePath(), new File(dir, "observer_d").getAbsolutePath(), new File(dir, "observer_p").getAbsolutePath());
            } catch (Throwable unused) {
            }
            if (bVar != null) {
                if (bVar.f30412c != null) {
                    this.f30403b = bVar;
                    bVar.f30412c.c(context);
                }
            }
        } catch (Throwable unused2) {
        }
    }
}
