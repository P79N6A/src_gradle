package com.facebook.common.memory;

public class NoOpMemoryTrimmableRegistry implements b {
    private static NoOpMemoryTrimmableRegistry sInstance;

    public void registerMemoryTrimmable(MemoryTrimmable memoryTrimmable) {
    }

    public void unregisterMemoryTrimmable(MemoryTrimmable memoryTrimmable) {
    }

    public static synchronized NoOpMemoryTrimmableRegistry getInstance() {
        NoOpMemoryTrimmableRegistry noOpMemoryTrimmableRegistry;
        synchronized (NoOpMemoryTrimmableRegistry.class) {
            if (sInstance == null) {
                sInstance = new NoOpMemoryTrimmableRegistry();
            }
            noOpMemoryTrimmableRegistry = sInstance;
        }
        return noOpMemoryTrimmableRegistry;
    }
}
