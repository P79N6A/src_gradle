package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.bytedance.common.utility.Logger;
import com.ss.android.message.j;
import java.util.concurrent.LinkedBlockingDeque;

public class ClientMsgSender {
    private final ISender mSender;

    class DefaultSender implements ISender {
        private final Context mContext;

        public void sendMsg(Intent intent) {
            try {
                this.mContext.startService(intent);
            } catch (Throwable unused) {
            }
        }

        DefaultSender(Context context) {
            this.mContext = context;
        }
    }

    public interface ISender {
        void sendMsg(Intent intent);
    }

    class OSender implements ISender {
        public boolean mBinding = false;
        public final Context mContext;
        private Runnable mDisconnectRunnable = new Runnable() {
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r3 = this;
                    com.bytedance.common.wschannel.server.ClientMsgSender$OSender r0 = com.bytedance.common.wschannel.server.ClientMsgSender.OSender.this
                    java.lang.Object r0 = r0.mLock
                    monitor-enter(r0)
                    com.bytedance.common.wschannel.server.ClientMsgSender$OSender r1 = com.bytedance.common.wschannel.server.ClientMsgSender.OSender.this     // Catch:{ Throwable -> 0x0019 }
                    android.content.ServiceConnection r1 = r1.serviceConnection     // Catch:{ Throwable -> 0x0019 }
                    if (r1 == 0) goto L_0x0019
                    com.bytedance.common.wschannel.server.ClientMsgSender$OSender r1 = com.bytedance.common.wschannel.server.ClientMsgSender.OSender.this     // Catch:{ Throwable -> 0x0019 }
                    android.content.Context r1 = r1.mContext     // Catch:{ Throwable -> 0x0019 }
                    com.bytedance.common.wschannel.server.ClientMsgSender$OSender r2 = com.bytedance.common.wschannel.server.ClientMsgSender.OSender.this     // Catch:{ Throwable -> 0x0019 }
                    android.content.ServiceConnection r2 = r2.serviceConnection     // Catch:{ Throwable -> 0x0019 }
                    r1.unbindService(r2)     // Catch:{ Throwable -> 0x0019 }
                    goto L_0x0019
                L_0x0017:
                    r1 = move-exception
                    goto L_0x0024
                L_0x0019:
                    com.bytedance.common.wschannel.server.ClientMsgSender$OSender r1 = com.bytedance.common.wschannel.server.ClientMsgSender.OSender.this     // Catch:{ all -> 0x0017 }
                    r2 = 0
                    r1.serviceConnection = r2     // Catch:{ all -> 0x0017 }
                    com.bytedance.common.wschannel.server.ClientMsgSender$OSender r1 = com.bytedance.common.wschannel.server.ClientMsgSender.OSender.this     // Catch:{ all -> 0x0017 }
                    r1.service = r2     // Catch:{ all -> 0x0017 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0017 }
                    return
                L_0x0024:
                    monitor-exit(r0)     // Catch:{ all -> 0x0017 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.ClientMsgSender.OSender.AnonymousClass1.run():void");
            }
        };
        public final Object mLock = new Object();
        private LinkedBlockingDeque<Intent> mServiceHolderQueue = new LinkedBlockingDeque<>();
        public Messenger service;
        public ServiceConnection serviceConnection;

        class MessengerServiceConnection implements ServiceConnection {
            private MessengerServiceConnection() {
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(7:8|9|10|11|12|13|14) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onServiceDisconnected(android.content.ComponentName r3) {
                /*
                    r2 = this;
                    com.bytedance.common.wschannel.server.ClientMsgSender$OSender r0 = com.bytedance.common.wschannel.server.ClientMsgSender.OSender.this
                    java.lang.Object r0 = r0.mLock
                    monitor-enter(r0)
                    if (r3 != 0) goto L_0x000b
                    monitor-exit(r0)     // Catch:{ all -> 0x0009 }
                    return
                L_0x0009:
                    r3 = move-exception
                    goto L_0x0026
                L_0x000b:
                    com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x0009 }
                    com.bytedance.common.wschannel.server.ClientMsgSender$OSender r3 = com.bytedance.common.wschannel.server.ClientMsgSender.OSender.this     // Catch:{ Throwable -> 0x001a }
                    r1 = 0
                    r3.service = r1     // Catch:{ Throwable -> 0x001a }
                    com.bytedance.common.wschannel.server.ClientMsgSender$OSender r3 = com.bytedance.common.wschannel.server.ClientMsgSender.OSender.this     // Catch:{ Throwable -> 0x001a }
                    android.content.Context r3 = r3.mContext     // Catch:{ Throwable -> 0x001a }
                    r3.unbindService(r2)     // Catch:{ Throwable -> 0x001a }
                L_0x001a:
                    com.bytedance.common.wschannel.server.ClientMsgSender$OSender r3 = com.bytedance.common.wschannel.server.ClientMsgSender.OSender.this     // Catch:{ all -> 0x0009 }
                    r1 = 0
                    r3.mBinding = r1     // Catch:{ all -> 0x0009 }
                    com.bytedance.common.wschannel.server.ClientMsgSender$OSender r3 = com.bytedance.common.wschannel.server.ClientMsgSender.OSender.this     // Catch:{ all -> 0x0009 }
                    r3.removeTimeout()     // Catch:{ all -> 0x0009 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0009 }
                    return
                L_0x0026:
                    monitor-exit(r0)     // Catch:{ all -> 0x0009 }
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.ClientMsgSender.OSender.MessengerServiceConnection.onServiceDisconnected(android.content.ComponentName):void");
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(8:4|5|6|7|8|9|10|11) */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
                return;
             */
            /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onServiceConnected(android.content.ComponentName r2, android.os.IBinder r3) {
                /*
                    r1 = this;
                    com.bytedance.common.wschannel.server.ClientMsgSender$OSender r0 = com.bytedance.common.wschannel.server.ClientMsgSender.OSender.this
                    java.lang.Object r0 = r0.mLock
                    monitor-enter(r0)
                    if (r2 == 0) goto L_0x0022
                    if (r3 != 0) goto L_0x000a
                    goto L_0x0022
                L_0x000a:
                    com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x0024 }
                    android.os.Messenger r2 = new android.os.Messenger     // Catch:{ Throwable -> 0x001b }
                    r2.<init>(r3)     // Catch:{ Throwable -> 0x001b }
                    com.bytedance.common.wschannel.server.ClientMsgSender$OSender r3 = com.bytedance.common.wschannel.server.ClientMsgSender.OSender.this     // Catch:{ Throwable -> 0x001b }
                    r3.service = r2     // Catch:{ Throwable -> 0x001b }
                    com.bytedance.common.wschannel.server.ClientMsgSender$OSender r2 = com.bytedance.common.wschannel.server.ClientMsgSender.OSender.this     // Catch:{ Throwable -> 0x001b }
                    r2.onServiceConnected()     // Catch:{ Throwable -> 0x001b }
                L_0x001b:
                    com.bytedance.common.wschannel.server.ClientMsgSender$OSender r2 = com.bytedance.common.wschannel.server.ClientMsgSender.OSender.this     // Catch:{ all -> 0x0024 }
                    r3 = 0
                    r2.mBinding = r3     // Catch:{ all -> 0x0024 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0024 }
                    return
                L_0x0022:
                    monitor-exit(r0)     // Catch:{ all -> 0x0024 }
                    return
                L_0x0024:
                    r2 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0024 }
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.ClientMsgSender.OSender.MessengerServiceConnection.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
            }
        }

        public void removeTimeout() {
            try {
                j.a().f2494c.removeCallbacks(this.mDisconnectRunnable);
            } catch (Exception unused) {
            }
        }

        private synchronized void sendTimeout() {
            removeTimeout();
            j.a().f2494c.postDelayed(this.mDisconnectRunnable, 10000);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:3|(2:17|5)(4:6|7|19|16)|0|1) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r2.service = null;
            r2.mServiceHolderQueue.offerFirst(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:16:0x0000, LOOP_START, SYNTHETIC, Splitter:B:0:0x0000] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onServiceConnected() {
            /*
                r2 = this;
            L_0x0000:
                java.util.concurrent.LinkedBlockingDeque<android.content.Intent> r0 = r2.mServiceHolderQueue     // Catch:{ Throwable -> 0x0023 }
                java.lang.Object r0 = r0.peek()     // Catch:{ Throwable -> 0x0023 }
                if (r0 == 0) goto L_0x001f
                java.util.concurrent.LinkedBlockingDeque<android.content.Intent> r0 = r2.mServiceHolderQueue     // Catch:{ Throwable -> 0x0023 }
                java.lang.Object r0 = r0.poll()     // Catch:{ Throwable -> 0x0023 }
                android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Throwable -> 0x0023 }
                if (r0 != 0) goto L_0x0013
                return
            L_0x0013:
                r2.send(r0)     // Catch:{ DeadObjectException -> 0x0017, Throwable -> 0x0000 }
                goto L_0x0000
            L_0x0017:
                r1 = 0
                r2.service = r1     // Catch:{ Throwable -> 0x0023 }
                java.util.concurrent.LinkedBlockingDeque<android.content.Intent> r1 = r2.mServiceHolderQueue     // Catch:{ Throwable -> 0x0023 }
                r1.offerFirst(r0)     // Catch:{ Throwable -> 0x0023 }
            L_0x001f:
                r2.sendTimeout()     // Catch:{ Throwable -> 0x0023 }
                return
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.ClientMsgSender.OSender.onServiceConnected():void");
        }

        private void doBindService(Intent intent) {
            Logger.debug();
            if (intent != null) {
                try {
                    MessengerServiceConnection messengerServiceConnection = new MessengerServiceConnection();
                    this.serviceConnection = messengerServiceConnection;
                    this.mContext.bindService(intent, messengerServiceConnection, 1);
                    this.mBinding = true;
                } catch (Throwable unused) {
                    this.mServiceHolderQueue.offer(intent);
                    this.mBinding = false;
                }
            }
        }

        private void send(Intent intent) throws RemoteException {
            if (intent != null) {
                Logger.debug();
                Messenger messenger = this.service;
                Message message = new Message();
                message.what = 10123;
                message.getData().putParcelable("DATA_INTENT", intent);
                if (messenger != null) {
                    messenger.send(message);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void sendMsg(android.content.Intent r3) {
            /*
                r2 = this;
                java.lang.Object r0 = r2.mLock
                monitor-enter(r0)
                r2.removeTimeout()     // Catch:{ all -> 0x0023 }
                android.os.Messenger r1 = r2.service     // Catch:{ all -> 0x0023 }
                if (r1 != 0) goto L_0x0019
                boolean r1 = r2.mBinding     // Catch:{ all -> 0x0023 }
                if (r1 == 0) goto L_0x0015
                java.util.concurrent.LinkedBlockingDeque<android.content.Intent> r1 = r2.mServiceHolderQueue     // Catch:{ all -> 0x0023 }
                r1.offer(r3)     // Catch:{ all -> 0x0023 }
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                return
            L_0x0015:
                r2.doBindService(r3)     // Catch:{ all -> 0x0023 }
                goto L_0x0021
            L_0x0019:
                java.util.concurrent.LinkedBlockingDeque<android.content.Intent> r1 = r2.mServiceHolderQueue     // Catch:{ all -> 0x0023 }
                r1.offer(r3)     // Catch:{ all -> 0x0023 }
                r2.onServiceConnected()     // Catch:{ all -> 0x0023 }
            L_0x0021:
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                return
            L_0x0023:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.ClientMsgSender.OSender.sendMsg(android.content.Intent):void");
        }

        OSender(Context context) {
            this.mContext = context;
        }
    }

    public void sendMsg(Intent intent) {
        this.mSender.sendMsg(intent);
    }

    ClientMsgSender(Context context) {
        if (Build.VERSION.SDK_INT < 26 || context.getApplicationInfo().targetSdkVersion < 26) {
            this.mSender = new DefaultSender(context);
        } else {
            this.mSender = new OSender(context);
        }
    }
}
