package com.ss.android.ugc.aweme.feed.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.ap;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import java.util.concurrent.Callable;

public final /* synthetic */ class w implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46937a;

    /* renamed from: b  reason: collision with root package name */
    private final p f46938b;

    /* renamed from: c  reason: collision with root package name */
    private final IShareService.ShareStruct f46939c;

    w(p pVar, IShareService.ShareStruct shareStruct) {
        this.f46938b = pVar;
        this.f46939c = shareStruct;
    }

    public final Object call() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f46937a, false, 42709, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f46937a, false, 42709, new Class[0], Object.class);
        }
        p pVar = this.f46938b;
        IShareService.ShareStruct shareStruct = this.f46939c;
        ShareInfo shareInfo = pVar.f46811c.getShareInfo();
        if (shareStruct != null && shareStruct.boolPersist) {
            z = true;
        }
        return ap.a(shareInfo, "copy_link", z);
    }
}
