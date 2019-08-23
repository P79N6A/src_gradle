package com.bumptech.glide.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public class ExceptionCatchingInputStream extends InputStream {
    private static final Queue<ExceptionCatchingInputStream> QUEUE = Util.createQueue(0);
    private IOException exception;
    private InputStream wrapped;

    ExceptionCatchingInputStream() {
    }

    @Nullable
    public IOException getException() {
        return this.exception;
    }

    public int available() throws IOException {
        return this.wrapped.available();
    }

    public void close() throws IOException {
        this.wrapped.close();
    }

    public boolean markSupported() {
        return this.wrapped.markSupported();
    }

    static void clearQueue() {
        while (!QUEUE.isEmpty()) {
            QUEUE.remove();
        }
    }

    public int read() {
        try {
            return this.wrapped.read();
        } catch (IOException e2) {
            this.exception = e2;
            return -1;
        }
    }

    public synchronized void reset() throws IOException {
        this.wrapped.reset();
    }

    public void release() {
        this.exception = null;
        this.wrapped = null;
        synchronized (QUEUE) {
            QUEUE.offer(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void setInputStream(@NonNull InputStream inputStream) {
        this.wrapped = inputStream;
    }

    public void mark(int i) {
        this.wrapped.mark(i);
    }

    public long skip(long j) {
        try {
            return this.wrapped.skip(j);
        } catch (IOException e2) {
            this.exception = e2;
            return 0;
        }
    }

    @NonNull
    public static ExceptionCatchingInputStream obtain(@NonNull InputStream inputStream) {
        ExceptionCatchingInputStream poll;
        synchronized (QUEUE) {
            poll = QUEUE.poll();
        }
        if (poll == null) {
            poll = new ExceptionCatchingInputStream();
        }
        poll.setInputStream(inputStream);
        return poll;
    }

    public int read(byte[] bArr) {
        try {
            return this.wrapped.read(bArr);
        } catch (IOException e2) {
            this.exception = e2;
            return -1;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.wrapped.read(bArr, i, i2);
        } catch (IOException e2) {
            this.exception = e2;
            return -1;
        }
    }
}
