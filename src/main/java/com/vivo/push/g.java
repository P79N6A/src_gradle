package com.vivo.push;

import com.google.a.a.a.a.a.a;
import com.vivo.push.model.SubscribeAppInfo;
import java.util.ArrayList;

public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LocalAliasTagsManager f81593a;

    public final void run() {
        boolean z;
        SubscribeAppInfo retrySubscribeAppInfo = this.f81593a.mSubscribeAppAliasManager.getRetrySubscribeAppInfo();
        if (retrySubscribeAppInfo != null) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e2) {
                a.b(e2);
            }
            if (retrySubscribeAppInfo.getTargetStatus() == 1) {
                p.a().a("push_cache_sp", retrySubscribeAppInfo.getName());
            } else if (retrySubscribeAppInfo.getTargetStatus() == 2) {
                p.a().b("push_cache_sp", retrySubscribeAppInfo.getName());
            }
            z = true;
        } else {
            z = false;
        }
        ArrayList<String> retrySubscribeAppInfo2 = this.f81593a.mSubscribeAppTagManager.getRetrySubscribeAppInfo();
        if (retrySubscribeAppInfo2 != null && retrySubscribeAppInfo2.size() > 0) {
            if (!z) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e3) {
                    a.b(e3);
                }
                z = true;
            }
            p.a().a("push_cache_sp", retrySubscribeAppInfo2);
        }
        ArrayList<String> retryUnsubscribeAppInfo = this.f81593a.mSubscribeAppTagManager.getRetryUnsubscribeAppInfo();
        if (retryUnsubscribeAppInfo != null && retryUnsubscribeAppInfo.size() > 0) {
            if (!z) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e4) {
                    a.b(e4);
                }
            }
            p.a().b("push_cache_sp", retryUnsubscribeAppInfo);
        }
    }

    g(LocalAliasTagsManager localAliasTagsManager) {
        this.f81593a = localAliasTagsManager;
    }
}
