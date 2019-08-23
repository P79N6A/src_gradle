package com.ss.android.ugc.aweme.feed.ui;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.share.a.a.a;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import java.util.concurrent.Callable;

public final /* synthetic */ class aa implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46383a;

    /* renamed from: b  reason: collision with root package name */
    private final p f46384b;

    /* renamed from: c  reason: collision with root package name */
    private final IShareService.ShareStruct f46385c;

    aa(p pVar, IShareService.ShareStruct shareStruct) {
        this.f46384b = pVar;
        this.f46385c = shareStruct;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f46383a, false, 42713, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46383a, false, 42713, new Class[0], Void.TYPE);
            return;
        }
        p pVar = this.f46384b;
        IShareService.ShareStruct shareStruct = this.f46385c;
        i.a((Callable<TResult>) new s<TResult>(pVar, shareStruct)).a((g<TResult, TContinuationResult>) new t<TResult,TContinuationResult>(pVar, shareStruct), i.f1052b);
    }
}
