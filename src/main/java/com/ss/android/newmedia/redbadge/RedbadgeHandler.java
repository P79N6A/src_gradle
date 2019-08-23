package com.ss.android.newmedia.redbadge;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.j;

public class RedbadgeHandler extends Service implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30269a;

    /* renamed from: b  reason: collision with root package name */
    private WeakHandler f30270b;

    /* renamed from: c  reason: collision with root package name */
    private Messenger f30271c;

    public void handleMsg(Message message) {
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f30269a, false, 18772, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30269a, false, 18772, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.f30270b = new WeakHandler(this);
        this.f30271c = new Messenger(this.f30270b);
    }

    public final void a(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f30269a, false, 18775, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f30269a, false, 18775, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this, intent}, null, i.f30352a, true, 18779, new Class[]{RedbadgeHandler.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this, intent}, null, i.f30352a, true, 18779, new Class[]{RedbadgeHandler.class, Intent.class}, Void.TYPE);
            return;
        }
        if (intent != null) {
            b(intent);
        }
    }

    public IBinder onBind(final Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f30269a, false, 18774, new Class[]{Intent.class}, IBinder.class)) {
            return (IBinder) PatchProxy.accessDispatch(new Object[]{intent}, this, f30269a, false, 18774, new Class[]{Intent.class}, IBinder.class);
        }
        j.a().a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f30275a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f30275a, false, 18778, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f30275a, false, 18778, new Class[0], Void.TYPE);
                    return;
                }
                RedbadgeHandler.this.a(intent);
                RedbadgeHandler.this.stopSelf();
            }
        });
        return this.f30271c.getBinder();
    }

    public final void b(Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, this, f30269a, false, 18776, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2}, this, f30269a, false, 18776, new Class[]{Intent.class}, Void.TYPE);
        } else if (intent2 != null) {
            try {
                if ("com.ss.android.redbadge.message".equals(intent.getAction())) {
                    String stringExtra = intent2.getStringExtra("message_data");
                    b a2 = b.a((Context) this);
                    if (PatchProxy.isSupport(new Object[]{stringExtra}, a2, b.f30305a, false, 18727, new Class[]{String.class}, Void.TYPE)) {
                        b bVar = a2;
                        PatchProxy.accessDispatch(new Object[]{stringExtra}, bVar, b.f30305a, false, 18727, new Class[]{String.class}, Void.TYPE);
                    } else {
                        if (PatchProxy.isSupport(new Object[]{a2, stringExtra}, null, c.f30327a, true, 18742, new Class[]{b.class, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{a2, stringExtra}, null, c.f30327a, true, 18742, new Class[]{b.class, String.class}, Void.TYPE);
                        } else {
                            a2.a(stringExtra);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        final Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f30269a, false, 18773, new Class[]{Intent.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{intent2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f30269a, false, 18773, new Class[]{Intent.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        j.a().a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f30272a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f30272a, false, 18777, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f30272a, false, 18777, new Class[0], Void.TYPE);
                    return;
                }
                RedbadgeHandler.this.a(intent2);
                RedbadgeHandler.this.stopSelf();
            }
        });
        return super.onStartCommand(intent, i, i2);
    }
}
