package com.ss.android.newmedia.message;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.j;
import com.ss.android.pushmanager.client.MessageAppManager;
import com.ss.android.pushmanager.f;
import com.ss.android.pushmanager.setting.b;
import com.ss.android.pushmanager.thirdparty.PushManager;
import java.lang.reflect.Field;

public abstract class MessageReceiverService extends IntentService implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2521a;

    /* renamed from: b  reason: collision with root package name */
    private WeakHandler f2522b;

    /* renamed from: c  reason: collision with root package name */
    private Messenger f2523c;

    public abstract void a(Context context, int i, String str, int i2, String str2);

    public void handleMsg(Message message) {
    }

    public MessageReceiverService() {
        super("MessageReceiverService");
    }

    private Handler a() {
        if (PatchProxy.isSupport(new Object[0], this, f2521a, false, 18658, new Class[0], Handler.class)) {
            return (Handler) PatchProxy.accessDispatch(new Object[0], this, f2521a, false, 18658, new Class[0], Handler.class);
        }
        try {
            Field declaredField = IntentService.class.getDeclaredField("mServiceHandler");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(this);
        } catch (Exception unused) {
            return null;
        }
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f2521a, false, 18656, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2521a, false, 18656, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        f.a().a(this);
    }

    private void b() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f2521a, false, 18663, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2521a, false, 18663, new Class[0], Void.TYPE);
            return;
        }
        PowerManager powerManager = (PowerManager) getSystemService("power");
        if (b.a().q()) {
            if (Build.VERSION.SDK_INT >= 20) {
                z = powerManager.isInteractive();
            } else {
                z = powerManager.isScreenOn();
            }
            if (!z) {
                powerManager.newWakeLock(268435462, "MessageReceiverService").acquire((long) b.a().r());
            }
        }
    }

    public IBinder onBind(final Intent intent) {
        Messenger messenger;
        if (PatchProxy.isSupport(new Object[]{intent}, this, f2521a, false, 18659, new Class[]{Intent.class}, IBinder.class)) {
            return (IBinder) PatchProxy.accessDispatch(new Object[]{intent}, this, f2521a, false, 18659, new Class[]{Intent.class}, IBinder.class);
        }
        if (intent != null) {
            j.a().a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f2528a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f2528a, false, 18666, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f2528a, false, 18666, new Class[0], Void.TYPE);
                        return;
                    }
                    MessageReceiverService.this.onHandleIntent(intent);
                    MessageReceiverService.this.stopSelf();
                }
            });
        }
        if (PatchProxy.isSupport(new Object[0], this, f2521a, false, 18660, new Class[0], Messenger.class)) {
            messenger = (Messenger) PatchProxy.accessDispatch(new Object[0], this, f2521a, false, 18660, new Class[0], Messenger.class);
        } else {
            if (this.f2523c == null) {
                this.f2522b = new WeakHandler(this);
                this.f2523c = new Messenger(this.f2522b);
            }
            messenger = this.f2523c;
        }
        return messenger.getBinder();
    }

    public void onHandleIntent(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f2521a, false, 18661, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f2521a, false, 18661, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        try {
            if (PatchProxy.isSupport(new Object[]{this, intent}, this, f2521a, false, 18662, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{this, intent}, this, f2521a, false, 18662, new Class[]{Context.class, Intent.class}, Void.TYPE);
            } else {
                if (intent != null) {
                    String action = intent.getAction();
                    if (b.a().c()) {
                        try {
                            if ("com.ss.android.message".equals(action)) {
                                String handleMySelfPushIntent = MessageAppManager.inst().handleMySelfPushIntent(intent);
                                if (!StringUtils.isEmpty(handleMySelfPushIntent)) {
                                    a(this, 1, handleMySelfPushIntent, 2, null);
                                    b();
                                }
                            } else if ("com.ss.android.xiaomi.message".equals(action) || "com.ss.android.umeng.message".equals(action) || "com.ss.android.gcm.message".equals(action) || "com.ss.android.hw.message".equals(action) || "com.ss.android.mz.message".equals(action) || "com.ss.android.aliyun.message".equals(action) || "com.ss.android.vivo.message".equals(action) || "com.ss.android.oppo.message".equals(action) || "com.ss.android.adm.message".equals(action) || "com.ss.android.fcm.message".equals(action)) {
                                int intExtra = intent.getIntExtra("message_type", -1);
                                String stringExtra = intent.getStringExtra("message_obj");
                                int intExtra2 = intent.getIntExtra("message_from", -1);
                                String stringExtra2 = intent.getStringExtra("message_extra");
                                if (intExtra != 0) {
                                    if (intExtra != 2) {
                                        a(this, intExtra, stringExtra, intExtra2, stringExtra2);
                                        b();
                                    }
                                }
                                a(this, intExtra, stringExtra, intExtra2);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        final Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f2521a, false, 18657, new Class[]{Intent.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{intent2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f2521a, false, 18657, new Class[]{Intent.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        try {
            return super.onStartCommand(intent, i, i2);
        } catch (NullPointerException unused) {
            if (a() == null) {
                final int i3 = i2;
                j.a().a(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f2524a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f2524a, false, 18665, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f2524a, false, 18665, new Class[0], Void.TYPE);
                            return;
                        }
                        try {
                            MessageReceiverService.this.onHandleIntent(intent2);
                            MessageReceiverService.this.stopSelf(i3);
                        } catch (Throwable unused) {
                        }
                    }
                });
                return 2;
            }
            return 2;
        } catch (Throwable unused2) {
            return 2;
        }
    }

    private static void a(Context context, int i, String str, int i2) {
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), str, Integer.valueOf(i2)}, null, f2521a, true, 18664, new Class[]{Context.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i), str, Integer.valueOf(i2)}, null, f2521a, true, 18664, new Class[]{Context.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (context != null && ((i3 == 0 || i3 == 2) && i3 == 0)) {
            try {
                if (!TextUtils.isEmpty(b.a().n())) {
                    PushManager.inst().setAlias(context.getApplicationContext(), b.a().n(), i2);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
