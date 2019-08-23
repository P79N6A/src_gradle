package com.facebook.react.devsupport;

import android.util.JsonWriter;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

public class JSDebuggerWebSocketClient extends WebSocketListener {
    private final ConcurrentHashMap<Integer, JSDebuggerCallback> mCallbacks = new ConcurrentHashMap<>();
    @Nullable
    private JSDebuggerCallback mConnectCallback;
    @Nullable
    private OkHttpClient mHttpClient;
    private final AtomicInteger mRequestID = new AtomicInteger();
    @Nullable
    private WebSocket mWebSocket;

    public interface JSDebuggerCallback {
        void onFailure(Throwable th);

        void onSuccess(@Nullable String str);
    }

    public void closeQuietly() {
        if (this.mWebSocket != null) {
            try {
                this.mWebSocket.close(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, "End of session");
            } catch (Exception unused) {
            }
            this.mWebSocket = null;
        }
    }

    public void prepareJSRuntime(JSDebuggerCallback jSDebuggerCallback) {
        int andIncrement = this.mRequestID.getAndIncrement();
        this.mCallbacks.put(Integer.valueOf(andIncrement), jSDebuggerCallback);
        try {
            StringWriter stringWriter = new StringWriter();
            new JsonWriter(stringWriter).beginObject().name("id").value((long) andIncrement).name(PushConstants.MZ_PUSH_MESSAGE_METHOD).value("prepareJSRuntime").endObject().close();
            sendMessage(andIncrement, stringWriter.toString());
        } catch (IOException e2) {
            triggerRequestFailure(andIncrement, e2);
        }
    }

    private void sendMessage(int i, String str) {
        if (this.mWebSocket == null) {
            triggerRequestFailure(i, new IllegalStateException("WebSocket connection no longer valid"));
            return;
        }
        try {
            this.mWebSocket.send(str);
        } catch (Exception e2) {
            triggerRequestFailure(i, e2);
        }
    }

    private void triggerRequestFailure(int i, Throwable th) {
        JSDebuggerCallback jSDebuggerCallback = this.mCallbacks.get(Integer.valueOf(i));
        if (jSDebuggerCallback != null) {
            this.mCallbacks.remove(Integer.valueOf(i));
            jSDebuggerCallback.onFailure(th);
        }
    }

    private void triggerRequestSuccess(int i, @Nullable String str) {
        JSDebuggerCallback jSDebuggerCallback = this.mCallbacks.get(Integer.valueOf(i));
        if (jSDebuggerCallback != null) {
            this.mCallbacks.remove(Integer.valueOf(i));
            jSDebuggerCallback.onSuccess(str);
        }
    }

    public void onOpen(WebSocket webSocket, Response response) {
        this.mWebSocket = webSocket;
        ((JSDebuggerCallback) a.b(this.mConnectCallback)).onSuccess(null);
        this.mConnectCallback = null;
    }

    private void abort(String str, Throwable th) {
        FLog.e("JSDebuggerWebSocketClient", "Error occurred, shutting down websocket connection: " + str, th);
        closeQuietly();
        if (this.mConnectCallback != null) {
            this.mConnectCallback.onFailure(th);
            this.mConnectCallback = null;
        }
        for (JSDebuggerCallback onFailure : this.mCallbacks.values()) {
            onFailure.onFailure(th);
        }
        this.mCallbacks.clear();
    }

    public void connect(String str, JSDebuggerCallback jSDebuggerCallback) {
        if (this.mHttpClient == null) {
            this.mConnectCallback = jSDebuggerCallback;
            this.mHttpClient = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(0, TimeUnit.MINUTES).build();
            this.mHttpClient.newWebSocket(new Request.Builder().url(str).build(), this);
            return;
        }
        throw new IllegalStateException("JSDebuggerWebSocketClient is already initialized.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMessage(okhttp3.WebSocket r5, java.lang.String r6) {
        /*
            r4 = this;
            r5 = 0
            android.util.JsonReader r0 = new android.util.JsonReader     // Catch:{ IOException -> 0x0063 }
            java.io.StringReader r1 = new java.io.StringReader     // Catch:{ IOException -> 0x0063 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x0063 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0063 }
            r0.beginObject()     // Catch:{ IOException -> 0x0063 }
            r6 = r5
        L_0x000f:
            boolean r1 = r0.hasNext()     // Catch:{ IOException -> 0x0063 }
            if (r1 == 0) goto L_0x0059
            java.lang.String r1 = r0.nextName()     // Catch:{ IOException -> 0x0063 }
            android.util.JsonToken r2 = android.util.JsonToken.NULL     // Catch:{ IOException -> 0x0063 }
            android.util.JsonToken r3 = r0.peek()     // Catch:{ IOException -> 0x0063 }
            if (r2 != r3) goto L_0x0025
            r0.skipValue()     // Catch:{ IOException -> 0x0063 }
            goto L_0x000f
        L_0x0025:
            java.lang.String r2 = "replyID"
            boolean r2 = r2.equals(r1)     // Catch:{ IOException -> 0x0063 }
            if (r2 == 0) goto L_0x0037
            int r1 = r0.nextInt()     // Catch:{ IOException -> 0x0063 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x0063 }
            r5 = r1
            goto L_0x000f
        L_0x0037:
            java.lang.String r2 = "result"
            boolean r2 = r2.equals(r1)     // Catch:{ IOException -> 0x0063 }
            if (r2 == 0) goto L_0x0044
            java.lang.String r6 = r0.nextString()     // Catch:{ IOException -> 0x0063 }
            goto L_0x000f
        L_0x0044:
            java.lang.String r2 = "error"
            boolean r1 = r2.equals(r1)     // Catch:{ IOException -> 0x0063 }
            if (r1 == 0) goto L_0x000f
            java.lang.String r1 = r0.nextString()     // Catch:{ IOException -> 0x0063 }
            com.facebook.react.common.JavascriptException r2 = new com.facebook.react.common.JavascriptException     // Catch:{ IOException -> 0x0063 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0063 }
            r4.abort(r1, r2)     // Catch:{ IOException -> 0x0063 }
            goto L_0x000f
        L_0x0059:
            if (r5 == 0) goto L_0x0062
            int r0 = r5.intValue()     // Catch:{ IOException -> 0x0063 }
            r4.triggerRequestSuccess(r0, r6)     // Catch:{ IOException -> 0x0063 }
        L_0x0062:
            return
        L_0x0063:
            r6 = move-exception
            if (r5 == 0) goto L_0x006e
            int r5 = r5.intValue()
            r4.triggerRequestFailure(r5, r6)
            return
        L_0x006e:
            java.lang.String r5 = "Parsing response message from websocket failed"
            r4.abort(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.JSDebuggerWebSocketClient.onMessage(okhttp3.WebSocket, java.lang.String):void");
    }

    public void onClosed(WebSocket webSocket, int i, String str) {
        this.mWebSocket = null;
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        abort("Websocket exception", th);
    }

    public void executeJSCall(String str, String str2, JSDebuggerCallback jSDebuggerCallback) {
        int andIncrement = this.mRequestID.getAndIncrement();
        this.mCallbacks.put(Integer.valueOf(andIncrement), jSDebuggerCallback);
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject().name("id").value((long) andIncrement).name(PushConstants.MZ_PUSH_MESSAGE_METHOD).value(str);
            stringWriter.append(",\"arguments\":").append(str2);
            jsonWriter.endObject().close();
            sendMessage(andIncrement, stringWriter.toString());
        } catch (IOException e2) {
            triggerRequestFailure(andIncrement, e2);
        }
    }

    public void loadApplicationScript(String str, HashMap<String, String> hashMap, JSDebuggerCallback jSDebuggerCallback) {
        int andIncrement = this.mRequestID.getAndIncrement();
        this.mCallbacks.put(Integer.valueOf(andIncrement), jSDebuggerCallback);
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter beginObject = new JsonWriter(stringWriter).beginObject().name("id").value((long) andIncrement).name(PushConstants.MZ_PUSH_MESSAGE_METHOD).value("executeApplicationScript").name(PushConstants.WEB_URL).value(str).name("inject").beginObject();
            for (String next : hashMap.keySet()) {
                beginObject.name(next).value(hashMap.get(next));
            }
            beginObject.endObject().endObject().close();
            sendMessage(andIncrement, stringWriter.toString());
        } catch (IOException e2) {
            triggerRequestFailure(andIncrement, e2);
        }
    }
}
