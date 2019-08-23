package com.ss.android.ugc.aweme.services.publish;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.services.publish.IPublishService;

public final /* synthetic */ class PublishServiceImpl$$Lambda$1 implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final c arg$1;
    private final IPublishService.OnGetRecoverDraftCallback arg$2;

    PublishServiceImpl$$Lambda$1(c cVar, IPublishService.OnGetRecoverDraftCallback onGetRecoverDraftCallback) {
        this.arg$1 = cVar;
        this.arg$2 = onGetRecoverDraftCallback;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71560, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71560, new Class[0], Void.TYPE);
            return;
        }
        PublishServiceImpl.lambda$null$0$PublishServiceImpl(this.arg$1, this.arg$2);
    }
}
