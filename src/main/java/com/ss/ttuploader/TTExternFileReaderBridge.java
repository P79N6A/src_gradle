package com.ss.ttuploader;

public class TTExternFileReaderBridge {
    /* access modifiers changed from: package-private */
    public void cancel(Object obj) {
        if (obj != null) {
            ((TTExternFileReader) obj).cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public long getValue(Object obj, int i) {
        if (obj == null) {
            return -1;
        }
        return ((TTExternFileReader) obj).getValue(i);
    }

    /* access modifiers changed from: package-private */
    public long getCrc32ByOffset(Object obj, long j, int i) {
        if (obj == null) {
            return 0;
        }
        return ((TTExternFileReader) obj).getCrc32ByOffset(j, i);
    }

    /* access modifiers changed from: package-private */
    public int readSlice(Object obj, int i, byte[] bArr, int i2) {
        if (obj == null || bArr == null || i2 == 0) {
            return 0;
        }
        return ((TTExternFileReader) obj).readSlice(i, bArr, i2);
    }

    /* access modifiers changed from: package-private */
    public int readSliceByOffset(Object obj, long j, byte[] bArr, int i, int i2) {
        if (obj == null || bArr == null || i == 0) {
            return 0;
        }
        return ((TTExternFileReader) obj).readSliceByOffset(j, bArr, i, i2);
    }
}
