package com.ss.android.ugc.aweme.feed.ui;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.qrcode.f.a;

public final /* synthetic */ class x implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46940a;

    /* renamed from: b  reason: collision with root package name */
    private final p f46941b;

    /* renamed from: c  reason: collision with root package name */
    private final a f46942c;

    /* renamed from: d  reason: collision with root package name */
    private final IShareService.ShareStruct f46943d;

    x(p pVar, a aVar, IShareService.ShareStruct shareStruct) {
        this.f46941b = pVar;
        this.f46942c = aVar;
        this.f46943d = shareStruct;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f46940a, false, 42710, new Class[]{i.class}, Object.class)) {
            return this.f46941b.a(this.f46942c, this.f46943d, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f46940a, false, 42710, new Class[]{i.class}, Object.class);
    }
}
