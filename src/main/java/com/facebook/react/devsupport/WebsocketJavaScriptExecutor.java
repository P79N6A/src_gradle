package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.react.devsupport.JSDebuggerWebSocketClient;
import java.util.HashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

public class WebsocketJavaScriptExecutor implements JavaJSExecutor {
    private final HashMap<String, String> mInjectedObjects = new HashMap<>();
    @Nullable
    public JSDebuggerWebSocketClient mWebSocketClient;

    static class JSExecutorCallbackFuture implements JSDebuggerWebSocketClient.JSDebuggerCallback {
        @Nullable
        private Throwable mCause;
        @Nullable
        private String mResponse;
        private final Semaphore mSemaphore;

        private JSExecutorCallbackFuture() {
            this.mSemaphore = new Semaphore(0);
        }

        @Nullable
        public String get() throws Throwable {
            this.mSemaphore.acquire();
            if (this.mCause == null) {
                return this.mResponse;
            }
            throw this.mCause;
        }

        public void onFailure(Throwable th) {
            this.mCause = th;
            this.mSemaphore.release();
        }

        public void onSuccess(@Nullable String str) {
            this.mResponse = str;
            this.mSemaphore.release();
        }
    }

    public interface JSExecutorConnectCallback {
        void onFailure(Throwable th);

        void onSuccess();
    }

    public static class WebsocketExecutorTimeoutException extends Exception {
        public WebsocketExecutorTimeoutException(String str) {
            super(str);
        }
    }

    public void close() {
        if (this.mWebSocketClient != null) {
            this.mWebSocketClient.closeQuietly();
        }
    }

    public void loadApplicationScript(String str) throws JavaJSExecutor.ProxyExecutorException {
        JSExecutorCallbackFuture jSExecutorCallbackFuture = new JSExecutorCallbackFuture();
        ((JSDebuggerWebSocketClient) a.b(this.mWebSocketClient)).loadApplicationScript(str, this.mInjectedObjects, jSExecutorCallbackFuture);
        try {
            jSExecutorCallbackFuture.get();
        } catch (Throwable th) {
            throw new JavaJSExecutor.ProxyExecutorException(th);
        }
    }

    public void setGlobalVariable(String str, String str2) {
        this.mInjectedObjects.put(str, str2);
    }

    public void connect(final String str, final JSExecutorConnectCallback jSExecutorConnectCallback) {
        final AtomicInteger atomicInteger = new AtomicInteger(3);
        connectInternal(str, new JSExecutorConnectCallback() {
            public void onSuccess() {
                jSExecutorConnectCallback.onSuccess();
            }

            public void onFailure(Throwable th) {
                if (atomicInteger.decrementAndGet() <= 0) {
                    jSExecutorConnectCallback.onFailure(th);
                } else {
                    WebsocketJavaScriptExecutor.this.connectInternal(str, this);
                }
            }
        });
    }

    @Nullable
    public String executeJSCall(String str, String str2) throws JavaJSExecutor.ProxyExecutorException {
        JSExecutorCallbackFuture jSExecutorCallbackFuture = new JSExecutorCallbackFuture();
        ((JSDebuggerWebSocketClient) a.b(this.mWebSocketClient)).executeJSCall(str, str2, jSExecutorCallbackFuture);
        try {
            return jSExecutorCallbackFuture.get();
        } catch (Throwable th) {
            throw new JavaJSExecutor.ProxyExecutorException(th);
        }
    }

    public void connectInternal(String str, final JSExecutorConnectCallback jSExecutorConnectCallback) {
        final JSDebuggerWebSocketClient jSDebuggerWebSocketClient = new JSDebuggerWebSocketClient();
        final Handler handler = new Handler(Looper.getMainLooper());
        jSDebuggerWebSocketClient.connect(str, new JSDebuggerWebSocketClient.JSDebuggerCallback() {
            public boolean didSendResult;

            public void onSuccess(@Nullable String str) {
                jSDebuggerWebSocketClient.prepareJSRuntime(new JSDebuggerWebSocketClient.JSDebuggerCallback() {
                    public void onFailure(Throwable th) {
                        handler.removeCallbacksAndMessages(null);
                        if (!AnonymousClass2.this.didSendResult) {
                            jSExecutorConnectCallback.onFailure(th);
                            AnonymousClass2.this.didSendResult = true;
                        }
                    }

                    public void onSuccess(@Nullable String str) {
                        handler.removeCallbacksAndMessages(null);
                        WebsocketJavaScriptExecutor.this.mWebSocketClient = jSDebuggerWebSocketClient;
                        if (!AnonymousClass2.this.didSendResult) {
                            jSExecutorConnectCallback.onSuccess();
                            AnonymousClass2.this.didSendResult = true;
                        }
                    }
                });
            }

            public void onFailure(Throwable th) {
                handler.removeCallbacksAndMessages(null);
                if (!this.didSendResult) {
                    jSExecutorConnectCallback.onFailure(th);
                    this.didSendResult = true;
                }
            }
        });
        handler.postDelayed(new Runnable() {
            public void run() {
                jSDebuggerWebSocketClient.closeQuietly();
                jSExecutorConnectCallback.onFailure(new WebsocketExecutorTimeoutException("Timeout while connecting to remote debugger"));
            }
        }, 5000);
    }
}
