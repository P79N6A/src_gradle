package org.msgpack.unpacker;

public final class ArrayAccept extends Accept {
    int size;

    ArrayAccept() {
        super("array");
    }

    /* access modifiers changed from: package-private */
    public final void acceptArray(int i) {
        this.size = i;
    }
}
