package com.bytedance.common.wschannel.client;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.common.wschannel.WsChannelSettings;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingDeque;

public class WsChannelClientSdk {
    private static WsChannelClientSdk mInstance = new WsChannelClientSdk();
    public static WeakReference<Context> sContextRef;
    public LinkedBlockingDeque<ServiceHolder> mServiceHolderQueue = new LinkedBlockingDeque<>();
    Messenger service;
    ServiceConnection serviceConnection;

    class MessengerServiceConnection implements ServiceConnection {
        MessengerServiceConnection() {
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (componentName != null) {
                Logger.debug();
                try {
                    WsChannelClientSdk.this.service = null;
                    WsChannelClientSdk.this.mServiceHolderQueue.clear();
                    WsChannelClientSdk.this.onServiceDisconnected(componentName);
                } catch (Throwable unused) {
                }
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (componentName != null && iBinder != null) {
                Logger.debug();
                try {
                    WsChannelClientSdk.this.service = new Messenger(iBinder);
                    WsChannelClientSdk.this.bindOrSendMsg(componentName);
                } catch (Throwable unused) {
                }
            }
        }
    }

    static class ServiceHolder {
        String key;
        Parcelable obj;
        int what;

        ServiceHolder() {
        }
    }

    public static WsChannelClientSdk inst() {
        return mInstance;
    }

    private WsChannelClientSdk() {
    }

    public synchronized void onServiceDisconnected(ComponentName componentName) {
    }

    public static void onEnterToBackground(Context context) {
        sendAppState(context, 2);
    }

    public static void onEnterToForeground(Context context) {
        sendAppState(context, 1);
    }

    public synchronized void bindOrSendMsg(ComponentName componentName) {
        if (this.service == null) {
            doBindService(componentName);
        } else {
            onServiceConnected(componentName);
        }
    }

    /* access modifiers changed from: protected */
    public void doUnbindService(ComponentName componentName) {
        if (componentName != null) {
            ServiceConnection serviceConnection2 = this.serviceConnection;
            if (serviceConnection2 != null) {
                WeakReference<Context> weakReference = sContextRef;
                if (weakReference != null && weakReference.get() != null) {
                    try {
                        ((Context) weakReference.get()).unbindService(serviceConnection2);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    private void doBindService(ComponentName componentName) {
        WeakReference<Context> weakReference = sContextRef;
        if (weakReference != null && weakReference.get() != null) {
            Context context = (Context) weakReference.get();
            Logger.debug();
            if (componentName != null) {
                try {
                    Intent intent = new Intent();
                    intent.setComponent(componentName);
                    MessengerServiceConnection messengerServiceConnection = new MessengerServiceConnection();
                    this.serviceConnection = messengerServiceConnection;
                    context.bindService(intent, messengerServiceConnection, 1);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|(2:19|7)(5:8|9|10|21|18)|3|2) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r5.service = null;
        r5.mServiceHolderQueue.offerFirst(r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0003 A[LOOP:0: B:2:0x0003->B:18:0x0003, LOOP_START, SYNTHETIC, Splitter:B:2:0x0003] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onServiceConnected(android.content.ComponentName r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.concurrent.LinkedBlockingDeque<com.bytedance.common.wschannel.client.WsChannelClientSdk$ServiceHolder> r0 = r5.mServiceHolderQueue     // Catch:{ Throwable -> 0x0038 }
            java.lang.Object r0 = r0.peek()     // Catch:{ Throwable -> 0x0038 }
            if (r0 == 0) goto L_0x0037
            java.util.concurrent.LinkedBlockingDeque<com.bytedance.common.wschannel.client.WsChannelClientSdk$ServiceHolder> r0 = r5.mServiceHolderQueue     // Catch:{ Throwable -> 0x0038 }
            java.lang.Object r0 = r0.poll()     // Catch:{ Throwable -> 0x0038 }
            com.bytedance.common.wschannel.client.WsChannelClientSdk$ServiceHolder r0 = (com.bytedance.common.wschannel.client.WsChannelClientSdk.ServiceHolder) r0     // Catch:{ Throwable -> 0x0038 }
            if (r0 != 0) goto L_0x0016
            return
        L_0x0016:
            android.os.Message r1 = new android.os.Message     // Catch:{ Throwable -> 0x0038 }
            r1.<init>()     // Catch:{ Throwable -> 0x0038 }
            int r2 = r0.what     // Catch:{ Throwable -> 0x0038 }
            r1.what = r2     // Catch:{ Throwable -> 0x0038 }
            android.os.Bundle r2 = r1.getData()     // Catch:{ Throwable -> 0x0038 }
            java.lang.String r3 = r0.key     // Catch:{ Throwable -> 0x0038 }
            android.os.Parcelable r4 = r0.obj     // Catch:{ Throwable -> 0x0038 }
            r2.putParcelable(r3, r4)     // Catch:{ Throwable -> 0x0038 }
            r5.sendMsg(r6, r1)     // Catch:{ DeadObjectException -> 0x002e, Throwable -> 0x0003 }
            goto L_0x0003
        L_0x002e:
            r6 = 0
            r5.service = r6     // Catch:{ Throwable -> 0x0038 }
            java.util.concurrent.LinkedBlockingDeque<com.bytedance.common.wschannel.client.WsChannelClientSdk$ServiceHolder> r6 = r5.mServiceHolderQueue     // Catch:{ Throwable -> 0x0038 }
            r6.offerFirst(r0)     // Catch:{ Throwable -> 0x0038 }
            goto L_0x0038
        L_0x0037:
            return
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.client.WsChannelClientSdk.onServiceConnected(android.content.ComponentName):void");
    }

    public static void tryStartPushProcess(Context context, boolean z) {
        tryStartPushProcess(context, z, false);
    }

    private void sendMsg(ComponentName componentName, Message message) throws RemoteException {
        if (componentName != null) {
            Logger.debug();
            Messenger messenger = this.service;
            if (messenger != null) {
                messenger.send(message);
            }
        }
    }

    private void startPushProcess(final Context context, final boolean z) {
        ThreadPlus.submitRunnable(new Runnable() {
            public void run() {
                int i;
                if (context != null) {
                    if (WsChannelClientSdk.sContextRef == null || WsChannelClientSdk.sContextRef.get() == null) {
                        WsChannelClientSdk.sContextRef = new WeakReference<>(context.getApplicationContext());
                    }
                    try {
                        ComponentName componentName = new ComponentName(context, WsChannelService.class);
                        ServiceHolder serviceHolder = new ServiceHolder();
                        if (z) {
                            i = 9;
                        } else {
                            i = 11;
                        }
                        serviceHolder.what = i;
                        WsChannelClientSdk.this.mServiceHolderQueue.offer(serviceHolder);
                        WsChannelClientSdk.this.bindOrSendMsg(componentName);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    public static void unRegisterApp(Context context, int i) {
        if (context != null) {
            Logger.debug();
            mInstance.unregister(context, i);
        }
    }

    public static void onParameterChange(Context context, SsWsApp ssWsApp) {
        if (context != null && ssWsApp != null) {
            if (sContextRef == null || sContextRef.get() == null) {
                sContextRef = new WeakReference<>(context.getApplicationContext());
            }
            Logger.debug();
            if (WsChannelSettings.inst(context).isEnable()) {
                mInstance.sendParameterChange(context, ssWsApp);
            }
        }
    }

    public static void registerApp(Context context, SsWsApp ssWsApp) {
        if (context != null) {
            if (sContextRef == null || sContextRef.get() == null) {
                sContextRef = new WeakReference<>(context.getApplicationContext());
            }
            if (WsChannelSettings.inst(context).isEnable() && ssWsApp != null) {
                mInstance.register(context, ssWsApp);
            }
        }
    }

    private void register(Context context, IWsApp iWsApp) {
        if (context != null && iWsApp != null) {
            if (sContextRef == null || sContextRef.get() == null) {
                sContextRef = new WeakReference<>(context.getApplicationContext());
            }
            Logger.debug();
            if (WsChannelSettings.inst(context).isEnable()) {
                try {
                    ComponentName componentName = new ComponentName(context, WsChannelService.class);
                    ServiceHolder serviceHolder = new ServiceHolder();
                    serviceHolder.key = "ws_app";
                    serviceHolder.obj = iWsApp;
                    serviceHolder.what = 0;
                    this.mServiceHolderQueue.offer(serviceHolder);
                    bindOrSendMsg(componentName);
                } catch (Throwable unused) {
                }
            }
        }
    }

    private static void sendAppState(Context context, int i) {
        if (context != null && i > 0 && i <= 3) {
            if (sContextRef == null || sContextRef.get() == null) {
                sContextRef = new WeakReference<>(context.getApplicationContext());
            }
            Logger.debug();
            if (WsChannelSettings.inst(context).isEnable()) {
                try {
                    ComponentName componentName = new ComponentName(context, WsChannelService.class);
                    Intent intent = new Intent("com.bytedance.article.wschannel.appstate");
                    intent.setComponent(componentName);
                    intent.putExtra("app_state", i);
                    context.startService(intent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    private void sendParameterChange(Context context, IWsApp iWsApp) {
        if (context != null && iWsApp != null) {
            if (sContextRef == null || sContextRef.get() == null) {
                sContextRef = new WeakReference<>(context.getApplicationContext());
            }
            Logger.debug();
            if (WsChannelSettings.inst(context).isEnable()) {
                try {
                    ComponentName componentName = new ComponentName(context, WsChannelService.class);
                    ServiceHolder serviceHolder = new ServiceHolder();
                    serviceHolder.key = "ws_app";
                    serviceHolder.obj = iWsApp;
                    serviceHolder.what = 4;
                    this.mServiceHolderQueue.offer(serviceHolder);
                    bindOrSendMsg(componentName);
                } catch (Throwable unused) {
                }
            }
        }
    }

    private void unregister(Context context, int i) {
        if (context != null) {
            if (sContextRef == null || sContextRef.get() == null) {
                sContextRef = new WeakReference<>(context.getApplicationContext());
            }
            Logger.debug();
            try {
                ComponentName componentName = new ComponentName(context, WsChannelService.class);
                ServiceHolder serviceHolder = new ServiceHolder();
                serviceHolder.key = "ws_app";
                serviceHolder.obj = new IntegerParcelable(i);
                serviceHolder.what = 1;
                this.mServiceHolderQueue.offer(serviceHolder);
                bindOrSendMsg(componentName);
            } catch (Throwable unused) {
            }
        }
    }

    public void sendPayload(Context context, WsChannelMsg wsChannelMsg) {
        if (context != null && wsChannelMsg != null) {
            if (sContextRef == null || sContextRef.get() == null) {
                sContextRef = new WeakReference<>(context.getApplicationContext());
            }
            Logger.debug();
            if (WsChannelSettings.inst(context).isEnable()) {
                try {
                    ComponentName componentName = new ComponentName(context, WsChannelService.class);
                    ServiceHolder serviceHolder = new ServiceHolder();
                    serviceHolder.key = "payload";
                    serviceHolder.obj = wsChannelMsg;
                    serviceHolder.what = 5;
                    this.mServiceHolderQueue.offer(serviceHolder);
                    bindOrSendMsg(componentName);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void tryStartPushProcess(final Context context, boolean z, boolean z2) {
        if (z) {
            mInstance.startPushProcess(context, z2);
        } else {
            ThreadPlus.submitRunnable(new Runnable() {
                public final void run() {
                    try {
                        context.startService(new Intent(context, WsChannelService.class));
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
