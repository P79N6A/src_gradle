package com.ss.android.ugc.aweme.feed.ui;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public final /* synthetic */ class t implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46930a;

    /* renamed from: b  reason: collision with root package name */
    private final p f46931b;

    /* renamed from: c  reason: collision with root package name */
    private final IShareService.ShareStruct f46932c;

    t(p pVar, IShareService.ShareStruct shareStruct) {
        this.f46931b = pVar;
        this.f46932c = shareStruct;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f46930a, false, 42706, new Class[]{i.class}, Object.class)) {
            return this.f46931b.b(this.f46932c, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f46930a, false, 42706, new Class[]{i.class}, Object.class);
    }
}
