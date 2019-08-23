package org.msgpack.unpacker;

import java.math.BigInteger;

public final class BigIntegerAccept extends Accept {
    BigInteger value;

    BigIntegerAccept() {
        super("integer");
    }

    /* access modifiers changed from: package-private */
    public final void acceptInteger(byte b2) {
        this.value = BigInteger.valueOf((long) b2);
    }

    /* access modifiers changed from: package-private */
    public final void acceptUnsignedInteger(byte b2) {
        BigInteger.valueOf((long) (b2 & 255));
    }

    /* access modifiers changed from: package-private */
    public final void acceptInteger(int i) {
        this.value = BigInteger.valueOf((long) i);
    }

    /* access modifiers changed from: package-private */
    public final void acceptUnsignedInteger(short s) {
        BigInteger.valueOf((long) (s & 65535));
    }

    /* access modifiers changed from: package-private */
    public final void acceptInteger(long j) {
        this.value = BigInteger.valueOf(j);
    }

    /* access modifiers changed from: package-private */
    public final void acceptUnsignedInteger(int i) {
        if (i < 0) {
            this.value = BigInteger.valueOf(((long) (i & Integer.MAX_VALUE)) + 2147483648L);
        } else {
            this.value = BigInteger.valueOf((long) i);
        }
    }

    /* access modifiers changed from: package-private */
    public final void acceptInteger(short s) {
        this.value = BigInteger.valueOf((long) s);
    }

    /* access modifiers changed from: package-private */
    public final void acceptUnsignedInteger(long j) {
        if (j < 0) {
            this.value = BigInteger.valueOf(j + Long.MAX_VALUE + 1).setBit(63);
        } else {
            this.value = BigInteger.valueOf(j);
        }
    }
}
