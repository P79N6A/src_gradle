package org.msgpack.unpacker;

import org.msgpack.c;

public final class IntAccept extends Accept {
    int value;

    IntAccept() {
        super("integer");
    }

    /* access modifiers changed from: package-private */
    public final void acceptInteger(byte b2) {
        this.value = b2;
    }

    /* access modifiers changed from: package-private */
    public final void acceptInteger(int i) {
        this.value = i;
    }

    /* access modifiers changed from: package-private */
    public final void acceptUnsignedInteger(byte b2) {
        this.value = b2 & 255;
    }

    /* access modifiers changed from: package-private */
    public final void acceptInteger(short s) {
        this.value = s;
    }

    /* access modifiers changed from: package-private */
    public final void acceptUnsignedInteger(int i) {
        if (i >= 0) {
            this.value = i;
            return;
        }
        throw new c();
    }

    /* access modifiers changed from: package-private */
    public final void acceptInteger(long j) {
        if (j < -2147483648L || j > 2147483647L) {
            throw new c();
        }
        this.value = (int) j;
    }

    /* access modifiers changed from: package-private */
    public final void acceptUnsignedInteger(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new c();
        }
        this.value = (int) j;
    }

    /* access modifiers changed from: package-private */
    public final void acceptUnsignedInteger(short s) {
        this.value = s & 65535;
    }
}
