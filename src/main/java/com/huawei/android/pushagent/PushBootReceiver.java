package com.huawei.android.pushagent;

import android.content.Context;
import android.content.Intent;
import com.huawei.android.pushagent.utils.a;
import com.huawei.android.pushagent.utils.a.e;

public class PushBootReceiver extends PushEventReceiver {
    public void onReceive(Context context, Intent intent) {
        int q = a.q(context);
        e.a("PushLogAC2815", "voteState:" + q);
        if (2 != q || !a.s(context)) {
            super.onReceive(context, intent);
        } else {
            a.a(context, false);
        }
    }
}
