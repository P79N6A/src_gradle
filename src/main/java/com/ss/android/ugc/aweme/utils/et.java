package com.ss.android.ugc.aweme.utils;

import com.facebook.common.memory.MemoryTrimType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.ad;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.framework.a.a;

public final class et {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75847a;

    public static void a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f75847a, true, 88637, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f75847a, true, 88637, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        b(i);
        if (5 == i2) {
            a.a("trimMemory : Activity.TRIM_MEMORY_RUNNING_MODERATE");
            ad.a().a(MemoryTrimType.OnSystemLowMemoryWhileAppInForeground);
            try {
                com.ss.android.ugc.aweme.framework.fresco.a.b().a();
            } catch (Exception unused) {
            }
            System.gc();
        } else if (10 == i2) {
            a.a("trimMemory : Activity.TRIM_MEMORY_RUNNING_LOW");
            ad.a().a(MemoryTrimType.OnCloseToDalvikHeapLimit);
            try {
                com.ss.android.ugc.aweme.framework.fresco.a.b().a();
            } catch (Exception unused2) {
            }
            System.gc();
        } else if (40 == i2) {
            a.a("trimMemory : Activity.TRIM_MEMORY_BACKGROUND");
            ad.a().a(MemoryTrimType.OnSystemLowMemoryWhileAppInBackground);
        } else {
            a.a("trimMemory level:" + i2);
        }
    }

    private static void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f75847a, true, 88638, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f75847a, true, 88638, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            int a2 = (int) ((com.ss.android.ugc.aweme.app.fabric.a.a(k.a()) / 1024) / 1024);
            a.a(com.ss.android.ugc.aweme.framework.core.a.b().a().getClass().getName() + "   freeMem :" + a2);
            n.a("TYPE_TRIM_MEMORY", bh.a().a("memoryLevel", Integer.valueOf(i)).a("page", com.ss.android.ugc.aweme.framework.core.a.b().a().getClass().getName()).a("freeMemory", Integer.valueOf(a2)).b());
        } catch (Exception unused) {
        }
    }
}
