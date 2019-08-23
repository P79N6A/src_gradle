package com.meizu.cloud.pushsdk.handler.a.d;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.a.a;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.util.b;

public class d extends a<SubAliasStatus> {
    public d(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    private void c(String str) {
        b.g(c(), c().getPackageName(), str);
    }

    public int a() {
        return 4096;
    }

    /* access modifiers changed from: protected */
    public void a(SubAliasStatus subAliasStatus, c cVar) {
        if (b() != null && subAliasStatus != null) {
            b().a(c(), subAliasStatus);
        }
    }

    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start SubScribeAliasStatusHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_SUBALIAS_STATUS.equals(i(intent));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public SubAliasStatus c(Intent intent) {
        SubAliasStatus subAliasStatus = (SubAliasStatus) intent.getSerializableExtra(PushConstants.EXTRA_APP_PUSH_SUBALIAS_STATUS);
        if (BasicPushStatus.SUCCESS_CODE.equals(subAliasStatus.getCode())) {
            c(subAliasStatus.getAlias());
        }
        return subAliasStatus;
    }
}
