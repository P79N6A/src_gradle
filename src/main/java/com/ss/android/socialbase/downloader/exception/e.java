package com.ss.android.socialbase.downloader.exception;

public final class e extends f {
    private final long recommendSize;
    private final long requiredSpaceBytes;

    public e(long j, long j2) {
        super(1024, String.format("space is not enough required space is : %s but recommendSize space is :%s", new Object[]{String.valueOf(j2), String.valueOf(j)}));
        this.recommendSize = j;
        this.requiredSpaceBytes = j2;
    }
}
