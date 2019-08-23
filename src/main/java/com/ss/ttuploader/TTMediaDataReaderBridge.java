package com.ss.ttuploader;

public class TTMediaDataReaderBridge {
    /* access modifiers changed from: package-private */
    public int close(Object obj, int i) {
        if (obj == null || i < 0) {
            return 0;
        }
        return ((TTMediaDataReader) obj).close(i);
    }

    /* access modifiers changed from: package-private */
    public int open(Object obj, int i) {
        if (obj == null) {
            return 0;
        }
        return ((TTMediaDataReader) obj).open(i);
    }

    /* access modifiers changed from: package-private */
    public long getValue(Object obj, int i, int i2) {
        if (obj == null) {
            return -1;
        }
        return ((TTMediaDataReader) obj).getValue(i, i2);
    }

    /* access modifiers changed from: package-private */
    public int read(Object obj, int i, long j, byte[] bArr, int i2) {
        if (obj == null || bArr == null || i2 == 0) {
            return 0;
        }
        return ((TTMediaDataReader) obj).read(i, j, bArr, i2);
    }
}
