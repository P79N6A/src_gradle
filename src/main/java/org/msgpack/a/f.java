package org.msgpack.a;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public final class f extends a {

    /* renamed from: b  reason: collision with root package name */
    public LinkedList<ByteBuffer> f84186b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    public int f84187c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f84188d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f84189e = new byte[8];

    /* renamed from: f  reason: collision with root package name */
    private ByteBuffer f84190f = ByteBuffer.wrap(this.f84189e);
    private final int g;

    public final void close() {
    }

    public final byte c() throws EOFException {
        ByteBuffer b2 = b(1);
        return b2.get(b2.position());
    }

    public final short d() throws EOFException {
        ByteBuffer b2 = b(2);
        return b2.getShort(b2.position());
    }

    public final int e() throws EOFException {
        ByteBuffer b2 = b(4);
        return b2.getInt(b2.position());
    }

    public final long f() throws EOFException {
        ByteBuffer b2 = b(8);
        return b2.getLong(b2.position());
    }

    public final float g() throws EOFException {
        ByteBuffer b2 = b(4);
        return b2.getFloat(b2.position());
    }

    public final double h() throws EOFException {
        ByteBuffer b2 = b(8);
        return b2.getDouble(b2.position());
    }

    public final byte a() throws EOFException {
        ByteBuffer byteBuffer;
        try {
            byteBuffer = this.f84186b.getFirst();
        } catch (NoSuchElementException unused) {
            byteBuffer = null;
        }
        if (byteBuffer == null || byteBuffer.remaining() == 0) {
            throw new d();
        }
        byte b2 = byteBuffer.get();
        this.f84181a++;
        if (byteBuffer.remaining() == 0) {
            a(byteBuffer);
        }
        return b2;
    }

    public final void b() {
        if (!this.f84186b.isEmpty()) {
            int i = this.f84188d;
            while (true) {
                ByteBuffer first = this.f84186b.getFirst();
                if (i >= first.remaining()) {
                    i -= first.remaining();
                    first.position(first.position() + first.remaining());
                    if (!a(first)) {
                        break;
                    }
                } else {
                    first.position(first.position() + i);
                    break;
                }
            }
            a(this.f84188d);
            this.f84188d = 0;
        }
    }

    public f(int i) {
        this.g = i;
    }

    private boolean a(ByteBuffer byteBuffer) {
        if (this.f84186b.size() != 1) {
            this.f84186b.removeFirst();
            return true;
        } else if (this.f84187c >= 0) {
            byteBuffer.position(0);
            byteBuffer.limit(0);
            this.f84187c = byteBuffer.capacity();
            return false;
        } else {
            this.f84186b.removeFirst();
            return false;
        }
    }

    private ByteBuffer b(int i) throws EOFException {
        ByteBuffer byteBuffer;
        try {
            byteBuffer = this.f84186b.getFirst();
        } catch (NoSuchElementException unused) {
            byteBuffer = null;
        }
        if (byteBuffer == null) {
            throw new d();
        } else if (i <= byteBuffer.remaining()) {
            this.f84188d = i;
            return byteBuffer;
        } else {
            Iterator it2 = this.f84186b.iterator();
            int i2 = i;
            int i3 = 0;
            while (it2.hasNext()) {
                ByteBuffer byteBuffer2 = (ByteBuffer) it2.next();
                if (i2 <= byteBuffer2.remaining()) {
                    int position = byteBuffer2.position();
                    byteBuffer2.get(this.f84189e, i3, i2);
                    byteBuffer2.position(position);
                    this.f84188d = i;
                    return this.f84190f;
                }
                int remaining = byteBuffer2.remaining();
                int position2 = byteBuffer2.position();
                byteBuffer2.get(this.f84189e, i3, remaining);
                byteBuffer2.position(position2);
                i2 -= remaining;
                i3 += remaining;
            }
            throw new d();
        }
    }

    public final boolean a(b bVar, int i) throws IOException {
        ByteBuffer byteBuffer;
        try {
            byteBuffer = this.f84186b.getFirst();
        } catch (NoSuchElementException unused) {
            byteBuffer = null;
        }
        if (byteBuffer == null) {
            throw new d();
        } else if (byteBuffer.remaining() < i) {
            return false;
        } else {
            int position = byteBuffer.position();
            int limit = byteBuffer.limit();
            position += i;
            try {
                byteBuffer.limit(position);
                bVar.refer(byteBuffer, true);
                a(i);
                return true;
            } finally {
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                if (byteBuffer.remaining() == 0) {
                    a(byteBuffer);
                }
            }
        }
    }

    public final int a(byte[] bArr, int i, int i2) throws EOFException {
        ByteBuffer first;
        if (this.f84186b.isEmpty()) {
            return 0;
        }
        int i3 = i;
        int i4 = i2;
        do {
            first = this.f84186b.getFirst();
            if (i4 < first.remaining()) {
                first.get(bArr, i3, i4);
                a(i4);
                return i2;
            }
            int remaining = first.remaining();
            first.get(bArr, i3, remaining);
            a(remaining);
            i4 -= remaining;
            i3 += remaining;
        } while (a(first));
        return i2 - i4;
    }
}
