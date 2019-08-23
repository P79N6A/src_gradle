package com.bef.effectsdk;

public final class FileResourceFinder implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f7444a;

    private static native long nativeCreateFileResourceFinder(long j, String str);

    public final void release(long j) {
    }

    public final long createNativeResourceFinder(long j) {
        return nativeCreateFileResourceFinder(j, this.f7444a);
    }
}
