package com.ss.android.ugc.aweme.services;

import a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.g.b;
import com.ss.android.ugc.aweme.account.g.c;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/services/InterceptorService$startTwoStepAuthentication$1", "Lcom/ss/android/ugc/aweme/account/interfaces/TwoStepAuthCallback;", "onComplete", "", "response", "Lcom/ss/android/ugc/aweme/account/interfaces/TwoStepAuthResponse;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class InterceptorService$startTwoStepAuthentication$1 implements b {
    public static ChangeQuickRedirect changeQuickRedirect;
    final /* synthetic */ j $tcs;

    InterceptorService$startTwoStepAuthentication$1(j jVar) {
        this.$tcs = jVar;
    }

    public final void onComplete(@Nullable c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, changeQuickRedirect, false, 71393, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, changeQuickRedirect, false, 71393, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.$tcs.b(cVar2);
    }
}
