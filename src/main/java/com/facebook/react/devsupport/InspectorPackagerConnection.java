package com.facebook.react.devsupport;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Inspector;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class InspectorPackagerConnection {
    private BundleStatusProvider mBundleStatusProvider;
    private final Connection mConnection;
    public final Map<String, Inspector.LocalConnection> mInspectorConnections = new HashMap();
    private final String mPackageName;

    public static class BundleStatus {
        public Boolean isLastDownloadSucess;
        public long updateTimestamp;

        public BundleStatus() {
            this(Boolean.FALSE, -1);
        }

        public BundleStatus(Boolean bool, long j) {
            this.updateTimestamp = -1;
            this.isLastDownloadSucess = bool;
            this.updateTimestamp = j;
        }
    }

    public interface BundleStatusProvider {
        BundleStatus getBundleStatus();
    }

    class Connection extends WebSocketListener {
        public boolean mClosed;
        private final Handler mHandler = new Handler(Looper.getMainLooper());
        private OkHttpClient mHttpClient;
        private boolean mSuppressConnectionErrors;
        private final String mUrl;
        @Nullable
        private WebSocket mWebSocket;

        private void closeWebSocketQuietly() {
            if (this.mWebSocket != null) {
                try {
                    this.mWebSocket.close(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, "End of session");
                } catch (Exception unused) {
                }
                this.mWebSocket = null;
            }
        }

        public void close() {
            this.mClosed = true;
            if (this.mWebSocket != null) {
                try {
                    this.mWebSocket.close(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, "End of session");
                } catch (Exception unused) {
                }
                this.mWebSocket = null;
            }
        }

        private void reconnect() {
            if (!this.mClosed) {
                if (!this.mSuppressConnectionErrors) {
                    FLog.w("InspectorPackagerConnection", "Couldn't connect to packager, will silently retry");
                    this.mSuppressConnectionErrors = true;
                }
                this.mHandler.postDelayed(new Runnable() {
                    public void run() {
                        if (!Connection.this.mClosed) {
                            Connection.this.connect();
                        }
                    }
                }, 2000);
                return;
            }
            throw new IllegalStateException("Can't reconnect closed client");
        }

        public void connect() {
            if (!this.mClosed) {
                if (this.mHttpClient == null) {
                    this.mHttpClient = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(0, TimeUnit.MINUTES).build();
                }
                this.mHttpClient.newWebSocket(new Request.Builder().url(this.mUrl).build(), this);
                return;
            }
            throw new IllegalStateException("Can't connect closed client");
        }

        public void send(final JSONObject jSONObject) {
            new AsyncTask<WebSocket, Void, Void>() {
                /* access modifiers changed from: protected */
                public Void doInBackground(WebSocket... webSocketArr) {
                    if (webSocketArr == null || webSocketArr.length == 0) {
                        return null;
                    }
                    try {
                        webSocketArr[0].send(jSONObject.toString());
                    } catch (Exception e2) {
                        FLog.w("InspectorPackagerConnection", "Couldn't send event to packager", (Throwable) e2);
                    }
                    return null;
                }
            }.execute(new WebSocket[]{this.mWebSocket});
        }

        public void onOpen(WebSocket webSocket, Response response) {
            this.mWebSocket = webSocket;
        }

        public Connection(String str) {
            this.mUrl = str;
        }

        private void abort(String str, Throwable th) {
            FLog.e("InspectorPackagerConnection", "Error occurred, shutting down websocket connection: " + str, th);
            InspectorPackagerConnection.this.closeAllConnections();
            closeWebSocketQuietly();
        }

        public void onMessage(WebSocket webSocket, String str) {
            try {
                InspectorPackagerConnection.this.handleProxyMessage(new JSONObject(str));
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }

        public void onClosed(WebSocket webSocket, int i, String str) {
            this.mWebSocket = null;
            InspectorPackagerConnection.this.closeAllConnections();
            if (!this.mClosed) {
                reconnect();
            }
        }

        public void onFailure(WebSocket webSocket, Throwable th, Response response) {
            if (this.mWebSocket != null) {
                abort("Websocket exception", th);
            }
            if (!this.mClosed) {
                reconnect();
            }
        }
    }

    public void closeQuietly() {
        this.mConnection.close();
    }

    public void connect() {
        this.mConnection.connect();
    }

    /* access modifiers changed from: package-private */
    public void closeAllConnections() {
        for (Map.Entry<String, Inspector.LocalConnection> value : this.mInspectorConnections.entrySet()) {
            ((Inspector.LocalConnection) value.getValue()).disconnect();
        }
        this.mInspectorConnections.clear();
    }

    private JSONArray getPages() throws JSONException {
        List<Inspector.Page> pages = Inspector.getPages();
        JSONArray jSONArray = new JSONArray();
        BundleStatus bundleStatus = this.mBundleStatusProvider.getBundleStatus();
        for (Inspector.Page next : pages) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", String.valueOf(next.getId()));
            jSONObject.put(PushConstants.TITLE, next.getTitle());
            jSONObject.put(PushConstants.EXTRA_APPLICATION_PENDING_INTENT, this.mPackageName);
            jSONObject.put("vm", next.getVM());
            jSONObject.put("isLastBundleDownloadSuccess", bundleStatus.isLastDownloadSucess);
            jSONObject.put("bundleUpdateTimestamp", bundleStatus.updateTimestamp);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public JSONObject makePageIdPayload(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageId", str);
        return jSONObject;
    }

    private void handleDisconnect(JSONObject jSONObject) throws JSONException {
        Inspector.LocalConnection remove = this.mInspectorConnections.remove(jSONObject.getString("pageId"));
        if (remove != null) {
            remove.disconnect();
        }
    }

    private void handleWrappedEvent(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("pageId");
        String string2 = jSONObject.getString("wrappedEvent");
        Inspector.LocalConnection localConnection = this.mInspectorConnections.get(string);
        if (localConnection != null) {
            localConnection.sendMessage(string2);
            return;
        }
        throw new IllegalStateException("Not connected: " + string);
    }

    public void sendEventToAllConnections(String str) {
        for (Map.Entry<String, Inspector.LocalConnection> value : this.mInspectorConnections.entrySet()) {
            ((Inspector.LocalConnection) value.getValue()).sendMessage(str);
        }
    }

    private void handleConnect(JSONObject jSONObject) throws JSONException {
        final String string = jSONObject.getString("pageId");
        if (this.mInspectorConnections.remove(string) == null) {
            try {
                this.mInspectorConnections.put(string, Inspector.connect(Integer.parseInt(string), new Inspector.RemoteConnection() {
                    public void onDisconnect() {
                        try {
                            InspectorPackagerConnection.this.mInspectorConnections.remove(string);
                            InspectorPackagerConnection.this.sendEvent("disconnect", InspectorPackagerConnection.this.makePageIdPayload(string));
                        } catch (JSONException e2) {
                            FLog.w("InspectorPackagerConnection", "Couldn't send event to packager", (Throwable) e2);
                        }
                    }

                    public void onMessage(String str) {
                        try {
                            InspectorPackagerConnection.this.sendWrappedEvent(string, str);
                        } catch (JSONException e2) {
                            FLog.w("InspectorPackagerConnection", "Couldn't send event to packager", (Throwable) e2);
                        }
                    }
                }));
            } catch (Exception e2) {
                FLog.w("InspectorPackagerConnection", "Failed to open page: " + string, (Throwable) e2);
                sendEvent("disconnect", makePageIdPayload(string));
            }
        } else {
            throw new IllegalStateException("Already connected: " + string);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleProxyMessage(org.json.JSONObject r4) throws org.json.JSONException, java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            java.lang.String r0 = r4.getString(r0)
            int r1 = r0.hashCode()
            r2 = 530405532(0x1f9d589c, float:6.663868E-20)
            if (r1 == r2) goto L_0x003d
            r2 = 951351530(0x38b478ea, float:8.605591E-5)
            if (r1 == r2) goto L_0x0033
            r2 = 1328613653(0x4f310915, float:2.97016243E9)
            if (r1 == r2) goto L_0x0029
            r2 = 1962251790(0x74f5960e, float:1.5565872E32)
            if (r1 == r2) goto L_0x001f
            goto L_0x0047
        L_0x001f:
            java.lang.String r1 = "getPages"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0047
            r1 = 0
            goto L_0x0048
        L_0x0029:
            java.lang.String r1 = "wrappedEvent"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0047
            r1 = 1
            goto L_0x0048
        L_0x0033:
            java.lang.String r1 = "connect"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0047
            r1 = 2
            goto L_0x0048
        L_0x003d:
            java.lang.String r1 = "disconnect"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0047
            r1 = 3
            goto L_0x0048
        L_0x0047:
            r1 = -1
        L_0x0048:
            switch(r1) {
                case 0: goto L_0x007d;
                case 1: goto L_0x0073;
                case 2: goto L_0x0069;
                case 3: goto L_0x005f;
                default: goto L_0x004b;
            }
        L_0x004b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown event: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L_0x005f:
            java.lang.String r0 = "payload"
            org.json.JSONObject r4 = r4.getJSONObject(r0)
            r3.handleDisconnect(r4)
            return
        L_0x0069:
            java.lang.String r0 = "payload"
            org.json.JSONObject r4 = r4.getJSONObject(r0)
            r3.handleConnect(r4)
            return
        L_0x0073:
            java.lang.String r0 = "payload"
            org.json.JSONObject r4 = r4.getJSONObject(r0)
            r3.handleWrappedEvent(r4)
            return
        L_0x007d:
            java.lang.String r4 = "getPages"
            org.json.JSONArray r0 = r3.getPages()
            r3.sendEvent(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.InspectorPackagerConnection.handleProxyMessage(org.json.JSONObject):void");
    }

    public void sendEvent(String str, Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", str);
        jSONObject.put("payload", obj);
        this.mConnection.send(jSONObject);
    }

    public void sendWrappedEvent(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageId", str);
        jSONObject.put("wrappedEvent", str2);
        sendEvent("wrappedEvent", jSONObject);
    }

    public InspectorPackagerConnection(String str, String str2, BundleStatusProvider bundleStatusProvider) {
        this.mConnection = new Connection(str);
        this.mPackageName = str2;
        this.mBundleStatusProvider = bundleStatusProvider;
    }
}
