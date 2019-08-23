package com.bytedance.crash.i;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Debug;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final a f19473a;

    static class a {
        public int a(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int b(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int c(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    @TargetApi(19)
    /* renamed from: com.bytedance.crash.i.b$b  reason: collision with other inner class name */
    static class C0152b extends a {
        private C0152b() {
            super((byte) 0);
        }

        /* synthetic */ C0152b(byte b2) {
            this();
        }

        public final int a(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        public final int b(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        public final int c(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f19473a = new C0152b((byte) 0);
        } else {
            f19473a = new a((byte) 0);
        }
    }

    public static int a(Debug.MemoryInfo memoryInfo) {
        return f19473a.a(memoryInfo);
    }

    public static int b(Debug.MemoryInfo memoryInfo) {
        return f19473a.b(memoryInfo);
    }

    public static int c(Debug.MemoryInfo memoryInfo) {
        return f19473a.c(memoryInfo);
    }
}
