package com.facebook.react.modules.websocket;

import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

@ReactModule(hasConstants = false, name = "WebSocketModule")
public final class WebSocketModule extends ReactContextBaseJavaModule {
    public final Map<Integer, ContentHandler> mContentHandlers = new ConcurrentHashMap();
    private ForwardingCookieHandler mCookieHandler;
    private ReactContext mReactContext;
    public final Map<Integer, WebSocket> mWebSocketConnections = new ConcurrentHashMap();

    public interface ContentHandler {
        void onMessage(String str, WritableMap writableMap);

        void onMessage(ByteString byteString, WritableMap writableMap);
    }

    public final String getName() {
        return "WebSocketModule";
    }

    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mReactContext = reactApplicationContext;
        this.mCookieHandler = new ForwardingCookieHandler(reactApplicationContext);
    }

    private String getCookie(String str) {
        try {
            List list = (List) this.mCookieHandler.get(new URI(getDefaultOrigin(str)), new HashMap()).get("Cookie");
            if (list != null) {
                if (!list.isEmpty()) {
                    return (String) list.get(0);
                }
            }
            return null;
        } catch (IOException | URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + str);
        }
    }

    @ReactMethod
    public final void ping(int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(ByteString.EMPTY);
        } catch (Exception e2) {
            notifyWebSocketFailed(i, e2.getMessage());
        }
    }

    private static String getDefaultOrigin(String str) {
        String str2 = "";
        try {
            URI uri = new URI(str);
            if (uri.getScheme().equals("wss")) {
                str2 = str2 + "https";
            } else if (uri.getScheme().equals("ws")) {
                str2 = str2 + "http";
            } else if (uri.getScheme().equals("http") || uri.getScheme().equals("https")) {
                str2 = str2 + uri.getScheme();
            }
            if (uri.getPort() != -1) {
                return String.format("%s://%s:%s", new Object[]{str2, uri.getHost(), Integer.valueOf(uri.getPort())});
            }
            return String.format("%s://%s/", new Object[]{str2, uri.getHost()});
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to set " + str + " as default origin header");
        }
    }

    public final void sendEvent(String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    public final void notifyWebSocketFailed(int i, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putString("message", str);
        sendEvent("websocketFailed", createMap);
    }

    public final void setContentHandler(int i, ContentHandler contentHandler) {
        if (contentHandler != null) {
            this.mContentHandlers.put(Integer.valueOf(i), contentHandler);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i));
        }
    }

    @ReactMethod
    public final void send(String str, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(str);
        } catch (Exception e2) {
            notifyWebSocketFailed(i, e2.getMessage());
        }
    }

    @ReactMethod
    public final void sendBinary(String str, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(ByteString.decodeBase64(str));
        } catch (Exception e2) {
            notifyWebSocketFailed(i, e2.getMessage());
        }
    }

    public final void sendBinary(ByteString byteString, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(byteString);
        } catch (Exception e2) {
            notifyWebSocketFailed(i, e2.getMessage());
        }
    }

    @ReactMethod
    public final void close(int i, String str, int i2) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i2));
        if (webSocket != null) {
            try {
                webSocket.close(i, str);
                this.mWebSocketConnections.remove(Integer.valueOf(i2));
                this.mContentHandlers.remove(Integer.valueOf(i2));
            } catch (Exception e2) {
                FLog.e("ReactNative", "Could not close WebSocket connection for id " + i2, (Throwable) e2);
            }
        }
    }

    @ReactMethod
    public final void connect(String str, @Nullable ReadableArray readableArray, @Nullable ReadableMap readableMap, final int i) {
        try {
            OkHttpClient build = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(0, TimeUnit.MINUTES).build();
            Request.Builder url = new Request.Builder().tag(Integer.valueOf(i)).url(str);
            String cookie = getCookie(str);
            if (cookie != null) {
                url.addHeader("Cookie", cookie);
            }
            if (readableMap == null || !readableMap.hasKey("headers") || !readableMap.getType("headers").equals(ReadableType.Map)) {
                url.addHeader("origin", getDefaultOrigin(str));
            } else {
                ReadableMap map = readableMap.getMap("headers");
                ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                if (!map.hasKey("origin")) {
                    url.addHeader("origin", getDefaultOrigin(str));
                }
                while (keySetIterator.hasNextKey()) {
                    String nextKey = keySetIterator.nextKey();
                    if (ReadableType.String.equals(map.getType(nextKey))) {
                        url.addHeader(nextKey, map.getString(nextKey));
                    } else {
                        FLog.w("ReactNative", "Ignoring: requested " + nextKey + ", value not a string");
                    }
                }
            }
            if (readableArray != null && readableArray.size() > 0) {
                StringBuilder sb = new StringBuilder("");
                for (int i2 = 0; i2 < readableArray.size(); i2++) {
                    String trim = readableArray.getString(i2).trim();
                    if (!trim.isEmpty() && !trim.contains(",")) {
                        sb.append(trim);
                        sb.append(",");
                    }
                }
                if (sb.length() > 0) {
                    sb.replace(sb.length() - 1, sb.length(), "");
                    url.addHeader("Sec-WebSocket-Protocol", sb.toString());
                }
            }
            build.newWebSocket(url.build(), new WebSocketListener() {
                public void onOpen(WebSocket webSocket, Response response) {
                    WebSocketModule.this.mWebSocketConnections.put(Integer.valueOf(i), webSocket);
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt("id", i);
                    WebSocketModule.this.sendEvent("websocketOpen", createMap);
                }

                public void onMessage(WebSocket webSocket, String str) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt("id", i);
                    createMap.putString("type", "text");
                    ContentHandler contentHandler = WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i));
                    if (contentHandler != null) {
                        contentHandler.onMessage(str, createMap);
                    } else {
                        createMap.putString("data", str);
                    }
                    WebSocketModule.this.sendEvent("websocketMessage", createMap);
                }

                public void onMessage(WebSocket webSocket, ByteString byteString) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt("id", i);
                    createMap.putString("type", "binary");
                    ContentHandler contentHandler = WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i));
                    if (contentHandler != null) {
                        contentHandler.onMessage(byteString, createMap);
                    } else {
                        createMap.putString("data", byteString.base64());
                    }
                    WebSocketModule.this.sendEvent("websocketMessage", createMap);
                }

                public void onFailure(WebSocket webSocket, Throwable th, Response response) {
                    WebSocketModule.this.notifyWebSocketFailed(i, th.getMessage());
                }

                public void onClosed(WebSocket webSocket, int i, String str) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt("id", i);
                    createMap.putInt("code", i);
                    createMap.putString("reason", str);
                    WebSocketModule.this.sendEvent("websocketClosed", createMap);
                }
            });
            build.dispatcher().executorService().shutdown();
        } catch (Exception unused) {
        }
    }
}
