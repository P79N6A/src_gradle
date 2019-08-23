package net.jpountz.xxhash;

import java.util.zip.Checksum;

public abstract class StreamingXXHash64 {
    final long seed;

    interface Factory {
        StreamingXXHash64 newStreamingHash(long j);
    }

    public abstract long getValue();

    public abstract void reset();

    public abstract void update(byte[] bArr, int i, int i2);

    public final Checksum asChecksum() {
        return new Checksum() {
            public long getValue() {
                return StreamingXXHash64.this.getValue();
            }

            public void reset() {
                StreamingXXHash64.this.reset();
            }

            public String toString() {
                return StreamingXXHash64.this.toString();
            }

            public void update(int i) {
                StreamingXXHash64.this.update(new byte[]{(byte) i}, 0, 1);
            }

            public void update(byte[] bArr, int i, int i2) {
                StreamingXXHash64.this.update(bArr, i, i2);
            }
        };
    }

    public String toString() {
        return getClass().getSimpleName() + "(seed=" + this.seed + ")";
    }

    StreamingXXHash64(long j) {
        this.seed = j;
    }
}
