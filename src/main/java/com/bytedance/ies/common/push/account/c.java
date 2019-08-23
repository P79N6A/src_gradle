package com.bytedance.ies.common.push.account;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import com.bytedance.ies.common.push.a.a;

public final class c extends AbstractThreadedSyncAdapter {
    public c(Context context, boolean z) {
        super(context, true);
    }

    public final void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        if (getContext() != null) {
            a aVar = a.f20216a;
            Context context = getContext();
            if (aVar.f20217b != null) {
                aVar.f20217b.a(context);
            }
        }
    }
}
