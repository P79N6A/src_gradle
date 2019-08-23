package io.fabric.sdk.android.services.b;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class u implements Closeable {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f83202c = Logger.getLogger(u.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final RandomAccessFile f83203a;

    /* renamed from: b  reason: collision with root package name */
    int f83204b;

    /* renamed from: d  reason: collision with root package name */
    private int f83205d;

    /* renamed from: e  reason: collision with root package name */
    private a f83206e;

    /* renamed from: f  reason: collision with root package name */
    private a f83207f;
    private final byte[] g = new byte[16];

    static class a {

        /* renamed from: a  reason: collision with root package name */
        static final a f83211a = new a(0, 0);

        /* renamed from: b  reason: collision with root package name */
        final int f83212b;

        /* renamed from: c  reason: collision with root package name */
        final int f83213c;

        public final String toString() {
            return getClass().getSimpleName() + "[position = " + this.f83212b + ", length = " + this.f83213c + "]";
        }

        a(int i, int i2) {
            this.f83212b = i;
            this.f83213c = i2;
        }
    }

    final class b extends InputStream {

        /* renamed from: b  reason: collision with root package name */
        private int f83215b;

        /* renamed from: c  reason: collision with root package name */
        private int f83216c;

        public final int read() throws IOException {
            if (this.f83216c == 0) {
                return -1;
            }
            u.this.f83203a.seek((long) this.f83215b);
            int read = u.this.f83203a.read();
            this.f83215b = u.this.a(this.f83215b + 1);
            this.f83216c--;
            return read;
        }

        private b(a aVar) {
            this.f83215b = u.this.a(aVar.f83212b + 4);
            this.f83216c = aVar.f83213c;
        }

        /* synthetic */ b(u uVar, a aVar, byte b2) {
            this(aVar);
        }

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            u.a(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            } else if (this.f83216c <= 0) {
                return -1;
            } else {
                if (i2 > this.f83216c) {
                    i2 = this.f83216c;
                }
                u.this.a(this.f83215b, bArr, i, i2);
                this.f83215b = u.this.a(this.f83215b + i2);
                this.f83216c -= i2;
                return i2;
            }
        }
    }

    public interface c {
        void read(InputStream inputStream, int i) throws IOException;
    }

    public final void a(byte[] bArr) throws IOException {
        b(bArr, 0, bArr.length);
    }

    public final synchronized boolean b() {
        boolean z;
        if (this.f83205d == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized void close() throws IOException {
        this.f83203a.close();
    }

    private synchronized void d() throws IOException {
        a(4096, 0, 0, 0);
        this.f83205d = 0;
        this.f83206e = a.f83211a;
        this.f83207f = a.f83211a;
        if (this.f83204b > 4096) {
            d(4096);
        }
        this.f83204b = 4096;
    }

    public final synchronized void c() throws IOException {
        if (b()) {
            throw new NoSuchElementException();
        } else if (this.f83205d == 1) {
            d();
        } else {
            int a2 = a(this.f83206e.f83212b + 4 + this.f83206e.f83213c);
            a(a2, this.g, 0, 4);
            int a3 = a(this.g, 0);
            a(this.f83204b, this.f83205d - 1, a2, this.f83207f.f83212b);
            this.f83205d--;
            this.f83206e = new a(a2, a3);
        }
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f83204b);
        sb.append(", size=");
        sb.append(this.f83205d);
        sb.append(", first=");
        sb.append(this.f83206e);
        sb.append(", last=");
        sb.append(this.f83207f);
        sb.append(", element lengths=[");
        try {
            a((c) new c() {

                /* renamed from: a  reason: collision with root package name */
                boolean f83208a = true;

                public final void read(InputStream inputStream, int i) throws IOException {
                    if (this.f83208a) {
                        this.f83208a = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i);
                }
            });
        } catch (IOException e2) {
            f83202c.log(Level.WARNING, "read error", e2);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final int a() {
        if (this.f83205d == 0) {
            return 16;
        }
        if (this.f83207f.f83212b >= this.f83206e.f83212b) {
            return (this.f83207f.f83212b - this.f83206e.f83212b) + 4 + this.f83207f.f83213c + 16;
        }
        return (((this.f83207f.f83212b + 4) + this.f83207f.f83213c) + this.f83204b) - this.f83206e.f83212b;
    }

    private static RandomAccessFile a(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private a b(int i) throws IOException {
        if (i == 0) {
            return a.f83211a;
        }
        this.f83203a.seek((long) i);
        return new a(i, this.f83203a.readInt());
    }

    private void d(int i) throws IOException {
        this.f83203a.setLength((long) i);
        this.f83203a.getChannel().force(true);
    }

    /* JADX INFO: finally extract failed */
    public u(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile a2 = a(file2);
            try {
                a2.setLength(4096);
                a2.seek(0);
                byte[] bArr = new byte[16];
                a(bArr, 4096, 0, 0, 0);
                a2.write(bArr);
                a2.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        }
        this.f83203a = a(file);
        this.f83203a.seek(0);
        this.f83203a.readFully(this.g);
        this.f83204b = a(this.g, 0);
        if (((long) this.f83204b) <= this.f83203a.length()) {
            this.f83205d = a(this.g, 4);
            int a3 = a(this.g, 8);
            int a4 = a(this.g, 12);
            this.f83206e = b(a3);
            this.f83207f = b(a4);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f83204b + ", Actual length: " + this.f83203a.length());
    }

    private void c(int i) throws IOException {
        int i2 = i + 4;
        int a2 = this.f83204b - a();
        if (a2 < i2) {
            int i3 = this.f83204b;
            do {
                a2 += i3;
                i3 <<= 1;
            } while (a2 < i2);
            d(i3);
            if (a(this.f83207f.f83212b + 4 + this.f83207f.f83213c) < this.f83206e.f83212b) {
                FileChannel channel = this.f83203a.getChannel();
                channel.position((long) this.f83204b);
                long j = (long) (r11 - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            if (this.f83207f.f83212b < this.f83206e.f83212b) {
                int i4 = (this.f83204b + this.f83207f.f83212b) - 16;
                a(i3, this.f83205d, this.f83206e.f83212b, i4);
                this.f83207f = new a(i4, this.f83207f.f83213c);
            } else {
                a(i3, this.f83205d, this.f83206e.f83212b, this.f83207f.f83212b);
            }
            this.f83204b = i3;
        }
    }

    public final int a(int i) {
        if (i < this.f83204b) {
            return i;
        }
        return (i + 16) - this.f83204b;
    }

    public final synchronized void a(c cVar) throws IOException {
        int i = this.f83206e.f83212b;
        for (int i2 = 0; i2 < this.f83205d; i2++) {
            a b2 = b(i);
            cVar.read(new b(this, b2, (byte) 0), b2.f83213c);
            i = a(b2.f83212b + 4 + b2.f83213c);
        }
    }

    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    private static int a(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    private static void a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            a(bArr, i, iArr[i2]);
            i += 4;
        }
    }

    private static void a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private synchronized void b(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        a((T) bArr, "buffer");
        if ((i2 | 0) < 0 || i2 > bArr.length - 0) {
            throw new IndexOutOfBoundsException();
        }
        c(i2);
        boolean b2 = b();
        if (b2) {
            i3 = 16;
        } else {
            i3 = a(this.f83207f.f83212b + 4 + this.f83207f.f83213c);
        }
        a aVar = new a(i3, i2);
        a(this.g, 0, i2);
        b(aVar.f83212b, this.g, 0, 4);
        b(aVar.f83212b + 4, bArr, 0, i2);
        if (b2) {
            i4 = aVar.f83212b;
        } else {
            i4 = this.f83206e.f83212b;
        }
        a(this.f83204b, this.f83205d + 1, i4, aVar.f83212b);
        this.f83207f = aVar;
        this.f83205d++;
        if (b2) {
            this.f83206e = this.f83207f;
        }
    }

    private void a(int i, int i2, int i3, int i4) throws IOException {
        a(this.g, i, i2, i3, i4);
        this.f83203a.seek(0);
        this.f83203a.write(this.g);
    }

    private void b(int i, byte[] bArr, int i2, int i3) throws IOException {
        int a2 = a(i);
        if (a2 + i3 <= this.f83204b) {
            this.f83203a.seek((long) a2);
            this.f83203a.write(bArr, i2, i3);
            return;
        }
        int i4 = this.f83204b - a2;
        this.f83203a.seek((long) a2);
        this.f83203a.write(bArr, i2, i4);
        this.f83203a.seek(16);
        this.f83203a.write(bArr, i2 + i4, i3 - i4);
    }

    public final void a(int i, byte[] bArr, int i2, int i3) throws IOException {
        int a2 = a(i);
        if (a2 + i3 <= this.f83204b) {
            this.f83203a.seek((long) a2);
            this.f83203a.readFully(bArr, i2, i3);
            return;
        }
        int i4 = this.f83204b - a2;
        this.f83203a.seek((long) a2);
        this.f83203a.readFully(bArr, i2, i4);
        this.f83203a.seek(16);
        this.f83203a.readFully(bArr, i2 + i4, i3 - i4);
    }
}
