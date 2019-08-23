package com.ss.android.ugc.aweme.app;

import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.memory.MemoryTrimmable;
import com.facebook.common.memory.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import java.util.HashSet;
import java.util.Set;

public class ad implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33736a;

    /* renamed from: d  reason: collision with root package name */
    private static ad f33737d;

    /* renamed from: b  reason: collision with root package name */
    private final Set<MemoryTrimmable> f33738b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private final Object f33739c = new Object();

    public static synchronized ad a() {
        synchronized (ad.class) {
            if (PatchProxy.isSupport(new Object[0], null, f33736a, true, 22521, new Class[0], ad.class)) {
                ad adVar = (ad) PatchProxy.accessDispatch(new Object[0], null, f33736a, true, 22521, new Class[0], ad.class);
                return adVar;
            }
            if (f33737d == null) {
                f33737d = new ad();
            }
            ad adVar2 = f33737d;
            return adVar2;
        }
    }

    public void registerMemoryTrimmable(MemoryTrimmable memoryTrimmable) {
        if (PatchProxy.isSupport(new Object[]{memoryTrimmable}, this, f33736a, false, 22522, new Class[]{MemoryTrimmable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{memoryTrimmable}, this, f33736a, false, 22522, new Class[]{MemoryTrimmable.class}, Void.TYPE);
        } else if (memoryTrimmable != null) {
            synchronized (this.f33739c) {
                a.a("FrescoMemoryTrimmableRegistry : registerMemoryTrimmable");
                this.f33738b.add(memoryTrimmable);
            }
        }
    }

    public final void a(MemoryTrimType memoryTrimType) {
        MemoryTrimType memoryTrimType2 = memoryTrimType;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{memoryTrimType2}, this, f33736a, false, 22524, new Class[]{MemoryTrimType.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{memoryTrimType2}, this, f33736a, false, 22524, new Class[]{MemoryTrimType.class}, Void.TYPE);
            return;
        }
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71914, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71914, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            AbTestModel d2 = a2.d();
            if (d2 != null) {
                z = d2.isClearFrescoMemoryCache;
            }
        }
        if (z) {
            synchronized (this.f33739c) {
                a.a("FrescoMemoryTrimmableRegistry : before onTrimMemory");
                for (MemoryTrimmable trim : this.f33738b) {
                    trim.trim(memoryTrimType2);
                }
                a.a("FrescoMemoryTrimmableRegistry : after onTrimMemory");
            }
        }
    }
}
