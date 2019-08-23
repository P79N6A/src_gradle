package okhttp3;

import java.io.IOException;
import java.util.ArrayList;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.connection.ConnectInterceptor;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;

public final class RealCall implements Call {
    final OkHttpClient client;
    public EventListener eventListener;
    private boolean executed;
    final boolean forWebSocket;
    final Request originalRequest;
    final RetryAndFollowUpInterceptor retryAndFollowUpInterceptor;

    final class AsyncCall extends NamedRunnable {
        private final Callback responseCallback;

        /* access modifiers changed from: package-private */
        public final RealCall get() {
            return RealCall.this;
        }

        /* access modifiers changed from: package-private */
        public final Request request() {
            return RealCall.this.originalRequest;
        }

        /* access modifiers changed from: package-private */
        public final String host() {
            return RealCall.this.originalRequest.url().host();
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003f A[Catch:{ all -> 0x0036 }] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0042 A[Catch:{ all -> 0x0036 }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x004a A[Catch:{ all -> 0x0036 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0067 A[Catch:{ all -> 0x0036 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void execute() {
            /*
                r5 = this;
                r0 = 1
                r1 = 0
                okhttp3.RealCall r2 = okhttp3.RealCall.this     // Catch:{ Throwable -> 0x0038 }
                okhttp3.Response r2 = r2.getResponseWithInterceptorChain()     // Catch:{ Throwable -> 0x0038 }
                okhttp3.RealCall r3 = okhttp3.RealCall.this     // Catch:{ Throwable -> 0x0038 }
                okhttp3.internal.http.RetryAndFollowUpInterceptor r3 = r3.retryAndFollowUpInterceptor     // Catch:{ Throwable -> 0x0038 }
                boolean r3 = r3.isCanceled()     // Catch:{ Throwable -> 0x0038 }
                if (r3 == 0) goto L_0x0023
                okhttp3.Callback r1 = r5.responseCallback     // Catch:{ Throwable -> 0x0021 }
                okhttp3.RealCall r2 = okhttp3.RealCall.this     // Catch:{ Throwable -> 0x0021 }
                java.io.IOException r3 = new java.io.IOException     // Catch:{ Throwable -> 0x0021 }
                java.lang.String r4 = "Canceled"
                r3.<init>(r4)     // Catch:{ Throwable -> 0x0021 }
                r1.onFailure(r2, r3)     // Catch:{ Throwable -> 0x0021 }
                goto L_0x002a
            L_0x0021:
                r1 = move-exception
                goto L_0x003b
            L_0x0023:
                okhttp3.Callback r1 = r5.responseCallback     // Catch:{ Throwable -> 0x0021 }
                okhttp3.RealCall r3 = okhttp3.RealCall.this     // Catch:{ Throwable -> 0x0021 }
                r1.onResponse(r3, r2)     // Catch:{ Throwable -> 0x0021 }
            L_0x002a:
                okhttp3.RealCall r0 = okhttp3.RealCall.this
                okhttp3.OkHttpClient r0 = r0.client
                okhttp3.Dispatcher r0 = r0.dispatcher()
                r0.finished((okhttp3.RealCall.AsyncCall) r5)
                return
            L_0x0036:
                r0 = move-exception
                goto L_0x0078
            L_0x0038:
                r0 = move-exception
                r1 = r0
                r0 = 0
            L_0x003b:
                boolean r2 = r1 instanceof java.io.IOException     // Catch:{ all -> 0x0036 }
                if (r2 == 0) goto L_0x0042
                java.io.IOException r1 = (java.io.IOException) r1     // Catch:{ all -> 0x0036 }
                goto L_0x0048
            L_0x0042:
                java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0036 }
                r2.<init>(r1)     // Catch:{ all -> 0x0036 }
                r1 = r2
            L_0x0048:
                if (r0 == 0) goto L_0x0067
                okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.get()     // Catch:{ all -> 0x0036 }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
                java.lang.String r4 = "Callback failure for "
                r3.<init>(r4)     // Catch:{ all -> 0x0036 }
                okhttp3.RealCall r4 = okhttp3.RealCall.this     // Catch:{ all -> 0x0036 }
                java.lang.String r4 = r4.toLoggableString()     // Catch:{ all -> 0x0036 }
                r3.append(r4)     // Catch:{ all -> 0x0036 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0036 }
                r0.log(r2, r3, r1)     // Catch:{ all -> 0x0036 }
                goto L_0x002a
            L_0x0067:
                okhttp3.RealCall r0 = okhttp3.RealCall.this     // Catch:{ all -> 0x0036 }
                okhttp3.EventListener r0 = r0.eventListener     // Catch:{ all -> 0x0036 }
                okhttp3.RealCall r2 = okhttp3.RealCall.this     // Catch:{ all -> 0x0036 }
                r0.callFailed(r2, r1)     // Catch:{ all -> 0x0036 }
                okhttp3.Callback r0 = r5.responseCallback     // Catch:{ all -> 0x0036 }
                okhttp3.RealCall r2 = okhttp3.RealCall.this     // Catch:{ all -> 0x0036 }
                r0.onFailure(r2, r1)     // Catch:{ all -> 0x0036 }
                goto L_0x002a
            L_0x0078:
                okhttp3.RealCall r1 = okhttp3.RealCall.this
                okhttp3.OkHttpClient r1 = r1.client
                okhttp3.Dispatcher r1 = r1.dispatcher()
                r1.finished((okhttp3.RealCall.AsyncCall) r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RealCall.AsyncCall.execute():void");
        }

        AsyncCall(Callback callback) {
            super("OkHttp %s", RealCall.this.redactedUrl());
            this.responseCallback = callback;
        }
    }

    public final Request request() {
        return this.originalRequest;
    }

    public final void cancel() {
        this.retryAndFollowUpInterceptor.cancel();
    }

    public final boolean isCanceled() {
        return this.retryAndFollowUpInterceptor.isCanceled();
    }

    public final synchronized boolean isExecuted() {
        return this.executed;
    }

    public final StreamAllocation streamAllocation() {
        return this.retryAndFollowUpInterceptor.streamAllocation();
    }

    private void captureCallStackTrace() {
        this.retryAndFollowUpInterceptor.setCallStackTrace(Platform.get().getStackTraceForCloseable("response.body().close()"));
    }

    /* access modifiers changed from: package-private */
    public final String redactedUrl() {
        return this.originalRequest.url().redact();
    }

    public final RealCall clone() {
        return newRealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    /* access modifiers changed from: package-private */
    public final String toLoggableString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (isCanceled()) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.forWebSocket) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(redactedUrl());
        return sb.toString();
    }

    public final Response execute() throws IOException {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        captureCallStackTrace();
        this.eventListener.callStart(this);
        try {
            this.client.dispatcher().executed(this);
            Response responseWithInterceptorChain = getResponseWithInterceptorChain();
            if (responseWithInterceptorChain != null) {
                this.client.dispatcher().finished(this);
                return responseWithInterceptorChain;
            }
            throw new IOException("Canceled");
        } catch (IOException e2) {
            this.eventListener.callFailed(this, e2);
            throw e2;
        } catch (Throwable th) {
            this.client.dispatcher().finished(this);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final Response getResponseWithInterceptorChain() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.client.interceptors());
        arrayList.add(this.retryAndFollowUpInterceptor);
        arrayList.add(new BridgeInterceptor(this.client.cookieJar()));
        arrayList.add(new CacheInterceptor(this.client.internalCache()));
        arrayList.add(new ConnectInterceptor(this.client));
        if (!this.forWebSocket) {
            arrayList.addAll(this.client.networkInterceptors());
        }
        arrayList.add(new CallServerInterceptor(this.forWebSocket));
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(arrayList, null, null, null, 0, this.originalRequest, this, this.eventListener, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis());
        return realInterceptorChain.proceed(this.originalRequest);
    }

    public final void enqueue(Callback callback) {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        captureCallStackTrace();
        this.eventListener.callStart(this);
        this.client.dispatcher().enqueue(new AsyncCall(callback));
    }

    static RealCall newRealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        RealCall realCall = new RealCall(okHttpClient, request, z);
        realCall.eventListener = okHttpClient.eventListenerFactory().create(realCall);
        return realCall;
    }

    private RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
        this.retryAndFollowUpInterceptor = new RetryAndFollowUpInterceptor(okHttpClient, z);
    }
}
