package com.bytedance.crash.i;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.os.Build;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    static final a f19476a;

    static class a {
        public long a(ActivityManager.MemoryInfo memoryInfo) {
            return 0;
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    @TargetApi(16)
    static class b extends a {
        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final long a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f19476a = new b((byte) 0);
        } else {
            f19476a = new a((byte) 0);
        }
    }

    public static long a(ActivityManager.MemoryInfo memoryInfo) {
        return f19476a.a(memoryInfo);
    }
}
