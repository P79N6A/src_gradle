package com.bytedance.common.wschannel.channel.impl.ok;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.UiThread;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsChannelSettings;
import com.bytedance.common.wschannel.channel.impl.ok.HeartBeatProcessor;
import com.bytedance.common.wschannel.channel.impl.ok.policy.DefaultHeartBeatPolicy;
import com.bytedance.common.wschannel.channel.impl.ok.policy.HeartBeatPolicy;
import com.bytedance.common.wschannel.channel.impl.ok.policy.RetryPolicy;
import com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket;
import com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatWebSocket;
import com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketListener;
import com.bytedance.common.wschannel.log.WsChannelLog;
import com.bytedance.common.wschannel.server.NetworkUtils;
import com.bytedance.common.wschannel.utils.Utils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Closeable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okio.ByteString;

public class WsOkClient implements WeakHandler.IHandler, HeartBeatProcessor.HeartBeatListener {
    public boolean isManualClose;
    private final Config mConfig;
    private Map<String, Object> mConfigMap;
    public final Context mContext;
    public CustomHeartBeatRealWebSocket mCurrentSocket;
    private int mCurrentStatus;
    public Handler mHandler;
    public HeartBeatProcessor mHeartBeatProcessor;
    private WebSocketListener mListener;
    private OkHttpClient mOkHttpClient;
    public boolean mPendingConnectAfterClosed;
    public WsPolicy mPolicy;
    private Request mRequest;
    public WsStatusListener mWsStatusListener;

    public static final class Builder {
        private HeartBeatPolicy heartBeatPolicy = new DefaultHeartBeatPolicy();
        private Context mContext;
        private OkHttpClient mOkHttpClient;
        private RetryPolicy mRetryPolicy;
        private List<String> wsUrls;

        public final WsOkClient build() {
            Config config = new Config(this.mContext, this.wsUrls, this.mOkHttpClient, this.mRetryPolicy, this.heartBeatPolicy);
            return new WsOkClient(config);
        }

        public final Builder client(OkHttpClient okHttpClient) {
            this.mOkHttpClient = okHttpClient;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final Builder retryPolicy(RetryPolicy retryPolicy) {
            this.mRetryPolicy = retryPolicy;
            return this;
        }

        public final Builder setUrls(List<String> list) {
            this.wsUrls = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final Builder heartBeatPolicy(HeartBeatPolicy heartBeatPolicy2) {
            if (heartBeatPolicy2 != null) {
                this.heartBeatPolicy = heartBeatPolicy2;
            }
            return this;
        }

        Builder(Context context) {
            this.mContext = context;
        }
    }

    static final class Config {
        HeartBeatPolicy heartBeatPolicy;
        public Context mContext;
        public OkHttpClient mOkHttpClient;
        public RetryPolicy mRetryPolicy;
        public List<String> wsUrls;

        public final String toString() {
            return "Config{heartBeatPolicy=" + this.heartBeatPolicy + ", mContext=" + this.mContext + ", wsUrls=" + this.wsUrls + ", mOkHttpClient=" + this.mOkHttpClient + ", mRetryPolicy=" + this.mRetryPolicy + '}';
        }

        Config(Context context, List<String> list, OkHttpClient okHttpClient, RetryPolicy retryPolicy, HeartBeatPolicy heartBeatPolicy2) {
            this.mContext = context;
            this.wsUrls = list;
            this.mOkHttpClient = okHttpClient;
            this.mRetryPolicy = retryPolicy;
            this.heartBeatPolicy = heartBeatPolicy2;
        }
    }

    class WsListener extends WebSocketListener {
        public boolean canRetry(int i) {
            return i <= 0 || i == 414 || i == 511 || i == 512 || i == 513;
        }

        private WsListener() {
        }

        public void onMessage(CustomHeartBeatWebSocket customHeartBeatWebSocket, final String str) {
            WsOkClient.this.runOnHandlerThread(new Runnable() {
                public void run() {
                    if (WsOkClient.this.mWsStatusListener != null) {
                        WsOkClient.this.mWsStatusListener.onMessage(str);
                    }
                }
            });
        }

        public void onOpen(final CustomHeartBeatWebSocket customHeartBeatWebSocket, final Response response) {
            WsOkClient.this.runOnHandlerThread(new Runnable() {
                public void run() {
                    if (WsOkClient.this.mCurrentSocket == customHeartBeatWebSocket) {
                        WsOkClient.this.setStatus(4);
                        WsOkClient.this.cancelReconnect();
                        Bundle bundle = new Bundle();
                        bundle.putString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "onOpenInternal");
                        WsChannelLog.onEventV3Bundle(WsOkClient.this.mContext, "WsChannelSdk_ok", bundle);
                        WsOkClient.this.mHeartBeatProcessor.onOpenSuccess(customHeartBeatWebSocket, response);
                        if (WsOkClient.this.mWsStatusListener != null) {
                            WsOkClient.this.mWsStatusListener.onOpen(response);
                        }
                    }
                }
            });
        }

        public void onPong(final CustomHeartBeatWebSocket customHeartBeatWebSocket, final ByteString byteString) {
            WsOkClient.this.runOnHandlerThread(new Runnable() {
                public void run() {
                    WsOkClient.this.mHeartBeatProcessor.onReceivePong(customHeartBeatWebSocket, byteString);
                }
            });
        }

        public void onMessage(CustomHeartBeatWebSocket customHeartBeatWebSocket, final ByteString byteString) {
            WsOkClient.this.runOnHandlerThread(new Runnable() {
                public void run() {
                    if (WsOkClient.this.mWsStatusListener != null) {
                        WsOkClient.this.mWsStatusListener.onMessage(byteString);
                    }
                }
            });
        }

        public void onClosing(CustomHeartBeatWebSocket customHeartBeatWebSocket, int i, String str) {
            super.onClosing(customHeartBeatWebSocket, i, str);
            WsOkClient.this.runOnHandlerThread(new Runnable() {
                public void run() {
                    WsOkClient.this.setStatus(6);
                }
            });
        }

        public void onClosed(CustomHeartBeatWebSocket customHeartBeatWebSocket, int i, String str) {
            final String safeGetUrl = WsOkClient.this.safeGetUrl(customHeartBeatWebSocket);
            Bundle bundle = new Bundle();
            bundle.putString(PushConstants.WEB_URL, safeGetUrl);
            bundle.putInt("error_code", i);
            bundle.putString("error_msg", str);
            bundle.putString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "onClosedInternal");
            WsChannelLog.onEventV3Bundle(WsOkClient.this.mContext, "WsChannelSdk_ok", bundle);
            WsOkClient wsOkClient = WsOkClient.this;
            final CustomHeartBeatWebSocket customHeartBeatWebSocket2 = customHeartBeatWebSocket;
            final int i2 = i;
            final String str2 = str;
            AnonymousClass5 r1 = new Runnable() {
                public void run() {
                    if (WsOkClient.this.mCurrentSocket == customHeartBeatWebSocket2) {
                        WsOkClient.this.setStatus(3);
                        WsOkClient.this.mCurrentSocket = null;
                        if (WsOkClient.this.mHeartBeatProcessor != null) {
                            WsOkClient.this.mHeartBeatProcessor.disConnect();
                        }
                        if (WsOkClient.this.mWsStatusListener != null) {
                            WsOkClient.this.mWsStatusListener.onClosed(safeGetUrl, i2, str2);
                        }
                        if (WsOkClient.this.mPendingConnectAfterClosed) {
                            WsOkClient.this.mPendingConnectAfterClosed = false;
                            WsOkClient.this.tryConnect(WsOkClient.this.mPolicy.getUrl());
                        } else if (!WsOkClient.this.isManualClose) {
                            Pair retryUrlAndInterval = WsOkClient.this.mPolicy.getRetryUrlAndInterval(null);
                            WsOkClient.this.tryReconnect(((Long) retryUrlAndInterval.second).longValue(), (String) retryUrlAndInterval.first, true);
                        }
                    }
                }
            };
            wsOkClient.runOnHandlerThread(r1);
        }

        public void onFailure(CustomHeartBeatWebSocket customHeartBeatWebSocket, Throwable th, Response response) {
            final String str;
            String message;
            final String safeGetUrl = WsOkClient.this.safeGetUrl(customHeartBeatWebSocket);
            final int errorCode = WsOkClient.this.getErrorCode(response);
            String errorReason = WsOkClient.this.getErrorReason(errorCode);
            if (StringUtils.isEmpty(errorReason)) {
                if (StringUtils.isEmpty(th.getMessage())) {
                    message = Log.getStackTraceString(th);
                } else {
                    message = th.getMessage();
                }
                str = message;
            } else {
                str = errorReason;
            }
            final Pair retryUrlAndInterval = WsOkClient.this.mPolicy.getRetryUrlAndInterval(response);
            WsOkClient.this.safeClose(response);
            Bundle bundle = new Bundle();
            bundle.putString(PushConstants.WEB_URL, safeGetUrl);
            bundle.putInt("error_code", errorCode);
            bundle.putString("error_msg", str);
            bundle.putString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "onFailureInternal");
            WsChannelLog.onEventV3Bundle(WsOkClient.this.mContext, "WsChannelSdk_ok", bundle);
            WsOkClient wsOkClient = WsOkClient.this;
            final CustomHeartBeatWebSocket customHeartBeatWebSocket2 = customHeartBeatWebSocket;
            AnonymousClass6 r1 = new Runnable() {
                public void run() {
                    if (WsOkClient.this.mWsStatusListener != null) {
                        WsOkClient.this.mWsStatusListener.onFailure(safeGetUrl, errorCode, str);
                    }
                    if (WsOkClient.this.mPendingConnectAfterClosed) {
                        WsOkClient.this.mPendingConnectAfterClosed = false;
                        WsOkClient.this.tryConnect(WsOkClient.this.mPolicy.getUrl());
                    } else if (WsOkClient.this.mCurrentSocket == customHeartBeatWebSocket2) {
                        if (WsListener.this.canRetry(errorCode)) {
                            if (WsOkClient.this.mHeartBeatProcessor != null) {
                                WsOkClient.this.mHeartBeatProcessor.disConnect();
                            }
                            WsOkClient.this.tryReconnect(((Long) retryUrlAndInterval.second).longValue(), (String) retryUrlAndInterval.first, false);
                            return;
                        }
                        WsOkClient.this.setStatus(2);
                        WsOkClient.this.resetPolicy();
                    }
                }
            };
            wsOkClient.runOnHandlerThread(r1);
        }
    }

    interface WsStatusListener {
        void onClosed(String str, int i, String str2);

        void onConnecting(String str);

        void onFailure(String str, int i, String str2);

        void onMessage(String str);

        void onMessage(ByteString byteString);

        void onOpen(Response response);
    }

    public String getErrorReason(int i) {
        return i == 0 ? "成功" : i == 404 ? "uri不存在" : i == 409 ? "fpid没有注册" : i == 410 ? "非法的设备id" : i == 411 ? "appid还没有注册" : i == 412 ? "websocket子协议不支持" : i == 413 ? "该设备已经建立连接" : i == 414 ? "服务器不能接受更多连接，可重试" : i == 415 ? "设备被限时禁止连接" : i == 416 ? "参数不正确" : i == 417 ? "鉴权失败" : i == 510 ? "服务器内部错误" : i == 511 ? "服务器忙，可稍后重试" : i == 512 ? "服务器正在关机" : i == 513 ? "auth服务异常" : i == 514 ? "auth服务返回失败" : "";
    }

    /* access modifiers changed from: package-private */
    public synchronized int getCurrentStatus() {
        return this.mCurrentStatus;
    }

    private void ensureWebSocketClosed() {
        if (this.mCurrentSocket != null) {
            this.mCurrentSocket.closeQuietly(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, "normal close");
        }
    }

    public void cancelReconnect() {
        resetPolicy();
        this.mHandler.removeMessages(1);
    }

    /* access modifiers changed from: package-private */
    public boolean isConnected() {
        if (getCurrentStatus() == 4) {
            return true;
        }
        return false;
    }

    public void resetPolicy() {
        if (this.mPolicy != null) {
            this.mPolicy.reset();
        }
    }

    /* access modifiers changed from: package-private */
    public void stopConnect() {
        runOnHandlerThread(new Runnable() {
            public void run() {
                WsOkClient.this.isManualClose = true;
                WsOkClient.this.stopConnectInternal();
            }
        });
    }

    public void stopConnectInternal() {
        this.mHandler.removeMessages(2);
        this.mHandler.removeMessages(1);
        this.mHandler.removeMessages(3);
        this.mHandler.removeMessages(5);
        cancelReconnect();
        disconnect();
    }

    private int networkType() {
        NetworkUtils.NetworkType networkType = NetworkUtils.getNetworkType(this.mContext);
        if (networkType == null || networkType == NetworkUtils.NetworkType.NONE) {
            return 0;
        }
        if (networkType == NetworkUtils.NetworkType.WIFI) {
            return 1;
        }
        if (networkType == NetworkUtils.NetworkType.MOBILE_2G) {
            return 2;
        }
        if (networkType == NetworkUtils.NetworkType.MOBILE_3G) {
            return 3;
        }
        return 4;
    }

    /* access modifiers changed from: package-private */
    public void destroy() {
        this.mHandler.removeMessages(2);
        this.mHandler.removeMessages(1);
        this.mHandler.removeMessages(3);
        this.mHandler.removeMessages(5);
        runOnHandlerThread(new Runnable() {
            public void run() {
                WsOkClient.this.stopConnect();
            }
        });
    }

    public void onHeartBeatTimeout() {
        if (!(this.mRequest == null || this.mWsStatusListener == null)) {
            this.mWsStatusListener.onFailure(this.mRequest.url().toString(), 3, "心跳超时");
        }
        Pair retryUrlAndInterval = this.mPolicy.getRetryUrlAndInterval(null);
        stopConnectInternal();
        ensureWebSocketClosed();
        tryReconnect(0, (String) retryUrlAndInterval.first, true);
    }

    private boolean disconnect() {
        int currentStatus = getCurrentStatus();
        if (currentStatus == 3 || currentStatus == 2 || currentStatus == 5) {
            return true;
        }
        if (this.mHeartBeatProcessor != null) {
            this.mHeartBeatProcessor.disConnect();
        }
        if (this.mCurrentSocket == null) {
            return true;
        }
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(6, this.mCurrentSocket), 1000);
        if (currentStatus == 4) {
            this.mCurrentSocket.close(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, "normal close");
            setStatus(6);
            return false;
        }
        this.mCurrentSocket.cancel();
        setStatus(3);
        if (currentStatus != 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void setWsStatusListener(WsStatusListener wsStatusListener) {
        this.mWsStatusListener = wsStatusListener;
    }

    private boolean sendMessage(ByteString byteString) {
        return send(byteString);
    }

    public void runOnHandlerThread(Runnable runnable) {
        this.mHandler.post(runnable);
    }

    public void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized void setStatus(int i) {
        this.mCurrentStatus = i;
    }

    public int getErrorCode(Response response) {
        if (response != null) {
            try {
                return Integer.parseInt(response.header("Handshake-Status"));
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void onAppStateChanged(boolean z) {
        this.mHandler.obtainMessage(5, Boolean.valueOf(z)).sendToTarget();
    }

    /* access modifiers changed from: package-private */
    public void onNetworkStateChanged(int i) {
        this.mHandler.obtainMessage(3, Integer.valueOf(i)).sendToTarget();
    }

    public boolean sendMessage(String str) {
        return send(str);
    }

    /* access modifiers changed from: package-private */
    public void setConfigMap(Map<String, Object> map) {
        if (map != null) {
            this.mConfigMap.putAll(map);
        }
    }

    @SuppressLint({"MissingPermission"})
    private boolean isNetworkConnected(Context context) {
        if (context != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            if (networkInfo != null) {
                return networkInfo.isAvailable();
            }
        }
        return false;
    }

    public String safeGetUrl(WebSocket webSocket) {
        if (webSocket != null) {
            Request request = webSocket.request();
            if (request != null) {
                HttpUrl url = request.url();
                if (url != null) {
                    return url.toString();
                }
            }
        }
        return "";
    }

    /* access modifiers changed from: package-private */
    public boolean sendMessage(byte[] bArr) {
        return sendMessage(ByteString.of(bArr));
    }

    private WsOkClient(Config config) {
        this.mCurrentStatus = 3;
        this.mConfigMap = new ConcurrentHashMap();
        this.mHandler = new WeakHandler(Looper.myLooper(), this);
        this.mListener = new WsListener();
        this.mHeartBeatProcessor = null;
        this.mConfig = config;
        this.mContext = config.mContext;
        this.mOkHttpClient = config.mOkHttpClient;
        this.mHeartBeatProcessor = new HeartBeatProcessor(this.mHandler, this);
        this.mHeartBeatProcessor.setPongTimeout(5000);
    }

    private boolean send(Object obj) {
        if (this.mCurrentSocket != null && isConnected()) {
            if (obj instanceof String) {
                return this.mCurrentSocket.send((String) obj);
            }
            if (obj instanceof ByteString) {
                return this.mCurrentSocket.send((ByteString) obj);
            }
        }
        return false;
    }

    @UiThread
    public void tryConnect(String str) {
        if (!isNetworkConnected(this.mContext)) {
            notifyFailedAndReset(str, 1, "网络错误", true);
            return;
        }
        int currentStatus = getCurrentStatus();
        if (!(currentStatus == 4 || currentStatus == 1)) {
            try {
                initAndConnect(str);
            } catch (Throwable th) {
                if (this.mWsStatusListener != null) {
                    this.mWsStatusListener.onFailure(str, 4, Log.getStackTraceString(th));
                }
            }
        }
    }

    private void initAndConnect(String str) {
        if (this.mOkHttpClient == null) {
            this.mOkHttpClient = new OkHttpClient.Builder().protocols(Collections.singletonList(Protocol.HTTP_1_1)).build();
        }
        String createUrl = createUrl(str, this.mConfigMap);
        if (!StringUtils.isEmpty(createUrl)) {
            ensureWebSocketClosed();
            if (this.mRequest == null || !createUrl.equals(this.mRequest.url().toString())) {
                this.mRequest = new Request.Builder().addHeader("Sec-Websocket-Protocol", "pbbp").url(createUrl).build();
            }
            setStatus(1);
            this.mCurrentSocket = CustomHeartBeatRealWebSocket.create(this.mRequest, WsChannelSettings.inst(this.mContext).getSocketReadLimitSize(), this.mListener);
            this.mCurrentSocket.connect(this.mOkHttpClient);
            if (this.mWsStatusListener != null) {
                this.mWsStatusListener.onConnecting(createUrl);
            }
        }
    }

    public void handleMsg(Message message) {
        if (message != null) {
            int i = message.what;
            if (i == 1) {
                if (!isConnected()) {
                    this.mHandler.removeMessages(1);
                    this.mHandler.removeMessages(2);
                    tryConnect((String) message.obj);
                }
            } else if (i == 2) {
                try {
                    this.mHandler.removeMessages(2);
                    this.mHandler.removeMessages(1);
                    this.mConfig.wsUrls = (List) message.obj;
                    this.isManualClose = false;
                    this.mPolicy = new WsPolicy(this.mConfig.wsUrls, this.mConfig.mRetryPolicy, this.mConfig.heartBeatPolicy);
                    cancelReconnect();
                    tryConnect(this.mPolicy.getUrl());
                } catch (Throwable unused) {
                }
            } else if (i == 3) {
                this.mHandler.removeMessages(2);
                this.mHandler.removeMessages(1);
                if (!isConnected()) {
                    cancelReconnect();
                    if (!isNetworkConnected(this.mContext)) {
                        return;
                    }
                    if (!disconnect()) {
                        this.mPendingConnectAfterClosed = true;
                    } else if (this.mPolicy == null) {
                        Bundle bundle = new Bundle();
                        bundle.putString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "network_change_error");
                        bundle.putString("config", this.mConfigMap.toString());
                        bundle.putString("mConfig", this.mConfig.toString());
                        WsChannelLog.onEventV3Bundle(this.mContext, "WsChannelSdk_ok", bundle);
                    } else {
                        tryConnect(this.mPolicy.getUrl());
                    }
                }
            } else if (i == 5) {
                this.mHeartBeatProcessor.onAppStateChanged(((Boolean) message.obj).booleanValue());
            } else {
                if (i == 7) {
                    try {
                        this.mHandler.removeMessages(2);
                        this.mHandler.removeMessages(1);
                        this.mConfig.wsUrls = (List) message.obj;
                        this.isManualClose = false;
                        this.mPolicy = new WsPolicy(this.mConfig.wsUrls, this.mConfig.mRetryPolicy, this.mConfig.heartBeatPolicy);
                        cancelReconnect();
                        if (disconnect()) {
                            tryConnect(this.mPolicy.getUrl());
                        } else {
                            this.mPendingConnectAfterClosed = true;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void connect(final Map<String, Object> map, final List<String> list) {
        if (!list.isEmpty()) {
            runOnHandlerThread(new Runnable() {
                public void run() {
                    int currentStatus = WsOkClient.this.getCurrentStatus();
                    if (currentStatus != 4 && currentStatus != 1 && currentStatus != 5) {
                        Bundle bundle = new Bundle();
                        bundle.putString("urls", list.toString());
                        bundle.putString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "openConnection");
                        WsChannelLog.onEventV3Bundle(WsOkClient.this.mContext, "WsChannelSdk_ok", bundle);
                        WsOkClient.this.setConfigMap(map);
                        WsOkClient.this.handleMsg(WsOkClient.this.mHandler.obtainMessage(2, list));
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void onParameterChange(final Map<String, Object> map, final List<String> list) {
        if (!list.isEmpty()) {
            runOnHandlerThread(new Runnable() {
                public void run() {
                    WsOkClient.this.setConfigMap(map);
                    WsOkClient.this.handleMsg(WsOkClient.this.mHandler.obtainMessage(7, list));
                }
            });
        }
    }

    private String createUrl(String str, Map<String, Object> map) {
        String str2;
        if (TextUtils.isEmpty(str) || map == null) {
            return "";
        }
        String valueOf = String.valueOf(map.get("fpid"));
        String valueOf2 = String.valueOf(map.get("app_key"));
        String valueOf3 = String.valueOf(map.get("device_id"));
        String lowerCase = Utils.md5(valueOf + valueOf2 + valueOf3 + "f8a69f1719916z").toLowerCase();
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry next : map.entrySet()) {
            if (next != null && !TextUtils.isEmpty((CharSequence) next.getKey())) {
                if (next.getValue() == null) {
                    str2 = "";
                } else {
                    str2 = next.getValue().toString();
                }
                String str3 = (String) next.getKey();
                if (!StringUtils.equal("app_key", str3) && !StringUtils.equal(str3, PushConstants.EXTRA)) {
                    if (StringUtils.equal("app_version", str3)) {
                        buildUpon.appendQueryParameter("version_code", str2);
                    } else {
                        buildUpon.appendQueryParameter(str3, str2);
                    }
                }
            }
        }
        String str4 = (String) map.get(PushConstants.EXTRA);
        if (!StringUtils.isEmpty(str4)) {
            for (String str5 : str4.split("&")) {
                if (!TextUtils.isEmpty(str5)) {
                    String[] split = str5.split("=");
                    if (split.length == 2) {
                        buildUpon.appendQueryParameter(split[0], split[1]);
                    }
                }
            }
        }
        buildUpon.appendQueryParameter("access_key", lowerCase);
        buildUpon.appendQueryParameter("ne", String.valueOf(networkType()));
        return buildUpon.build().toString();
    }

    @UiThread
    public void tryReconnect(long j, String str, boolean z) {
        this.mHandler.removeMessages(1);
        if (!isNetworkConnected(this.mContext)) {
            notifyFailedAndReset(str, 1, "网络错误", z);
        } else if (this.isManualClose) {
            Bundle bundle = new Bundle();
            bundle.putString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "tryReconnect");
            bundle.putBoolean("isManualClose", true);
            WsChannelLog.onEventV3Bundle(this.mContext, "WsChannelSdk_ok", bundle);
        } else {
            if (j == -1 || StringUtils.isEmpty(str)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "tryReconnect");
                bundle2.putLong("interval", j);
                notifyFailedAndReset(str, 2, "重试失败", z);
                j = this.mHeartBeatProcessor.getSuccessHeatBeatInterval();
                str = this.mPolicy.getUrl();
                bundle2.putLong("next_interval", j);
                bundle2.putString("nextUrl", str);
                bundle2.putString("event", "retry_finished");
                WsChannelLog.onEventV3Bundle(this.mContext, "WsChannelSdk_ok", bundle2);
            } else {
                setStatus(5);
            }
            Message message = new Message();
            message.what = 1;
            message.obj = str;
            this.mHandler.sendMessageDelayed(message, j);
        }
    }

    private void notifyFailedAndReset(String str, int i, String str2, boolean z) {
        setStatus(2);
        resetPolicy();
        if (this.mWsStatusListener != null && z) {
            this.mWsStatusListener.onFailure(str, i, str2);
        }
    }
}
