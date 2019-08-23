package com.ss.android.ugc.aweme.feed.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.ap;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import java.util.concurrent.Callable;

public final /* synthetic */ class s implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46832a;

    /* renamed from: b  reason: collision with root package name */
    private final p f46833b;

    /* renamed from: c  reason: collision with root package name */
    private final IShareService.ShareStruct f46834c;

    s(p pVar, IShareService.ShareStruct shareStruct) {
        this.f46833b = pVar;
        this.f46834c = shareStruct;
    }

    public final Object call() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f46832a, false, 42705, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f46832a, false, 42705, new Class[0], Object.class);
        }
        p pVar = this.f46833b;
        IShareService.ShareStruct shareStruct = this.f46834c;
        ShareInfo shareInfo = pVar.f46811c.getShareInfo();
        if (shareStruct != null && shareStruct.boolPersist) {
            z = true;
        }
        return ap.a(shareInfo, "copy_link", z);
    }
}
