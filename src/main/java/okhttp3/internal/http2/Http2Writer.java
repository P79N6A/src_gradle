package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.Buffer;
import okio.BufferedSink;

public final class Http2Writer implements Closeable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final Buffer hpackBuffer = new Buffer();
    final Hpack.Writer hpackWriter = new Hpack.Writer(this.hpackBuffer);
    private int maxFrameSize = 16384;
    private final BufferedSink sink;

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void flush() throws IOException {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void connectionPreface() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        } else if (this.client) {
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Util.format(">> CONNECTION %s", Http2.CONNECTION_PREFACE.hex()));
            }
            this.sink.write(Http2.CONNECTION_PREFACE.toByteArray());
            this.sink.flush();
        }
    }

    public final synchronized void applyAndAckSettings(Settings settings) throws IOException {
        if (!this.closed) {
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.setHeaderTableSizeSetting(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, (byte) 4, (byte) 1);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void settings(Settings settings) throws IOException {
        int i;
        if (!this.closed) {
            frameHeader(0, settings.size() * 6, (byte) 4, (byte) 0);
            for (int i2 = 0; i2 < 10; i2++) {
                if (settings.isSet(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else if (i2 == 7) {
                        i = 4;
                    } else {
                        i = i2;
                    }
                    this.sink.writeShort(i);
                    this.sink.writeInt(settings.get(i2));
                }
            }
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    Http2Writer(BufferedSink bufferedSink, boolean z) {
        this.sink = bufferedSink;
        this.client = z;
    }

    private static void writeMedium(BufferedSink bufferedSink, int i) throws IOException {
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }

    public final synchronized void headers(int i, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(false, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    private void writeContinuationFrames(int i, long j) throws IOException {
        byte b2;
        while (j > 0) {
            int min = (int) Math.min((long) this.maxFrameSize, j);
            long j2 = (long) min;
            j -= j2;
            if (j == 0) {
                b2 = 4;
            } else {
                b2 = 0;
            }
            frameHeader(i, min, (byte) 9, b2);
            this.sink.write(this.hpackBuffer, j2);
        }
    }

    public final synchronized void rstStream(int i, ErrorCode errorCode) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            frameHeader(i, 4, (byte) 3, (byte) 0);
            this.sink.writeInt(errorCode.httpCode);
            this.sink.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void windowUpdate(int i, long j) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            frameHeader(i, 4, (byte) 8, (byte) 0);
            this.sink.writeInt((int) j);
            this.sink.flush();
        }
    }

    public final synchronized void synReply(boolean z, int i, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(z, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    public final void headers(boolean z, int i, List<Header> list) throws IOException {
        byte b2;
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            int min = (int) Math.min((long) this.maxFrameSize, size);
            long j = (long) min;
            if (size == j) {
                b2 = 4;
            } else {
                b2 = 0;
            }
            if (z) {
                b2 = (byte) (b2 | 1);
            }
            frameHeader(i, min, (byte) 1, b2);
            this.sink.write(this.hpackBuffer, j);
            if (size > j) {
                writeContinuationFrames(i, size - j);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public final synchronized void ping(boolean z, int i, int i2) throws IOException {
        if (!this.closed) {
            frameHeader(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.sink.writeInt(i);
            this.sink.writeInt(i2);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            frameHeader(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.sink.writeInt(i);
            this.sink.writeInt(errorCode.httpCode);
            if (bArr.length > 0) {
                this.sink.write(bArr);
            }
            this.sink.flush();
        } else {
            throw Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
        }
    }

    public final synchronized void pushPromise(int i, int i2, List<Header> list) throws IOException {
        byte b2;
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            int min = (int) Math.min((long) (this.maxFrameSize - 4), size);
            long j = (long) min;
            if (size == j) {
                b2 = 4;
            } else {
                b2 = 0;
            }
            frameHeader(i, min + 4, (byte) 5, b2);
            this.sink.writeInt(i2 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j);
            if (size > j) {
                writeContinuationFrames(i, size - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    public final void dataFrame(int i, byte b2, Buffer buffer, int i2) throws IOException {
        frameHeader(i, i2, (byte) 0, b2);
        if (i2 > 0) {
            this.sink.write(buffer, (long) i2);
        }
    }

    public final synchronized void data(boolean z, int i, Buffer buffer, int i2) throws IOException {
        if (!this.closed) {
            dataFrame(i, z ? (byte) 1 : 0, buffer, i2);
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void synStream(boolean z, int i, int i2, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(z, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    public final void frameHeader(int i, int i2, byte b2, byte b3) throws IOException {
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Http2.frameLog(false, i, i2, b2, b3));
        }
        if (i2 > this.maxFrameSize) {
            throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(this.maxFrameSize), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            writeMedium(this.sink, i2);
            this.sink.writeByte(b2 & 255);
            this.sink.writeByte(b3 & 255);
            this.sink.writeInt(i & Integer.MAX_VALUE);
        } else {
            throw Http2.illegalArgument("reserved bit set: %s", Integer.valueOf(i));
        }
    }
}
