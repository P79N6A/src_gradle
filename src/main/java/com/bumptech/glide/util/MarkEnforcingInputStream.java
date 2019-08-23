package com.bumptech.glide.util;

import android.support.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MarkEnforcingInputStream extends FilterInputStream {
    private int availableBytes = Integer.MIN_VALUE;

    public synchronized void reset() throws IOException {
        super.reset();
        this.availableBytes = Integer.MIN_VALUE;
    }

    public int available() throws IOException {
        if (this.availableBytes == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(this.availableBytes, super.available());
    }

    public int read() throws IOException {
        if (getBytesToRead(1) == -1) {
            return -1;
        }
        int read = super.read();
        updateAvailableBytesAfterRead(1);
        return read;
    }

    public MarkEnforcingInputStream(@NonNull InputStream inputStream) {
        super(inputStream);
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.availableBytes = i;
    }

    private long getBytesToRead(long j) {
        if (this.availableBytes == 0) {
            return -1;
        }
        if (this.availableBytes == Integer.MIN_VALUE || j <= ((long) this.availableBytes)) {
            return j;
        }
        return (long) this.availableBytes;
    }

    private void updateAvailableBytesAfterRead(long j) {
        if (this.availableBytes != Integer.MIN_VALUE && j != -1) {
            this.availableBytes = (int) (((long) this.availableBytes) - j);
        }
    }

    public long skip(long j) throws IOException {
        long bytesToRead = getBytesToRead(j);
        if (bytesToRead == -1) {
            return 0;
        }
        long skip = super.skip(bytesToRead);
        updateAvailableBytesAfterRead(skip);
        return skip;
    }

    public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int bytesToRead = (int) getBytesToRead((long) i2);
        if (bytesToRead == -1) {
            return -1;
        }
        int read = super.read(bArr, i, bytesToRead);
        updateAvailableBytesAfterRead((long) read);
        return read;
    }
}
