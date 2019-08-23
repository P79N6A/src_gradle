package org.msgpack.unpacker;

import org.msgpack.c;

public final class LongAccept extends Accept {
    long value;

    LongAccept() {
        super("integer");
    }

    /* access modifiers changed from: package-private */
    public final void acceptInteger(byte b2) {
        this.value = (long) b2;
    }

    /* access modifiers changed from: package-private */
    public final void acceptInteger(int i) {
        this.value = (long) i;
    }

    /* access modifiers changed from: package-private */
    public final void acceptUnsignedInteger(byte b2) {
        this.value = (long) (b2 & 255);
    }

    /* access modifiers changed from: package-private */
    public final void acceptInteger(long j) {
        this.value = j;
    }

    /* access modifiers changed from: package-private */
    public final void acceptUnsignedInteger(long j) {
        if (j >= 0) {
            this.value = j;
            return;
        }
        throw new c();
    }

    /* access modifiers changed from: package-private */
    public final void acceptInteger(short s) {
        this.value = (long) s;
    }

    /* access modifiers changed from: package-private */
    public final void acceptUnsignedInteger(int i) {
        if (i < 0) {
            this.value = ((long) (i & Integer.MAX_VALUE)) + 2147483648L;
        } else {
            this.value = (long) i;
        }
    }

    /* access modifiers changed from: package-private */
    public final void acceptUnsignedInteger(short s) {
        this.value = (long) (s & 65535);
    }
}
