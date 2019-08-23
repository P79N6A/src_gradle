package org.msgpack.unpacker;

public final class DoubleAccept extends Accept {
    double value;

    DoubleAccept() {
        super("float");
    }

    /* access modifiers changed from: package-private */
    public final void acceptDouble(double d2) {
        this.value = d2;
    }

    /* access modifiers changed from: package-private */
    public final void acceptFloat(float f2) {
        this.value = (double) f2;
    }
}
