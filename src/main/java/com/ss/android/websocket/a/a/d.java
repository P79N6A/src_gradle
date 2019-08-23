package com.ss.android.websocket.a.a;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.IOException;
import java.util.Random;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Sink;
import okio.Timeout;

public final class d {

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ boolean f78167e = (!d.class.desiredAssertionStatus());

    /* renamed from: a  reason: collision with root package name */
    public final BufferedSink f78168a;

    /* renamed from: b  reason: collision with root package name */
    public final Buffer f78169b = new Buffer();

    /* renamed from: c  reason: collision with root package name */
    final a f78170c = new a(this, (byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public boolean f78171d;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f78172f;
    private final Random g;
    private boolean h;
    private final byte[] i;
    private final byte[] j;

    final class a implements Sink {

        /* renamed from: a  reason: collision with root package name */
        public int f78173a;

        /* renamed from: b  reason: collision with root package name */
        public long f78174b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f78175c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f78176d;

        public final Timeout timeout() {
            return d.this.f78168a.timeout();
        }

        public final void close() throws IOException {
            if (!this.f78176d) {
                synchronized (d.this) {
                    d.this.a(this.f78173a, d.this.f78169b.size(), this.f78175c, true);
                }
                this.f78176d = true;
                d.this.f78171d = false;
                return;
            }
            throw new IOException("closed");
        }

        public final void flush() throws IOException {
            if (!this.f78176d) {
                synchronized (d.this) {
                    d.this.a(this.f78173a, d.this.f78169b.size(), this.f78175c, false);
                }
                this.f78175c = false;
                return;
            }
            throw new IOException("closed");
        }

        private a() {
        }

        /* synthetic */ a(d dVar, byte b2) {
            this();
        }

        public final void write(Buffer buffer, long j) throws IOException {
            boolean z;
            if (!this.f78176d) {
                d.this.f78169b.write(buffer, j);
                if (!this.f78175c || this.f78174b == -1 || d.this.f78169b.size() <= this.f78174b - 8192) {
                    z = false;
                } else {
                    z = true;
                }
                long completeSegmentByteCount = d.this.f78169b.completeSegmentByteCount();
                if (completeSegmentByteCount > 0 && !z) {
                    synchronized (d.this) {
                        d.this.a(this.f78173a, completeSegmentByteCount, this.f78175c, false);
                    }
                    this.f78175c = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }
    }

    public final void a(Buffer buffer) throws IOException {
        synchronized (this) {
            a(9, buffer);
        }
    }

    public final void b(Buffer buffer) throws IOException {
        synchronized (this) {
            a(10, buffer);
        }
    }

    public final void a(int i2, String str) throws IOException {
        Buffer buffer;
        if (i2 == 0 && str == null) {
            buffer = null;
        } else {
            if (i2 != 0) {
                b.a(i2, true);
            }
            Buffer buffer2 = new Buffer();
            buffer2.writeShort(i2);
            if (str != null) {
                buffer2.writeUtf8(str);
            }
            buffer = buffer2;
        }
        synchronized (this) {
            a(8, buffer);
            this.h = true;
        }
    }

    private void a(int i2, Buffer buffer) throws IOException {
        if (!f78167e && !Thread.holdsLock(this)) {
            throw new AssertionError();
        } else if (!this.h) {
            int i3 = 0;
            if (buffer != null) {
                i3 = (int) buffer.size();
                if (((long) i3) > 125) {
                    throw new IllegalArgumentException("Payload size must be less than or equal to 125");
                }
            }
            this.f78168a.writeByte(i2 | SearchJediMixFeedAdapter.f42517f);
            if (this.f78172f) {
                this.f78168a.writeByte(i3 | SearchJediMixFeedAdapter.f42517f);
                this.g.nextBytes(this.i);
                this.f78168a.write(this.i);
                if (buffer != null) {
                    a((BufferedSource) buffer, (long) i3);
                }
            } else {
                this.f78168a.writeByte(i3);
                if (buffer != null) {
                    this.f78168a.writeAll(buffer);
                }
            }
            this.f78168a.emit();
        } else {
            throw new IOException("closed");
        }
    }

    private void a(BufferedSource bufferedSource, long j2) throws IOException {
        if (f78167e || Thread.holdsLock(this)) {
            long j3 = 0;
            while (j3 < j2) {
                int read = bufferedSource.read(this.j, 0, (int) Math.min(j2, (long) this.j.length));
                if (read != -1) {
                    long j4 = (long) read;
                    b.a(this.j, j4, this.i, j3);
                    this.f78168a.write(this.j, 0, read);
                    j3 += j4;
                } else {
                    throw new AssertionError();
                }
            }
            return;
        }
        throw new AssertionError();
    }

    public d(boolean z, BufferedSink bufferedSink, Random random) {
        byte[] bArr;
        if (bufferedSink == null) {
            throw new NullPointerException("sink == null");
        } else if (random != null) {
            this.f78172f = z;
            this.f78168a = bufferedSink;
            this.g = random;
            byte[] bArr2 = null;
            if (z) {
                bArr = new byte[4];
            } else {
                bArr = null;
            }
            this.i = bArr;
            this.j = z ? new byte[8192] : bArr2;
        } else {
            throw new NullPointerException("random == null");
        }
    }

    public final void a(int i2, long j2, boolean z, boolean z2) throws IOException {
        if (!f78167e && !Thread.holdsLock(this)) {
            throw new AssertionError();
        } else if (!this.h) {
            int i3 = 0;
            if (!z) {
                i2 = 0;
            }
            if (z2) {
                i2 |= SearchJediMixFeedAdapter.f42517f;
            }
            this.f78168a.writeByte(i2);
            if (this.f78172f) {
                this.g.nextBytes(this.i);
                i3 = SearchJediMixFeedAdapter.f42517f;
            }
            if (j2 <= 125) {
                this.f78168a.writeByte(((int) j2) | i3);
            } else if (j2 <= 65535) {
                this.f78168a.writeByte(i3 | 126);
                this.f78168a.writeShort((int) j2);
            } else {
                this.f78168a.writeByte(i3 | 127);
                this.f78168a.writeLong(j2);
            }
            if (this.f78172f) {
                this.f78168a.write(this.i);
                a((BufferedSource) this.f78169b, j2);
            } else {
                this.f78168a.write(this.f78169b, j2);
            }
            this.f78168a.emit();
        } else {
            throw new IOException("closed");
        }
    }
}
