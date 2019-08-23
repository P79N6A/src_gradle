package com.huawei.android.pushagent.b.f;

import android.content.Context;
import android.content.Intent;
import com.huawei.android.pushagent.b.a;
import com.huawei.android.pushagent.utils.a.e;

public class b extends a {
    public b(Context context) {
    }

    public void a(Context context, Intent intent) {
        String action = intent.getAction();
        if ("com.huawei.android.push.intent.HEARTBEAT_RANGE_CHANGE".equals(action) || "com.huawei.android.push.intent.HEARTBEAT_VALID_ARRIVED".equals(action)) {
            e.a("PushLogAC2815", "when receive the heart beat range change or valid arrived,the file  HeartBeatCfg.xml need del");
            for (String e2 : com.huawei.android.pushagent.b.a.a.a(context).a()) {
                com.huawei.android.pushagent.utils.a.e(context, e2);
            }
        }
    }
}
