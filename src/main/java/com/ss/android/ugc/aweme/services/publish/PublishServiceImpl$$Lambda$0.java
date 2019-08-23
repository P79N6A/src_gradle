package com.ss.android.ugc.aweme.services.publish;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.publish.IPublishService;

public final /* synthetic */ class PublishServiceImpl$$Lambda$0 implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String arg$1;
    private final IPublishService.OnGetRecoverDraftCallback arg$2;

    PublishServiceImpl$$Lambda$0(String str, IPublishService.OnGetRecoverDraftCallback onGetRecoverDraftCallback) {
        this.arg$1 = str;
        this.arg$2 = onGetRecoverDraftCallback;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71559, new Class[0], Void.TYPE);
            return;
        }
        a.b(new PublishServiceImpl$$Lambda$1(((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().queryDraft(this.arg$1), this.arg$2));
    }
}
