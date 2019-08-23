package com.ss.android.pushmanager.client;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.DeviceUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.a;
import com.ss.android.message.b.k;
import com.ss.android.message.i;
import com.ss.android.pushmanager.IMessageAppAdapter;
import com.ss.android.pushmanager.a.c;
import com.ss.android.pushmanager.a.d;
import com.ss.android.pushmanager.b;
import com.ss.android.pushmanager.f;
import com.ss.android.pushmanager.h;
import com.ss.android.pushmanager.i;
import com.ss.android.pushmanager.j;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import com.ss.android.pushmanager.thirdparty.PushDependAdapter;
import com.ss.android.pushmanager.thirdparty.PushManager;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class MessageAppManager implements IMessageAppAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile MessageAppManager sMessageAppManager;
    private volatile AtomicBoolean hasRegisteredWithLastChannels = new AtomicBoolean(false);
    private volatile AtomicBoolean isRequestingUpdateSender = new AtomicBoolean(false);
    private String mChannelName;
    private boolean mEnableCreateChannel = true;
    public Handler mHandler = new Handler(Looper.getMainLooper());
    @SuppressLint({"UseSparseArrays"})
    private Map<Integer, Boolean> mPushRegistedMap = new HashMap();

    private MessageAppManager() {
    }

    public static MessageAppManager inst() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 19021, new Class[0], MessageAppManager.class)) {
            return (MessageAppManager) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 19021, new Class[0], MessageAppManager.class);
        }
        if (sMessageAppManager == null) {
            synchronized (MessageAppManager.class) {
                if (sMessageAppManager == null) {
                    sMessageAppManager = new MessageAppManager();
                }
            }
        }
        return sMessageAppManager;
    }

    private void pushDependAdapterInject() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19044, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19044, new Class[0], Void.TYPE);
            return;
        }
        try {
            PushDependAdapter.inJect();
        } catch (Throwable unused) {
        }
    }

    public Context getContext() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19047, new Class[0], Context.class)) {
            return a.a();
        }
        return (Context) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19047, new Class[0], Context.class);
    }

    @Deprecated
    public void synNotifySwitchStatus(Context context) {
        d.a(context);
    }

    public void initPushSetting(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 19043, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 19043, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a((Application) context.getApplicationContext());
    }

    public void setDebuggable(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 19052, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 19052, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.e.a.a.f19626a = z;
    }

    public void setIExtraMessageDepend(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, changeQuickRedirect, false, 19048, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, changeQuickRedirect, false, 19048, new Class[]{b.class}, Void.TYPE);
            return;
        }
        f.k = bVar;
    }

    public void setMonitorEnable(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 19050, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 19050, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        c.f30482c = z;
    }

    public void setMonitorImpl(com.ss.android.pushmanager.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, changeQuickRedirect, false, 19049, new Class[]{com.ss.android.pushmanager.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, changeQuickRedirect, false, 19049, new Class[]{com.ss.android.pushmanager.a.a.class}, Void.TYPE);
            return;
        }
        c.f30481b = aVar;
    }

    private void registerAliPushObserver(final Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 19041, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 19041, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        try {
            context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.a(context, "ali_push_type", "integer"), true, new ContentObserver(this.mHandler) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f30530a;

                public final void onChange(boolean z) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f30530a, false, 19056, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f30530a, false, 19056, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    Logger.debug();
                    MessageAppManager.this.registerAliPushOnChannelProcess(context);
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void trySendPushDaemonMonitor(Context context) {
        String str;
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 19042, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 19042, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        try {
            com.ss.android.pushmanager.setting.b a2 = com.ss.android.pushmanager.setting.b.a();
            if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.pushmanager.setting.b.f2543a, false, 19202, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.pushmanager.setting.b.f2543a, false, 19202, new Class[0], String.class);
            } else {
                str = a2.f2546c.a("push_daemon_monitor_result", "");
            }
            if (!StringUtils.isEmpty(str)) {
                f.a();
                new JSONObject(str);
                com.ss.android.pushmanager.setting.b.a().a("");
            }
        } catch (Throwable unused) {
        }
    }

    public String handleMySelfPushIntent(Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, this, changeQuickRedirect, false, 19024, new Class[]{Intent.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{intent2}, this, changeQuickRedirect, false, 19024, new Class[]{Intent.class}, String.class);
        } else if (intent2 != null && "com.ss.android.message".equals(intent.getAction())) {
            return intent2.getStringExtra("message_data");
        } else {
            return null;
        }
    }

    public void registerAliPushOnChannelProcess(Context context) {
        int i;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 19040, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 19040, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        com.ss.android.pushmanager.setting.b a2 = com.ss.android.pushmanager.setting.b.a();
        if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.pushmanager.setting.b.f2543a, false, 19225, new Class[0], Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.pushmanager.setting.b.f2543a, false, 19225, new Class[0], Integer.TYPE)).intValue();
        } else {
            i = a2.f2546c.a("ali_push_type", -1);
        }
        if (i >= 0) {
            registerPush(context2, i);
        }
    }

    public boolean registerAllThirdPush(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 19037, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 19037, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        boolean registerAliPush = registerAliPush(context);
        if (com.ss.android.pushmanager.setting.b.a().c()) {
            registerAliPush = registerAliPush | tryConfigPush(context, 1) | tryConfigPush(context, 7) | tryConfigPush(context, 8) | tryConfigPush(context, 10) | tryConfigPush(context, 5) | registerPush(context, 11) | tryConfigPush(context, 14);
        } else {
            unRegisterAllThirdPush(context);
        }
        return registerAliPush;
    }

    public void tryRegisterWithLastValidChannels(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 19035, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 19035, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (this.hasRegisteredWithLastChannels.compareAndSet(false, true)) {
            tryRegistAllSelectedPush(context, com.ss.android.pushmanager.setting.b.a().m(), false);
        }
    }

    public void unRegisterAllThirdPush(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 19038, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 19038, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        unregisterPush(context, 1);
        unregisterPush(context, 7);
        unregisterPush(context, 8);
        unregisterPush(context, 6);
        unregisterPush(context, 10);
        unregisterPush(context, 5);
        unregisterPush(context, 14);
        this.mPushRegistedMap.clear();
    }

    private boolean registerAliPush(Context context) {
        boolean z;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 19039, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 19039, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        int i = -1;
        try {
            if (h.a(6)) {
                try {
                    z = tryConfigPush(context2, 6);
                    try {
                        Logger.debug();
                        i = 6;
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    z = false;
                    return z;
                }
            } else {
                z = false;
            }
            com.ss.android.pushmanager.setting.b a2 = com.ss.android.pushmanager.setting.b.a();
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, a2, com.ss.android.pushmanager.setting.b.f2543a, false, 19224, new Class[]{Integer.TYPE}, Void.TYPE)) {
                com.ss.android.pushmanager.setting.b bVar = a2;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, bVar, com.ss.android.pushmanager.setting.b.f2543a, false, 19224, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                a2.f2546c.a().a("ali_push_type", i).a();
            }
        } catch (Throwable unused3) {
            z = false;
            return z;
        }
        return z;
    }

    private boolean saveSsids(Map<String, String> map) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2}, this, changeQuickRedirect, false, 19032, new Class[]{Map.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{map2}, this, changeQuickRedirect, false, 19032, new Class[]{Map.class}, Boolean.TYPE)).booleanValue();
        }
        if (map2 != null && !map.isEmpty()) {
            String str = map2.get(i.f30562a);
            String str2 = map2.get(i.f30563b);
            if (!StringUtils.isEmpty(map2.get(i.f30566e)) && !StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                com.ss.android.pushmanager.setting.b a2 = com.ss.android.pushmanager.setting.b.a();
                if (PatchProxy.isSupport(new Object[]{map2}, a2, com.ss.android.pushmanager.setting.b.f2543a, false, 19218, new Class[]{Map.class}, Void.TYPE)) {
                    com.ss.android.pushmanager.setting.b bVar = a2;
                    PatchProxy.accessDispatch(new Object[]{map2}, bVar, com.ss.android.pushmanager.setting.b.f2543a, false, 19218, new Class[]{Map.class}, Void.TYPE);
                } else {
                    com.ss.android.pushmanager.setting.a.a().a(map2);
                }
                return true;
            }
        }
        return false;
    }

    public void registerSelfPush(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 19022, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 19022, new Class[]{Context.class}, Void.TYPE);
        } else if (context != null) {
            com.ss.android.message.i a2 = com.ss.android.message.i.a();
            if (PatchProxy.isSupport(new Object[]{context}, a2, com.ss.android.message.i.f30012a, false, 17918, new Class[]{Context.class}, Boolean.TYPE)) {
                ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, a2, com.ss.android.message.i.f30012a, false, 17918, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
            } else {
                i.a a3 = i.a.a(context);
                if (PatchProxy.isSupport(new Object[]{context, a3}, a2, com.ss.android.message.i.f30012a, false, 17919, new Class[]{Context.class, a.class}, Boolean.TYPE)) {
                    ((Boolean) PatchProxy.accessDispatch(new Object[]{context, a3}, a2, com.ss.android.message.i.f30012a, false, 17919, new Class[]{Context.class, a.class}, Boolean.TYPE)).booleanValue();
                } else {
                    a2.f30014b = context.getApplicationContext();
                    com.ss.android.message.i.f30013d = a3;
                    a2.a(a2.f30014b, com.ss.android.message.h.a(a2.f30014b));
                }
            }
        }
    }

    public void setDefaultChannelName(boolean z, String str) {
        this.mEnableCreateChannel = z;
        this.mChannelName = str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        com.ss.android.message.b.b.a(r21.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0061, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0062, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x005a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void createMessageData(android.content.Context r20, com.ss.android.pushmanager.c r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<com.ss.android.pushmanager.c> r4 = com.ss.android.pushmanager.c.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 19023(0x4a4f, float:2.6657E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0045
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 0
            r16 = 19023(0x4a4f, float:2.6657E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.pushmanager.c> r1 = com.ss.android.pushmanager.c.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0045:
            if (r1 == 0) goto L_0x0063
            if (r0 != 0) goto L_0x004a
            goto L_0x0063
        L_0x004a:
            com.ss.android.pushmanager.app.e r2 = new com.ss.android.pushmanager.app.e     // Catch:{ Exception -> 0x005a }
            r2.<init>(r1)     // Catch:{ Exception -> 0x005a }
            com.ss.android.pushmanager.app.e.a((com.ss.android.pushmanager.app.e) r2)     // Catch:{ Exception -> 0x005a }
            com.ss.android.pushmanager.app.e r2 = com.ss.android.pushmanager.app.e.a()     // Catch:{ Exception -> 0x005a }
            r2.a((android.content.Context) r0)     // Catch:{ Exception -> 0x005a }
            return
        L_0x005a:
            android.content.Context r0 = r21.a()     // Catch:{ Throwable -> 0x0062 }
            com.ss.android.message.b.b.a(r0)     // Catch:{ Throwable -> 0x0062 }
            return
        L_0x0062:
            return
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.client.MessageAppManager.createMessageData(android.content.Context, com.ss.android.pushmanager.c):void");
    }

    private boolean isPushAvailable(Context context, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19026, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19026, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null) {
            return false;
        } else {
            return PushManager.inst().isPushAvailable(context2, i);
        }
    }

    private boolean registerPush(Context context, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19027, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19027, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!h.a(i) || context2 == null) {
            return false;
        } else {
            PushManager.inst().registerPush(context2, i);
            return true;
        }
    }

    private void unregisterPush(Context context, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19028, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19028, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
        } else if (i2 == 8 && !k.a()) {
        } else {
            if ((i2 != 7 || DeviceUtils.isEmui()) && context != null) {
                PushManager.inst().unregisterPush(context.getApplicationContext(), i2);
            }
        }
    }

    public void checkPushConfiguration(String str, Context context) {
        String str2 = str;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{str2, context2}, this, changeQuickRedirect, false, 19051, new Class[]{String.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, context2}, this, changeQuickRedirect, false, 19051, new Class[]{String.class, Context.class}, Void.TYPE);
            return;
        }
        PushManager.inst().checkThirdPushConfig(str2, context2);
    }

    public void getSSIDs(Context context, Map<String, String> map) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{context, map2}, this, changeQuickRedirect, false, 19045, new Class[]{Context.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, map2}, this, changeQuickRedirect, false, 19045, new Class[]{Context.class, Map.class}, Void.TYPE);
            return;
        }
        com.ss.android.pushmanager.setting.b.a().a(map2);
    }

    public synchronized void handleAppLogUpdate(Context context, Map<String, String> map) {
        if (PatchProxy.isSupport(new Object[]{context, map}, this, changeQuickRedirect, false, 19033, new Class[]{Context.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, map}, this, changeQuickRedirect, false, 19033, new Class[]{Context.class, Map.class}, Void.TYPE);
            return;
        }
        handleAppLogUpdate(context, map, false);
    }

    public void initOnApplication(Context context, com.ss.android.pushmanager.c cVar) {
        Context context2 = context;
        com.ss.android.pushmanager.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{context2, cVar2}, this, changeQuickRedirect, false, 19030, new Class[]{Context.class, com.ss.android.pushmanager.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, cVar2}, this, changeQuickRedirect, false, 19030, new Class[]{Context.class, com.ss.android.pushmanager.c.class}, Void.TYPE);
            return;
        }
        initOnApplication(context2, cVar2, null);
    }

    private boolean tryConfigPush(Context context, int i) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19025, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19025, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (context == null || com.ss.android.pushmanager.setting.b.a().k()) {
            return false;
        } else {
            Context applicationContext = context.getApplicationContext();
            if (!h.a(i) || !isPushAvailable(applicationContext, i)) {
                unregisterPush(applicationContext.getApplicationContext(), i);
                this.mPushRegistedMap.put(Integer.valueOf(i), Boolean.FALSE);
                return false;
            } else if (this.mPushRegistedMap.containsKey(Integer.valueOf(i)) && this.mPushRegistedMap.get(Integer.valueOf(i)).booleanValue()) {
                return true;
            } else {
                this.mPushRegistedMap.put(Integer.valueOf(i), Boolean.TRUE);
                return registerPush(applicationContext, i);
            }
        }
    }

    public void trackPush(Context context, int i, Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), obj2}, this, changeQuickRedirect, false, 19029, new Class[]{Context.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i), obj2}, this, changeQuickRedirect, false, 19029, new Class[]{Context.class, Integer.TYPE, Object.class}, Void.TYPE);
        } else if (context != null) {
            PushManager.inst().trackPush(context.getApplicationContext(), i, obj2);
        }
    }

    public void tryRegistAllSelectedPush(final Context context, String str, boolean z) {
        String str2;
        boolean z2;
        Context context2 = context;
        String str3 = str;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{context2, str3, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 19036, new Class[]{Context.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, Byte.valueOf(z)}, this, changeQuickRedirect, false, 19036, new Class[]{Context.class, String.class, Boolean.TYPE}, Void.TYPE);
        } else if (com.ss.android.pushmanager.setting.b.a().f()) {
            boolean a2 = h.a().a(str3);
            Logger.debug();
            if (!z || a2) {
                str2 = str3;
            } else {
                str2 = com.ss.android.pushmanager.setting.b.a().m();
                if (!h.a().a(str2)) {
                    d.a(false, str2);
                    return;
                }
            }
            Logger.debug();
            if (!z || !a2) {
                z2 = false;
            } else {
                z2 = true;
            }
            h.a(str2, z2);
            boolean registerAllThirdPush = registerAllThirdPush(context);
            registerSelfPush(context);
            trySendPushDaemonMonitor(context);
            this.mHandler.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f30527a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f30527a, false, 19055, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f30527a, false, 19055, new Class[0], Void.TYPE);
                        return;
                    }
                    Context context = context;
                    if (PatchProxy.isSupport(new Object[]{context}, null, c.f30541a, true, 19066, new Class[]{Context.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context}, null, c.f30541a, true, 19066, new Class[]{Context.class}, Void.TYPE);
                        return;
                    }
                    if (k.d(context)) {
                        b.a(context);
                    }
                }
            });
            if (registerAllThirdPush || com.ss.android.pushmanager.setting.b.a().l()) {
                z3 = true;
            }
            d.a(z3, str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01dc, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void handleAppLogUpdate(android.content.Context r22, java.util.Map<java.lang.String, java.lang.String> r23, boolean r24) {
        /*
            r21 = this;
            r8 = r21
            r0 = r22
            r9 = r23
            monitor-enter(r21)
            r10 = 3
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x01dd }
            r11 = 0
            r1[r11] = r0     // Catch:{ all -> 0x01dd }
            r12 = 1
            r1[r12] = r9     // Catch:{ all -> 0x01dd }
            java.lang.Byte r2 = java.lang.Byte.valueOf(r24)     // Catch:{ all -> 0x01dd }
            r13 = 2
            r1[r13] = r2     // Catch:{ all -> 0x01dd }
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect     // Catch:{ all -> 0x01dd }
            r4 = 0
            r5 = 19034(0x4a5a, float:2.6672E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ all -> 0x01dd }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r6[r11] = r2     // Catch:{ all -> 0x01dd }
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            r6[r12] = r2     // Catch:{ all -> 0x01dd }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x01dd }
            r6[r13] = r2     // Catch:{ all -> 0x01dd }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x01dd }
            r2 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01dd }
            if (r1 == 0) goto L_0x005c
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x01dd }
            r1[r11] = r0     // Catch:{ all -> 0x01dd }
            r1[r12] = r9     // Catch:{ all -> 0x01dd }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r24)     // Catch:{ all -> 0x01dd }
            r1[r13] = r0     // Catch:{ all -> 0x01dd }
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect     // Catch:{ all -> 0x01dd }
            r4 = 0
            r5 = 19034(0x4a5a, float:2.6672E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ all -> 0x01dd }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r6[r11] = r0     // Catch:{ all -> 0x01dd }
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            r6[r12] = r0     // Catch:{ all -> 0x01dd }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x01dd }
            r6[r13] = r0     // Catch:{ all -> 0x01dd }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x01dd }
            r2 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01dd }
            monitor-exit(r21)
            return
        L_0x005c:
            boolean r1 = r8.saveSsids(r9)     // Catch:{ all -> 0x01dd }
            com.ss.android.pushmanager.j r2 = com.ss.android.pushmanager.j.b()     // Catch:{ all -> 0x01dd }
            r2.a((android.content.Context) r0, (java.util.Map<java.lang.String, java.lang.String>) r9)     // Catch:{ all -> 0x01dd }
            com.ss.android.pushmanager.setting.b r2 = com.ss.android.pushmanager.setting.b.a()     // Catch:{ all -> 0x01dd }
            boolean r2 = r2.f()     // Catch:{ all -> 0x01dd }
            if (r2 != 0) goto L_0x0073
            monitor-exit(r21)
            return
        L_0x0073:
            if (r1 == 0) goto L_0x00ef
            java.lang.Object[] r14 = new java.lang.Object[r11]     // Catch:{ all -> 0x01dd }
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.pushmanager.a.b.f30473a     // Catch:{ all -> 0x01dd }
            r17 = 1
            r18 = 19099(0x4a9b, float:2.6763E-41)
            java.lang.Class[] r2 = new java.lang.Class[r11]     // Catch:{ all -> 0x01dd }
            java.lang.Class r20 = java.lang.Void.TYPE     // Catch:{ all -> 0x01dd }
            r19 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x01dd }
            if (r2 == 0) goto L_0x009d
            java.lang.Object[] r14 = new java.lang.Object[r11]     // Catch:{ all -> 0x01dd }
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.pushmanager.a.b.f30473a     // Catch:{ all -> 0x01dd }
            r17 = 1
            r18 = 19099(0x4a9b, float:2.6763E-41)
            java.lang.Class[] r2 = new java.lang.Class[r11]     // Catch:{ all -> 0x01dd }
            java.lang.Class r20 = java.lang.Void.TYPE     // Catch:{ all -> 0x01dd }
            r19 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x01dd }
            goto L_0x00ef
        L_0x009d:
            boolean r2 = com.ss.android.pushmanager.a.c.a()     // Catch:{ all -> 0x01dd }
            if (r2 == 0) goto L_0x00ef
            java.util.concurrent.atomic.AtomicBoolean r2 = com.ss.android.pushmanager.a.b.f30476d     // Catch:{ all -> 0x01dd }
            boolean r2 = r2.get()     // Catch:{ all -> 0x01dd }
            if (r2 != 0) goto L_0x00ba
            boolean r2 = com.bytedance.e.a.a.a()     // Catch:{ all -> 0x01dd }
            if (r2 != 0) goto L_0x00b2
            goto L_0x00ba
        L_0x00b2:
            com.ss.android.pushmanager.a.a.a r0 = new com.ss.android.pushmanager.a.a.a     // Catch:{ all -> 0x01dd }
            java.lang.String r1 = "调用时序错误，请先调用 MessageAppManager.inst().initOnApplication();然后再调用MessageAppManager.inst().handleAppLogUpdate()"
            r0.<init>(r1)     // Catch:{ all -> 0x01dd }
            throw r0     // Catch:{ all -> 0x01dd }
        L_0x00ba:
            java.util.concurrent.atomic.AtomicBoolean r2 = com.ss.android.pushmanager.a.b.f30474b     // Catch:{ all -> 0x01dd }
            boolean r2 = r2.compareAndSet(r11, r12)     // Catch:{ all -> 0x01dd }
            if (r2 == 0) goto L_0x00ef
            android.os.Handler r2 = com.ss.android.pushmanager.a.b.a()     // Catch:{ all -> 0x01dd }
            boolean r2 = r2.hasMessages(r12)     // Catch:{ all -> 0x01dd }
            if (r2 == 0) goto L_0x00d3
            android.os.Handler r2 = com.ss.android.pushmanager.a.b.a()     // Catch:{ all -> 0x01dd }
            r2.removeMessages(r12)     // Catch:{ all -> 0x01dd }
        L_0x00d3:
            android.os.Handler r2 = com.ss.android.pushmanager.a.b.a()     // Catch:{ all -> 0x01dd }
            boolean r2 = r2.hasMessages(r13)     // Catch:{ all -> 0x01dd }
            if (r2 == 0) goto L_0x00e4
            android.os.Handler r2 = com.ss.android.pushmanager.a.b.a()     // Catch:{ all -> 0x01dd }
            r2.removeMessages(r13)     // Catch:{ all -> 0x01dd }
        L_0x00e4:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01dd }
            long r4 = com.ss.android.pushmanager.a.b.f30475c     // Catch:{ all -> 0x01dd }
            r6 = 0
            long r2 = r2 - r4
            com.ss.android.pushmanager.a.b.a(r11, r2)     // Catch:{ all -> 0x01dd }
        L_0x00ef:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01dd }
            com.ss.android.pushmanager.setting.b r4 = com.ss.android.pushmanager.setting.b.a()     // Catch:{ all -> 0x01dd }
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ all -> 0x01dd }
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.pushmanager.setting.b.f2543a     // Catch:{ all -> 0x01dd }
            r16 = 0
            r17 = 19237(0x4b25, float:2.6957E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]     // Catch:{ all -> 0x01dd }
            java.lang.Class r19 = java.lang.Long.TYPE     // Catch:{ all -> 0x01dd }
            r14 = r4
            r18 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01dd }
            if (r5 == 0) goto L_0x0126
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ all -> 0x01dd }
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.pushmanager.setting.b.f2543a     // Catch:{ all -> 0x01dd }
            r16 = 0
            r17 = 19237(0x4b25, float:2.6957E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]     // Catch:{ all -> 0x01dd }
            java.lang.Class r19 = java.lang.Long.TYPE     // Catch:{ all -> 0x01dd }
            r14 = r4
            r18 = r5
            java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01dd }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x01dd }
            long r4 = r4.longValue()     // Catch:{ all -> 0x01dd }
            goto L_0x0130
        L_0x0126:
            com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r4 = r4.f2546c     // Catch:{ all -> 0x01dd }
            java.lang.String r5 = "last_get_update_sender_time_mil"
            r6 = 0
            long r4 = r4.a((java.lang.String) r5, (long) r6)     // Catch:{ all -> 0x01dd }
        L_0x0130:
            r6 = 0
            long r2 = r2 - r4
            com.ss.android.pushmanager.setting.b r4 = com.ss.android.pushmanager.setting.b.a()     // Catch:{ all -> 0x01dd }
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ all -> 0x01dd }
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.pushmanager.setting.b.f2543a     // Catch:{ all -> 0x01dd }
            r16 = 0
            r17 = 19239(0x4b27, float:2.696E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]     // Catch:{ all -> 0x01dd }
            java.lang.Class r19 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01dd }
            r14 = r4
            r18 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01dd }
            if (r5 == 0) goto L_0x0165
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ all -> 0x01dd }
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.pushmanager.setting.b.f2543a     // Catch:{ all -> 0x01dd }
            r16 = 0
            r17 = 19239(0x4b27, float:2.696E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]     // Catch:{ all -> 0x01dd }
            java.lang.Class r19 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01dd }
            r14 = r4
            r18 = r5
            java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01dd }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x01dd }
            int r4 = r4.intValue()     // Catch:{ all -> 0x01dd }
            goto L_0x0171
        L_0x0165:
            com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r4 = r4.f2546c     // Catch:{ all -> 0x01dd }
            java.lang.String r5 = "update_sender_interval_time_second"
            r6 = 10800(0x2a30, float:1.5134E-41)
            int r4 = r4.a((java.lang.String) r5, (int) r6)     // Catch:{ all -> 0x01dd }
            int r4 = r4 * 1000
        L_0x0171:
            long r4 = (long) r4     // Catch:{ all -> 0x01dd }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0178
            r2 = 1
            goto L_0x0179
        L_0x0178:
            r2 = 0
        L_0x0179:
            if (r1 == 0) goto L_0x017d
            if (r2 == 0) goto L_0x017f
        L_0x017d:
            if (r24 == 0) goto L_0x0181
        L_0x017f:
            r1 = 1
            goto L_0x0182
        L_0x0181:
            r1 = 0
        L_0x0182:
            if (r1 == 0) goto L_0x0196
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.isRequestingUpdateSender     // Catch:{ all -> 0x01dd }
            boolean r1 = r1.compareAndSet(r11, r12)     // Catch:{ all -> 0x01dd }
            if (r1 == 0) goto L_0x0196
            com.ss.android.pushmanager.client.MessageAppManager$2 r1 = new com.ss.android.pushmanager.client.MessageAppManager$2     // Catch:{ all -> 0x01dd }
            r1.<init>(r0)     // Catch:{ all -> 0x01dd }
            com.bytedance.common.utility.concurrent.ThreadPlus.submitRunnable(r1)     // Catch:{ all -> 0x01dd }
            monitor-exit(r21)
            return
        L_0x0196:
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.isRequestingUpdateSender     // Catch:{ all -> 0x01dd }
            boolean r1 = r1.get()     // Catch:{ all -> 0x01dd }
            if (r1 != 0) goto L_0x01db
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x01dd }
            r1.<init>()     // Catch:{ all -> 0x01dd }
            com.ss.android.pushmanager.setting.a r2 = com.ss.android.pushmanager.setting.a.a()     // Catch:{ all -> 0x01dd }
            r2.b(r1)     // Catch:{ all -> 0x01dd }
            java.lang.String r2 = com.ss.android.pushmanager.i.f30566e     // Catch:{ all -> 0x01dd }
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x01dd }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01dd }
            java.lang.String r3 = com.ss.android.pushmanager.i.f30562a     // Catch:{ all -> 0x01dd }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x01dd }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01dd }
            java.lang.String r4 = com.ss.android.pushmanager.i.f30563b     // Catch:{ all -> 0x01dd }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x01dd }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01dd }
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r2)     // Catch:{ all -> 0x01dd }
            if (r2 != 0) goto L_0x01d5
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r3)     // Catch:{ all -> 0x01dd }
            if (r2 != 0) goto L_0x01d5
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ all -> 0x01dd }
            if (r1 != 0) goto L_0x01d5
            goto L_0x01d6
        L_0x01d5:
            r12 = 0
        L_0x01d6:
            if (r12 == 0) goto L_0x01db
            r21.tryRegisterWithLastValidChannels(r22)     // Catch:{ all -> 0x01dd }
        L_0x01db:
            monitor-exit(r21)
            return
        L_0x01dd:
            r0 = move-exception
            monitor-exit(r21)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.client.MessageAppManager.handleAppLogUpdate(android.content.Context, java.util.Map, boolean):void");
    }

    public void initOnApplication(Context context, com.ss.android.pushmanager.c cVar, String str) {
        String str2;
        final Context context2 = context;
        com.ss.android.pushmanager.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{context2, cVar2, str}, this, changeQuickRedirect, false, 19031, new Class[]{Context.class, com.ss.android.pushmanager.c.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, cVar2, str}, this, changeQuickRedirect, false, 19031, new Class[]{Context.class, com.ss.android.pushmanager.c.class, String.class}, Void.TYPE);
            return;
        }
        a.a((Application) context.getApplicationContext());
        if (!StringUtils.isEmpty(str)) {
            k.f29997b = str;
            str2 = str;
        } else {
            str2 = k.a(context);
        }
        createMessageData(context, cVar);
        pushDependAdapterInject();
        j.b().a(context2, cVar2);
        if (str2.endsWith(":pushservice")) {
            registerAliPushOnChannelProcess(context);
            registerAliPushObserver(context);
        }
        if (k.d(context)) {
            this.mHandler.postDelayed(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f30519a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f30519a, false, 19053, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f30519a, false, 19053, new Class[0], Void.TYPE);
                        return;
                    }
                    if (com.ss.android.pushmanager.setting.b.a().f()) {
                        d.a(context2);
                    }
                }
            }, TimeUnit.SECONDS.toMillis(15));
            if (this.mEnableCreateChannel) {
                String str3 = this.mChannelName;
                if (PatchProxy.isSupport(new Object[]{context2, str3}, null, d.f30542a, true, 19076, new Class[]{Context.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context2, str3}, null, d.f30542a, true, 19076, new Class[]{Context.class, String.class}, Void.TYPE);
                } else {
                    ThreadPlus.submitRunnable(new Runnable(str3, context2) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f30549a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f30550b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ Context f30551c;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f30549a, false, 19080, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f30549a, false, 19080, new Class[0], Void.TYPE);
                            } else if (Build.VERSION.SDK_INT >= 26) {
                                String str = this.f30550b;
                                if (TextUtils.isEmpty(str)) {
                                    str = this.f30551c.getString(C0906R.string.bu5);
                                }
                                NotificationManager notificationManager = (NotificationManager) this.f30551c.getSystemService("notification");
                                if (notificationManager != null && notificationManager.getNotificationChannel("push") == null) {
                                    NotificationChannel notificationChannel = new NotificationChannel("push", str, 4);
                                    notificationChannel.setShowBadge(true);
                                    notificationChannel.enableVibration(true);
                                    notificationChannel.enableLights(true);
                                    notificationManager.createNotificationChannel(notificationChannel);
                                }
                            }
                        }

                        {
                            this.f30550b = r1;
                            this.f30551c = r2;
                        }
                    });
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], null, com.ss.android.pushmanager.a.b.f30473a, true, 19096, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, com.ss.android.pushmanager.a.b.f30473a, true, 19096, new Class[0], Void.TYPE);
            return;
        }
        if (c.a()) {
            com.ss.android.pushmanager.a.b.f30476d.set(true);
            if (k.d(a.a())) {
                com.ss.android.pushmanager.a.b.f30475c = System.currentTimeMillis();
                com.ss.android.pushmanager.a.b.a().sendEmptyMessageDelayed(1, TimeUnit.SECONDS.toMillis(20));
                com.ss.android.pushmanager.a.b.a().sendEmptyMessageDelayed(2, TimeUnit.SECONDS.toMillis(30));
            }
        }
    }

    public void trackClickPush(Context context, long j, boolean z, String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, new Long(j2), Byte.valueOf(z ? (byte) 1 : 0), str2, jSONObject}, this, changeQuickRedirect, false, 19046, new Class[]{Context.class, Long.TYPE, Boolean.TYPE, String.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {context, new Long(j2), Byte.valueOf(z), str2, jSONObject};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 19046, new Class[]{Context.class, Long.TYPE, Boolean.TYPE, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (jSONObject == null) {
            try {
                jSONObject2 = new JSONObject();
            } catch (Exception unused) {
                return;
            }
        } else {
            jSONObject2 = jSONObject;
        }
        if (z) {
            jSONObject2.put("click_position", "notify");
        } else {
            jSONObject2.put("click_position", "alert");
        }
        if (!TextUtils.isEmpty(str)) {
            jSONObject2.put("post_back", str2);
        }
        jSONObject2.put("rule_id", j2);
        f.a().a("push_click", jSONObject2);
    }
}
