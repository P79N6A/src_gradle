package com.ss.android.common.applog;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Debug;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28167a;

    /* renamed from: b  reason: collision with root package name */
    static final a f28168b;

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
    static class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f28169a;

        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final int a(Debug.MemoryInfo memoryInfo) {
            if (!PatchProxy.isSupport(new Object[]{memoryInfo}, this, f28169a, false, 15528, new Class[]{Debug.MemoryInfo.class}, Integer.TYPE)) {
                return memoryInfo.getTotalPrivateClean();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{memoryInfo}, this, f28169a, false, 15528, new Class[]{Debug.MemoryInfo.class}, Integer.TYPE)).intValue();
        }

        public final int b(Debug.MemoryInfo memoryInfo) {
            if (!PatchProxy.isSupport(new Object[]{memoryInfo}, this, f28169a, false, 15529, new Class[]{Debug.MemoryInfo.class}, Integer.TYPE)) {
                return memoryInfo.getTotalSharedClean();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{memoryInfo}, this, f28169a, false, 15529, new Class[]{Debug.MemoryInfo.class}, Integer.TYPE)).intValue();
        }

        public final int c(Debug.MemoryInfo memoryInfo) {
            if (!PatchProxy.isSupport(new Object[]{memoryInfo}, this, f28169a, false, 15530, new Class[]{Debug.MemoryInfo.class}, Integer.TYPE)) {
                return memoryInfo.getTotalSwappablePss();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{memoryInfo}, this, f28169a, false, 15530, new Class[]{Debug.MemoryInfo.class}, Integer.TYPE)).intValue();
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f28168b = new b((byte) 0);
        } else {
            f28168b = new a((byte) 0);
        }
    }

    public static int a(Debug.MemoryInfo memoryInfo) {
        Debug.MemoryInfo memoryInfo2 = memoryInfo;
        if (!PatchProxy.isSupport(new Object[]{memoryInfo2}, null, f28167a, true, 15525, new Class[]{Debug.MemoryInfo.class}, Integer.TYPE)) {
            return f28168b.a(memoryInfo2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{memoryInfo2}, null, f28167a, true, 15525, new Class[]{Debug.MemoryInfo.class}, Integer.TYPE)).intValue();
    }

    public static int b(Debug.MemoryInfo memoryInfo) {
        Debug.MemoryInfo memoryInfo2 = memoryInfo;
        if (!PatchProxy.isSupport(new Object[]{memoryInfo2}, null, f28167a, true, 15526, new Class[]{Debug.MemoryInfo.class}, Integer.TYPE)) {
            return f28168b.b(memoryInfo2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{memoryInfo2}, null, f28167a, true, 15526, new Class[]{Debug.MemoryInfo.class}, Integer.TYPE)).intValue();
    }

    public static int c(Debug.MemoryInfo memoryInfo) {
        Debug.MemoryInfo memoryInfo2 = memoryInfo;
        if (!PatchProxy.isSupport(new Object[]{memoryInfo2}, null, f28167a, true, 15527, new Class[]{Debug.MemoryInfo.class}, Integer.TYPE)) {
            return f28168b.c(memoryInfo2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{memoryInfo2}, null, f28167a, true, 15527, new Class[]{Debug.MemoryInfo.class}, Integer.TYPE)).intValue();
    }
}
