package net.jpountz.xxhash;

import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.StreamingXXHash64;

public final class StreamingXXHash64JavaSafe extends AbstractStreamingXXHash64Java {

    static class Factory implements StreamingXXHash64.Factory {
        public static final StreamingXXHash64.Factory INSTANCE = new Factory();

        Factory() {
        }

        public StreamingXXHash64 newStreamingHash(long j) {
            return new StreamingXXHash64JavaSafe(j);
        }
    }

    public final long getValue() {
        long j;
        if (this.totalLen >= 32) {
            long j2 = this.v1;
            long j3 = this.v2;
            long j4 = this.v3;
            j = ((((((((((((Long.rotateLeft(j2 * -4417276706812531889L, 31) * -7046029288634856825L) ^ (((Long.rotateLeft(j2, 1) + Long.rotateLeft(j3, 7)) + Long.rotateLeft(j4, 12)) + Long.rotateLeft(r3, 18))) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j3 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j4 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(this.v4 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L;
        } else {
            j = this.seed + 2870177450012600261L;
        }
        long j5 = j + this.totalLen;
        int i = 0;
        while (i <= this.memSize - 8) {
            j5 = (Long.rotateLeft(j5 ^ (Long.rotateLeft(SafeUtils.readLongLE(this.memory, i) * -4417276706812531889L, 31) * -7046029288634856825L), 27) * -7046029288634856825L) - 8796714831421723037L;
            i += 8;
        }
        if (i <= this.memSize - 4) {
            j5 = (Long.rotateLeft(j5 ^ ((((long) SafeUtils.readIntLE(this.memory, i)) & 4294967295L) * -7046029288634856825L), 23) * -4417276706812531889L) + 1609587929392839161L;
            i += 4;
        }
        while (i < this.memSize) {
            j5 = Long.rotateLeft(j5 ^ (((long) (this.memory[i] & 255)) * 2870177450012600261L), 11) * -7046029288634856825L;
            i++;
        }
        long j6 = (j5 ^ (j5 >>> 33)) * -4417276706812531889L;
        long j7 = (j6 ^ (j6 >>> 29)) * 1609587929392839161L;
        return j7 ^ (j7 >>> 32);
    }

    StreamingXXHash64JavaSafe(long j) {
        super(j);
    }

    public final void update(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        int i3 = i;
        int i4 = i2;
        SafeUtils.checkRange(bArr, i, i2);
        this.totalLen += (long) i4;
        if (this.memSize + i4 < 32) {
            System.arraycopy(bArr2, i3, this.memory, this.memSize, i4);
            this.memSize += i4;
            return;
        }
        int i5 = i4 + i3;
        if (this.memSize > 0) {
            System.arraycopy(bArr2, i3, this.memory, this.memSize, 32 - this.memSize);
            this.v1 += SafeUtils.readLongLE(this.memory, 0) * -4417276706812531889L;
            this.v1 = Long.rotateLeft(this.v1, 31);
            this.v1 *= -7046029288634856825L;
            this.v2 += SafeUtils.readLongLE(this.memory, 8) * -4417276706812531889L;
            this.v2 = Long.rotateLeft(this.v2, 31);
            this.v2 *= -7046029288634856825L;
            this.v3 += SafeUtils.readLongLE(this.memory, 16) * -4417276706812531889L;
            this.v3 = Long.rotateLeft(this.v3, 31);
            this.v3 *= -7046029288634856825L;
            this.v4 += SafeUtils.readLongLE(this.memory, 24) * -4417276706812531889L;
            this.v4 = Long.rotateLeft(this.v4, 31);
            this.v4 *= -7046029288634856825L;
            i3 += 32 - this.memSize;
            this.memSize = 0;
        }
        int i6 = i5 - 32;
        long j = this.v1;
        long j2 = this.v2;
        long j3 = this.v3;
        long j4 = this.v4;
        while (i3 <= i6) {
            j = Long.rotateLeft(j + (SafeUtils.readLongLE(bArr2, i3) * -4417276706812531889L), 31) * -7046029288634856825L;
            int i7 = i3 + 8;
            j2 = Long.rotateLeft(j2 + (SafeUtils.readLongLE(bArr2, i7) * -4417276706812531889L), 31) * -7046029288634856825L;
            int i8 = i7 + 8;
            j3 = Long.rotateLeft(j3 + (SafeUtils.readLongLE(bArr2, i8) * -4417276706812531889L), 31) * -7046029288634856825L;
            int i9 = i8 + 8;
            j4 = Long.rotateLeft(j4 + (SafeUtils.readLongLE(bArr2, i9) * -4417276706812531889L), 31) * -7046029288634856825L;
            i3 = i9 + 8;
        }
        this.v1 = j;
        this.v2 = j2;
        this.v3 = j3;
        this.v4 = j4;
        if (i3 < i5) {
            int i10 = i5 - i3;
            System.arraycopy(bArr2, i3, this.memory, 0, i10);
            this.memSize = i10;
        }
    }
}
