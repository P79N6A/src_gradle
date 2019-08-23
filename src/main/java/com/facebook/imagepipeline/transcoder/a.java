package com.facebook.imagepipeline.transcoder;

public final class a {
    public final int mTranscodeStatus;

    public final String toString() {
        return String.format(null, "Status: %d", new Object[]{Integer.valueOf(this.mTranscodeStatus)});
    }

    public a(int i) {
        this.mTranscodeStatus = i;
    }
}
