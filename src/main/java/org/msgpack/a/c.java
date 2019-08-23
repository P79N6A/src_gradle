package org.msgpack.a;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class c implements h {

    /* renamed from: a  reason: collision with root package name */
    protected byte[] f84182a;

    /* renamed from: b  reason: collision with root package name */
    protected int f84183b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f84184c;

    /* renamed from: d  reason: collision with root package name */
    protected ByteBuffer f84185d;

    /* access modifiers changed from: protected */
    public abstract boolean b(byte[] bArr, int i, int i2) throws IOException;

    public void a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f84182a == null) {
            if (this.f84184c < i2) {
                b(bArr, i, i2);
                return;
            }
            a();
        }
        if (i2 <= this.f84184c - this.f84183b) {
            System.arraycopy(bArr, i, this.f84182a, this.f84183b, i2);
            this.f84183b += i2;
        } else if (i2 <= this.f84184c) {
            b(this.f84182a, 0, this.f84183b);
            a();
            this.f84183b = 0;
            System.arraycopy(bArr, i, this.f84182a, 0, i2);
            this.f84183b = i2;
        } else {
            flush();
            b(bArr, i, i2);
        }
    }

    public void a(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        if (this.f84182a == null) {
            if (this.f84184c < remaining) {
                b(byteBuffer);
                return;
            }
            a();
        }
        if (remaining <= this.f84184c - this.f84183b) {
            byteBuffer.get(this.f84182a, this.f84183b, remaining);
            this.f84183b += remaining;
        } else if (remaining <= this.f84184c) {
            b(this.f84182a, 0, this.f84183b);
            a();
            this.f84183b = 0;
            byteBuffer.get(this.f84182a, 0, remaining);
            this.f84183b = remaining;
        } else {
            flush();
            b(byteBuffer);
        }
    }

    public void a(byte b2, short s) throws IOException {
        a(3);
        byte[] bArr = this.f84182a;
        int i = this.f84183b;
        this.f84183b = i + 1;
        bArr[i] = b2;
        this.f84185d.putShort(this.f84183b, s);
        this.f84183b += 2;
    }

    private void a() {
        this.f84182a = new byte[this.f84184c];
        this.f84185d = ByteBuffer.wrap(this.f84182a);
    }

    public void flush() throws IOException {
        if (this.f84183b > 0) {
            b(this.f84182a, 0, this.f84183b);
            this.f84182a = null;
            this.f84183b = 0;
        }
    }

    public c(int i) {
        this.f84184c = i < 9 ? 9 : i;
    }

    public void a(byte b2) throws IOException {
        a(1);
        byte[] bArr = this.f84182a;
        int i = this.f84183b;
        this.f84183b = i + 1;
        bArr[i] = b2;
    }

    private void a(int i) throws IOException {
        if (this.f84182a == null) {
            a();
            return;
        }
        if (this.f84184c - this.f84183b < i) {
            b(this.f84182a, 0, this.f84183b);
            this.f84182a = new byte[this.f84184c];
            this.f84185d = ByteBuffer.wrap(this.f84182a);
            this.f84183b = 0;
        }
    }

    private void b(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasArray()) {
            b(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.limit());
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        b(bArr, 0, bArr.length);
    }

    public void a(byte b2, byte b3) throws IOException {
        a(2);
        byte[] bArr = this.f84182a;
        int i = this.f84183b;
        this.f84183b = i + 1;
        bArr[i] = b2;
        byte[] bArr2 = this.f84182a;
        int i2 = this.f84183b;
        this.f84183b = i2 + 1;
        bArr2[i2] = b3;
    }

    public void a(byte b2, double d2) throws IOException {
        a(9);
        byte[] bArr = this.f84182a;
        int i = this.f84183b;
        this.f84183b = i + 1;
        bArr[i] = b2;
        this.f84185d.putDouble(this.f84183b, d2);
        this.f84183b += 8;
    }

    public void a(byte b2, float f2) throws IOException {
        a(5);
        byte[] bArr = this.f84182a;
        int i = this.f84183b;
        this.f84183b = i + 1;
        bArr[i] = b2;
        this.f84185d.putFloat(this.f84183b, f2);
        this.f84183b += 4;
    }

    public void a(byte b2, int i) throws IOException {
        a(5);
        byte[] bArr = this.f84182a;
        int i2 = this.f84183b;
        this.f84183b = i2 + 1;
        bArr[i2] = b2;
        this.f84185d.putInt(this.f84183b, i);
        this.f84183b += 4;
    }

    public void a(byte b2, long j) throws IOException {
        a(9);
        byte[] bArr = this.f84182a;
        int i = this.f84183b;
        this.f84183b = i + 1;
        bArr[i] = b2;
        this.f84185d.putLong(this.f84183b, j);
        this.f84183b += 8;
    }
}
