package com.ss.android.ugc.aweme.feed.ui;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public final /* synthetic */ class ac implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46389a;

    /* renamed from: b  reason: collision with root package name */
    private final p f46390b;

    /* renamed from: c  reason: collision with root package name */
    private final IShareService.ShareStruct f46391c;

    ac(p pVar, IShareService.ShareStruct shareStruct) {
        this.f46390b = pVar;
        this.f46391c = shareStruct;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f46389a, false, 42715, new Class[]{i.class}, Object.class)) {
            return this.f46390b.a(this.f46391c, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f46389a, false, 42715, new Class[]{i.class}, Object.class);
    }
}
