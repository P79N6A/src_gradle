package com.ss.android.websocket.a.a;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final BufferedSource f78157a;

    /* renamed from: b  reason: collision with root package name */
    final a f78158b;

    /* renamed from: c  reason: collision with root package name */
    final Source f78159c = new b(this, (byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public boolean f78160d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f78161e;

    /* renamed from: f  reason: collision with root package name */
    public int f78162f;
    public long g;
    public long h;
    public boolean i;
    boolean j;
    public boolean k;
    public final byte[] l = new byte[4];
    public final byte[] m = new byte[8192];
    private final boolean n;

    public interface a {
        void a(int i, String str);

        void a(ResponseBody responseBody) throws IOException;

        void a(Buffer buffer);

        void b(Buffer buffer);
    }

    final class b implements Source {
        public final Timeout timeout() {
            return c.this.f78157a.timeout();
        }

        public final void close() throws IOException {
            if (!c.this.f78161e) {
                c.this.f78161e = true;
                if (!c.this.f78160d) {
                    c.this.f78157a.skip(c.this.g - c.this.h);
                    while (!c.this.i) {
                        c.this.c();
                        c.this.f78157a.skip(c.this.g);
                    }
                }
            }
        }

        private b() {
        }

        /* synthetic */ b(c cVar, byte b2) {
            this();
        }

        public final long read(Buffer buffer, long j) throws IOException {
            long j2;
            if (c.this.f78160d) {
                throw new IOException("closed");
            } else if (!c.this.f78161e) {
                if (c.this.h == c.this.g) {
                    if (c.this.i) {
                        return -1;
                    }
                    c.this.c();
                    if (c.this.f78162f != 0) {
                        throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(c.this.f78162f));
                    } else if (c.this.i && c.this.g == 0) {
                        return -1;
                    }
                }
                long min = Math.min(j, c.this.g - c.this.h);
                if (c.this.k) {
                    j2 = (long) c.this.f78157a.read(c.this.m, 0, (int) Math.min(min, (long) c.this.m.length));
                    if (j2 != -1) {
                        b.a(c.this.m, j2, c.this.l, c.this.h);
                        buffer.write(c.this.m, 0, (int) j2);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    j2 = c.this.f78157a.read(buffer, min);
                    if (j2 == -1) {
                        throw new EOFException();
                    }
                }
                c.this.h += j2;
                return j2;
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    public final void c() throws IOException {
        while (!this.f78160d) {
            a();
            if (this.j) {
                b();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a() throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (!this.f78160d) {
            byte readByte = this.f78157a.readByte() & 255;
            this.f78162f = readByte & 15;
            boolean z6 = false;
            if ((readByte & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.i = z;
            if ((readByte & 8) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.j = z2;
            if (!this.j || this.i) {
                if ((readByte & 64) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((readByte & 32) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((readByte & 16) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z3 || z4 || z5) {
                    throw new ProtocolException("Reserved flags are unsupported.");
                }
                byte readByte2 = this.f78157a.readByte() & 255;
                if ((readByte2 & 128) != 0) {
                    z6 = true;
                }
                this.k = z6;
                if (this.k != this.n) {
                    this.g = (long) (readByte2 & Byte.MAX_VALUE);
                    if (this.g == 126) {
                        this.g = ((long) this.f78157a.readShort()) & 65535;
                    } else if (this.g == 127) {
                        this.g = this.f78157a.readLong();
                        if (this.g < 0) {
                            throw new ProtocolException("Frame length 0x" + Long.toHexString(this.g) + " > 0x7FFFFFFFFFFFFFFF");
                        }
                    }
                    this.h = 0;
                    if (this.j && this.g > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (this.k) {
                        this.f78157a.readFully(this.l);
                    }
                } else {
                    throw new ProtocolException("Client-sent frames must be masked. Server sent must not.");
                }
            } else {
                throw new ProtocolException("Control frames must be final.");
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    public void b() throws IOException {
        Buffer buffer;
        if (this.h < this.g) {
            buffer = new Buffer();
            if (this.n) {
                this.f78157a.readFully(buffer, this.g);
            } else {
                while (this.h < this.g) {
                    int read = this.f78157a.read(this.m, 0, (int) Math.min(this.g - this.h, (long) this.m.length));
                    if (read != -1) {
                        long j2 = (long) read;
                        b.a(this.m, j2, this.l, this.h);
                        buffer.write(this.m, 0, read);
                        this.h += j2;
                    } else {
                        throw new EOFException();
                    }
                }
            }
        } else {
            buffer = null;
        }
        switch (this.f78162f) {
            case 8:
                short s = 1000;
                String str = "";
                if (buffer != null) {
                    long size = buffer.size();
                    if (size == 1) {
                        throw new ProtocolException("Malformed close payload length of 1.");
                    } else if (size != 0) {
                        s = buffer.readShort();
                        b.a(s, false);
                        str = buffer.readUtf8();
                    }
                }
                this.f78158b.a(s, str);
                this.f78160d = true;
                return;
            case 9:
                this.f78158b.a(buffer);
                return;
            case 10:
                this.f78158b.b(buffer);
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.f78162f));
        }
    }

    public c(boolean z, BufferedSource bufferedSource, a aVar) {
        if (bufferedSource != null) {
            this.n = z;
            this.f78157a = bufferedSource;
            this.f78158b = aVar;
            return;
        }
        throw new NullPointerException("source == null");
    }
}
