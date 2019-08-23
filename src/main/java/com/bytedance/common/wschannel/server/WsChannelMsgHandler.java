package com.bytedance.common.wschannel.server;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.WorkerThread;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IMessageHandler;
import com.bytedance.common.wschannel.client.WsClientService;
import com.bytedance.common.wschannel.converter.MsgConverterFactory;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;
import org.json.JSONException;
import org.json.JSONObject;

public class WsChannelMsgHandler implements IMessageHandler {
    public static AtomicBoolean mDispatcherAlive = new AtomicBoolean(true);
    private final Map<Integer, SocketState> mChannelState;
    private final Context mContext;
    private ExecutorService mExecutorService = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor();
    private Runnable mMessageDispatcher = createMessageDispatcher();
    private Future<?> mMessageDispatcherFeature = null;
    public BlockingQueue<WsChannelService.Msg> mMessageQueue = new LinkedBlockingQueue();
    private final ClientMsgSender mMessageSender;
    private final Map<Integer, IWsApp> mWsApps;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor() {
            return h.a(m.a(p.FIXED).a(1).a());
        }
    }

    @WorkerThread
    private Runnable createMessageDispatcher() {
        return new Runnable() {
            public void run() {
                try {
                    Thread.currentThread().setName("MessageDispatcher");
                    while (true) {
                        Thread.currentThread();
                        if (Thread.interrupted()) {
                            break;
                        }
                        WsChannelMsgHandler.mDispatcherAlive.getAndSet(true);
                        try {
                            WsChannelMsgHandler.this.handleMessage(WsChannelMsgHandler.this.mMessageQueue.take());
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                }
                WsChannelMsgHandler.mDispatcherAlive.getAndSet(false);
            }
        };
    }

    private void startMessageDispatcher() {
        if (this.mMessageDispatcher == null) {
            this.mMessageDispatcher = createMessageDispatcher();
        }
        try {
            this.mMessageDispatcherFeature = this.mExecutorService.submit(this.mMessageDispatcher);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000d */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0011 A[Catch:{ Throwable -> 0x0019 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r3 = this;
            r0 = 0
            java.util.concurrent.Future<?> r1 = r3.mMessageDispatcherFeature     // Catch:{ Throwable -> 0x000d }
            if (r1 == 0) goto L_0x000d
            java.util.concurrent.Future<?> r1 = r3.mMessageDispatcherFeature     // Catch:{ Throwable -> 0x000d }
            r2 = 1
            r1.cancel(r2)     // Catch:{ Throwable -> 0x000d }
            r3.mMessageDispatcherFeature = r0     // Catch:{ Throwable -> 0x000d }
        L_0x000d:
            java.util.concurrent.ExecutorService r1 = r3.mExecutorService     // Catch:{ Throwable -> 0x0019 }
            if (r1 == 0) goto L_0x0018
            java.util.concurrent.ExecutorService r1 = r3.mExecutorService     // Catch:{ Throwable -> 0x0019 }
            r1.shutdown()     // Catch:{ Throwable -> 0x0019 }
            r3.mExecutorService = r0     // Catch:{ Throwable -> 0x0019 }
        L_0x0018:
            return
        L_0x0019:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.WsChannelMsgHandler.onDestroy():void");
    }

    public void syncSocketState() {
        try {
            Intent intent = new Intent();
            intent.setAction("com.bytedance.article.wschannel.syncconnectstate");
            intent.setComponent(new ComponentName(this.mContext, WsClientService.class));
            intent.putParcelableArrayListExtra("connection", new ArrayList(this.mChannelState.values()));
            startOrBindService(intent);
        } catch (Throwable unused) {
        }
    }

    @SuppressLint({"NewApi"})
    public void startOrBindService(Intent intent) {
        this.mMessageSender.sendMsg(intent);
    }

    /* access modifiers changed from: package-private */
    public void onConnection(SocketState socketState) {
        if (socketState != null) {
            this.mChannelState.put(Integer.valueOf(socketState.getChannelId()), socketState);
            try {
                Intent intent = new Intent();
                intent.setAction("com.bytedance.article.wschannel.receive.connection");
                intent.setComponent(new ComponentName(this.mContext, WsClientService.class));
                intent.putExtra("connection", socketState);
                startOrBindService(intent);
            } catch (Throwable unused) {
            }
        }
    }

    @WorkerThread
    public void handleMessage(WsChannelService.Msg msg) {
        if (msg != null && msg.data != null) {
            try {
                byte[] bArr = msg.data;
                Logger.debug();
                WsChannelMsg decode = MsgConverterFactory.getConverter().decode(bArr);
                if (decode != WsChannelMsg.EMPTY) {
                    decode.setChannelId(msg.channelId);
                    decode.setReplayToComponentName(new ComponentName(this.mContext, WsChannelService.class));
                    Logger.debug();
                    if (this.mWsApps != null) {
                        if (this.mWsApps.size() > 0) {
                            for (Map.Entry<Integer, IWsApp> value : this.mWsApps.entrySet()) {
                                IWsApp iWsApp = (IWsApp) value.getValue();
                                if (iWsApp != null && iWsApp.getChannelId() == decode.getChannelId()) {
                                    try {
                                        Intent intent = new Intent();
                                        intent.setAction("com.bytedance.article.wschannel.receive.payload");
                                        intent.setComponent(new ComponentName(this.mContext, WsClientService.class));
                                        intent.putExtra("payload", decode);
                                        startOrBindService(intent);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public void onConnection(int i, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("channel_id", i);
            } catch (JSONException unused) {
            }
            onConnection(SocketState.fromJson(jSONObject));
        }
    }

    public void onMessage(int i, byte[] bArr) {
        if (bArr != null) {
            try {
                WsChannelService.Msg msg = new WsChannelService.Msg();
                msg.channelId = i;
                msg.data = bArr;
                this.mMessageQueue.offer(msg);
                mDispatcherAlive.getAndSet(true);
                startMessageDispatcher();
            } catch (Throwable unused) {
            }
        }
    }

    WsChannelMsgHandler(Context context, Map<Integer, SocketState> map, Map<Integer, IWsApp> map2) {
        this.mContext = context;
        this.mChannelState = map;
        this.mWsApps = map2;
        this.mMessageSender = new ClientMsgSender(context);
        startMessageDispatcher();
    }
}
