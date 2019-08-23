package com.bytedance.frameworks.baselib.network.http.util;

public final class b extends Exception {
    private static final long serialVersionUID = -1098012010869697449L;
    final long length;
    final int maxSize;

    public final long getLength() {
        return this.length;
    }

    public final int getMaxSize() {
        return this.maxSize;
    }

    public b(int i, long j) {
        super("Download file too large: " + i + " " + j);
        this.maxSize = i;
        this.length = j;
    }
}
