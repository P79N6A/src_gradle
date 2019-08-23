package com.ss.android.websocket.a;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
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
import okio.ByteString;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    final Call f78178a;

    /* renamed from: b  reason: collision with root package name */
    final Random f78179b;

    /* renamed from: c  reason: collision with root package name */
    final String f78180c;

    static class a extends com.ss.android.websocket.a.a.a {

        /* renamed from: e  reason: collision with root package name */
        private final StreamAllocation f78183e;

        /* renamed from: f  reason: collision with root package name */
        private final ExecutorService f78184f;

        public final void a() {
            a(null);
        }

        public final void a(IOException iOException) {
            this.f78184f.shutdown();
            this.f78183e.noNewStreams();
            this.f78183e.streamFinished(true, this.f78183e.codec(), -1, iOException);
        }

        a(StreamAllocation streamAllocation, Random random, ExecutorService executorService, c cVar, String str) {
            super(true, streamAllocation.connection().newWebSocketStreams(streamAllocation).source, streamAllocation.connection().newWebSocketStreams(streamAllocation).sink, random, executorService, cVar, str);
            this.f78183e = streamAllocation;
            this.f78184f = executorService;
        }
    }

    public final void a(final c cVar) {
        this.f78178a.enqueue(new Callback() {
            public final void onFailure(Call call, IOException iOException) {
                cVar.a(iOException, (Response) null);
            }

            public final void onResponse(Call call, Response response) throws IOException {
                Response response2 = response;
                try {
                    b bVar = b.this;
                    c cVar = cVar;
                    if (response.code() == 101) {
                        String header = response2.header("Connection");
                        if ("Upgrade".equalsIgnoreCase(header)) {
                            String header2 = response2.header("Upgrade");
                            if ("websocket".equalsIgnoreCase(header2)) {
                                String header3 = response2.header("Sec-WebSocket-Accept");
                                String a2 = b.a(bVar.f78180c + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
                                if (a2.equals(header3)) {
                                    StreamAllocation streamAllocation = Internal.instance.streamAllocation(bVar.f78178a);
                                    Random random = bVar.f78179b;
                                    String httpUrl = response.request().url().toString();
                                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingDeque(), Util.threadFactory(Util.format("OkHttp %s WebSocket", httpUrl), true));
                                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                                    a aVar = new a(streamAllocation, random, threadPoolExecutor, cVar, httpUrl);
                                    cVar.a((a) aVar, response2);
                                    do {
                                    } while (aVar.b());
                                    return;
                                }
                                throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a2 + "' but was '" + header3 + "'");
                            }
                            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header2 + "'");
                        }
                        throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header + "'");
                    }
                    throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + " " + response.message() + "'");
                } catch (IOException e2) {
                    cVar.a(e2, response2);
                }
            }
        });
    }

    public static String a(String str) {
        try {
            return ByteString.of(MessageDigest.getInstance("SHA-1").digest(str.getBytes("UTF-8"))).base64();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static b a(OkHttpClient okHttpClient, Request request) {
        return new b(okHttpClient, request);
    }

    private b(OkHttpClient okHttpClient, Request request) {
        this(okHttpClient, request, new SecureRandom());
    }

    private b(OkHttpClient okHttpClient, Request request, Random random) {
        if ("GET".equals(request.method())) {
            this.f78179b = random;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.f78180c = ByteString.of(bArr).base64();
            this.f78178a = Internal.instance.newWebSocketCall(okHttpClient.newBuilder().protocols(Collections.singletonList(Protocol.HTTP_1_1)).build(), request.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.f78180c).header("Sec-WebSocket-Version", "13").build());
            return;
        }
        throw new IllegalArgumentException("Request must be GET: " + request.method());
    }
}
