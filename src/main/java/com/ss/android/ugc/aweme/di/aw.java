package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.im.service.IIMService;
import dagger.internal.c;
import dagger.internal.e;
import javax.inject.a;

public final class aw implements c<IIMService> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41421a;

    /* renamed from: b  reason: collision with root package name */
    private final a<k> f41422b;

    public final /* synthetic */ Object get() {
        if (PatchProxy.isSupport(new Object[0], this, f41421a, false, 35401, new Class[0], IIMService.class)) {
            return (IIMService) PatchProxy.accessDispatch(new Object[0], this, f41421a, false, 35401, new Class[0], IIMService.class);
        }
        a<k> aVar = this.f41422b;
        if (PatchProxy.isSupport(new Object[]{aVar}, null, f41421a, true, 35402, new Class[]{a.class}, IIMService.class)) {
            return (IIMService) PatchProxy.accessDispatch(new Object[]{aVar}, null, f41421a, true, 35402, new Class[]{a.class}, IIMService.class);
        }
        k kVar = (k) aVar.get();
        if (!PatchProxy.isSupport(new Object[]{kVar}, null, f41421a, true, 35404, new Class[]{k.class}, IIMService.class)) {
            return (IIMService) e.a(av.a(kVar), "Cannot return null from a non-@Nullable @Provides method");
        }
        return (IIMService) PatchProxy.accessDispatch(new Object[]{kVar}, null, f41421a, true, 35404, new Class[]{k.class}, IIMService.class);
    }

    public aw(a<k> aVar) {
        this.f41422b = aVar;
    }
}
