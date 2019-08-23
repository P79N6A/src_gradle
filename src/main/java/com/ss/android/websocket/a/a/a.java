package com.ss.android.websocket.a.a;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.websocket.a.a.c;
import com.ss.android.websocket.a.c;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.NamedRunnable;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;

public abstract class a implements com.ss.android.websocket.a.a {

    /* renamed from: c  reason: collision with root package name */
    public final d f78144c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f78145d;

    /* renamed from: e  reason: collision with root package name */
    private final c f78146e;

    /* renamed from: f  reason: collision with root package name */
    private final c f78147f;
    private volatile boolean g;
    private boolean h;
    private final AtomicBoolean i = new AtomicBoolean();

    /* access modifiers changed from: protected */
    public abstract void a() throws IOException;

    /* access modifiers changed from: protected */
    public abstract void a(IOException iOException);

    public final boolean b() {
        MediaType mediaType;
        try {
            c cVar = this.f78146e;
            cVar.a();
            if (cVar.j) {
                cVar.b();
            } else {
                switch (cVar.f78162f) {
                    case 1:
                        mediaType = com.ss.android.websocket.a.a.f78142a;
                        break;
                    case 2:
                        mediaType = com.ss.android.websocket.a.a.f78143b;
                        break;
                    default:
                        throw new ProtocolException("Unknown opcode: " + Integer.toHexString(cVar.f78162f));
                }
                c.AnonymousClass1 r5 = new ResponseBody(mediaType, Okio.buffer(cVar.f78159c)) {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ MediaType f78163a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ BufferedSource f78164b;

                    public final long contentLength() {
                        return -1;
                    }

                    public final MediaType contentType() {
                        return this.f78163a;
                    }

                    public final BufferedSource source() {
                        return this.f78164b;
                    }

                    {
                        this.f78163a = r2;
                        this.f78164b = r3;
                    }
                };
                cVar.f78161e = false;
                cVar.f78158b.a((ResponseBody) r5);
                if (!cVar.f78161e) {
                    throw new IllegalStateException("Listener failed to call close on message payload.");
                }
            }
            if (!this.f78145d) {
                return true;
            }
            return false;
        } catch (IOException e2) {
            if (!this.g && (e2 instanceof ProtocolException)) {
                try {
                    this.f78144c.a((int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, (String) null);
                } catch (IOException unused) {
                }
            }
            if (this.i.compareAndSet(false, true)) {
                a(e2);
            }
            this.f78147f.a(e2, (Response) null);
            return false;
        }
    }

    public final void a(Buffer buffer) throws IOException {
        if (this.g) {
            throw new IllegalStateException("closed");
        } else if (!this.h) {
            try {
                this.f78144c.a(buffer);
            } catch (IOException e2) {
                this.h = true;
                throw e2;
            }
        } else {
            throw new IllegalStateException("must call close()");
        }
    }

    public final void a(RequestBody requestBody) throws IOException {
        int i2;
        if (requestBody == null) {
            throw new NullPointerException("message == null");
        } else if (this.g) {
            throw new IllegalStateException("closed");
        } else if (!this.h) {
            MediaType contentType = requestBody.contentType();
            if (contentType != null) {
                String subtype = contentType.subtype();
                if (com.ss.android.websocket.a.a.f78142a.subtype().equals(subtype)) {
                    i2 = 1;
                } else if (com.ss.android.websocket.a.a.f78143b.subtype().equals(subtype)) {
                    i2 = 2;
                } else {
                    throw new IllegalArgumentException("Unknown message content type: " + contentType.type() + "/" + contentType.subtype() + ". Must use WebSocket.TEXT or WebSocket.BINARY.");
                }
                d dVar = this.f78144c;
                long contentLength = requestBody.contentLength();
                if (!dVar.f78171d) {
                    dVar.f78171d = true;
                    dVar.f78170c.f78173a = i2;
                    dVar.f78170c.f78174b = contentLength;
                    dVar.f78170c.f78175c = true;
                    dVar.f78170c.f78176d = false;
                    BufferedSink buffer = Okio.buffer((Sink) dVar.f78170c);
                    try {
                        requestBody.writeTo(buffer);
                        buffer.close();
                    } catch (IOException e2) {
                        this.h = true;
                        throw e2;
                    }
                } else {
                    throw new IllegalStateException("Another message writer is active. Did you call close()?");
                }
            } else {
                throw new IllegalArgumentException("Message content type was null. Must use WebSocket.TEXT or WebSocket.BINARY.");
            }
        } else {
            throw new IllegalStateException("must call close()");
        }
    }

    public final void b(int i2, String str) {
        if (!this.g) {
            try {
                this.f78144c.a(i2, str);
            } catch (IOException unused) {
            }
        }
        if (this.i.compareAndSet(false, true)) {
            try {
                a();
            } catch (IOException unused2) {
            }
        }
        this.f78147f.a(i2, str);
    }

    public final void a(int i2, String str) throws IOException {
        if (!this.g) {
            this.g = true;
            try {
                this.f78144c.a((int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, str);
            } catch (IOException e2) {
                if (this.i.compareAndSet(false, true)) {
                    a(e2);
                }
                throw e2;
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public a(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink, Random random, final Executor executor, final com.ss.android.websocket.a.c cVar, final String str) {
        this.f78147f = cVar;
        this.f78144c = new d(true, bufferedSink, random);
        this.f78146e = new c(true, bufferedSource, new c.a() {
            public final void a(ResponseBody responseBody) throws IOException {
                cVar.a(responseBody);
            }

            public final void b(Buffer buffer) {
                cVar.a(buffer);
            }

            public final void a(final Buffer buffer) {
                executor.execute(new NamedRunnable("OkHttp %s WebSocket Pong Reply", new Object[]{str}) {
                    public final void execute() {
                        try {
                            a.this.f78144c.b(buffer);
                        } catch (IOException unused) {
                        }
                    }
                });
            }

            public final void a(int i, String str) {
                a.this.f78145d = true;
                Executor executor = executor;
                final int i2 = i;
                final String str2 = str;
                AnonymousClass2 r2 = new NamedRunnable("OkHttp %s WebSocket Close Reply", new Object[]{str}) {
                    public final void execute() {
                        a.this.b(i2, str2);
                    }
                };
                executor.execute(r2);
            }
        });
    }
}
