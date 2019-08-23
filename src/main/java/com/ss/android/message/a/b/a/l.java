package com.ss.android.message.a.b.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.WritableByteChannel;

public final class l extends OutputStream implements WritableByteChannel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29944a;

    /* renamed from: b  reason: collision with root package name */
    private a f29945b;

    static class a extends j {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f29946c;

        /* renamed from: d  reason: collision with root package name */
        WritableByteChannel f29947d;

        a(WritableByteChannel writableByteChannel) throws IOException {
            super((SelectableChannel) writableByteChannel);
            this.f29947d = writableByteChannel;
        }

        /* access modifiers changed from: package-private */
        public final int a(ByteBuffer byteBuffer) throws IOException {
            ByteBuffer byteBuffer2 = byteBuffer;
            if (!PatchProxy.isSupport(new Object[]{byteBuffer2}, this, f29946c, false, 18093, new Class[]{ByteBuffer.class}, Integer.TYPE)) {
                return this.f29947d.write(byteBuffer2);
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{byteBuffer2}, this, f29946c, false, 18093, new Class[]{ByteBuffer.class}, Integer.TYPE)).intValue();
        }
    }

    public final synchronized void close() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f29944a, false, 18090, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29944a, false, 18090, new Class[0], Void.TYPE);
            return;
        }
        this.f29945b.f29947d.close();
        this.f29945b.a();
    }

    public final boolean isOpen() {
        if (!PatchProxy.isSupport(new Object[0], this, f29944a, false, 18091, new Class[0], Boolean.TYPE)) {
            return this.f29945b.b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f29944a, false, 18091, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public l(Socket socket) throws IOException {
        this((WritableByteChannel) socket.getChannel());
    }

    private l(WritableByteChannel writableByteChannel) throws IOException {
        j.a((Object) writableByteChannel);
        this.f29945b = new a(writableByteChannel);
    }

    public final int write(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (!PatchProxy.isSupport(new Object[]{byteBuffer2}, this, f29944a, false, 18092, new Class[]{ByteBuffer.class}, Integer.TYPE)) {
            return this.f29945b.b(byteBuffer2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{byteBuffer2}, this, f29944a, false, 18092, new Class[]{ByteBuffer.class}, Integer.TYPE)).intValue();
    }

    public final void write(int i) throws IOException {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f29944a, false, 18088, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f29944a, false, 18088, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        write(new byte[]{(byte) i}, 0, 1);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (PatchProxy.isSupport(new Object[]{bArr, Integer.valueOf(i), Integer.valueOf(i2)}, this, f29944a, false, 18089, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bArr, Integer.valueOf(i), Integer.valueOf(i2)}, this, f29944a, false, 18089, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        while (wrap.hasRemaining()) {
            try {
                if (write(wrap) < 0) {
                    throw new IOException("The stream is closed");
                }
            } catch (IOException e2) {
                if (wrap.capacity() > wrap.remaining()) {
                    this.f29945b.a();
                }
                throw e2;
            }
        }
    }
}
