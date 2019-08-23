package com.ss.android.message.a.b.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SelectableChannel;

public final class k extends InputStream implements ReadableByteChannel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29940a;

    /* renamed from: b  reason: collision with root package name */
    private a f29941b;

    static class a extends j {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f29942c;

        /* renamed from: d  reason: collision with root package name */
        ReadableByteChannel f29943d;

        a(ReadableByteChannel readableByteChannel) throws IOException {
            super((SelectableChannel) readableByteChannel);
            this.f29943d = readableByteChannel;
        }

        /* access modifiers changed from: package-private */
        public final int a(ByteBuffer byteBuffer) throws IOException {
            ByteBuffer byteBuffer2 = byteBuffer;
            if (!PatchProxy.isSupport(new Object[]{byteBuffer2}, this, f29942c, false, 18087, new Class[]{ByteBuffer.class}, Integer.TYPE)) {
                return this.f29943d.read(byteBuffer2);
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{byteBuffer2}, this, f29942c, false, 18087, new Class[]{ByteBuffer.class}, Integer.TYPE)).intValue();
        }
    }

    public final synchronized void close() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f29940a, false, 18084, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29940a, false, 18084, new Class[0], Void.TYPE);
            return;
        }
        this.f29941b.f29943d.close();
        this.f29941b.a();
    }

    public final boolean isOpen() {
        if (!PatchProxy.isSupport(new Object[0], this, f29940a, false, 18085, new Class[0], Boolean.TYPE)) {
            return this.f29941b.b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f29940a, false, 18085, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final int read() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f29940a, false, 18082, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f29940a, false, 18082, new Class[0], Integer.TYPE)).intValue();
        }
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        if (read > 0) {
            return bArr[0] & 255;
        }
        if (read == -1) {
            return read;
        }
        throw new IOException("Could not read from stream");
    }

    public k(Socket socket) throws IOException {
        this((ReadableByteChannel) socket.getChannel());
    }

    private k(ReadableByteChannel readableByteChannel) throws IOException {
        j.a((Object) readableByteChannel);
        this.f29941b = new a(readableByteChannel);
    }

    public final int read(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (!PatchProxy.isSupport(new Object[]{byteBuffer2}, this, f29940a, false, 18086, new Class[]{ByteBuffer.class}, Integer.TYPE)) {
            return this.f29941b.b(byteBuffer2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{byteBuffer2}, this, f29940a, false, 18086, new Class[]{ByteBuffer.class}, Integer.TYPE)).intValue();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (PatchProxy.isSupport(new Object[]{bArr, Integer.valueOf(i), Integer.valueOf(i2)}, this, f29940a, false, 18083, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bArr, Integer.valueOf(i), Integer.valueOf(i2)}, this, f29940a, false, 18083, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        return read(ByteBuffer.wrap(bArr, i, i2));
    }
}
