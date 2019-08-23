package com.huawei.android.pushagent;

import android.content.Context;
import android.content.Intent;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.tools.a;

public class PushProxyReceiver extends PushEventReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static String f24923a = "PushLogAC2815";

    public void onReceive(Context context, Intent intent) {
        if (a.a(context)) {
            super.onReceive(context, intent);
        } else {
            e.a(f24923a, "app push is closed, need not to process intent");
        }
    }
}
