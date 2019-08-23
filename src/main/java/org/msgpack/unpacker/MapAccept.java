package org.msgpack.unpacker;

public final class MapAccept extends Accept {
    int size;

    MapAccept() {
        super("map");
    }

    /* access modifiers changed from: package-private */
    public final void acceptMap(int i) {
        this.size = i;
    }
}
