package com.ss.android.socialbase.downloader.exception;

public final class d extends BaseException {
    private final long avaliableSpaceBytes;
    private final long requiredSpaceBytes;

    public final long getAvaliableSpaceBytes() {
        return this.avaliableSpaceBytes;
    }

    public final long getRequiredSpaceBytes() {
        return this.requiredSpaceBytes;
    }

    public d(long j, long j2) {
        super(1006, String.format("space is not enough required space is : %s but available space is :%s", new Object[]{String.valueOf(j2), String.valueOf(j)}));
        this.avaliableSpaceBytes = j;
        this.requiredSpaceBytes = j2;
    }
}
