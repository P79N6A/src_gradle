package com.bytedance.common.wschannel.channel.impl.ok.ws;

import com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketReader;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.ws.RealWebSocket;
import okio.ByteString;

public class CustomHeartBeatRealWebSocket implements CustomHeartBeatWebSocket, WebSocketReader.FrameCallback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final List<Protocol> ONLY_HTTP1 = Collections.singletonList(Protocol.HTTP_1_1);
    private boolean awaitingPong;
    private Call call;
    private ScheduledFuture<?> cancelFuture;
    private boolean enqueuedClose;
    private ScheduledExecutorService executor;
    private boolean failed;
    private final long ioLimitLength;
    private final String key;
    public WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue = new ArrayDeque<>();
    private final Request originalRequest;
    private final ArrayDeque<ByteString> pongQueue = new ArrayDeque<>();
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode = -1;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private RealWebSocket.Streams streams;
    private WebSocketWriter writer;
    private final Runnable writerRunnable;

    final class CancelRunnable implements Runnable {
        public final void run() {
            CustomHeartBeatRealWebSocket.this.cancel();
        }

        CancelRunnable() {
        }
    }

    static final class Close {
        final long cancelAfterCloseMillis;
        final int code;
        final ByteString reason;

        Close(int i, ByteString byteString, long j) {
            this.code = i;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j;
        }
    }

    static final class Message {
        final ByteString data;
        final int formatOpcode;

        Message(int i, ByteString byteString) {
            this.formatOpcode = i;
            this.data = byteString;
        }
    }

    final class PingRunnable implements Runnable {
        public final void run() {
            CustomHeartBeatRealWebSocket.this.writePingFrame(ByteString.EMPTY);
        }

        PingRunnable() {
        }
    }

    public Request request() {
        return this.originalRequest;
    }

    public void cancel() {
        this.call.cancel();
    }

    public synchronized long queueSize() {
        return this.queueSize;
    }

    /* access modifiers changed from: package-private */
    public synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    /* access modifiers changed from: package-private */
    public synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    /* access modifiers changed from: package-private */
    public synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    private void runWriter() {
        if (this.executor != null) {
            this.executor.execute(this.writerRunnable);
        }
    }

    public void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            this.reader.processNextFrame();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean processNextFrame() throws IOException {
        boolean z = false;
        try {
            this.reader.processNextFrame();
            if (this.receivedCloseCode == -1) {
                z = true;
            }
            return z;
        } catch (Exception e2) {
            failWebSocket(e2, null);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void tearDown() throws InterruptedException {
        if (this.cancelFuture != null) {
            this.cancelFuture.cancel(false);
        }
        this.executor.shutdown();
        this.executor.awaitTermination(10, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r2 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0.writePong(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        if ((r4 instanceof com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.Message) == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r1 = ((com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.Message) r4).data;
        r0 = okio.Okio.buffer(r0.newMessageSink(((com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.Message) r4).formatOpcode, (long) r1.size()));
        r0.write(r1);
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r11.queueSize -= (long) r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0089, code lost:
        if ((r4 instanceof com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.Close) == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008b, code lost:
        r4 = (com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.Close) r4;
        r0.writeClose(r4.code, r4.reason);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r3 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0098, code lost:
        if (r11.listener == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        r11.listener.onClosed(r11, r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009f, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a3, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a9, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00aa, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ad, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean writeOneFrame() throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.failed     // Catch:{ all -> 0x00ae }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r11)     // Catch:{ all -> 0x00ae }
            return r1
        L_0x0008:
            com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketWriter r0 = r11.writer     // Catch:{ all -> 0x00ae }
            java.util.ArrayDeque<okio.ByteString> r2 = r11.pongQueue     // Catch:{ all -> 0x00ae }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00ae }
            okio.ByteString r2 = (okio.ByteString) r2     // Catch:{ all -> 0x00ae }
            r3 = 0
            if (r2 != 0) goto L_0x004c
            java.util.ArrayDeque<java.lang.Object> r4 = r11.messageAndCloseQueue     // Catch:{ all -> 0x00ae }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x00ae }
            boolean r5 = r4 instanceof com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.Close     // Catch:{ all -> 0x00ae }
            if (r5 == 0) goto L_0x0046
            int r1 = r11.receivedCloseCode     // Catch:{ all -> 0x00ae }
            java.lang.String r5 = r11.receivedCloseReason     // Catch:{ all -> 0x00ae }
            r6 = -1
            if (r1 == r6) goto L_0x0031
            okhttp3.internal.ws.RealWebSocket$Streams r6 = r11.streams     // Catch:{ all -> 0x00ae }
            r11.streams = r3     // Catch:{ all -> 0x00ae }
            java.util.concurrent.ScheduledExecutorService r3 = r11.executor     // Catch:{ all -> 0x00ae }
            r3.shutdown()     // Catch:{ all -> 0x00ae }
            r3 = r6
            goto L_0x004e
        L_0x0031:
            java.util.concurrent.ScheduledExecutorService r6 = r11.executor     // Catch:{ all -> 0x00ae }
            com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket$CancelRunnable r7 = new com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket$CancelRunnable     // Catch:{ all -> 0x00ae }
            r7.<init>()     // Catch:{ all -> 0x00ae }
            r8 = r4
            com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket$Close r8 = (com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.Close) r8     // Catch:{ all -> 0x00ae }
            long r8 = r8.cancelAfterCloseMillis     // Catch:{ all -> 0x00ae }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00ae }
            java.util.concurrent.ScheduledFuture r6 = r6.schedule(r7, r8, r10)     // Catch:{ all -> 0x00ae }
            r11.cancelFuture = r6     // Catch:{ all -> 0x00ae }
            goto L_0x004e
        L_0x0046:
            if (r4 != 0) goto L_0x004a
            monitor-exit(r11)     // Catch:{ all -> 0x00ae }
            return r1
        L_0x004a:
            r5 = r3
            goto L_0x004e
        L_0x004c:
            r4 = r3
            r5 = r4
        L_0x004e:
            monitor-exit(r11)     // Catch:{ all -> 0x00ae }
            if (r2 == 0) goto L_0x0057
            r0.writePong(r2)     // Catch:{ all -> 0x0055 }
            goto L_0x009f
        L_0x0055:
            r0 = move-exception
            goto L_0x00aa
        L_0x0057:
            boolean r2 = r4 instanceof com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.Message     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0087
            r1 = r4
            com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket$Message r1 = (com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.Message) r1     // Catch:{ all -> 0x0055 }
            okio.ByteString r1 = r1.data     // Catch:{ all -> 0x0055 }
            com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket$Message r4 = (com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.Message) r4     // Catch:{ all -> 0x0055 }
            int r2 = r4.formatOpcode     // Catch:{ all -> 0x0055 }
            int r4 = r1.size()     // Catch:{ all -> 0x0055 }
            long r4 = (long) r4     // Catch:{ all -> 0x0055 }
            okio.Sink r0 = r0.newMessageSink(r2, r4)     // Catch:{ all -> 0x0055 }
            okio.BufferedSink r0 = okio.Okio.buffer((okio.Sink) r0)     // Catch:{ all -> 0x0055 }
            r0.write((okio.ByteString) r1)     // Catch:{ all -> 0x0055 }
            r0.close()     // Catch:{ all -> 0x0055 }
            monitor-enter(r11)     // Catch:{ all -> 0x0055 }
            long r4 = r11.queueSize     // Catch:{ all -> 0x0084 }
            int r0 = r1.size()     // Catch:{ all -> 0x0084 }
            long r0 = (long) r0     // Catch:{ all -> 0x0084 }
            long r4 = r4 - r0
            r11.queueSize = r4     // Catch:{ all -> 0x0084 }
            monitor-exit(r11)     // Catch:{ all -> 0x0084 }
            goto L_0x009f
        L_0x0084:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0084 }
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0087:
            boolean r2 = r4 instanceof com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.Close     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x00a4
            com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket$Close r4 = (com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.Close) r4     // Catch:{ all -> 0x0055 }
            int r2 = r4.code     // Catch:{ all -> 0x0055 }
            okio.ByteString r4 = r4.reason     // Catch:{ all -> 0x0055 }
            r0.writeClose(r2, r4)     // Catch:{ all -> 0x0055 }
            if (r3 == 0) goto L_0x009f
            com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketListener r0 = r11.listener     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x009f
            com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketListener r0 = r11.listener     // Catch:{ all -> 0x0055 }
            r0.onClosed(r11, r1, r5)     // Catch:{ all -> 0x0055 }
        L_0x009f:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3)
            r0 = 1
            return r0
        L_0x00a4:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0055 }
            r0.<init>()     // Catch:{ all -> 0x0055 }
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x00aa:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3)
            throw r0
        L_0x00ae:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00ae }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.writeOneFrame():boolean");
    }

    public void sendPing(ByteString byteString) {
        if (byteString == null) {
            byteString = ByteString.EMPTY;
        }
        writePingFrame(byteString);
    }

    public void onReadMessage(String str) throws IOException {
        if (this.listener != null) {
            this.listener.onMessage((CustomHeartBeatWebSocket) this, str);
        }
    }

    public boolean send(ByteString byteString) {
        if (byteString != null) {
            return send(byteString, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    public void onReadMessage(ByteString byteString) throws IOException {
        if (this.listener != null) {
            this.listener.onMessage((CustomHeartBeatWebSocket) this, byteString);
        }
    }

    public synchronized void onReadPong(ByteString byteString) {
        this.receivedPongCount++;
        this.awaitingPong = false;
        if (this.listener != null) {
            this.listener.onPong(this, byteString);
        }
    }

    public boolean send(String str) {
        if (str != null) {
            return send(ByteString.encodeUtf8(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    public void connect(OkHttpClient okHttpClient) {
        final Request build = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").build();
        this.call = Internal.instance.newWebSocketCall(okHttpClient, build);
        this.call.enqueue(new Callback() {
            public void onFailure(Call call, IOException iOException) {
                CustomHeartBeatRealWebSocket.this.failWebSocket(iOException, null);
            }

            public void onResponse(Call call, Response response) {
                try {
                    CustomHeartBeatRealWebSocket.this.checkResponse(response);
                    StreamAllocation streamAllocation = Internal.instance.streamAllocation(call);
                    streamAllocation.noNewStreams();
                    RealWebSocket.Streams newWebSocketStreams = streamAllocation.connection().newWebSocketStreams(streamAllocation);
                    try {
                        if (CustomHeartBeatRealWebSocket.this.listener != null) {
                            CustomHeartBeatRealWebSocket.this.listener.onOpen(CustomHeartBeatRealWebSocket.this, response);
                        }
                        CustomHeartBeatRealWebSocket.this.initReaderAndWriter("OkHttp WebSocket " + build.url().redact(), newWebSocketStreams);
                        streamAllocation.connection().socket().setSoTimeout(0);
                        CustomHeartBeatRealWebSocket.this.loopReader();
                    } catch (Exception e2) {
                        CustomHeartBeatRealWebSocket.this.failWebSocket(e2, null);
                    }
                } catch (ProtocolException e3) {
                    CustomHeartBeatRealWebSocket.this.failWebSocket(e3, response);
                    Util.closeQuietly((Closeable) response);
                }
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onReadPing(okio.ByteString r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.failed     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0022
            boolean r0 = r1.enqueuedClose     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            goto L_0x0022
        L_0x0012:
            java.util.ArrayDeque<okio.ByteString> r0 = r1.pongQueue     // Catch:{ all -> 0x0024 }
            r0.add(r2)     // Catch:{ all -> 0x0024 }
            r1.runWriter()     // Catch:{ all -> 0x0024 }
            int r2 = r1.receivedPingCount     // Catch:{ all -> 0x0024 }
            int r2 = r2 + 1
            r1.receivedPingCount = r2     // Catch:{ all -> 0x0024 }
            monitor-exit(r1)
            return
        L_0x0022:
            monitor-exit(r1)
            return
        L_0x0024:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.onReadPing(okio.ByteString):void");
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean pong(ByteString byteString) {
        if (!this.failed) {
            if (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty()) {
                this.pongQueue.add(byteString);
                runWriter();
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r1 == -1) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        failWebSocket(new java.net.SocketTimeoutException("sent ping but didn't receive pong"), null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.writePing(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        failWebSocket(r6, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writePingFrame(okio.ByteString r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.failed     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)     // Catch:{ all -> 0x0032 }
            return
        L_0x0007:
            com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketWriter r0 = r5.writer     // Catch:{ all -> 0x0032 }
            boolean r1 = r5.awaitingPong     // Catch:{ all -> 0x0032 }
            r2 = -1
            if (r1 == 0) goto L_0x0011
            int r1 = r5.sentPingCount     // Catch:{ all -> 0x0032 }
            goto L_0x0012
        L_0x0011:
            r1 = -1
        L_0x0012:
            int r3 = r5.sentPingCount     // Catch:{ all -> 0x0032 }
            r4 = 1
            int r3 = r3 + r4
            r5.sentPingCount = r3     // Catch:{ all -> 0x0032 }
            r5.awaitingPong = r4     // Catch:{ all -> 0x0032 }
            monitor-exit(r5)     // Catch:{ all -> 0x0032 }
            r3 = 0
            if (r1 == r2) goto L_0x0029
            java.net.SocketTimeoutException r6 = new java.net.SocketTimeoutException
            java.lang.String r0 = "sent ping but didn't receive pong"
            r6.<init>(r0)
            r5.failWebSocket(r6, r3)
            return
        L_0x0029:
            r0.writePing(r6)     // Catch:{ IOException -> 0x002d }
            return
        L_0x002d:
            r6 = move-exception
            r5.failWebSocket(r6, r3)
            return
        L_0x0032:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0032 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.writePingFrame(okio.ByteString):void");
    }

    /* access modifiers changed from: package-private */
    public void checkResponse(Response response) throws ProtocolException {
        if (response.code() == 101) {
            String header = response.header("Connection");
            if ("Upgrade".equalsIgnoreCase(header)) {
                String header2 = response.header("Upgrade");
                if ("websocket".equalsIgnoreCase(header2)) {
                    String header3 = response.header("Sec-WebSocket-Accept");
                    String base64 = ByteString.encodeUtf8(this.key + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
                    if (!base64.equals(header3)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + base64 + "' but was '" + header3 + "'");
                    }
                    return;
                }
                throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header2 + "'");
            }
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header + "'");
        }
        throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + " " + response.message() + "'");
    }

    /* access modifiers changed from: package-private */
    public void awaitTermination(int i, TimeUnit timeUnit) throws InterruptedException {
        this.executor.awaitTermination((long) i, timeUnit);
    }

    public boolean close(int i, String str) {
        return close(i, str, 60000);
    }

    public void closeQuietly(int i, String str) {
        this.listener = null;
        try {
            close(i, str);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (r3.listener == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        r3.listener.onFailure(r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void failWebSocket(java.lang.Exception r4, @android.support.annotation.Nullable okhttp3.Response r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.failed     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            return
        L_0x0007:
            r0 = 1
            r3.failed = r0     // Catch:{ all -> 0x0035 }
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r3.streams     // Catch:{ all -> 0x0035 }
            r1 = 0
            r3.streams = r1     // Catch:{ all -> 0x0035 }
            java.util.concurrent.ScheduledFuture<?> r1 = r3.cancelFuture     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0019
            java.util.concurrent.ScheduledFuture<?> r1 = r3.cancelFuture     // Catch:{ all -> 0x0035 }
            r2 = 0
            r1.cancel(r2)     // Catch:{ all -> 0x0035 }
        L_0x0019:
            java.util.concurrent.ScheduledExecutorService r1 = r3.executor     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0022
            java.util.concurrent.ScheduledExecutorService r1 = r3.executor     // Catch:{ all -> 0x0035 }
            r1.shutdown()     // Catch:{ all -> 0x0035 }
        L_0x0022:
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketListener r1 = r3.listener     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002c
            com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketListener r1 = r3.listener     // Catch:{ all -> 0x0030 }
            r1.onFailure(r3, r4, r5)     // Catch:{ all -> 0x0030 }
        L_0x002c:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0)
            return
        L_0x0030:
            r4 = move-exception
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0)
            throw r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.failWebSocket(java.lang.Exception, okhttp3.Response):void");
    }

    public void initReaderAndWriter(String str, RealWebSocket.Streams streams2) throws IOException {
        synchronized (this) {
            this.streams = streams2;
            this.writer = new WebSocketWriter(streams2.client, streams2.sink, this.random);
            this.executor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(str, false));
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
        }
        WebSocketReader webSocketReader = new WebSocketReader(streams2.client, streams2.source, this, this.ioLimitLength);
        this.reader = webSocketReader;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean send(okio.ByteString r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.failed     // Catch:{ all -> 0x003e }
            r1 = 0
            if (r0 != 0) goto L_0x003c
            boolean r0 = r6.enqueuedClose     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x000b
            goto L_0x003c
        L_0x000b:
            long r2 = r6.queueSize     // Catch:{ all -> 0x003e }
            int r0 = r7.size()     // Catch:{ all -> 0x003e }
            long r4 = (long) r0     // Catch:{ all -> 0x003e }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.close(r7, r8)     // Catch:{ all -> 0x003e }
            monitor-exit(r6)
            return r1
        L_0x0022:
            long r0 = r6.queueSize     // Catch:{ all -> 0x003e }
            int r2 = r7.size()     // Catch:{ all -> 0x003e }
            long r2 = (long) r2     // Catch:{ all -> 0x003e }
            long r0 = r0 + r2
            r6.queueSize = r0     // Catch:{ all -> 0x003e }
            java.util.ArrayDeque<java.lang.Object> r0 = r6.messageAndCloseQueue     // Catch:{ all -> 0x003e }
            com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket$Message r1 = new com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket$Message     // Catch:{ all -> 0x003e }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x003e }
            r0.add(r1)     // Catch:{ all -> 0x003e }
            r6.runWriter()     // Catch:{ all -> 0x003e }
            r7 = 1
            monitor-exit(r6)
            return r7
        L_0x003c:
            monitor-exit(r6)
            return r1
        L_0x003e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.send(okio.ByteString, int):boolean");
    }

    public void onReadClose(int i, String str) {
        RealWebSocket.Streams streams2;
        if (i != -1) {
            synchronized (this) {
                if (this.receivedCloseCode == -1) {
                    this.receivedCloseCode = i;
                    this.receivedCloseReason = str;
                    if (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty()) {
                        streams2 = null;
                    } else {
                        streams2 = this.streams;
                        this.streams = null;
                        if (this.cancelFuture != null) {
                            this.cancelFuture.cancel(false);
                        }
                        this.executor.shutdown();
                    }
                } else {
                    throw new IllegalStateException("already closed");
                }
            }
            try {
                if (this.listener != null) {
                    this.listener.onClosing(this, i, str);
                    if (streams2 != null) {
                        this.listener.onClosed(this, i, str);
                    }
                }
            } finally {
                Util.closeQuietly((Closeable) streams2);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static CustomHeartBeatRealWebSocket create(Request request, long j, WebSocketListener webSocketListener) {
        CustomHeartBeatRealWebSocket customHeartBeatRealWebSocket = new CustomHeartBeatRealWebSocket(request, j, webSocketListener, new Random());
        return customHeartBeatRealWebSocket;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean close(int i, String str, long j) {
        WebSocketProtocol.validateCloseCode(i);
        ByteString byteString = null;
        if (str != null) {
            byteString = ByteString.encodeUtf8(str);
            if (((long) byteString.size()) > 123) {
                throw new IllegalArgumentException("reason.size() > 123: " + str);
            }
        }
        if (!this.failed) {
            if (!this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(i, byteString, j));
                runWriter();
                return true;
            }
        }
        return false;
    }

    public CustomHeartBeatRealWebSocket(Request request, long j, WebSocketListener webSocketListener, Random random2) {
        if ("GET".equals(request.method())) {
            this.originalRequest = request;
            this.listener = webSocketListener;
            this.random = random2;
            this.ioLimitLength = j;
            byte[] bArr = new byte[16];
            random2.nextBytes(bArr);
            this.key = ByteString.of(bArr).base64();
            this.writerRunnable = new Runnable() {
                public void run() {
                    do {
                        try {
                        } catch (IOException e2) {
                            CustomHeartBeatRealWebSocket.this.failWebSocket(e2, null);
                            return;
                        }
                    } while (CustomHeartBeatRealWebSocket.this.writeOneFrame());
                }
            };
            return;
        }
        throw new IllegalArgumentException("Request must be GET: " + request.method());
    }
}
