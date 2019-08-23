package com.ss.android.common.util;

import com.meituan.robust.ChangeQuickRedirect;

public final class a extends Exception {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1098012010869697449L;
    final long length;
    final int maxSize;

    public final long getLength() {
        return this.length;
    }

    public final int getMaxSize() {
        return this.maxSize;
    }

    public a(int i, long j) {
        super("Download file too large: " + i + " " + j);
        this.maxSize = i;
        this.length = j;
    }
}
