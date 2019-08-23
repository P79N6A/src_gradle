package com.bytedance.common.wschannel.client;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.app.OnMessageReceiveListener;
import com.bytedance.common.wschannel.event.ConnectEvent;
import com.bytedance.common.wschannel.event.ConnectionState;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.ss.android.message.j;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class AbsWsClientService extends Service implements WeakHandler.IHandler {
    public static int MAX_WAIT_TIME = 10000;
    private static AtomicBoolean mDispatcherAlive = new AtomicBoolean(true);
    private Handler mHandler = new WeakHandler(this);
    private Messenger mMessenger;

    /* access modifiers changed from: protected */
    public void onReceive(WsChannelMsg wsChannelMsg) {
    }

    /* access modifiers changed from: protected */
    public void onSendResult(String str, boolean z) {
    }

    public void onDestroy() {
        super.onDestroy();
        Logger.debug();
    }

    public void onCreate() {
        super.onCreate();
        this.mMessenger = new Messenger(this.mHandler);
    }

    public void handleMsg(Message message) {
        if (message != null) {
            try {
                if (message.what == 10123) {
                    final Intent intent = (Intent) message.getData().getParcelable("DATA_INTENT");
                    if (intent != null) {
                        j.a().a(new Runnable() {
                            public void run() {
                                AbsWsClientService.this.handleIntent(intent);
                            }
                        });
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    @Nullable
    public IBinder onBind(final Intent intent) {
        String str;
        StringBuilder sb = new StringBuilder("onBind intent = ");
        if (intent != null) {
            str = intent.toString();
        } else {
            str = "null";
        }
        sb.append(str);
        Logger.d("AbsWsClientService", sb.toString());
        j.a().a(new Runnable() {
            public void run() {
                AbsWsClientService.this.handleIntent(intent);
            }
        });
        return this.mMessenger.getBinder();
    }

    private void handleWsChannelMsg(Message message) {
        if (message != null) {
            try {
                message.getData().setClassLoader(WsChannelMsg.class.getClassLoader());
                if (message.what == 40) {
                    Parcelable parcelable = message.getData().getParcelable("payload");
                    if (parcelable instanceof WsChannelMsg) {
                        Logger.debug();
                        onReceive((WsChannelMsg) parcelable);
                    }
                    return;
                }
                if (message.what == 41) {
                    String string = message.getData().getString("payload_md5");
                    boolean z = message.getData().getBoolean("send_result");
                    Logger.debug();
                    onSendResult(string, z);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void handleIntent(Intent intent) {
        if (intent != null) {
            try {
                String action = intent.getAction();
                if ("com.bytedance.article.wschannel.receive.connection".equals(action)) {
                    intent.setExtrasClassLoader(SocketState.class.getClassLoader());
                    SocketState socketState = (SocketState) intent.getParcelableExtra("connection");
                    ConnectionState syncConnectState = syncConnectState(socketState.getChannelId(), socketState.getConnectionState());
                    OnMessageReceiveListener listener = WsConstants.getListener(socketState.getChannelId());
                    if (listener != null) {
                        listener.onReceiveConnectEvent(new ConnectEvent(syncConnectState, socketState.getChannelType(), socketState.getChannelId()), socketState.toJson());
                    }
                } else {
                    if ("com.bytedance.article.wschannel.syncconnectstate".equals(action)) {
                        intent.setExtrasClassLoader(SocketState.class.getClassLoader());
                        ArrayList<SocketState> parcelableArrayListExtra = intent.getParcelableArrayListExtra("connection");
                        if (parcelableArrayListExtra != null) {
                            for (SocketState socketState2 : parcelableArrayListExtra) {
                                if (socketState2 != null) {
                                    syncConnectState(socketState2.getChannelId(), socketState2.getConnectionState());
                                }
                            }
                        }
                    } else {
                        intent.setExtrasClassLoader(WsChannelMsg.class.getClassLoader());
                        if ("com.bytedance.article.wschannel.receive.payload".equals(action)) {
                            Message message = new Message();
                            message.what = 40;
                            message.getData().putParcelable("payload", (WsChannelMsg) intent.getParcelableExtra("payload"));
                            handleWsChannelMsg(message);
                        } else if ("com.bytedance.article.wschannel.send.payload".equals(action)) {
                            String stringExtra = intent.getStringExtra("payload_md5");
                            boolean booleanExtra = intent.getBooleanExtra("send_result", true);
                            Message message2 = new Message();
                            message2.what = 41;
                            message2.getData().putString("payload_md5", stringExtra);
                            message2.getData().putBoolean("send_result", booleanExtra);
                            handleWsChannelMsg(message2);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @NonNull
    private ConnectionState syncConnectState(int i, int i2) {
        ConnectionState connectionState = ConnectionState.CONNECTION_UNKNOWN;
        if (i2 == 0) {
            connectionState = ConnectionState.CONNECTION_UNKNOWN;
        } else if (i2 == 1) {
            connectionState = ConnectionState.CONNECTING;
        } else if (i2 == 2) {
            connectionState = ConnectionState.CONNECT_FAILED;
        } else if (i2 == 3) {
            connectionState = ConnectionState.CONNECT_CLOSED;
        } else if (i2 == 4) {
            connectionState = ConnectionState.CONNECTED;
        }
        Logger.debug();
        WsConstants.setConnectionState(i, connectionState);
        return connectionState;
    }

    public int onStartCommand(final Intent intent, int i, int i2) {
        String str;
        if (Logger.debug()) {
            StringBuilder sb = new StringBuilder("onStartCommand intent = ");
            if (intent != null) {
                str = intent.toString();
            } else {
                str = "null";
            }
            sb.append(str);
            Logger.d("AbsWsClientService", sb.toString());
        }
        j.a().a(new Runnable() {
            public void run() {
                AbsWsClientService.this.handleIntent(intent);
            }
        });
        return 2;
    }
}
