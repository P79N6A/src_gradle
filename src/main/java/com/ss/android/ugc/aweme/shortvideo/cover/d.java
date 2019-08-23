package com.ss.android.ugc.aweme.shortvideo.cover;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photomovie.edit.cover.b;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.p;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66112a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoCoverGeneratorImpl f66113b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f66114c;

    /* renamed from: d  reason: collision with root package name */
    private final int f66115d;

    /* renamed from: e  reason: collision with root package name */
    private final int f66116e;

    /* renamed from: f  reason: collision with root package name */
    private final b.a f66117f;
    private final AtomicInteger g;

    d(VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl, int[] iArr, int i, int i2, b.a aVar, AtomicInteger atomicInteger) {
        this.f66113b = vEVideoCoverGeneratorImpl;
        this.f66114c = iArr;
        this.f66115d = i;
        this.f66116e = i2;
        this.f66117f = aVar;
        this.g = atomicInteger;
    }

    public final Object call() {
        p.a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f66112a, false, 75385, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f66112a, false, 75385, new Class[0], Object.class);
        }
        VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.f66113b;
        int[] iArr = this.f66114c;
        int i = this.f66115d;
        int i2 = this.f66116e;
        b.a aVar2 = this.f66117f;
        AtomicInteger atomicInteger = this.g;
        p pVar = vEVideoCoverGeneratorImpl.f3911c;
        if (PatchProxy.isSupport(new Object[0], vEVideoCoverGeneratorImpl, VEVideoCoverGeneratorImpl.f3909a, false, 75381, new Class[0], p.a.class)) {
            aVar = (p.a) PatchProxy.accessDispatch(new Object[0], vEVideoCoverGeneratorImpl, VEVideoCoverGeneratorImpl.f3909a, false, 75381, new Class[0], p.a.class);
        } else {
            aVar = ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().isEnableGetThumbsWithEffect() ? p.a.GET_FRAMES_MODE_NORMAL : p.a.GET_FRAMES_MODE_NOEFFECT;
        }
        pVar.a(iArr, i, i2, aVar, (VEListener.l) new e(vEVideoCoverGeneratorImpl, aVar2, atomicInteger));
        return null;
    }
}
